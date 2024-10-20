package com.facebook.inspiration.model.movableoverlay;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: InspirationGraphQLTextWithEntitiesSerializer.class */
public class InspirationGraphQLTextWithEntitiesSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), InspirationGraphQLTextWithEntities.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        InspirationGraphQLTextWithEntities inspirationGraphQLTextWithEntities = (InspirationGraphQLTextWithEntities) obj;
        if (inspirationGraphQLTextWithEntities == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A05(r302, c26c, inspirationGraphQLTextWithEntities.textWithEntities, "text_with_entities");
        r302.A0Y();
    }
}
