package com.facebook.fbui.widget.text;

import X.0FI;
import X.C00j;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: TextLayoutView.class */
public class TextLayoutView extends View {
    public TextLayoutView(Context context) {
        this(context, null);
    }

    public TextLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getResources().getDisplayMetrics();
        setFocusableInTouchMode(true);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(2113715974);
        super.onAttachedToWindow();
        0FI.A0C(1440739206, A06);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-1399989101);
        super.onDetachedFromWindow();
        0FI.A0C(-1282891575, A06);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        C00j.A05("TextLayoutView.onMeasure", -149940247);
        try {
            super.onMeasure(i, i2);
            C00j.A01(-525154500);
        } catch (Throwable th) {
            C00j.A01(1651385491);
            throw th;
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        0FI.A0B(1431559861, 0FI.A05(-225346979));
        return false;
    }
}
