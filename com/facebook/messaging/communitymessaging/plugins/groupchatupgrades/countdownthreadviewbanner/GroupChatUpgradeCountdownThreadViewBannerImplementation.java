package com.facebook.messaging.communitymessaging.plugins.groupchatupgrades.countdownthreadviewbanner;

import X.11T;
import X.1BL;
import X.1Br;
import X.1HG;
import X.63D;
import X.7OX;
import X.7On;
import X.C00m;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: GroupChatUpgradeCountdownThreadViewBannerImplementation.class */
public final class GroupChatUpgradeCountdownThreadViewBannerImplementation {
    public final 1Br A00;
    public final ThreadKey A01;
    public final Context A02;

    public GroupChatUpgradeCountdownThreadViewBannerImplementation(Context context, ThreadKey threadKey) {
        1BL.A1F(context, threadKey);
        this.A02 = context;
        this.A01 = threadKey;
        this.A00 = 1HG.A00(context, 82515);
    }

    public final void A00(7OX r302) {
        11T.A0F(r302, 0);
        ((7On) 1Br.A0B(this.A00)).A01(this.A01, r302, (63D) null, (C00m) null, (C00m) null, 995);
    }
}
