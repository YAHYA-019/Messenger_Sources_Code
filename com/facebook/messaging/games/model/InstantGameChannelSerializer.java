package com.facebook.messaging.games.model;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: InstantGameChannelSerializer.class */
public class InstantGameChannelSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), InstantGameChannel.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        InstantGameChannel instantGameChannel = (InstantGameChannel) obj;
        if (instantGameChannel == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, "application_id", instantGameChannel.applicationId);
        AbstractC11224vw.A0D(r302, "privacy_text", instantGameChannel.privacyText);
        AbstractC11224vw.A06(r302, c26c, "permission_list", instantGameChannel.permissionList);
        r302.A0Y();
    }
}
