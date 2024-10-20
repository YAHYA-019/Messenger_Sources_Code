package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Axh, reason: case insensitive filesystem */
/* loaded from: Axh.class */
public final class C1952Axh extends 1LH {
    public final C1u3 A00;
    public final C1u3 A01;
    public final C5ww A02;
    public final MigColorScheme A03;
    public final String A04;
    public final String A05;

    public C1952Axh(C1u3 c1u3, C1u3 c1u32, C5ww c5ww, MigColorScheme migColorScheme, String str, String str2) {
        1BL.A1F(migColorScheme, str);
        this.A03 = migColorScheme;
        this.A05 = str;
        this.A04 = str2;
        this.A01 = c1u3;
        this.A00 = c1u32;
        this.A02 = c5ww;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        55N A00 = 55M.A00(c2k5.A05);
        C1u2 A0I = 4YV.A0I();
        AnonymousClass557 A0p = 7zL.A0p();
        MigColorScheme migColorScheme = this.A03;
        A0p.A05(migColorScheme);
        C1u3 c1u3 = this.A01;
        C1u4 c1u4 = C1u4.SIZE_32;
        A0p.A05 = AbK.A0d(migColorScheme, A0I.A04(c1u3, c1u4));
        A0p.A04(AnonymousClass558.MEDIUM);
        A0p.A08(this.A05);
        A0p.A07(this.A04);
        A0p.A01 = this.A02;
        C1u3 c1u32 = this.A00;
        if (c1u32 != null) {
            C1ut c1ut = C1ut.A0B;
            c1u4.getClass();
            c1ut.getClass();
            7zN.A1W(A0p, new 5AM(c1u32, c1u4, c1ut, migColorScheme, (CharSequence) null));
        }
        return 7zM.A10(AbG.A0q(A0p), A00);
    }
}
