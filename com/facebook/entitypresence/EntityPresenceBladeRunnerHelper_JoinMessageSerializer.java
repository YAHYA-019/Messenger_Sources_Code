package com.facebook.entitypresence;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.facebook.entitypresence.EntityPresenceBladeRunnerHelper;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: EntityPresenceBladeRunnerHelper_JoinMessageSerializer.class */
public class EntityPresenceBladeRunnerHelper_JoinMessageSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), EntityPresenceBladeRunnerHelper.JoinMessage.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        EntityPresenceBladeRunnerHelper.JoinMessage joinMessage = (EntityPresenceBladeRunnerHelper.JoinMessage) obj;
        if (joinMessage == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, "entity_type", joinMessage.entityType);
        AbstractC11224vw.A0D(r302, "entity_id", joinMessage.entityId);
        AbstractC11224vw.A0D(r302, "capabilities", joinMessage.capabilities);
        AbstractC11224vw.A05(r302, c26c, joinMessage.logInfo, "log_info");
        AbstractC11224vw.A0D(r302, "viewer_id", joinMessage.viewerId);
        r302.A0o("disable_hibernate_mode");
        r302.A0v(true);
        r302.A0Y();
    }
}
