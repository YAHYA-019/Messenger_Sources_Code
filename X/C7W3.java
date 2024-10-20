package X;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* renamed from: X.7W3, reason: invalid class name */
/* loaded from: 7W3.class */
public final class C7W3 implements LineHeightSpan {
    public final float A00;

    public C7W3(float f) {
        this.A00 = f;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        11T.A0F(fontMetricsInt, 5);
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        int i7 = i5 - i6;
        int i8 = (int) (i7 * this.A00);
        int i9 = (i8 - i7) / 2;
        int i10 = i6 - i9;
        fontMetricsInt.ascent = i10;
        fontMetricsInt.top -= i9;
        int i11 = i10 + i8;
        fontMetricsInt.descent = i11;
        fontMetricsInt.bottom = i11;
    }
}
