package com.facebook.feed.logging.waterfall;

import X.28Q;
import X.4iJ;
import X.AnonymousClass001;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: VpvWaterfallImpressionSerializer.class */
public class VpvWaterfallImpressionSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), VpvWaterfallImpression.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        r302.A0Z();
        r302.A0b();
        throw AnonymousClass001.A0Q("getTrackingCodes");
    }
}
