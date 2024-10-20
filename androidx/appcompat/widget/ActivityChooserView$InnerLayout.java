package androidx.appcompat.widget;

import X.53Z;
import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: ActivityChooserView$InnerLayout.class */
public class ActivityChooserView$InnerLayout extends LinearLayout {
    public static final int[] A00 = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        53Z r0 = new 53Z(context, context.obtainStyledAttributes(attributeSet, A00));
        setBackgroundDrawable(r0.A01(0));
        r0.A02.recycle();
    }
}
