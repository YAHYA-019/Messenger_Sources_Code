package com.facebook.messaging.media.download.mediadownloaddialogfragment;

import X.0FI;
import X.AbG;
import X.BxS;
import android.os.Bundle;
import com.facebook.messaging.dialog.ConfirmActionDialogFragment;

/* loaded from: MessengerMediaDownloadDialogFragment.class */
public final class MessengerMediaDownloadDialogFragment extends ConfirmActionDialogFragment {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.dialog.ConfirmActionDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-2067187361);
        super.onCreate(bundle);
        BxS bxS = new BxS(getString(2131960089), getString(2131960087));
        bxS.A02 = getString(2131960086);
        bxS.A03 = getString(2131960088);
        AbG.A1P(this, bxS);
        0FI.A08(624921187, A02);
    }
}
