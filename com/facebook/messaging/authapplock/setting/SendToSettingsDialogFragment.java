package com.facebook.messaging.authapplock.setting;

import X.0FI;
import X.1Br;
import X.1Bu;
import X.AbF;
import X.AbG;
import X.BKl;
import X.BxS;
import X.C00i;
import android.os.Bundle;
import com.facebook.messaging.dialog.ConfirmActionDialogFragment;

/* loaded from: SendToSettingsDialogFragment.class */
public final class SendToSettingsDialogFragment extends ConfirmActionDialogFragment {
    public final 1Br A00 = 1Bu.A02(this, 116339);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.dialog.ConfirmActionDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(170013252);
        super.onCreate(bundle);
        C00i A0R = AbF.A0R(this.A00);
        String string = getString(2131959937);
        A0R.get();
        BxS bxS = new BxS(string, getString(2131959935));
        A0R.get();
        bxS.A02 = getString(2131959934);
        A0R.get();
        bxS.A03 = getString(2131959936);
        bxS.A01 = BKl.A02;
        AbG.A1P(this, bxS);
        0FI.A08(388664141, A02);
    }
}
