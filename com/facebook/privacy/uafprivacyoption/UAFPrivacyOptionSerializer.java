package com.facebook.privacy.uafprivacyoption;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: UAFPrivacyOptionSerializer.class */
public class UAFPrivacyOptionSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), UAFPrivacyOption.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        UAFPrivacyOption uAFPrivacyOption = (UAFPrivacyOption) obj;
        if (uAFPrivacyOption == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, uAFPrivacyOption.name);
        AbstractC11224vw.A0D(r302, "legacyGraphApiPrivacyJson", uAFPrivacyOption.legacyGraphApiPrivacyJson);
        AbstractC11224vw.A0D(r302, "explanation", uAFPrivacyOption.explanation);
        AbstractC11224vw.A0D(r302, PublicKeyCredentialControllerUtility.JSON_KEY_ID, uAFPrivacyOption.id);
        AbstractC11224vw.A0D(r302, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, uAFPrivacyOption.type);
        boolean z = uAFPrivacyOption.isPrimary;
        r302.A0o("isPrimary");
        r302.A0v(z);
        boolean z2 = uAFPrivacyOption.isSelected;
        r302.A0o("isSelected");
        r302.A0v(z2);
        boolean z3 = uAFPrivacyOption.isMostRecent;
        r302.A0o("isMostRecent");
        r302.A0v(z3);
        AbstractC11224vw.A05(r302, c26c, uAFPrivacyOption.currentTagExpansion, "currentTagExpansion");
        AbstractC11224vw.A05(r302, c26c, uAFPrivacyOption.infoType, "infoType");
        AbstractC11224vw.A06(r302, c26c, "excludedMembers", uAFPrivacyOption.excludedMembers);
        AbstractC11224vw.A06(r302, c26c, "includedMembers", uAFPrivacyOption.includedMembers);
        AbstractC11224vw.A05(r302, c26c, uAFPrivacyOption.iconImage, "iconImage");
        AbstractC11224vw.A06(r302, c26c, "tagExpansionOptions", uAFPrivacyOption.tagExpansionOptions);
        AbstractC11224vw.A05(r302, c26c, uAFPrivacyOption.privacyRowInput, "privacyRowInput");
        r302.A0Y();
    }
}
