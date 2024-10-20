package com.google.android.material.tabs;

import X.0FI;
import X.0K6;
import X.0NL;
import X.6Le;
import X.6Lz;
import X.AnonymousClass001;
import X.C03v;
import X.C03y;
import X.C80w;
import X.JQy;
import X.JUA;
import X.JV6;
import X.JZ1;
import X.JZD;
import X.KkV;
import X.KwZ;
import X.Kwb;
import X.LF6;
import X.LF7;
import X.LRc;
import X.LRd;
import X.LeW;
import X.MDK;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.List;

/* loaded from: TabLayout.class */
public class TabLayout extends HorizontalScrollView {
    public static final C03y A0d = new C03v(16);
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public ValueAnimator A0E;
    public ColorStateList A0F;
    public ColorStateList A0G;
    public ColorStateList A0H;
    public Drawable A0I;
    public ViewPager A0J;
    public Kwb A0K;
    public KkV A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public DataSetObserver A0P;
    public 0NL A0Q;
    public LRc A0R;
    public MDK A0S;
    public LRd A0T;
    public boolean A0U;
    public final int A0V;
    public final int A0W;
    public final int A0X;
    public final C03y A0Y;
    public final JZD A0Z;
    public final ArrayList A0a;
    public final ArrayList A0b;
    public final int A0c;

    public TabLayout(Context context) {
        this(context, null);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130971931);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0514, code lost:
    
