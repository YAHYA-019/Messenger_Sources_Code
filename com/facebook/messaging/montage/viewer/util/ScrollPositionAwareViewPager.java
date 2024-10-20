package com.facebook.messaging.montage.viewer.util;

import X.4YV;
import X.EBv;
import android.content.Context;
import android.util.AttributeSet;

/* loaded from: ScrollPositionAwareViewPager.class */
public class ScrollPositionAwareViewPager extends EBv {
    public ScrollPositionAwareViewPager(Context context) {
        super(context);
        ((EBv) this).A00 = false;
    }

    public ScrollPositionAwareViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((EBv) this).A00 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0Q(int i, boolean z) {
        boolean A1W = 4YV.A1W(i, A0G());
        super/*androidx.viewpager.widget.ViewPager*/.A0Q(i, z);
        if (!A1W || z) {
            return;
        }
        A0O(i, 0.0f, 0);
    }
}
