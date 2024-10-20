package com.facebook.messaging.rtc.incall.impl.dominantspeaker;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.2Xd;
import X.7zM;
import X.AnonymousClass001;
import X.C01i;
import X.DKG;
import X.GS2;
import X.GWJ;
import X.Hkr;
import X.IDw;
import X.J9s;
import X.JFq;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.widget.CustomFrameLayout;

/* loaded from: DominantSpeakerParticipantsView.class */
public final class DominantSpeakerParticipantsView extends CustomFrameLayout implements JFq {
    public View A00;
    public RecyclerView A01;
    public GWJ A02;
    public final 1Br A03;
    public final 1Br A04;
    public final C01i A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DominantSpeakerParticipantsView(Context context) {
        super(context);
        11T.A0F(context, 1);
        this.A04 = 1Bu.A00(115704);
        this.A05 = J9s.A01(this, 27);
        this.A03 = 1Bq.A00(115036);
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DominantSpeakerParticipantsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        this.A04 = 1Bu.A00(115704);
        this.A05 = J9s.A01(this, 27);
        this.A03 = 1Bq.A00(115036);
        A00();
    }

    private final void A00() {
        String str;
        Context context = getContext();
        LayoutInflater.from(context).inflate(2132541864, this);
        RecyclerView recyclerView = (RecyclerView) DKG.A0B(this, 2131366893);
        11T.A0F(recyclerView, 0);
        this.A01 = recyclerView;
        Hkr hkr = (Hkr) 1Br.A0B(this.A04);
        11T.A0A(context);
        this.A00 = hkr.A00(context, IDw.A01(this, "DominantSpeakerParticipantsView"), 3);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 8388613;
        View view = this.A00;
        if (view == null) {
            str = "selfView";
        } else {
            view.setLayoutParams(layoutParams);
            RecyclerView recyclerView2 = this.A01;
            if (recyclerView2 != null) {
                recyclerView2.A1D(new LinearLayoutManager(context, 0, true));
                2Xd gwj = new GWJ();
                this.A02 = gwj;
                RecyclerView recyclerView3 = this.A01;
                if (recyclerView3 != null) {
                    recyclerView3.A16(gwj);
                    return;
                }
            }
            str = "remoteParticipantsList";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002c, code lost:
    
        if (r0.A01 == false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0102  */
    @Override // X.JFq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void CfQ(X.JDB r302) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.dominantspeaker.DominantSpeakerParticipantsView.CfQ(X.JDB):void");
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-1647086697);
        super.onAttachedToWindow();
        ((GS2) 7zM.A1B(this.A05)).A0Y(this);
        0FI.A0C(1369543047, A06);
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(1141232767);
        ((GS2) 7zM.A1B(this.A05)).A0X();
        super.onDetachedFromWindow();
        0FI.A0C(1818951582, A06);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        GWJ gwj = this.A02;
        if (gwj != null) {
            return AnonymousClass001.A1O(gwj.A00.size());
        }
        11T.A0L("adapter");
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        String str;
        int width;
        super.onLayout(z, i, i2, i3, i4);
        RecyclerView recyclerView = this.A01;
        if (recyclerView != null) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams == null) {
                throw 1BK.A0h();
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            View view = this.A00;
            str = "selfView";
            if (view != null) {
                if (view.getParent() != null || marginLayoutParams.rightMargin == 0) {
                    View view2 = this.A00;
                    if (view2 != null) {
                        if (view2.getParent() == null) {
                            return;
                        }
                        int i5 = marginLayoutParams.rightMargin;
                        View view3 = this.A00;
                        if (view3 != null) {
                            if (i5 == view3.getWidth()) {
                                return;
                            }
                            View view4 = this.A00;
                            if (view4 != null) {
                                width = view4.getWidth();
                            }
                        }
                    }
                } else {
                    width = 0;
                }
                marginLayoutParams.rightMargin = width;
                RecyclerView recyclerView2 = this.A01;
                if (recyclerView2 != null) {
                    recyclerView2.requestLayout();
                    return;
                }
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
        str = "remoteParticipantsList";
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = 0FI.A05(1425614229);
        GWJ gwj = this.A02;
        if (gwj == null) {
            11T.A0L("adapter");
            throw 0Q8.createAndThrow();
        }
        boolean A1P = AnonymousClass001.A1P(gwj.A00.size());
        0FI.A0B(-1183390746, A05);
        return A1P;
    }
}
