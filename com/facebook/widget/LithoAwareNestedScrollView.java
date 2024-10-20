package com.facebook.widget;

import X.C81q;
import android.content.Context;
import android.util.AttributeSet;
import androidx.core.widget.NestedScrollView;

/* loaded from: LithoAwareNestedScrollView.class */
public class LithoAwareNestedScrollView extends NestedScrollView {
    public LithoAwareNestedScrollView(Context context) {
        super(context, null);
    }

    public LithoAwareNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LithoAwareNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C81q.A00(this);
    }
}
