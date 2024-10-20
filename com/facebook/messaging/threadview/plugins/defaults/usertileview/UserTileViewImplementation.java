package com.facebook.messaging.threadview.plugins.defaults.usertileview;

import X.11T;
import X.1Br;
import X.1Lm;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.UserKey;

/* loaded from: UserTileViewImplementation.class */
public final class UserTileViewImplementation {
    public final Context A00;
    public final 1Br A01;
    public final ThreadKey A02;
    public final UserKey A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public UserTileViewImplementation(Context context, FbUserSession fbUserSession, ThreadKey threadKey, UserKey userKey, String str, String str2, String str3) {
        11T.A0F(fbUserSession, 1);
        11T.A0F(context, 7);
        this.A02 = threadKey;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A00 = context;
        this.A03 = userKey;
        this.A01 = 1Lm.A00(context, fbUserSession, 17069);
    }
}
