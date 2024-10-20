package com.facebook.messaging.montage.viewer.util;

import X.0FI;
import X.0NL;
import X.C2rY;
import X.DTR;
import X.E1Z;
import X.EBv;
import android.content.Context;
import android.util.AttributeSet;

/* loaded from: StoriesRTLViewPager.class */
public class StoriesRTLViewPager extends EBv {
    public StoriesRTLViewPager(Context context) {
        super(context);
        ((EBv) this).A00 = false;
    }

    public StoriesRTLViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((EBv) this).A00 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int A01(int i) {
        if (i >= 0 && C2rY.A00(getContext())) {
            if (A0H() != null) {
                return (r0.A0C() - i) - 1;
            }
            i = 0;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int A0G() {
        return A01(this.A05);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public 0NL A0H() {
        0NL r302 = this.A0C;
        if (r302 instanceof E1Z) {
            r302 = ((DTR) r302).A01;
        }
        return r302;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0K(int i) {
        super/*androidx.viewpager.widget.ViewPager*/.A0K(A01(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0Q(int i, boolean z) {
        super/*androidx.viewpager.widget.ViewPager*/.A0Q(A01(i), z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0R(0NL r302) {
        boolean z;
        if (r302 == null || !C2rY.A00(getContext())) {
            z = false;
        } else {
            z = true;
            r302 = new E1Z(r302, this);
        }
        super/*androidx.viewpager.widget.ViewPager*/.A0R(r302);
        if (z) {
            A0Q(0, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(1284704605);
        super/*com.facebook.widget.CustomViewPager*/.onAttachedToWindow();
        0FI.A0C(1438765423, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-284386369);
        super/*com.facebook.widget.CustomViewPager*/.onDetachedFromWindow();
        0FI.A0C(-1122347224, A06);
    }
}
