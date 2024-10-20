package com.google.android.material.appbar;

import X.0FI;
import X.6LS;
import X.6Lc;
import X.6Ld;
import X.6Le;
import X.6Lz;
import X.DKD;
import X.DKG;
import X.GOn;
import X.GOo;
import X.JQx;
import X.JQz;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

/* loaded from: MaterialToolbar.class */
public class MaterialToolbar extends Toolbar {
    public Integer A00;
    public boolean A01;
    public boolean A02;

    public MaterialToolbar(Context context) {
        this(context, null);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130972111);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(6LS.A00(context, attributeSet, i, 2132608638), attributeSet, i);
        Context context2 = getContext();
        TypedArray A00 = 6Lc.A00(context2, attributeSet, 6Ld.A0L, new int[0], i, 2132608638);
        if (A00.hasValue(0)) {
            float f = 0.0f / 0.0f;
            this.A00 = DKG.A12(A00, 0, -1);
            Drawable A0E = A0E();
            if (A0E != null) {
                A0P(A0E);
            }
        }
        this.A02 = A00.getBoolean(2, false);
        this.A01 = A00.getBoolean(1, false);
        A00.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            6Le r0 = new 6Le();
            JQz.A1F(r0, background != null ? ((ColorDrawable) background).getColor() : 0);
            r0.A0G(context2);
            r0.A0F(getElevation());
            setBackground(r0);
        }
    }

    private void A00(Pair pair, View view) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(GOo.A03(pair) - i, 0), Math.max(i2 - GOo.A02(pair), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            view.measure(DKD.A00(i2 - i), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void A0P(Drawable drawable) {
        Integer num;
        if (drawable != null && (num = this.A00) != null) {
            drawable.setTint(num.intValue());
        }
        super.A0P(drawable);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-866186139);
        super.onAttachedToWindow();
        6Le background = getBackground();
        if (background instanceof 6Le) {
            6Lz.A00(this, background);
        }
        0FI.A0C(-1079993379, A06);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextView textView;
        TextView textView2;
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = this.A02;
        if (z2 || this.A01) {
            CharSequence charSequence = this.A0K;
            int i5 = 0;
            while (true) {
                if (i5 >= getChildCount()) {
                    textView = null;
                    break;
                }
                View childAt = getChildAt(i5);
                if (childAt instanceof TextView) {
                    textView = (TextView) childAt;
                    if (TextUtils.equals(textView.getText(), charSequence)) {
                        break;
                    }
                }
                i5++;
            }
            CharSequence charSequence2 = this.A0J;
            int i6 = 0;
            while (true) {
                if (i6 >= getChildCount()) {
                    textView2 = null;
                    break;
                }
                View childAt2 = getChildAt(i6);
                if (childAt2 instanceof TextView) {
                    textView2 = (TextView) childAt2;
                    if (TextUtils.equals(textView2.getText(), charSequence2)) {
                        break;
                    }
                }
                i6++;
            }
            if (textView == null && textView2 == null) {
                return;
            }
            int measuredWidth = getMeasuredWidth();
            int i7 = measuredWidth / 2;
            int paddingLeft = getPaddingLeft();
            int A0I = JQx.A0I(this, measuredWidth);
            int i8 = 0;
            while (true) {
                int i9 = i8;
                if (i9 >= getChildCount()) {
                    break;
                }
                View childAt3 = getChildAt(i9);
                if (childAt3.getVisibility() != 8 && childAt3 != textView && childAt3 != textView2) {
                    if (childAt3.getRight() < i7 && childAt3.getRight() > paddingLeft) {
                        paddingLeft = childAt3.getRight();
                    }
                    if (childAt3.getLeft() > i7 && childAt3.getLeft() < A0I) {
                        A0I = childAt3.getLeft();
                    }
                }
                i8 = i9 + 1;
            }
            Pair A0G = GOn.A0G(Integer.valueOf(paddingLeft), Integer.valueOf(A0I));
            if (z2 && textView != null) {
                A00(A0G, textView);
            }
            if (!this.A01 || textView2 == null) {
                return;
            }
            A00(A0G, textView2);
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        6Le background = getBackground();
        if (background instanceof 6Le) {
            background.A0F(f);
        }
    }
}
