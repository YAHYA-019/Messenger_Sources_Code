package com.facebook.browser.lite.extensions.commercecheckout.models;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import X.DKG;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: ShopsLiteLineItemSerializer.class */
public class ShopsLiteLineItemSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), ShopsLiteLineItem.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        ShopsLiteLineItem shopsLiteLineItem = (ShopsLiteLineItem) obj;
        if (shopsLiteLineItem == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, "variantId", shopsLiteLineItem.variantId);
        int i = shopsLiteLineItem.quantity;
        r302.A0o("quantity");
        r302.A0f(i);
        DKG.A1T(r302, "requiresShipping", shopsLiteLineItem.requiresShipping);
    }
}
