package X;

import android.text.Layout;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.3v4, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3v4.class */
public final class C02413v4 extends C1rj {
    public 2MQ A00;
    public 2Re A01;
    public 1Im A02;
    public C83o A03;
    public C4Ux A04;
    public C1p8 A05;
    public C1p8 A06;
    public C1p8 A07;
    public C1p8 A08;
    public C1p8 A09;
    public C1p8 A0A;
    public MigColorScheme A0B;
    public String A0C;
    public boolean A0D;
    public static final C83o A0E = C83o.A02;
    public static final C1p8 A0G = C1ut.A0A;
    public static final C1p8 A0H = 2cR.A04;
    public static final C1p8 A0F = 2cQ.A08;

    public C02413v4() {
        super("MigIconButton");
        this.A03 = A0E;
        this.A0D = true;
        this.A08 = A0H;
        this.A0A = A0G;
    }

    public static C83g A00(1Iw r301) {
        return new C83g(r301, new C02413v4());
    }

    public final Object[] A0k() {
        return new Object[]{this.A0C, this.A03, this.A04, this.A02, this.A0B, Boolean.valueOf(this.A0D), this.A05, this.A06, this.A07, this.A08, this.A00, this.A01, this.A09, this.A0A};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        float f;
        C1p8 c3aH;
        2MQ r0 = this.A00;
        2Re r02 = this.A01;
        MigColorScheme migColorScheme = this.A0B;
        boolean z = this.A0D;
        C83o c83o = this.A03;
        String str = this.A0C;
        C4Ux c4Ux = this.A04;
        1Im r03 = this.A02;
        C1p8 c1p8 = this.A06;
        C1p8 c1p82 = this.A05;
        C1p8 c1p83 = this.A07;
        C1p8 c1p84 = this.A08;
        C1p8 c1p85 = this.A0A;
        C1p8 c1p86 = this.A09;
        11T.A0F(r302, 0);
        11T.A0F(r0, 1);
        11T.A0F(r02, 2);
        11T.A0F(migColorScheme, 3);
        11T.A0F(c83o, 5);
        11T.A0F(c1p84, 12);
        11T.A0F(c1p85, 13);
        C1u2 c1u2 = (C1u2) 1Bi.A03(16839);
        if (r0 == 2MQ.A1i) {
            throw new IllegalStateException("Check failed.");
        }
        2zB A00 = 2cP.A00(r302);
        A00.A2a(migColorScheme);
        A00.A2Y(c1u2.A02(r0, r02));
        int ordinal = r02.ordinal();
        if (ordinal == 0) {
            f = 24.0f;
        } else if (ordinal == 1) {
            f = 32.0f;
        } else if (ordinal == 2) {
            f = 36.0f;
        } else if (ordinal == 3) {
            f = 40.0f;
        } else {
            if (ordinal != 4) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported icon size: ");
                sb.append(r02);
                throw new IllegalArgumentException(sb.toString());
            }
            f = 62.0f;
        }
        A00.A2X(f);
        A00.A2b(z);
        if (c1p8 == null) {
            c1p8 = c83o == C83o.A04 ? C1ut.A0B : C1ut.A0A;
        }
        2cP r04 = A00.A01;
        r04.A04 = c1p8;
        if (c1p82 == null) {
            c1p82 = ((C1pD) 1Bi.A03(66708)).A00() ? C1ut.A07 : C1ut.A08;
        }
        r04.A03 = c1p82;
        if (c1p83 == null) {
            if (c83o == C83o.A04) {
                if (!z) {
                    throw new IllegalStateException("Check failed.");
                }
                c3aH = C1td.A0D;
            } else if (c83o == C83o.A02) {
                c1p83 = A0F;
            } else {
                C1p8 c1p87 = A0F;
                11T.A0F(c1p87, 0);
                c3aH = new C3aH(c1p87, C1p7.A0F);
            }
            c1p83 = c3aH;
        }
        r04.A05 = c1p83;
        r04.A06 = c1p84;
        r04.A08 = str;
        A00.A29(C26z.ALL, 2RH.A03.A00());
        A00.A2T(r03);
        C1rh A2W = A00.A2W();
        if (c4Ux != null) {
            if (c1p86 == null) {
                ((C1pD) 1Bi.A03(66708)).A00();
            }
            if (!c4Ux.A03) {
                2cM A01 = 2cK.A01(r302, (String) null, 0);
                A01.A2g(C1ro.CENTER);
                A01.A2e(A2W);
                C26z c26z = C26z.TOP;
                2KD A012 = 2K3.A01(r302, 0);
                A012.A2y(c4Ux.A01);
                A012.A2w(c1p85);
                A012.A2s(Layout.Alignment.ALIGN_CENTER);
                A012.A2x(migColorScheme);
                A012.A2z(c4Ux.A02);
                A012.A0z(60.0f);
                A012.A24(c26z, c4Ux.A00);
                A01.A2e(A012.A2W());
                A01.A1N(2);
                return A01.A00;
            }
            C1rq A013 = C1rg.A01(r302, null, 0);
            A013.A2i(C1rp.CENTER);
            boolean z2 = c4Ux.A04;
            A013.A00.A05 = z2;
            A013.A2h(C1ro.CENTER);
            A013.A2f(A2W);
            C26z c26z2 = z2 ? C26z.RIGHT : C26z.LEFT;
            2KD A014 = 2K3.A01(r302, 0);
            A014.A2y(c4Ux.A01);
            A014.A2w(c1p85);
            A014.A2s(Layout.Alignment.ALIGN_CENTER);
            A014.A2x(migColorScheme);
            A014.A2z(c4Ux.A02);
            A014.A0z(60.0f);
            A014.A24(c26z2, c4Ux.A00);
            A013.A2f(A014.A2W());
            A013.A1N(2);
            A2W = A013.A00;
        }
        return A2W;
    }
}
