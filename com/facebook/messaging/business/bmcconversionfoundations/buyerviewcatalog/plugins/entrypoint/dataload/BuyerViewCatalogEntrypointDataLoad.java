package com.facebook.messaging.business.bmcconversionfoundations.buyerviewcatalog.plugins.entrypoint.dataload;

import X.11T;
import X.1Br;
import X.1Bu;
import X.6iB;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: BuyerViewCatalogEntrypointDataLoad.class */
public final class BuyerViewCatalogEntrypointDataLoad {
    public final 1Br A00;
    public final 1Br A01;
    public final ThreadKey A02;
    public final 6iB A03;
    public final Context A04;

    public BuyerViewCatalogEntrypointDataLoad(Context context, ThreadKey threadKey, 6iB r304) {
        11T.A0F(context, 1);
        11T.A0F(r304, 2);
        11T.A0F(threadKey, 3);
        this.A04 = context;
        this.A03 = r304;
        this.A02 = threadKey;
        this.A01 = 1Bu.A01(context, 16428);
        this.A00 = 1Bu.A01(context, 81982);
    }
}
