package X;

/* loaded from: B26.class */
public final class B26 extends 2Yf {
    public 1LI A00;
    public 1LI A01;
    public 1LI A02;

    public B26() {
        super("AppointmentDetailSection");
    }

    public 2Ys A0d(C1qb c1qb) {
        1LI r0 = this.A02;
        1LI r02 = this.A00;
        1LI r03 = this.A01;
        11T.A0H(c1qb, r0);
        2Yr A0l = 7zL.A0l();
        2hP A0I = 2hO.A0I(c1qb);
        A0I.A05(r0);
        ((2hQ) A0I).A00.A07 = "header";
        A0l.A00(A0I);
        if (r02 != null) {
            2hP A0I2 = 2hO.A0I(c1qb);
            A0I2.A05(r02);
            ((2hQ) A0I2).A00.A07 = "body";
            A0l.A00(A0I2);
        }
        if (r03 != null) {
            2hP A0I3 = 2hO.A0I(c1qb);
            A0I3.A05(r03);
            ((2hQ) A0I3).A00.A07 = "footer";
            A0l.A00(A0I3);
        }
        2Ys r04 = A0l.A00;
        11T.A0A(r04);
        return r04;
    }

    public /* bridge */ /* synthetic */ 2Yf A0g(boolean z) {
        B26 b26 = (B26) super.A0g(z);
        1LI r0 = b26.A00;
        1LI r305 = null;
        b26.A00 = r0 != null ? r0.A0l() : null;
        1LI r02 = b26.A01;
        b26.A01 = r02 != null ? r02.A0l() : null;
        1LI r03 = b26.A02;
        if (r03 != null) {
            r305 = r03.A0l();
        }
        b26.A02 = r305;
        return b26;
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            B26 b26 = (B26) r302;
            1LI r0 = this.A00;
            1LI r02 = b26.A00;
            if (r0 != null) {
                if (!C4Cv.A05(r0, r02, z)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            1LI r03 = this.A01;
            1LI r04 = b26.A01;
            if (r03 != null) {
                if (!C4Cv.A05(r03, r04, z)) {
                    return false;
                }
            } else if (r04 != null) {
                return false;
            }
            1LI r05 = this.A02;
            1LI r06 = b26.A02;
            if (r05 != null) {
                if (!C4Cv.A05(r05, r06, z)) {
                    return false;
                }
            } else if (r06 != null) {
                return false;
            }
        }
        return true;
    }
}
