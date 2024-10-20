package com.facebook.litho.widget;

import X.0FI;
import X.0Pz;
import X.1Iw;
import X.1Jh;
import X.1Jj;
import X.1Lc;
import X.2Q8;
import X.2Z7;
import X.7zO;
import X.Evt;
import X.GEy;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import androidx.core.widget.NestedScrollView;
import com.facebook.litho.BaseMountingView;
import java.util.List;
import java.util.Map;

/* loaded from: LithoScrollView.class */
public class LithoScrollView extends NestedScrollView implements 2Z7 {
    public ViewTreeObserver.OnPreDrawListener A00;
    public GEy A01;
    public Evt A02;
    public String A03;
    public String A04;
    public final BaseMountingView A05;

    public LithoScrollView(Context context) {
        this(context, 7zO.A0V(context));
    }

    public LithoScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LithoScrollView(Context context, AttributeSet attributeSet, int i) {
        this(context, 7zO.A0V(context), attributeSet, i);
    }

    public LithoScrollView(Context context, BaseMountingView baseMountingView) {
        this(context, baseMountingView, null, 0);
    }

    public LithoScrollView(Context context, BaseMountingView baseMountingView, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A05 = baseMountingView;
        addView(baseMountingView);
    }

    @Override // androidx.core.widget.NestedScrollView
    public void A0F(int i) {
        super.A0F(i);
    }

    public void Bgv(List list) {
        list.add(this.A05);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return super.dispatchNestedFling(f, f2, true);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void draw(Canvas canvas) {
        try {
            super.draw(canvas);
        } catch (Throwable th) {
            1Jh A00 = 1Jj.A00();
            1Lc r0 = 1Lc.A03;
            String str = this.A04;
            if (str == null) {
                str = "null";
            }
            A00.Cg3(r0, "LITHO:NPE:LITHO_SCROLL_VIEW_DRAW", 0Pz.A0W("Root component: ", str), th, (Map) null, 0);
            throw new 2Q8((1Iw) null, this.A04, this.A03, th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r304 == false) goto L6;
     */
    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r302) {
        /*
            r301 = this;
            r0 = r301
            X.GEy r0 = r0.A01
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L26
            r0 = r303
            r1 = r302
            r2 = r301
            boolean r0 = r0.C25(r1, r2)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L24
        L16:
            r0 = r301
            r1 = r302
            boolean r0 = super.onInterceptTouchEvent(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L24
            r0 = 1
            r304 = r0
        L24:
            r0 = r304
            return r0
        L26:
            r0 = 0
            r304 = r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.widget.LithoScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.A05.Bgo();
        Evt evt = this.A02;
        if (evt != null) {
            evt.A00 = getScrollY();
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = 0FI.A05(1924110773);
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        0FI.A0B(-1495992153, A05);
        return onTouchEvent;
    }
}
