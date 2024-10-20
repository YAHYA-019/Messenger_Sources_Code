package com.facebook.common.ui.keyboard;

import X.0FI;
import X.1HH;
import X.5T7;
import X.5T8;
import X.6Nr;
import X.C00i;
import X.C1oo;
import X.C7aX;
import X.C7aY;
import X.Hrr;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.composer.ComposerKeyboardManager;

/* loaded from: CustomKeyboardLayout.class */
public class CustomKeyboardLayout extends SoftInputDetectingFrameLayout {
    public int A00;
    public int A01;
    public 5T8 A02;
    public C7aY A03;
    public C7aX A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public ViewTreeObserver.OnGlobalFocusChangeListener A0A;
    public InputMethodManager A0B;
    public C00i A0C;
    public C00i A0D;
    public boolean A0E;
    public boolean A0F;

    public CustomKeyboardLayout(Context context) {
        super(context);
        this.A0E = true;
        this.A0B = null;
        A00();
    }

    public CustomKeyboardLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CustomKeyboardLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0E = true;
        this.A0B = null;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0X, i, 0);
        this.A07 = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        obtainStyledAttributes.recycle();
        A00();
    }

    private void A00() {
        this.A0D = new 1HH(getContext(), 68747);
        this.A0C = FbInjector.A00;
        A01();
        C00i c00i = this.A0C;
        c00i.getClass();
        this.A05 = ((Context) c00i.get()).getResources().getConfiguration().orientation;
        this.A0A = new 5T7(this);
    }

    private void A01() {
        C00i c00i = this.A0C;
        c00i.getClass();
        this.A08 = ((Context) c00i.get()).getResources().getDimensionPixelSize(2131165207);
        C00i c00i2 = this.A0C;
        c00i2.getClass();
        this.A06 = ((Context) c00i2.get()).getResources().getDimensionPixelSize(2131165206);
    }

    public static void A02(CustomKeyboardLayout customKeyboardLayout, boolean z) {
        C7aY c7aY;
        if (z != customKeyboardLayout.A0F) {
            customKeyboardLayout.A0F = z;
            5T8 r0 = customKeyboardLayout.A02;
            if (r0 != null) {
                r0.removeMessages(1001);
            }
            if (!z || (c7aY = customKeyboardLayout.A03) == null) {
                return;
            }
            ComposerKeyboardManager composerKeyboardManager = c7aY.A00;
            if (composerKeyboardManager.A03 != null) {
                ((Hrr) composerKeyboardManager.A0D.get()).A00();
                if (composerKeyboardManager.A03.A04.Cxv()) {
                    return;
                }
            }
            composerKeyboardManager.A06();
        }
    }

    public static boolean A03(CustomKeyboardLayout customKeyboardLayout) {
        C00i c00i = customKeyboardLayout.A0D;
        c00i.getClass();
        boolean z = false;
        if (((6Nr) c00i.get()).A04) {
            z = true;
        }
        return z;
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (A03(this)) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-1853947861);
        super.onAttachedToWindow();
        this.A02 = new 5T8(this);
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.A0A);
        0FI.A0C(-497721267, A06);
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-194459980);
        5T8 r0 = this.A02;
        if (r0 != null) {
            r0.removeMessages(1001);
            this.A02 = null;
        }
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.A0A);
        super.onDetachedFromWindow();
        0FI.A0C(941994996, A06);
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (A03(this)) {
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ba, code lost:
    
        if (r304 != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c9 A[SYNTHETIC] */
    @Override // com.facebook.common.ui.keyboard.SoftInputDetectingFrameLayout, com.facebook.widget.CustomFrameLayout, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.ui.keyboard.CustomKeyboardLayout.onMeasure(int, int):void");
    }
}
