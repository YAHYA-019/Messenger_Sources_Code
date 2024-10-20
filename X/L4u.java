package X;

/* loaded from: L4u.class */
public abstract class L4u {
    public MNK A00;
    public boolean A02;
    public boolean A03;
    public final MNK A04;
    public boolean A01 = true;
    public final java.util.Map A05 = AnonymousClass001.A0u();

    public L4u(MNK mnk) {
        this.A04 = mnk;
    }

    public static final void A00(Kdl kdl, L4u l4u, AbstractC2938JdR abstractC2938JdR, int i) {
        long A00;
        boolean z;
        loop0: while (true) {
            float f = i;
            A00 = KvH.A00(f, f);
            do {
                z = l4u instanceof C2931JdJ;
                if (z) {
                    AbstractC2941JdU A0Q = abstractC2938JdR.A0Q();
                    11T.A0D(A0Q);
                    A00 = LE0.A04(KvH.A00(JQz.A02(A0Q.A00), JR0.A0I(r0)), A00);
                } else {
                    A00 = AbstractC2938JdR.A04(abstractC2938JdR, A00);
                }
                abstractC2938JdR = abstractC2938JdR.A07;
                11T.A0D(abstractC2938JdR);
                if (11T.A0O(abstractC2938JdR, l4u.A04.Aqo())) {
                    break loop0;
                }
            } while (!l4u.A01(abstractC2938JdR).containsKey(kdl));
            if (z) {
                AbstractC2941JdU A0Q2 = abstractC2938JdR.A0Q();
                11T.A0D(A0Q2);
                i = A0Q2.A0M(kdl);
            } else {
                i = abstractC2938JdR.A0M(kdl);
            }
        }
        int round = Math.round(kdl instanceof C2920Jd8 ? JR1.A02(A00) : DKH.A00(A00));
        java.util.Map map = l4u.A05;
        if (map.containsKey(kdl)) {
            round = AnonymousClass001.A03(kdl.A00.invoke(Integer.valueOf(AnonymousClass001.A03(02K.A03(kdl, map))), Integer.valueOf(round)));
        }
        1BK.A1P(kdl, map, round);
    }

    public java.util.Map A01(AbstractC2938JdR abstractC2938JdR) {
        MKR A0N;
        if (this instanceof C2931JdJ) {
            AbstractC2941JdU A0Q = abstractC2938JdR.A0Q();
            11T.A0D(A0Q);
            A0N = A0Q.A0N();
        } else {
            A0N = abstractC2938JdR.A0N();
        }
        return A0N.AWF();
    }

    public final void A02() {
        this.A01 = true;
        MNK mnk = this.A04;
        MNK B1I = mnk.B1I();
        if (B1I != null) {
            if (this.A03) {
                mnk.Cgz();
            }
            if (this.A02) {
                mnk.requestLayout();
            }
            B1I.AWE().A02();
        }
    }

    public final void A03() {
        java.util.Map map = this.A05;
        map.clear();
        MNK mnk = this.A04;
        mnk.ATY(M6m.A00(this, 20));
        map.putAll(A01(mnk.Aqo()));
        this.A01 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if (r0.A02 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r301.A02 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A04() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A03
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L16
            r0 = r301
            boolean r0 = r0.A02
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = 0
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L18
        L16:
            r0 = 1
            r302 = r0
        L18:
            r0 = r301
            X.MNK r0 = r0.A04
            r305 = r0
            r0 = r302
            if (r0 != 0) goto L5d
            r0 = r305
            X.MNK r0 = r0.B1I()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L63
            r0 = r304
            X.L4u r0 = r0.AWE()
            r304 = r0
            r0 = r304
            X.MNK r0 = r0.A00
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L64
            r0 = r305
            X.L4u r0 = r0.AWE()
            r306 = r0
            r0 = r306
            boolean r0 = r0.A03
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L5d
            r0 = r306
            boolean r0 = r0.A02
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L64
        L5d:
            r0 = r301
            r1 = r305
            r0.A00 = r1
        L63:
            return
        L64:
            r0 = r301
            X.MNK r0 = r0.A00
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L63
            r0 = r305
            X.L4u r0 = r0.AWE()
            r306 = r0
            r0 = r306
            boolean r0 = r0.A03
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L63
            r0 = r306
            boolean r0 = r0.A02
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L63
            r0 = r305
            X.MNK r0 = r0.B1I()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto La7
            r0 = r304
            X.L4u r0 = r0.AWE()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto La7
            r0 = r304
            r0.A04()
        La7:
            r0 = r305
            X.MNK r0 = r0.B1I()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto Lc7
            r0 = r304
            X.L4u r0 = r0.AWE()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto Lc7
            r0 = r304
            X.MNK r0 = r0.A00
            r305 = r0
            goto L5d
        Lc7:
            r0 = 0
            r305 = r0
            goto L5d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L4u.A04():void");
    }
}
