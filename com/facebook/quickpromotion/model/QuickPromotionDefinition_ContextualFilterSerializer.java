package com.facebook.quickpromotion.model;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: QuickPromotionDefinition_ContextualFilterSerializer.class */
public class QuickPromotionDefinition_ContextualFilterSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), QuickPromotionDefinition.ContextualFilter.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        QuickPromotionDefinition.ContextualFilter contextualFilter = (QuickPromotionDefinition.ContextualFilter) obj;
        if (contextualFilter == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A05(r302, c26c, contextualFilter.type, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        boolean z = contextualFilter.passIfNotSupported;
        r302.A0o("passes_if_not_client_supported");
        r302.A0v(z);
        AbstractC11224vw.A0D(r302, "value", contextualFilter.value);
        AbstractC11224vw.A05(r302, c26c, contextualFilter.extraData, "extra_data");
        r302.A0Y();
    }
}
