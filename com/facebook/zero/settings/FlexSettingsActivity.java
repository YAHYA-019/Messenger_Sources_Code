package com.facebook.zero.settings;

import X.0FI;
import X.1BJ;
import X.1BK;
import X.1BQ;
import X.1BV;
import X.1UG;
import X.1iF;
import X.4YU;
import X.7zL;
import X.AbF;
import X.AbH;
import X.AnonymousClass001;
import X.C00i;
import X.DKD;
import X.DKE;
import X.F8b;
import X.FJ7;
import X.Fub;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.acra.constants.ActionId;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.zero.service.ZeroInterstitialEligibilityManager;
import org.json.JSONException;

/* loaded from: FlexSettingsActivity.class */
public class FlexSettingsActivity extends FbFragmentActivity {
    public final C00i A01 = DKD.A0R();
    public final C00i A04 = AbF.A0Q(this, 98596);
    public final C00i A05 = 1BQ.A02(16964);
    public final C00i A02 = AbH.A0N();
    public final C00i A03 = 7zL.A0R(this, 98502);
    public final C00i A06 = 1BQ.A02(49619);
    public final C00i A00 = 1BV.A00(32882);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKE.A0Q();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        String str;
        super.A2y(bundle);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("location") != null ? intent.getStringExtra("location") : "bookmark";
        String stringExtra2 = intent.getStringExtra("promo") != null ? intent.getStringExtra("promo") : "";
        boolean z = false;
        if (intent.getBooleanExtra("notification_acked", false)) {
            z = intent.getBooleanExtra("notification_acked", false);
        }
        C00i c00i = this.A05;
        boolean A04 = 4YU.A0d(c00i).A04("carrier_page_upsell");
        if (4YU.A0d(c00i).A04(1BJ.A00(ActionId.ABORTED)) && !A04) {
            ((ZeroInterstitialEligibilityManager) this.A06.get()).A03(this, "bookmark", true);
            finish();
            return;
        }
        ((F8b) this.A03.get()).A01(this, new Fub(this), stringExtra, stringExtra2, z);
        str = "setting_page_seen";
        1UG A08 = 1BK.A08(1BK.A07(this.A02), str);
        if (A08.isSampled()) {
            try {
                C00i c00i2 = this.A01;
                A08.A7R("carrier_id", 4YU.A0K(c00i2).A0A());
                A08.A7R("event_location", stringExtra);
                A08.A7R("extra", AnonymousClass001.A12().put("page", A04 ? "setting_page_seen" : "carrier_page_seen").toString());
                A08.A5H("is_in_free_mode", Boolean.valueOf(DKE.A1X(c00i2)));
                A08.BZL();
            } catch (JSONException unused) {
            }
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int A00 = 0FI.A00(-8604627);
        super.onPause();
        ((FJ7) this.A04.get()).A06.A01();
        0FI.A07(1244912449, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(-1663546769);
        super.onResume();
        FJ7 fj7 = (FJ7) this.A04.get();
        fj7.A06.A00();
        FJ7.A06(fj7);
        0FI.A07(-330114501, A00);
    }
}
