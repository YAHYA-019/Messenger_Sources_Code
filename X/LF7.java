package X;

import android.animation.ValueAnimator;

/* loaded from: LF7.class */
public final class LF7 implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;

    public LF7(LBS lbs, int i) {
        this.A00 = i;
        this.A01 = lbs;
    }

    public LF7(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(ValueAnimator valueAnimator, Object obj, int i) {
        valueAnimator.addUpdateListener(new LF7(obj, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0282, code lost:
    
        if (r0.BSr() == false) goto L39;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAnimationUpdate(android.animation.ValueAnimator r302) {
        /*
            Method dump skipped, instructions count: 3129
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LF7.onAnimationUpdate(android.animation.ValueAnimator):void");
    }
}
