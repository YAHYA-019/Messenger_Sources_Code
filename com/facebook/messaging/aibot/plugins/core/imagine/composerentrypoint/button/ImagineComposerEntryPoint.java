package com.facebook.messaging.aibot.plugins.core.imagine.composerentrypoint.button;

import X.11T;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.6Qf;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: ImagineComposerEntryPoint.class */
public final class ImagineComposerEntryPoint {
    public String A00;
    public final Context A01;
    public final 1Br A02;
    public final 6Qf A03;
    public final ThreadKey A04;
    public final Capabilities A05;

    public ImagineComposerEntryPoint(Context context, 6Qf r303, ThreadKey threadKey, Capabilities capabilities) {
        1BL.A1H(context, r303, capabilities);
        11T.A0F(threadKey, 4);
        this.A01 = context;
        this.A03 = r303;
        this.A05 = capabilities;
        this.A04 = threadKey;
        this.A02 = 1Bq.A00(16387);
    }
}
