package com.facebook.common.ui.keyboard;

import X.1HH;
import X.6Nr;
import X.C00i;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.widget.CustomLinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: SoftInputDetectingLinearLayout.class */
public class SoftInputDetectingLinearLayout extends CustomLinearLayout {
    public static final AtomicBoolean A01 = new AtomicBoolean(false);
    public C00i A00;

    public SoftInputDetectingLinearLayout(Context context) {
        super(context);
        this.A00 = new 1HH(getContext(), 68747);
    }

    public SoftInputDetectingLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = new 1HH(getContext(), 68747);
    }

    @Override // com.facebook.widget.CustomLinearLayout, android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (!A01.get()) {
            C00i c00i = this.A00;
            c00i.getClass();
            ((6Nr) c00i.get()).A01(this, i2);
        }
        super.onMeasure(i, i2);
    }
}
