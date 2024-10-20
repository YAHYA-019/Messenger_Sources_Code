package com.facebookpay.form.view;

import X.0FI;
import X.0Pz;
import X.0Q8;
import X.11T;
import X.4YU;
import X.7zO;
import X.C00m;
import X.C06014fk;
import X.DKB;
import X.Q2O;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: FormLayout.class */
public class FormLayout extends TableLayout {
    public float A00;
    public Q2O A01;
    public C00m A02;

    public FormLayout(Context context) {
        this(context, null);
        throw 0Q8.createAndThrow();
    }

    public FormLayout(Context context, AttributeSet attributeSet) {
        C06014fk.A07();
        throw 0Pz.A04(DKB.A00(286), 0);
    }

    public /* synthetic */ FormLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
        throw 0Q8.createAndThrow();
    }

    @Override // android.widget.TableLayout, android.view.ViewGroup
    public void addView(View view) {
        11T.A0F(view, 0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        11T.A0I(layoutParams, "null cannot be cast to non-null type android.widget.TableRow.LayoutParams");
        float f = ((LinearLayout.LayoutParams) layoutParams).weight;
        Context A08 = 4YU.A08(this);
        TypedValue typedValue = new TypedValue();
        A08.getTheme().resolveAttribute(2130969575, typedValue, true);
        int dimension = (int) typedValue.getDimension(7zO.A0I(A08));
        float f2 = this.A00;
        boolean z = true;
        if (f2 != 0.0f && f2 + f <= 1.0f) {
            z = false;
        }
        if (z) {
            this.A00 = 0.0f;
            View tableRow = new TableRow(A08);
            float f3 = 0.0f / 0.0f;
            TableLayout.LayoutParams layoutParams2 = new TableLayout.LayoutParams(-1, -2);
            if (getChildCount() > 0) {
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
            }
            addView(tableRow, layoutParams2);
        } else {
            View childAt = getChildAt(getChildCount() - 1);
            11T.A0I(childAt, "null cannot be cast to non-null type android.widget.TableRow");
            ViewGroup viewGroup = (ViewGroup) childAt;
            ViewGroup.LayoutParams layoutParams3 = viewGroup.getChildAt(viewGroup.getChildCount() - 1).getLayoutParams();
            11T.A0I(layoutParams3, "null cannot be cast to non-null type android.widget.TableRow.LayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = dimension;
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            11T.A0I(layoutParams4, "null cannot be cast to non-null type android.widget.TableRow.LayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = dimension;
        }
        this.A00 += f;
        View childAt2 = getChildAt(getChildCount() - 1);
        11T.A0I(childAt2, "null cannot be cast to non-null type android.widget.TableRow");
        ((ViewGroup) childAt2).addView(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(1312790527);
        super.onAttachedToWindow();
        Q2O q2o = this.A01;
        if (q2o != null) {
            q2o.A04.observeForever(null);
        }
        0FI.A0C(-944951535, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(519839021);
        super.onDetachedFromWindow();
        Q2O q2o = this.A01;
        if (q2o != null) {
            q2o.A04.removeObserver(null);
        }
        0FI.A0C(-1439790898, A06);
    }
}
