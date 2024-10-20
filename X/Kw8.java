package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.widget.ProgressBar;

/* loaded from: Kw8.class */
public abstract class Kw8 {
    public static final int A00(Context context, int i) {
        11T.A0F(context, 0);
        TypedValue A0Y = JR1.A0Y(context, i);
        int i2 = A0Y.resourceId;
        return i2 == 0 ? A0Y.data : context.getColor(i2);
    }

    public static final void A01(Context context, ProgressBar progressBar, int i) {
        11T.A0F(progressBar, 1);
        progressBar.getIndeterminateDrawable().setColorFilter(A00(context, i), PorterDuff.Mode.SRC_IN);
    }
}
