package com.facebook.common.ui.keyboard;

import X.1HH;
import X.6Nr;
import X.C00i;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.widget.CustomFrameLayout;

/* loaded from: SoftInputDetectingFrameLayout.class */
public class SoftInputDetectingFrameLayout extends CustomFrameLayout {
    public C00i A00;

    public SoftInputDetectingFrameLayout(Context context) {
        super(context);
        this.A00 = new 1HH(getContext(), 68747);
    }

    public SoftInputDetectingFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = new 1HH(getContext(), 68747);
    }

    public SoftInputDetectingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = new 1HH(getContext(), 68747);
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        C00i c00i = this.A00;
        c00i.getClass();
        ((6Nr) c00i.get()).A01(this, i2);
        super.onMeasure(i, i2);
    }
}
