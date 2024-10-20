package com.facebook.errorreporting.nightwatch;

import X.0fH;
import X.C0gh;

/* loaded from: Nightwatch$NightwatchNative.class */
public class Nightwatch$NightwatchNative {
    public static UnsatisfiedLinkError A00;
    public static boolean A01;

    static {
        try {
            Class.forName("dalvik.annotation.optimization.CriticalNative");
        } catch (ClassNotFoundException e) {
            0fH.A0q("Nightwatch", "Critical Native could not be found. Using normal fastjni!", e);
        }
    }

    public static /* synthetic */ String A00() {
        return "Nightwatch";
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt.CAMERA_ID_BACK.equals(r0) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01() {
        /*
            java.lang.String r0 = "fbnightwatch"
            r301 = r0
            r0 = 0
            r302 = r0
            java.lang.String r0 = "facebook.test.nightwatch.use_debug"
            r303 = r0
            r0 = r303
            r1 = 0
            java.lang.String r0 = java.lang.System.getProperty(r0, r1)
            r304 = r0
            r0 = r304
            r1 = 0
            if (r0 == r1) goto L25
            java.lang.String r0 = "1"
            r303 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.equals(r1)
            r305 = r0
            r0 = 1
            r306 = r0
            r0 = r305
            if (r0 != 0) goto L2a
        L25:
            r0 = 0
            r306 = r0
            r0 = 0
            r303 = r0
        L2a:
            r0 = r306
            if (r0 == 0) goto L98
            r0 = r301
            java.lang.String r1 = "-debug"
            java.lang.String r0 = X.0Pz.A0W(r0, r1)
            r307 = r0
            java.lang.String r0 = "Nightwatch"
            r308 = r0
            r0 = 1
            r309 = r0
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = r0
            r2 = 0
            r3 = r307
            r1[r2] = r3
            r304 = r0
            java.lang.String r0 = "Nightwatch is set as debug. Trying to load debug lib %s."
            r303 = r0
            r0 = r308
            r1 = r303
            r2 = r304
            X.0fH.A17(r0, r1, r2)
            r0 = r307
            boolean r0 = X.C0gh.A03(r0)     // Catch: java.lang.UnsatisfiedLinkError -> L8d
            r302 = r0
            java.lang.String r0 = "Loaded debug nightwatch lib %s."
            r304 = r0
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.UnsatisfiedLinkError -> L8d
            r1 = r0
            r2 = 0
            r3 = r307
            r1[r2] = r3     // Catch: java.lang.UnsatisfiedLinkError -> L8d
            r303 = r0
            r0 = r308
            r1 = r304
            r2 = r303
            X.0fH.A17(r0, r1, r2)     // Catch: java.lang.UnsatisfiedLinkError -> L8d
            r0 = r302
            if (r0 == 0) goto L73
            r0 = r309
            return r0
        L73:
            java.lang.String r0 = "Falling back to load normal lib %s because NativeLoader indidicated %s was loaded already which should NOT happen. This is an error case, but failing safe."
            r304 = r0
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.UnsatisfiedLinkError -> L8d
            r1 = r0
            r2 = 0
            r3 = r301
            r1[r2] = r3     // Catch: java.lang.UnsatisfiedLinkError -> L8d
            r1 = r0
            r2 = 1
            r3 = r307
            r1[r2] = r3     // Catch: java.lang.UnsatisfiedLinkError -> L8d
            r303 = r0
            r0 = r308
            r1 = r304
            r2 = r303
            X.0fH.A14(r0, r1, r2)     // Catch: java.lang.UnsatisfiedLinkError -> L8d
            r0 = 0
            return r0
        L8d:
            r304 = move-exception
            java.lang.String r0 = "Could not find debug lib using normal lib"
            r303 = r0
            r0 = r308
            r1 = r303
            r2 = r304
            X.0fH.A0q(r0, r1, r2)
        L98:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.errorreporting.nightwatch.Nightwatch$NightwatchNative.A01():boolean");
    }

    public static void loadNightWatchLib() {
        if (A01) {
            UnsatisfiedLinkError unsatisfiedLinkError = A00;
            if (unsatisfiedLinkError != null) {
                throw unsatisfiedLinkError;
            }
        } else {
            if (A01()) {
                return;
            }
            try {
                try {
                    boolean A02 = C0gh.A02("fbnightwatch");
                    0fH.A0g(A02 ? "yes" : "no", A00(), "Successfully loaded nightwatch lib. Loaded on this call: %s");
                } catch (UnsatisfiedLinkError e) {
                    String A002 = A00();
                    Object[] objArr = new Object[1];
                    objArr[0] = "fbnightwatch";
                    0fH.A0y(A002, "Could not find load nightwatch lib %s", e, objArr);
                    A00 = e;
                    throw e;
                }
            } finally {
                A01 = true;
            }
        }
    }

    public static native boolean nAddTestHook(int i, boolean z, String str, String str2, String str3);

    public static native int start(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4);
}
