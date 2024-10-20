package com.facebook.common.errorreporting.memory.nativememdump;

import X.0S2;
import X.1BJ;
import X.1BK;
import X.4DD;
import X.4DE;
import X.AnonymousClass001;
import X.C03h;
import X.C0ft;
import X.C4Cy;
import X.C4D4;
import X.C4D5;
import android.os.Build;
import android.os.Debug;
import android.os.SystemClock;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.io.File;
import java.nio.ByteBuffer;

/* loaded from: NativeHeapDumper.class */
public class NativeHeapDumper implements C4D4 {
    public static final boolean sIsArt;
    public final String mAslSessionId;
    public 4DD mDumpSupporter;
    public boolean mInitialized;
    public final File mLogDir;
    public String mNextHprofFilename;
    public String mNextHprofId;
    public final LightweightQuickPerformanceLogger mQpl;
    public boolean mInitAttempted = false;
    public final ByteBuffer mDetailsBuffer = ByteBuffer.allocateDirect(512);
    public final ByteBuffer mSpaceStatsFilenameBuffer = ByteBuffer.allocateDirect(256);
    public final ByteBuffer mMapsFilenameBuffer = ByteBuffer.allocateDirect(256);

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        if (r0.startsWith("0.") != false) goto L8;
     */
    static {
        /*
            java.lang.String r0 = "native_memdump"
            boolean r0 = X.C0il.A0B(r0)
            java.lang.String r0 = "java.vm.version"
            r301 = r0
            r0 = r301
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L2e
            java.lang.String r0 = "1."
            r301 = r0
            r0 = r302
            r1 = r301
            boolean r0 = r0.startsWith(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L2e
            java.lang.String r0 = "0."
            r301 = r0
            r0 = r302
            r1 = r301
            boolean r0 = r0.startsWith(r1)
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L32
        L2e:
            r0 = 0
            r303 = r0
            r0 = 0
            r301 = r0
        L32:
            r0 = r303
            com.facebook.common.errorreporting.memory.nativememdump.NativeHeapDumper.sIsArt = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.errorreporting.memory.nativememdump.NativeHeapDumper.m5886clinit():void");
    }

    public NativeHeapDumper(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, String str, File file) {
        this.mAslSessionId = str;
        this.mQpl = lightweightQuickPerformanceLogger;
        this.mLogDir = file;
    }

    public static void A00() {
        Debug.getRuntimeStats();
    }

    private void copyCharSequenceToBuffer(ByteBuffer byteBuffer, CharSequence charSequence) {
        byteBuffer.position(0);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= charSequence.length() || i2 >= byteBuffer.capacity() - 1) {
                break;
            }
            byteBuffer.put((byte) charSequence.charAt(i2));
            i = i2 + 1;
        }
        byteBuffer.put((byte) 0);
    }

    public static native int forkAndDumpJavaHeap(String str, ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3);

    public static native int nativeInitialize(boolean z, int i, boolean z2, boolean z3, int i2, ByteBuffer byteBuffer);

    public static native int nativeWaitForDump(ByteBuffer byteBuffer);

    public static native void prepareForDump(Object obj, String str, ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, String str2, String str3);

    public boolean canDump(String str) {
        synchronized (this) {
            if (!this.mInitialized) {
                return false;
            }
            4DD r0 = this.mDumpSupporter;
            if (r0 == null || this.mNextHprofId == null || this.mNextHprofFilename == null) {
                return false;
            }
            C4Cy c4Cy = r0.A07;
            Runtime runtime = Runtime.getRuntime();
            String str2 = r0.A0D;
            c4Cy.CgW(str2, System.currentTimeMillis(), runtime.freeMemory(), runtime.totalMemory(), runtime.maxMemory());
            c4Cy.CgJ("OOM", str, str2);
            synchronized (4DD.class) {
                if (4DD.A0N) {
                    r0.A07.CgG("OOM", str, str2, "not_dumping_because_already_dumping");
                    return false;
                }
                if (4DD.A03(r0, "OOM", str)) {
                    return false;
                }
                if (C03h.A01().A06(0S2.A00) <= 3 * Runtime.getRuntime().maxMemory()) {
                    r0.A07.CgG("OOM", str, str2, "not_dumping_because_no_space");
                    return false;
                }
                StringBuilder sb = r0.A0I;
                c4Cy.CgK(sb, "OOM", str, str2);
                r0.A03 = sb;
                r0.A04 = "OOM";
                4DD r02 = this.mDumpSupporter;
                String str3 = this.mNextHprofId;
                String str4 = this.mNextHprofFilename;
                4DE r03 = r02.A08;
                r03.A0A = r02.A0D;
                r03.A0G = r02.A0E;
                r03.A07 = str3;
                r03.A0C = "OOM";
                r03.A05 = Runtime.getRuntime().maxMemory();
                r03.A09 = str4;
                r03.A0B = str;
                r03.A00 = 0;
                C4D5 c4d5 = r02.A0A;
                StringBuilder sb2 = r02.A0F;
                c4d5.A00(sb2);
                r03.A0H = !C0ft.A09();
                r03.A0I = c4d5.A01();
                r03.A0E = C0ft.A04 == null ? "" : C0ft.A04.A04;
                r03.A0D = C0ft.A01();
                r03.A08 = sb2;
                r03.A02 = (int) 1BK.A0N(r02.A0B.A01).Auy(36595745589758746L);
                r03.A01 = 0;
                r03.A04 = SystemClock.uptimeMillis();
                r03.A03 = System.currentTimeMillis();
                r02.A09.D35(r03);
                return true;
            }
        }
    }

    @Override // X.C4D4
    public int dumpJavaHeap(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, StringBuilder sb) {
        synchronized (this) {
            if (!this.mInitialized) {
                sb.append("error on initialization");
                return 7;
            }
            if (charSequence2 == null || charSequence2.length() >= this.mSpaceStatsFilenameBuffer.capacity()) {
                charSequence2 = null;
            } else {
                copyCharSequenceToBuffer(this.mSpaceStatsFilenameBuffer, charSequence2);
            }
            if (charSequence3 == null || charSequence3.length() >= this.mMapsFilenameBuffer.capacity()) {
                charSequence3 = null;
            } else {
                copyCharSequenceToBuffer(this.mMapsFilenameBuffer, charSequence3);
            }
            int forkAndDumpJavaHeap = forkAndDumpJavaHeap(charSequence.toString(), this.mSpaceStatsFilenameBuffer, charSequence2 != null ? charSequence2.length() : 0, this.mMapsFilenameBuffer, charSequence3 != null ? charSequence3.length() : 0, this.mDetailsBuffer, 0);
            this.mDetailsBuffer.position(0);
            ByteBuffer byteBuffer = this.mDetailsBuffer;
            while (true) {
                byte b = byteBuffer.get();
                if (b == 0) {
                    return forkAndDumpJavaHeap;
                }
                sb.append((char) b);
            }
        }
    }

    @Override // X.C4D4
    public int dumpJavaHeapAsync(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, StringBuilder sb, boolean z) {
        synchronized (this) {
            if (!this.mInitialized) {
                sb.append("error on initialization");
                return 7;
            }
            if (charSequence2 == null || charSequence2.length() >= this.mSpaceStatsFilenameBuffer.capacity()) {
                charSequence2 = null;
            } else {
                copyCharSequenceToBuffer(this.mSpaceStatsFilenameBuffer, charSequence2);
            }
            if (charSequence3 == null || charSequence3.length() >= this.mMapsFilenameBuffer.capacity()) {
                charSequence3 = null;
            } else {
                copyCharSequenceToBuffer(this.mMapsFilenameBuffer, charSequence3);
            }
            String charSequence4 = charSequence.toString();
            ByteBuffer byteBuffer = this.mSpaceStatsFilenameBuffer;
            int length = charSequence2 != null ? charSequence2.length() : 0;
            ByteBuffer byteBuffer2 = this.mMapsFilenameBuffer;
            int length2 = charSequence3 != null ? charSequence3.length() : 0;
            ByteBuffer byteBuffer3 = this.mDetailsBuffer;
            int i = 2;
            if (z) {
                i = 1;
            }
            int forkAndDumpJavaHeap = forkAndDumpJavaHeap(charSequence4, byteBuffer, length, byteBuffer2, length2, byteBuffer3, i);
            if ((forkAndDumpJavaHeap & 15) == 6) {
                this.mDetailsBuffer.position(0);
                ByteBuffer byteBuffer4 = this.mDetailsBuffer;
                while (true) {
                    byte b = byteBuffer4.get();
                    if (b == 0) {
                        break;
                    }
                    sb.append((char) b);
                }
            }
            return forkAndDumpJavaHeap;
        }
    }

    @Override // X.C4D4
    public void initialize(boolean z, boolean z2, int i) {
        synchronized (this) {
            if (!this.mInitAttempted) {
                boolean z3 = true;
                this.mInitAttempted = true;
                int nativeInitialize = nativeInitialize(sIsArt, Build.VERSION.SDK_INT, z, z2, i, this.mDetailsBuffer);
                if (nativeInitialize != 0) {
                    z3 = false;
                }
                this.mInitialized = z3;
                if (z && this.mLogDir != null) {
                    EventBuilder markEventBuilder = this.mQpl.markEventBuilder(21372992, "init");
                    if (markEventBuilder.isSampled()) {
                        markEventBuilder.annotate("asl_session_id", this.mAslSessionId);
                        markEventBuilder.annotate("result", this.mInitialized);
                        markEventBuilder.annotate(1BJ.A00(22), nativeInitialize);
                        if (!this.mInitialized) {
                            StringBuilder A0k = AnonymousClass001.A0k();
                            ByteBuffer byteBuffer = this.mDetailsBuffer;
                            while (true) {
                                byte b = byteBuffer.get();
                                if (b == 0) {
                                    break;
                                } else {
                                    A0k.append((char) b);
                                }
                            }
                            markEventBuilder.annotate(1BJ.A00(176), A0k.toString());
                        }
                        markEventBuilder.report();
                    }
                }
                if (this.mInitialized) {
                    A00();
                }
            }
        }
    }

    @Override // X.C4D4
    public void prepareForDump(4DD r302, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
        CharSequence charSequence5 = charSequence3;
        CharSequence charSequence6 = charSequence4;
        synchronized (this) {
            if (this.mInitialized) {
                if (charSequence3 == null || charSequence3.length() >= this.mSpaceStatsFilenameBuffer.capacity()) {
                    charSequence5 = null;
                } else {
                    copyCharSequenceToBuffer(this.mSpaceStatsFilenameBuffer, charSequence3);
                }
                if (charSequence4 == null || charSequence6.length() >= this.mMapsFilenameBuffer.capacity()) {
                    charSequence6 = null;
                } else {
                    copyCharSequenceToBuffer(this.mMapsFilenameBuffer, charSequence6);
                }
                this.mNextHprofId = charSequence.toString();
                String charSequence7 = charSequence2.toString();
                this.mNextHprofFilename = charSequence7;
                this.mDumpSupporter = r302;
                ByteBuffer byteBuffer = this.mSpaceStatsFilenameBuffer;
                int length = charSequence5 == null ? 0 : charSequence5.length();
                ByteBuffer byteBuffer2 = this.mMapsFilenameBuffer;
                int length2 = charSequence6 == null ? 0 : charSequence6.length();
                File file = this.mLogDir;
                prepareForDump(this, charSequence7, byteBuffer, length, byteBuffer2, length2, file == null ? "" : new File(file, "oomthrow.bin").getPath(), this.mNextHprofId);
                if (this.mLogDir != null) {
                    EventBuilder markEventBuilder = this.mQpl.markEventBuilder(21372992, "prepare");
                    if (markEventBuilder.isSampled()) {
                        markEventBuilder.annotate("asl_session_id", this.mAslSessionId);
                        markEventBuilder.annotate("hprof_id", this.mNextHprofId);
                        markEventBuilder.report();
                    }
                }
            }
        }
    }

    @Override // X.C4D4
    public int waitForDump(StringBuilder sb) {
        synchronized (this) {
            if (!this.mInitialized) {
                return 7;
            }
            this.mDetailsBuffer.position(0);
            int nativeWaitForDump = nativeWaitForDump(this.mDetailsBuffer);
            this.mDetailsBuffer.position(0);
            ByteBuffer byteBuffer = this.mDetailsBuffer;
            while (true) {
                byte b = byteBuffer.get();
                if (b == 0) {
                    return nativeWaitForDump;
                }
                sb.append((char) b);
            }
        }
    }
}
