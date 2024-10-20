package X;

import android.animation.ValueAnimator;

/* renamed from: X.9na, reason: invalid class name */
/* loaded from: 9na.class */
public final class C9na implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ 6IM A00;

    public C9na(6IM r302) {
        this.A00 = r302;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int A03 = AnonymousClass001.A03(valueAnimator.getAnimatedValue());
        6LN r0 = this.A00.A07;
        if (r0 != null) {
            6IL r02 = r0.A00;
            r02.A00 = A03;
            r02.A0E.D6d();
            6IL.A00(r02.A0A, r02, (AnonymousClass622) null);
        }
    }
}
