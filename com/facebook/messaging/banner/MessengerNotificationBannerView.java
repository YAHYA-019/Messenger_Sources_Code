package com.facebook.messaging.banner;

import X.0Q8;
import X.11T;
import X.2Wo;
import X.C09s;
import X.DKC;
import X.IlT;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import com.facebook.fbui.widget.layout.ImageBlockLayout;
import com.facebook.resources.ui.FbFrameLayout;
import com.facebook.widget.CustomLinearLayout;
import com.facebook.widget.text.BetterTextView;

/* loaded from: MessengerNotificationBannerView.class */
public final class MessengerNotificationBannerView extends CustomLinearLayout {
    public BetterTextView A00;
    public BetterTextView A01;
    public BetterTextView A02;
    public ImageBlockLayout A03;
    public FbFrameLayout A04;
    public 2Wo A05;
    public BetterTextView A06;
    public BetterTextView A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerNotificationBannerView(Context context) {
        super(context);
        11T.A0F(context, 1);
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerNotificationBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerNotificationBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        A00();
    }

    private final void A00() {
        setOrientation(1);
        A0D(2132542764);
        ImageBlockLayout imageBlockLayout = (ImageBlockLayout) C09s.A01(this, 2131365858);
        this.A03 = imageBlockLayout;
        if (imageBlockLayout == null) {
            11T.A0L("imageBlockLayout");
            throw 0Q8.createAndThrow();
        }
        imageBlockLayout.A0B(16);
        this.A07 = DKC.A0g(this, 2131365860);
        this.A06 = DKC.A0g(this, 2131365859);
        this.A04 = (FbFrameLayout) C09s.A01(this, 2131365857);
        View A01 = C09s.A01(this, 2131365853);
        11T.A0I(A01, "null cannot be cast to non-null type android.view.ViewStub");
        2Wo A00 = 2Wo.A00((ViewStub) A01);
        this.A05 = A00;
        IlT.A00(A00, this, 1);
    }
}
