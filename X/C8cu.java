package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.ShapeDrawable;
import android.text.InputFilter;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8cu, reason: invalid class name */
/* loaded from: 8cu.class */
public final class C8cu extends 1LH {
    public final C2iw A00;
    public final Integer A01;
    public final C00m A02;
    public final float A03;
    public final 1Im A04;
    public final MigColorScheme A05;
    public final String A06;

    public C8cu(1Im r302, C2iw c2iw, MigColorScheme migColorScheme, Integer num, String str, C00m c00m) {
        7zP.A1L(c2iw, 2, str);
        this.A05 = migColorScheme;
        this.A00 = c2iw;
        this.A04 = r302;
        this.A01 = num;
        this.A02 = c00m;
        this.A06 = str;
        this.A03 = 44.0f;
    }

    public 1LI A0s(C2k5 c2k5) {
        ShapeDrawable A02;
        int i;
        String A0A;
        11T.A0F(c2k5, 0);
        2KE r0 = 2KE.A09;
        1Iw r02 = c2k5.A05;
        7ZF A01 = 6rU.A01(r02, 0);
        A01.A1w(this.A00);
        Integer num = this.A01;
        if (num != 0S2.A0C) {
            A02 = null;
        } else {
            A02 = C2cn.A02(7zS.A01(c2k5, 44.0d) / 2.0f, this.A05.AmV());
        }
        A01.A01.A0C = A02;
        A01.A0r(this.A03);
        A01.A2f(this.A04);
        A01.A1A(1.5f);
        A01.A25(C26z.START, 16.0f);
        A01.A25(C26z.END, 16.0f);
        if (num == 0S2.A01) {
            i = 2131963935;
        } else {
            if (num == 0S2.A00) {
                String str = this.A06;
                if (str.length() > 0) {
                    A0A = 3yH.A0A(c2k5, str, 2131966806);
                    A01.A2g(A0A);
                    A01.A2Z(6);
                    A01.A2k(true);
                    A01.A2d(new InputFilter.LengthFilter(5000));
                    A01.A2Y(16385);
                    A01.A01.A02 = 4;
                    A01.A2c(ColorStateList.valueOf(this.A05.B4i()));
                    A01.A2X(7zN.A00(r0));
                    A01.A01.A0B = 7zP.A0M(r02, 2KK.A04(r0));
                    A01.A0R();
                    7zO.A1O(A01, 83U.A01(c2k5, this, 4));
                    A01.A01.A0K = 7zL.A0a(new AR2(this, 45));
                    return 7zR.A0T(A01);
                }
            }
            i = 2131964653;
        }
        A0A = 3yH.A09(c2k5, i);
        A01.A2g(A0A);
        A01.A2Z(6);
        A01.A2k(true);
        A01.A2d(new InputFilter.LengthFilter(5000));
        A01.A2Y(16385);
        A01.A01.A02 = 4;
        A01.A2c(ColorStateList.valueOf(this.A05.B4i()));
        A01.A2X(7zN.A00(r0));
        A01.A01.A0B = 7zP.A0M(r02, 2KK.A04(r0));
        A01.A0R();
        7zO.A1O(A01, 83U.A01(c2k5, this, 4));
        A01.A01.A0K = 7zL.A0a(new AR2(this, 45));
        return 7zR.A0T(A01);
    }
}
