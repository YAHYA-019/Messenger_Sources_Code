package com.facebook.entitypresence;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.facebook.entitypresence.EntityPresenceBladeRunnerHelper;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: EntityPresenceBladeRunnerHelper_LogInfoSerializer.class */
public class EntityPresenceBladeRunnerHelper_LogInfoSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), EntityPresenceBladeRunnerHelper.LogInfo.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        EntityPresenceBladeRunnerHelper.LogInfo logInfo = (EntityPresenceBladeRunnerHelper.LogInfo) obj;
        if (logInfo == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, "client_subscription_id", logInfo.clientSubscriptionId);
        long j = logInfo.sequenceId;
        r302.A0o("sequence_id");
        r302.A0g(j);
        r302.A0Y();
    }
}
