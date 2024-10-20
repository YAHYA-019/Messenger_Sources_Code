package com.facebook.messaging.avatar.socialstickers.plugins.disclaimer.secondarydata;

import X.1Br;
import X.1Lm;
import X.7zO;
import X.7zR;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: SocialStickersDataLoad.class */
public final class SocialStickersDataLoad {
    public final 1Br A00;
    public final 1Br A01;
    public final ThreadKey A02;
    public final AtomicBoolean A03;
    public final Context A04;
    public final FbUserSession A05;

    public SocialStickersDataLoad(Context context, FbUserSession fbUserSession, ThreadKey threadKey) {
        7zR.A1O(fbUserSession, context);
        this.A02 = threadKey;
        this.A05 = fbUserSession;
        this.A04 = context;
        this.A00 = 1Lm.A00(context, fbUserSession, 68074);
        this.A01 = 1Lm.A00(context, fbUserSession, 49969);
        this.A03 = 7zO.A15();
    }
}
