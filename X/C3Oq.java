package X;

import android.graphics.Paint;
import android.icu.text.BreakIterator;

/* renamed from: X.3Oq, reason: invalid class name */
/* loaded from: 3Oq.class */
public abstract class C3Oq {
    public static final int A00(Paint paint) {
        return paint.getShadowLayerColor();
    }

    public static final int A01(CharSequence charSequence, int i) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence);
        return characterInstance.preceding(i);
    }
}
