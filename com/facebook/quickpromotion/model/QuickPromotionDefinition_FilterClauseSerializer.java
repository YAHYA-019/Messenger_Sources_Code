package com.facebook.quickpromotion.model;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: QuickPromotionDefinition_FilterClauseSerializer.class */
public class QuickPromotionDefinition_FilterClauseSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), QuickPromotionDefinition.FilterClause.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        QuickPromotionDefinition.FilterClause filterClause = (QuickPromotionDefinition.FilterClause) obj;
        if (filterClause == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A05(r302, c26c, filterClause.type, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        AbstractC11224vw.A06(r302, c26c, "filters", filterClause.filters);
        AbstractC11224vw.A06(r302, c26c, "clauses", filterClause.clauses);
        r302.A0Y();
    }
}
