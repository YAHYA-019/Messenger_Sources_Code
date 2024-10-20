package com.facebook.messaging.communitymessaging.directadd.aboutcommunity;

import X.0D2;
import X.1Iw;
import X.1LI;
import X.8fW;
import X.C00m;
import X.DCw;
import android.app.Dialog;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* loaded from: AboutCommunityFragment.class */
public final class AboutCommunityFragment extends MigBottomSheetDialogFragment {
    public final C00m A00;

    public AboutCommunityFragment() {
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(true);
        }
        this.A00 = new DCw(this, 45);
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        return new 8fW(A1F(), this.A00, new DCw(this, 44));
    }
}
