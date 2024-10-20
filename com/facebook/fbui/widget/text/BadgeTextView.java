package com.facebook.fbui.widget.text;

import X.0FI;
import X.5Wo;
import X.7zL;
import X.C1oo;
import X.DKC;
import X.DKD;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.widget.text.BetterTextView;
import java.util.Locale;

/* loaded from: BadgeTextView.class */
public class BadgeTextView extends BetterTextView {
    public int A00;
    public int A01;
    public ColorStateList A02;
    public Rect A03;
    public Drawable A04;
    public TextPaint A05;
    public CharSequence A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public Layout A0B;

    public BadgeTextView(Context context) {
        this(context, null);
    }

    public BadgeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130968755);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BadgeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = 1;
        this.A05 = new TextPaint(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A07, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(obtainStyledAttributes.getResourceId(4, 2132607019), C1oo.A08);
        this.A02 = 5Wo.A00(context, obtainStyledAttributes2, 2);
        int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(0, 15);
        int i3 = obtainStyledAttributes2.getInt(3, 0);
        float f = obtainStyledAttributes2.getFloat(4, 0.0f);
        float f2 = obtainStyledAttributes2.getFloat(5, 0.0f);
        float f3 = obtainStyledAttributes2.getFloat(6, 0.0f);
        int i4 = obtainStyledAttributes2.getInt(1, -1);
        obtainStyledAttributes2.recycle();
        ColorStateList colorStateList = this.A02;
        if (colorStateList != null) {
            this.A05.setColor(colorStateList.getDefaultColor());
        }
        TextPaint textPaint = this.A05;
        textPaint.setTextSize(dimensionPixelSize);
        textPaint.setShadowLayer(f3, f, f2, i3);
        if (i4 != -1) {
            textPaint.setTypeface(Typeface.defaultFromStyle(i4));
        }
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.A04 = drawable;
        if (drawable == null) {
            this.A04 = 7zL.A0D(0);
        }
        Rect A0C = DKC.A0C();
        this.A03 = A0C;
        this.A04.getPadding(A0C);
        this.A04.setBounds(0, 0, A01(), A00());
        postInvalidate();
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        A02(resourceId > 0 ? DKD.A0q(this, resourceId) : obtainStyledAttributes.getText(3));
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (this.A00 != dimensionPixelSize2) {
            this.A00 = dimensionPixelSize2;
            requestLayout();
            invalidate();
        }
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        if (this.A01 != dimensionPixelSize3) {
            this.A01 = dimensionPixelSize3;
            requestLayout();
            invalidate();
        }
        this.A08 = obtainStyledAttributes.getInteger(2, 0) == 0 ? 0 : i2;
        this.A07 = obtainStyledAttributes.getInteger(6, 16);
        obtainStyledAttributes.recycle();
    }

    private int A00() {
        Layout layout;
        if (TextUtils.isEmpty(this.A06) || (layout = this.A0B) == null) {
            return 0;
        }
        int lineBottom = layout.getLineBottom(0);
        Rect rect = this.A03;
        return lineBottom + rect.top + rect.bottom;
    }

    private int A01() {
        Layout layout;
        int i = 0;
        if (!TextUtils.isEmpty(this.A06) && (layout = this.A0B) != null) {
            Rect rect = this.A03;
            i = ((int) layout.getLineWidth(0)) + rect.left + rect.right;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A02(CharSequence charSequence) {
        if (TextUtils.equals(this.A06, charSequence)) {
            return;
        }
        this.A06 = charSequence;
        this.A0B = null;
        invalidate();
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void drawableStateChanged() {
        super/*android.widget.TextView*/.drawableStateChanged();
        int[] drawableState = getDrawableState();
        ColorStateList colorStateList = this.A02;
        if (colorStateList != null && colorStateList.isStateful()) {
            this.A05.setColor(colorStateList.getColorForState(drawableState, 0));
        }
        Drawable drawable = this.A04;
        if (drawable != null) {
            DKC.A1O(drawable, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super/*android.widget.TextView*/.getCompoundPaddingLeft();
        int A01 = A01();
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) != 0 && A01 > 0) {
            compoundPaddingLeft = compoundPaddingLeft + A01 + this.A00;
        }
        return compoundPaddingLeft;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getCompoundPaddingRight() {
        int compoundPaddingRight = super/*android.widget.TextView*/.getCompoundPaddingRight();
        int A01 = A01();
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 0 && A01 > 0) {
            compoundPaddingRight = compoundPaddingRight + A01 + this.A00;
        }
        return compoundPaddingRight;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x018b  */
    @Override // com.facebook.widget.text.BetterTextView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDraw(android.graphics.Canvas r302) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbui.widget.text.BadgeTextView.onDraw(android.graphics.Canvas):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.widget.text.BetterTextView
    public void onMeasure(int i, int i2) {
        int i3;
        int A06 = 0FI.A06(520870904);
        if (TextUtils.isEmpty(this.A06)) {
            super.onMeasure(i, i2);
            i3 = -1478945658;
        } else {
            int size = View.MeasureSpec.getSize(i);
            if (size == 0 || View.MeasureSpec.getMode(i) == 0) {
                size = (-1) >>> 1;
            }
            this.A0B = new StaticLayout(this.A06, this.A05, size, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            this.A04.setBounds(0, 0, A01(), A00());
            super.onMeasure(i, i2);
            int max = Math.max(getMeasuredHeight(), A00());
            if (max < View.MeasureSpec.getSize(i2)) {
                setMeasuredDimension(getMeasuredWidth(), max);
            }
            i3 = -648066588;
        }
        0FI.A0C(i3, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.widget.text.BetterTextView
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        int A05 = 0FI.A05(2056102130);
        if (this.A0B == null) {
            z = super.onTouchEvent(motionEvent);
            i = 563398155;
        } else if (this.A06 instanceof Spanned) {
            int action = motionEvent.getAction();
            z = true;
            if (action == 1 || action == 0) {
                int x = (((int) motionEvent.getX()) - getPaddingLeft()) + getScrollX();
                int y = (((int) motionEvent.getY()) - getPaddingTop()) + getScrollY();
                int i2 = x - this.A09;
                int i3 = y - this.A0A;
                if (i2 < 0 || i2 > A01() || i3 < 0 || i3 > A00()) {
                    z = super.onTouchEvent(motionEvent);
                    i = -1525408081;
                } else {
                    int offsetForHorizontal = this.A0B.getOffsetForHorizontal(this.A0B.getLineForVertical(y), i2);
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) this.A06).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                    if (clickableSpanArr.length != 0) {
                        if (action == 1) {
                            clickableSpanArr[0].onClick(this);
                        }
                        i = 984001864;
                    } else {
                        z = super.onTouchEvent(motionEvent);
                        i = 1229019035;
                    }
                }
            } else {
                z = super.onTouchEvent(motionEvent);
                i = 1613342457;
            }
        } else {
            z = super.onTouchEvent(motionEvent);
            i = 1783956658;
        }
        0FI.A0B(i, A05);
        return z;
    }
}
