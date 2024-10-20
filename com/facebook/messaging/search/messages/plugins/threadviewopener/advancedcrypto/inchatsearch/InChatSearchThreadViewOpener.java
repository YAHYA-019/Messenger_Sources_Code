package com.facebook.messaging.search.messages.plugins.threadviewopener.advancedcrypto.inchatsearch;

import X.1BL;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;

/* loaded from: InChatSearchThreadViewOpener.class */
public final class InChatSearchThreadViewOpener {
    public final Context A00;
    public final ThreadKey A01;
    public final ImmutableList A02;
    public final Long A03;
    public final String A04;
    public volatile boolean A05;

    public InChatSearchThreadViewOpener(Context context, ThreadKey threadKey, ImmutableList immutableList, Long l, String str) {
        1BL.A11(1, context, str, immutableList);
        this.A00 = context;
        this.A01 = threadKey;
        this.A04 = str;
        this.A02 = immutableList;
        this.A03 = l;
    }
}
