package com.facebook.fbui.widget.contentview;

import X.0S2;
import X.AnonymousClass001;
import X.C1oo;
import X.C2141Dex;
import X.C2cd;
import X.FAk;
import X.FG9;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.fbui.widget.layout.ImageBlockLayout;
import com.google.common.base.Preconditions;

/* loaded from: ContentView.class */
public class ContentView extends ImageBlockLayout {
    public static final int[] A09 = {2130969262, 2130969261, 2130969260, 2130969259, 2130969263};
    public int A00;
    public int A01;
    public int A02;
    public FG9 A03;
    public FG9 A04;
    public FG9 A05;
    public Integer A06;
    public boolean A07;
    public boolean A08;

    public ContentView(Context context) {
        this(context, null);
    }

    public ContentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969256);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A07 = true;
        this.A05 = new FG9(this);
        this.A04 = new FG9(this);
        this.A03 = new FG9(this);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130969264, typedValue, true);
        FAk.A02(context, this.A05.A05, typedValue.resourceId);
        context.getTheme().resolveAttribute(2130969258, typedValue, true);
        FAk.A02(context, this.A04.A05, typedValue.resourceId);
        context.getTheme().resolveAttribute(2130969255, typedValue, true);
        FAk.A02(context, this.A03.A05, typedValue.resourceId);
        boolean z = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0R, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(8, 0);
        if (resourceId > 0) {
            this.A05.A0B(getContext().getText(resourceId));
        } else {
            this.A05.A0B(obtainStyledAttributes.getText(8));
        }
        requestLayout();
        invalidate();
        int resourceId2 = obtainStyledAttributes.getResourceId(4, 0);
        if (resourceId2 > 0) {
            this.A04.A0B(getContext().getText(resourceId2));
        } else {
            this.A04.A0B(obtainStyledAttributes.getText(4));
        }
        requestLayout();
        invalidate();
        int resourceId3 = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId3 > 0) {
            this.A03.A0B(getContext().getText(resourceId3));
        } else {
            this.A03.A0B(obtainStyledAttributes.getText(1));
        }
        requestLayout();
        invalidate();
        int resourceId4 = obtainStyledAttributes.getResourceId(9, 0);
        if (resourceId4 > 0) {
            this.A05.A07(resourceId4);
            requestLayout();
            invalidate();
        }
        int resourceId5 = obtainStyledAttributes.getResourceId(5, 0);
        if (resourceId5 > 0) {
            this.A04.A07(resourceId5);
            requestLayout();
            invalidate();
        }
        int resourceId6 = obtainStyledAttributes.getResourceId(2, 0);
        if (resourceId6 > 0) {
            this.A03.A07(resourceId6);
            requestLayout();
            invalidate();
        }
        Integer num = 0S2.A00(5)[obtainStyledAttributes.getInteger(6, 0)];
        if (num != this.A06) {
            this.A06 = num;
            TypedValue typedValue2 = new TypedValue();
            getContext().getTheme().resolveAttribute(A09[this.A06.intValue()], typedValue2, true);
            int i2 = typedValue2.resourceId;
            int dimensionPixelSize = getResources().getDimensionPixelSize(i2 == 0 ? 2132279303 : i2);
            this.A01 = dimensionPixelSize;
            A0D(dimensionPixelSize, dimensionPixelSize);
            requestLayout();
        }
        this.A07 = obtainStyledAttributes.getBoolean(0, true);
        boolean hasValue = obtainStyledAttributes.hasValue(7);
        boolean hasValue2 = obtainStyledAttributes.hasValue(3);
        Preconditions.checkState(AnonymousClass001.A1Q(hasValue ? 1 : 0, hasValue2 ? 1 : 0), "titleMaxLines and subtitleMaxLines must both be specified if one is specified");
        if (hasValue && hasValue2) {
            z = true;
        }
        this.A08 = z;
        this.A02 = obtainStyledAttributes.getInteger(7, 1);
        this.A00 = obtainStyledAttributes.getInteger(3, 1);
        A01(this);
        obtainStyledAttributes.recycle();
        if (super.A06 != 16) {
            super.A06 = 16;
            requestLayout();
        }
    }

    private void A00(View view) {
        FG9 fg9;
        if (view.getLayoutParams() instanceof C2141Dex) {
            int intValue = ((C2141Dex) view.getLayoutParams()).A00.intValue();
            if (intValue == 0) {
                fg9 = this.A05;
            } else if (intValue == 1) {
                fg9 = this.A04;
            } else if (intValue != 2) {
                return;
            } else {
                fg9 = this.A03;
            }
            fg9.A04 = null;
            fg9.A05 = null;
            fg9.A03 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r301.A00 < 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A01(com.facebook.fbui.widget.contentview.ContentView r301) {
        /*
            r0 = r301
            int r0 = r0.A02
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r302
            if (r0 < 0) goto L16
            r0 = r301
            int r0 = r0.A00
            r302 = r0
            r0 = 1
            r304 = r0
            r0 = r302
            if (r0 >= 0) goto L18
        L16:
            r0 = 0
            r304 = r0
        L18:
            java.lang.String r0 = "titleMaxLines and subtitleMaxLines must be non-negative"
            r305 = r0
            r0 = r304
            r1 = r305
            com.google.common.base.Preconditions.checkState(r0, r1)
            r0 = r301
            boolean r0 = r0.A07
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L36
            r0 = r301
            boolean r0 = r0.A08
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L36
            r0 = 0
            r303 = r0
        L36:
            r0 = r303
            java.lang.String r1 = "maxLinesFromThumbnailSize must be false if titleMaxLines and subtitleMaxLines are specified"
            com.google.common.base.Preconditions.checkState(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbui.widget.contentview.ContentView.A01(com.facebook.fbui.widget.contentview.ContentView):void");
    }

    @Override // com.facebook.fbui.widget.layout.ImageBlockLayout
    public void A0E(Drawable drawable) {
        int i = this.A01;
        A0D(i, i);
        super.A0E(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.fbui.widget.layout.ImageBlockLayout
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        FG9 fg9;
        if (layoutParams instanceof C2141Dex) {
            int intValue = ((C2141Dex) layoutParams).A00.intValue();
            if (intValue == 0) {
                fg9 = this.A05;
            } else if (intValue == 1) {
                fg9 = this.A04;
            } else if (intValue == 2) {
                fg9 = this.A03;
            }
            View view2 = fg9.A04;
            if (view2 != null) {
                i = indexOfChild(view2);
                removeView(view2);
            }
            fg9.A04 = view;
            fg9.A05 = null;
            fg9.A03 = null;
        }
        super.addView(view, i, layoutParams);
        if (view == this.A0L) {
            int i2 = this.A01;
            A0D(i2, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if ((r302 instanceof X.C2141Dex) == false) goto L6;
     */
    @Override // com.facebook.fbui.widget.layout.ImageBlockLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r302) {
        /*
            r301 = this;
            r0 = r302
            if (r0 == 0) goto Lf
            r0 = r302
            boolean r0 = r0 instanceof X.C2141Dex
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L11
        Lf:
            r0 = 0
            r304 = r0
        L11:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbui.widget.contentview.ContentView.checkLayoutParams(android.view.ViewGroup$LayoutParams):boolean");
    }

    @Override // com.facebook.fbui.widget.layout.ImageBlockLayout
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A05.A0A(canvas);
        this.A04.A0A(canvas);
        this.A03.A0A(canvas);
    }

    @Override // com.facebook.fbui.widget.layout.ImageBlockLayout
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2141Dex();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.fbui.widget.layout.ImageBlockLayout
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2141Dex(getContext(), attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r302v2, types: [X.Dex] */
    @Override // com.facebook.fbui.widget.layout.ImageBlockLayout
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof C2141Dex;
        ViewGroup.LayoutParams layoutParams2 = layoutParams;
        if (!z) {
            layoutParams2 = new C2141Dex();
        }
        return layoutParams2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super/*android.view.View*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (TextUtils.isEmpty(accessibilityNodeInfo.getContentDescription())) {
            StringBuilder A0k = AnonymousClass001.A0k();
            C2cd.A07(this.A05.A05(), A0k, true);
            C2cd.A07(this.A04.A05(), A0k, true);
            C2cd.A07(this.A03.A05(), A0k, true);
            if (TextUtils.isEmpty(A0k)) {
                return;
            }
            accessibilityNodeInfo.setContentDescription(A0k.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fa  */
    @Override // com.facebook.fbui.widget.layout.ImageBlockLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbui.widget.contentview.ContentView.onMeasure(int, int):void");
    }

    @Override // com.facebook.fbui.widget.layout.ImageBlockLayout
    public void removeView(View view) {
        if (view != null) {
            A00(view);
            super.removeView(view);
        }
    }

    @Override // com.facebook.fbui.widget.layout.ImageBlockLayout
    public void removeViewInLayout(View view) {
        if (view != null) {
            A00(view);
            super.removeViewInLayout(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setMaxLines(int i, int i2) {
        if (this.A08 && this.A02 == i && this.A00 == i2) {
            return;
        }
        this.A02 = i;
        this.A00 = i2;
        this.A08 = true;
        A01(this);
        requestLayout();
        invalidate();
    }
}
