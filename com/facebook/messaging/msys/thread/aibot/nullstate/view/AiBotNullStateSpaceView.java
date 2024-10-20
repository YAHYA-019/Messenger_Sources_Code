package com.facebook.messaging.msys.thread.aibot.nullstate.view;

import X.0FI;
import X.11T;
import X.9fS;
import X.C5x8;
import X.C6s9;
import X.C9wo;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.messaging.msys.thread.aibot.nullstate.view.AiBotNullStateSpaceView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: AiBotNullStateSpaceView.class */
public final class AiBotNullStateSpaceView extends FrameLayout {
    public int A00;
    public final 9fS A01;
    public final C9wo A02;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AiBotNullStateSpaceView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AiBotNullStateSpaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.9wo] */
    public AiBotNullStateSpaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        Resources resources = getResources();
        11T.A0A(resources);
        this.A01 = new 9fS(resources);
        this.A02 = new C6s9() { // from class: X.9wo
            @Override // X.C6s9
            public void C3A(int i2) {
            }

            @Override // X.C6s9
            public void C3H(boolean z, int i2) {
            }

            @Override // X.C6s9
            public void CDO(boolean z) {
                int i2;
                int i3;
                boolean z2 = false;
                if (Build.VERSION.SDK_INT >= 30) {
                    z2 = true;
                }
                AiBotNullStateSpaceView aiBotNullStateSpaceView = AiBotNullStateSpaceView.this;
                aiBotNullStateSpaceView.clearAnimation();
                9fS r0 = aiBotNullStateSpaceView.A01;
                if (z) {
                    i2 = r0.A00;
                    i3 = r0.A01;
                } else {
                    i2 = r0.A01;
                    i3 = r0.A00;
                }
                if (!z2) {
                    aiBotNullStateSpaceView.A00 = i3;
                    aiBotNullStateSpaceView.requestLayout();
                } else {
                    ValueAnimator ofInt = ValueAnimator.ofInt(i2, i3);
                    ofInt.addUpdateListener(new LF5(ofInt, aiBotNullStateSpaceView, 2));
                    0K6.A00(ofInt);
                }
            }
        };
    }

    public /* synthetic */ AiBotNullStateSpaceView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-521743833);
        super.onAttachedToWindow();
        C5x8.A02(this.A02);
        0FI.A0C(1981418460, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(386447223);
        super.onDetachedFromWindow();
        C5x8.A03(this.A02);
        0FI.A0C(1112866603, A06);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), this.A00);
    }
}
