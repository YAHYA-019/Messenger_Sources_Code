package com.facebook.messaging.rtc.incall.impl.widgets.audioparticipantview;

import X.11T;
import X.C1oo;
import X.DKC;
import X.DKF;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.messaging.ui.name.ThreadNameView;
import com.facebook.widget.tiles.ThreadTileView;

/* loaded from: ParticipantStatusView.class */
public final class ParticipantStatusView extends FrameLayout {
    public float A00;
    public float A01;
    public TextView A02;
    public ThreadNameView A03;
    public ThreadTileView A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParticipantStatusView(Context context) {
        super(context);
        11T.A0F(context, 1);
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParticipantStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        11T.A0F(context, 1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C1oo.A21, 0, 0);
        try {
            this.A00 = obtainStyledAttributes.getFloat(0, 0.5f);
            invalidate();
            float f = obtainStyledAttributes.getFloat(1, 0.32f);
            if (this.A01 != f) {
                this.A01 = f;
                invalidate();
            }
            obtainStyledAttributes.recycle();
            A00();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void A00() {
        View.inflate(getContext(), 2132543019, this);
        this.A04 = (ThreadTileView) requireViewById(2131366306);
        this.A03 = (ThreadNameView) requireViewById(2131366305);
        this.A02 = DKF.A0F(this, 2131366303);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 >= childCount) {
                return;
            }
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams A0I = DKC.A0I(childAt);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = (int) (((paddingLeft + (((paddingRight - paddingLeft) - measuredWidth) * this.A00)) + A0I.leftMargin) - A0I.rightMargin);
                if (i7 < paddingLeft) {
                    i7 = paddingLeft;
                }
                int i8 = (int) (((paddingTop + (((paddingBottom - paddingTop) - measuredHeight) * this.A01)) + A0I.topMargin) - A0I.bottomMargin);
                if (i8 < paddingTop) {
                    i8 = paddingTop;
                }
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
            i5 = i6 + 1;
        }
    }
}
