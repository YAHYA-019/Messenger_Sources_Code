package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Axo, reason: case insensitive filesystem */
/* loaded from: Axo.class */
public final class C1959Axo extends 1LH {
    public final DI1 A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final MigColorScheme A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public C1959Axo(DI1 di1, MigColorScheme migColorScheme, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        1BL.A1F(migColorScheme, di1);
        this.A04 = migColorScheme;
        this.A00 = di1;
        this.A03 = z;
        this.A07 = z2;
        this.A06 = z3;
        this.A05 = z4;
        this.A02 = z5;
        this.A01 = z6;
    }

    public 1LI A0s(C2k5 c2k5) {
        55M r305;
        int i;
        11T.A0F(c2k5, 0);
        C2lh A00 = C2lc.A00(c2k5, new AKM(this, 11));
        55M r308 = null;
        C2sn A0U = 7zQ.A0U(c2k5.A05);
        if (this.A07) {
            55N A002 = 55M.A00(A0U.A00);
            AnonymousClass557 A0p = 7zL.A0p();
            A0p.A00 = 4040669277L;
            boolean z = this.A02;
            int i2 = 2131959377;
            if (z) {
                i2 = 2131966035;
            }
            7zU.A1S(A0p, c2k5, i2);
            boolean A1V = 7zP.A1V(A00);
            if (!this.A01) {
                i = 2131964432;
                if (A1V) {
                    i = 2131964433;
                }
            } else if (z) {
                i = 2131966037;
                if (A1V) {
                    i = 2131966038;
                }
            } else {
                i = 2131959389;
            }
            CJh.A02(A0p, 3yH.A09(c2k5, i));
            AbL.A15(A0p, this.A04, "ALLOW_MEMBERS_TO_MANAGE_REQUESTS_TOGGLE_ID", A1V);
            Cvm.A00(A0p, A00, this, 12);
            AbG.A1Q(A002, A0p);
            2lQ r0 = 2lO.A02;
            7zS.A1L(A002, (2lO) null, 0S2.A00, new DD4(this, 7));
            r305 = A002.A2W();
        } else {
            r305 = null;
        }
        A0U.A00(r305);
        if (this.A06) {
            55N A003 = 55M.A00(A0U.A00);
            String str = null;
            CZD czd = null;
            2K8 r02 = 2K5.A04;
            String A09 = 3yH.A09(A0U, 2131959387);
            MigColorScheme migColorScheme = this.A04;
            if (this.A05) {
                str = 3yH.A09(A0U, 2131959029);
                czd = CZD.A00(this, 62);
            }
            r308 = 7zM.A10(new C55c(czd, null, r02, migColorScheme, null, A09, str, null, null, 1, 0L, true), A003);
        }
        A0U.A00(r308);
        return new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0U.A01, false);
    }
}
