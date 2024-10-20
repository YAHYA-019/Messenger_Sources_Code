package com.facebook.messaging.rtc.views.header;

import X.0FI;
import X.11T;
import X.1Br;
import X.1Bu;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.widget.CustomFrameLayout;

/* loaded from: HeaderContainerView.class */
public final class HeaderContainerView extends CustomFrameLayout {
    public final 1Br A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        this.A00 = 1Bu.A00(147715);
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(1824693391);
        super.onAttachedToWindow();
        1Br.A0C(this.A00);
        11T.A0A(getContext());
        0FI.A0C(1143843939, A06);
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(2121000297);
        removeAllViews();
        super.onDetachedFromWindow();
        0FI.A0C(-752518517, A06);
    }
}
