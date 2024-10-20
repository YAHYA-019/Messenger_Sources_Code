package com.facebook.entitypresence;

import X.28Q;
import X.4iJ;
import X.C26c;
import com.facebook.entitypresence.EntityPresenceBladeRunnerHelper;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: EntityPresenceBladeRunnerHelper_PingMessageSerializer.class */
public class EntityPresenceBladeRunnerHelper_PingMessageSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), EntityPresenceBladeRunnerHelper.PingMessage.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        if (obj == null) {
            r302.A0Z();
        }
        r302.A0b();
        r302.A0Y();
    }
}
