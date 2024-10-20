package X;

/* renamed from: X.Jpn, reason: case insensitive filesystem */
/* loaded from: Jpn.class */
public final class C3292Jpn extends LWD {
    public 5Im A00;
    public 5Im A01;
    public 5Im A02;

    public void Beo(5IO r302) {
        5IW[] A08;
        5IW[] A082;
        5IW[] A083;
        5IW r0;
        11T.A0F(r302, 0);
        5Im r02 = this.A02;
        if (r02 != null && (A083 = LWD.A08(r302)) != null && (r0 = A083[0]) != null) {
            LWD.A06(r02, r0.A0x, 0);
        }
        5Im r03 = this.A00;
        if (r03 != null && (A082 = LWD.A08(r302)) != null) {
            LWD.A07(r03, A082, 2, 0);
            5IW r04 = A082[2];
            if (r04 != null) {
                5IW[] r05 = r04.A0x;
                LWD.A06(r03, r05, 1);
                LWD.A06(r03, r05, 2);
            }
        }
        5Im r06 = this.A01;
        if (r06 == null || (A08 = LWD.A08(r302)) == null) {
            return;
        }
        LWD.A07(r06, A08, 3, 0);
        5IW r07 = A08[3];
        if (r07 != null) {
            5IW[] r08 = r07.A0x;
            LWD.A06(r06, r08, 1);
            LWD.A06(r06, r08, 2);
        }
    }
}
