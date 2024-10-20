package com.facebook.messaging.communitymessaging.communitypreview.aboutcommunity;

import X.0D2;
import X.1Iw;
import X.1LI;
import X.C00m;
import X.C8Wq;
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
        this.A00 = new DCw(this, 34);
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        return new C8Wq(A1F(), this.A00, new DCw(this, 33));
    }
}
