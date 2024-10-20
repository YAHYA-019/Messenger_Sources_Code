package com.facebook.quickpromotion.model;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: QuickPromotionDefinition_BulletListItemSerializer.class */
public class QuickPromotionDefinition_BulletListItemSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), QuickPromotionDefinition.BulletListItem.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        QuickPromotionDefinition.BulletListItem bulletListItem = (QuickPromotionDefinition.BulletListItem) obj;
        if (bulletListItem == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, "title", bulletListItem.title);
        AbstractC11224vw.A0D(r302, "subtitle", bulletListItem.subtitle);
        AbstractC11224vw.A05(r302, c26c, bulletListItem.icon, PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
        AbstractC11224vw.A05(r302, c26c, bulletListItem.dark_icon, "dark_icon");
        r302.A0Y();
    }
}
