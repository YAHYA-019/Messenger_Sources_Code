package com.facebook.widget;

import X.48A;
import X.6KQ;
import X.C00j;
import X.C1oo;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.acra.constants.ActionId;

/* loaded from: OverlayLayout.class */
public class OverlayLayout extends 48A {
    public OverlayLayout(Context context) {
        super(context);
    }

    public OverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OverlayLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof 6KQ;
    }

    public void dispatchDraw(Canvas canvas) {
        C00j.A05("Overlayout.dispatchDraw", -366479263);
        try {
            super.dispatchDraw(canvas);
            C00j.A01(-101125199);
        } catch (Throwable th) {
            C00j.A01(2022708559);
            throw th;
        }
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout.LayoutParams(-1, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A22);
        ((6KQ) layoutParams).A04 = obtainStyledAttributes.getBoolean(2, false);
        ((6KQ) layoutParams).A01 = obtainStyledAttributes.getResourceId(1, 0);
        ((6KQ) layoutParams).A00 = obtainStyledAttributes.getInt(0, ActionId.MESSENGER_QUEUE_CREATION);
        ((6KQ) layoutParams).A02 = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
        ((6KQ) layoutParams).A03 = obtainStyledAttributes.getDimensionPixelOffset(4, 0);
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new FrameLayout.LayoutParams(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void layoutChild(int r302, int r303, int r304, int r305, android.view.View r306) {
        /*
            Method dump skipped, instructions count: 762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.widget.OverlayLayout.layoutChild(int, int, int, int, android.view.View):void");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C00j.A05("Overlayout.onLayout", 313549092);
        try {
            super.onLayout(z, i, i2, i3, i4);
            C00j.A01(-3336862);
        } catch (Throwable th) {
            C00j.A01(151517817);
            throw th;
        }
    }

    public void onMeasure(int i, int i2) {
        C00j.A05("Overlayout.onMeasure", 190722782);
        try {
            super.onMeasure(i, i2);
            C00j.A01(62115612);
        } catch (Throwable th) {
            C00j.A01(-2119253687);
            throw th;
        }
    }
}
