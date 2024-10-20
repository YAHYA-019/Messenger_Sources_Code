package X;

import java.lang.reflect.InvocationTargetException;

/* loaded from: I6u.class */
public final class I6u {
    public static int A00 = 270;
    public static String A01 = "/sdcard/e2e/media/fineYoungGentleman.jpg";
    public static Boolean A02;

    public static boolean A00() {
        boolean booleanValue;
        synchronized (I6u.class) {
            Boolean bool = A02;
            if (bool == null) {
                try {
                    Boolean bool2 = (Boolean) Class.forName("com.facebook.endtoend.EndToEnd").getMethod("isRunningEndToEndTest", new Class[0]).invoke(null, new Object[0]);
                    if (bool2 == null || !bool2.booleanValue()) {
                        bool = false;
                    } else {
                        boolean A1X = AnonymousClass001.A1X(A01);
                        0fH.A0h(bool2, "OpticE2EConfig", "is e2e test: %s");
                        bool = Boolean.valueOf(A1X);
                        0fH.A0h(bool, "OpticE2EConfig", "static frame file exists: %s");
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException | InvocationTargetException e) {
                    android.util.Log.i("OpticE2EConfig", "Failed to access test", e);
                    bool = false;
                }
                A02 = bool;
            }
            booleanValue = bool.booleanValue();
        }
        return booleanValue;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: PHI empty after try-catch fix!
        	at jadx.core.dex.visitors.ssa.SSATransform.fixPhiInTryCatch(SSATransform.java:228)
        	at jadx.core.dex.visitors.ssa.SSATransform.fixLastAssignInTry(SSATransform.java:208)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:64)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
        */
    public static byte[] A01() {
        /*
            java.lang.String r0 = X.I6u.A01     // Catch: java.io.IOException -> L28
            r301 = r0
            r0 = r301
            java.io.File r0 = X.AnonymousClass001.A0E(r0)     // Catch: java.io.IOException -> L28
            r301 = r0
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.IOException -> L28
            r302 = r0
            r0 = r302
            r1 = r301
            r0.<init>(r1)     // Catch: java.io.IOException -> L28
            r0 = r301
            long r0 = r0.length()     // Catch: java.io.IOException -> L28
            r303 = r0
            r0 = r303
            int r0 = (int) r0
            r305 = r0
            r0 = r305
            byte[] r0 = new byte[r0]     // Catch: java.io.IOException -> L28
            r301 = r0
            r0 = r302
            r1 = r301
            int r0 = r0.read(r1)     // Catch: java.io.IOException -> L28
            r0 = r301
            return r0
        L28:
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0U(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I6u.A01():byte[]");
    }
}
