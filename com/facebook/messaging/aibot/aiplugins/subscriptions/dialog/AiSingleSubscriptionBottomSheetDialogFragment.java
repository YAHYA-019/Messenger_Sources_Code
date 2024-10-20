package com.facebook.messaging.aibot.aiplugins.subscriptions.dialog;

import X.0FI;
import X.11T;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.1Um;
import X.4YU;
import X.7zL;
import X.7zM;
import X.7zR;
import X.8yO;
import X.9De;
import X.9W9;
import X.A0O;
import X.A1f;
import X.AQZ;
import X.AYG;
import X.C01i;
import X.C03i;
import X.C8z6;
import X.C9iB;
import android.os.Bundle;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.aibot.aiplugins.subscriptions.dialog.AiSingleSubscriptionBottomSheetDialogFragment;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.List;

/* loaded from: AiSingleSubscriptionBottomSheetDialogFragment.class */
public final class AiSingleSubscriptionBottomSheetDialogFragment extends BaseMigBottomSheetDialogFragment {
    public static final 9W9 A04 = new Object();
    public LithoView A00;
    public LithoView A01;
    public final C01i A03 = AQZ.A00(this, C03i.A02, 29);
    public final 1Br A02 = 1Bu.A02(this, 68342);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public View A1C() {
        LithoView A0M = 7zR.A0M(this);
        this.A00 = A0M;
        return A0M;
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return 9De.A00();
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(13158537);
        super.onDestroyView();
        this.A01 = null;
        this.A00 = null;
        0FI.A08(1305761969, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = 7zL.A0b(view, 2131364453);
        AYG ayg = new AYG() { // from class: X.9xy
            public void CHg(List list) {
                11T.A0F(list, 0);
                if (1BK.A1Y(list)) {
                    AiSingleSubscriptionBottomSheetDialogFragment aiSingleSubscriptionBottomSheetDialogFragment = AiSingleSubscriptionBottomSheetDialogFragment.this;
                    C1768As2 c1768As2 = (C1768As2) list.get(0);
                    9W9 r0 = AiSingleSubscriptionBottomSheetDialogFragment.A04;
                    LithoView lithoView = aiSingleSubscriptionBottomSheetDialogFragment.A01;
                    if (lithoView != null) {
                        String str = c1768As2.A08;
                        if (str == null) {
                            str = "";
                        }
                        lithoView.A0y(new QFg(aiSingleSubscriptionBottomSheetDialogFragment.A1F(), str));
                    }
                    LithoView lithoView2 = aiSingleSubscriptionBottomSheetDialogFragment.A00;
                    if (lithoView2 != null) {
                        lithoView2.A0y(new C1934Awz(c1768As2, aiSingleSubscriptionBottomSheetDialogFragment.A1F(), 7zU.A0t(aiSingleSubscriptionBottomSheetDialogFragment, 1)));
                    }
                }
            }
        };
        C9iB c9iB = (C9iB) 1Br.A0B(this.A02);
        FbUserSession A0I = 7zM.A0I(this.A03);
        long j = requireArguments().getLong("subscription_id");
        11T.A0F(A0I, 0);
        8yO r0 = (8yO) 4YU.A0o(A0I, c9iB.A01, 68341);
        1Um A0O = 1BK.A0O(r0, 0);
        MailboxFutureImpl A0P = 1BK.A0P(A0O);
        1Um.A02(A0O, new A0O(17, j, new C8z6(A0O, r0), r0, A0P), A0P, false);
        A0P.addResultCallback(new A1f(ayg, c9iB, 70));
    }
}
