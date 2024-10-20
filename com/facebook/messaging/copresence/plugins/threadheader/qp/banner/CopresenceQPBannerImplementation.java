package com.facebook.messaging.copresence.plugins.threadheader.qp.banner;

import X.1BK;
import X.1Br;
import X.1Bu;
import X.2S4;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: CopresenceQPBannerImplementation.class */
public final class CopresenceQPBannerImplementation {
    public final Context A00;
    public final 2S4 A01;
    public final 1Br A02;
    public final ThreadKey A03;

    public CopresenceQPBannerImplementation(Context context, 2S4 r303, ThreadKey threadKey) {
        1BK.A1J(r303, 2, threadKey);
        this.A00 = context;
        this.A01 = r303;
        this.A03 = threadKey;
        this.A02 = 1Bu.A01(context, 16428);
    }
}
