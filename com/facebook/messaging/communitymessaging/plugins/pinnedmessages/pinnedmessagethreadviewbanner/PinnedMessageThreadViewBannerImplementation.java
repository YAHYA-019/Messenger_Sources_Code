package com.facebook.messaging.communitymessaging.plugins.pinnedmessages.pinnedmessagethreadviewbanner;

import X.1Br;
import X.1HG;
import X.63D;
import X.7zR;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: PinnedMessageThreadViewBannerImplementation.class */
public final class PinnedMessageThreadViewBannerImplementation {
    public final 1Br A00;
    public final ThreadKey A01;
    public final 63D A02;
    public final Context A03;

    public PinnedMessageThreadViewBannerImplementation(Context context, ThreadKey threadKey, 63D r304) {
        7zR.A1N(context, r304);
        this.A03 = context;
        this.A01 = threadKey;
        this.A02 = r304;
        this.A00 = 1HG.A00(context, 82515);
    }
}
