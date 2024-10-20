package com.facebook.messaging.highlightstab.plugins.loader.contactstab;

import X.1Br;
import X.1Lm;
import X.7zT;
import X.9Ve;
import X.9Wz;
import X.C2xg;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: ContactsTabHighlightsLoader.class */
public final class ContactsTabHighlightsLoader {
    public C2xg A00;
    public 9Ve A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 9Wz A04;
    public final Context A05;
    public final FbUserSession A06;
    public final C2xg A07;

    public ContactsTabHighlightsLoader(Context context, FbUserSession fbUserSession, C2xg c2xg, 9Wz r305) {
        7zT.A1W(context, r305, c2xg, fbUserSession);
        this.A05 = context;
        this.A04 = r305;
        this.A07 = c2xg;
        this.A06 = fbUserSession;
        this.A03 = 1Lm.A00(context, fbUserSession, 67495);
        this.A00 = c2xg;
        this.A01 = (9Ve) c2xg.A01;
        this.A02 = 1Lm.A00(context, fbUserSession, 68230);
    }
}
