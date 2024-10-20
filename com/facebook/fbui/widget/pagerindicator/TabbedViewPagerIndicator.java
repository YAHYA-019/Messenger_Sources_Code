package com.facebook.fbui.widget.pagerindicator;

import X.0FI;
import X.0NL;
import X.0PY;
import X.1BK;
import X.1Bn;
import X.8Cl;
import X.AbG;
import X.AnonymousClass001;
import X.C1oo;
import X.C2cd;
import X.DKC;
import X.DKD;
import X.FXQ;
import X.G27;
import X.GEf;
import X.PzZ;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.fbui.widget.layout.SegmentedLinearLayout;
import com.facebook.messaging.contactstab.intf.FriendsSubTabTag;
import com.facebook.resources.ui.FbTextView;
import java.util.List;

/* loaded from: TabbedViewPagerIndicator.class */
public class TabbedViewPagerIndicator extends HorizontalScrollView implements 0PY {
    public int A00;
    public TransformationMethod A01;
    public 0NL A02;
    public ViewPager A03;
    public TabsContainer A04;
    public boolean A05;
    public boolean A06;
    public float A07;
    public int A08;
    public boolean A09;
    public final List A0A;
    public final DataSetObserver A0B;

    /* loaded from: TabbedViewPagerIndicator$TabsContainer.class */
    public class TabsContainer extends SegmentedLinearLayout {
        public int A00;
        public int A01;
        public int A02;
        public int A03;
        public int A04;
        public Paint A05;
        public boolean A06;
        public boolean A07;

        public TabsContainer(Context context) {
            this(context, null);
        }

        public TabsContainer(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.A00 = 0;
            this.A03 = 0;
            this.A04 = 0;
            this.A06 = false;
            this.A05 = DKC.A0A(1);
            this.A01 = 2132542007;
            setWillNotDraw(false);
        }

