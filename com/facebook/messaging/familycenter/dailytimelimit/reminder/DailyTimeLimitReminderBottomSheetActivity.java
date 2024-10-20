package com.facebook.messaging.familycenter.dailytimelimit.reminder;

import X.1BK;
import X.1Bn;
import X.1Br;
import X.1UG;
import X.2Ov;
import X.94S;
import X.98F;
import X.AnonymousClass987;
import X.BOb;
import X.C9Iv;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* loaded from: DailyTimeLimitReminderBottomSheetActivity.class */
public final class DailyTimeLimitReminderBottomSheetActivity extends FbFragmentActivity {
    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        int intExtra = getIntent().getIntExtra("time_left_key", -1);
        if (intExtra != -1) {
            94S r0 = MigBottomSheetDialogFragment.A01;
            Bundle A05 = 1BK.A05();
            A05.putInt("time_left_key", intExtra);
            2Ov baseMigBottomSheetDialogFragment = new BaseMigBottomSheetDialogFragment();
            baseMigBottomSheetDialogFragment.setArguments(A05);
            baseMigBottomSheetDialogFragment.A0m(BDe(), "DailyTimeLimitReminderBottomSheet");
            1UG A08 = 1BK.A08(1Br.A02(((C9Iv) 1Bn.A0A(68130)).A00), "yp_messenger_time_limit_client_event");
            if (A08.isSampled()) {
                A08.A5c(AnonymousClass987.IMPRESSION, "event_type");
                A08.A5c(98F.A02, "event_name");
                A08.A5c(BOb.A03, "module");
                A08.BZL();
            }
        }
    }
}
