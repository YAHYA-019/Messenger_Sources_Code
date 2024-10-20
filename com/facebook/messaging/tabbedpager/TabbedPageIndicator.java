package com.facebook.messaging.tabbedpager;

import X.0NL;
import X.0PY;
import X.AbH;
import X.C1oo;
import X.GOo;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

/* loaded from: TabbedPageIndicator.class */
public class TabbedPageIndicator extends View implements 0PY {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public RecyclerView A06;
    public 0PY A07;
    public ViewPager A08;
    public int A09;
    public final Paint A0A;

    public TabbedPageIndicator(Context context) {
        super(context);
        this.A0A = GOo.A0B();
        A00(context, null);
    }

    public TabbedPageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0A = GOo.A0B();
        A00(context, attributeSet);
    }

    public TabbedPageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0A = GOo.A0B();
        A00(context, attributeSet);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0l);
        this.A02 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.A03 = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.A04 = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        Context context2 = getContext();
        this.A09 = obtainStyledAttributes.getColor(0, context2.getColor(2132214037));
        this.A01 = obtainStyledAttributes.getColor(1, context2.getColor(2132214038));
        obtainStyledAttributes.recycle();
        AbH.A1K(this, this.A09);
        Paint paint = this.A0A;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(this.A01);
    }

    public void CAd(int i) {
        0PY r0 = this.A07;
        if (r0 != null) {
            r0.CAd(i);
        }
    }

    public void CAe(int i, float f, int i2) {
        invalidate();
        this.A05 = i;
        this.A00 = f;
        0PY r0 = this.A07;
        if (r0 != null) {
            r0.CAe(i, f, i2);
        }
    }

    public void CAf(int i) {
        0PY r0 = this.A07;
        if (r0 != null) {
            r0.CAf(i);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        0NL A0H;
        0NL A0H2;
        super.onDraw(canvas);
        ViewPager viewPager = this.A08;
        if (viewPager != null) {
            int A0C = viewPager.A0H().A0C();
            if (A0C == 0) {
                f = 0.0f;
            } else {
                f = this.A02;
                if (f == 0.0f) {
                    f = ((getMeasuredWidth() - this.A03) - this.A04) / A0C;
                }
            }
            float f3 = this.A03;
            ViewPager viewPager2 = this.A08;
            float f4 = f3 + ((((viewPager2 == null || (A0H2 = viewPager2.A0H()) == null || A0H2.A0C() == 0) ? 0.0f : this.A00) + this.A05) * f);
            RecyclerView recyclerView = this.A06;
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.A0F;
            float max = Math.max(f4 - (recyclerView.getChildAt(0) != null ? (r0.getWidth() * linearLayoutManager.A1h()) - r0.getLeft() : 0.0f), this.A03);
            int A0C2 = this.A08.A0H().A0C();
            if (A0C2 == 0) {
                f2 = 0.0f;
            } else {
                f2 = this.A02;
                if (f2 == 0.0f) {
                    f2 = ((getMeasuredWidth() - this.A03) - this.A04) / A0C2;
                }
            }
            float f5 = this.A03;
            ViewPager viewPager3 = this.A08;
            float f6 = f5 + ((((viewPager3 == null || (A0H = viewPager3.A0H()) == null || A0H.A0C() == 0) ? 0.0f : this.A00) + 1.0f + this.A05) * f2);
            RecyclerView recyclerView2 = this.A06;
            LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) recyclerView2.A0F;
            canvas.drawRect(max, 0.0f, Math.min(f6 - (recyclerView2.getChildAt(0) != null ? (r0.getWidth() * linearLayoutManager2.A1h()) - r0.getLeft() : 0.0f), getMeasuredWidth() - this.A04), getMeasuredHeight(), this.A0A);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        setBackgroundDrawable(i == 0 ? new ColorDrawable(this.A09) : new ColorDrawable(i));
    }
}
