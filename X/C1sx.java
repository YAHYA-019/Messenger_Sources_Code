package X;

/* renamed from: X.1sx, reason: invalid class name */
/* loaded from: 1sx.class */
public final class C1sx {
    public void A00(1pK r302, C1sy c1sy) {
        A01(r302, c1sy);
    }

    public void A01(1pK r302, final C1sy c1sy) {
        c1sy.getClass();
        final C1t1 c1t1 = new C1t1() { // from class: X.1t0
            @Override // X.C1t1
            public void CIs() {
                c1sy.CfN();
            }
        };
        final C1t3 c1t3 = (C1t3) 1Lo.A06(1Fw.A04((1EZ) 1Bn.A0A(16428)), 33086);
        C1t6.A00(r302, new C1t5() { // from class: X.1t4
            @Override // X.C1t5
            public void BzZ() {
                c1t3.A01(c1t1);
            }

            @Override // X.C1t5
            public void Bzd() {
                c1sy.CfN();
                c1t3.A00(c1t1);
            }
        });
    }
}
