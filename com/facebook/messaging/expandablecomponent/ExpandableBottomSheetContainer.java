package com.facebook.messaging.expandablecomponent;

import X.C09s;
import X.DKC;
import X.JJw;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.widget.CustomFrameLayout;

/* loaded from: ExpandableBottomSheetContainer.class */
public class ExpandableBottomSheetContainer extends CustomFrameLayout {
    public View A00;
    public View A01;
    public JJw A02;
    public CustomFrameLayout A03;
    public CustomFrameLayout A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public Rect A0G;

    public ExpandableBottomSheetContainer(Context context) {
        super(context);
        this.A05 = false;
        A00(context);
    }

    public ExpandableBottomSheetContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A05 = false;
        A00(context);
    }

    public ExpandableBottomSheetContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A05 = false;
        A00(context);
    }

    private void A00(Context context) {
        A0U(2132541942);
        this.A03 = (CustomFrameLayout) C09s.A01(this, 2131362590);
        this.A01 = C09s.A01(this, 2131364440);
        this.A04 = (CustomFrameLayout) C09s.A01(this, 2131364447);
        this.A0B = ViewConfiguration.get(context).getScaledTouchSlop();
        this.A0G = DKC.A0C();
        this.A06 = false;
        this.A07 = false;
        this.A08 = false;
        this.A09 = false;
        this.A0A = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a0, code lost:
    
        if ((r301.A0E - r0) <= 30) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0170, code lost:
    
        if ((r0 - r301.A0E) <= 30) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0076, code lost:
    
        if (r0 != 3) goto L10;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.expandablecomponent.ExpandableBottomSheetContainer.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
    
        if (r301.A07 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009c, code lost:
    
        if (r301.A02.BTN() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c9, code lost:
    
        if (r0.BTN() == false) goto L38;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.expandablecomponent.ExpandableBottomSheetContainer.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }
}
