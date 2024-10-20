package com.facebook.messaging.publicchats.prompts;

import X.0Q8;
import X.11T;
import X.1BM;
import X.1BV;
import X.1Iw;
import X.1LI;
import X.7zL;
import X.7zN;
import X.7zO;
import X.8Xk;
import X.9KD;
import X.C87w;
import X.C9bl;
import android.os.Bundle;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* loaded from: PromptResponsesThreeDotMenusBottomSheetFragment.class */
public final class PromptResponsesThreeDotMenusBottomSheetFragment extends MigBottomSheetDialogFragment {
    public FbUserSession A00;
    public C87w A01;
    public 9KD A02;
    public C9bl A03;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        1BV A0R = 7zL.A0R(requireContext(), 16979);
        C87w c87w = this.A01;
        if (c87w != null) {
            return new 8Xk(c87w, this, 7zN.A0W(A0R));
        }
        11T.A0L("viewerState");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = (9KD) 7zO.A0m(this, 68122);
        this.A03 = (C9bl) 7zO.A0m(this, 68124);
        this.A00 = 1BM.A01(this);
    }
}
