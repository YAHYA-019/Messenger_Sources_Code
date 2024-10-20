package X;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* loaded from: Jwd.class */
public final class Jwd extends Jwe implements LineHeightSpan {
    public final int A00;

    public Jwd(DisplayMetrics displayMetrics, Integer num, int i, int i2, int i3) {
        super(displayMetrics, num, i, i3);
        this.A00 = i2;
        float applyDimension = TypedValue.applyDimension(2, 22.0f, displayMetrics) * (i + 1);
        float f = this.A01 + this.A02;
        ((LJo) this).A00 = applyDimension < f ? f : applyDimension;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        11T.A0F(fontMetricsInt, 5);
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        int i7 = i5 - i6;
        int i8 = this.A00;
        if (i7 > i8) {
            float f = i8 / i7;
            fontMetricsInt.ascent = (int) (i6 * f);
            fontMetricsInt.descent = (int) (i5 * f);
        } else {
            int i9 = (i8 - i7) / 2;
            fontMetricsInt.descent = i5 + i9;
            fontMetricsInt.ascent = i6 - i9;
        }
    }
}
