package com.facebook.messaging.wellbeing.selfremediation.restrict.plugins.privacysettings;

import X.11T;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.C7j;
import X.CG8;
import X.CvG;
import android.content.Context;

/* loaded from: RestrictedListPrivacySettings.class */
public final class RestrictedListPrivacySettings {
    public final 1Br A00;
    public final 1Br A01;
    public final Context A02;

    public RestrictedListPrivacySettings(Context context) {
        11T.A0F(context, 1);
        this.A02 = context;
        this.A00 = 1Bu.A00(83042);
        this.A01 = 1Bu.A00(147785);
    }

    public final C7j A00() {
        Context context = this.A02;
        String A0u = 1BK.A0u(context, 2131964552);
        String A0u2 = 1BK.A0u(context, 2131964551);
        1Br.A0C(this.A00);
        return CG8.A00(new CvG(this, 1), A0u, A0u2, "restricted_accounts");
    }
}
