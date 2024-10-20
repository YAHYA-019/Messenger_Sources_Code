package X;

/* renamed from: X.8ks, reason: invalid class name */
/* loaded from: 8ks.class */
public final class C8ks extends C1rj {
    public int A00;
    public int A01;
    public 2Yf A02;

    public C8ks() {
        super("ThreadCustomizationPickerContentComponent");
    }

    public final Object[] A0k() {
        return 1BK.A1a(Integer.valueOf(this.A00), this.A02, this.A01);
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C8ks c8ks = (C8ks) super.A0l();
        2Yf r0 = c8ks.A02;
        c8ks.A02 = r0 != null ? r0.A0g(false) : null;
        return c8ks;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        int i = this.A00;
        2Yf r0 = this.A02;
        final String A0C = r302.A0C();
        final int i2 = this.A01;
        Object obj = new Object(A0C, i2) { // from class: X.9an
            public final int A00;
            public final String A01;

            {
                this.A01 = A0C;
                this.A00 = i2;
            }

            public boolean equals(Object obj2) {
                if (this != obj2) {
                    if (obj2 == null || !(obj2 instanceof C9an)) {
                        return false;
                    }
                    C9an c9an = (C9an) obj2;
                    if (!11T.A0O(this.A01, c9an.A01) || this.A00 != c9an.A00) {
                        return false;
                    }
                }
                return true;
            }

            public int hashCode() {
                return 7zS.A04(this, this.A01, Integer.valueOf(this.A00));
            }
        };
        3wW r309 = (C2kf) r302.A0B(obj, A0C, 0);
        if (r309 == null) {
            int i3 = this.A01;
            3wU r02 = new 3wU();
            r02.A01 = i3;
            r02.A02 = 1;
            r02.A0A = false;
            r309 = r02.A00();
            r302.A0I(obj, r309, A0C, 0);
        }
        11T.A0F(r0, 2);
        C2ki A00 = C2kV.A00(r302);
        A00.A2f(r309);
        A00.A2d(r0);
        A00.A2j(true);
        A00.A01.A03 = 2;
        A00.A1L(i);
        A00.A0e();
        return A00.A2W();
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }
}
