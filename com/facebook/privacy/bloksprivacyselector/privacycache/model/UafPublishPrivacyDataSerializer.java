package com.facebook.privacy.bloksprivacyselector.privacycache.model;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: UafPublishPrivacyDataSerializer.class */
public class UafPublishPrivacyDataSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), UafPublishPrivacyData.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        UafPublishPrivacyData uafPublishPrivacyData = (UafPublishPrivacyData) obj;
        if (uafPublishPrivacyData == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, uafPublishPrivacyData.name);
        AbstractC11224vw.A05(r302, c26c, uafPublishPrivacyData.iconImage, "iconImage");
        AbstractC11224vw.A05(r302, c26c, uafPublishPrivacyData.currentTagExpansion, "currentTagExpansion");
        AbstractC11224vw.A06(r302, c26c, "tagExpansionOptions", uafPublishPrivacyData.tagExpansionOptions);
        AbstractC11224vw.A0D(r302, "legacyGraphApiPrivacyJson", uafPublishPrivacyData.legacyGraphApiPrivacyJson);
        AbstractC11224vw.A05(r302, c26c, uafPublishPrivacyData.privacyRowInput, "privacyRowInput");
        r302.A0Y();
    }
}
