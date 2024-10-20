package com.facebook.privacy.uafprivacyoption;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: UAFPrivacyRowInputTargetingFieldsSerializer.class */
public class UAFPrivacyRowInputTargetingFieldsSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), UAFPrivacyRowInputTargetingFields.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        UAFPrivacyRowInputTargetingFields uAFPrivacyRowInputTargetingFields = (UAFPrivacyRowInputTargetingFields) obj;
        if (uAFPrivacyRowInputTargetingFields == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, "targetedPublishingFields", uAFPrivacyRowInputTargetingFields.targetedPublishingFields);
        AbstractC11224vw.A0D(r302, "targetedPublishingId", uAFPrivacyRowInputTargetingFields.targetedPublishingId);
        r302.A0Y();
    }
}
