package com.facebook.payments.p2m.nux;

import X.0D2;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.2Ov;
import X.AnonymousClass001;
import X.C1pq;
import X.DKF;
import X.FXq;
import X.FkE;
import X.RGn;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.payments.p2m.nux.model.P2mNuxModel;
import com.google.common.collect.ImmutableList;

/* loaded from: P2mPurchaseProtectionBuyerNuxActivity.class */
public final class P2mPurchaseProtectionBuyerNuxActivity extends FbFragmentActivity {
    public final RGn A00 = new RGn(this);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        1Br A01 = 1Bu.A01(this, 100011);
        String stringExtra = getIntent().getStringExtra("seller_name");
        String stringExtra2 = getIntent().getStringExtra("num_onboarded_sellers");
        if (stringExtra == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        if (stringExtra2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        ImmutableList of = ImmutableList.of();
        String string = getString(2131964018);
        C1pq.A08("nuxTitle", string);
        String string2 = getString(2131964017, stringExtra, stringExtra2);
        C1pq.A08("nuxSubtitle", string2);
        String string3 = getString(2131958579);
        C1pq.A08("primaryCtaTitle", string3);
        String A0o = DKF.A0o(this);
        C1pq.A08("secondaryCtaTitle", A0o);
        Parcelable p2mNuxModel = new P2mNuxModel(of, string2, string, string3, A0o, 2132345674);
        Bundle A05 = 1BK.A05();
        A05.putParcelable("nux_data", p2mNuxModel);
        0D2 r0 = new 2Ov();
        r0.setArguments(A05);
        r0.A01 = new FkE(A01, 13);
        r0.A00 = FXq.A00(this, 66);
        r0.A02 = this.A00;
        r0.A0m(BDe(), "P2mNuxFragment");
    }
}
