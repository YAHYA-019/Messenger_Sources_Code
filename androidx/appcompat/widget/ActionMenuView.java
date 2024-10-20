package androidx.appcompat.widget;

import X.0FI;
import X.4YV;
import X.7zO;
import X.C53n;
import X.DKE;
import X.JQx;
import X.JYz;
import X.JZu;
import X.JaE;
import X.LLT;
import X.LLc;
import X.LQD;
import X.LQF;
import X.MB4;
import X.MDt;
import X.MDu;
import X.MHl;
import X.MKp;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;

/* loaded from: ActionMenuView.class */
public class ActionMenuView extends LinearLayoutCompat implements MDt, MDu {
    public int A00;
    public int A01;
    public int A02;
    public Context A03;
    public C53n A04;
    public LQD A05;
    public LLc A06;
    public MB4 A07;
    public boolean A08;
    public int A09;
    public boolean A0A;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mBaselineAligned = false;
        float f = 7zO.A0I(context).density;
        this.A01 = (int) (56.0f * f);
        this.A00 = (int) (f * 4.0f);
        this.A03 = context;
        this.A02 = 0;
    }

    private boolean A00(int i) {
        boolean z = false;
        if (i != 0) {
            KeyEvent.Callback childAt = getChildAt(i - 1);
            KeyEvent.Callback childAt2 = getChildAt(i);
            if (i < getChildCount() && (childAt instanceof MHl)) {
                z = false | ((MHl) childAt).Bf2();
            }
            if (i > 0 && (childAt2 instanceof MHl)) {
                z |= ((MHl) childAt2).Bf3();
            }
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.MHj, java.lang.Object] */
    public LQD A01() {
        LQD lqd = this.A05;
        if (lqd == null) {
            Context context = getContext();
            LQD lqd2 = new LQD(context);
            this.A05 = lqd2;
            lqd2.A03 = new LLT(this);
            LLc lLc = new LLc(context);
            this.A06 = lLc;
            lLc.A0E = true;
            lLc.A0F = true;
            lLc.A06 = new Object();
            this.A05.A09(this.A03, lLc);
            LLc lLc2 = this.A06;
            lLc2.A07 = this;
            lqd = lLc2.A05;
            this.A05 = lqd;
        }
        return lqd;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
    
        if (r304.gravity <= 0) goto L9;
     */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.JaE generateLayoutParams(android.view.ViewGroup.LayoutParams r302) {
        /*
            r301 = this;
            r0 = r302
            if (r0 == 0) goto L44
            r0 = r302
            boolean r0 = r0 instanceof X.JaE
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L38
            r0 = r302
            X.JaE r0 = (X.JaE) r0
            r302 = r0
            X.JaE r0 = new X.JaE
            r304 = r0
            r0 = r304
            r1 = r302
            r0.<init>(r1)
            r0 = r302
            boolean r0 = r0.A04
            r303 = r0
            r0 = r304
            r1 = r303
            r0.A04 = r1
        L25:
            r0 = r304
            int r0 = r0.gravity
            r303 = r0
            r0 = r303
            if (r0 > 0) goto L36
        L2e:
            r0 = 16
            r303 = r0
            r0 = r304
            r1 = r303
            r0.gravity = r1
        L36:
            r0 = r304
            return r0
        L38:
            X.JaE r0 = new X.JaE
            r304 = r0
            r0 = r304
            r1 = r302
            r0.<init>(r1)
            goto L25
        L44:
            r0 = -2
            r303 = r0
            X.JaE r0 = new X.JaE
            r304 = r0
            r0 = r304
            r1 = r303
            r2 = r303
            r0.<init>(r1, r2)
            r0 = 0
            r303 = r0
            r0 = r304
            r1 = 0
            r0.A04 = r1
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.generateLayoutParams(android.view.ViewGroup$LayoutParams):X.JaE");
    }

    @Override // X.MDu
    public void BPG(LQD lqd) {
        this.A05 = lqd;
    }

    @Override // X.MDt
    public boolean BQD(LQF lqf) {
        return this.A05.A0J(lqf, (MKp) null, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof JaE;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public /* bridge */ /* synthetic */ JYz generateDefaultLayoutParams() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        ((JaE) layoutParams).A04 = false;
        layoutParams.gravity = 16;
        return layoutParams;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        ((JaE) layoutParams).A04 = false;
        layoutParams.gravity = 16;
        return layoutParams;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public /* bridge */ /* synthetic */ JYz generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LLc lLc = this.A06;
        if (lLc != null) {
            lLc.D7M(false);
            if (this.A06.A02()) {
                this.A06.A01();
                this.A06.A03();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-1251837996);
        super.onDetachedFromWindow();
        LLc lLc = this.A06;
        if (lLc != null) {
            lLc.A01();
            JZu jZu = lLc.A08;
            if (jZu != null) {
                jZu.A01();
            }
        }
        0FI.A0C(-1776569546, A06);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int A09;
        int i5;
        if (!this.A0A) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int i7 = this.mDividerWidth;
        int i8 = i3 - i;
        int A0I = JQx.A0I(this, i8) - getPaddingLeft();
        boolean A1U = 4YV.A1U(getLayoutDirection());
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                JaE layoutParams = childAt.getLayoutParams();
                if (layoutParams.A04) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (A00(i11)) {
                        measuredWidth += i7;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (A1U) {
                        i5 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                        A09 = i5 + measuredWidth;
                    } else {
                        A09 = DKE.A09(this) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        i5 = A09 - measuredWidth;
                    }
                    int i12 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i12, A09, measuredHeight + i12);
                    A0I -= measuredWidth;
                    i9 = 1;
                } else {
                    A0I -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    A00(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View A0V = JQx.A0V(this);
            int measuredWidth2 = A0V.getMeasuredWidth();
            int measuredHeight2 = A0V.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i6 - (measuredHeight2 / 2);
            A0V.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? A0I / i15 : 0);
        if (A1U) {
            int A092 = DKE.A09(this);
            int i16 = 0;
            while (true) {
                int i17 = i16;
                if (i17 >= childCount) {
                    return;
                }
                View childAt2 = getChildAt(i17);
                JaE layoutParams2 = childAt2.getLayoutParams();
                if (childAt2.getVisibility() != 8 && !layoutParams2.A04) {
                    int i18 = A092 - ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                    int measuredWidth3 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    int i19 = i6 - (measuredHeight3 / 2);
                    childAt2.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    A092 = i18 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin) + max);
                }
                i16 = i17 + 1;
            }
        } else {
            int paddingLeft = getPaddingLeft();
            int i20 = 0;
            while (true) {
                int i21 = i20;
                if (i21 >= childCount) {
                    return;
                }
                View childAt3 = getChildAt(i21);
                JaE layoutParams3 = childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams3.A04) {
                    int i22 = paddingLeft + ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin;
                    int measuredWidth4 = childAt3.getMeasuredWidth();
                    int measuredHeight4 = childAt3.getMeasuredHeight();
                    int i23 = i6 - (measuredHeight4 / 2);
                    childAt3.layout(i22, i23, i22 + measuredWidth4, measuredHeight4 + i23);
                    paddingLeft = i22 + measuredWidth4 + ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin + max;
                }
                i20 = i21 + 1;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x04f7, code lost:
    
        if (r323 != 1) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01ab, code lost:
    
        if (X.JQx.A1V(r0.getText()) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x022f, code lost:
    
        if (X.JQx.A1V(r333.getText()) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0388, code lost:
    
        if (r323 != 2) goto L79;
     */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 1938
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.onMeasure(int, int):void");
    }
}
