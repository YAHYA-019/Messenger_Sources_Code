package com.facebook.messaging.livelocation.static_map;

import X.11T;
import X.AbG;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.widget.CustomFrameLayout;

/* loaded from: LocationMapCardView.class */
public final class LocationMapCardView extends CustomFrameLayout {
    public TextView A00;
    public TextView A01;
    public TextView A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationMapCardView(Context context) {
        super(context);
        11T.A0F(context, 1);
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationMapCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationMapCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        A00();
    }

    private final void A00() {
        A0U(2132542443);
        this.A02 = AbG.A09(this, 2131368067);
        this.A01 = AbG.A09(this, 2131367726);
        this.A00 = AbG.A09(this, 2131363482);
    }
}
