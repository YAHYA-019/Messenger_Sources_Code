package com.facebook.messaging.accountswitch;

import X.1BJ;
import X.1BK;
import X.1JF;
import X.4YU;
import X.AbH;
import X.AbJ;
import X.AbK;
import X.AbL;
import X.BMG;
import X.CPl;
import android.content.Intent;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ActionId;

/* loaded from: SsoDialogFragment.class */
public class SsoDialogFragment extends BaseLoadingActionDialogFragment {
    public String A00;
    public String A01;
    public String A02;
    public boolean A03;

    public static void A05(SsoDialogFragment ssoDialogFragment) {
        if (ssoDialogFragment.A1I()) {
            return;
        }
        if (1JF.A0B(ssoDialogFragment.A00)) {
            A06(ssoDialogFragment);
            AbH.A0g(ssoDialogFragment).A0H(BMG.A3M, ssoDialogFragment.A01);
        } else {
            Bundle A05 = 1BK.A05();
            A05.putString("accessToken", ssoDialogFragment.A00);
            AbL.A12(ssoDialogFragment, AbK.A0P(A05, ssoDialogFragment), "SsoDialogFragment");
            ssoDialogFragment.A1H(1BJ.A00(ActionId.FUTURE_LISTENERS_COMPLETE), A05);
        }
    }

    public static void A06(SsoDialogFragment ssoDialogFragment) {
        CPl cPl = ssoDialogFragment.A08;
        if (cPl != null) {
            ssoDialogFragment.A09.A02("_op_redirect", "mswitch_accounts_sso", (String) null);
            Intent A0A = 4YU.A0A("com.facebook.messaging.accountswitch.PASWORD_REENTRY_REQUIRED");
            A0A.putExtra(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, ssoDialogFragment.A02);
            A0A.putExtra("user_id", ssoDialogFragment.A01);
            cPl.A06(A0A);
        }
    }

    @Override // com.facebook.messaging.accountswitch.BaseLoadingActionDialogFragment
    public void A1D() {
        super.A1D();
        AbH.A0g(this).A0H(BMG.A3H, this.A01);
    }

    public String AWg() {
        return "mswitch_accounts_sso";
    }

    public Long Am7() {
        return AbJ.A0v();
    }
}
