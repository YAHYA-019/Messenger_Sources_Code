package androidx.appcompat.widget;

import X.0FI;
import X.0Sk;
import X.1BK;
import X.53Y;
import X.53Z;
import X.AbF;
import X.AnonymousClass001;
import X.DKC;
import X.DKD;
import X.DKG;
import X.JQx;
import X.JQy;
import X.JZu;
import X.KTh;
import X.LLc;
import X.LQD;
import X.LQO;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: ActionBarContextView.class */
public class ActionBarContextView extends ViewGroup {
    public int A00;
    public View A01;
    public View A02;
    public LinearLayout A03;
    public LLc A04;
    public 0Sk A05;
    public CharSequence A06;
    public CharSequence A07;
    public boolean A08;
    public boolean A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public View A0D;
    public TextView A0E;
    public TextView A0F;
    public boolean A0G;
    public ActionMenuView A0H;
    public final Context A0I;
    public final LQO A0J;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130968630);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        this.A0J = new LQO(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(2130968594, typedValue, true) || (i2 = typedValue.resourceId) == 0) {
            this.A0I = context;
        } else {
            this.A0I = new ContextThemeWrapper(context, i2);
        }
        53Z A0D = DKD.A0D(context, attributeSet, 53Y.A03, i, 0);
        setBackground(A0D.A01(0));
        TypedArray typedArray = A0D.A02;
        this.A0C = typedArray.getResourceId(5, 0);
        this.A0B = typedArray.getResourceId(4, 0);
        this.A00 = typedArray.getLayoutDimension(3, 0);
        this.A0A = typedArray.getResourceId(2, 2132541445);
        typedArray.recycle();
    }

    public static int A00(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
            return -measuredWidth;
        }
        view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        return measuredWidth;
    }

    public static void A01(ActionBarContextView actionBarContextView) {
        if (actionBarContextView.A03 == null) {
            Context context = actionBarContextView.getContext();
            LayoutInflater.from(context).inflate(2132541441, actionBarContextView);
            LinearLayout linearLayout = (LinearLayout) actionBarContextView.getChildAt(actionBarContextView.getChildCount() - 1);
            actionBarContextView.A03 = linearLayout;
            actionBarContextView.A0F = AbF.A06(linearLayout, 2131361873);
            actionBarContextView.A0E = AbF.A06(actionBarContextView.A03, 2131361871);
            int i = actionBarContextView.A0C;
            if (i != 0) {
                actionBarContextView.A0F.setTextAppearance(context, i);
            }
            int i2 = actionBarContextView.A0B;
            if (i2 != 0) {
                actionBarContextView.A0E.setTextAppearance(context, i2);
            }
        }
        actionBarContextView.A0F.setText(actionBarContextView.A07);
        actionBarContextView.A0E.setText(actionBarContextView.A06);
        boolean A1V = JQx.A1V(actionBarContextView.A07);
        boolean A1V2 = JQx.A1V(actionBarContextView.A06);
        int i3 = 0;
        actionBarContextView.A0E.setVisibility(DKG.A00(A1V2 ? 1 : 0));
        LinearLayout linearLayout2 = actionBarContextView.A03;
        if (!A1V && !A1V2) {
            i3 = 8;
        }
        linearLayout2.setVisibility(i3);
        if (actionBarContextView.A03.getParent() == null) {
            actionBarContextView.addView(actionBarContextView.A03);
        }
    }

    public void A04() {
        removeAllViews();
        this.A02 = null;
        this.A0H = null;
        this.A04 = null;
        View view = this.A0D;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A05(X.KTL r302) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.A05(X.KTL):void");
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, 53Y.A00, 2130968597, 0);
        this.A00 = obtainStyledAttributes.getLayoutDimension(13, 0);
        obtainStyledAttributes.recycle();
        LLc lLc = this.A04;
        if (lLc != null) {
            lLc.A00 = KTh.A00(lLc.A01);
            LQD lqd = lLc.A05;
            if (lqd != null) {
                lqd.A0D(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-474531504);
        super.onDetachedFromWindow();
        LLc lLc = this.A04;
        if (lLc != null) {
            lLc.A01();
            JZu jZu = this.A04.A08;
            if (jZu != null) {
                jZu.A01();
            }
        }
        0FI.A0C(1387246402, A06);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.A0G = false;
        }
        if (!this.A0G) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.A0G = true;
                }
                return true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.A0G = false;
            return true;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        boolean z2 = true;
        if (getLayoutDirection() == 1) {
            paddingLeft = JQx.A0I(this, i3 - i);
        } else {
            z2 = false;
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.A01;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams A0I = DKC.A0I(this.A01);
            if (z2) {
                int i7 = A0I.rightMargin;
                i5 = A0I.leftMargin;
                i6 = paddingLeft - i7;
            } else {
                int i8 = A0I.leftMargin;
                i5 = A0I.rightMargin;
                i6 = paddingLeft + i8;
            }
            int A00 = i6 + A00(this.A01, i6, paddingTop, paddingTop2, z2);
            int i9 = A00 + i5;
            if (z2) {
                i9 = A00 - i5;
            }
            paddingLeft = i9;
        }
        LinearLayout linearLayout = this.A03;
        if (linearLayout != null && this.A02 == null && linearLayout.getVisibility() != 8) {
            paddingLeft += A00(this.A03, paddingLeft, paddingTop, paddingTop2, z2);
        }
        View view2 = this.A02;
        if (view2 != null) {
            A00(view2, paddingLeft, paddingTop, paddingTop2, z2);
        }
        int paddingLeft2 = z2 ? getPaddingLeft() : JQx.A0I(this, i3 - i);
        ActionMenuView actionMenuView = this.A0H;
        if (actionMenuView != null) {
            A00(actionMenuView, paddingLeft2, paddingTop, paddingTop2, !z2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw 1BK.A0i(AnonymousClass001.A0X(this), " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw 1BK.A0i(AnonymousClass001.A0X(this), " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i);
        int i4 = this.A00;
        if (i4 <= 0) {
            i4 = View.MeasureSpec.getSize(i2);
        }
        int A07 = JQy.A07(this);
        int A09 = JQy.A09(this, size);
        int i5 = i4 - A07;
        int i6 = (-1) << (-1);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, i6);
        View view = this.A01;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(A09, i6), makeMeasureSpec);
            int A0C = JQx.A0C(A09, view.getMeasuredWidth(), 0);
            ViewGroup.MarginLayoutParams A0I = DKC.A0I(this.A01);
            A09 = A0C - (A0I.leftMargin + A0I.rightMargin);
        }
        ActionMenuView actionMenuView = this.A0H;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            ActionMenuView actionMenuView2 = this.A0H;
            actionMenuView2.measure(View.MeasureSpec.makeMeasureSpec(A09, i6), makeMeasureSpec);
            A09 = JQx.A0C(A09, actionMenuView2.getMeasuredWidth(), 0);
        }
        LinearLayout linearLayout = this.A03;
        if (linearLayout != null && this.A02 == null) {
            if (this.A09) {
                this.A03.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.A03.getMeasuredWidth();
                boolean z = false;
                if (measuredWidth <= A09) {
                    z = true;
                    A09 -= measuredWidth;
                }
                this.A03.setVisibility(z ? 0 : 8);
            } else {
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(A09, i6), makeMeasureSpec);
                A09 = JQx.A0C(A09, linearLayout.getMeasuredWidth(), 0);
            }
        }
        View view2 = this.A02;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i7 = layoutParams.width;
            if (i7 != -2) {
                i6 = 1073741824;
                if (i7 >= 0) {
                    A09 = Math.min(i7, A09);
                }
            }
            int i8 = layoutParams.height;
            if (i8 == -2) {
                i3 = (-1) << (-1);
            } else if (i8 >= 0) {
                i5 = Math.min(i8, i5);
            }
            JQx.A1A(this.A02, i5, i3, View.MeasureSpec.makeMeasureSpec(A09, i6));
        }
        if (this.A00 <= 0) {
            int childCount = getChildCount();
            i4 = 0;
            for (int i9 = 0; i9 < childCount; i9++) {
                int measuredHeight = getChildAt(i9).getMeasuredHeight() + A07;
                if (measuredHeight > i4) {
                    i4 = measuredHeight;
                }
            }
        }
        setMeasuredDimension(size, i4);
    }

    @Override // android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = 0FI.A05(1720691346);
        int A052 = 0FI.A05(-756703698);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A08 = false;
        }
        if (!this.A08) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.A08 = true;
                }
                0FI.A0B(-656565677, A052);
                0FI.A0B(1051507495, A05);
                return true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.A08 = false;
        }
        0FI.A0B(-656565677, A052);
        0FI.A0B(1051507495, A05);
        return true;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            0Sk r0 = this.A05;
            if (r0 != null) {
                r0.A01();
            }
            super.setVisibility(i);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
