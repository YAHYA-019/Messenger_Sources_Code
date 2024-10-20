package com.facebook.messaging.accountswitch;

import X.0FI;
import X.AbJ;
import android.os.Bundle;

/* loaded from: HorizonDialogFragment.class */
public class HorizonDialogFragment extends BaseLoadingActionDialogFragment {
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    public String AWg() {
        return "mswitch_accounts_sso";
    }

    public Long Am7() {
        return AbJ.A0v();
    }

    @Override // com.facebook.messaging.accountswitch.BaseLoadingActionDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-1589332693);
        super.onCreate(bundle);
        0FI.A08(331252026, A02);
    }
}
