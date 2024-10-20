package com.facebook.messaging.communitymessaging.communitypreview.joinbottomsheet;

import X.11T;
import X.1Iw;
import X.1LI;
import X.2qQ;
import X.7zL;
import X.7zM;
import X.7zN;
import X.7zQ;
import X.7zS;
import X.8Lf;
import X.8NJ;
import X.8Tn;
import X.9zF;
import X.C8xf;
import X.DGJ;
import android.view.View;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import java.util.List;

/* loaded from: CommunityPreviewJoinBottomSheetFragment.class */
public final class CommunityPreviewJoinBottomSheetFragment extends MigBottomSheetDialogFragment {
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public DGJ A1E(1Iw r302) {
        11T.A0F(r302, 0);
        return new 9zF(r302, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        8Tn A07 = 8Tn.A07(r302, this);
        2qQ A0o = 7zL.A0o();
        7zM.A1V(A0o, 2132346640);
        C8xf A00 = C8xf.A00(7zS.A02(7zQ.A0k(A0o, 2132346639), A1F()));
        String string = getString(2131954616);
        String string2 = getString(2131954615);
        8Lf r0 = new 8Lf(new View.OnClickListener() { // from class: X.9pk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                0FI.A0B(1587168115, 0FI.A05(-2040812952));
            }
        }, 7zN.A0s(this, 2131954614));
        11T.A0D(string);
        A07.A2Y(new 8NJ(r0, A00, string2, (CharSequence) null, string, (List) null, true));
        return A07.A2W();
    }
}
