package com.facebook.messaging.friending.bottomsheet;

import X.0D2;
import X.1Iw;
import X.1LI;
import X.7zS;
import X.QFo;
import X.RFW;
import android.app.Dialog;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* loaded from: SuggestedConnectionsExplainerBottomSheetFragment.class */
public final class SuggestedConnectionsExplainerBottomSheetFragment extends MigBottomSheetDialogFragment {
    public final RFW A00 = new RFW(this);

    public SuggestedConnectionsExplainerBottomSheetFragment() {
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        return new QFo(this.A00, 7zS.A0j(this));
    }
}
