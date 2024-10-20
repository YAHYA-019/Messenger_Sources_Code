package com.facebook.messaging.search.messages.plugins.threadviewopener.openmsys.inchatsearch;

import X.1BL;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;

/* loaded from: OpenInChatSearchThreadViewOpener.class */
public final class OpenInChatSearchThreadViewOpener {
    public final Context A00;
    public final ThreadKey A01;
    public final ImmutableList A02;
    public final String A03;
    public volatile boolean A04;

    public OpenInChatSearchThreadViewOpener(Context context, ThreadKey threadKey, ImmutableList immutableList, String str) {
        1BL.A11(1, context, str, immutableList);
        this.A00 = context;
        this.A01 = threadKey;
        this.A03 = str;
        this.A02 = immutableList;
    }
}
