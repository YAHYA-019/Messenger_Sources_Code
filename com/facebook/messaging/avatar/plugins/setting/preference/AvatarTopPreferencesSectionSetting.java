package com.facebook.messaging.avatar.plugins.setting.preference;

import X.1BL;
import X.C01i;
import X.DCx;
import X.DFp;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: AvatarTopPreferencesSectionSetting.class */
public final class AvatarTopPreferencesSectionSetting {
    public final Context A00;
    public final FbUserSession A01;
    public final DFp A02;
    public final C01i A03;

    public AvatarTopPreferencesSectionSetting(Context context, FbUserSession fbUserSession, DFp dFp) {
        1BL.A1H(context, fbUserSession, dFp);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A02 = dFp;
        this.A03 = DCx.A00(this, 26);
    }
}
