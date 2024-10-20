package com.facebook.messaging.montage.viewer.swipeablemediapicker;

import X.1BQ;
import X.1Bn;
import X.2Xd;
import X.3yG;
import X.7zL;
import X.AbL;
import X.AbR;
import X.C00i;
import X.C09s;
import X.C6r6;
import X.DKC;
import X.GWb;
import X.HmN;
import X.Hsx;
import X.IKE;
import X.IVV;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.acra.constants.ActionId;
import com.facebook.inject.FbInjector;
import com.facebook.widget.CustomFrameLayout;

/* loaded from: MontageViewerSwipeableMediaPickerContainerView.class */
public class MontageViewerSwipeableMediaPickerContainerView extends CustomFrameLayout {
    public Rect A00;
    public View A01;
    public View A02;
    public RecyclerView A03;
    public C00i A04;
    public C00i A05;
    public GWb A06;
    public HmN A07;
    public int A08;
    public int A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final C00i A0E;

    public MontageViewerSwipeableMediaPickerContainerView(Context context) {
        this(context, null);
    }

    public MontageViewerSwipeableMediaPickerContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [X.GWt, X.2kG, java.lang.Object] */
    public MontageViewerSwipeableMediaPickerContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0E = 1BQ.A02(67262);
        this.A04 = 7zL.A0R(context, 85136);
        this.A05 = 7zL.A0R(context, 522);
        A0U(2132542761);
        this.A01 = C09s.A01(this, 2131365848);
        this.A02 = C09s.A01(this, 2131365851);
        A0V(0.0f);
        IKE.A01(C09s.A01(this, 2131365849), this, ActionId.TIMEOUT);
        RecyclerView recyclerView = (RecyclerView) C09s.A01(this, 2131365510);
        this.A03 = recyclerView;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView.getContext(), 3);
        gridLayoutManager.A1p(1);
        this.A03.A1D(gridLayoutManager);
        int A01 = 3yG.A01(3.0f);
        RecyclerView recyclerView2 = this.A03;
        ?? obj = new Object();
        obj.A00 = A01;
        recyclerView2.A1B(obj);
        AbR A0V = DKC.A0V(this.A05);
        Hsx hsx = new Hsx(null, 1, false, true, true, false, true, false, false, false, false, false, false, false);
        Context A012 = FbInjector.A01();
        AbL.A0y(A0V);
        try {
            2Xd gWb = new GWb(A0V, hsx, (C6r6) null, (Boolean) null, (Integer) null);
            1Bn.A0K();
            FbInjector.A04(A012);
            this.A06 = gWb;
            ((GWb) gWb).A03 = new IVV(this);
            this.A03.A16(gWb);
            this.A00 = DKC.A0C();
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A012);
            throw th;
        }
    }

    public void A0V(float f) {
        View view = this.A01;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) (125.0f * f);
        view.setLayoutParams(layoutParams);
        view.requestLayout();
        this.A02.setAlpha(1.0f - f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0072, code lost:
    
        if (r0 != 3) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e0, code lost:
    
        if ((r0 - r301.A08) <= 30) goto L28;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.viewer.swipeablemediapicker.MontageViewerSwipeableMediaPickerContainerView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        HmN hmN;
        if (motionEvent.getAction() == 0 && this.A0A && (hmN = this.A07) != null) {
            hmN.A00();
        }
        if (this.A0A) {
            return (!this.A03.canScrollVertically(-1) && this.A0C) || this.A0B;
        }
        return false;
    }
}
