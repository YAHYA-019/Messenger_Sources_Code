package com.facebook.messaging.omnipicker.plugins.threadhostprovider.defaults.forthreadkey;

import X.11T;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.send.trigger.NavigationTrigger;

/* loaded from: DefaultThreadHostForThreadKeyProvider.class */
public final class DefaultThreadHostForThreadKeyProvider {
    public final Context A00;
    public final ThreadKey A01;
    public final NavigationTrigger A02;

    public DefaultThreadHostForThreadKeyProvider(Context context, ThreadKey threadKey, NavigationTrigger navigationTrigger) {
        11T.A0F(context, 1);
        this.A00 = context;
        this.A01 = threadKey;
        this.A02 = navigationTrigger;
    }
}
