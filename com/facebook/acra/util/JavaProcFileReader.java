package com.facebook.acra.util;

import X.0fH;
import X.AnonymousClass001;
import android.os.Process;

/* loaded from: JavaProcFileReader.class */
public class JavaProcFileReader extends ProcFileReader {
    public static final String FD_DIR_STRING = "/fd/";
    public static final String LS_SYMLINK_ARROW = " -> ";
    public static final String PIPE_STRING = "pipe";
    public static final String SOCKET_STRING = "socket";
    public static final String TAG = "JavaProcFileReader";
    public static JavaProcFileReader sInstance;
    public static final String FD_DIR = String.format("/proc/%s/fd", AnonymousClass001.A1a(Process.myPid()));
    public static final int[] PROC_OPEN_FD_LIMITS_FORMAT = {32, 32, 288, 4384, 4384, 288};

    /* loaded from: JavaProcFileReader$Counter.class */
    public class Counter {
        public int count;

        public Counter() {
        }

        public /* synthetic */ Counter(AnonymousClass1 anonymousClass1) {
        }
    }

    public static int findNewLineOrEnd(byte[] bArr, int i) {
        byte b;
        int length = bArr.length;
        if (i >= length) {
            i = -1;
        } else {
            while (i < length - 1 && (b = bArr[i]) != 10 && b != 0) {
                i++;
            }
        }
        return i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v3 ??, still in use, count: 2, list:
          (r302v3 ??) from 0x0019: PHI (r302v2 ??) = (r302v1 ??), (r302v3 ??) binds: [B:6:0x000a, B:10:0x0016] A[DONT_GENERATE, DONT_INLINE]
          (r302v3 ?? I:com.facebook.acra.util.JavaProcFileReader) from 0x0016: SPUT (r302v3 ?? I:com.facebook.acra.util.JavaProcFileReader) A[Catch: all -> 0x001d] com.facebook.acra.util.JavaProcFileReader.sInstance com.facebook.acra.util.JavaProcFileReader
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
    public static com.facebook.acra.util.JavaProcFileReader getInstance() {
        /*
            java.lang.Class<com.facebook.acra.util.JavaProcFileReader> r0 = com.facebook.acra.util.JavaProcFileReader.class
            r301 = r0
            r0 = r301
            monitor-enter(r0)
            com.facebook.acra.util.JavaProcFileReader r0 = com.facebook.acra.util.JavaProcFileReader.sInstance     // Catch: java.lang.Throwable -> L1d
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L19
            com.facebook.acra.util.JavaProcFileReader r0 = new com.facebook.acra.util.JavaProcFileReader     // Catch: java.lang.Throwable -> L1d
            r302 = r0
            r0 = r302
            r0.<init>()     // Catch: java.lang.Throwable -> L1d
            r0 = r302
            com.facebook.acra.util.JavaProcFileReader.sInstance = r0     // Catch: java.lang.Throwable -> L1d
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.acra.util.JavaProcFileReader.getInstance():com.facebook.acra.util.JavaProcFileReader");
    }

    public static boolean startsWithOffset(byte[] bArr, int i, byte[] bArr2) {
        int length = bArr.length - i;
        int length2 = bArr2.length;
        boolean z = false;
        if (length >= length2) {
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= length2) {
                    z = true;
                    break;
                }
                if (bArr[i3 + i] != bArr2[i3]) {
                    break;
                }
                i2 = i3 + 1;
            }
        }
        return z;
    }

    @Override // com.facebook.acra.util.ProcFileReader
    public int getOpenFDCount() {
        try {
            String[] list = AnonymousClass001.A0E(FD_DIR).list();
            if (list != null) {
                return list.length;
            }
            return -1;
        } catch (SecurityException e) {
            0fH.A0k(TAG, e.getMessage());
            return -2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x029f A[SYNTHETIC] */
    @Override // com.facebook.acra.util.ProcFileReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.acra.util.ProcFileReader.OpenFDLimits getOpenFDLimits() {
        /*
            Method dump skipped, instructions count: 729
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.acra.util.JavaProcFileReader.getOpenFDLimits():com.facebook.acra.util.ProcFileReader$OpenFDLimits");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v7 ??, still in use, count: 2, list:
          (r309v7 ??) from 0x0113: PHI (r309v6 ??) = (r309v5 ??), (r309v7 ??) binds: [B:38:0x00fa, B:42:0x010b] A[DONT_GENERATE, DONT_INLINE]
          (r309v7 ?? I:java.lang.Object) from 0x010d: INVOKE (r0v27 ?? I:java.util.Map), (r1v24 ?? I:java.lang.Object), (r309v7 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: IOException | IndexOutOfBoundsException | SecurityException -> 0x018d, IOException | IndexOutOfBoundsException | SecurityException -> 0x018d, IOException | IndexOutOfBoundsException | SecurityException -> 0x018d, MD:(K, V):V (c)]
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
    @Override // com.facebook.acra.util.ProcFileReader
    public java.lang.String getOpenFileDescriptors() {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.acra.util.JavaProcFileReader.getOpenFileDescriptors():java.lang.String");
    }
}
