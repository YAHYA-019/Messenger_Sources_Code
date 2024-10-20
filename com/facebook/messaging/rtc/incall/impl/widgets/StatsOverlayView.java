package com.facebook.messaging.rtc.incall.impl.widgets;

import X.0FI;
import X.11T;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.C00j;
import X.C01i;
import X.DKF;
import X.Gql;
import X.J9t;
import X.JDB;
import X.JFq;
import X.QAf;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.resources.ui.FbFrameLayout;

/* loaded from: StatsOverlayView.class */
public final class StatsOverlayView extends FbFrameLayout implements JFq {
    public LinearLayout A00;
    public LinearLayout A01;
    public LinearLayout A02;
    public LinearLayout A03;
    public LinearLayout A04;
    public LinearLayout A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public TextView A0B;
    public TextView A0C;
    public TextView A0D;
    public TextView A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public TextView A0I;
    public TextView A0J;
    public TextView A0K;
    public TextView A0L;
    public TextView A0M;
    public TextView A0N;
    public TextView A0O;
    public final C01i A0P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsOverlayView(Context context) {
        super(context);
        11T.A0F(context, 1);
        this.A0P = J9t.A01(this, 26);
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        this.A0P = J9t.A01(this, 26);
        A00();
    }

    private final void A00() {
        View.inflate(getContext(), 2132543382, this);
        this.A0I = DKF.A0F(this, 2131367462);
        this.A02 = (LinearLayout) requireViewById(2131367461);
        this.A0C = DKF.A0F(this, 2131367455);
        this.A0A = DKF.A0F(this, 2131367457);
        this.A0B = DKF.A0F(this, 2131367459);
        this.A0D = DKF.A0F(this, 2131367453);
        this.A0E = DKF.A0F(this, 2131367445);
        this.A0F = DKF.A0F(this, 2131367447);
        this.A0G = DKF.A0F(this, 2131367449);
        this.A0H = DKF.A0F(this, 2131367451);
        this.A08 = DKF.A0F(this, 2131367440);
        this.A06 = DKF.A0F(this, 2131367435);
        this.A07 = DKF.A0F(this, 2131367437);
        this.A00 = (LinearLayout) requireViewById(2131367439);
        this.A09 = DKF.A0F(this, 2131367442);
        this.A01 = (LinearLayout) requireViewById(2131367444);
        this.A04 = (LinearLayout) requireViewById(2131367475);
        this.A0M = DKF.A0F(this, 2131367471);
        this.A0K = DKF.A0F(this, 2131367466);
        this.A0N = DKF.A0F(this, 2131367473);
        this.A0J = DKF.A0F(this, 2131367464);
        this.A0L = DKF.A0F(this, 2131367468);
        this.A03 = (LinearLayout) requireViewById(2131367470);
        this.A0O = DKF.A0F(this, 2131367476);
        this.A05 = (LinearLayout) requireViewById(2131367478);
    }

