package com.facebook.messaging.graph.plugins.usercontrols.hidecontact.privacycontrols;

import X.1BK;
import X.1BL;
import X.1Br;
import X.1Bu;
import X.1HG;
import X.1UG;
import X.AbF;
import X.AbI;
import X.BNu;
import X.C7j;
import X.CG8;
import X.CGK;
import X.Cvn;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;

/* loaded from: HideContactPrivacyControlSettingsRow.class */
public final class HideContactPrivacyControlSettingsRow {
    public final 1Br A00;
    public final 1Br A01;
    public final Context A02;
    public final LifecycleOwner A03;

    public HideContactPrivacyControlSettingsRow(Context context, LifecycleOwner lifecycleOwner) {
        1BL.A1F(context, lifecycleOwner);
        this.A02 = context;
        this.A03 = lifecycleOwner;
        this.A00 = 1Bu.A00(83042);
        this.A01 = 1HG.A00(context, 83143);
    }

    public final C7j A00() {
        1Br.A0C(this.A00);
        Context context = this.A02;
        return CG8.A00(Cvn.A00(this, 41), 1BK.A0u(context, 2131957609), context.getString(2131957608), "hidden_contacts");
    }

    public final void A01() {
        CGK cgk = (CGK) 1Br.A0B(this.A01);
        String A0t = 1BK.A0t();
        cgk.A00 = A0t;
        1UG A08 = 1BK.A08(1Br.A02(cgk.A01), "msg_setting_privacy_event");
        if (A08.isSampled()) {
            if (A0t == null) {
                throw 1BK.A0h();
            }
            A08.A7R("msg_setting_privacy_session_id", A0t);
            AbF.A1L(A08, "item_impression");
            AbI.A1J(A08, 2);
            A08.A5c(BNu.A01, "item");
            A08.BZL();
        }
    }
}
