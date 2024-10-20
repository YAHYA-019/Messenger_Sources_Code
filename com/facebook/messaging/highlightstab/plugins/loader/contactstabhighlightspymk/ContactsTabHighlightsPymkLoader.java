package com.facebook.messaging.highlightstab.plugins.loader.contactstabhighlightspymk;

import X.11T;
import X.1BL;
import X.1Br;
import X.1Lm;
import X.2VN;
import X.2VP;
import X.2yD;
import X.9Wz;
import X.9vK;
import X.9vL;
import X.C1ub;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: ContactsTabHighlightsPymkLoader.class */
public final class ContactsTabHighlightsPymkLoader {
    public final int A00;
    public final int A01;
    public final 1Br A02;
    public final 9Wz A03;
    public final 2VN A04;
    public final 2VP A05;
    public final boolean A06;
    public final Context A07;
    public final FbUserSession A08;

    public ContactsTabHighlightsPymkLoader(Context context, FbUserSession fbUserSession, 9Wz r304) {
        1BL.A1F(context, fbUserSession);
        11T.A0F(r304, 3);
        this.A07 = context;
        this.A08 = fbUserSession;
        this.A03 = r304;
        this.A02 = 1Lm.A00(context, fbUserSession, 33213);
        C1ub c1ub = C1ub.A03;
        this.A00 = 2yD.A00(C1ub.A00(), 36603111469684760L);
        this.A06 = c1ub.A0F();
        this.A01 = 2yD.A00(C1ub.A00(), 36603111469553687L);
        this.A05 = new 9vL(this, 3);
        this.A04 = new 9vK(this, 3);
    }
}
