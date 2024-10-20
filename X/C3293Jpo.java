package X;

/* renamed from: X.Jpo, reason: case insensitive filesystem */
/* loaded from: Jpo.class */
public final class C3293Jpo extends LWD {
    public 5Im A00;
    public 5Im A01;
    public 5Im A02;
    public 5Im A03;
    public 5Im A04;

    public void Beo(5IO r302) {
        5IW[] A08;
        5IW[] A082;
        5IW[] A083;
        5IW[] A084;
        5IW[] A085;
        5IW r0;
        11T.A0F(r302, 0);
        5Im r02 = this.A02;
        if (r02 != null && (A085 = LWD.A08(r302)) != null && (r0 = A085[0]) != null) {
            LWD.A06(r02, r0.A0x, 0);
        }
        5Im r03 = this.A01;
        if (r03 != null && (A084 = LWD.A08(r302)) != null) {
            LWD.A07(r03, A084, 1, 0);
        }
        5Im r04 = this.A03;
        if (r04 != null && (A083 = LWD.A08(r302)) != null) {
            LWD.A07(r04, A083, 2, 0);
        }
        5Im r05 = this.A04;
        if (r05 != null && (A082 = LWD.A08(r302)) != null) {
            LWD.A07(r05, A082, 3, 0);
        }
        5Im r06 = this.A00;
        if (r06 == null || (A08 = LWD.A08(r302)) == null) {
            return;
        }
        LWD.A07(r06, A08, 5, 0);
        LWD.A07(r06, A08, 5, 1);
    }
}
