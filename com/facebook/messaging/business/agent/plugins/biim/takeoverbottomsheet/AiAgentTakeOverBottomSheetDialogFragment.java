package com.facebook.messaging.business.agent.plugins.biim.takeoverbottomsheet;

import X.0FI;
import X.0Gm;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BM;
import X.1Iw;
import X.1LI;
import X.1UG;
import X.4YV;
import X.7zN;
import X.8V7;
import X.9Ha;
import X.AbE;
import X.DGJ;
import X.QAg;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* loaded from: AiAgentTakeOverBottomSheetDialogFragment.class */
public final class AiAgentTakeOverBottomSheetDialogFragment extends MigBottomSheetDialogFragment {
    public FbUserSession A00;
    public AiAgentTakeOverBottomSheetDialogModel A01;

    public static final void A05(AiAgentTakeOverBottomSheetDialogFragment aiAgentTakeOverBottomSheetDialogFragment, String str, String str2) {
        1UG A08 = 1BK.A08(4YV.A0B(), "bm_genai_agent_event");
        if (A08.isSampled()) {
            A08.A7R("event_type", str);
            A08.A7R(AbE.A00(29), str2);
            A08.A7R("ui_surface", "business_takeover_nux");
            AiAgentTakeOverBottomSheetDialogModel aiAgentTakeOverBottomSheetDialogModel = aiAgentTakeOverBottomSheetDialogFragment.A01;
            if (aiAgentTakeOverBottomSheetDialogModel == null) {
                11T.A0L("model");
                throw 0Q8.createAndThrow();
            }
            A08.A7R("consumer_id", aiAgentTakeOverBottomSheetDialogModel.A02);
            A08.BZL();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public DGJ A1E(1Iw r302) {
        return new QAg(7zN.A0s(this, 2131962404));
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        return new 8V7(new 9Ha(this), A1F());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(201000563);
        super.onCreate(bundle);
        Parcelable parcelable = requireArguments().getParcelable("AiAgentTakeOverBottomSheetDialogModel");
        Parcelable.Creator creator = AiAgentTakeOverBottomSheetDialogModel.CREATOR;
        11T.A0B(creator);
        Parcelable parcelable2 = (Parcelable) 0Gm.A01(creator, parcelable, AiAgentTakeOverBottomSheetDialogModel.class);
        if (parcelable2 == null) {
            IllegalStateException A0h = 1BK.A0h();
            0FI.A08(-684032752, A02);
            throw A0h;
        }
        this.A01 = (AiAgentTakeOverBottomSheetDialogModel) parcelable2;
        this.A00 = 1BM.A01(this);
        0FI.A08(746264449, A02);
    }
}
