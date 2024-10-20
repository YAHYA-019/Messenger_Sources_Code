package com.facebook.messaging.contextbanner.plugins.core.threadviewdata;

import X.11T;
import X.6iB;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: ContextBannerThreadData.class */
public final class ContextBannerThreadData {
    public ListenableFuture A00;
    public final Context A01;
    public final FbUserSession A02;
    public final ThreadKey A03;
    public final 6iB A04;

    public ContextBannerThreadData(Context context, FbUserSession fbUserSession, ThreadKey threadKey, 6iB r305) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        11T.A0F(threadKey, 3);
        11T.A0F(r305, 4);
        this.A01 = context;
        this.A02 = fbUserSession;
        this.A03 = threadKey;
        this.A04 = r305;
    }
}
