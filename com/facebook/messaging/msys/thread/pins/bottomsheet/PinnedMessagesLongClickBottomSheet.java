package com.facebook.messaging.msys.thread.pins.bottomsheet;

import X.11T;
import X.1BM;
import X.1Iw;
import X.1LI;
import X.2MQ;
import X.2RH;
import X.2Re;
import X.2cK;
import X.2cM;
import X.4YU;
import X.55M;
import X.55N;
import X.7zM;
import X.7zO;
import X.AnonymousClass001;
import X.AnonymousClass553;
import X.CJ4;
import X.COF;
import X.Rrw;
import android.content.res.Resources;
import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* loaded from: PinnedMessagesLongClickBottomSheet.class */
public final class PinnedMessagesLongClickBottomSheet extends MigBottomSheetDialogFragment {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        11T.A0F(r302, 0);
        String string = requireArguments().getString("ARG_MESSAGE_ID");
        if (string == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        Parcelable parcelable = requireArguments().getParcelable("ARG_THREAD_KEY");
        if (parcelable == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        ThreadKey threadKey = (ThreadKey) parcelable;
        FbUserSession A01 = 1BM.A01(this);
        2cM A012 = 2cK.A01(r302, (String) null, 0);
        55N A00 = 55M.A00(r302);
        CJ4 cj4 = new CJ4();
        Resources A0E = 4YU.A0E(r302);
        cj4.A04(A0E.getString(2131959610));
        cj4.A05 = COF.A01(2MQ.A2e, 2Re.A02, (AnonymousClass553) null, A1F(), A0E.getString(2131959610));
        cj4.A01 = new Rrw(A01, r302, threadKey, this, string);
        cj4.A07 = A1F();
        A012.A2e(7zM.A10(cj4.A01(), A00));
        7zO.A1F(A012, 2RH.A05);
        A012.A0R();
        return A012.A00;
    }
}
