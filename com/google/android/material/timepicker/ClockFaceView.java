package com.google.android.material.timepicker;

import X.0Cs;
import X.0Em;
import X.0FI;
import X.5XE;
import X.6Ld;
import X.6Le;
import X.6Lg;
import X.6QO;
import X.6Vj;
import X.C0Ad;
import X.C2957Jek;
import X.C7ua;
import X.DKC;
import X.DKD;
import X.JQz;
import X.L6H;
import X.LKn;
import X.Lm5;
import X.MDL;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;

/* loaded from: ClockFaceView.class */
public class ClockFaceView extends ConstraintLayout implements MDL {
    public float A00;
    public int A01;
    public 6Le A02;
    public String[] A03;
    public final int A04;
    public final ColorStateList A05;
    public final RectF A06;
    public final SparseArray A07;
    public final 0Cs A08;
    public final ClockHandView A09;
    public final Runnable A0A;
    public final float[] A0B;
    public final int[] A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final Rect A0G;

    public ClockFaceView(Context context) {
        this(context, null);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130971085);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(2132542486, this);
        6Le r0 = new 6Le();
        this.A02 = r0;
        6Vj r02 = new 6Vj(0.5f);
        6QO r03 = new 6QO(r0.A00.A0K);
        r03.A02 = r02;
        r03.A03 = r02;
        r03.A01 = r02;
        r03.A00 = r02;
        r0.CuW(new 6Lg(r03));
        JQz.A1F(this.A02, -1);
        setBackground(this.A02);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, 6Ld.A0M, i, 0);
        this.A01 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.A0A = new Lm5(this);
        obtainStyledAttributes.recycle();
        this.A0G = DKC.A0C();
        this.A06 = DKC.A0D();
        this.A07 = DKC.A0E();
        this.A0B = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, 6Ld.A05, i, 2132608633);
        Resources resources = getResources();
        ColorStateList A00 = L6H.A00(context, obtainStyledAttributes2, 1);
        this.A05 = A00;
        LayoutInflater.from(context).inflate(2132542485, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(2131365466);
        this.A09 = clockHandView;
        this.A04 = DKC.A04(resources);
        int colorForState = A00.getColorForState(new int[]{R.attr.state_selected}, A00.getDefaultColor());
        this.A0C = new int[]{colorForState, colorForState, A00.getDefaultColor()};
        clockHandView.A09.add(this);
        int defaultColor = 0Em.A02(context, 2131099651).getDefaultColor();
        ColorStateList A002 = L6H.A00(context, obtainStyledAttributes2, 0);
        setBackgroundColor(A002 != null ? A002.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new LKn(this, 5));
        setFocusable(true);
        obtainStyledAttributes2.recycle();
        this.A08 = new C2957Jek(this, 6);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.A03 = strArr;
        LayoutInflater A0A = DKD.A0A(this);
        SparseArray sparseArray = this.A07;
        int size = sparseArray.size();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            int length = this.A03.length;
            if (i3 >= Math.max(length, size)) {
                this.A0E = resources.getDimensionPixelSize(2131165242);
                this.A0F = resources.getDimensionPixelSize(2131165243);
                this.A0D = resources.getDimensionPixelSize(2132279578);
                return;
            }
            TextView textView = (TextView) sparseArray.get(i3);
            if (i3 >= length) {
                removeView(textView);
                sparseArray.remove(i3);
            } else {
                if (textView == null) {
                    textView = (TextView) A0A.inflate(2132542484, (ViewGroup) this, false);
                    sparseArray.put(i3, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.A03[i3]);
                textView.setTag(2131365475, Integer.valueOf(i3));
                C0Ad.A0B(textView, this.A08);
                textView.setTextColor(this.A05);
            }
            i2 = i3 + 1;
        }
    }

    public static void A00(ClockFaceView clockFaceView) {
        RectF rectF = clockFaceView.A09.A08;
        int i = 0;
        while (true) {
            int i2 = i;
            SparseArray sparseArray = clockFaceView.A07;
            if (i2 >= sparseArray.size()) {
                return;
            }
            TextView textView = (TextView) sparseArray.get(i2);
            if (textView != null) {
                Rect rect = clockFaceView.A0G;
                textView.getDrawingRect(rect);
                rect.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                clockFaceView.offsetDescendantRectToMyCoords(textView, rect);
                RectF rectF2 = clockFaceView.A06;
                rectF2.set(rect);
                textView.getPaint().setShader(!RectF.intersects(rectF, rectF2) ? null : new RadialGradient(rectF.centerX() - rectF2.left, rectF.centerY() - rectF2.top, rectF.width() * 0.5f, clockFaceView.A0C, clockFaceView.A0B, Shader.TileMode.CLAMP));
                textView.invalidate();
            }
            i = i2 + 1;
        }
    }

    public void A05() {
        int childCount = getChildCount();
        int i = 1;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= childCount) {
                break;
            }
            if ("skip".equals(getChildAt(i3).getTag())) {
                i++;
            }
            i2 = i3 + 1;
        }
        5XE r0 = new 5XE();
        r0.A0C(this);
        float f = 0.0f;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getId() != 2131363021 && !"skip".equals(childAt.getTag())) {
                int id = childAt.getId();
                int i5 = this.A01;
                C7ua c7ua = 5XE.A02(r0, id).A03;
                c7ua.A0F = 2131363021;
                c7ua.A0G = i5;
                c7ua.A00 = f;
                f += 360.0f / (childCount - i);
            }
        }
        r0.A0A(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            Runnable runnable = this.A0A;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        int A06 = 0FI.A06(2057602936);
        super.onFinishInflate();
        A05();
        0FI.A0C(-1193058468, A06);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.A03.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A00(this);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        DisplayMetrics A09 = DKD.A09(this);
        int max = (int) (this.A0D / Math.max(Math.max(this.A0E / A09.heightPixels, this.A0F / A09.widthPixels), 1.0f));
        int A00 = DKD.A00(max);
        setMeasuredDimension(max, max);
        super.onMeasure(A00, A00);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            Runnable runnable = this.A0A;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        JQz.A1F(this.A02, i);
    }
}
