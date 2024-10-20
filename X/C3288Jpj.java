package X;

/* renamed from: X.Jpj, reason: case insensitive filesystem */
/* loaded from: Jpj.class */
public final class C3288Jpj extends LWD {
    public 5Im A00;
    public 5Im A01;

    public void Beo(5IO r302) {
        5IW[] A08;
        5IW r0;
        5IW[] A082;
        5IW r02;
        11T.A0F(r302, 0);
        5Im r03 = this.A01;
        if (r03 != null && (A082 = LWD.A08(r302)) != null && (r02 = A082[0]) != null) {
            LWD.A06(r03, r02.A0x, 0);
        }
        5Im r04 = this.A00;
        if (r04 == null || (A08 = LWD.A08(r302)) == null) {
            return;
        }
        LWD.A07(r04, A08, 1, 0);
        5IW r05 = A08[1];
        if (r05 != null) {
            5IW[] r06 = r05.A0x;
            LWD.A06(r04, r06, 1);
            if (r06 == null || (r0 = r06[2]) == null) {
                return;
            }
            r0.A0S = r04;
        }
    }
}
