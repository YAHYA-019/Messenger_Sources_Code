package com.facebook.ui.edittext;

import X.0Q8;
import X.11T;
import X.2ML;
import X.AnonymousClass001;
import X.JUI;
import X.LF7;
import X.LG3;
import X.LJj;
import X.LKS;
import android.R;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.widget.text.BetterEditTextView;
import java.util.List;

/* loaded from: AnimatedHintsTextLayout.class */
public final class AnimatedHintsTextLayout extends FrameLayout {
    public static int A0E;
    public float A00;
    public float A01;
    public int A02;
    public long A03;
    public ValueAnimator A04;
    public ValueAnimator A05;
    public ValueAnimator A06;
    public TextView A07;
    public TextView A08;
    public BetterEditTextView A09;
    public boolean A0A;
    public final AnimatorListenerAdapter A0B;
    public final Handler A0C;
    public final List A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedHintsTextLayout(Context context) {
        super(context);
        11T.A0F(context, 1);
        this.A03 = 3000L;
        this.A0D = AnonymousClass001.A0s();
        this.A0A = true;
        this.A0C = new Handler(Looper.getMainLooper(), new LG3(this, 3));
        this.A0B = new JUI(this, 4);
        A01(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedHintsTextLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        this.A03 = 3000L;
        this.A0D = AnonymousClass001.A0s();
        this.A0A = true;
        this.A0C = new Handler(Looper.getMainLooper(), new LG3(this, 3));
        this.A0B = new JUI(this, 4);
        A01(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedHintsTextLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A03 = 3000L;
        this.A0D = AnonymousClass001.A0s();
        this.A0A = true;
        this.A0C = new Handler(Looper.getMainLooper(), new LG3(this, 3));
        this.A0B = new JUI(this, 4);
        A01(context);
    }

    public static final BetterEditTextView A00(AnimatedHintsTextLayout animatedHintsTextLayout) {
        BetterEditTextView betterEditTextView = animatedHintsTextLayout.A09;
        if (betterEditTextView != null) {
            return betterEditTextView;
        }
        11T.A0L("editText");
        throw 0Q8.createAndThrow();
    }

    private final void A01(Context context) {
        String str;
        TextView textView = new TextView(context);
        this.A07 = textView;
        textView.setGravity(17);
        TextView textView2 = new TextView(context);
        this.A08 = textView2;
        textView2.setGravity(17);
        TextView textView3 = this.A07;
        if (textView3 == null) {
            str = "currentHintTextView";
        } else {
            textView3.setVisibility(8);
            TextView textView4 = this.A08;
            if (textView4 != null) {
                textView4.setVisibility(8);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                LF7.A00(ofFloat, this, 15);
                ofFloat.addListener(this.A0B);
                ofFloat.setDuration(300L);
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                this.A06 = ofFloat;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                LF7.A00(ofFloat2, this, 16);
                ofFloat2.setDuration(300L);
                ofFloat2.setInterpolator(new 2ML());
                this.A04 = ofFloat2;
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                LF7.A00(ofFloat3, this, 17);
                ofFloat3.setDuration(300L);
                ofFloat3.setInterpolator(new AccelerateInterpolator());
                this.A05 = ofFloat3;
                return;
            }
            str = "nextHintTextView";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public static final void A02(TextView textView, AnimatedHintsTextLayout animatedHintsTextLayout) {
        textView.setBackgroundResource(R.color.transparent);
        textView.setHintTextColor(A00(animatedHintsTextLayout).getHintTextColors());
        textView.setTextSize(0, A00(animatedHintsTextLayout).getTextSize());
        textView.setCompoundDrawablesRelative(null, null, null, null);
        textView.setPaddingRelative(A00(animatedHintsTextLayout).getCompoundPaddingLeft(), A00(animatedHintsTextLayout).getCompoundPaddingTop(), A00(animatedHintsTextLayout).getCompoundPaddingRight(), A00(animatedHintsTextLayout).getCompoundPaddingBottom());
        textView.setCompoundDrawablePadding(A00(animatedHintsTextLayout).getCompoundDrawablePadding());
        textView.setSingleLine();
        textView.setGravity(A00(animatedHintsTextLayout).getGravity());
        textView.setLineSpacing(A00(animatedHintsTextLayout).getLineSpacingExtra(), A00(animatedHintsTextLayout).getLineSpacingMultiplier());
        textView.setGravity(A00(animatedHintsTextLayout).getGravity());
        textView.setIncludeFontPadding(A00(animatedHintsTextLayout).getIncludeFontPadding());
    }

    public static final void A03(AnimatedHintsTextLayout animatedHintsTextLayout) {
        animatedHintsTextLayout.A0C.removeMessages(2);
        ValueAnimator valueAnimator = animatedHintsTextLayout.A06;
        String str = "translationAnimator";
        if (valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = animatedHintsTextLayout.A06;
                if (valueAnimator2 != null) {
                    valueAnimator2.end();
                }
            }
            ValueAnimator valueAnimator3 = animatedHintsTextLayout.A04;
            str = "fadeInAnimator";
            if (valueAnimator3 != null) {
                if (valueAnimator3.isRunning()) {
                    ValueAnimator valueAnimator4 = animatedHintsTextLayout.A04;
                    if (valueAnimator4 != null) {
                        valueAnimator4.end();
                    }
                }
                ValueAnimator valueAnimator5 = animatedHintsTextLayout.A05;
                str = "fadeOutAnimator";
                if (valueAnimator5 != null) {
                    if (valueAnimator5.isRunning()) {
                        ValueAnimator valueAnimator6 = animatedHintsTextLayout.A05;
                        if (valueAnimator6 != null) {
                            valueAnimator6.end();
                        }
                    }
                    A0E = animatedHintsTextLayout.A02;
                    return;
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public static final void A04(AnimatedHintsTextLayout animatedHintsTextLayout) {
        String str;
        int height = A00(animatedHintsTextLayout).getHeight() / 2;
        TextView textView = animatedHintsTextLayout.A07;
        if (textView == null) {
            str = "currentHintTextView";
        } else {
            float f = height;
            textView.setTranslationY(animatedHintsTextLayout.A00 * f);
            TextView textView2 = animatedHintsTextLayout.A08;
            if (textView2 != null) {
                textView2.setTranslationY(animatedHintsTextLayout.A01 * f);
                return;
            }
            str = "nextHintTextView";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public final void A05() {
        A03(this);
        this.A00 = 0.0f;
        this.A01 = -1.0f;
        A04(this);
    }

    public final void A06(List list) {
        11T.A0F(list, 0);
        List list2 = this.A0D;
        list2.clear();
        list2.addAll(list);
        this.A02 = A0E;
        Handler handler = this.A0C;
        handler.sendEmptyMessage(1);
        handler.sendEmptyMessage(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.facebook.widget.text.BetterEditTextView, android.widget.TextView, android.view.View, java.lang.Object] */
    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        String str;
        11T.A0G(view, 0, layoutParams);
        if (!(view instanceof BetterEditTextView)) {
            throw AnonymousClass001.A0L("Only accepting BetterEditTextView");
        }
        ?? r0 = (BetterEditTextView) view;
        if (this.A09 != null) {
            throw AnonymousClass001.A0L("We already have an EditText, can only have one");
        }
        11T.A0F((Object) r0, 0);
        this.A09 = r0;
        r0.addTextChangedListener(new LJj(this, 6));
        r0.addOnLayoutChangeListener(new LKS(this, 4));
        if (this.A0D.isEmpty()) {
            CharSequence hint = r0.getHint();
            if (hint != null) {
                A06(11T.A03(hint));
            }
            r0.setHint(null);
        }
        super.addView(view, 0, layoutParams);
        TextView textView = this.A07;
        if (textView == null) {
            str = "currentHintTextView";
        } else {
            super.addView(textView, -1, layoutParams);
            TextView textView2 = this.A08;
            if (textView2 != null) {
                super.addView(textView2, -1, layoutParams);
                return;
            }
            str = "nextHintTextView";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
