package com.facebook.messaging.rtc.incall.impl.active.drawer.plugins.roster;

import X.0FI;
import X.11T;
import X.1BL;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.GOn;
import X.GWU;
import X.GpY;
import X.Gqb;
import X.I3N;
import X.IDw;
import X.IKu;
import X.IaR;
import X.JPN;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.rtc.incall.impl.active.drawer.plugins.roster.header.RosterSheetHeaderView;
import com.facebook.widget.recyclerview.BetterRecyclerView;

/* loaded from: RosterSheetView.class */
public final class RosterSheetView extends FrameLayout implements JPN {
    public View A00;
    public View A01;
    public LithoView A02;
    public GWU A03;
    public FadingEdgeRecyclerView A04;
    public ScrollingControlledLayoutManager A05;
    public Gqb A06;
    public RosterSheetHeaderView A07;
    public boolean A08;
    public final FbUserSession A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final ViewTreeObserver.OnGlobalLayoutListener A0F;

    /* loaded from: RosterSheetView$FadingEdgeRecyclerView.class */
    public final class FadingEdgeRecyclerView extends BetterRecyclerView {
        public float A00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FadingEdgeRecyclerView(Context context) {
            super(context);
            11T.A0F(context, 1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FadingEdgeRecyclerView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            1BL.A1F(context, attributeSet);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FadingEdgeRecyclerView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            1BL.A1F(context, attributeSet);
        }

        @Override // android.view.View
        public float getBottomFadingEdgeStrength() {
            return this.A00;
        }
    }

    /* loaded from: RosterSheetView$ScrollingControlledLayoutManager.class */
    public final class ScrollingControlledLayoutManager extends LinearLayoutManager {
        public boolean A00;

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public boolean A1e() {
            return this.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RosterSheetView(Context context) {
        super(context);
        11T.A0F(context, 1);
        FbUserSession A01 = IDw.A01(this, "RosterSheetView");
        this.A09 = A01;
        Context context2 = getContext();
        this.A0D = 1Bu.A01(context2, 114817);
        this.A0A = GOn.A0R(context2);
        this.A0E = 1Bu.A01(context2, 99830);
        this.A0B = 1Bu.A00(115631);
        this.A0C = 1Bq.A00(115038);
        IKu iKu = new IKu(this, 1);
        this.A0F = iKu;
        1Bn.A0A(115698);
        this.A06 = new GpY(IDw.A01(this, "RosterSheetView"), context2);
        I3N.A00(context2, iKu, A01, this);
        IaR.A00(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RosterSheetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0G(context, 1, attributeSet);
        FbUserSession A01 = IDw.A01(this, "RosterSheetView");
        this.A09 = A01;
        Context context2 = getContext();
        this.A0D = 1Bu.A01(context2, 114817);
        this.A0A = GOn.A0R(context2);
        this.A0E = 1Bu.A01(context2, 99830);
        this.A0B = 1Bu.A00(115631);
        this.A0C = 1Bq.A00(115038);
        IKu iKu = new IKu(this, 1);
        this.A0F = iKu;
        1Bn.A0A(115698);
        this.A06 = new GpY(IDw.A01(this, "RosterSheetView"), context2);
        I3N.A00(context2, iKu, A01, this);
        IaR.A00(this);
    }

    public final void A00(String str) {
        this.A06.A02 = str;
        this.A07.A00.A00 = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x089e, code lost:
    
        if (X.0CU.A0O(r0) != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0a4e, code lost:
    
        if (r0.contains(r0) == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x03ce, code lost:
    
        if (r0.contains(r0) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x03f1, code lost:
    
        if (r0.contains(r0) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x065d, code lost:
    
        if (r0.state == 7) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x06db, code lost:
    
        if (r0.contains(r0) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0718, code lost:
    
        if (r0.contains(r0) == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x073b, code lost:
    
        if (r0.contains(r0) == false) goto L99;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void CfQ(X.JDB r302) {
        /*
            Method dump skipped, instructions count: 3677
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.active.drawer.plugins.roster.RosterSheetView.CfQ(X.JDB):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-2029063946);
        super.onAttachedToWindow();
        this.A06.A0Y(this);
        0FI.A0C(-1065217759, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-1464666624);
        this.A06.A0X();
        this.A04.getViewTreeObserver().removeOnGlobalLayoutListener(this.A0F);
        super.onDetachedFromWindow();
        0FI.A0C(-1718277147, A06);
    }
}
