package com.facebook.messaging.rtc.incall.impl.root;

import X.0FI;
import X.11T;
import X.C01i;
import X.C03i;
import X.DKG;
import X.GYL;
import X.J9t;
import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.resources.ui.FbFrameLayout;

/* loaded from: RootCallControlsContainer.class */
public final class RootCallControlsContainer extends FbFrameLayout {
    public ViewPager2 A00;
    public final Context A01;
    public final C01i A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RootCallControlsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        this.A01 = context;
        this.A02 = J9t.A00(this, C03i.A02, 15);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        int A06 = 0FI.A06(-1533013581);
        super.onFinishInflate();
        ViewPager2 viewPager2 = (ViewPager2) DKG.A0B(this, 2131368395);
        viewPager2.A07(new GYL(viewPager2, this));
        this.A00 = viewPager2;
        0FI.A0C(1715377415, A06);
    }
}
