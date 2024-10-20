package com.facebook.messaging.messageexpiration.bottomsheet;

import X.0FI;
import X.0Q8;
import X.0S2;
import X.11T;
import X.1Bi;
import X.1Br;
import X.1Iw;
import X.1LI;
import X.7zM;
import X.7zT;
import X.8XK;
import X.9C6;
import X.C2cw;
import X.C96q;
import X.C9Jg;
import X.Dud;
import X.Dzc;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* loaded from: MsgExpirAdminMessageBottomSheetFragment.class */
public final class MsgExpirAdminMessageBottomSheetFragment extends MigBottomSheetDialogFragment {
    public C2cw A00;
    public final 1Br A01 = 7zM.A0M();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.9Jg] */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        11T.A0F(r302, 0);
        Dud A01 = Dzc.A01(r302);
        A01.A2c(new 8XK(requireContext(), (C9Jg) new Object() { // from class: X.9Jg
        }, A1F()));
        A01.A2g(true);
        return A01.A2V();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A1M() {
        super.A0o();
        Context requireContext = requireContext();
        Intent A00 = 9C6.A00(requireContext, C96q.A08, false);
        C2cw c2cw = this.A00;
        if (c2cw != null) {
            c2cw.A05("ADMIN_MESSAGE_NUX_CLICKED");
            C2cw c2cw2 = this.A00;
            if (c2cw2 != null) {
                c2cw2.A01();
                7zT.A12(requireContext, A00, this.A01);
                return;
            }
        }
        11T.A0L("messageExpirationLogger");
        throw 0Q8.createAndThrow();
    }

    public void onDestroy() {
        int A02 = 0FI.A02(1955478528);
        super.onDestroy();
        C2cw c2cw = this.A00;
        if (c2cw != null) {
            c2cw.A05("ADMIN_MESSAGE_NUX_DISMISS");
            C2cw c2cw2 = this.A00;
            if (c2cw2 != null) {
                c2cw2.A00();
                0FI.A08(374739414, A02);
                return;
            }
        }
        11T.A0L("messageExpirationLogger");
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        C2cw c2cw = (C2cw) 1Bi.A03(66572);
        this.A00 = c2cw;
        if (c2cw != null) {
            c2cw.A02(0S2.A0j, 0S2.A00);
            C2cw c2cw2 = this.A00;
            if (c2cw2 != null) {
                c2cw2.A05("ADMIN_MESSAGE_NUX_DISPLAYED");
                return;
            }
        }
        11T.A0L("messageExpirationLogger");
        throw 0Q8.createAndThrow();
    }
}
