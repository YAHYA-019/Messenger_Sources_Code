package X;

import android.animation.ValueAnimator;

/* loaded from: IG6.class */
public final class IG6 implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;

    public IG6(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(ValueAnimator valueAnimator, Object obj, int i) {
        valueAnimator.addUpdateListener(new IG6(obj, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0275, code lost:
    
        X.C0s8.A18();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x027b, code lost:
    
        throw X.0Q8.createAndThrow();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAnimationUpdate(android.animation.ValueAnimator r302) {
        /*
            Method dump skipped, instructions count: 1777
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IG6.onAnimationUpdate(android.animation.ValueAnimator):void");
    }
}
