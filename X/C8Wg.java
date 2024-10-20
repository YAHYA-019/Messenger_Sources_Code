package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.8Wg, reason: invalid class name */
/* loaded from: 8Wg.class */
public final class C8Wg extends 1LH {
    public final C97h A00;
    public final CharSequence A01;

    public C8Wg(C97h c97h, CharSequence charSequence) {
        1BL.A1F(c97h, charSequence);
        this.A00 = c97h;
        this.A01 = charSequence;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        Aaq A00 = C9kH.A00(F2c.A00(c2k5));
        Drawable A002 = EZ3.A00(c2k5, new G9H(c2k5, this, 31), new Object[]{this.A00});
        2lQ r0 = 2lO.A02;
        2lO A0K = 4YV.A0K(4YV.A0K((2lO) null, 0S2.A0E, 7zU.A08(A00, 0S2.A0V)), 0S2.A0F, 7zP.A0F());
        C2sn A0L = 7zR.A0L(c2k5);
        long A0H = 7zP.A0H();
        Integer num = 0S2.A00;
        A0L.A00(new DwQ(A002, ImageView.ScaleType.CENTER_INSIDE, 7zT.A0i((2lO) null, num, A0H), 0, false));
        2lO A0L2 = 4YV.A0L(4YV.A0K((2lO) null, 0S2.A0B, 7zQ.A08()), num, C1ro.CENTER, 0);
        C2sn A0K2 = 7zS.A0K(A0L);
        CharSequence charSequence = this.A01;
        Integer num2 = 0S2.A03;
        C97i c97i = C97i.A03;
        long A07 = 7zQ.A07();
        7zQ.A1E(new Dw8(null, ELv.A07, c97i, charSequence, num2, 0, A07, A07), A0K2, A0L, A0L2);
        return C2so.A0I(A0L, c2k5, A0K);
    }
}
