package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8gv, reason: invalid class name */
/* loaded from: 8gv.class */
public final class C8gv extends 1LH {
    public final float A00;
    public final 2MQ A01;
    public final 6tM A02;
    public final C1ro A03;
    public final Integer A04;
    public final Function1 A05;
    public final int A06;

    public C8gv(2MQ r302, 6tM r303, C1ro c1ro, Integer num, Function1 function1, float f) {
        1BL.A11(1, r303, r302, function1);
        this.A02 = r303;
        this.A06 = 2131952676;
        this.A01 = r302;
        this.A05 = function1;
        this.A04 = num;
        this.A00 = f;
        this.A03 = c1ro;
    }

    private final C1rh A01(Drawable drawable, Drawable drawable2, C2k6 c2k6) {
        1Iw AeS = c2k6.AeS();
        C2cm A00 = C2cl.A00(AeS);
        A00.A10(74.0f);
        A00.A0j(1.0f);
        A00.A0f(1.0f);
        A00.A2b(drawable2);
        A00.A0F("android.widget.ImageView");
        A00.A1J(this.A06);
        A00.A2X(this.A02.A00(0S2.A0P));
        A00.A2c(ImageView.ScaleType.FIT_XY);
        C2cl A09 = 7zN.A09(A00);
        2lQ r0 = 2lO.A02;
        return C2so.A0V(7zS.A0H(A09, AeS), c2k6, 7zS.A0b(7zQ.A0X(C82m.A06(0S2.A01, 74.0f, 0), 0S2.A0Y, 1.0f), 0S2.A00, drawable), C1ro.FLEX_START, C1rp.CENTER);
    }

    public 1LI A0s(C2k5 c2k5) {
        C1rh A01;
        11T.A0F(c2k5, 0);
        6tM r0 = this.A02;
        Drawable drawable = (Drawable) 2rO.A00(c2k5, new AKL(this, 49), new Object[]{r0});
        Drawable drawable2 = (Drawable) AQY.A00(c2k5, this, new Object[0], 0);
        Integer num = this.A04;
        if (num != null) {
            11T.A0D(drawable2);
            2lQ r02 = 2lO.A02;
            2lO A0X = 7zQ.A0X(7zL.A0g((2lO) null, C82m.A08(0S2.A00, this.A00, 0)), 0S2.A0Y, 1.0f);
            C2sn A0L = 7zR.A0L(c2k5);
            A0L.A00(A01(drawable, drawable2, A0L));
            Integer num2 = 0S2.A01;
            2lO A04 = C82m.A04(null, num2, 26.0f, 0);
            C1ro c1ro = C1ro.FLEX_END;
            C1rp c1rp = C1rp.CENTER;
            C2sn A0J = 7zS.A0J(A0L);
            1Iw r03 = A0J.A00;
            3yF A0L2 = 2KZ.A0L(r03, 0);
            A0L2.A3A(r03.A08(num.intValue()));
            A0L2.A2f();
            A0L2.A2x(r0.A00(0S2.A0b));
            A0L2.A34(2KU.A01(r03.A0D, num2));
            A0L2.A2s(12.0f);
            A0L2.A17(4.0f);
            A0J.A00(A0L2.A2W());
            A01 = 7zN.A0N(C2so.A0V(A0J, A0L, A04, c1ro, c1rp), A0L, c2k5, A0X);
        } else {
            11T.A0D(drawable2);
            A01 = A01(drawable, drawable2, c2k5);
        }
        return EWB.A00(c2k5, (2lO) null, new AW6(A01, this, 35));
    }
}
