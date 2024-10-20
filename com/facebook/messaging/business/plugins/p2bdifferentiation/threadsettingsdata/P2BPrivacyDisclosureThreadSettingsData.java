package com.facebook.messaging.business.plugins.p2bdifferentiation.threadsettingsdata;

import X.7zR;
import X.C1x;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: P2BPrivacyDisclosureThreadSettingsData.class */
public final class P2BPrivacyDisclosureThreadSettingsData {
    public ListenableFuture A00;
    public final Context A01;
    public final ThreadKey A02;
    public final C1x A03;

    public P2BPrivacyDisclosureThreadSettingsData(Context context, ThreadKey threadKey, C1x c1x) {
        7zR.A1N(context, c1x);
        this.A01 = context;
        this.A02 = threadKey;
        this.A03 = c1x;
    }
}