    @Override // X.JFq
    public /* bridge */ /* synthetic */ void CfQ(JDB jdb) {
        QAf qAf = (QAf) jdb;
        11T.A0F(qAf, 0);
        TextView textView = this.A0I;
        if (textView == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        textView.setText(qAf.A0E);
        TextView textView2 = this.A0C;
        if (textView2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        textView2.setText(StringFormatUtil.formatStrLocaleSafe("start: %s, min: %s, max: %s", qAf.A06, qAf.A05, qAf.A04));
        TextView textView3 = this.A0A;
        if (textView3 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        textView3.setText(qAf.A0B);
        TextView textView4 = this.A0B;
        if (textView4 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        AbstractC2326GOr.A13(textView4, qAf.A0C, "%sms");
        TextView textView5 = this.A0D;
        if (textView5 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        AbstractC2326GOr.A13(textView5, qAf.A0D, "%sms");
        TextView textView6 = this.A0E;
        if (textView6 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        AbstractC2326GOr.A13(textView6, qAf.A00, "%s");
        TextView textView7 = this.A0F;
        if (textView7 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        AbstractC2326GOr.A13(textView7, qAf.A01, "%s");
        TextView textView8 = this.A0G;
        if (textView8 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        AbstractC2326GOr.A13(textView8, qAf.A02, "%s");
        TextView textView9 = this.A0H;
        if (textView9 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        AbstractC2326GOr.A13(textView9, qAf.A03, "%s");
        TextView textView10 = this.A08;
        if (textView10 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        textView10.setText(qAf.A09);
        TextView textView11 = this.A06;
        if (textView11 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        AbstractC2326GOr.A13(textView11, qAf.A07, "%skbps");
        TextView textView12 = this.A07;
        if (textView12 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        AbstractC2326GOr.A13(textView12, qAf.A08, "%sms");
        TextView textView13 = this.A09;
        if (textView13 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        AbstractC2326GOr.A13(textView13, qAf.A0A, "%skbps");
        boolean z = qAf.A0N;
        LinearLayout linearLayout = this.A04;
        if (z) {
            if (linearLayout == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            linearLayout.setVisibility(0);
            TextView textView14 = this.A0M;
            if (textView14 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            textView14.setText(qAf.A0K);
            TextView textView15 = this.A0K;
            if (textView15 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            textView15.setText(qAf.A0G);
            TextView textView16 = this.A0N;
            if (textView16 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            textView16.setText(StringFormatUtil.formatStrLocaleSafe("%sx%s", qAf.A0J, qAf.A0I));
            TextView textView17 = this.A0J;
            if (textView17 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            AbstractC2326GOr.A13(textView17, qAf.A0F, "%skbps");
            TextView textView18 = this.A0L;
            if (textView18 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            AbstractC2326GOr.A13(textView18, qAf.A0H, "%sms");
            TextView textView19 = this.A0O;
            if (textView19 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            AbstractC2326GOr.A13(textView19, qAf.A0L, "%skbps");
        } else {
            if (linearLayout == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            linearLayout.setVisibility(8);
        }
        boolean z2 = qAf.A0M;
        LinearLayout linearLayout2 = this.A02;
        if (z2) {
            if (linearLayout2 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            linearLayout2.setVisibility(0);
            LinearLayout linearLayout3 = this.A00;
            if (linearLayout3 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            linearLayout3.setVisibility(8);
            LinearLayout linearLayout4 = this.A03;
            if (linearLayout4 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            linearLayout4.setVisibility(8);
            LinearLayout linearLayout5 = this.A01;
            if (linearLayout5 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            linearLayout5.setVisibility(0);
            LinearLayout linearLayout6 = this.A05;
            if (linearLayout6 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            linearLayout6.setVisibility(0);
            return;
        }
        if (linearLayout2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        linearLayout2.setVisibility(8);
        LinearLayout linearLayout7 = this.A00;
        if (linearLayout7 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        linearLayout7.setVisibility(0);
        LinearLayout linearLayout8 = this.A03;
        if (linearLayout8 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        linearLayout8.setVisibility(0);
        LinearLayout linearLayout9 = this.A01;
        if (linearLayout9 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        linearLayout9.setVisibility(8);
        LinearLayout linearLayout10 = this.A05;
        if (linearLayout10 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        linearLayout10.setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-849868978);
        C00j.A05("StatsOverlayView.onAttachedToWindow", 187916571);
        try {
            super.onAttachedToWindow();
            ((Gql) this.A0P.getValue()).A0Y(this);
            C00j.A01(-1620287218);
            0FI.A0C(1599934510, A06);
        } catch (Throwable th) {
            C00j.A01(-912665781);
            0FI.A0C(-1237522655, A06);
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-915693967);
        C00j.A05("StatsOverlayView.onDetachedFromWindow", -583150022);
        try {
            ((Gql) this.A0P.getValue()).A0X();
            super.onDetachedFromWindow();
            C00j.A01(1320471738);
            0FI.A0C(1270668534, A06);
        } catch (Throwable th) {
            C00j.A01(-1990595708);
            0FI.A0C(1264060055, A06);
            throw th;
        }
    }
}
