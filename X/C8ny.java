package X;

import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8ny, reason: invalid class name */
/* loaded from: 8ny.class */
public final class C8ny extends C1rj {
    public int A00;
    public int A01;
    public Drawable A02;
    public View.OnClickListener A03;
    public 1LI A04;
    public 8Ay A05;
    public 5Aw A06;
    public C1p8 A07;
    public C1p8 A08;
    public C1p8 A09;
    public C1p8 A0A;
    public C1p8 A0B;
    public C1p8 A0C;
    public MigColorScheme A0D;
    public CharSequence A0E;
    public boolean A0F;
    public static final C1p8 A0J = 2cQ.A04;
    public static final C1p8 A0I = C1u7.A04;
    public static final 5Aw A0H = 5Aw.A02;
    public static final 8Ay A0G = 8Ay.A02;

    public C8ny() {
        super("MigFilledLargeTintableButton");
        this.A05 = A0G;
        this.A07 = A0J;
        this.A08 = A0I;
        this.A0F = true;
        this.A01 = 28;
        this.A06 = A0H;
    }

    public static 8TY A00(1Iw r301) {
        return new 8TY(r301, new C8ny());
    }

    public final Object[] A0k() {
        return new Object[]{this.A05, this.A0D, this.A07, this.A08, Boolean.valueOf(this.A0F), this.A02, Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A04, this.A03, this.A09, this.A0A, this.A0B, this.A0C, this.A06, null, this.A0E};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C8ny c8ny = (C8ny) super.A0l();
        c8ny.A04 = 4YV.A0J(c8ny.A04);
        return c8ny;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        int A00;
        CharSequence charSequence = this.A0E;
        C1p8 c1p8 = this.A09;
        C1p8 c1p82 = this.A0B;
        C1p8 c1p83 = this.A0A;
        MigColorScheme migColorScheme = this.A0D;
        C1p8 c1p84 = this.A07;
        C1p8 c1p85 = this.A08;
        C1p8 c1p86 = this.A0C;
        Drawable drawable = this.A02;
        1LI r0 = this.A04;
        5Aw r02 = this.A06;
        int i = this.A01;
        int i2 = this.A00;
        boolean z = this.A0F;
        View.OnClickListener onClickListener = this.A03;
        8Ay r03 = this.A05;
        11T.A0F(r302, 0);
        1BL.A1H(charSequence, c1p8, c1p82);
        1BL.A1G(migColorScheme, c1p84);
        7zP.A1P(c1p85, 7, r02);
        11T.A0F(r03, 17);
        2KE r04 = 2KE.A03;
        2KE r05 = 2KE.A04;
        int A002 = C0A8.A00(7zL.A0A(r302), 16.0f);
        C5Ax A003 = 5Av.A00(r302);
        5Av r06 = A003.A01;
        r06.A00 = A002;
        A003.A0t(100.0f);
        A003.A2Z(48.0f);
        7zR.A1G(A003, 2RH.A03, charSequence);
        r06.A0D = Layout.Alignment.ALIGN_CENTER;
        r06.A01 = i2;
        r06.A0C = drawable;
        r06.A0F = 7zQ.A0T(r0);
        r06.A0G = r02;
        A003.A2b(i);
        A003.A2g(2KK.A03(r04));
        A003.A2h(2KK.A04(r04));
        r06.A0L = null;
        r06.A0H = 2KK.A03(r05);
        r06.A0J = 2KK.A04(r05);
        A003.A2k(false);
        A003.A2j(z);
        r06.A0E = onClickListener;
        if (!z || r02 == 5Aw.A03) {
            if (r03.ordinal() != 0) {
                throw 1BK.A1F();
            }
            float f = A002;
            if (r02 == 5Aw.A02) {
                A00 = migColorScheme.Chx(c1p84);
            } else {
                int Chx = migColorScheme.Chx(c1p8);
                int[] iArr = C2cn.A00;
                A00 = 0De.A00(Chx, 0.4f);
            }
            A003.A2f(C2cn.A02(f, A00));
            A003.A2e(migColorScheme.Chx(c1p85));
            r06.A07 = c1p86 != null ? migColorScheme.Chx(c1p86) : migColorScheme.Chx(c1p83);
        } else {
            if (r03.ordinal() != 0) {
                throw 1BK.A1F();
            }
            A003.A2f(7zN.A07(A002, migColorScheme.Chx(c1p8), migColorScheme.Chx(c1p82)));
            A003.A2e(migColorScheme.Chx(c1p83));
        }
        return A003.A2V();
    }
}
