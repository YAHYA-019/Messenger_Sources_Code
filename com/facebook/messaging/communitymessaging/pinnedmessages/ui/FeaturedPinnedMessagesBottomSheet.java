package com.facebook.messaging.communitymessaging.pinnedmessages.ui;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BM;
import X.1Bn;
import X.1Iw;
import X.1LI;
import X.2S3;
import X.7zV;
import X.8TA;
import X.9Ho;
import X.9W3;
import X.C1296Ad8;
import X.C8nk;
import X.C9qn;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: FeaturedPinnedMessagesBottomSheet.class */
public final class FeaturedPinnedMessagesBottomSheet extends MigBottomSheetDialogFragment {
    public C1296Ad8 A00;
    public 9Ho A01;
    public MigColorScheme A02;
    public boolean A03;
    public final 2S3 A04 = new 2S3(this, "FeaturedPinnedMessagesBottomSheet ");

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        11T.A0F(r302, 0);
        this.A02 = 7zV.A0S(this);
        8TA A00 = C8nk.A00(r302);
        MigColorScheme migColorScheme = this.A02;
        if (migColorScheme == null) {
            11T.A0L("migColorScheme");
            throw 0Q8.createAndThrow();
        }
        A00.A2Y(migColorScheme);
        return A00.A2W();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(471750739);
        super.onCreate(bundle);
        Parcelable parcelable = requireArguments().getParcelable("thread_key");
        if (parcelable == null) {
            IllegalStateException A0h = 1BK.A0h();
            0FI.A08(-371318438, A02);
            throw A0h;
        }
        ThreadKey threadKey = (ThreadKey) parcelable;
        1Bn.A0A(68601);
        FbUserSession A01 = 1BM.A01(this);
        new 9W3(requireContext(), A01, threadKey, "FEATURED").A04.observe(this, new C9qn(A01, this, 5));
        0FI.A08(-1437714801, A02);
    }
}
