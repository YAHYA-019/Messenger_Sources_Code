package com.facebook.messaging.rtc.incall.impl.coplay.views;

import X.0FI;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.2Cz;
import X.2Et;
import X.2OB;
import X.45Z;
import X.4YV;
import X.7zL;
import X.7zQ;
import X.AbF;
import X.BOX;
import X.BOk;
import X.C09s;
import X.C1rs;
import X.C6J;
import X.DKC;
import X.DKD;
import X.DKF;
import X.DKG;
import X.DKI;
import X.E1r;
import X.E9Z;
import X.EtU;
import X.Frc;
import X.GOF;
import X.IDw;
import X.QDH;
import X.QJN;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.quicksilver.webviewprocess.QuicksilverMainProcessWebView;
import com.mapbox.mapboxsdk.R;
import java.util.BitSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: CoplayContainerView.class */
public final class CoplayContainerView extends RelativeLayout implements 2Et, GOF {
    public int A00;
    public View A01;
    public LithoView A02;
    public E1r A03;
    public CoplayErrorView A04;
    public CoplayNonJoinerView A05;
    public CoplayPlayerView A06;
    public boolean A07;
    public boolean A08;
    public CoplayE2eeDisclaimerLabelView A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final Frc A0E;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoplayContainerView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoplayContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoplayContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A0A = 1Bu.A01(context, 85227);
        this.A0D = 1Bq.A00(16943);
        this.A0B = 1Bu.A01(context, 67677);
        this.A0C = 1Lm.A00(context, IDw.A01(this, "CoplayContainerView"), 98493);
        Frc frc = new Frc(this);
        this.A0E = frc;
        this.A03 = (E1r) 1Lm.A05(context, 4YV.A0E(context), 67676);
        ((2Cz) 1Br.A0B(this.A0D)).CcR(this);
        Context context2 = getContext();
        LayoutInflater from = LayoutInflater.from(context2);
        11T.A0A(from);
        this.A01 = from.inflate(2132541772, this);
        ((EtU) 1Br.A0B(this.A0C)).A01.add(frc);
        LithoView lithoView = (LithoView) C09s.A01(this, 2131363050);
        this.A02 = lithoView;
        if (lithoView != null) {
            QDH qdh = new QDH(7zL.A0W(context2), new QJN());
            E1r e1r = this.A03;
            QJN qjn = qdh.A01;
            qjn.A00 = e1r;
            BitSet bitSet = qdh.A02;
            bitSet.set(0);
            C1rs.A05(bitSet, qdh.A03, 1);
            qdh.A0J();
            lithoView.A0x(qjn);
        }
        7zQ.A19(this.A02);
        this.A09 = (CoplayE2eeDisclaimerLabelView) C09s.A01(this, 2131363386);
        this.A04 = C09s.A01(this, 2131363387);
        this.A05 = (CoplayNonJoinerView) C09s.A01(this, 2131363388);
        CoplayPlayerView coplayPlayerView = (CoplayPlayerView) C09s.A01(this, 2131363389);
        this.A06 = coplayPlayerView;
        this.A00 = coplayPlayerView != null ? coplayPlayerView.getHeight() : 0;
        CoplayPlayerView coplayPlayerView2 = this.A06;
        if (coplayPlayerView2 != null) {
            E1r e1r2 = this.A03;
            coplayPlayerView2.A03 = e1r2;
            QuicksilverMainProcessWebView quicksilverMainProcessWebView = coplayPlayerView2.A05;
            if (quicksilverMainProcessWebView != null) {
                ((E9Z) quicksilverMainProcessWebView).A00 = e1r2;
            }
        }
    }

    public /* synthetic */ CoplayContainerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    private final int A00() {
        View view;
        2OB r0 = this.A09;
        int i = 0;
        if (r0 != null && r0.getVisibility() == 0 && (view = this.A01) != null) {
            r0.measure(DKD.A00(view.getWidth()), View.MeasureSpec.makeMeasureSpec(0, 0));
            i = r0.getMeasuredHeight() + (getResources().getDimensionPixelSize(R.dimen.mapbox_eight_dp) * 2);
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0101, code lost:
    
        if (r0 == null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A01(com.facebook.auth.usersession.FbUserSession r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.coplay.views.CoplayContainerView.A01(com.facebook.auth.usersession.FbUserSession, boolean):void");
    }

    public void Cd8() {
        FbUserSession A08 = DKI.A08(this);
        CoplayPlayerView coplayPlayerView = this.A06;
        if (coplayPlayerView != null) {
            coplayPlayerView.A04(A08);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void CfQ(X.JDB r302) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.coplay.views.CoplayContainerView.CfQ(X.JDB):void");
    }

    public void D0Y() {
        CoplayPlayerView coplayPlayerView = this.A06;
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
        C6J A02 = DKG.A0Z(this.A0A).A02(bOk, DKI.A08(this));
        A02.A01 = BOX.A07;
        A02.A05 = AbF.A1D(String.valueOf(r302.mSuggestedTrimRatio));
        A02.A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(1481912677);
        super.onAttachedToWindow();
        this.A03.A0Y(this);
        0FI.A0C(52746059, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-729207552);
        this.A03.A0X();
        EtU etU = (EtU) 1Br.A0B(this.A0C);
        Frc frc = this.A0E;
        11T.A0F(frc, 0);
        etU.A01.remove(frc);
        super.onDetachedFromWindow();
        0FI.A0C(-1339681102, A06);
    }
}
