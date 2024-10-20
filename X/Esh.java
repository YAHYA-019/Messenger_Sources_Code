package X;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: Esh.class */
public final class Esh {
    public final EbS A00;
    public final TextView A01;

    public Esh(TextView textView) {
        this.A01 = textView;
        this.A00 = new EbS(textView);
    }

    public void A00(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.A01.getContext().obtainStyledAttributes(attributeSet, 53Y.A08, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            this.A00.A00.A02(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
