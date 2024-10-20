package com.facebook.messaging.communitymessaging.chatdeprecation;

import X.11T;
import X.1Iw;
import X.1LI;
import X.7zL;
import X.7zS;
import X.8aU;
import X.AQt;
import X.DCw;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* loaded from: ChatTypeDeprecationBottomSheet.class */
public final class ChatTypeDeprecationBottomSheet extends MigBottomSheetDialogFragment {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        String string;
        11T.A0F(r302, 0);
        String string2 = requireArguments().getString("title");
        return (string2 == null || (string = requireArguments().getString("description")) == null) ? 7zL.A0Y() : new 8aU(7zS.A0j(this), string2, string, new DCw(this, 26), AQt.A01(r302, this, 2));
    }
}
