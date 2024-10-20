package com.facebook.browser.lite.extensions.commercecheckout.models;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: ShopsLiteContentModelSerializer.class */
public class ShopsLiteContentModelSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), ShopsLiteContentModel.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        ShopsLiteContentModel shopsLiteContentModel = (ShopsLiteContentModel) obj;
        if (shopsLiteContentModel == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, "fallbackCheckoutUrl", shopsLiteContentModel.fallbackCheckoutUrl);
        AbstractC11224vw.A0D(r302, "sourceUrl", shopsLiteContentModel.sourceUrl);
        AbstractC11224vw.A0D(r302, "merchantDomain", shopsLiteContentModel.merchantDomain);
        AbstractC11224vw.A06(r302, c26c, "lineItems", shopsLiteContentModel.lineItems);
        AbstractC11224vw.A0D(r302, "visitToken", shopsLiteContentModel.visitToken);
        r302.A0Y();
    }
}
