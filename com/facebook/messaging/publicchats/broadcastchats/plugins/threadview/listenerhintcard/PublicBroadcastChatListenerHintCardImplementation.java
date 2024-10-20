package com.facebook.messaging.publicchats.broadcastchats.plugins.threadview.listenerhintcard;

import X.1BK;
import X.1Bq;
import X.1Br;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: PublicBroadcastChatListenerHintCardImplementation.class */
public final class PublicBroadcastChatListenerHintCardImplementation {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final ThreadSummary A03;
    public final MigColorScheme A04;

    public PublicBroadcastChatListenerHintCardImplementation(Context context, ThreadSummary threadSummary, MigColorScheme migColorScheme) {
        1BK.A1J(context, 1, migColorScheme);
        this.A00 = context;
        this.A04 = migColorScheme;
        this.A03 = threadSummary;
        this.A01 = 1Bq.A00(68470);
        this.A02 = 1Bq.A00(67708);
    }
}
