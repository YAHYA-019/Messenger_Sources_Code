package com.facebook.messaging.accountsettings.plugins.settings.mesetting;

import X.0LS;
import X.11T;
import X.1BY;
import X.1Br;
import X.1Bu;
import X.1De;
import X.AbG;
import X.BRz;
import X.C15h;
import X.C5id;
import X.CDA;
import X.DBe;
import X.FIu;
import android.content.Context;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: AccountSettingsSetting.class */
public final class AccountSettingsSetting {
    public final 1De A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final C15h A05 = DBe.A00(this, 12);
    public final C15h A06 = DBe.A00(this, 13);

    public AccountSettingsSetting(1De r302) {
        this.A00 = r302;
        1BY r0 = r302.A00;
        this.A02 = 1Bu.A03(r0, 83589);
        this.A01 = 1Bu.A03(r0, 85289);
        this.A03 = 1Bu.A03(r0, 100160);
        this.A04 = AbG.A0M();
    }

    public static final void A00(Context context, FbUserSession fbUserSession, AccountSettingsSetting accountSettingsSetting) {
        CDA cda = (CDA) 1Br.A0B(accountSettingsSetting.A02);
        11T.A0F(fbUserSession, 0);
        Uri.Builder buildUpon = CDA.A00(cda, "settings").buildUpon();
        buildUpon.appendQueryParameter("ref", "messenger_settings");
        0LS.A0A(context, FIu.A00(context, buildUpon.build(), fbUserSession, (FIu) 1Br.A0B(cda.A00), BRz.A00(C5id.A01)));
    }
}
