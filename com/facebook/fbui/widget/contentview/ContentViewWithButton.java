package com.facebook.fbui.widget.contentview;

import X.0S2;
import X.AnonymousClass001;
import X.C1oo;
import X.C2141Dex;
import X.DKC;
import X.DP9;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.fbui.widget.layout.ImageBlockLayout;

/* loaded from: ContentViewWithButton.class */
public class ContentViewWithButton extends ContentView {
    public int A00;
    public int A01;
    public Drawable A02;
    public final Rect A03;

    public ContentViewWithButton(Context context) {
        this(context, null);
    }

    public ContentViewWithButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969266);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContentViewWithButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View view;
        int i2;
        this.A03 = DKC.A0C();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0S, i, 0);
        if (this.A0K == null) {
            Button button = new Button(getContext());
            button.setCompoundDrawablePadding(0);
            this.A0K = button;
            DP9 c2141Dex = new C2141Dex();
            c2141Dex.A02 = true;
            c2141Dex.A00 = obtainStyledAttributes.getInt(2, -1);
            addView(this.A0K, c2141Dex);
        }
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable != null) {
            View view2 = this.A0K;
            if (!(view2 instanceof TextView)) {
                throw AnonymousClass001.A0N("Action button is not an instanceof TextView");
            }
            ((TextView) view2).setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        int integer = obtainStyledAttributes.getInteger(6, 0);
        if (integer > 0) {
            Integer num = 0S2.A00(4)[integer];
            if (num == 0S2.A01) {
                Drawable drawable2 = getContext().getDrawable(2132410804);
                View view3 = this.A0K;
                if (view3 != null) {
                    view3.setBackgroundDrawable(drawable2);
                }
                i2 = 2132608013;
            } else if (num == 0S2.A0C) {
                Drawable drawable3 = getContext().getDrawable(2132410801);
                View view4 = this.A0K;
                if (view4 != null) {
                    view4.setBackgroundDrawable(drawable3);
                }
                i2 = 2132608010;
            } else if (num == 0S2.A0N) {
                Drawable drawable4 = getContext().getDrawable(2132410807);
                View view5 = this.A0K;
                if (view5 != null) {
                    view5.setBackgroundDrawable(drawable4);
                }
                i2 = 2132608016;
            } else {
                View view6 = this.A0K;
                if (view6 != null) {
                    view6.setBackgroundDrawable(null);
                }
                i2 = 2132608031;
            }
            View view7 = this.A0K;
            if (!(view7 instanceof TextView)) {
                throw AnonymousClass001.A0N("Action button is not an instanceof TextView");
            }
            ((TextView) view7).setTextAppearance(getContext(), i2);
        }
        Drawable drawable5 = obtainStyledAttributes.getDrawable(0);
        if (drawable5 != null && (view = this.A0K) != null) {
            view.setBackgroundDrawable(drawable5);
        }
        int resourceId = obtainStyledAttributes.getResourceId(4, 0);
        if (resourceId > 0) {
            View view8 = this.A0K;
            if (!(view8 instanceof TextView)) {
                throw AnonymousClass001.A0N("Action button is not an instanceof TextView");
            }
            ((TextView) view8).setText(resourceId);
        } else {
            CharSequence text = obtainStyledAttributes.getText(4);
            View view9 = this.A0K;
            if (!(view9 instanceof TextView)) {
                throw AnonymousClass001.A0N("Action button is not an instanceof TextView");
            }
            ((TextView) view9).setText(text);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(5, 0);
        if (resourceId2 > 0) {
            View view10 = this.A0K;
            if (!(view10 instanceof TextView)) {
                throw AnonymousClass001.A0N("Action button is not an instanceof TextView");
            }
            ((TextView) view10).setTextAppearance(getContext(), resourceId2);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        if (((ImageBlockLayout) this).A00 != dimensionPixelSize) {
            ((ImageBlockLayout) this).A00 = dimensionPixelSize;
            requestLayout();
        }
        Drawable drawable6 = obtainStyledAttributes.getDrawable(7);
        if (this.A02 != drawable6) {
            this.A02 = drawable6;
            boolean z = false;
            if (drawable6 != null) {
                this.A01 = drawable6.getIntrinsicWidth();
            } else {
                this.A01 = 0;
            }
            setWillNotDraw(this.A02 == null ? true : z);
            requestLayout();
        }
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        if (this.A00 != dimensionPixelSize2) {
            this.A00 = dimensionPixelSize2;
            requestLayout();
        }
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(9, 0);
        if (this.A01 != dimensionPixelSize3) {
            this.A01 = dimensionPixelSize3;
            requestLayout();
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        View view;
        View view2;
        super/*android.view.View*/.onDraw(canvas);
        Drawable drawable = this.A02;
        if (drawable == null || (view = this.A0K) == null || view.getVisibility() == 8 || (view2 = this.A0K) == null) {
            return;
        }
        ViewGroup.MarginLayoutParams A0I = DKC.A0I(view2);
        int measuredWidth = getLayoutDirection() == 0 ? ((((getMeasuredWidth() - A08()) - this.A0K.getMeasuredWidth()) - A0I.leftMargin) - A0I.rightMargin) - this.A01 : A07() + this.A0K.getMeasuredWidth() + A0I.leftMargin + A0I.rightMargin;
        Rect rect = this.A03;
        int paddingTop = getPaddingTop() + ((ImageBlockLayout) this).A05;
        int i = this.A00;
        rect.set(measuredWidth, paddingTop + i, this.A01 + measuredWidth, (getMeasuredHeight() - (getPaddingBottom() + ((ImageBlockLayout) this).A01)) - i);
        drawable.setBounds(rect);
        drawable.draw(canvas);
    }
}
