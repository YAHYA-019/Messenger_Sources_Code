package com.facebook.acra.util;

import X.AnonymousClass001;
import com.facebook.acra.util.ProcFileReader;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: NativeProcFileReader.class */
public class NativeProcFileReader extends ProcFileReader {
    public static final String TAG = "NativeProcFileReader";
    public static NativeProcFileReader sInstance;
    public static Thread sLoadSoThread;
    public static final AtomicBoolean sReadyToUse = new AtomicBoolean(false);

    public NativeProcFileReader() {
        if (!sReadyToUse.get()) {
            throw AnonymousClass001.A0N("Class is not ready");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v3 ??, still in use, count: 2, list:
          (r302v3 ??) from 0x0019: PHI (r302v2 ??) = (r302v1 ??), (r302v3 ??) binds: [B:6:0x000a, B:10:0x0016] A[DONT_GENERATE, DONT_INLINE]
          (r302v3 ?? I:com.facebook.acra.util.NativeProcFileReader) from 0x0016: SPUT (r302v3 ?? I:com.facebook.acra.util.NativeProcFileReader) A[Catch: all -> 0x001d] com.facebook.acra.util.NativeProcFileReader.sInstance com.facebook.acra.util.NativeProcFileReader
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public static com.facebook.acra.util.NativeProcFileReader getInstance() {
        /*
            java.lang.Class<com.facebook.acra.util.NativeProcFileReader> r0 = com.facebook.acra.util.NativeProcFileReader.class
            r301 = r0
            r0 = r301
            monitor-enter(r0)
            com.facebook.acra.util.NativeProcFileReader r0 = com.facebook.acra.util.NativeProcFileReader.sInstance     // Catch: java.lang.Throwable -> L1d
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L19
            com.facebook.acra.util.NativeProcFileReader r0 = new com.facebook.acra.util.NativeProcFileReader     // Catch: java.lang.Throwable -> L1d
            r302 = r0
            r0 = r302
            r0.<init>()     // Catch: java.lang.Throwable -> L1d
            r0 = r302
            com.facebook.acra.util.NativeProcFileReader.sInstance = r0     // Catch: java.lang.Throwable -> L1d
        L19:
            r0 = r301
            monitor-exit(r0)
            r0 = r302
            return r0
        L1d:
            r302 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r302
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.acra.util.NativeProcFileReader.getInstance():com.facebook.acra.util.NativeProcFileReader");
    }

    private native int[] getOpenFDLimitsNative();

    public static boolean isReady() {
        return sReadyToUse.get();
    }

    public static void nativeLibraryLoaded() {
        synchronized (NativeProcFileReader.class) {
            sReadyToUse.set(true);
            NativeProcFileReader.class.notifyAll();
        }
    }

    @Override // com.facebook.acra.util.ProcFileReader
    public native int getOpenFDCount();

    @Override // com.facebook.acra.util.ProcFileReader
    public ProcFileReader.OpenFDLimits getOpenFDLimits() {
        int[] openFDLimitsNative = getOpenFDLimitsNative();
        return new ProcFileReader.OpenFDLimits(openFDLimitsNative[0], openFDLimitsNative[1]);
    }

    @Override // com.facebook.acra.util.ProcFileReader
    public native String getOpenFileDescriptors();
}
