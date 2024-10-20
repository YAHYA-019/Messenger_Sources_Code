package com.facebook.messaging.xma.hscroll;

import X.0FI;
import X.11T;
import X.1BY;
import X.1Bn;
import X.1Hv;
import X.9Xa;
import X.9bN;
import X.C0A8;
import X.DKC;
import X.DKH;
import X.DTQ;
import X.DTT;
import X.EBw;
import X.EeL;
import X.FZM;
import X.FkC;
import X.HpU;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.widget.CustomFrameLayout;
import com.facebook.widget.ListViewFriendlyViewPager;

/* loaded from: HScrollAttachmentContainer.class */
public final class HScrollAttachmentContainer extends CustomFrameLayout {
    public int A00;
    public Rect A01;
    public EeL A02;
    public 9Xa A03;
    public DTQ A04;
    public 9bN A05;
    public EBw A06;
    public HpU A07;
    public String A08;
    public boolean A09;

    public HScrollAttachmentContainer(Context context) {
        super(context);
        A00();
    }

    public HScrollAttachmentContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public HScrollAttachmentContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    private void A00() {
        Context context = getContext();
        this.A04 = (DTQ) 1Bn.A0E(context, (1BY) null, 100025);
        this.A05 = (9bN) 1Bn.A0E(context, (1BY) null, 68063);
        this.A07 = (HpU) 1Bn.A0E(context, (1BY) null, 67312);
        this.A03 = (9Xa) 1Hv.A02(context, 68058);
        this.A01 = DKC.A0C();
        this.A00 = C0A8.A00(context, 4.0f);
        setClipChildren(false);
        DTT listViewFriendlyViewPager = new ListViewFriendlyViewPager(context);
        this.A06 = listViewFriendlyViewPager;
        DKH.A16(listViewFriendlyViewPager);
        EBw eBw = this.A06;
        ViewGroup.LayoutParams layoutParams = eBw.getLayoutParams();
        layoutParams.height = 0;
        eBw.A01 = true;
        eBw.setLayoutParams(layoutParams);
        this.A06.setClipChildren(false);
        this.A06.A0M(this.A00);
        addView(this.A06);
        EBw eBw2 = this.A06;
        eBw2.A0U(new FZM(this, 1));
        DTQ dtq = this.A04;
        dtq.getClass();
        eBw2.A0R(dtq);
        HpU hpU = this.A07;
        hpU.getClass();
        hpU.A00 = new FkC(this, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (super.onInterceptTouchEvent(r302) != false) goto L6;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r302) {
        /*
            r301 = this;
            r0 = r301
            X.HpU r0 = r0.A07
            r303 = r0
            r0 = r303
            java.lang.Class r0 = r0.getClass()
            r0 = r303
            r1 = r302
            boolean r0 = r0.A00(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L24
            r0 = r301
            r1 = r302
            boolean r0 = super.onInterceptTouchEvent(r1)
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r305
            if (r0 == 0) goto L26
        L24:
            r0 = 1
            r304 = r0
        L26:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.xma.hscroll.HScrollAttachmentContainer.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        ViewGroup.MarginLayoutParams A0I = DKC.A0I(this.A06);
        int i3 = A0I.leftMargin;
        int i4 = size - (A0I.rightMargin + i3);
        int i5 = i3 / i4;
        if (i3 % i4 > 0) {
            i5++;
        }
        int i6 = size - (i3 + i4);
        int i7 = i6 / i4;
        if (i6 % i4 > 0) {
            i7++;
        }
        this.A06.A0L(Math.max(i5, i7) + 1);
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent;
        int i;
        int A05 = 0FI.A05(-11820465);
        HpU hpU = this.A07;
        hpU.getClass();
        11T.A0F(motionEvent, 0);
        if (motionEvent.getAction() == 0) {
            hpU.A01 = false;
        }
        int x = ((int) this.A06.getX()) - this.A06.getScrollX();
        int y = ((int) this.A06.getY()) - this.A06.getScrollY();
        DTQ dtq = this.A04;
        dtq.getClass();
        int A0C = dtq.A0C();
        Rect rect = this.A01;
        int width = (this.A06.getWidth() * A0C) + x;
        EBw eBw = this.A06;
        rect.set(x, y, width + (eBw.A09 * (A0C - 1)), eBw.getHeight() + y);
        if (this.A01.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            motionEvent.offsetLocation(-this.A06.getX(), -this.A06.getY());
            dispatchTouchEvent = this.A06.dispatchTouchEvent(motionEvent);
            motionEvent.offsetLocation(this.A06.getX(), this.A06.getY());
            i = 1687287793;
        } else {
            dispatchTouchEvent = super.onTouchEvent(motionEvent);
            i = -839172170;
        }
        0FI.A0B(i, A05);
        return dispatchTouchEvent;
    }
}
