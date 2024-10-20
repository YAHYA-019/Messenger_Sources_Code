package com.facebook.messaging.familycenter.scheduledbreaks.reminder;

import X.0FI;
import X.11T;
import X.1BK;
import X.1Bn;
import X.1Br;
import X.1Iw;
import X.1LI;
import X.1UG;
import X.7zV;
import X.9Ix;
import X.BOb;
import X.QH8;
import X.RFV;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: ScheduledBreaksReminderBottomSheetFragment.class */
public final class ScheduledBreaksReminderBottomSheetFragment extends MigBottomSheetDialogFragment {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        RFV rfv = new RFV(this);
        Bundle requireArguments = requireArguments();
        MigColorScheme A1F = A1F();
        String string = requireArguments.getString("START_TIME_KEY");
        if (string == null) {
            string = "";
        }
        String string2 = requireArguments.getString("END_TIME_KEY");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = requireArguments.getString("TIME_UNTIL_KEY");
        if (string3 == null) {
            string3 = "";
        }
        return new QH8(rfv, A1F, string, string2, string3);
    }

    public void onCancel(DialogInterface dialogInterface) {
        11T.A0F(dialogInterface, 0);
        A0o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(1676643103);
        super.onDestroy();
        requireActivity().finish();
        0FI.A08(-769094893, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(733653881);
        super/*androidx.fragment.app.Fragment*/.onResume();
        1UG A08 = 1BK.A08(1Br.A02(((9Ix) 1Bn.A0A(68129)).A00), "yp_messenger_family_center_core_client_event");
        if (A08.isSampled()) {
            7zV.A0s(BOb.A02, A08);
        }
        0FI.A08(-638863461, A02);
    }
}
