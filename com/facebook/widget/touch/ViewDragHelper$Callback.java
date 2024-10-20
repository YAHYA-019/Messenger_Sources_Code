package com.facebook.widget.touch;

import X.AnonymousClass001;
import X.C3284Jpf;
import X.C81q;
import X.DKC;
import X.JY5;
import X.Jwb;
import X.Jwg;
import X.KMK;
import X.KTY;
import X.LE4;
import X.MFG;
import android.view.View;
import com.facebook.fbui.widget.slidingviewgroup.SlidingViewGroup;
import java.util.Set;

/* loaded from: ViewDragHelper$Callback.class */
public abstract class ViewDragHelper$Callback {
    public void A00(View view, float f) {
        if (this instanceof Jwb) {
            Jwb jwb = (Jwb) this;
            if (view != null) {
                SlidingViewGroup slidingViewGroup = jwb.A00;
                int height = slidingViewGroup.getHeight();
                LE4 le4 = slidingViewGroup.A07;
                int top = view.getTop() + le4.A0A((int) f);
                KMK kmk = slidingViewGroup.A06;
                MFG A00 = SlidingViewGroup.A00(view, slidingViewGroup, kmk instanceof C3284Jpf ? height - top : top + view.getMeasuredHeight(), height);
                if (A00 != null) {
                    MFG mfg = slidingViewGroup.A03;
                    if (mfg != null) {
                        mfg.B3v(view, height);
                        A00.B3v(view, height);
                    }
                    slidingViewGroup.A03 = A00;
                    int B3v = A00.B3v(view, height);
                    try {
                        le4.A0E(kmk instanceof C3284Jpf ? height - B3v : B3v - view.getMeasuredHeight(), slidingViewGroup.A00);
                        slidingViewGroup.postInvalidateOnAnimation();
                        return;
                    } catch (NullPointerException unused) {
                        return;
                    }
                }
                return;
            }
            return;
        }
        JY5 jy5 = ((Jwg) this).A00;
        LE4 le42 = jy5.A0A;
        jy5.A03 = view.getTop() + le42.A0A((int) f);
        JY5.A00(jy5);
        if (jy5.A0B) {
            jy5.A08.A08((-f) / DKC.A03(jy5));
            return;
        }
        if (Math.abs(f) >= jy5.A02) {
            int height2 = jy5.getHeight();
            int i = (-1) << (-1);
            if (!le42.A0C) {
                throw AnonymousClass001.A0N("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
            }
            int xVelocity = (int) le42.A08.getXVelocity(le42.A02);
            int yVelocity = (int) le42.A08.getYVelocity(le42.A02);
            le42.A0B.fling(le42.A09.getLeft(), le42.A09.getTop(), xVelocity, yVelocity, 0, 0, i, height2);
            if (yVelocity >= 0) {
                i = height2;
            }
            le42.A05 = i;
            le42.A0D(2);
        } else {
            int i2 = jy5.A03;
            float f2 = 0.0f / 0.0f;
            le42.A0E(i2, -1);
        }
        jy5.postInvalidateOnAnimation();
    }

    public void A01(View view, int i) {
        if (this instanceof Jwb) {
            SlidingViewGroup slidingViewGroup = ((Jwb) this).A00;
            KTY kty = slidingViewGroup.A04;
            if (kty != null) {
                int height = slidingViewGroup.getHeight();
                LE4 le4 = slidingViewGroup.A07;
                if (le4 == null || le4.A03 == 2) {
                    i = 0;
                }
                kty.A01(view, height, i);
            }
            Set<View> set = slidingViewGroup.A0O;
            if (set.size() > 0) {
                slidingViewGroup.A0C = true;
                for (View view2 : set) {
                    if (!slidingViewGroup.A0Q.contains(view2)) {
                        C81q.A00(view2);
                    }
                }
                slidingViewGroup.A0C = false;
            }
            Set set2 = slidingViewGroup.A0P;
            if (!set2.isEmpty()) {
                set.addAll(set2);
                set2.clear();
            }
            Set set3 = slidingViewGroup.A0Q;
            if (set3.isEmpty()) {
                return;
            }
            set.removeAll(set3);
            set3.clear();
        }
    }
}
