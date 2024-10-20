package com.google.android.material.internal;

import X.0Cs;
import X.0FI;
import X.6Lc;
import X.6Ld;
import X.C0Ad;
import X.C2957Jek;
import X.DKC;
import X.DKG;
import X.JQx;
import X.LQF;
import X.MHk;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.acra.constants.ActionId;

/* loaded from: NavigationMenuItemView.class */
public class NavigationMenuItemView extends LinearLayoutCompat implements MHk {
    public static final int[] A0C = {R.attr.state_checked};
    public int A00;
    public int A01;
    public FrameLayout A02;
    public LQF A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public Drawable A07;
    public final Rect A08;
    public final Rect A09;
    public final CheckedTextView A0A;
    public final 0Cs A0B;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A09 = DKC.A0C();
        this.A08 = DKC.A0C();
        this.A00 = ActionId.RTMP_CONNECTION_INTERCEPTED;
        this.A06 = true;
        this.A05 = false;
        TypedArray A00 = 6Lc.A00(context, attributeSet, 6Ld.A0A, new int[0], i, 0);
        this.A00 = A00.getInt(1, ActionId.RTMP_CONNECTION_INTERCEPTED);
        Drawable drawable = A00.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.A06 = A00.getBoolean(2, true);
        A00.recycle();
        C2957Jek c2957Jek = new C2957Jek(this, 5);
        this.A0B = c2957Jek;
        setOrientation(0);
        LayoutInflater.from(context).inflate(2132541845, (ViewGroup) this, true);
        this.A01 = context.getResources().getDimensionPixelSize(2132279310);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(2131363610);
        this.A0A = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C0Ad.A0B(checkedTextView, c2957Jek);
    }

    @Override // X.MHk
    public LQF AsP() {
        return this.A03;
    }

    @Override // X.MHk
    public void BPH(LQF lqf, int i) {
        ViewGroup.LayoutParams layoutParams;
        int i2;
        StateListDrawable stateListDrawable;
        this.A03 = lqf;
        int itemId = lqf.getItemId();
        if (itemId > 0) {
            setId(itemId);
        }
        setVisibility(DKG.A00(lqf.isVisible() ? 1 : 0));
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(2130969145, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(A0C, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(View.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        boolean isCheckable = lqf.isCheckable();
        refreshDrawableState();
        if (this.A04 != isCheckable) {
            this.A04 = isCheckable;
            this.A0B.A0T(this.A0A, EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
        }
        boolean isChecked = lqf.isChecked();
        refreshDrawableState();
        CheckedTextView checkedTextView = this.A0A;
        checkedTextView.setChecked(isChecked);
        setEnabled(lqf.isEnabled());
        checkedTextView.setText(lqf.getTitle());
        Drawable icon = lqf.getIcon();
        if (icon != null) {
            int i3 = this.A01;
            icon.setBounds(0, 0, i3, i3);
        }
        checkedTextView.setCompoundDrawablesRelative(icon, null, null, null);
        View actionView = lqf.getActionView();
        if (actionView != null) {
            FrameLayout frameLayout = this.A02;
            if (frameLayout == null) {
                frameLayout = (FrameLayout) ((ViewStub) findViewById(2131363609)).inflate();
                this.A02 = frameLayout;
            }
            frameLayout.removeAllViews();
            this.A02.addView(actionView);
        }
        setContentDescription(lqf.getContentDescription());
        setTooltipText(lqf.getTooltipText());
        LQF lqf2 = this.A03;
        if (lqf2.getTitle() == null && lqf2.getIcon() == null && this.A03.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout2 = this.A02;
            if (frameLayout2 == null) {
                return;
            }
            layoutParams = frameLayout2.getLayoutParams();
            i2 = -1;
        } else {
            checkedTextView.setVisibility(0);
            FrameLayout frameLayout3 = this.A02;
            if (frameLayout3 == null) {
                return;
            }
            layoutParams = frameLayout3.getLayoutParams();
            i2 = -2;
        }
        layoutParams.width = i2;
        this.A02.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.A07;
        if (drawable != null) {
            if (this.A05) {
                this.A05 = false;
                Rect rect = this.A09;
                Rect rect2 = this.A08;
                int right = getRight() - getLeft();
                int A0H = JQx.A0H(this, getBottom());
                if (this.A06) {
                    rect.set(0, 0, right, A0H);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), JQx.A0I(this, right), A0H - getPaddingBottom());
                }
                Gravity.apply(this.A00, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.A07;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A07;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        DKC.A1O(this.A07, this);
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.A07;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.A00;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A07;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        LQF lqf = this.A03;
        if (lqf != null && lqf.isCheckable() && lqf.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A0C);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A05 = z | this.A05;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(103646230);
        super.onSizeChanged(i, i2, i3, i4);
        this.A05 = true;
        0FI.A0C(-1005867068, A06);
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.A07;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.A07);
            }
            this.A07 = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    DKC.A1O(drawable, this);
                }
                if (this.A00 == 119) {
                    drawable.getPadding(DKC.A0C());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.A00 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & ActionId.MISSED_EVENT) == 0) {
                i |= 48;
            }
            this.A00 = i;
            if (i == 119 && this.A07 != null) {
                this.A07.getPadding(DKC.A0C());
            }
            requestLayout();
        }
    }

    public void setMaxLines(int i) {
        this.A0A.setMaxLines(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.A0A.setTextColor(colorStateList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r302 == r301.A07) goto L6;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean verifyDrawable(android.graphics.drawable.Drawable r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            boolean r0 = super.verifyDrawable(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L16
            r0 = r301
            android.graphics.drawable.Drawable r0 = r0.A07
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = r304
            if (r0 != r1) goto L18
        L16:
            r0 = 1
            r303 = r0
        L18:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.NavigationMenuItemView.verifyDrawable(android.graphics.drawable.Drawable):boolean");
    }
}
