package com.facebook.messaging.contactstab.plugins.loader.customstatus;

import X.1Lm;
import X.2Ti;
import X.2Tj;
import X.7zR;
import X.9Wz;
import X.A21;
import X.AC8;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: ContactsTabCustomStatusLoader.class */
public final class ContactsTabCustomStatusLoader {
    public final Context A00;
    public final FbUserSession A01;
    public final 9Wz A02;
    public final 2Ti A03;

    public ContactsTabCustomStatusLoader(Context context, FbUserSession fbUserSession, 9Wz r304) {
        7zR.A1O(r304, fbUserSession);
        this.A00 = context;
        this.A02 = r304;
        this.A01 = fbUserSession;
        this.A03 = new A21(this, 1);
    }

    public final void A00() {
        FbUserSession fbUserSession = this.A01;
        Context context = this.A00;
        ((2Tj) 1Lm.A05(context, fbUserSession, 33122)).A05(this.A03);
        AC8.A02(((2Tj) 1Lm.A05(context, fbUserSession, 33122)).A03(), this, 14);
    }
}
