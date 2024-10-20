package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.32b, reason: invalid class name */
/* loaded from: 32b.class */
public final class C32b extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ ViewPropertyAnimator A03;
    public final /* synthetic */ C2lb A04;
    public final /* synthetic */ 6LP A05;

    public C32b(View view, ViewPropertyAnimator viewPropertyAnimator, C2lb c2lb, 6LP r305, int i, int i2) {
        this.A05 = r305;
        this.A04 = c2lb;
        this.A00 = i;
        this.A02 = view;
        this.A01 = i2;
        this.A03 = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        if (this.A00 != 0) {
            this.A02.setTranslationX(0.0f);
        }
        if (this.A01 != 0) {
            this.A02.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.A03.setListener(null);
        6LP r0 = this.A05;
        C2lb c2lb = this.A04;
        r0.A0N(c2lb);
        r0.A09.remove(c2lb);
        r0.A0T();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.A05.A0J(this.A04);
    }
}
