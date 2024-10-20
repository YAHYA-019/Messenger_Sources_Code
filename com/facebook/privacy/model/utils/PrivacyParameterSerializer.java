package com.facebook.privacy.model.utils;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: PrivacyParameterSerializer.class */
public class PrivacyParameterSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), PrivacyParameter.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        PrivacyParameter privacyParameter = (PrivacyParameter) obj;
        if (privacyParameter == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, "value", privacyParameter.value);
        AbstractC11224vw.A0D(r302, "deny", privacyParameter.deny);
        AbstractC11224vw.A0D(r302, "allow", privacyParameter.allow);
        AbstractC11224vw.A0D(r302, "friends", privacyParameter.friends);
        AbstractC11224vw.A05(r302, c26c, privacyParameter.settings, "settings");
        r302.A0Y();
    }
}
