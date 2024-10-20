package com.facebook.messaging.encryptedbackups.plugins.privacysettings;

import X.1BK;
import X.1BL;
import X.1Bn;
import X.4YU;
import X.C3o5;
import X.C5ww;
import X.C7j;
import X.CG8;
import X.DFp;
import android.content.Context;
import com.facebook.messaging.encryptedbackups.setting.activity.EncryptedBackupsSettingActivity;

/* loaded from: PrivacySettingEncryptedBackups.class */
public final class PrivacySettingEncryptedBackups {
    public final DFp A00;
    public final Context A01;

    public PrivacySettingEncryptedBackups(Context context, DFp dFp) {
        1BL.A1F(context, dFp);
        this.A01 = context;
        this.A00 = dFp;
    }

    public final C7j A00() {
        Context context = this.A01;
        String A0u = 1BK.A0u(context, 2131956479);
        return ((CG8) 1Bn.A0A(83042)).A01(C3o5.A0D(context, EncryptedBackupsSettingActivity.class), (C5ww) null, 4YU.A0t(context.getResources(), 2131956529), A0u, "secure_storage");
    }
}
