package com.facebook.presence.requeststream;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import X.HXL;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: PresenceAmendmentAdditionalContactsSerializer.class */
public class PresenceAmendmentAdditionalContactsSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), PresenceAmendmentAdditionalContacts.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        PresenceAmendmentAdditionalContacts presenceAmendmentAdditionalContacts = (PresenceAmendmentAdditionalContacts) obj;
        if (presenceAmendmentAdditionalContacts == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A06(r302, c26c, "additionalContacts", presenceAmendmentAdditionalContacts.additionalContacts);
        AbstractC11224vw.A0D(r302, "requestId", presenceAmendmentAdditionalContacts.requestId);
        int i = ((HXL) presenceAmendmentAdditionalContacts).task;
        r302.A0o("task");
        r302.A0f(i);
        r302.A0Y();
    }
}
