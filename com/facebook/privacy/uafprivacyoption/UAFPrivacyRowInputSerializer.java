package com.facebook.privacy.uafprivacyoption;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: UAFPrivacyRowInputSerializer.class */
public class UAFPrivacyRowInputSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), UAFPrivacyRowInput.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        UAFPrivacyRowInput uAFPrivacyRowInput = (UAFPrivacyRowInput) obj;
        if (uAFPrivacyRowInput == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A05(r302, c26c, uAFPrivacyRowInput.privacyTargeting, "privacyTargeting");
        AbstractC11224vw.A06(r302, c26c, "allow", uAFPrivacyRowInput.allow);
        AbstractC11224vw.A06(r302, c26c, "deny", uAFPrivacyRowInput.deny);
        AbstractC11224vw.A05(r302, c26c, uAFPrivacyRowInput.tagExpansionState, "tagExpansionState");
        AbstractC11224vw.A05(r302, c26c, uAFPrivacyRowInput.baseState, "baseState");
        r302.A0Y();
    }
}
