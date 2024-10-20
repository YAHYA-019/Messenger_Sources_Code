package X;

/* renamed from: X.54z, reason: invalid class name */
/* loaded from: 54z.class */
public abstract class C54z {
    public static volatile boolean A00;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0093, code lost:
    
        if (r304 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Throwable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Throwable, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.facebook.auth.usersession.FbUserSession A00(X.1Iw r301) {
        /*
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = r301
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r301
            X.1qp r0 = r0.A08
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L22
            r0 = r304
            java.lang.Class<com.facebook.auth.usersession.FbUserSession> r1 = com.facebook.auth.usersession.FbUserSession.class
            java.lang.Object r0 = r0.A01(r1)
            com.facebook.auth.usersession.FbUserSession r0 = (com.facebook.auth.usersession.FbUserSession) r0
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L22
            r0 = r303
            return r0
        L22:
            r0 = 16511(0x407f, float:2.3137E-41)
            r305 = r0
            boolean r0 = X.C54z.A00
            r302 = r0
            r0 = 1
            r306 = r0
            java.lang.String r0 = "Cannot find user session in tree props"
            r307 = r0
            r0 = r302
            if (r0 != 0) goto L40
            r0 = r305
            java.lang.Object r0 = X.1Bi.A03(r0)     // Catch: java.lang.Throwable -> L3f
            r304 = r0
            goto L4c
        L3f:
            throw r0
        L40:
            java.lang.String r0 = "FbUserSessionLithoUtil"
            r303 = r0
            r0 = r303
            r1 = r307
            X.0fH.A0k(r0, r1)
            goto L62
        L4c:
            r0 = r304
            X.01s r0 = (X.C01s) r0
            r304 = r0
            java.lang.String r0 = "MISSING_USER_SESSION_TREE_PROP"
            r303 = r0
            r0 = r304
            r1 = r303
            r2 = r307
            r0.D0v(r1, r2)
            r0 = r306
            X.C54z.A00 = r0
        L62:
            r0 = r301
            android.content.Context r0 = r0.A0D
            r307 = r0
            r0 = r307
            X.11T.A0A(r0)
            r0 = 16428(0x402c, float:2.302E-41)
            r305 = r0
            r0 = 0
            r302 = r0
            r0 = r307
            r1 = 0
            r2 = r305
            java.lang.Object r0 = X.1Bn.A0E(r0, r1, r2)
            X.1EZ r0 = (X.1EZ) r0
            r303 = r0
            r0 = r303
            com.facebook.auth.viewercontext.ViewerContext r0 = r0.BKF()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L96
            r0 = r303
            com.facebook.auth.viewercontext.ViewerContext r0 = r0.B0c()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto Lac
        L96:
            r0 = r304
            java.lang.String r0 = r0.mUserId
            r303 = r0
            r0 = r303
            if (r0 == 0) goto Lac
            r0 = 66351(0x1032f, float:9.2978E-41)
            java.lang.Object r0 = X.1Bi.A03(r0)
            X.1Fv r0 = (X.1Fv) r0
            r1 = r304
            com.facebook.auth.usersession.FbUserSession r0 = r0.A08(r1)
            return r0
        Lac:
            com.facebook.auth.usersession.FbUserSession r0 = com.facebook.auth.usersession.FbUserSession.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54z.A00(X.1Iw):com.facebook.auth.usersession.FbUserSession");
    }
}
