package com.facebook.widget;

import X.C81q;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/* loaded from: LithoAwareScrollView.class */
public class LithoAwareScrollView extends ScrollView {
    public LithoAwareScrollView(Context context) {
        super(context);
    }

    public LithoAwareScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LithoAwareScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C81q.A00(this);
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C81q.A00(this);
    }
}
