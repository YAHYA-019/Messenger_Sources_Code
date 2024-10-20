package com.facebook.messaging.messengerkids.plugins.core.mesettings;

import X.1BL;
import X.1Br;
import X.1Bu;
import X.1PA;
import X.AbH;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: MessengerKidsProfileSetting.class */
public final class MessengerKidsProfileSetting {
    public 1PA A00;
    public final Context A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;

    public MessengerKidsProfileSetting(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A01 = context;
        this.A02 = fbUserSession;
        this.A05 = 1Bu.A00(83729);
        this.A03 = 1Bu.A01(context, 49963);
        this.A04 = AbH.A0d(context);
    }
}
