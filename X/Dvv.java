package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;

/* loaded from: Dvv.class */
public final class Dvv extends 1LH {
    public final C97h A00;
    public final C97h A01;
    public final Integer A02;
    public final int A03 = 1;
    public final int A04;
    public final 2lO A05;
    public final Integer A06;
    public final String A07;
    public final C00m A08;
    public final boolean A09;

    public Dvv(2lO r302, C97h c97h, C97h c97h2, Integer num, Integer num2, String str, C00m c00m, int i, boolean z) {
        this.A00 = c97h;
        this.A07 = str;
        this.A06 = num;
        this.A02 = num2;
        this.A04 = i;
        this.A09 = z;
        this.A08 = c00m;
        this.A01 = c97h2;
        this.A05 = r302;
    }

    public 1LI A0s(C2k5 c2k5) {
        GradientDrawable gradientDrawable;
        11T.A0F(c2k5, 0);
        Drawable A00 = EZ3.A00(c2k5, new G9H(c2k5, this, 32), new Object[]{this.A00, this.A02, this.A01});
        Integer num = this.A06;
        if (num != null) {
            int intValue = num.intValue();
            int i = this.A04;
            int i2 = this.A03;
            gradientDrawable = 7zO.A0G(0);
            gradientDrawable.setColor(intValue);
            gradientDrawable.setStroke(7zS.A01(c2k5, i2), 0);
            gradientDrawable.setCornerRadius(7zS.A01(c2k5, i));
        } else {
            gradientDrawable = null;
        }
        boolean z = this.A09;
        float f = 1.0f;
        if (!z) {
            f = 0.3f;
        }
        2lO r0 = 2lO.A02;
        2lO A0L = 4YV.A0L(7zL.A0g((2lO) null, new C6na(0S2.A1G, 7zP.A09())), 0S2.A0F, Boolean.valueOf(z), 1);
        String str = this.A07;
        if (str != null) {
            A0L = 7zS.A0d(A0L, str);
        }
        Integer num2 = 0S2.A00;
        2lO A0L2 = 4YV.A0L(A0L, num2, gradientDrawable, 1);
        Integer num3 = 0S2.A01;
        2lO A002 = 32E.A00(7zR.A0Q(A0L2, num3, "android.widget.Button"), f);
        C00m c00m = this.A08;
        if (c00m == null || !z) {
            2lO A003 = A002.A00(this.A05);
            C2sn A0U = 7zQ.A0U(c2k5.AeS());
            A0U.A00(new DwQ(A00, ImageView.ScaleType.CENTER_CROP, (2lO) null, 0, false));
            return C2so.A0M(A0U, c2k5, A003);
        }
        C2sn A0U2 = 7zQ.A0U(c2k5.AeS());
        A0U2.A00(new DwQ(A00, ImageView.ScaleType.CENTER_CROP, (2lO) null, 0, false));
        C1rh A0M = C2so.A0M(A0U2, c2k5, A002);
        ACE ace = new ACE(num2, 0S2.A0C, num3);
        2lO r307 = this.A05;
        if (r307 == null) {
            r307 = r0;
        }
        return new DvW(A0M, r307, ace, c00m, (C00m) null);
    }
}
