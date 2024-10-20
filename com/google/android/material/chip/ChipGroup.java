package com.google.android.material.chip;

import X.0FI;
import X.GOp;
import X.JXz;
import X.LKg;
import X.LLH;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;

/* loaded from: ChipGroup.class */
public class ChipGroup extends JXz {
    public int A00;
    public int A01;
    public int A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public LKg A06;
    public final LLH A07;

    public ChipGroup(Context context) {
        this(context, null);
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969080);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ChipGroup(android.content.Context r302, android.util.AttributeSet r303, int r304) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A00(ChipGroup chipGroup, int i, boolean z) {
        View findViewById = chipGroup.findViewById(i);
        if (findViewById instanceof Chip) {
            chipGroup.A03 = true;
            ((CompoundButton) findViewById).setChecked(z);
            chipGroup.A03 = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            CompoundButton compoundButton = (CompoundButton) view;
            if (compoundButton.isChecked()) {
                int i2 = this.A00;
                if (i2 != -1 && this.A05) {
                    A00(this, i2, false);
                }
                this.A00 = compoundButton.getId();
            }
        }
        super/*android.view.ViewGroup*/.addView(view, i, layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if ((r302 instanceof X.JXx) == false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            boolean r0 = super/*android.view.ViewGroup*/.checkLayoutParams(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L15
            r0 = r302
            boolean r0 = r0 instanceof X.JXx
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L17
        L15:
            r0 = 0
            r303 = r0
        L17:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.checkLayoutParams(android.view.ViewGroup$LayoutParams):boolean");
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        int A06 = 0FI.A06(119273414);
        super/*android.view.View*/.onFinishInflate();
        int i = this.A00;
        if (i != -1) {
            A00(this, i, true);
            this.A00 = this.A00;
        }
        0FI.A0C(1201006695, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super/*android.view.View*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (((JXz) this).A03) {
            i = 0;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                if (getChildAt(i2) instanceof Chip) {
                    i++;
                }
            }
        } else {
            i = -1;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(((JXz) this).A02, i, false, GOp.A02(this.A05 ? 1 : 0)));
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.A06.A00 = onHierarchyChangeListener;
    }
}
