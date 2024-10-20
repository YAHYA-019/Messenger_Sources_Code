package com.facebook.messaging.aibot.plugins.core.imagine.composerentrypoint.overflow;

import X.11T;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.6Qf;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: ImagineComposerOverflowEntryPoint.class */
public final class ImagineComposerOverflowEntryPoint {
    public String A00;
    public final Context A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 6Qf A04;
    public final ThreadKey A05;
    public final Capabilities A06;

    public ImagineComposerOverflowEntryPoint(Context context, 6Qf r303, ThreadKey threadKey, Capabilities capabilities) {
        1BL.A1H(context, r303, capabilities);
        11T.A0F(threadKey, 4);
        this.A01 = context;
        this.A04 = r303;
        this.A06 = capabilities;
        this.A05 = threadKey;
        this.A02 = 1Bq.A00(66409);
        this.A03 = 1Bu.A00(68258);
    }
}
