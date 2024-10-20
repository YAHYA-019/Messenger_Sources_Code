package com.facebook.quickpromotion.model;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: QuickPromotionDefinition_SocialContextSerializer.class */
public class QuickPromotionDefinition_SocialContextSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), QuickPromotionDefinition.SocialContext.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        QuickPromotionDefinition.SocialContext socialContext = (QuickPromotionDefinition.SocialContext) obj;
        if (socialContext == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, "text", socialContext.text);
        AbstractC11224vw.A06(r302, c26c, "friend_ids", socialContext.friendIds);
        r302.A0Y();
    }
}
