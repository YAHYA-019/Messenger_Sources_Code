package com.facebook.inspiration.view;

import X.11T;
import X.1BL;
import X.1Bn;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.common.util.TriState;

/* loaded from: InspirationTouchForwardingLayout.class */
public final class InspirationTouchForwardingLayout extends View {
    public View A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InspirationTouchForwardingLayout(Context context) {
        super(context);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InspirationTouchForwardingLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        1BL.A1F(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InspirationTouchForwardingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        1BL.A1F(context, attributeSet);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        11T.A0F(motionEvent, 0);
        View view = this.A00;
        if (view == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        try {
            return view.dispatchTouchEvent(motionEvent);
        } catch (IndexOutOfBoundsException e) {
            if (1Bn.A0A(83429) != TriState.YES) {
                return false;
            }
            throw e;
        }
    }
}
