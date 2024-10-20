package com.facebook.systrace;

import X.0WL;
import X.0XO;
import X.0Y2;
import X.0Y5;
import X.0YE;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C0gc;
import X.C0gh;
import android.util.Log;
import com.facebook.common.util.TriState;
import java.io.FileOutputStream;

/* loaded from: TraceDirect.class */
public class TraceDirect {
    public static volatile int sPrevSoLoaderSourcesVersion = 255;
    public static final boolean sForceJavaImpl = "true".equals(0WL.A02("debug.fbsystrace.force_java"));
    public static final boolean sTraceLoad = "true".equals(0WL.A02("debug.fbsystrace.trace_load"));
    public static volatile TriState sNativeAvailable = TriState.UNSET;

    public static void asyncTraceBegin(String str, int i, long j) {
        if (checkNative()) {
            nativeAsyncTraceBegin(str, i, j);
            return;
        }
        FileOutputStream fileOutputStream = 0Y2.A00;
        0Y5 A00 = 0Y5.A00(str, 'S');
        A00.A02("<0>");
        AnonymousClass002.A0S(A00, (j > 0L ? 1 : (j == 0L ? 0 : -1)), j);
        A00.A01(i);
        AnonymousClass001.A16(A00);
    }

    public static boolean checkNative() {
        int i;
        C0gc c0gc;
        boolean z = true;
        if (sNativeAvailable == TriState.UNSET) {
            if (sForceJavaImpl) {
                Log.i("TraceDirect", "Forcing java implementation.");
                sNativeAvailable = TriState.NO;
            } else {
                if (C0gh.A01()) {
                    synchronized (C0gh.class) {
                        c0gc = C0gh.A00;
                        if (c0gc == null) {
                            throw AnonymousClass001.A0N("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
                        }
                    }
                    i = c0gc.BBV();
                } else {
                    i = -1;
                }
                if (i != sPrevSoLoaderSourcesVersion) {
                    sPrevSoLoaderSourcesVersion = i;
                    Log.d("TraceDirect", String.format("Attempting to load fbsystrace.so [%d|%d].", AnonymousClass001.A1b(Integer.valueOf(sPrevSoLoaderSourcesVersion), i)), sTraceLoad ? new Exception() : null);
                    try {
                        C0gh.A03("fbsystrace");
                        0XO r0 = 0YE.A02;
                        nativeSetEnabledTags(0WL.A00("debug.fbsystrace.tags", 0L));
                        nativeBeginSection("fbsystrace.so loaded");
                        nativeEndSection();
                        sNativeAvailable = TriState.YES;
                        Log.i("TraceDirect", "fbsystrace.so loaded.");
                    } catch (UnsatisfiedLinkError unused) {
                        Log.w("TraceDirect", "fbsystrace.so could not be loaded - switching to Java implementation.");
                    }
                }
            }
        }
        if (sNativeAvailable != TriState.YES) {
            z = false;
        }
        return z;
    }

    public static native void nativeAsyncTraceBegin(String str, int i, long j);

    public static native void nativeAsyncTraceCancel(String str, int i);

    public static native void nativeAsyncTraceEnd(String str, int i, long j);

    public static native void nativeAsyncTraceRename(String str, String str2, int i);

    public static native void nativeAsyncTraceStageBegin(String str, int i, long j, String str2);

    public static native void nativeBeginSection(String str);

    public static native void nativeBeginSectionWithArgs(String str, String[] strArr, int i);

    public static native void nativeEndAsyncFlow(String str, int i);

    public static native void nativeEndSection();

    public static native void nativeEndSectionWithArgs(String[] strArr, int i);

    public static native void nativeSetEnabledTags(long j);

    public static native void nativeStartAsyncFlow(String str, int i);

    public static native void nativeStepAsyncFlow(String str, int i);

    public static native void nativeTraceCounter(String str, int i);

    public static native void nativeTraceInstant(String str, String str2, char c);

    public static native void nativeTraceMetadata(String str, String str2, int i);
}
