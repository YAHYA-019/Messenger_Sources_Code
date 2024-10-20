package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* renamed from: X.8dr, reason: invalid class name */
/* loaded from: 8dr.class */
public final class C8dr extends 1LH {
    public final C9Z A00;
    public final AYB A01;
    public final MigColorScheme A02;
    public final ImmutableList A03;
    public final Integer A04;
    public final String A05;
    public final C00m A06;
    public final boolean A07;
    public final boolean A08;

    public C8dr(C9Z c9z, AYB ayb, MigColorScheme migColorScheme, ImmutableList immutableList, Integer num, String str, C00m c00m, boolean z, boolean z2) {
        11T.A0F(migColorScheme, 3);
        this.A03 = immutableList;
        this.A05 = str;
        this.A02 = migColorScheme;
        this.A08 = z;
        this.A07 = z2;
        this.A01 = ayb;
        this.A00 = c9z;
        this.A04 = num;
        this.A06 = c00m;
    }

    public 1LI A0s(C2k5 c2k5) {
        C1ro c1ro;
        C2sn A0I;
        C8mg A2W;
        11T.A0F(c2k5, 0);
        boolean z = this.A08;
        if (!z) {
            ImmutableList immutableList = this.A03;
            if (immutableList == null) {
                c1ro = C1ro.CENTER;
                A0I = 7zS.A0I(c2k5);
                2KD A0Y = 7zN.A0Y(A0I.A00, false);
                7zP.A1K(A0Y, 2131957317);
                A0Y.A2x(this.A02);
                A0Y.A2X();
                A0Y.A1y(c1ro);
                A2W = A0Y.A2W();
            } else if (immutableList.size() <= 0) {
                c1ro = C1ro.CENTER;
                A0I = 7zS.A0I(c2k5);
                8T6 A00 = C8mg.A00(A0I.A00);
                A00.A2X(this.A02);
                String str = this.A05;
                if (str == null) {
                    str = "";
                }
                A00.A2Y(str);
                C8mg c8mg = A00.A01;
                c8mg.A05 = true;
                c8mg.A01 = this.A01;
                A00.A1Z(2131165245);
                A2W = A00.A2W();
            }
            A0I.A00(A2W);
            return new 2cL((C1ro) null, c1ro, (C1rp) null, (EnumC00743oh) null, A0I.A01, false);
        }
        Integer num = this.A04;
        boolean A1T = AnonymousClass001.A1T(num);
        C2sn A0K = 7zR.A0K(c2k5.AeS());
        Integer num2 = 0S2.A01;
        2lO A04 = C82m.A04(null, num2, 100.0f, 0);
        9N0 r0 = new 9N0(AQV.A00(this, 18), 5);
        long A08 = 7zP.A08();
        2NI r02 = C8nc.A0O;
        1Iw r03 = A0K.A00;
        C02A c02a = r03.A03.A01;
        C1J8 c1j8 = c02a.A02;
        boolean z2 = c02a.A0X;
        C9sn A002 = C9sn.A00(r03);
        ImmutableList immutableList2 = this.A03;
        if (immutableList2 == null) {
            immutableList2 = 1BK.A0b();
        }
        C9sn.A04(A002, immutableList2, ATF.A00, AVp.A00);
        if (z) {
            7DF A003 = 7DD.A00(A002.A00);
            A003.A0J();
            C9sn.A01(A003.A01, A002, null);
        }
        A0K.A00(new C8ej(r02, null, null, A04, null, C9mj.A02(r03, c1j8, 7zN.A03(A0K, A08), z2), A002.A01, null, r0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true));
        if (A1T) {
            2lO A042 = C82m.A04(null, num2, 14.0f, 0);
            C2sn A0U = 7zQ.A0U(r03);
            7zQ.A1F(this.A00.A00(A0U.A00, num, num2), A0U, A0K, A042);
        }
        return new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0K.A01, false);
    }
}
