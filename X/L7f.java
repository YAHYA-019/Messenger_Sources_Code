package X;

/* loaded from: L7f.class */
public class L7f {
    public final KuR A00;
    public final KuR A01;
    public final KuR A02;
    public final KuR A03;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public L7f(X.KuR r302, X.KuR r303) {
        /*
            r301 = this;
            r0 = r302
            long r0 = r0.A01
            r304 = r0
            long r0 = X.Kyj.A01
            r306 = r0
            r0 = r304
            r1 = r306
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L5a
            X.Kty r0 = X.Kcy.A01
            r309 = r0
            X.N23 r0 = X.N23.A01
            r310 = r0
            r0 = r310
            r1 = r302
            r2 = r309
            X.KuR r0 = A00(r0, r1, r2)
            r311 = r0
        L29:
            r0 = r303
            long r0 = r0.A01
            r304 = r0
            r0 = r304
            r1 = r306
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L54
            X.Kty r0 = X.Kcy.A01
            r309 = r0
            X.N23 r0 = X.N23.A01
            r1 = r303
            r2 = r309
            X.KuR r0 = A00(r0, r1, r2)
            r310 = r0
        L49:
            r0 = r301
            r1 = r302
            r2 = r303
            r3 = r311
            r4 = r310
            r0.<init>(r1, r2, r3, r4)
            return
        L54:
            r0 = r303
            r310 = r0
            goto L49
        L5a:
            r0 = r302
            r311 = r0
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L7f.<init>(X.KuR, X.KuR):void");
    }

    public L7f(KuR kuR, KuR kuR2, KuR kuR3, KuR kuR4) {
        this.A03 = kuR;
        this.A00 = kuR2;
        this.A02 = kuR3;
        this.A01 = kuR4;
    }

    public static final KuR A00(N23 n23, KuR kuR, Kty kty) {
        KuR kuR2 = kuR;
        if (kuR.A01 == Kyj.A01) {
            C2910Jcy c2910Jcy = (C2910Jcy) kuR;
            Kty kty2 = c2910Jcy.A07;
            if (!LBe.A01(kty2, kty)) {
                float[] A03 = LBe.A03(LBe.A04(n23.A00, kty2.A00(), kty.A00()), c2910Jcy.A0B);
                String str = ((KuR) c2910Jcy).A02;
                float[] fArr = c2910Jcy.A0A;
                kuR2 = new C2910Jcy(c2910Jcy.A05, c2910Jcy.A03, c2910Jcy.A06, kty, str, fArr, A03, c2910Jcy.A01, c2910Jcy.A00, -1);
            }
        }
        return kuR2;
    }
}
