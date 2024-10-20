package com.facebook.fbui.widget.text;

import X.0FI;
import X.AnonymousClass001;
import X.C0d7;
import X.C0d8;
import X.C1oo;
import X.DKC;
import X.DKF;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.widget.text.BetterTextView;

/* loaded from: ImageWithTextView.class */
public class ImageWithTextView extends BetterTextView {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public Drawable A05;
    public Integer A06;
    public boolean A07;
    public boolean A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;

    /* JADX WARN: Multi-variable type inference failed */
    public ImageWithTextView(Context context) {
        super(context);
        DKF.A1M(this);
        setGravity(17);
    }

    public ImageWithTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        DKF.A1M(this);
        A01(context, attributeSet, 0);
    }

    public ImageWithTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        DKF.A1M(this);
        A01(context, attributeSet, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A01(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A1k, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            A05(resourceId);
        }
        this.A04 = obtainStyledAttributes.getInteger(1, 0);
        obtainStyledAttributes.recycle();
        setGravity(17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A03(Drawable drawable, ImageWithTextView imageWithTextView) {
        Drawable drawable2 = imageWithTextView.A05;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            imageWithTextView.A05 = drawable;
            if (drawable == null) {
                imageWithTextView.A03 = 0;
                imageWithTextView.A02 = 0;
                return;
            }
            drawable.setCallback(imageWithTextView);
            if (imageWithTextView.A05.isStateful()) {
                DKC.A1O(imageWithTextView.A05, imageWithTextView);
            }
            imageWithTextView.A03 = imageWithTextView.A05.getIntrinsicWidth();
            int intrinsicHeight = imageWithTextView.A05.getIntrinsicHeight();
            imageWithTextView.A02 = intrinsicHeight;
            imageWithTextView.A05.setBounds(0, 0, imageWithTextView.A03, intrinsicHeight);
            imageWithTextView.refreshDrawableState();
            A04(imageWithTextView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A04(ImageWithTextView imageWithTextView) {
        float f;
        if (imageWithTextView.A05 != null) {
            if (TextUtils.isEmpty(imageWithTextView.getText())) {
                f = imageWithTextView.A03 / 2.0f;
            } else {
                int i = imageWithTextView.A04;
                f = 0.0f;
                if (i != 0 && i != 2) {
                    imageWithTextView.A09 = imageWithTextView.A03 / 2.0f;
                    if (i == 1) {
                        f = imageWithTextView.A02;
                    }
                    imageWithTextView.A0A = f;
                    return;
                }
                if (!imageWithTextView.A07 ? i == 2 : i == 0) {
                    f = imageWithTextView.A03;
                }
            }
            imageWithTextView.A09 = f;
            imageWithTextView.A0A = imageWithTextView.A02 / 2.0f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A05(int i) {
        if (i != 0) {
            this.A08 = true;
            A03(getContext().getDrawable(i), this);
        } else {
            this.A08 = false;
        }
        requestLayout();
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A06(boolean z) {
        if (this.A08 != z) {
            this.A08 = z;
            requestLayout();
            invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void drawableStateChanged() {
        super/*android.widget.TextView*/.drawableStateChanged();
        Drawable drawable = this.A05;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        DKC.A1O(this.A05, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getCompoundPaddingBottom() {
        int compoundPaddingBottom = super/*android.widget.TextView*/.getCompoundPaddingBottom();
        if (this.A08 && this.A05 != null && this.A04 == 3) {
            compoundPaddingBottom += this.A02 + getCompoundDrawablePadding();
        }
        return compoundPaddingBottom;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super/*android.widget.TextView*/.getCompoundPaddingLeft();
        if (this.A08 && this.A05 != null) {
            boolean z = this.A07;
            int i = this.A04;
            if (!z ? i == 2 : i == 0) {
                compoundPaddingLeft += this.A03 + getCompoundDrawablePadding();
            }
        }
        return compoundPaddingLeft;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getCompoundPaddingRight() {
        int compoundPaddingRight = super/*android.widget.TextView*/.getCompoundPaddingRight();
        if (this.A08 && this.A05 != null) {
            boolean z = this.A07;
            int i = this.A04;
            if (!z ? i == 0 : i == 2) {
                compoundPaddingRight += this.A03 + getCompoundDrawablePadding();
            }
        }
        return compoundPaddingRight;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getCompoundPaddingTop() {
        int compoundPaddingTop = super/*android.widget.TextView*/.getCompoundPaddingTop();
        if (this.A08 && this.A05 != null && this.A04 == 1) {
            compoundPaddingTop += this.A02 + getCompoundDrawablePadding();
        }
        return compoundPaddingTop;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void invalidateDrawable(Drawable drawable) {
        if (this.A05 != drawable) {
            super/*android.widget.TextView*/.invalidateDrawable(drawable);
            return;
        }
        if (drawable != null) {
            this.A03 = drawable.getIntrinsicWidth();
            this.A02 = drawable.getIntrinsicHeight();
            A04(this);
        }
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void jumpDrawablesToCurrentState() {
        super/*android.widget.TextView*/.jumpDrawablesToCurrentState();
        Drawable drawable = this.A05;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.widget.text.BetterTextView
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        Bitmap bitmap;
        super.onDraw(canvas);
        if (!this.A08 || (drawable = this.A05) == null) {
            return;
        }
        if ((drawable instanceof BitmapDrawable) && ((bitmap = ((BitmapDrawable) drawable).getBitmap()) == null || bitmap.isRecycled())) {
            C0d8 c0d8 = C0d7.A00;
            if (c0d8.BTv(6)) {
                c0d8.DBS(ImageWithTextView.class.getSimpleName(), "Drawable in ImageWithTextView was recycled before drawing");
                return;
            }
            return;
        }
        float scrollX = getScrollX() + this.A0B;
        float scrollY = getScrollY() + this.A0C;
        int save = canvas.save();
        canvas.rotate(0.0f, this.A0B, this.A0C);
        if (this.A00 == 1.0f && this.A01 == 1.0f) {
            canvas.translate(scrollX, scrollY);
            this.A05.draw(canvas);
            canvas.translate(-scrollX, -scrollY);
        } else {
            canvas.translate(scrollX, scrollY);
            canvas.scale(this.A00, this.A01, this.A09, this.A0A);
            this.A05.draw(canvas);
        }
        canvas.restoreToCount(save);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.widget.text.BetterTextView
    public void onMeasure(int i, int i2) {
        float f;
        float f2;
        int i3;
        int A06 = 0FI.A06(55814491);
        super.onMeasure(i, i2);
        if (this.A08) {
            this.A07 = AnonymousClass001.A1O(getLayoutDirection());
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            Layout layout = getLayout();
            int i4 = this.A04;
            float f3 = 0.0f;
            if (i4 == 0 || i4 == 2) {
                int i5 = this.A02 + paddingTop + paddingBottom;
                int measuredWidth = getMeasuredWidth();
                setMeasuredDimension(measuredWidth, Math.max(i5, getMeasuredHeight()));
                int compoundDrawablePadding = getCompoundDrawablePadding();
                if (layout != null) {
                    f3 = layout.getLineWidth(0);
                }
                float f4 = this.A03 + compoundDrawablePadding + f3;
                float f5 = measuredWidth;
                float f6 = paddingLeft;
                float f7 = paddingRight;
                int intValue = this.A06.intValue();
                if (intValue == 0) {
                    setGravity(8388627);
                    f = -f6;
                } else if (intValue != 1) {
                    setGravity(17);
                    f = (((f5 - f4) - f6) - f7) / 2.0f;
                } else {
                    setGravity(8388629);
                    f = (f5 - f4) - f6;
                }
                boolean z = this.A07;
                int i6 = this.A04;
                this.A0B = (!z ? i6 == 2 : i6 == 0) ? ((f5 - f) - this.A03) - f7 : f + f6;
                f2 = ((((r0 - paddingTop) - paddingBottom) - this.A02) / 2.0f) + paddingTop;
            } else {
                int max = Math.max((this.A03 + paddingLeft) - paddingRight, getMeasuredWidth());
                int measuredHeight = getMeasuredHeight();
                setMeasuredDimension(max, measuredHeight);
                int compoundDrawablePadding2 = getCompoundDrawablePadding();
                if (layout != null) {
                    f3 = layout.getLineBottom(0);
                }
                int i7 = this.A02;
                float f8 = compoundDrawablePadding2 + i7 + f3;
                this.A0B = ((((max - paddingLeft) - paddingRight) - this.A03) / 2.0f) + paddingLeft;
                float f9 = measuredHeight;
                float f10 = f9 - f8;
                float f11 = paddingTop;
                float f12 = f10 - f11;
                float f13 = paddingBottom;
                float f14 = (f12 - f13) / 2.0f;
                f2 = this.A04 == 1 ? f14 + f11 : ((f9 - f14) - i7) - f13;
            }
            this.A0C = f2;
            i3 = -39834095;
        } else {
            i3 = -379645937;
        }
        0FI.A0C(i3, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super/*android.widget.TextView*/.setText(charSequence, bufferType);
        A04(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (super/*android.widget.TextView*\/.verifyDrawable(r302) != false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean verifyDrawable(android.graphics.drawable.Drawable r302) {
        /*
            r301 = this;
            r0 = r301
            android.graphics.drawable.Drawable r0 = r0.A05
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L19
            r0 = r301
            r1 = r302
            boolean r0 = super/*android.widget.TextView*/.verifyDrawable(r1)
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L1c
        L19:
            r0 = 1
            r305 = r0
        L1c:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbui.widget.text.ImageWithTextView.verifyDrawable(android.graphics.drawable.Drawable):boolean");
    }
}
