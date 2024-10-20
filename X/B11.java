package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.text.Layout;
import android.util.TypedValue;
import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: B11.class */
public final class B11 extends C1rj {
    public 1Im A00;
    public 1Im A01;
    public MigColorScheme A02;
    public CharSequence A03;
    public CharSequence A04;
    public boolean A05;
    public static final 2KV A07 = 2KV.A04;
    public static final 2KV A06 = 2KV.A06;

    public B11() {
        super("MigSectionHeaderCTA");
        this.A05 = true;
    }

    public static final 3yF A00(1Iw r301, 2KV r302, CharSequence charSequence, int i) {
        3yF A0v = 7zM.A0v(r301, charSequence, 0);
        A0v.A2x(i);
        A0v.A35(Layout.Alignment.ALIGN_OPPOSITE);
        A0v.A39(2K4.A03);
        A0v.A34(2KQ.A03.A00(7zL.A0A(r301)));
        A0v.A32(r302.textSizeResId);
        A0v.A2u(2);
        A0v.A2a();
        return A0v;
    }

    public static AwU A01(1Iw r301) {
        return new AwU(r301, new B11());
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A02, this.A03, Boolean.valueOf(this.A05), this.A01, this.A04, null};
    }

    public boolean A0o() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [X.23P, java.lang.Object] */
    @Override // X.C1rj
    public 1LI A0z(1Iw r302, int i, int i2) {
        CharSequence charSequence = this.A04;
        1Im r0 = this.A00;
        MigColorScheme migColorScheme = this.A02;
        boolean z = this.A05;
        1Im r02 = this.A01;
        CharSequence charSequence2 = this.A03;
        1BL.A11(0, r302, charSequence, r0);
        11T.A0F(migColorScheme, 5);
        int size = View.MeasureSpec.getSize(i);
        Resources A0E = 4YU.A0E(r302);
        int dimensionPixelSize = size - (A0E.getDimensionPixelSize(2132279314) * 2);
        ?? obj = new Object();
        2KV r320 = A06;
        2KZ A2W = A00(r302, r320, charSequence, 0).A2W();
        int i3 = (-1) << (-1);
        float f = -0.0f;
        A2W.A0c(r302, (C23P) obj, View.MeasureSpec.makeMeasureSpec(size, i3), View.MeasureSpec.makeMeasureSpec(0, 0));
        int i4 = obj.A01;
        if (charSequence.length() != 0 && i4 > dimensionPixelSize) {
            r320 = A07;
        }
        2KV r03 = A07;
        boolean z2 = true;
        if (r03 == r320) {
            int dimensionPixelSize2 = A0E.getDimensionPixelSize(r03.textSizeResId) * 2;
            A00(r302, r03, charSequence, 0).A2W().A0c(r302, (C23P) obj, View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, i3), View.MeasureSpec.makeMeasureSpec(0, 0));
            if (obj.A00 >= dimensionPixelSize2) {
                z2 = false;
            }
        }
        11T.A0F(r320, 1);
        C6pe c6pe = new C6pe();
        c6pe.A02(migColorScheme.Atv());
        c6pe.A00.put(-16842910, migColorScheme.Ahv());
        ColorStateList A01 = c6pe.A01();
        11T.A0D(A01);
        int dimensionPixelSize3 = A0E.getDimensionPixelSize(2132279321);
        int colorForState = A01.getColorForState(z ? BZz.A01 : BZz.A00, 0);
        C1rq A00 = C1rg.A00(r302);
        3yF A002 = A00(r302, r320, charSequence, colorForState);
        A002.A0L();
        A002.A0S();
        A002.A2U(z);
        int i5 = 2132411147;
        if (z) {
            i5 = 2132411146;
        }
        A002.A1I(i5);
        A002.A0P();
        4YU.A1L(A002, 2RH.A06);
        if (!z2) {
            dimensionPixelSize3 += (int) TypedValue.applyDimension(1, 12.0f, A0E.getDisplayMetrics());
        }
        A002.A1L(dimensionPixelSize3);
        A002.A2T(r0);
        A002.A1q(r02);
        A002.A2S(charSequence2);
        7zL.A1J(A002);
        A00.A2e(A002);
        C1rh c1rh = A00.A00;
        11T.A0A(c1rh);
        return c1rh;
    }
}
