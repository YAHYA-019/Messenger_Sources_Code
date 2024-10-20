package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: JX9.class */
public final class JX9 extends MetricAffectingSpan {
    public final float A00;

    public JX9(float f) {
        this.A00 = f;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.A00);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.A00);
    }
}
