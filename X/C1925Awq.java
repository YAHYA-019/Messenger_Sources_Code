package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Awq, reason: case insensitive filesystem */
/* loaded from: Awq.class */
public final class C1925Awq extends 1LH {
    public final B5G A00;
    public final MigColorScheme A01;

    public C1925Awq(B5G b5g, MigColorScheme migColorScheme) {
        this.A01 = migColorScheme;
        this.A00 = b5g;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C2sn A0L = 7zR.A0L(c2k5);
        C1781AsF c1781AsF = this.A00.A02;
        int i = c1781AsF.A01;
        String valueOf = i > 99 ? "99+" : String.valueOf(i);
        1Iw AeS = A0L.AeS();
        55N A00 = 55M.A00(AeS);
        AnonymousClass557 A0p = 7zL.A0p();
        A0p.A00 = 4105758463L;
        7zU.A1S(A0p, A0L, 2131963175);
        A0p.A01();
        A0p.A07(3yH.A0A(A0L, valueOf, 2131963176));
        MigColorScheme migColorScheme = this.A01;
        A0p.A05(migColorScheme);
        float A04 = 3yG.A04(4YU.A0C(AeS.A0D), 10.0f);
        int B9e = migColorScheme.B9e();
        int i2 = c1781AsF.A00;
        float f = A04;
        if (i2 > 0) {
            f = 0.0f;
        }
        A0p.A02(new AnonymousClass580(B9e, A04, f));
        ImmutableList.Builder builder = ImmutableList.builder();
        C1u3 c1u3 = C1u3.A1a;
        C1u4 c1u4 = C1u4.SIZE_24;
        C1ut c1ut = C1ut.A0B;
        7zP.A1S(c1u3, c1u4, c1ut);
        builder.m11011add((Object) new 5AM(c1u3, c1u4, c1ut, migColorScheme, (CharSequence) null));
        A0p.A06(1Fj.A01(builder));
        A0p.A0B = Integer.valueOf(2RH.A07.A00());
        AbG.A1Q(A00, A0p);
        2RH r0 = 2RH.A03;
        7zO.A1K(A00, r0);
        7zO.A1N(A00, new DDq(A0L, this, 2));
        A00.A1n(new 3vS(new DD4(this, 25), (Object[]) null, -1));
        A0L.A00(A00.A2W());
        if (i2 > 0) {
            55N A002 = 55M.A00(AeS);
            LightColorScheme.A00();
            A002.A2X(new 55Y(migColorScheme, 0, 0, 0, 0));
            7zO.A1K(A002, r0);
            A0L.A00(A002.A2W());
        }
        return new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0L.A01, false);
    }
}
