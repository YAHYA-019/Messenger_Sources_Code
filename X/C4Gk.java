package X;

/* renamed from: X.4Gk, reason: invalid class name */
/* loaded from: 4Gk.class */
public final class C4Gk implements C4Gf {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0083, code lost:
    
        if (r0 < (r0 + r0)) goto L12;
     */
    @Override // X.C4Gf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C4Gy A8f(X.C4Gc r302, X.44I r303) {
        /*
            r301 = this;
            r0 = r303
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = 1
            r304 = r0
            r0 = r302
            r1 = r304
            X.11T.A0F(r0, r1)
            r0 = r302
            X.4GM r0 = r0.A0G
            r305 = r0
            r0 = r303
            com.facebook.quickpromotion.model.QuickPromotionDefinition r0 = r0.A00
            r306 = r0
            r0 = r306
            java.lang.String r0 = r0.promotionId
            r307 = r0
            r0 = r305
            r1 = r307
            java.lang.Integer r0 = r0.A00(r1)
            r305 = r0
            java.lang.Integer r0 = X.0S2.A0N
            r307 = r0
            r0 = r305
            r1 = r307
            if (r0 != r1) goto L38
            X.4Gy r0 = X.C4Gx.A00()
            return r0
        L38:
            r0 = r306
            long r0 = r0.clientTtlSeconds
            r308 = r0
            r0 = 1000(0x3e8, double:4.94E-321)
            r310 = r0
            r0 = r308
            r1 = r310
            long r0 = r0 * r1
            r308 = r0
            r0 = r302
            long r0 = r0.A00
            r312 = r0
            r0 = r302
            long r0 = r0.A01
            r314 = r0
            r0 = 0
            r316 = r0
            r0 = r308
            r1 = r316
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L86
            r0 = r314
            r1 = r316
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L86
            r0 = r314
            r1 = r308
            long r0 = r0 + r1
            r318 = r0
            r0 = r312
            r1 = r318
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r320 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r307 = r0
            r0 = r320
            if (r0 >= 0) goto L88
        L86:
            r0 = 1
            r304 = r0
        L88:
            X.4H6 r0 = new X.4H6
            r321 = r0
            r0 = r321
            r1 = r308
            r2 = r312
            r3 = r314
            r0.<init>(r1, r2, r3)
            r0 = r304
            if (r0 == 0) goto La2
            r0 = r321
            X.4Gy r0 = X.C4Gx.A01(r0)
            return r0
        La2:
            r0 = r321
            java.lang.String r1 = "outside_of_client_ttl"
            X.4Gy r0 = X.C4Gx.A02(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Gk.A8f(X.4Gc, X.44I):X.4Gy");
    }

    @Override // X.C4Gf
    public String DAM() {
        return "client_ttl";
    }
}
