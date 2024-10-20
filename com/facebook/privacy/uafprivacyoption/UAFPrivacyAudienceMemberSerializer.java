package com.facebook.privacy.uafprivacyoption;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: UAFPrivacyAudienceMemberSerializer.class */
public class UAFPrivacyAudienceMemberSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), UAFPrivacyAudienceMember.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        UAFPrivacyAudienceMember uAFPrivacyAudienceMember = (UAFPrivacyAudienceMember) obj;
        if (uAFPrivacyAudienceMember == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, "typeName", uAFPrivacyAudienceMember.typeName);
        AbstractC11224vw.A0D(r302, PublicKeyCredentialControllerUtility.JSON_KEY_ID, uAFPrivacyAudienceMember.id);
        AbstractC11224vw.A0D(r302, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, uAFPrivacyAudienceMember.name);
        r302.A0Y();
    }
}
