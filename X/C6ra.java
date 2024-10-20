package X;

import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.SuggestionRangeSpan;

/* renamed from: X.6ra, reason: invalid class name */
/* loaded from: 6ra.class */
public final class C6ra extends Editable.Factory {
    @Override // android.text.Editable.Factory
    public Editable newEditable(final CharSequence charSequence) {
        return new SpannableStringBuilder(charSequence) { // from class: X.6rb
            @Override // android.text.SpannableStringBuilder, android.text.Spannable
            public void setSpan(Object obj, int i, int i2, int i3) {
                boolean equals;
                try {
                    if (Build.VERSION.SDK_INT < 33) {
                        if (obj != null) {
                            equals = obj.getClass().getName().equals("android.text.style.SuggestionRangeSpan");
                        }
                        super.setSpan(obj, i, i2, i3);
                    }
                    equals = obj instanceof SuggestionRangeSpan;
                    if (equals && C02A.useSafeSpanEndInTextInputSpec) {
                        i2 = Math.min(i2, length());
                    }
                    super.setSpan(obj, i, i2, i3);
                } catch (IndexOutOfBoundsException e) {
                    throw new IndexOutOfBoundsException(String.format("%s | span=%s | flags=%d", 1BK.A1a(e.getMessage(), obj != null ? obj.getClass() : "Unknown", i3)));
                }
            }
        };
    }
}
