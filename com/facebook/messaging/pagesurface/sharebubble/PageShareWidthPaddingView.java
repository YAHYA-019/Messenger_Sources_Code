package com.facebook.messaging.pagesurface.sharebubble;

import X.11T;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: PageShareWidthPaddingView.class */
public final class PageShareWidthPaddingView extends View {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageShareWidthPaddingView(Context context) {
        super(context);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageShareWidthPaddingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageShareWidthPaddingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), 1);
    }
}
