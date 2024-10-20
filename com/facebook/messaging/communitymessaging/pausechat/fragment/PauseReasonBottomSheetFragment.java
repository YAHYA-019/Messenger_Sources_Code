package com.facebook.messaging.communitymessaging.pausechat.fragment;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1Iw;
import X.1LI;
import X.7zS;
import X.8gX;
import X.AKM;
import X.DD4;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Window;
import com.facebook.messaging.channels.pause.model.PausedReasonEnum;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: PauseReasonBottomSheetFragment.class */
public final class PauseReasonBottomSheetFragment extends MigBottomSheetDialogFragment {
    public PausedReasonData A00;

    public void A0x() {
        super.A0x();
        Window window = A0e().getWindow();
        if (window != null) {
            window.setSoftInputMode(16);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        Bundle requireArguments = requireArguments();
        MigColorScheme A0j = 7zS.A0j(this);
        Parcelable parcelable = requireArguments.getParcelable("reason_listener");
        if (parcelable == null) {
            throw 1BK.A0h();
        }
        PauseReasonController pauseReasonController = (PauseReasonController) parcelable;
        PausedReasonData pausedReasonData = this.A00;
        if (pausedReasonData == null) {
            11T.A0L("currentReason");
            throw 0Q8.createAndThrow();
        }
        return new 8gX(pauseReasonController, pausedReasonData, A0j, new AKM(this, 20), new DD4(this, 10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        PausedReasonData pausedReasonData;
        int A02 = 0FI.A02(1925345721);
        super.onCreate(bundle);
        if (bundle == null) {
            pausedReasonData = (PausedReasonData) requireArguments().getParcelable("initial_reason_text");
            if (pausedReasonData == null) {
                pausedReasonData = new PausedReasonData(PausedReasonEnum.A04, "");
            }
        } else {
            Parcelable parcelable = bundle.getParcelable("initial_reason_text");
            if (parcelable == null) {
                IllegalStateException A0h = 1BK.A0h();
                0FI.A08(1498644669, A02);
                throw A0h;
            }
            pausedReasonData = (PausedReasonData) parcelable;
        }
        this.A00 = pausedReasonData;
        0FI.A08(1890210830, A02);
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        PausedReasonData pausedReasonData = this.A00;
        if (pausedReasonData == null) {
            11T.A0L("currentReason");
            throw 0Q8.createAndThrow();
        }
        bundle.putParcelable("initial_reason_text", pausedReasonData);
        super.onSaveInstanceState(bundle);
    }
}
