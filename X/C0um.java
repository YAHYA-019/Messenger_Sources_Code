package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: X.0um, reason: invalid class name */
/* loaded from: 0um.class */
public final class C0um extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C0um(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        if (this.A00 != 0) {
            super.onAnimationCancel(animator);
        } else {
            ((0Sl) this.A02).onAnimationCancel((View) this.A03);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (this.A00 == 0) {
            ((0Sl) this.A02).onAnimationEnd((View) this.A03);
            return;
        }
        0Sw r0 = (0Sw) this.A02;
        r0.A00.A08(1.0f);
        0xV.A03((View) this.A03, r0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        if (this.A00 != 0) {
            super.onAnimationStart(animator);
        } else {
            ((0Sl) this.A02).onAnimationStart((View) this.A03);
        }
    }
}
