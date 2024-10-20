package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: JX8.class */
public final class JX8 extends MetricAffectingSpan {
    public final String A00;

    public JX8(String str) {
        this.A00 = str;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.A00);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.A00);
    }
}
