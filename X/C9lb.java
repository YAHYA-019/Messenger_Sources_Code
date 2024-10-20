package X;

import android.widget.TextView;

/* renamed from: X.9lb, reason: invalid class name */
/* loaded from: 9lb.class */
public abstract class C9lb {
    public static final float A00(TextView textView) {
        return textView.getLetterSpacing();
    }

    public static final void A01(TextView textView, float f) {
        textView.setLetterSpacing(f);
    }

    public static final void A02(TextView textView, boolean z) {
        if (textView.getShowSoftInputOnFocus() != z) {
            textView.setShowSoftInputOnFocus(z);
        }
    }

    public static final boolean A03(TextView textView) {
        return textView.getShowSoftInputOnFocus();
    }
}
