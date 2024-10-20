package com.facebook.messaging.rtc.incall.impl.widgets.overflow;

import X.0FI;
import X.1BK;
import X.1Bn;
import X.DKF;
import X.Gqd;
import X.IKB;
import X.JDB;
import X.JFq;
import X.RrC;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;

/* loaded from: ParticipantOverflowPillForScrollableGrid.class */
public class ParticipantOverflowPillForScrollableGrid extends LinearLayout implements JFq {
    public View A00;
    public ImageView A01;
    public TextView A02;
    public Gqd A03;

    public ParticipantOverflowPillForScrollableGrid(Context context) {
        super(context);
        A00();
    }

    public ParticipantOverflowPillForScrollableGrid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public ParticipantOverflowPillForScrollableGrid(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    private void A00() {
        1Bn.A0A(148136);
        Context context = getContext();
        this.A03 = new Gqd(context);
        View inflate = LayoutInflater.from(context).inflate(2132543018, this);
        this.A00 = inflate;
        IKB.A00(inflate, this, 21);
        this.A02 = DKF.A0F(this.A00, 2131366288);
        this.A01 = (ImageView) this.A00.requireViewById(2131366289);
    }

    @Override // X.JFq
    public /* bridge */ /* synthetic */ void CfQ(JDB jdb) {
        RrC rrC = (RrC) jdb;
        View view = this.A00;
        Context context = getContext();
        Integer valueOf = Integer.valueOf(rrC.A00);
        view.setContentDescription(1BK.A0v(context, valueOf, 2131962942));
        this.A02.setText(String.format(Locale.getDefault(), "%d", valueOf));
        this.A01.setImageResource(rrC.A01);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-180750730);
        super.onAttachedToWindow();
        Gqd gqd = this.A03;
        gqd.getClass();
        gqd.A0Y(this);
        0FI.A0C(676983330, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(1524739163);
        Gqd gqd = this.A03;
        gqd.getClass();
        gqd.A0X();
        super.onDetachedFromWindow();
        0FI.A0C(192019626, A06);
    }
}
