package com.facebook.fig.listitem;

import X.7zN;
import X.AnonymousClass001;
import X.C1oo;
import X.C2141Dex;
import X.DP9;
import X.EVU;
import X.FAk;
import X.RDO;
import X.RUt;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.fbui.widget.contentview.ContentView;
import com.facebook.fbui.widget.layout.ImageBlockLayout;

/* loaded from: FigListItem.class */
public class FigListItem extends ImageBlockLayout {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public RUt A07;
    public RUt A08;
    public RUt A09;
    public int A0A;
    public int A0B;
    public boolean A0C;
    public boolean A0D;

    public FigListItem(Context context) {
        super(context);
        this.A0C = false;
        this.A00 = 0;
        A03(null, 0);
    }

    public FigListItem(Context context, int i) {
        super(context);
        this.A0C = false;
        this.A00 = 0;
        A03(null, 0);
        A02(i);
    }

    public FigListItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0C = false;
        this.A00 = 0;
        A03(attributeSet, 2130969256);
    }

    public FigListItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0C = false;
        this.A00 = 0;
        A03(attributeSet, i);
    }

    private String A00() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append((Object) this.A09.A04.A06.A0I);
        A0k.append(" ");
        A0k.append((Object) this.A07.A04.A06.A0I);
        A0k.append(" ");
        return AnonymousClass001.A0a(this.A08.A04.A06.A0I, A0k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r301.A01 < 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A01() {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.A05
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r302
            if (r0 < 0) goto L16
            r0 = r301
            int r0 = r0.A01
            r302 = r0
            r0 = 1
            r304 = r0
            r0 = r302
            if (r0 >= 0) goto L18
        L16:
            r0 = 0
            r304 = r0
        L18:
            java.lang.String r0 = "titleMaxLines and bodyMaxLines must be non-negative"
            r305 = r0
            r0 = r304
            r1 = r305
            com.google.common.base.Preconditions.checkState(r0, r1)
            r0 = r301
            boolean r0 = r0.A0C
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L36
            r0 = r301
            boolean r0 = r0.A0D
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L36
            r0 = 0
            r303 = r0
        L36:
            r0 = r303
            java.lang.String r1 = "maxLinesFromThumbnailSize must be false if titleMaxLines and bodyMaxLines are specified"
            com.google.common.base.Preconditions.checkState(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fig.listitem.FigListItem.A01():void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0049. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A02(int r302) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fig.listitem.FigListItem.A02(int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A03(AttributeSet attributeSet, int i) {
        this.A09 = new RUt();
        this.A07 = new RUt();
        this.A08 = new RUt();
        Context context = getContext();
        int A01 = 7zN.A01(context.getResources());
        super/*android.view.View*/.setPadding(A01, A01, A01, A01);
        super.A0A(A01);
        FAk.A00(context, this, this.A09.A04, 2132608217);
        FAk.A00(context, this, this.A07.A04, 2132608215);
        FAk.A00(context, this, this.A08.A04, 2132608216);
        if (super.A00 != A01) {
            super.A00 = A01;
            requestLayout();
        }
        if (super.A00 != A01) {
            super.A00 = A01;
            requestLayout();
        }
        setBackgroundResource(2132410904);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A1S, i, 0);
            int resourceId = obtainStyledAttributes.getResourceId(13, 0);
            if (resourceId > 0) {
                A0J(resourceId);
            } else {
                A0N(obtainStyledAttributes.getText(13));
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(5, 0);
            if (resourceId2 > 0) {
                RUt rUt = this.A07;
                rUt.A04.A0G(context.getText(resourceId2));
                setContentDescription(A00());
                requestLayout();
                invalidate();
            } else {
                A0L(obtainStyledAttributes.getText(5));
            }
            int resourceId3 = obtainStyledAttributes.getResourceId(10, 0);
            if (resourceId3 > 0) {
                A0I(resourceId3);
            } else {
                A0M(obtainStyledAttributes.getText(10));
            }
            int integer = obtainStyledAttributes.getInteger(7, 0);
            this.A04 = integer;
            int dimensionPixelSize = getResources().getDimensionPixelSize(RDO.A01[integer]);
            this.A03 = dimensionPixelSize;
            A0D(dimensionPixelSize, dimensionPixelSize);
            requestLayout();
            invalidate();
            int integer2 = obtainStyledAttributes.getInteger(14, 0);
            if (integer2 != this.A06) {
                this.A06 = integer2;
                RUt rUt2 = this.A09;
                FAk.A00(context, this, rUt2.A04, RDO.A03[integer2]);
            }
            A0H(obtainStyledAttributes.getInteger(6, 0));
            int integer3 = obtainStyledAttributes.getInteger(11, 0);
            if (integer3 != this.A02) {
                this.A02 = integer3;
                RUt rUt3 = this.A08;
                FAk.A00(context, this, rUt3.A04, RDO.A02[integer3]);
            }
            this.A0C = obtainStyledAttributes.getBoolean(8, false);
            this.A05 = obtainStyledAttributes.getInteger(12, 3);
            this.A01 = obtainStyledAttributes.getInteger(4, 3);
            this.A0B = obtainStyledAttributes.getInteger(4, 3);
            A02(obtainStyledAttributes.getInteger(3, 0));
            A0K(obtainStyledAttributes.getText(2));
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            if (drawable != null) {
                int i2 = this.A00;
                if (i2 == 6) {
                    this.A0K.A01(drawable);
                } else if (i2 == 11) {
                    ((ImageView) this.A0K).setImageDrawable(drawable);
                }
                requestLayout();
                invalidate();
            }
            A0O(obtainStyledAttributes.getBoolean(1, false));
            A01();
            obtainStyledAttributes.recycle();
        }
        setContentDescription(A00());
    }

    @Override // com.facebook.fbui.widget.layout.ImageBlockLayout
    public void A0A(int i) {
    }

    @Override // com.facebook.fbui.widget.layout.ImageBlockLayout
    public void A0C(int i, int i2) {
        this.A09.A01(i);
        int max = Math.max(0, EVU.A00(this.A09.A03));
        int A00 = this.A09.A00();
        this.A07.A01(i);
        int max2 = Math.max(max, EVU.A00(this.A07.A03));
        int A002 = A00 + this.A07.A00();
        this.A08.A01(i);
        int max3 = Math.max(max2, EVU.A00(this.A08.A03));
        int A003 = A002 + this.A08.A00();
        super.A08 = max3;
        super.A07 = A003;
    }

    @Override // com.facebook.fbui.widget.layout.ImageBlockLayout
    public void A0E(Drawable drawable) {
        int i = this.A03;
        A0D(i, i);
        super.A0E(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.fbui.widget.layout.ImageBlockLayout
    public void A0G(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i2 * 2;
        int A00 = this.A09.A00() + this.A07.A00() + this.A08.A00() + i5;
        Resources resources = getResources();
        int i6 = this.A04;
        int[] iArr = RDO.A01;
        if (A00 < resources.getDimensionPixelSize(iArr[i6])) {
            i2 += (Math.min(getMeasuredHeight(), resources.getDimensionPixelSize(iArr[this.A04])) - (((this.A09.A00() + this.A07.A00()) + this.A08.A00()) + i5)) / 2;
        }
        this.A09.A03(i, i2, i3, AnonymousClass001.A1O(getLayoutDirection()));
        int A002 = i2 + this.A09.A00();
        this.A07.A03(i, A002, i3, AnonymousClass001.A1O(getLayoutDirection()));
        this.A08.A03(i, A002 + this.A07.A00(), i3, AnonymousClass001.A1O(getLayoutDirection()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0H(int i) {
        if (i != this.A0A) {
            this.A0A = i;
            RUt rUt = this.A07;
            FAk.A00(getContext(), this, rUt.A04, RDO.A00[i]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0I(int i) {
        RUt rUt = this.A08;
        rUt.A04.A0G(getContext().getText(i));
        setContentDescription(A00());
        requestLayout();
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0J(int i) {
        RUt rUt = this.A09;
        rUt.A04.A0G(getContext().getText(i));
        setContentDescription(A00());
        requestLayout();
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0K(CharSequence charSequence) {
        int i = this.A00;
        if (i != 1 && i != 2) {
            if (i != 3) {
                switch (i) {
                }
            }
            requestLayout();
            invalidate();
        }
        ((TextView) this.A0K).setText(charSequence);
        requestLayout();
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0L(CharSequence charSequence) {
        this.A07.A04.A0G(charSequence);
        setContentDescription(A00());
        requestLayout();
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0M(CharSequence charSequence) {
        this.A08.A04.A0G(charSequence);
        setContentDescription(A00());
        requestLayout();
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0N(CharSequence charSequence) {
        this.A09.A04.A0G(charSequence);
        setContentDescription(A00());
        requestLayout();
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0O(boolean z) {
        int i = this.A00;
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            ((CompoundButton) this.A0K).setChecked(z);
        }
        requestLayout();
        invalidate();
    }

    @Override // com.facebook.fbui.widget.layout.ImageBlockLayout
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
    }

    @Override // com.facebook.fbui.widget.layout.ImageBlockLayout
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A09.A04(canvas);
        this.A07.A04(canvas);
        this.A08.A04(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        this.A09.A05(accessibilityEvent);
        this.A07.A05(accessibilityEvent);
        this.A08.A05(accessibilityEvent);
        return super/*android.view.View*/.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // com.facebook.fbui.widget.layout.ImageBlockLayout
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        if (this instanceof ContentView) {
            return new C2141Dex();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        ((DP9) marginLayoutParams).A00 = -1;
        return marginLayoutParams;
    }

    @Override // com.facebook.fbui.widget.layout.ImageBlockLayout
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c6  */
    @Override // com.facebook.fbui.widget.layout.ImageBlockLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fig.listitem.FigListItem.onMeasure(int, int):void");
    }

    @Override // com.facebook.fbui.widget.layout.ImageBlockLayout
    public void removeView(View view) {
    }

    @Override // com.facebook.fbui.widget.layout.ImageBlockLayout
    public void removeViewInLayout(View view) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setMaxLines(int i, int i2, int i3) {
        if (this.A0D && this.A05 == i && this.A01 == i2 && this.A0B == i3) {
            return;
        }
        this.A05 = i;
        this.A01 = i2;
        this.A0B = i3;
        this.A0D = true;
        A01();
        requestLayout();
        invalidate();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }
}
