package com.facebook.messaging.neue.threadsettings;

import X.0FI;
import X.0LS;
import X.1BK;
import X.1BQ;
import X.1BV;
import X.1Bn;
import X.1Iw;
import X.2TM;
import X.2TP;
import X.2TQ;
import X.2TR;
import X.2TS;
import X.4YU;
import X.7zL;
import X.AbH;
import X.AbN;
import X.AbstractC00603o4;
import X.C00i;
import X.Cbt;
import X.QAk;
import X.QLR;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.settings.surface.MessengerSettingActivity;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.EnumSet;

/* loaded from: ThreadSettingsRtcIntentLoadingActivity.class */
public class ThreadSettingsRtcIntentLoadingActivity extends MessengerSettingActivity {
    public 2TR A00;
    public C00i A01;
    public boolean A02;
    public final C00i A03 = 1BQ.A02(17024);

    public static void A12(2TS r301, ThreadSettingsRtcIntentLoadingActivity threadSettingsRtcIntentLoadingActivity) {
        2TM r0;
        ImmutableList immutableList;
        if (threadSettingsRtcIntentLoadingActivity.A02 || (r0 = r301.A01) == null || (immutableList = r0.A00) == null || immutableList.isEmpty()) {
            return;
        }
        threadSettingsRtcIntentLoadingActivity.A02 = true;
        2TR r02 = threadSettingsRtcIntentLoadingActivity.A00;
        if (r02 != null) {
            r02.AEC();
        }
        ThreadKey A0n = AbH.A0n(((User) 4YU.A0p(threadSettingsRtcIntentLoadingActivity.A01)).A13, Long.parseLong(((User) 1BK.A0r(immutableList)).A13));
        Intent A09 = 4YU.A09(new Uri.Builder().scheme("fb-messenger-secure").authority(AbstractC00603o4.A00(649)).build());
        A09.putExtra("thread_key_for_settings", A0n);
        0LS.A0A(threadSettingsRtcIntentLoadingActivity, A09);
    }

    @Override // com.facebook.messaging.settings.surface.MessengerSettingActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A01 = 1BV.A00(83430);
        2TR r305 = this.A00;
        if (r305 == null) {
            this.A03.get();
            2TQ r0 = new 2TQ(EnumSet.of(2TP.A0P, 2TP.A0J), 60);
            r305 = (2TR) 1Bn.A0A(17025);
            r305.A03 = r0;
            this.A00 = r305;
        }
        r305.A01 = new Cbt(this, 13);
        r305.A08();
        1Iw A0W = 7zL.A0W(this);
        QAk A00 = QLR.A00(A0W);
        A00.A0J();
        setContentView(AbN.A0I(A00.A01, A0W));
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int A00 = 0FI.A00(-1363869873);
        super.onPause();
        2TR r0 = this.A00;
        if (r0 != null) {
            r0.AEC();
        }
        finish();
        overridePendingTransition(0, 0);
        0FI.A07(112930341, A00);
    }
}
