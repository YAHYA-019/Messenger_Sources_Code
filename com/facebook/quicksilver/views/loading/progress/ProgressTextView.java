package com.facebook.quicksilver.views.loading.progress;

import X.0K6;
import X.11T;
import X.4YU;
import X.FJX;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import com.facebook.widget.text.BetterTextView;

/* loaded from: ProgressTextView.class */
public final class ProgressTextView extends BetterTextView {
    public int A00;
    public int A01;
    public ValueAnimator A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressTextView(Context context) {
        super(context);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A00() {
        this.A00 = 0;
        this.A01 = 0;
        setText(4YU.A0u(getContext().getResources(), Integer.valueOf(this.A00), 2131957130));
    }

    public final void setProgress(int i, int i2) {
        int i3;
        if (i <= this.A01 || i <= (i3 = this.A00)) {
            return;
        }
        int i4 = (i - i3) * i2;
        this.A01 = i;
        ValueAnimator valueAnimator = this.A02;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(this.A00, this.A01);
        this.A02 = ofInt;
        if (ofInt != null) {
            ofInt.setDuration(i4);
        }
        ValueAnimator valueAnimator2 = this.A02;
        if (valueAnimator2 != null) {
            valueAnimator2.setInterpolator(new DecelerateInterpolator());
        }
        ValueAnimator valueAnimator3 = this.A02;
        if (valueAnimator3 != null) {
            FJX.A00(valueAnimator3, this, 15);
        }
        ValueAnimator valueAnimator4 = this.A02;
        if (valueAnimator4 != null) {
            0K6.A00(valueAnimator4);
        }
    }
}
