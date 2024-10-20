package com.facebook.fig.deprecated.sectionheader;

import X.4YU;
import X.5B0;
import X.AnonymousClass001;
import X.C00i;
import X.EVU;
import X.RUt;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.facebook.fbui.widget.layout.ImageBlockLayout;

/* loaded from: FigSectionHeader.class */
public class FigSectionHeader extends ImageBlockLayout {
    public int A00;
    public RUt A01;
    public boolean A02;
    public int A03;
    public Paint A04;
    public C00i A05;

    public FigSectionHeader(Context context) {
        super(context);
        A00(null, 0);
    }

    public FigSectionHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(attributeSet, 0);
    }

    public FigSectionHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(attributeSet, i);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v10 java.lang.CharSequence, still in use, count: 2, list:
          (r304v10 java.lang.CharSequence) from 0x0118: PHI (r304v17 java.lang.CharSequence) = (r304v10 java.lang.CharSequence) binds: [B:33:0x023d] A[DONT_GENERATE, DONT_INLINE]
          (r304v10 java.lang.CharSequence) from 0x023d: IF  (r304v10 java.lang.CharSequence) != (null java.lang.CharSequence)  -> B:16:0x0118 A[HIDDEN]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Multi-variable type inference failed */
    private void A00(android.util.AttributeSet r302, int r303) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fig.deprecated.sectionheader.FigSectionHeader.A00(android.util.AttributeSet, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A01(FigSectionHeader figSectionHeader, CharSequence charSequence) {
        RUt rUt = figSectionHeader.A01;
        rUt.A04.A0G(((5B0) 4YU.A0p(figSectionHeader.A05)).getTransformation(charSequence, (View) null));
        figSectionHeader.setContentDescription(figSectionHeader.A01.A04.A06.A0I);
        figSectionHeader.requestLayout();
        figSectionHeader.invalidate();
    }

    @Override // com.facebook.fbui.widget.layout.ImageBlockLayout
    public void A0A(int i) {
    }

    @Override // com.facebook.fbui.widget.layout.ImageBlockLayout
    public void A0C(int i, int i2) {
        this.A01.A01(i);
        int max = Math.max(0, EVU.A00(this.A01.A03));
        int A00 = this.A01.A00();
        this.A08 = max;
        this.A07 = A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.fbui.widget.layout.ImageBlockLayout
    public void A0G(boolean z, int i, int i2, int i3, int i4) {
        this.A01.A03(i, i2, i3, AnonymousClass001.A1O(getLayoutDirection()));
    }

    @Override // com.facebook.fbui.widget.layout.ImageBlockLayout
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A01.A04(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        this.A01.A05(accessibilityEvent);
        return super/*android.view.View*/.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        if (this.A02) {
            canvas.drawRect(0.0f, canvas.getHeight() - this.A03, canvas.getWidth(), r0 + this.A03, this.A04);
        }
        super/*android.view.View*/.onDraw(canvas);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }
}
