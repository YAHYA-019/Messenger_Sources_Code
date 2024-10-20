package com.facebook.messaging.communitymessaging.plugins.communityinfo.secondarydata.communitydata;

import X.1BL;
import X.1BY;
import X.1Lo;
import X.C1284Aco;
import X.C1x;
import X.CaE;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: CommunityData.class */
public final class CommunityData {
    public final LiveData A00;
    public final Observer A01;
    public final C1x A02;
    public final Context A03;
    public final FbUserSession A04;
    public final C1284Aco A05;
    public final ThreadKey A06;

    public CommunityData(Context context, FbUserSession fbUserSession, ThreadKey threadKey, C1x c1x) {
        1BL.A11(1, context, c1x, fbUserSession);
        this.A03 = context;
        this.A06 = threadKey;
        this.A02 = c1x;
        this.A04 = fbUserSession;
        C1284Aco c1284Aco = (C1284Aco) 1Lo.A04(context, fbUserSession, (1BY) null, 82370);
        this.A05 = c1284Aco;
        this.A00 = c1284Aco.A00(threadKey.A0r());
        this.A01 = CaE.A00(this, 68);
    }
}
