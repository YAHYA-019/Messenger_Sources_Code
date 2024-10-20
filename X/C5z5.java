package X;

import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;

/* renamed from: X.5z5, reason: invalid class name */
/* loaded from: 5z5.class */
public final class C5z5 extends C1rj {
    public static final 2K8 A09 = 2K5.A04;
    public int A00;
    public View.OnClickListener A01;
    public View.OnLongClickListener A02;
    public 2K8 A03;
    public MigColorScheme A04;
    public CharSequence A05;
    public CharSequence A06;
    public CharSequence A07;
    public boolean A08;

    public C5z5() {
        super("MigSectionHeader");
        this.A00 = 1;
        this.A03 = A09;
    }

    public static 8TR A00(1Iw r301) {
        return new 8TR(r301, new C5z5());
    }

    public final Object[] A0k() {
        return new Object[]{this.A05, this.A01, Boolean.valueOf(this.A08), this.A02, this.A04, this.A06, Integer.valueOf(this.A00), this.A03, this.A07};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        B11 A2W;
        final MigColorScheme migColorScheme = this.A04;
        final CharSequence charSequence = this.A07;
        CharSequence charSequence2 = this.A05;
        CharSequence charSequence3 = this.A06;
        boolean z = this.A08;
        final 2K8 r0 = this.A03;
        final int i = this.A00;
        if (1JF.A0B(charSequence2)) {
            A2W = null;
        } else {
            AwU A01 = B11.A01(r302);
            A01.A2Z(charSequence2);
            B11 b11 = A01.A01;
            b11.A05 = z;
            A01.A2Y(migColorScheme);
            Integer num = 0S2.A01;
            A01.A2X(1LI.A02(r302, C5z5.class, num, "MigSectionHeader", (Object[]) null, 2036748691));
            b11.A01 = 1LI.A02(r302, C5z5.class, num, "MigSectionHeader", (Object[]) null, 1330268919);
            b11.A03 = charSequence3;
            A2W = A01.A2W();
        }
        final B11 b112 = A2W;
        return new 1LH(r0, b112, migColorScheme, charSequence, i) { // from class: X.5z9
            public final int A00;
            public final 2K8 A01;
            public final 1LI A02;
            public final MigColorScheme A03;
            public final CharSequence A04;

            {
                11T.A0F(migColorScheme, 1);
                11T.A0F(charSequence, 2);
                11T.A0F(r0, 4);
                this.A03 = migColorScheme;
                this.A04 = charSequence;
                this.A02 = b112;
                this.A01 = r0;
                this.A00 = i;
            }

            public 1LI A0s(C2k5 c2k5) {
                11T.A0F(c2k5, 0);
                2lQ r02 = 2lO.A02;
                Integer num2 = 0S2.A00;
                2lO r03 = new 2lO(new 2lO(new 2lO(new 2lO(new 2lO((2lO) null, new C82m(num2, 100.0f, 0)), new C02963wp(0S2.A0Y, Double.doubleToRawLongBits(48.0d))), new C02963wp(0S2.A15, Double.doubleToRawLongBits(6.0d))), new C5z8(num2, true)), new C2xi(0S2.A0u, true, 1));
                C2sn c2sn = new C2sn(c2k5.A05, new ArrayList());
                1Iw r04 = c2sn.A00;
                2KD A012 = 2K3.A01(r04, 0);
                A012.A2x(this.A03);
                A012.A2z(this.A04);
                A012.A2y(2KE.A03);
                A012.A2w(((C1pD) 1Bi.A03(66708)).A00() ? C1u7.A0A : C1u7.A0C);
                A012.A2q(this.A00);
                A012.A01.A0A = this.A01;
                A012.A0j(1.0f);
                C1ro c1ro = C1ro.CENTER;
                A012.A1y(c1ro);
                A012.A24(C26z.HORIZONTAL, 2RH.A03.A00());
                c2sn.A00(A012.A2W());
                1LI r05 = this.A02;
                if (r05 != null) {
                    2lO r06 = new 2lO(new 2lO(new 2lO((2lO) null, new C82m(0S2.A0N, 34.0f, 0)), new C2xi(num2, c1ro, 0)), new 2lT(0S2.A0C, 0.0f));
                    C2sn c2sn2 = new C2sn(r04, new ArrayList());
                    c2sn2.A00(r05);
                    c2sn.A00(C2so.A0A(c2sn2, c2sn, r06, null, null, null, null, false));
                }
                return C2so.A0U(c2sn, c2k5, r03, null, null, null, null, false);
            }
        };
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i == 1330268919) {
            1Is r0 = r302.A00.A01;
            View view = ((C03173xD) obj).A00;
            C5z5 c5z5 = (C5z5) r0;
            View.OnLongClickListener onLongClickListener = c5z5.A02;
            return Boolean.valueOf((onLongClickListener == null || !c5z5.A08) ? false : onLongClickListener.onLongClick(view));
        }
        if (i != 2036748691) {
            return null;
        }
        1Is r02 = r302.A00.A01;
        View view2 = ((3xC) obj).A00;
        C5z5 c5z52 = (C5z5) r02;
        View.OnClickListener onClickListener = c5z52.A01;
        boolean z = c5z52.A08;
        if (onClickListener == null || !z) {
            return null;
        }
        onClickListener.onClick(view2);
        return null;
    }
}
