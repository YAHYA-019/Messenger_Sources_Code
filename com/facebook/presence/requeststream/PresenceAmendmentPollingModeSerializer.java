package com.facebook.presence.requeststream;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import X.HXL;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: PresenceAmendmentPollingModeSerializer.class */
public class PresenceAmendmentPollingModeSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), PresenceAmendmentPollingMode.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        PresenceAmendmentPollingMode presenceAmendmentPollingMode = (PresenceAmendmentPollingMode) obj;
        if (presenceAmendmentPollingMode == null) {
            r302.A0Z();
        }
        r302.A0b();
        int i = presenceAmendmentPollingMode.newPollingMode;
        r302.A0o("newPollingMode");
        r302.A0f(i);
        AbstractC11224vw.A0D(r302, "requestId", presenceAmendmentPollingMode.requestId);
        int i2 = ((HXL) presenceAmendmentPollingMode).task;
        r302.A0o("task");
        r302.A0f(i2);
        r302.A0Y();
    }
}
