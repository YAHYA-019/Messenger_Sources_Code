package com.facebook.messaging.notify.plugins.mute.threadmetadataprovider;

import X.11T;
import X.1Br;
import X.1Bu;
import X.C2nn;
import android.content.Context;

/* loaded from: MuteThreadMetadataProviderImplementation.class */
public final class MuteThreadMetadataProviderImplementation {
    public final 1Br A00;
    public final Context A01;

    public MuteThreadMetadataProviderImplementation(Context context) {
        11T.A0F(context, 1);
        this.A01 = context;
        this.A00 = 1Bu.A01(context, 65922);
    }

    public final C2nn A00() {
        C2nn c2nn = (C2nn) this.A00.A00.get();
        11T.A0I(c2nn, "null cannot be cast to non-null type com.facebook.xapp.messaging.threadlist.thread.syncprotocol.metadataprovider.ThreadMetadataProvider<out com.facebook.xapp.messaging.threadlist.thread.row.model.api.ThreadMetadata>");
        return c2nn;
    }
}
