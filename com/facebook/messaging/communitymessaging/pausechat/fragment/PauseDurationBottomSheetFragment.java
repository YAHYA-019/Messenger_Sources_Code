package com.facebook.messaging.communitymessaging.pausechat.fragment;

import X.1Iw;
import X.1LI;
import X.7zS;
import X.AKM;
import X.AnonymousClass001;
import X.QGl;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.messaging.channels.pause.model.PauseDuration;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: PauseDurationBottomSheetFragment.class */
public final class PauseDurationBottomSheetFragment extends MigBottomSheetDialogFragment {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        Bundle requireArguments = requireArguments();
        MigColorScheme A0j = 7zS.A0j(this);
        Parcelable parcelable = requireArguments.getParcelable("duration_listener");
        if (parcelable == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        PauseDurationController pauseDurationController = (PauseDurationController) parcelable;
        Parcelable parcelable2 = requireArguments.getParcelable("current_selected_duration");
        if (parcelable2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        requireArguments.getLong("group_id");
        return new QGl((PauseDuration) parcelable2, pauseDurationController, A0j, new AKM(this, 18));
    }
}
