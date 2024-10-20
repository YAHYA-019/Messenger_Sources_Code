package com.facebook.gif;

import X.0K6;
import X.0S2;
import X.1BQ;
import X.1Bi;
import X.1vL;
import X.1vQ;
import X.AbI;
import X.C00i;
import X.C09s;
import X.C0dp;
import X.DKD;
import X.EAS;
import X.Rnr;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import com.facebook.widget.CustomFrameLayout;

/* loaded from: AnimatedImagePlayButtonView.class */
public class AnimatedImagePlayButtonView extends CustomFrameLayout {
    public Animator A00;
    public Animator A01;
    public ImageView A02;
    public ImageView A03;
    public ImageView A04;
    public 1vL A05;
    public 1vQ A06;
    public C00i A07;
    public Integer A08;
    public C0dp A09;
    public Integer A0A;

    public AnimatedImagePlayButtonView(Context context) {
        super(context);
        A01();
    }

    public AnimatedImagePlayButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }

    public AnimatedImagePlayButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }

    private ObjectAnimator A00() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.A03, "rotation", 0.0f, 360.0f);
        ofFloat.setDuration(2500L);
        ofFloat.setRepeatCount(-1);
        DKD.A17(ofFloat);
        return ofFloat;
    }

    private void A01() {
        this.A07 = 1BQ.A02(99807);
        this.A09 = AbI.A0B();
        this.A05 = (1vL) 1Bi.A03(99939);
        A0U(2132542098);
        this.A04 = (ImageView) C09s.A01(this, 2131364345);
        this.A03 = (ImageView) C09s.A01(this, 2131364344);
        this.A02 = (ImageView) C09s.A01(this, 2131364343);
        ObjectAnimator A00 = A00();
        this.A01 = A00;
        A00.addListener(new EAS(this, 1));
        if (this.A05.A0M()) {
            Rnr rnr = this.A06;
            if (rnr == null) {
                rnr = new Rnr(this);
                this.A06 = rnr;
            }
            this.A05.A0R(rnr);
        }
    }

    public void A0V(Integer num) {
        Animator animator;
        if (num != this.A0A) {
            int i = 8;
            if (this.A05.A0S()) {
                this.A08 = num;
                setVisibility(8);
                return;
            }
            this.A0A = num;
            if (num != 0S2.A0N) {
                i = 0;
            }
            setVisibility(i);
            this.A01.cancel();
            Animator animator2 = this.A00;
            if (animator2 != null) {
                animator2.cancel();
                this.A00 = null;
            }
            ImageView imageView = this.A03;
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
            imageView.setAlpha(1.0f);
            ImageView imageView2 = this.A04;
            imageView2.setScaleX(1.0f);
            imageView2.setScaleY(1.0f);
            imageView2.setAlpha(1.0f);
            ImageView imageView3 = this.A02;
            imageView3.setScaleX(1.0f);
            imageView3.setScaleY(1.0f);
            imageView3.setAlpha(1.0f);
            this.A03.setRotation(0.0f);
            int intValue = num.intValue();
            if (intValue == 1) {
                animator = this.A01;
            } else {
                if (intValue != 2) {
                    return;
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.A02, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(this.A03, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(this.A04, "alpha", 1.0f, 0.0f));
                DKD.A17(animatorSet);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.A02, "scaleX", 1.0f, 0.0f), ObjectAnimator.ofFloat(this.A02, "scaleY", 1.0f, 0.0f), ObjectAnimator.ofFloat(this.A03, "scaleX", 1.1f, 0.0f), ObjectAnimator.ofFloat(this.A03, "scaleY", 1.1f, 0.0f), ObjectAnimator.ofFloat(this.A04, "scaleX", 1.5f, 0.0f), ObjectAnimator.ofFloat(this.A04, "scaleY", 1.5f, 0.0f));
                animatorSet2.setInterpolator(new AccelerateDecelerateInterpolator());
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.setDuration(600L);
                animatorSet3.playTogether(animatorSet, animatorSet2, A00());
                animatorSet3.addListener(new EAS(this, 2));
                this.A00 = animatorSet3;
                animator = animatorSet3;
            }
            0K6.A00(animator);
        }
    }
}
