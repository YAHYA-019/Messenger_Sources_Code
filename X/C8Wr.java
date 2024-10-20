package X;

/* renamed from: X.8Wr, reason: invalid class name */
/* loaded from: 8Wr.class */
public final class C8Wr extends 1LH {
    public final C00m A00;
    public final 5zD A01;
    public final boolean A02;

    public C8Wr(5zD r302, C00m c00m, boolean z) {
        this.A01 = r302;
        this.A02 = z;
        this.A00 = c00m;
    }

    public 1LI A0s(C2k5 c2k5) {
        long A06;
        long A08;
        11T.A0F(c2k5, 0);
        boolean z = this.A02;
        C1ro c1ro = z ? C1ro.FLEX_END : C1ro.FLEX_START;
        2lQ r0 = 2lO.A02;
        Integer num = 0S2.A00;
        2lO A0g = 7zL.A0g((2lO) null, 7zL.A0u(num, c1ro, 0));
        if (z) {
            A06 = 7zP.A08();
            A08 = 7zM.A08(c2k5);
        } else {
            A06 = 3yH.A06(c2k5, 2132279316);
            A08 = 7zP.A08();
        }
        2lO A0Z = 7zQ.A0Z(7zT.A0W(A0g, 7zM.A0q(A06), A08), num, new DD4(this, 26));
        C2sn A0L = 7zR.A0L(c2k5);
        2lO A0J = 7zT.A0J(7zT.A0M((2lO) null, 7zL.A00(2RH.A04)), -r0.A00());
        C2sn A0K = 7zS.A0K(A0L);
        2KD A0r = 7zL.A0r(A0K, 0);
        7zN.A1V(this.A01, A0r);
        7zM.A1X(A0r, A0K, 2131957858);
        A0r.A2d();
        A0r.A2i();
        7zO.A1E(A0r, 2RH.A07);
        7zS.A1O(A0K, A0L, A0J, A0r);
        return C2so.A0B(A0L, c2k5, A0Z, c1ro, null);
    }
}
