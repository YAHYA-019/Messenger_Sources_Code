package X;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.ui.Alignment;

/* loaded from: L9h.class */
public abstract class L9h {
    public static final FillElement A00;
    public static final FillElement A01;
    public static final FillElement A02;
    public static final WrapContentElement A03;
    public static final WrapContentElement A04;
    public static final WrapContentElement A05;
    public static final WrapContentElement A06;
    public static final WrapContentElement A07;
    public static final WrapContentElement A08;

    static {
        Integer num = 0S2.A01;
        A02 = new FillElement(num);
        Integer num2 = 0S2.A00;
        A00 = new FillElement(num2);
        Integer num3 = 0S2.A0C;
        A01 = new FillElement(num3);
        AXO axo = Kz0.A00;
        A07 = new WrapContentElement(num, axo, new AVM(axo, 4));
        AXO axo2 = Kz0.A01;
        A08 = new WrapContentElement(num, axo2, new AVM(axo2, 4));
        MBV mbv = Kz0.A02;
        A03 = new WrapContentElement(num2, mbv, new AVM(mbv, 2));
        MBV mbv2 = Kz0.A03;
        A04 = new WrapContentElement(num2, mbv2, new AVM(mbv2, 2));
        Alignment alignment = Kz0.A07;
        A05 = new WrapContentElement(num3, alignment, new AVM(alignment, 3));
        Alignment alignment2 = Kz0.A0C;
        A06 = new WrapContentElement(num3, alignment2, new AVM(alignment2, 3));
    }

    public static final MLj A00(MLj mLj, float f) {
        float f2 = 0.0f / 0.0f;
        return mLj.D4B(new SizeElement(KZo.A00, f2, f, f2, f));
    }

    public static final MLj A01(MLj mLj, float f) {
        return mLj.D4B(new SizeElement(KZo.A00, f, f, f, f));
    }

    public static final MLj A02(MLj mLj, float f) {
        float f2 = 0.0f / 0.0f;
        return mLj.D4B(new SizeElement(KZo.A00, f, f2, f, f2));
    }
}
