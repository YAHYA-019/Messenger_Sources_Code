package X;

import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.widget.ImageView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* renamed from: X.8bj, reason: invalid class name */
/* loaded from: 8bj.class */
public final class C8bj extends 1LH {
    public final int A00;
    public final ImmutableList A01;
    public final float A02;
    public final 2lO A03;
    public final MigColorScheme A04;
    public final String A05;

    public C8bj(2lO r302, MigColorScheme migColorScheme, ImmutableList immutableList, String str, float f, int i) {
        7zP.A1L(immutableList, 1, migColorScheme);
        this.A01 = immutableList;
        this.A03 = r302;
        this.A05 = str;
        this.A02 = f;
        this.A00 = i;
        this.A04 = migColorScheme;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        float f = this.A02;
        1Iw r0 = c2k5.A05;
        int applyDimension = (int) TypedValue.applyDimension(1, f, 7zQ.A0L(r0));
        2KE r02 = 2KE.A07;
        EnumC00743oh enumC00743oh = EnumC00743oh.WRAP;
        C1rp c1rp = C1rp.CENTER;
        2lQ r03 = 2lO.A02;
        2lO A0f = 7zS.A0f(0S2.A0C, 0.0f);
        String str = this.A05;
        if (str != null) {
            A0f = 7zS.A0d(A0f, str);
        }
        2lO A00 = A0f.A00(this.A03);
        C2sn A0U = 7zQ.A0U(r0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setSize(applyDimension, applyDimension);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setColors(0QD.A0n(this.A01));
        int i = this.A00;
        if (i != 0) {
            gradientDrawable.setStroke(2, i);
        }
        gradientDrawable.setCornerRadius(applyDimension / 2.0f);
        C2cq A0u = 7zM.A0u(gradientDrawable, A0U.AeS(), 0);
        A0u.A2b(ImageView.ScaleType.CENTER);
        7zN.A1O(A0U, A0u);
        if (str != null) {
            C2yv A002 = 2KF.A00(A0U.A00);
            A002.A2Y(str);
            A002.A2X(this.A04.B4i());
            2KQ A04 = 2KK.A04(r02);
            2KF r04 = A002.A01;
            r04.A0K = A04;
            r04.A02 = f / 2.0f;
            A002.A0c();
            A002.A0L();
            A0U.A00(A002.A2W());
        }
        return C2so.A0U(A0U, c2k5, A00, null, null, c1rp, enumC00743oh, false);
    }
}
