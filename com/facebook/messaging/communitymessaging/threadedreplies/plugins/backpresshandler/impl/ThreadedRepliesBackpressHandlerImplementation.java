package com.facebook.messaging.communitymessaging.threadedreplies.plugins.backpresshandler.impl;

import X.11T;
import X.1Br;
import X.1HG;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: ThreadedRepliesBackpressHandlerImplementation.class */
public final class ThreadedRepliesBackpressHandlerImplementation {
    public final 1Br A00;
    public final 1Br A01;
    public final Context A02;
    public final ThreadKey A03;

    public ThreadedRepliesBackpressHandlerImplementation(Context context, ThreadKey threadKey) {
        11T.A0F(context, 1);
        this.A02 = context;
        this.A03 = threadKey;
        this.A01 = 1HG.A00(context, 50024);
        this.A00 = 1HG.A00(context, 100189);
    }
}
