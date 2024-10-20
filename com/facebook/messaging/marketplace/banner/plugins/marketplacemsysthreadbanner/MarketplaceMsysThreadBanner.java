package com.facebook.messaging.marketplace.banner.plugins.marketplacemsysthreadbanner;

import X.11T;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: MarketplaceMsysThreadBanner.class */
public final class MarketplaceMsysThreadBanner {
    public final Context A00;
    public final ThreadKey A01;
    public final AtomicBoolean A02;

    public MarketplaceMsysThreadBanner(Context context, ThreadKey threadKey) {
        11T.A0F(context, 1);
        this.A00 = context;
        this.A01 = threadKey;
        this.A02 = new AtomicBoolean(false);
    }
}
