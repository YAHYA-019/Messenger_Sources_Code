package com.facebook.messaging.livelocation.xma;

import X.0FI;
import X.1Bi;
import X.1Bn;
import X.C2sT;
import X.C54a;
import X.DKC;
import X.Edz;
import X.FXr;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.xma.ui.XMALinearLayout;
import com.facebook.resources.ui.FbTextView;

/* loaded from: LiveLocationInactiveXMAView.class */
public class LiveLocationInactiveXMAView extends XMALinearLayout {
    public Context A00;
    public Edz A01;
    public FbTextView A02;
    public FbTextView A03;
    public final C2sT A04;
    public final C54a A05;

    public LiveLocationInactiveXMAView(Context context) {
        super(context);
        this.A05 = (C54a) 1Bi.A03(68080);
        this.A04 = (C2sT) 1Bi.A03(67517);
        A00();
    }

    public LiveLocationInactiveXMAView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A05 = (C54a) 1Bi.A03(68080);
        this.A04 = (C2sT) 1Bi.A03(67517);
        A00();
    }

    public LiveLocationInactiveXMAView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A05 = (C54a) 1Bi.A03(68080);
        this.A04 = (C2sT) 1Bi.A03(67517);
        A00();
    }

    private void A00() {
        this.A00 = FbInjector.A00();
        this.A01 = (Edz) 1Bn.A0A(100027);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(1726819627);
        super.onAttachedToWindow();
        getLayoutParams().width = this.A05.A03();
        0FI.A0C(1169010940, A06);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        int A06 = 0FI.A06(646753146);
        super.onFinishInflate();
        this.A03 = DKC.A0e(this, 2131368067);
        this.A02 = DKC.A0e(this, 2131367726);
        setOnClickListener(FXr.A02(this, 89));
        0FI.A0C(-54232996, A06);
    }
}
