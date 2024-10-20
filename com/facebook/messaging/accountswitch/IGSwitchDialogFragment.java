package com.facebook.messaging.accountswitch;

import X.0FI;
import X.AbJ;
import android.os.Bundle;
import com.facebook.messaging.accountswitch.model.MessengerAccountInfo;

/* loaded from: IGSwitchDialogFragment.class */
public class IGSwitchDialogFragment extends BaseLoadingActionDialogFragment {
    public MessengerAccountInfo A00;
    public String A01;

    public String AWg() {
        return "mswitch_accounts_sso";
    }

    public Long Am7() {
        return AbJ.A0v();
    }

    @Override // com.facebook.messaging.accountswitch.BaseLoadingActionDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(2088590085);
        super.onCreate(bundle);
        0FI.A08(-1441124432, A02);
    }
}
