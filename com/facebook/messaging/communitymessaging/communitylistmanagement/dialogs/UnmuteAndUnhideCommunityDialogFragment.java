package com.facebook.messaging.communitymessaging.communitylistmanagement.dialogs;

import X.1BM;
import X.1Br;
import X.2Ov;
import X.7zM;
import X.7zQ;
import X.AbM;
import X.C8T;
import X.CR8;
import X.CRd;
import X.DR6;
import android.app.Dialog;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: UnmuteAndUnhideCommunityDialogFragment.class */
public final class UnmuteAndUnhideCommunityDialogFragment extends 2Ov {
    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        long j = requireArguments().getLong("COMMUNITY_ID");
        FbUserSession A01 = 1BM.A01(this);
        DR6 A02 = 7zQ.A0l().A02(requireContext());
        C8T c8t = new C8T(7zM.A0C(this, 147539), j);
        1Br A0O = AbM.A0O(this, A01, 33183);
        A02.A00(2131967619);
        A02.A06(2131967617);
        A02.A08(CRd.A00);
        A02.A0D(new CR8(0, j, c8t, A0O), 2131967618);
        return A02.A04();
    }
}
