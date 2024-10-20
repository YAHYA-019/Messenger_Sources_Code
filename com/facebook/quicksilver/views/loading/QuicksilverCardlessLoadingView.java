package com.facebook.quicksilver.views.loading;

import X.1BQ;
import X.4YU;
import X.7zL;
import X.AbH;
import X.C00i;
import X.C09s;
import X.C0dr;
import X.DKF;
import X.FA8;
import X.FXU;
import X.FYT;
import X.GGK;
import X.GJw;
import X.Qwx;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.resources.ui.FbCheckBox;

/* loaded from: QuicksilverCardlessLoadingView.class */
public class QuicksilverCardlessLoadingView extends LinearLayout implements GGK, CallerContextable {
    public View A00;
    public View A01;
    public View A02;
    public LinearLayout A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public C00i A07;
    public C00i A08;
    public GJw A09;
    public Qwx A0A;
    public FA8 A0B;
    public FbCheckBox A0C;
    public final C00i A0D;

    public QuicksilverCardlessLoadingView(Context context) {
        this(context, null, 0);
    }

    public QuicksilverCardlessLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public QuicksilverCardlessLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0D = AbH.A0D();
        Context context2 = getContext();
        this.A07 = 7zL.A0R(context2, 98328);
        this.A08 = 1BQ.A02(84488);
        View.inflate(context2, 2132542073, this);
        this.A0B = new FA8(this);
        this.A06 = DKF.A0E(this, 2131365298);
        this.A04 = DKF.A0E(this, 2131365288);
        this.A01 = C09s.A01(this, 2131365289);
        FbCheckBox fbCheckBox = (FbCheckBox) C09s.A01(this, 2131365293);
        this.A0C = fbCheckBox;
        FYT.A00(fbCheckBox, this, 11);
        TextView A0E = DKF.A0E(this, 2131365296);
        this.A05 = A0E;
        A0E.setOnClickListener(new FXU((C0dr) 4YU.A0p(this.A08), this));
        this.A03 = (LinearLayout) C09s.A01(this, 2131362921);
        View A01 = C09s.A01(this, 2131365297);
        this.A02 = A01;
        this.A00 = A01;
    }

    public void setProgress(int i) {
        this.A0B.A02(i);
    }
}
