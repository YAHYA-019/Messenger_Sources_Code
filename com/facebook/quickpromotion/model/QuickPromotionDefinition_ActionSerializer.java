package com.facebook.quickpromotion.model;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: QuickPromotionDefinition_ActionSerializer.class */
public class QuickPromotionDefinition_ActionSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), QuickPromotionDefinition.Action.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        QuickPromotionDefinition.Action action = (QuickPromotionDefinition.Action) obj;
        if (action == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A05(r302, c26c, action.style, "style");
        AbstractC11224vw.A0D(r302, "title", action.title);
        AbstractC11224vw.A0D(r302, "url", action.url);
        int i = action.limit;
        r302.A0o("limit");
        r302.A0f(i);
        boolean z = action.dismissPromotion;
        r302.A0o("dismiss_promotion");
        r302.A0v(z);
        r302.A0Y();
    }
}
