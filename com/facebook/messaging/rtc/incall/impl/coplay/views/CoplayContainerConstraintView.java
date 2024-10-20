package com.facebook.messaging.rtc.incall.impl.coplay.views;

import X.0FI;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.2Cz;
import X.2Et;
import X.45Z;
import X.4YV;
import X.AbF;
import X.BOX;
import X.BOk;
import X.C09s;
import X.C6J;
import X.C8hm;
import X.DKC;
import X.DKF;
import X.DKG;
import X.DKI;
import X.E1r;
import X.E9Z;
import X.EtU;
import X.Frb;
import X.GCo;
import X.GOF;
import X.IDw;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.quicksilver.webviewprocess.QuicksilverMainProcessWebView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: CoplayContainerConstraintView.class */
public final class CoplayContainerConstraintView extends ConstraintLayout implements 2Et, GOF, GCo {
    public Space A00;
    public CoplayE2eeDisclaimerLabelView A01;
    public CoplayErrorView A02;
    public CoplayNonJoinerView A03;
    public CoplayPlayerView A04;
    public boolean A05;
    public LithoView A06;
    public LithoView A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final E1r A0C;
    public final Frb A0D;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoplayContainerConstraintView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoplayContainerConstraintView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoplayContainerConstraintView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A08 = 1Bu.A01(context, 85227);
        this.A0B = 1Bq.A00(16943);
        this.A09 = 1Bu.A01(context, 67677);
        this.A0A = 1Lm.A00(context, IDw.A01(this, "CoplayContainerView"), 98493);
        Frb frb = new Frb(this);
        this.A0D = frb;
        E1r e1r = (E1r) 1Lm.A05(context, 4YV.A0E(context), 67676);
        this.A0C = e1r;
        ((2Cz) 1Br.A0B(this.A0B)).CcR(this);
        LayoutInflater.from(context).inflate(2132541771, this);
        this.A01 = (CoplayE2eeDisclaimerLabelView) C09s.A01(this, 2131363386);
        this.A02 = C09s.A01(this, 2131363387);
        this.A03 = (CoplayNonJoinerView) C09s.A01(this, 2131363388);
        this.A04 = (CoplayPlayerView) C09s.A01(this, 2131363389);
        this.A00 = (Space) C09s.A01(this, 2131363001);
        ((EtU) 1Br.A0B(this.A0A)).A01.add(frb);
        LithoView lithoView = (LithoView) C09s.A01(this, 2131364280);
        this.A06 = lithoView;
        if (lithoView != null) {
            lithoView.A0x(new C8hm(e1r, null, true, false, false));
        }
        LithoView lithoView2 = this.A06;
        if (lithoView2 != null) {
            lithoView2.setVisibility(0);
        }
        this.A07 = (LithoView) C09s.A01(this, 2131364281);
        CoplayPlayerView coplayPlayerView = this.A04;
        if (coplayPlayerView != null) {
            coplayPlayerView.A03 = e1r;
            QuicksilverMainProcessWebView quicksilverMainProcessWebView = coplayPlayerView.A05;
            if (quicksilverMainProcessWebView != null) {
                ((E9Z) quicksilverMainProcessWebView).A00 = e1r;
            }
        }
    }

    public /* synthetic */ CoplayContainerConstraintView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (((X.FFo) X.1Br.A0B(r301.A09)).A0G == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A00(X.2JX r302, boolean r303, boolean r304, boolean r305, boolean r306, boolean r307) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.coplay.views.CoplayContainerConstraintView.A00(X.2JX, boolean, boolean, boolean, boolean, boolean):void");
    }

    public void Cd8() {
        FbUserSession A08 = DKI.A08(this);
        CoplayPlayerView coplayPlayerView = this.A04;
        if (coplayPlayerView != null) {
            coplayPlayerView.A04(A08);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0269, code lost:
    
        if (r0 == null) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void CfQ(X.JDB r302) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.coplay.views.CoplayContainerConstraintView.CfQ(X.JDB):void");
    }

    public void D0Y() {
        CoplayPlayerView coplayPlayerView = this.A04;
        if (coplayPlayerView != null) {
            coplayPlayerView.A08 = true;
        }
    }

    public void D5F(45Z r302) {
        BOk bOk;
        int A05 = DKC.A05(r302, 0);
        if (A05 == 0) {
            bOk = BOk.A0H;
        } else if (A05 == 1) {
            bOk = BOk.A0I;
        } else if (A05 == 2) {
            bOk = BOk.A0K;
        } else if (A05 != 3) {
            return;
        } else {
            bOk = BOk.A0J;
        }
        C6J A02 = DKG.A0Z(this.A08).A02(bOk, DKI.A08(this));
        A02.A01 = BOX.A07;
        A02.A05 = AbF.A1D(String.valueOf(r302.mSuggestedTrimRatio));
        A02.A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(476929438);
        super.onAttachedToWindow();
        this.A0C.A0Y(this);
        0FI.A0C(-1390667599, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(1853309663);
        this.A0C.A0X();
        EtU etU = (EtU) 1Br.A0B(this.A0A);
        Frb frb = this.A0D;
        11T.A0F(frb, 0);
        etU.A01.remove(frb);
        super.onDetachedFromWindow();
        0FI.A0C(-1207920972, A06);
    }
}
