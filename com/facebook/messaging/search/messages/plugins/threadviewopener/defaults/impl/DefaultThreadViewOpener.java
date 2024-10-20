package com.facebook.messaging.search.messages.plugins.threadviewopener.defaults.impl;

import X.11T;
import X.7zT;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;

/* loaded from: DefaultThreadViewOpener.class */
public final class DefaultThreadViewOpener {
    public final Context A00;
    public final ThreadKey A01;
    public final ImmutableList A02;
    public final String A03;
    public final String A04;

    public DefaultThreadViewOpener(Context context, ThreadKey threadKey, ImmutableList immutableList, String str, String str2) {
        7zT.A1W(context, immutableList, threadKey, str);
        11T.A0F(str2, 5);
        this.A00 = context;
        this.A02 = immutableList;
        this.A01 = threadKey;
        this.A03 = str;
        this.A04 = str2;
    }
}
