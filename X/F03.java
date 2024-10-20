package X;

import android.os.Build;
import android.util.TypedValue;
import android.widget.TextView;

/* loaded from: F03.class */
public abstract class F03 {
    public static void A00(TextView textView, float f, int i) {
        if (Build.VERSION.SDK_INT >= 34) {
            EU1.A00(textView, f, i);
        } else {
            A01(textView, Math.round(TypedValue.applyDimension(i, f, DKD.A09(textView))));
        }
    }

    public static void A01(TextView textView, int i) {
        0RZ.A00(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }
}
