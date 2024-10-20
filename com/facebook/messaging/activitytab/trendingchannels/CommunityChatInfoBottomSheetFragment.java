package com.facebook.messaging.activitytab.trendingchannels;

import X.0D2;
import X.1Iw;
import X.1LI;
import X.7zS;
import X.AQZ;
import X.QHy;
import android.app.Dialog;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: CommunityChatInfoBottomSheetFragment.class */
public final class CommunityChatInfoBottomSheetFragment extends MigBottomSheetDialogFragment {
    public CommunityChatInfoBottomSheetFragment() {
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        MigColorScheme A0j = 7zS.A0j(this);
        int i = QHy.A03;
        return new QHy(A0j, (String) null, new AQZ(this, 9));
    }
}
