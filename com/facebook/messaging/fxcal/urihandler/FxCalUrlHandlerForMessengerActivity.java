package com.facebook.messaging.fxcal.urihandler;

import X.0Q8;
import X.1BK;
import X.1BY;
import X.1Bn;
import X.1Br;
import X.1G1;
import X.1JF;
import X.1UG;
import X.7zL;
import X.AbF;
import X.DKE;
import X.DKH;
import X.EQJ;
import X.EU9;
import X.EUZ;
import X.Ehy;
import X.RbJ;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.fxcal.urihandler.FxCalUrlHandlerBaseActivity;
import com.facebook.messaging.fxcal.settings.details.FxCalDetailsSettingsActivity;

/* loaded from: FxCalUrlHandlerForMessengerActivity.class */
public final class FxCalUrlHandlerForMessengerActivity extends FxCalUrlHandlerBaseActivity {
    public FbUserSession A00;
    public final 1Br A01 = 1BK.A0C();

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A00 = DKH.A0H(this);
        EU9.A00(this);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2;
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            Ehy ehy = (Ehy) 1Bn.A0E(this, (1BY) null, 98543);
            1G1 r0 = this.A00;
            if (r0 == null) {
                7zL.A1C();
                throw 0Q8.createAndThrow();
            }
            String str = i2 != -1 ? i2 != 0 ? "passwordless_flow_password_create_fail" : "passwordless_flow_password_create_cancel" : "passwordless_flow_password_create_success";
            String str2 = r0.A02;
            EQJ eqj = EQJ.A01;
            EQJ eqj2 = EQJ.A02;
            1UG A08 = 1BK.A08(1BK.A07(ehy.A00), "fx_sso");
            if (A08.isSampled()) {
                AbF.A1L(A08, str);
                A08.A6H("initiator_account_id", 1JF.A0B(str2) ? null : 1BK.A0n(str2));
                A08.A6H("target_account_id", (Long) null);
                A08.A5c(eqj, "initiator_account_type");
                A08.A5c(eqj2, "target_account_type");
                A08.BZL();
            }
            if (i2 == -1) {
                if (1Br.A07(this.A01).AZk(36315567690491060L)) {
                    RbJ.A01(this, EUZ.A00(this), "sso_passwordless_reset_password", "single_sign_on");
                } else {
                    1Bn.A0A(99822);
                    Context applicationContext = getApplicationContext();
                    if (applicationContext != null) {
                        intent2 = FxCalDetailsSettingsActivity.A00.A01(applicationContext, "SINGLE_SIGN_ON", "main_settings");
                        intent2.addFlags(268435456);
                    } else {
                        intent2 = null;
                    }
                    Bundle A05 = 1BK.A05();
                    A05.putBoolean("launch_with_mutation", true);
                    if (intent2 != null) {
                        intent2.putExtra("extra_data", A05);
                    }
                    DKE.A1C(applicationContext, intent2);
                }
            }
        }
        finish();
    }
}