        if (r0 != 2) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v240, types: [int[], int[][]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TabLayout(android.content.Context r302, android.util.AttributeSet r303, int r304) {
        /*
            Method dump skipped, instructions count: 1393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private int A00(int i, float f) {
        int i2 = this.A03;
        int i3 = 0;
        if (i2 != 0 && i2 != 2) {
            return 0;
        }
        JZD jzd = this.A0Z;
        View childAt = jzd.getChildAt(i);
        int i4 = i + 1;
        View childAt2 = i4 < jzd.getChildCount() ? jzd.getChildAt(i4) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i3 = childAt2.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i5 = (int) ((width + i3) * 0.5f * f);
        int i6 = left - i5;
        if (getLayoutDirection() == 0) {
            i6 = left + i5;
        }
        return i6;
    }

    private void A01(int i) {
        if (i != -1) {
            if (getWindowToken() != null && isLaidOut()) {
                JZD jzd = this.A0Z;
                int childCount = jzd.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (jzd.getChildAt(i2).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int A00 = A00(i, 0.0f);
                if (scrollX != A00) {
                    if (this.A0E == null) {
                        ValueAnimator valueAnimator = new ValueAnimator();
                        this.A0E = valueAnimator;
                        valueAnimator.setInterpolator(C80w.A02);
                        this.A0E.setDuration(this.A05);
                        LF7.A00(this.A0E, this, 23);
                    }
                    this.A0E.setIntValues(scrollX, A00);
                    0K6.A00(this.A0E);
                }
                int i3 = this.A05;
                ValueAnimator valueAnimator2 = jzd.A02;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    jzd.A02.cancel();
                }
                View childAt = jzd.getChildAt(jzd.A01);
                View childAt2 = jzd.getChildAt(i);
                if (childAt2 == null) {
                    JZD.A01(jzd);
                    return;
                }
                LF6 lf6 = new LF6(3, jzd, childAt2, childAt);
                ValueAnimator valueAnimator3 = new ValueAnimator();
                jzd.A02 = valueAnimator3;
                valueAnimator3.setInterpolator(C80w.A02);
                valueAnimator3.setDuration(i3);
                valueAnimator3.setFloatValues(0.0f, 1.0f);
                valueAnimator3.addUpdateListener(lf6);
                valueAnimator3.addListener(new JUA(i, 3, jzd));
                0K6.A00(valueAnimator3);
                return;
            }
            A05(0.0f, i, true, true);
        }
    }

    private void A02(int i) {
        JZD jzd = this.A0Z;
        int childCount = jzd.getChildCount();
        if (i >= childCount) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= childCount) {
                return;
            }
            View childAt = jzd.getChildAt(i3);
            boolean z = true;
            childAt.setSelected(AnonymousClass001.A1Q(i3, i));
            if (i3 != i) {
                z = false;
            }
            childAt.setActivated(z);
            i2 = i3 + 1;
        }
    }

    public static void A03(ViewPager viewPager, TabLayout tabLayout, boolean z) {
        List list;
        ViewPager viewPager2 = tabLayout.A0J;
        if (viewPager2 != null) {
            LRd lRd = tabLayout.A0T;
            if (lRd != null) {
                viewPager2.A0T(lRd);
            }
            LRc lRc = tabLayout.A0R;
            if (lRc != null && (list = tabLayout.A0J.A0F) != null) {
                list.remove(lRc);
            }
        }
        MDK mdk = tabLayout.A0S;
        if (mdk != null) {
            tabLayout.A0a.remove(mdk);
            tabLayout.A0S = null;
        }
        if (viewPager != null) {
            tabLayout.A0J = viewPager;
            LRd lRd2 = tabLayout.A0T;
            if (lRd2 == null) {
                lRd2 = new LRd(tabLayout);
                tabLayout.A0T = lRd2;
            }
            lRd2.A01 = 0;
            lRd2.A00 = 0;
            viewPager.A0S(lRd2);
            LeW leW = new LeW(viewPager);
            tabLayout.A0S = leW;
            JQy.A1P(leW, tabLayout.A0a);
            0NL A0H = viewPager.A0H();
            if (A0H != null) {
                tabLayout.A06(A0H, true);
            }
            LRc lRc2 = tabLayout.A0R;
            if (lRc2 == null) {
                lRc2 = new LRc(tabLayout);
                tabLayout.A0R = lRc2;
            }
            lRc2.A00 = true;
            List list2 = viewPager.A0F;
            if (list2 == null) {
                list2 = AnonymousClass001.A0s();
                viewPager.A0F = list2;
            }
            list2.add(lRc2);
            tabLayout.A05(0.0f, viewPager.A0G(), true, true);
        } else {
            tabLayout.A0J = null;
            tabLayout.A06(null, false);
        }
        tabLayout.A0U = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x011c, code lost:
    
        if (r311 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A04() {
        /*
            Method dump skipped, instructions count: 849
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.A04():void");
    }

    public void A05(float f, int i, boolean z, boolean z2) {
        int round = Math.round(i + f);
        if (round >= 0) {
            JZD jzd = this.A0Z;
            if (round < jzd.getChildCount()) {
                if (z2) {
                    ValueAnimator valueAnimator = jzd.A02;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        jzd.A02.cancel();
                    }
                    jzd.A01 = i;
                    jzd.A00 = f;
                    JZD.A00(jzd.getChildAt(i), jzd.getChildAt(jzd.A01 + 1), jzd, jzd.A00);
                }
                ValueAnimator valueAnimator2 = this.A0E;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.A0E.cancel();
                }
                scrollTo(A00(i, f), 0);
                if (z) {
                    A02(round);
                }
            }
        }
    }

    public void A06(0NL r302, boolean z) {
        DataSetObserver dataSetObserver;
        0NL r0 = this.A0Q;
        if (r0 != null && (dataSetObserver = this.A0P) != null) {
            r0.A05(dataSetObserver);
        }
        this.A0Q = r302;
        if (z && r302 != null) {
            DataSetObserver dataSetObserver2 = this.A0P;
            if (dataSetObserver2 == null) {
                dataSetObserver2 = new JV6(this);
                this.A0P = dataSetObserver2;
            }
            r302.A04(dataSetObserver2);
        }
        A04();
    }

    public void A07(KkV kkV, boolean z) {
        KkV kkV2 = this.A0L;
        if (kkV2 != kkV) {
            int i = kkV != null ? kkV.A00 : -1;
            if (z) {
                if ((kkV2 == null || kkV2.A00 == -1) && i != -1) {
                    A05(0.0f, i, true, true);
                } else {
                    A01(i);
                }
                if (i != -1) {
                    A02(i);
                }
            }
            this.A0L = kkV;
            if (kkV2 != null) {
                ArrayList arrayList = this.A0a;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        arrayList.get(size);
                    }
                }
            }
            if (kkV == null) {
                return;
            }
            ArrayList arrayList2 = this.A0a;
            int size2 = arrayList2.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return;
                } else {
                    ((MDK) arrayList2.get(size2)).A00.A0K(kkV.A00);
                }
            }
        } else {
            if (kkV2 == null) {
                return;
            }
            ArrayList arrayList3 = this.A0a;
            int size3 = arrayList3.size();
            while (true) {
                size3--;
                if (size3 < 0) {
                    A01(kkV.A00);
                    return;
                }
                arrayList3.get(size3);
            }
        }
    }

    public void A08(boolean z) {
        float f;
        int i = 0;
        while (true) {
            int i2 = i;
            JZD jzd = this.A0Z;
            if (i2 >= jzd.getChildCount()) {
                return;
            }
            View childAt = jzd.getChildAt(i2);
            int i3 = this.A0V;
            float f2 = 0.0f / 0.0f;
            if (i3 == -1) {
                int i4 = this.A03;
                i3 = (i4 == 0 || i4 == 2) ? this.A0W : 0;
            }
            childAt.setMinimumWidth(i3);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.A03 == 1 && this.A04 == 0) {
                ((ViewGroup.LayoutParams) layoutParams).width = 0;
                f = 1.0f;
            } else {
                ((ViewGroup.LayoutParams) layoutParams).width = -2;
                f = 0.0f;
            }
            layoutParams.weight = f;
            if (z) {
                childAt.requestLayout();
            }
            i = i2 + 1;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        throw AnonymousClass001.A0L("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        throw AnonymousClass001.A0L("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw AnonymousClass001.A0L("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw AnonymousClass001.A0L("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-1891590377);
        super.onAttachedToWindow();
        6Le background = getBackground();
        if (background instanceof 6Le) {
            6Lz.A00(this, background);
        }
        if (this.A0J == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                A03((ViewPager) parent, this, true);
            }
        }
        0FI.A0C(77190589, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-1530616597);
        super.onDetachedFromWindow();
        if (this.A0U) {
            A03(null, this, false);
            this.A0U = false;
        }
        0FI.A0C(481970430, A06);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        JZ1 jz1;
        Drawable drawable;
        int i = 0;
        while (true) {
            int i2 = i;
            JZD jzd = this.A0Z;
            if (i2 >= jzd.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            JZ1 childAt = jzd.getChildAt(i2);
            if ((childAt instanceof JZ1) && (drawable = (jz1 = childAt).A00) != null) {
                drawable.setBounds(jz1.getLeft(), jz1.getTop(), jz1.getRight(), jz1.getBottom());
                jz1.A00.draw(canvas);
            }
            i = i2 + 1;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.A0b.size(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Context context = getContext();
        ArrayList arrayList = this.A0b;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.get(i3);
        }
        int round = Math.round(KwZ.A00(context, 48));
        int mode = View.MeasureSpec.getMode(i2);
        float f = -0.0f;
        if (mode != ((-1) << (-1))) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(round + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size2 = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i4 = this.A0c;
            if (i4 <= 0) {
                i4 = (int) (size2 - KwZ.A00(context, 56));
            }
            this.A07 = i4;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i5 = this.A03;
            if (i5 != 0) {
                if (i5 == 1) {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, JQy.A07(this), childAt.getLayoutParams().height));
                }
                if (i5 != 2) {
                    return;
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, JQy.A07(this), childAt.getLayoutParams().height));
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

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return AnonymousClass001.A1P(Math.max(0, JQy.A09(this, this.A0Z.getWidth() - getWidth())));
    }
}
