package com.facebook.messaging.xma.template.plugins.core.cta.postback;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import android.content.Context;
import com.facebook.common.dextricks.Constants;

/* loaded from: PostbackCtaHandler.class */
public final class PostbackCtaHandler {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;

    public PostbackCtaHandler(Context context) {
        11T.A0F(context, 1);
        this.A00 = context;
        this.A04 = 1Bu.A01(context, 16428);
        this.A03 = 1Bq.A00(Constants.LOAD_RESULT_PGO);
        this.A01 = 1Bu.A00(84927);
        this.A02 = 1Bq.A00(83482);
    }
}
