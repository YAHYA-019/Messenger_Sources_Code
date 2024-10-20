package com.facebook.messaging.livelocation.plugins.core.activitybanner;

import X.1BL;
import X.1Br;
import X.1Bu;
import X.C15h;
import X.C2375GbC;
import X.DBV;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: LiveLocationActivityBanner.class */
public final class LiveLocationActivityBanner {
    public C2375GbC A00;
    public final Context A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final C15h A04;

    public LiveLocationActivityBanner(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A01 = context;
        this.A02 = fbUserSession;
        this.A04 = DBV.A00;
        this.A03 = 1Bu.A00(83651);
    }
}
