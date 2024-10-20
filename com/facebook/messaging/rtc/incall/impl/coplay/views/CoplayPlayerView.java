package com.facebook.messaging.rtc.incall.impl.coplay.views;

import X.0FI;
import X.0KF;
import X.0S2;
import X.11T;
import X.1BK;
import X.1Bi;
import X.1Br;
import X.1Bu;
import X.1HG;
import X.1Lm;
import X.2JX;
import X.2MR;
import X.42L;
import X.4YU;
import X.7zM;
import X.7zO;
import X.AbH;
import X.AnonymousClass001;
import X.BOk;
import X.C09s;
import X.DKF;
import X.DKG;
import X.E1r;
import X.E9Z;
import X.FAb;
import X.FFo;
import X.FKJ;
import X.Fq0;
import X.G2U;
import X.IDw;
import X.IMK;
import X.Ia1;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.quicksilver.webviewprocess.QuicksilverMainProcessWebView;
import com.facebook.rsys.efficiency.gen.EfficiencyLogApi;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: CoplayPlayerView.class */
public final class CoplayPlayerView extends RelativeLayout {
    public Handler A00;
    public LithoView A01;
    public LithoView A02;
    public E1r A03;
    public CoplayProgressView A04;
    public QuicksilverMainProcessWebView A05;
    public Fq0 A06;
    public String A07;
    public boolean A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final AtomicBoolean A0F;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoplayPlayerView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoplayPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoplayPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A09 = 1HG.A00(context, 98387);
        this.A0A = 1Bu.A01(context, 85227);
        this.A0C = 1Bu.A00(85228);
        this.A0B = 1Bu.A01(context, 67677);
        this.A0D = 1Bu.A00(115744);
        this.A0E = 1BK.A0C();
        this.A0F = 7zO.A15();
        LayoutInflater.from(context).inflate(2132541777, this);
        this.A05 = (QuicksilverMainProcessWebView) C09s.A01(this, 2131366801);
        this.A04 = (CoplayProgressView) C09s.A01(this, 2131363393);
        this.A01 = (LithoView) C09s.A01(this, 2131363395);
        this.A02 = (LithoView) C09s.A01(this, 2131363394);
        A01();
    }

    public /* synthetic */ CoplayPlayerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    private final void A00(FbUserSession fbUserSession, 2JX r303) {
        if (r303 != null) {
            Handler handler = this.A00;
            if (handler == null) {
                handler = AnonymousClass001.A07();
                this.A00 = handler;
            }
            handler.postDelayed(new G2U(fbUserSession, this), 0KF.A02(1000.0d * r303.getDoubleValue(109390)));
        }
    }

    public final void A01() {
        QuicksilverMainProcessWebView quicksilverMainProcessWebView = this.A05;
        if (quicksilverMainProcessWebView != null) {
            ((E9Z) quicksilverMainProcessWebView).A05 = true;
            AbH.A1K(quicksilverMainProcessWebView, 7zM.A02(getContext(), 2MR.A05));
            E1r e1r = this.A03;
            if (e1r != null) {
                ((E9Z) quicksilverMainProcessWebView).A00 = e1r;
            }
            quicksilverMainProcessWebView.setBackgroundColor(0);
        }
    }

    public final void A02() {
        synchronized (this) {
            1Br.A0C(this.A0D);
            Ia1 ia1 = ((42L) 1Bi.A03(115725)).A00;
            EfficiencyLogApi Aj2 = ia1 != null ? ia1.Aj2() : null;
            if (Aj2 != null) {
                Aj2.startEventStatCollectionWithEvent(43, 2, "CoplayGameEnd");
            }
            ((FAb) 1Lm.A05(4YU.A08(this), IDw.A01(this, "CoplayPlayerView"), 99472)).A08 = false;
            A03();
            if (Aj2 != null) {
                Aj2.endEventStatWithRegistryKey(43, "CoplayGameEnd");
            }
        }
    }

    public final void A03() {
        synchronized (this) {
            E1r e1r = this.A03;
            if (e1r != null) {
                e1r.A07 = false;
            }
            QuicksilverMainProcessWebView quicksilverMainProcessWebView = this.A05;
            if (quicksilverMainProcessWebView != null) {
                quicksilverMainProcessWebView.loadData("", null, null);
            }
            this.A07 = null;
            Fq0 fq0 = this.A06;
            FKJ fkj = fq0 != null ? fq0.A02 : null;
            AtomicBoolean atomicBoolean = this.A0F;
            if (atomicBoolean.get() && fkj != null) {
                getContext().unbindService(fkj);
                atomicBoolean.set(false);
                this.A06 = null;
            }
        }
    }

    public final void A04(FbUserSession fbUserSession) {
        synchronized (this) {
            11T.A0F(fbUserSession, 0);
            CoplayProgressView coplayProgressView = this.A04;
            if (coplayProgressView != null) {
                LithoView lithoView = coplayProgressView.A00;
                if (lithoView != null) {
                    lithoView.setVisibility(4);
                }
            }
            if (this.A07 != null) {
                QuicksilverMainProcessWebView quicksilverMainProcessWebView = this.A05;
                if (quicksilverMainProcessWebView != null) {
                    quicksilverMainProcessWebView.loadData("", null, null);
                }
                E1r e1r = this.A03;
                if (e1r != null) {
                    e1r.A05 = true;
                    e1r.A08 = false;
                    e1r.A00 = 0;
                    E1r.A02(e1r);
                }
                DKG.A0Z(this.A0A).A02(BOk.A0G, fbUserSession).A00();
                String str = this.A07;
                if (str != null) {
                    QuicksilverMainProcessWebView quicksilverMainProcessWebView2 = this.A05;
                    if (quicksilverMainProcessWebView2 != null) {
                        ((E9Z) quicksilverMainProcessWebView2).A02 = str;
                        quicksilverMainProcessWebView2.A0A(str, null);
                    }
                }
            }
            A00(fbUserSession, ((FAb) 1Lm.A05(4YU.A08(this), IDw.A01(this, "CoplayPlayerView"), 99472)).A00);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:265:0x02d0, code lost:
    
        if (r0 != null) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A05(com.facebook.auth.usersession.FbUserSession r302, X.RrM r303) {
        /*
            Method dump skipped, instructions count: 2222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.coplay.views.CoplayPlayerView.A05(com.facebook.auth.usersession.FbUserSession, X.RrM):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        E1r e1r;
        11T.A0F(motionEvent, 0);
        if (((FFo) 1Br.A0B(this.A0B)).A0Q && motionEvent.getActionMasked() == 1 && (e1r = this.A03) != null) {
            ((IMK) 1Br.A0B(e1r.A0C)).A0B(0S2.A01);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(637412664);
        super.onAttachedToWindow();
        this.A08 = false;
        0FI.A0C(-1457320134, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        E1r e1r;
        int A06 = 0FI.A06(1507066717);
        if (this.A08 || ((e1r = this.A03) != null && e1r.A07)) {
            A02();
        }
        super.onDetachedFromWindow();
        0FI.A0C(419317058, A06);
    }
}
