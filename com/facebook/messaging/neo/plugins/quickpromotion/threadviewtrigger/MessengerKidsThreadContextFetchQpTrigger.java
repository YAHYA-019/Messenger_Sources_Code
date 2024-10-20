package com.facebook.messaging.neo.plugins.quickpromotion.threadviewtrigger;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: MessengerKidsThreadContextFetchQpTrigger.class */
public final class MessengerKidsThreadContextFetchQpTrigger {
    public ThreadSummary A00;
    public ListenableFuture A01;
    public final Context A02;
    public final FbUserSession A03;
    public final 1Br A04;
    public final 1Br A05;

    public MessengerKidsThreadContextFetchQpTrigger(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        this.A02 = context;
        this.A03 = fbUserSession;
        this.A04 = 1Bu.A01(context, 67515);
        this.A05 = 1Bq.A00(16472);
    }
}
