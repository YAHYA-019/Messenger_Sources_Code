package com.facebook.widget;

import X.AbstractC2327GOs;
import X.C1oo;
import X.GUb;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: FlowLayout.class */
public class FlowLayout extends ViewGroup {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public boolean A07;
    public boolean A08;
    public int[] A09;
    public int[] A0A;

    public FlowLayout(Context context) {
        super(context);
        AbstractC2327GOs.A0w(this);
        A00(context, null);
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC2327GOs.A0w(this);
        A00(context, attributeSet);
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC2327GOs.A0w(this);
        A00(context, attributeSet);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        int i = this.A03;
        this.A0A = new int[i];
        this.A09 = new int[i];
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A1a);
            try {
                this.A01 = obtainStyledAttributes.getDimensionPixelSize(2, this.A01);
                this.A04 = obtainStyledAttributes.getDimensionPixelSize(6, this.A04);
                this.A08 = obtainStyledAttributes.getBoolean(1, this.A08);
                this.A02 = obtainStyledAttributes.getInteger(5, this.A02);
                this.A07 = obtainStyledAttributes.getBoolean(0, this.A07);
                obtainStyledAttributes.recycle();
                obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.gravity});
                this.A00 = obtainStyledAttributes.getInteger(0, this.A00);
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof GUb;
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        ((GUb) layoutParams).A00 = 51;
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_gravity});
        try {
            ((GUb) layoutParams).A00 = obtainStyledAttributes.getInteger(0, 51);
            return layoutParams;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(layoutParams.width, layoutParams.height);
        ((GUb) layoutParams2).A00 = 51;
        return layoutParams2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0243  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r302, int r303, int r304, int r305, int r306) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.widget.FlowLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bd, code lost:
    
        if (r315 > r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x024d, code lost:
    
        if (r301.A07 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0263, code lost:
    
        r311 = r311 + (r301.A09[r318] + r301.A04);
        r310 = getPaddingLeft();
        r318 = r318 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x029e, code lost:
    
        if (r301.A03 > r318) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02a1, code lost:
    
        r0 = r318 + 1;
        r301.A03 = r0;
        r0 = new int[r0];
        r0 = r301.A0A;
        java.lang.System.arraycopy(r0, 0, r0, 0, r0.length);
        r301.A0A = r0;
        r0 = new int[r301.A03];
        r0 = r301.A09;
        java.lang.System.arraycopy(r0, 0, r0, 0, r0.length);
        r301.A09 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0260, code lost:
    
        if ((r310 + r0) > r0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x023a, code lost:
    
        if (r308 == false) goto L58;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 913
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.widget.FlowLayout.onMeasure(int, int):void");
    }
}
