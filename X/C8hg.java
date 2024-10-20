package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8hg, reason: invalid class name */
/* loaded from: 8hg.class */
public final class C8hg extends 1LH {
    public static final 2lO A02;
    public static final 2lO A03;
    public final AYJ A00;
    public final boolean A01;

    static {
        2lQ r0 = 2lO.A02;
        A02 = 7zT.A0M((2lO) null, 10.0d);
        A03 = 7zT.A0R((2lO) null, 7zQ.A08(), 7zP.A0A());
    }

    public C8hg(AYJ ayj, boolean z) {
        this.A01 = z;
        this.A00 = ayj;
    }

    public static final 2KZ A01(C2k6 c2k6, 2lO r302, int i, int i2) {
        1Iw AeS = c2k6.AeS();
        CharSequence A08 = AeS.A08(i);
        long A0A = 7zP.A0A();
        2lQ r0 = 2lO.A02;
        2lO A00 = 4YV.A0L(7zS.A0f(0S2.A01, 1.0f), 0S2.A00, C1ro.CENTER, 0).A00(r302);
        Typeface typeface = Typeface.DEFAULT;
        long A082 = 7zP.A08();
        3yF A0v = 7zM.A0v(AeS, A08, 0);
        A0v.A2x(i2);
        7zQ.A1L(A0v, c2k6.B7k(), 0, A0A);
        A0v.A34(typeface);
        7zV.A10(A0v, c2k6, A082);
        A0v.A2q(1.0f);
        A0v.A3D(false);
        A0v.A2v(0);
        A0v.A2u(1);
        7zS.A1V(A0v, false);
        return 7zQ.A0c(A00, A0v);
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        1Iw r0 = c2k5.A05;
        MigColorScheme migColorScheme = (MigColorScheme) 7zQ.A12(r0, 16979);
        2lQ r02 = 2lO.A02;
        Integer num = 0S2.A01;
        2lO A0g = 7zL.A0g((2lO) null, 7zO.A0X(num));
        long doubleToRawLongBits = Double.doubleToRawLongBits(250.0d);
        Integer num2 = 0S2.A00;
        2lO A0K = 4YV.A0K(A0g, num2, doubleToRawLongBits);
        boolean z = this.A01;
        2lO A0K2 = 4YV.A0K(A0K, num, !z ? Double.doubleToRawLongBits(154.0d) : Double.doubleToRawLongBits(198.0d));
        Drawable mutate = new GradientDrawable().mutate();
        11T.A0I(mutate, DKB.A00(17));
        GradientDrawable gradientDrawable = (GradientDrawable) mutate;
        gradientDrawable.setColors(new int[]{migColorScheme.Awo(), migColorScheme.Awo()});
        gradientDrawable.setCornerRadius(20.0f);
        2lO A00 = A0K2.A00(4YV.A0L((2lO) null, num2, gradientDrawable, 1));
        C2sn A0U = 7zQ.A0U(r0);
        C1u2 A0I = 4YV.A0I();
        C2sn A0U2 = 7zQ.A0U(r0);
        2lO r03 = A02;
        AV3 A002 = AV3.A00(this, 35);
        Integer num3 = 0S2.A1G;
        2lO A003 = r03.A00(4YV.A0L((2lO) null, num3, A002, 1));
        1Iw r04 = A0U2.A00;
        C2sn A0U3 = 7zQ.A0U(r04);
        int B4i = migColorScheme.B4i();
        2lO r05 = A03;
        A0U3.A00(A01(A0U3, r05, 2131963216, B4i));
        1Iw r06 = A0U3.A00;
        C1u3 c1u3 = C1u3.A4n;
        int B4i2 = migColorScheme.B4i();
        C2cm A004 = C2cl.A00(r06);
        7zN.A18(A004, c1u3, A0I);
        A004.A0j(0.0f);
        A004.A2X(B4i2);
        A004.A0L();
        7zQ.A1F(7zN.A09(A004), A0U3, A0U2, A003);
        2lO A005 = r03.A00(4YV.A0L((2lO) null, num3, AV3.A00(this, 36), 1));
        C2sn A0U4 = 7zQ.A0U(r04);
        A0U4.A00(A01(A0U4, r05, 2131963219, migColorScheme.B4i()));
        1Iw r07 = A0U4.A00;
        C1u3 c1u32 = C1u3.A4K;
        int B4i3 = migColorScheme.B4i();
        C2cm A006 = C2cl.A00(r07);
        7zN.A18(A006, c1u32, A0I);
        A006.A0j(0.0f);
        A006.A2X(B4i3);
        A006.A0L();
        7zQ.A1F(7zN.A09(A006), A0U4, A0U2, A005);
        if (z) {
            2lO A007 = r03.A00(4YV.A0L((2lO) null, num3, AV3.A00(this, 37), 1));
            C2sn A0U5 = 7zQ.A0U(r04);
            A0U5.A00(A01(A0U5, r05, 2131963218, migColorScheme.B4i()));
            1Iw r08 = A0U5.A00;
            int B4i4 = migColorScheme.B4i();
            C2cm A008 = C2cl.A00(r08);
            7zN.A18(A008, c1u3, A0I);
            A008.A0j(0.0f);
            A008.A2X(B4i4);
            A008.A0L();
            7zQ.A1F(7zN.A09(A008), A0U5, A0U2, A007);
        }
        2lO A009 = r03.A00(4YV.A0L((2lO) null, num3, AV3.A00(this, 38), 1));
        C2sn A0U6 = 7zQ.A0U(r04);
        A0U6.A00(A01(A0U6, r05, 2131963217, migColorScheme.B4i()));
        1Iw r09 = A0U6.A00;
        C1u3 c1u33 = C1u3.A1u;
        int B4i5 = migColorScheme.B4i();
        C2cm A0010 = C2cl.A00(r09);
        7zN.A18(A0010, c1u33, A0I);
        A0010.A0j(0.0f);
        A0010.A2X(B4i5);
        A0010.A0L();
        7zQ.A1F(7zN.A09(A0010), A0U6, A0U2, A009);
        return 7zM.A0l(new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0U2.A01, false), A0U, c2k5, A00);
    }
}
