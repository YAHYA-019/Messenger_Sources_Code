package com.facebook.rtc.activities;

import X.1BQ;
import X.1BV;
import X.1Lo;
import X.4YU;
import X.AbL;
import X.C00i;
import X.C1xi;
import X.C67J;
import X.ITD;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.rtc.interfaces.RtcCallStartParams;

/* loaded from: ZeroRatingActivity.class */
public class ZeroRatingActivity extends FbFragmentActivity {
    public FbUserSession A00;
    public C00i A01;
    public C00i A02;
    public final C00i A05 = 1BQ.A02(33154);
    public final C00i A04 = 1BQ.A02(115641);
    public final C00i A03 = 1BQ.A02(16922);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        FbUserSession A08 = AbL.A08(this);
        this.A00 = A08;
        A08.getClass();
        this.A01 = 1Lo.A00(this, A08, 115765);
        this.A02 = 1BV.A00(66170);
        ((C1xi) this.A05.get()).A03();
        Parcelable parcelableExtra = getIntent().getParcelableExtra("EXTRA_CALL_PARAMS");
        parcelableExtra.getClass();
        ((C67J) 4YU.A0p(this.A02)).A05(new ITD(this, (RtcCallStartParams) parcelableExtra), "free_messenger_rtc_interstitial", getString(2131964936), getString(2131964935));
        ((C67J) 4YU.A0p(this.A02)).A00(this, BDe(), null, "free_messenger_rtc_interstitial");
    }
}
