package com.facebook.messaging.chatheads.view;

import X.AmX;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: ChatHeadsMiniView.class */
public class ChatHeadsMiniView extends ViewGroup {
    public int A00;
    public boolean A01;
    public final int A02;

    public ChatHeadsMiniView(Context context) {
        super(context);
        Resources resources = getResources();
        this.A02 = resources.getDimensionPixelSize(2132279332);
        setContentDescription(resources.getString(2131954107));
        setId(2131362972);
    }

    public void A00(boolean z) {
        this.A01 = z;
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= childCount) {
                requestLayout();
                return;
            }
            AmX childAt = getChildAt(i2);
            if (childAt instanceof AmX) {
                childAt.A0b(!z);
            }
            i = i2 + 1;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = this.A00;
        boolean z2 = this.A01;
        int i6 = this.A02;
        if (z2) {
            i6 = -i6;
        }
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            View childAt = getChildAt(childCount);
            childAt.layout(i5, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            i5 += i6;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        measureChildren(i, i2);
        super.onMeasure(i, i2);
    }
}
