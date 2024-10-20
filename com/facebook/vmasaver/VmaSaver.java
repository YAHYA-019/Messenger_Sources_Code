package com.facebook.vmasaver;

import X.0fH;
import X.C0ft;
import X.C0il;
import android.os.Build;
import android.os.Process;
import com.facebook.acra.util.StatFsUtil;
import com.facebook.endtoend.EndToEnd;

/* loaded from: VmaSaver.class */
public class VmaSaver {
    public static long sArtRegionSizeInMB;
    public static volatile boolean sArtRegionSizerInited;
    public static volatile boolean sGcSemiSpaceFreed;
    public static volatile boolean sWebviewReservedFreed;

    static {
        C0il.A0B("vmasaver");
    }

    public static void freeCompactingGcSemiSpace(long j) {
        if (sGcSemiSpaceFreed) {
            return;
        }
        synchronized (VmaSaver.class) {
            if (!sGcSemiSpaceFreed) {
                long maxMemory = Runtime.getRuntime().maxMemory() / StatFsUtil.IN_MEGA_BYTE;
                0fH.A0e(Long.valueOf(maxMemory), 512L, "VmaSaver", "VM max heap size: %d, heap limit: %d");
                if (maxMemory >= 512) {
                    sGcSemiSpaceFreed = true;
                }
            }
        }
    }

    public static void freeWebviewReservedMemory() {
        if (sWebviewReservedFreed) {
            return;
        }
        synchronized (VmaSaver.class) {
            if (!sWebviewReservedFreed) {
                sWebviewReservedFreed = true;
                if (nativeFreeWebviewReservedAddr(Build.VERSION.SDK_INT) == 1) {
                    C0ft.A07("vma_webview_reserved_freed");
                }
            }
        }
    }

    public static native int nativeFreeGcSemiSpaceHeap(int i, long j);

    public static native int nativeFreeWebviewReservedAddr(int i);

    public static native long nativeGetArtRegionSpaceSize(int i);

    public static native int nativeInitArtRegionSpace(int i);

    public static native boolean nativeJemallocPurgeHeap(int i);

    public static native boolean nativeJemallocSetRetain(int i, boolean z);

    public static native int nativeLimitJemallocRetainSpace(int i, int i2);

    public static native int nativeShrinkArtRegionSpace(int i, long j);

    public static void shrinkArtRegionSpace(int i, int i2) {
        if (EndToEnd.A04() || EndToEnd.isRunningEndToEndTest()) {
            return;
        }
        synchronized (VmaSaver.class) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 <= 30 && !Process.is64Bit()) {
                if (!sArtRegionSizerInited) {
                    nativeInitArtRegionSpace(i3);
                    sArtRegionSizerInited = true;
                }
                if (sArtRegionSizerInited) {
                    long nativeGetArtRegionSpaceSize = nativeGetArtRegionSpaceSize(i3) / StatFsUtil.IN_MEGA_BYTE;
                    sArtRegionSizeInMB = nativeGetArtRegionSpaceSize;
                    long j = nativeGetArtRegionSpaceSize - i;
                    if (j > 0 && j >= 512) {
                        nativeShrinkArtRegionSpace(i3, j);
                    }
                }
            }
        }
    }
}
