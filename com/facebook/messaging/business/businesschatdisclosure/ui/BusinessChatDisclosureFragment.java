package com.facebook.messaging.business.businesschatdisclosure.ui;

import X.0CW;
import X.11T;
import X.1BK;
import X.1Br;
import X.1Iw;
import X.1LI;
import X.1pN;
import X.7zM;
import X.7zS;
import X.9De;
import X.AeI;
import X.AxM;
import X.DCw;
import android.os.Bundle;
import android.view.View;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* loaded from: BusinessChatDisclosureFragment.class */
public final class BusinessChatDisclosureFragment extends MigBottomSheetDialogFragment implements 1pN {
    public long A00;
    public final 1Br A02 = 1BK.A0D();
    public final 1Br A01 = 7zM.A0Y();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9De, java.lang.Object] */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        return new AxM(7zS.A0j(this), new DCw(this, 15), new DCw(this, 16), new AeI(this, 33));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onViewCreated(View view, Bundle bundle) {
        String string;
        Long A0e;
        String string2;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        long j = 0;
        if (bundle2 != null && (string2 = bundle2.getString("page_id")) != null) {
            0CW.A0e(string2);
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null && (string = bundle3.getString("user_id")) != null && (A0e = 0CW.A0e(string)) != null) {
            j = A0e.longValue();
        }
        this.A00 = j;
    }
}
