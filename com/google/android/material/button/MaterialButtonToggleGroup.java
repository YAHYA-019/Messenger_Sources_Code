package com.google.android.material.button;

import X.0FI;
import X.6LS;
import X.6Lc;
import X.6Ld;
import X.6Lf;
import X.6Lg;
import X.6Lk;
import X.7zL;
import X.AnonymousClass001;
import X.C0Ad;
import X.C2957Jek;
import X.DKC;
import X.DKE;
import X.GOp;
import X.LAB;
import X.LeI;
import X.LeJ;
import X.LsJ;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;

/* loaded from: MaterialButtonToggleGroup.class */
public class MaterialButtonToggleGroup extends LinearLayout {
    public int A00;
    public boolean A01;
    public boolean A02;
    public Integer[] A03;
    public boolean A04;
    public final LeI A05;
    public final LeJ A06;
    public final Comparator A07;
    public final LinkedHashSet A08;
    public final List A09;

    public MaterialButtonToggleGroup(Context context) {
        this(context, null);
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130971068);
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i) {
        super(6LS.A00(context, attributeSet, i, 2132608596), attributeSet, i);
        this.A09 = AnonymousClass001.A0s();
        this.A05 = new LeI(this);
        this.A06 = new LeJ(this);
        this.A08 = 7zL.A15();
        this.A07 = new LsJ(this, 8);
        this.A02 = false;
        TypedArray A00 = 6Lc.A00(getContext(), attributeSet, 6Ld.A0D, new int[0], i, 2132608596);
        boolean z = A00.getBoolean(2, false);
        if (this.A01 != z) {
            this.A01 = z;
            this.A02 = true;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= getChildCount()) {
                    break;
                }
                6Lf r0 = (MaterialButton) getChildAt(i3);
                r0.setChecked(false);
                r0.getId();
                A02(this);
                i2 = i3 + 1;
            }
            this.A02 = false;
            this.A00 = -1;
            A02(this);
        }
        this.A00 = A00.getResourceId(0, -1);
        this.A04 = A00.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        A00.recycle();
        setImportantForAccessibility(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [com.google.android.material.button.MaterialButton, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v79, types: [android.view.ViewGroup$MarginLayoutParams] */
    private void A00() {
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= childCount) {
                return;
            }
            if (getChildAt(i2).getVisibility() != 8) {
                if (i2 != -1) {
                    int i3 = i2;
                    while (true) {
                        int i4 = i3 + 1;
                        if (i4 >= getChildCount()) {
                            break;
                        }
                        ?? r0 = (MaterialButton) getChildAt(i4);
                        int min = Math.min(r0.getStrokeWidth(), ((MaterialButton) getChildAt(i4 - 1)).getStrokeWidth());
                        ViewGroup.LayoutParams layoutParams = r0.getLayoutParams();
                        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
                        if (getOrientation() == 0) {
                            layoutParams2.setMarginEnd(0);
                            layoutParams2.setMarginStart(-min);
                            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = 0;
                            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = -min;
                            layoutParams2.setMarginStart(0);
                        }
                        r0.setLayoutParams(layoutParams2);
                        i3 = i4;
                    }
                    if (getChildCount() != 0) {
                        ViewGroup.MarginLayoutParams A0I = DKC.A0I(getChildAt(i2));
                        if (getOrientation() == 1) {
                            A0I.topMargin = 0;
                            A0I.bottomMargin = 0;
                            return;
                        } else {
                            A0I.setMarginEnd(0);
                            A0I.setMarginStart(0);
                            A0I.leftMargin = 0;
                            A0I.rightMargin = 0;
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            i = i2 + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c2, code lost:
    
        if (r312 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010e, code lost:
    
        if (getLayoutDirection() == 1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0111, code lost:
    
        r313 = X.Kkf.A04;
        r305 = r312.A03;
        r314 = r312.A01;
        r312 = new java.lang.Object();
        r312.A02 = r313;
        r312 = r312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01d6, code lost:
    
        r0 = r312.A02;
        r313 = r312.A00;
        r314 = X.Kkf.A04;
        r312 = new java.lang.Object();
        r312.A02 = r0;
        r312.A03 = r314;
        r312 = r312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d3, code lost:
    
        if (getLayoutDirection() == 1) goto L46;
     */
    /* JADX WARN: Type inference failed for: r0v19, types: [com.google.android.material.button.MaterialButton, android.view.View] */
    /* JADX WARN: Type inference failed for: r312v1, types: [java.lang.Object, X.Kkf] */
    /* JADX WARN: Type inference failed for: r312v2, types: [java.lang.Object, X.Kkf] */
    /* JADX WARN: Type inference failed for: r312v6, types: [java.lang.Object, X.Kkf] */
    /* JADX WARN: Type inference failed for: r312v7, types: [java.lang.Object, X.Kkf] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A01() {
        /*
            Method dump skipped, instructions count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.A01():void");
    }

    public static void A02(MaterialButtonToggleGroup materialButtonToggleGroup) {
        Iterator it = materialButtonToggleGroup.A08.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public static boolean A03(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
        ArrayList A0s = AnonymousClass001.A0s();
        for (int i2 = 0; i2 < materialButtonToggleGroup.getChildCount(); i2++) {
            6Lf r0 = (MaterialButton) materialButtonToggleGroup.getChildAt(i2);
            if (r0.isChecked()) {
                AnonymousClass001.A1J(A0s, r0.getId());
            }
        }
        if (materialButtonToggleGroup.A04 && A0s.isEmpty()) {
            Object findViewById = materialButtonToggleGroup.findViewById(i);
            if (findViewById instanceof MaterialButton) {
                materialButtonToggleGroup.A02 = true;
                ((MaterialButton) findViewById).setChecked(true);
                materialButtonToggleGroup.A02 = false;
            }
            materialButtonToggleGroup.A00 = i;
            return false;
        }
        if (z && materialButtonToggleGroup.A01) {
            A0s.remove(Integer.valueOf(i));
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                Object findViewById2 = materialButtonToggleGroup.findViewById(DKE.A0F(it));
                if (findViewById2 instanceof MaterialButton) {
                    materialButtonToggleGroup.A02 = true;
                    ((MaterialButton) findViewById2).setChecked(false);
                    materialButtonToggleGroup.A02 = false;
                }
                A02(materialButtonToggleGroup);
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, X.Kkf] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.widget.TextView, com.google.android.material.button.MaterialButton, android.view.View] */
    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MaterialButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        ?? r0 = (MaterialButton) view;
        if (r0.getId() == -1) {
            r0.setId(View.generateViewId());
        }
        r0.setMaxLines(1);
        r0.setEllipsize(TextUtils.TruncateAt.END);
        if (MaterialButton.A02(r0)) {
            r0.A0B.A0F = true;
        }
        r0.A0C.add(this.A05);
        r0.A02 = this.A06;
        if (MaterialButton.A02(r0)) {
            LAB lab = r0.A0B;
            lab.A0H = true;
            LAB.A02(lab);
        }
        if (r0.isChecked()) {
            A03(this, r0.getId(), true);
            this.A00 = r0.getId();
            A02(this);
        }
        if (!MaterialButton.A02(r0)) {
            throw AnonymousClass001.A0N("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        }
        6Lg r02 = r0.A0B.A0D;
        List list = this.A09;
        6Lk r03 = r02.A02;
        6Lk r04 = r02.A00;
        6Lk r05 = r02.A03;
        6Lk r06 = r02.A01;
        ?? obj = new Object();
        obj.A02 = r03;
        obj.A03 = r05;
        obj.A01 = r06;
        obj.A00 = r04;
        list.add(obj);
        C0Ad.A0B(r0, new C2957Jek(this, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.A07);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            AnonymousClass001.A1A(getChildAt(i), treeMap, i);
        }
        this.A03 = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.A03;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MaterialButtonToggleGroup", "Child order wasn't updated");
        return i2;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        MaterialButton materialButton;
        int A06 = 0FI.A06(1157104945);
        super.onFinishInflate();
        int i = this.A00;
        if (i != -1 && (materialButton = (MaterialButton) findViewById(i)) != null) {
            materialButton.setChecked(true);
        }
        0FI.A0C(-1724857838, A06);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && getChildAt(i2).getVisibility() != 8) {
                i++;
            }
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, i, false, GOp.A02(this.A01 ? 1 : 0)));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        A01();
        A00();
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.A0C.remove(this.A05);
            materialButton.A02 = null;
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.A09.remove(indexOfChild);
        }
        A01();
        A00();
    }
}
