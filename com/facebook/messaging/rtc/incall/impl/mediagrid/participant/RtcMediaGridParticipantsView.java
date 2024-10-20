package com.facebook.messaging.rtc.incall.impl.mediagrid.participant;

import X.0FI;
import X.0Q8;
import X.0S2;
import X.11T;
import X.1BK;
import X.1Bn;
import X.1Br;
import X.1Bu;
import X.1HG;
import X.4YU;
import X.7zR;
import X.AbF;
import X.C01i;
import X.C03i;
import X.GOp;
import X.Gqy;
import X.GvG;
import X.ICR;
import X.IZV;
import X.J9t;
import X.JD9;
import X.JDB;
import X.JPC;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.widget.CustomLinearLayout;
import com.google.common.collect.ImmutableList;

/* loaded from: RtcMediaGridParticipantsView.class */
public final class RtcMediaGridParticipantsView extends CustomLinearLayout implements JPC, JD9 {
    public Gqy A00;
    public ImmutableList A01;
    public Integer A02;
    public boolean A03;
    public boolean A04;
    public GvG A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final C01i A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtcMediaGridParticipantsView(Context context) {
        super(context);
        11T.A0F(context, 1);
        this.A07 = 1Bu.A00(115704);
        Context A08 = 4YU.A08(this);
        this.A08 = 1HG.A00(A08, 115350);
        this.A06 = 1Bu.A01(A08, 67593);
        this.A09 = J9t.A00(this, C03i.A02, 2);
        this.A01 = 1BK.A0b();
        this.A02 = 0S2.A00;
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtcMediaGridParticipantsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        this.A07 = 1Bu.A00(115704);
        Context A08 = 4YU.A08(this);
        this.A08 = 1HG.A00(A08, 115350);
        this.A06 = 1Bu.A01(A08, 67593);
        this.A09 = J9t.A00(this, C03i.A02, 2);
        this.A01 = 1BK.A0b();
        this.A02 = 0S2.A00;
        A00();
    }

    private final void A00() {
        Context A08 = 4YU.A08(this);
        GvG gvG = new GvG(A08);
        this.A05 = gvG;
        7zR.A11(gvG);
        FbUserSession fbUserSession = (FbUserSession) this.A09.getValue();
        1Bn.A0A(115711);
        this.A00 = new Gqy(A08, fbUserSession);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r302.A04 == false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A01(X.IZV r302) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.mediagrid.participant.RtcMediaGridParticipantsView.A01(X.IZV):void");
    }

    public /* bridge */ /* synthetic */ void CfQ(JDB jdb) {
        IZV izv = (IZV) jdb;
        11T.A0F(izv, 0);
        if (izv.A06) {
            Integer num = (izv.A02 || !izv.A04) ? 0S2.A0C : 0S2.A01;
            ICR icr = (ICR) 1Br.A0B(this.A06);
            boolean A06 = icr.A06(1Br.A03(icr.A02), true);
            int visibility = getVisibility();
            if (!A06 ? visibility != 0 : visibility != 0 || this.A02 != num) {
                this.A02 = num;
                removeAllViews();
                A01(izv);
                setVisibility(0);
            }
        } else if (getVisibility() != 8) {
            this.A02 = 0S2.A00;
            setVisibility(8);
            removeAllViews();
        }
        if (getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) GOp.A0C(this);
            int i = 17;
            if (izv.A05) {
                i = 8388613;
            }
            layoutParams.gravity = i;
        }
        if (getVisibility() == 0) {
            ImmutableList immutableList = this.A01;
            ImmutableList immutableList2 = izv.A00;
            if (11T.A0O(immutableList, immutableList2) && this.A03 == izv.A02 && this.A04 == izv.A03) {
                return;
            }
            11T.A0A(immutableList2);
            this.A01 = immutableList2;
            this.A03 = izv.A02;
            this.A04 = izv.A03;
            A01(izv);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        String str;
        int A06 = 0FI.A06(620561403);
        super.onAttachedToWindow();
        Gqy gqy = this.A00;
        if (gqy == null) {
            str = "presenter";
        } else {
            gqy.A0Y(this);
            GvG gvG = this.A05;
            if (gvG != null) {
                gvG.A00 = this;
                0FI.A0C(1727694724, A06);
                return;
            }
            str = "floatingParticipantsView";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        11T.A0F(configuration, 0);
        super.onConfigurationChanged(configuration);
        Gqy gqy = this.A00;
        if (gqy == null) {
            AbF.A1H();
            throw 0Q8.createAndThrow();
        }
        Gqy.A00(gqy);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        String str;
        int A06 = 0FI.A06(579521472);
        GvG gvG = this.A05;
        if (gvG == null) {
            str = "floatingParticipantsView";
        } else {
            gvG.A00 = null;
            Gqy gqy = this.A00;
            if (gqy != null) {
                gqy.A0X();
                super.onDetachedFromWindow();
                0FI.A0C(1740523006, A06);
                return;
            }
            str = "presenter";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