        @Override // com.facebook.fbui.widget.layout.SegmentedLinearLayout, android.widget.LinearLayout, android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (getChildCount() != 0) {
                if (this.A03 == 0 && this.A04 == 0) {
                    View childAt = getChildAt(this.A00);
                    this.A03 = childAt.getLeft();
                    this.A04 = childAt.getRight();
                }
                canvas.drawRect(this.A03, r0 - this.A02, this.A04, getMeasuredHeight(), this.A05);
            }
        }

        @Override // com.facebook.widget.CustomLinearLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (z) {
                this.A03 = 0;
                this.A04 = 0;
            }
        }

        @Override // com.facebook.widget.CustomLinearLayout, android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            this.A06 = true;
        }
    }

    public TabbedViewPagerIndicator(Context context) {
        this(context, null);
    }

    public TabbedViewPagerIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130971941);
    }

    public TabbedViewPagerIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0B = new PzZ(this);
        this.A01 = (TransformationMethod) 1Bn.A0A(67646);
        this.A0A = AnonymousClass001.A0s();
        setHorizontalScrollBarEnabled(false);
        TabsContainer tabsContainer = (TabsContainer) DKD.A0A(this).inflate(A04(), (ViewGroup) this, false);
        this.A04 = tabsContainer;
        addView(tabsContainer);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A2h, i, 0);
        int color = obtainStyledAttributes.getColor(6, 0);
        TabsContainer tabsContainer2 = this.A04;
        tabsContainer2.A05.setColor(color);
        tabsContainer2.invalidate();
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(7, 0);
        TabsContainer tabsContainer3 = this.A04;
        if (tabsContainer3.A02 != dimensionPixelSize) {
            tabsContainer3.A02 = dimensionPixelSize;
            tabsContainer3.invalidate();
        }
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        TabsContainer tabsContainer4 = this.A04;
        if (drawable != null) {
            tabsContainer4.A0G(2);
            this.A04.A0H(drawable);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            TabsContainer tabsContainer5 = this.A04;
            if (((SegmentedLinearLayout) tabsContainer5).A01 != dimensionPixelSize2 || ((SegmentedLinearLayout) tabsContainer5).A00 != dimensionPixelSize2) {
                ((SegmentedLinearLayout) tabsContainer5).A00 = dimensionPixelSize2;
                ((SegmentedLinearLayout) tabsContainer5).A01 = dimensionPixelSize2;
                tabsContainer5.requestLayout();
                tabsContainer5.invalidate();
            }
            int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            if (dimensionPixelSize3 > 0) {
                this.A04.A0F(dimensionPixelSize3);
            }
        } else {
            tabsContainer4.A0G(0);
            this.A04.A0H(null);
        }
        int resourceId = obtainStyledAttributes.getResourceId(5, 0);
        TabsContainer tabsContainer6 = this.A04;
        if (resourceId > 0) {
            tabsContainer6.A01 = resourceId;
        }
        this.A06 = obtainStyledAttributes.getBoolean(4, true);
        this.A05 = obtainStyledAttributes.getBoolean(0, false);
        this.A04.A07 = obtainStyledAttributes.getBoolean(8, false);
        obtainStyledAttributes.recycle();
    }

    public static int A00(TabbedViewPagerIndicator tabbedViewPagerIndicator, int i) {
        TabsContainer tabsContainer = tabbedViewPagerIndicator.A04;
        View childAt = tabsContainer.getChildAt(i);
        int A0E = tabsContainer.A0I(i) ? tabsContainer.A0E() : 0;
        return ((tabbedViewPagerIndicator.getPaddingLeft() + (childAt.getLeft() - (A0E / 2))) - (tabbedViewPagerIndicator.getWidth() / 2)) + ((childAt.getWidth() + A0E) / 2);
    }

    private String A01(int i) {
        View childAt = this.A04.getChildAt(i);
        if (childAt == null) {
            return null;
        }
        return getResources().getString(2131966685, 1BK.A1a(this.A02.A08(i) != null ? this.A02.A08(i) : childAt instanceof FbTextView ? ((TextView) childAt).getText() : "", Integer.valueOf(i + 1), this.A02.A0C()));
    }

    private void A02(int i) {
        TabsContainer tabsContainer = this.A04;
        View childAt = tabsContainer.getChildAt(this.A08);
        if (childAt != null) {
            childAt.setContentDescription(A01(this.A08));
        }
        View childAt2 = tabsContainer.getChildAt(i);
        if (childAt2 != null) {
            childAt2.setContentDescription(A01(i));
        }
        this.A08 = i;
    }

    public static void A03(TabbedViewPagerIndicator tabbedViewPagerIndicator, int i) {
        TabsContainer tabsContainer = tabbedViewPagerIndicator.A04;
        int childCount = tabsContainer.getChildCount();
        if (i < 0 || i >= childCount) {
            return;
        }
        View childAt = tabsContainer.getChildAt(i);
        int scrollX = tabbedViewPagerIndicator.getScrollX();
        int width = tabbedViewPagerIndicator.getWidth();
        int left = childAt.getLeft();
        int width2 = childAt.getWidth();
        int width3 = left - (i > 0 ? tabsContainer.getChildAt(i - 1).getWidth() / 2 : 0);
        int width4 = left + width2 + (i < childCount + (-1) ? tabsContainer.getChildAt(i + 1).getWidth() / 2 : 0);
        if (width3 >= scrollX) {
            if (width4 <= scrollX + width) {
                return;
            } else {
                width3 = width4 - width;
            }
        }
        tabbedViewPagerIndicator.scrollTo(width3, 0);
    }

    public int A04() {
        return this instanceof IconAndTextTabbedViewPagerIndicator ? 2132542004 : 2132542008;
    }

    public void A05() {
        8Cl r0 = this.A02;
        if (r0 != null) {
            8Cl r303 = r0 instanceof 8Cl ? r0 : null;
            TabsContainer tabsContainer = this.A04;
            tabsContainer.removeAllViews();
            tabsContainer.A03 = 0;
            tabsContainer.A04 = 0;
            tabsContainer.invalidate();
            int A0C = this.A02.A0C();
            for (int i = 0; i < A0C; i++) {
                if (this instanceof IconAndTextTabbedViewPagerIndicator) {
                    TabsContainer tabsContainer2 = this.A04;
                    DKD.A0A(tabsContainer2).inflate(tabsContainer2.A01, (ViewGroup) tabsContainer2, false);
                    throw new InflateException("Tab layout should be a subclass of TextView and pager adapter should be a subclass of IconAndTextPagerAdapter");
                }
                CharSequence A08 = this.A02.A08(i);
                TabsContainer tabsContainer3 = this.A04;
                View A082 = AbG.A08(DKD.A0A(tabsContainer3), tabsContainer3, tabsContainer3.A01);
                if (!(A082 instanceof FbTextView)) {
                    throw new InflateException("Tab layout should be a subclass of FbTextView");
                }
                if (tabsContainer3.A07 && !(A082 instanceof GEf)) {
                    throw new InflateException("Tab layout should implement TabProgressListenerView if the updateTabProgress attr is true.");
                }
                TextView textView = (TextView) A082;
                if (TextUtils.isEmpty(A08)) {
                    A08 = "";
                }
                textView.setText(A08);
                textView.setTag("tab_item");
                tabsContainer3.addView(textView);
                textView.setTransformationMethod(this.A01);
                textView.setContentDescription(A01(i));
                if (r303 != null) {
                    textView.setId(((FriendsSubTabTag) r303.A01.get(i)).viewId);
                }
                textView.setOnClickListener(new FXQ(this, i));
            }
            if (tabsContainer.A00 < tabsContainer.getChildCount()) {
                int i2 = tabsContainer.A00;
                View childAt = tabsContainer.getChildAt(i2);
                if (childAt != null) {
                    childAt.setSelected(false);
                }
                View childAt2 = tabsContainer.getChildAt(i2);
                if (childAt2 != null) {
                    childAt2.setImportantForAccessibility(4);
                    childAt2.setSelected(true);
                    childAt2.setImportantForAccessibility(1);
                }
                tabsContainer.A00 = i2;
                tabsContainer.invalidate();
            }
            A02(tabsContainer.A00);
        }
    }

    public void A06(int i) {
        TabsContainer tabsContainer = this.A04;
        if (tabsContainer.A02 != i) {
            tabsContainer.A02 = i;
            tabsContainer.invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x001d, code lost:
    
        if (r0 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A07(androidx.viewpager.widget.ViewPager r302) {
        /*
            r301 = this;
            r0 = r301
            androidx.viewpager.widget.ViewPager r0 = r0.A03
            r303 = r0
            r0 = r303
            r1 = r302
            if (r0 != r1) goto L1c
            r0 = r303
            X.0NL r0 = r0.A0H()
            r304 = r0
            r0 = r301
            X.0NL r0 = r0.A02
            r305 = r0
            r0 = r304
            r1 = r305
            if (r0 != r1) goto L20
        L1b:
            return
        L1c:
            r0 = r303
            if (r0 == 0) goto L59
        L20:
            r0 = r303
            r1 = r301
            r0.A0T(r1)
            r0 = r301
            java.util.List r0 = r0.A0A
            r305 = r0
            r0 = r305
            java.util.Iterator r0 = r0.iterator()
            r303 = r0
        L33:
            r0 = r303
            boolean r0 = r0.hasNext()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L59
            r0 = r303
            java.lang.Object r0 = r0.next()
            X.0PY r0 = (X.0PY) r0
            r304 = r0
            r0 = r301
            androidx.viewpager.widget.ViewPager r0 = r0.A03
            r305 = r0
            r0 = r305
            r1 = r304
            r0.A0T(r1)
            goto L33
        L59:
            r0 = r301
            r1 = r302
            r0.A03 = r1
            r0 = r302
            r1 = r301
            r0.A0S(r1)
            r0 = r301
            java.util.List r0 = r0.A0A
            r305 = r0
            r0 = r305
            java.util.Iterator r0 = r0.iterator()
            r303 = r0
        L71:
            r0 = r303
            boolean r0 = r0.hasNext()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L97
            r0 = r303
            java.lang.Object r0 = r0.next()
            X.0PY r0 = (X.0PY) r0
            r304 = r0
            r0 = r301
            androidx.viewpager.widget.ViewPager r0 = r0.A03
            r305 = r0
            r0 = r305
            r1 = r304
            r0.A0S(r1)
            goto L71
        L97:
            r0 = r301
            androidx.viewpager.widget.ViewPager r0 = r0.A03
            X.0NL r0 = r0.A0H()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L1b
            r0 = r301
            r1 = r305
            r0.A02 = r1
            r0 = r301
            r0.A05()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbui.widget.pagerindicator.TabbedViewPagerIndicator.A07(androidx.viewpager.widget.ViewPager):void");
    }

    public void CAd(int i) {
        this.A00 = i;
        if (i == 1) {
            this.A09 = true;
            return;
        }
        if (i == 0) {
            this.A09 = false;
            TabsContainer tabsContainer = this.A04;
            tabsContainer.A03 = 0;
            tabsContainer.A04 = 0;
            tabsContainer.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void CAe(int i, float f, int i2) {
        int i3;
        float f2;
        float f3 = i + f;
        int i4 = i + 1;
        if (this.A07 > f3) {
            f2 = 1.0f - f;
            i3 = i4;
            i4 = i;
        } else {
            i3 = i;
            f2 = f;
        }
        if (f > 0.0f) {
            if (!this.A05) {
                A03(this, i4);
            } else if (this.A09 && this.A00 != 0 && i >= 0) {
                TabsContainer tabsContainer = this.A04;
                if (i != tabsContainer.getChildCount() - 1) {
                    View childAt = tabsContainer.getChildAt(i);
                    View childAt2 = tabsContainer.getChildAt(i4);
                    scrollTo(A00(this, i) + ((int) (f * ((childAt.getWidth() / 2) + (childAt2.getWidth() / 2) + tabsContainer.A0E()))), 0);
                }
            }
        }
        this.A07 = f3;
        TabsContainer tabsContainer2 = this.A04;
        View childAt3 = tabsContainer2.getChildAt(i3);
        View childAt4 = tabsContainer2.getChildAt(i4);
        if (childAt3 == 0 || childAt4 == 0) {
            return;
        }
        tabsContainer2.A03 = (int) (childAt3.getLeft() + ((childAt4.getLeft() - r0) * f2));
        tabsContainer2.A04 = (int) (childAt3.getRight() + ((childAt4.getRight() - r0) * f2));
        if (tabsContainer2.A07) {
            ((GEf) childAt4).CPi(f2);
            ((GEf) childAt3).CPi(1.0f - f2);
            if (i3 < i4) {
                while (true) {
                    i3--;
                    if (i3 < 0) {
                        break;
                    } else {
                        ((GEf) tabsContainer2.getChildAt(i3)).CPi(0.0f);
                    }
                }
            } else {
                int childCount = tabsContainer2.getChildCount();
                for (int i5 = i3 + 1; i5 < childCount; i5++) {
                    ((GEf) tabsContainer2.getChildAt(i5)).CPi(0.0f);
                }
            }
        }
        tabsContainer2.invalidate();
    }

    public void CAf(int i) {
        TabsContainer tabsContainer = this.A04;
        View childAt = tabsContainer.getChildAt(tabsContainer.A00);
        if (childAt != null) {
            childAt.setSelected(false);
        }
        View childAt2 = tabsContainer.getChildAt(i);
        if (childAt2 != null) {
            childAt2.setSelected(true);
        }
        tabsContainer.A00 = i;
        tabsContainer.invalidate();
        if (tabsContainer.getWindowToken() == null || !tabsContainer.A06) {
            post(new G27(this, i));
        } else {
            boolean z = this.A05;
            int i2 = this.A00;
            if (z) {
                if ((i2 == 2 || i2 == 0) && !this.A09) {
                    smoothScrollTo(A00(this, i), 0);
                    tabsContainer.A03 = 0;
                    tabsContainer.A04 = 0;
                    tabsContainer.invalidate();
                }
            } else if (i2 == 0) {
                A03(this, i);
                tabsContainer.A03 = 0;
                tabsContainer.A04 = 0;
                tabsContainer.invalidate();
            }
        }
        A02(i);
        View childAt3 = tabsContainer.getChildAt(i);
        if (childAt3 != null) {
            C2cd.A05(this, childAt3.getContentDescription());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-973439408);
        super.onDetachedFromWindow();
        0FI.A0C(-1840368353, A06);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.A02 != null) {
            int i5 = (int) this.A07;
            if (!z || i5 < 0 || i5 >= this.A04.getChildCount()) {
                return;
            }
            smoothScrollTo(A00(this, i5), 0);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        setFillViewport(false);
        super.onMeasure(i, i2);
        TabsContainer tabsContainer = this.A04;
        if (tabsContainer.getMeasuredWidth() >= getMeasuredWidth() || !this.A06) {
            return;
        }
        setFillViewport(true);
        int childCount = tabsContainer.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = tabsContainer.getChildAt(i3);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            ((ViewGroup.LayoutParams) layoutParams).width = 1;
            layoutParams.weight = 1.0f;
            childAt.setLayoutParams(layoutParams);
        }
        super.onMeasure(i, i2);
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = tabsContainer.getChildAt(i4);
            if ((childAt2 instanceof FbTextView) && ((TextView) childAt2).getLayout().getEllipsisCount(0) > 0) {
                setFillViewport(true);
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt3 = tabsContainer.getChildAt(i5);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt3.getLayoutParams();
                    ((ViewGroup.LayoutParams) layoutParams2).width = -2;
                    layoutParams2.weight = 1.0f;
                    childAt3.setLayoutParams(layoutParams2);
                }
                super.onMeasure(i, i2);
                return;
            }
        }
    }
}
