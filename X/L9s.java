package X;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: L9s.class */
public final class L9s {
    public ValueAnimator A00;
    public boolean A01;
    public boolean A02;
    public final int A03;
    public final MLg A04;
    public final KeJ A05;
    public final ArrayList A06 = AnonymousClass001.A0s();

    public L9s(MLg mLg, int i) {
        this.A04 = mLg;
        this.A03 = i;
        new Bundle();
        this.A05 = new KeJ();
    }

    public static final ValueAnimator A00(View view, L9s l9s, int i) {
        ValueAnimator valueAnimator = l9s.A00;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(view.getHeight(), i);
        l9s.A00 = ofInt;
        if (ofInt != null) {
            LF7.A00(ofInt, view, 1);
        }
        ValueAnimator valueAnimator2 = l9s.A00;
        if (valueAnimator2 != null) {
            valueAnimator2.setDuration(l9s.A03);
        }
        return l9s.A00;
    }

    public static final ValueAnimator A01(View view, L9s l9s, int i, int i2, boolean z) {
        ValueAnimator valueAnimator = l9s.A00;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        l9s.A00 = ofInt;
        if (ofInt != null) {
            ofInt.addUpdateListener(new IG2(0, view, z));
        }
        ValueAnimator valueAnimator2 = l9s.A00;
        if (valueAnimator2 != null) {
            valueAnimator2.setDuration(150L);
        }
        return l9s.A00;
    }

    public static final void A02(L9s l9s, boolean z) {
        l9s.A02 = z;
        Iterator it = l9s.A06.iterator();
        while (it.hasNext()) {
            C3233JnU c3233JnU = (C3233JnU) it.next();
            boolean z2 = l9s.A02;
            Iterator it2 = c3233JnU.A0B.iterator();
            while (it2.hasNext()) {
                ((MNo) it2.next()).Cq7(z2);
            }
        }
    }
}
