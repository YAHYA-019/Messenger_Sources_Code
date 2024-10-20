package com.facebook.zero.optin.activity;

import X.0FI;
import X.1BK;
import X.1BY;
import X.1Bn;
import X.1Kd;
import X.1Vd;
import X.1iF;
import X.2FP;
import X.2FT;
import X.2JX;
import X.2Jf;
import X.3sU;
import X.4YU;
import X.7zL;
import X.7zO;
import X.AbK;
import X.C03713yu;
import X.C3sa;
import X.DKE;
import X.DKG;
import X.FXq;
import X.Fvf;
import X.FwK;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.acra.constants.ActionId;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.resources.ui.FbTextView;
import com.facebook.ui.legacynavbar.LegacyNavigationBar;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: NativeTermsAndConditionsActivity.class */
public class NativeTermsAndConditionsActivity extends FbFragmentActivity {
    public View A00;
    public ProgressBar A01;
    public FbTextView A02;
    public FbTextView A03;
    public FbTextView A04;
    public FbTextView A05;
    public LegacyNavigationBar A06;
    public 3sU A07;
    public ListenableFuture A08;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKE.A0Q();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A07 = (3sU) 1Bn.A0E(this, (1BY) null, 32812);
        setContentView(2132542813);
        this.A05 = (FbTextView) A2c(2131367900);
        this.A01 = (ProgressBar) A2c(2131367903);
        this.A00 = A2c(2131367125);
        this.A04 = (FbTextView) A2c(2131363528);
        this.A02 = (FbTextView) A2c(2131362929);
        this.A03 = (FbTextView) A2c(2131362930);
        this.A08 = null;
        LegacyNavigationBar legacyNavigationBar = (LegacyNavigationBar) A2c(2131368089);
        this.A06 = legacyNavigationBar;
        legacyNavigationBar.Cm8(FXq.A00(this, ActionId.DISPLAYED));
        this.A00.setVisibility(8);
        this.A01.setVisibility(0);
        DKG.A1D(this);
        FwK A01 = FwK.A01(this, 54);
        3sU r0 = this.A07;
        r0.getClass();
        GraphQlQueryParamSet A0M = 7zL.A0M();
        2Jf r02 = new 2Jf(2JX.class, (Class) null, "FetchZeroTermsConditionsQuery", (String) null, "fbandroid", 1541956219, 0, 473812781L, 473812781L, false, true);
        r02.A00 = A0M;
        C3sa A0L = AbK.A0L(r02);
        A0L.A0B = false;
        1Vd A0J = AbK.A0J(r0.A03);
        4YU.A1J(A0L, 453586272481763L);
        C03713yu A04 = A0J.A04(A0L);
        Executor A1E = 1BK.A1E(r0.A04);
        2FT A02 = 2FP.A02(new Fvf(r0, 54), A04, A1E);
        1Kd.A0F(A01, A02, A1E);
        this.A08 = A02;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        int A00 = 0FI.A00(-1689602039);
        super.onStop();
        7zO.A1X(this.A08);
        0FI.A07(1984258751, A00);
    }
}
