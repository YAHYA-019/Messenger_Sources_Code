package com.facebook.fbui.widget.pagerindicator;

import X.AnonymousClass001;
import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;

/* loaded from: IconAndTextTabbedViewPagerIndicator.class */
public class IconAndTextTabbedViewPagerIndicator extends TabbedViewPagerIndicator {
    public IconAndTextTabbedViewPagerIndicator(Context context) {
        this(context, null);
    }

    public IconAndTextTabbedViewPagerIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130971941);
    }

    public IconAndTextTabbedViewPagerIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.facebook.fbui.widget.pagerindicator.TabbedViewPagerIndicator
    public void A07(ViewPager viewPager) {
        if (viewPager.A0H() != null) {
            throw AnonymousClass001.A0N("Adapter should be an instance of IconAndTextPagerAdapter");
        }
        super.A07(viewPager);
    }
}
