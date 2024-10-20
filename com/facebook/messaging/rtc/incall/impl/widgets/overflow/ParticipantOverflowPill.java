package com.facebook.messaging.rtc.incall.impl.widgets.overflow;

import X.0FI;
import X.1Bn;
import X.1Iw;
import X.1LI;
import X.2MQ;
import X.7zL;
import X.7zP;
import X.83S;
import X.8Ph;
import X.8mF;
import X.AY7;
import X.AnonymousClass001;
import X.C1rs;
import X.C1u2;
import X.Gqd;
import X.JDB;
import X.JFq;
import X.RrC;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.litho.LithoView;
import java.util.BitSet;

/* loaded from: ParticipantOverflowPill.class */
public class ParticipantOverflowPill extends FrameLayout implements JFq {
    public 1Iw A00;
    public LithoView A01;
    public AY7 A02;
    public Gqd A03;

    public ParticipantOverflowPill(Context context) {
        super(context);
        A00(context);
    }

    public ParticipantOverflowPill(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }

    public ParticipantOverflowPill(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context);
    }

    private void A00(Context context) {
        1Bn.A0A(148136);
        this.A03 = new Gqd(context);
        this.A00 = 7zL.A0W(context);
    }

    @Override // X.JFq
    public /* bridge */ /* synthetic */ void CfQ(JDB jdb) {
        1Iw r0 = this.A00;
        int i = ((RrC) jdb).A00;
        C1u2 A0R = 7zP.A0R();
        8Ph r02 = new 8Ph(r0, new 8mF());
        r02.A2S(r0.A0E(2131962942, AnonymousClass001.A1a(i)));
        String num = Integer.toString(i);
        1LI r03 = r02.A01;
        ((8mF) r03).A05 = num;
        BitSet bitSet = r02.A02;
        bitSet.set(0);
        ((8mF) r03).A01 = r02.A02.A0B(A0R.A01(2MQ.A1R));
        ((8mF) r03).A00 = (-1) << (-1);
        ((8mF) r03).A02 = 83S.A00(this, 17);
        C1rs.A05(bitSet, r02.A03, 1);
        r02.A0J();
        LithoView lithoView = this.A01;
        if (lithoView != null) {
            lithoView.A0y(r03);
            return;
        }
        LithoView A02 = LithoView.A02(r03, this.A00);
        this.A01 = A02;
        addView(A02);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(767580264);
        super.onAttachedToWindow();
        Gqd gqd = this.A03;
        gqd.getClass();
        gqd.A0Y(this);
        0FI.A0C(-730133649, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(2123684253);
        Gqd gqd = this.A03;
        gqd.getClass();
        gqd.A0X();
        super.onDetachedFromWindow();
        0FI.A0C(-1732580444, A06);
    }
}
