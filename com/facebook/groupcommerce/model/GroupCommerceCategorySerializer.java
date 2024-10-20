package com.facebook.groupcommerce.model;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: GroupCommerceCategorySerializer.class */
public class GroupCommerceCategorySerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), GroupCommerceCategory.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        GroupCommerceCategory groupCommerceCategory = (GroupCommerceCategory) obj;
        if (groupCommerceCategory == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, groupCommerceCategory.name);
        AbstractC11224vw.A0D(r302, "category_id", groupCommerceCategory.categoryID);
        r302.A0Y();
    }
}
