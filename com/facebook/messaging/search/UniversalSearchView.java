package com.facebook.messaging.search;

import X.C09s;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.litho.LithoView;
import com.facebook.widget.CustomLinearLayout;

/* loaded from: UniversalSearchView.class */
public class UniversalSearchView extends CustomLinearLayout {
    public LithoView A00;

    public UniversalSearchView(Context context) {
        this(context, null);
    }

    public UniversalSearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UniversalSearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0D(2132542569);
        this.A00 = (LithoView) C09s.A01(this, 2131365266);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        LithoView lithoView = this.A00;
        if (lithoView != null) {
            lithoView.clearFocus();
        }
    }
}
