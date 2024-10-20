package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Awp, reason: case insensitive filesystem */
/* loaded from: Awp.class */
public final class C1924Awp extends 1LH {
    public final B5G A00;
    public final MigColorScheme A01;

    public C1924Awp(B5G b5g, MigColorScheme migColorScheme) {
        this.A01 = migColorScheme;
        this.A00 = b5g;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        55N A00 = 55M.A00(c2k5.A05);
        AnonymousClass557 A0p = 7zL.A0p();
        A0p.A00 = 4246689940L;
        7zU.A1S(A0p, c2k5, 2131963174);
        A0p.A01();
        C1781AsF c1781AsF = this.A00.A02;
        A0p.A07(3yH.A0A(c2k5, Integer.valueOf(c1781AsF.A00), 2131963176));
        MigColorScheme migColorScheme = this.A01;
        A0p.A05(migColorScheme);
        A0p.A02(new AnonymousClass580(migColorScheme.B9e(), c1781AsF.A01 > 0 ? 0.0f : 3yG.A04(4YU.A0C(r0.A0D), 10.0f), 3yG.A04(4YU.A0C(r0.A0D), 10.0f)));
        ImmutableList.Builder builder = ImmutableList.builder();
        C1u3 c1u3 = C1u3.A1a;
        C1u4 c1u4 = C1u4.SIZE_24;
        C1ut c1ut = C1ut.A0B;
        7zP.A1S(c1u3, c1u4, c1ut);
        builder.m11011add((Object) new 5AM(c1u3, c1u4, c1ut, migColorScheme, (CharSequence) null));
        A0p.A06(1Fj.A01(builder));
        A0p.A0B = Integer.valueOf(2RH.A07.A00());
        AbG.A1Q(A00, A0p);
        7zO.A1K(A00, 2RH.A03);
        7zO.A1N(A00, new DDq(c2k5, this, 1));
        A00.A1n(new 3vS(new DD4(this, 24), (Object[]) null, -1));
        return A00.A2W();
    }
}
