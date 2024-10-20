package com.facebook.assistant.stella.ipc.common.model;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: StellaInboxThreadSerializer.class */
public class StellaInboxThreadSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), StellaInboxThread.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        StellaInboxThread stellaInboxThread = (StellaInboxThread) obj;
        if (stellaInboxThread == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, "threadId", stellaInboxThread.threadId);
        AbstractC11224vw.A0D(r302, "threadName", stellaInboxThread.threadName);
        AbstractC11224vw.A05(r302, c26c, stellaInboxThread.messageList, "messageList");
        AbstractC11224vw.A05(r302, c26c, stellaInboxThread.participantIds, "participantIds");
        AbstractC11224vw.A05(r302, c26c, stellaInboxThread.participantNames, "participantNames");
        boolean z = stellaInboxThread.isE2ee;
        r302.A0o("isE2ee");
        r302.A0v(z);
        boolean z2 = stellaInboxThread.isGroup;
        r302.A0o("isGroup");
        r302.A0v(z2);
        boolean z3 = stellaInboxThread.isMuted;
        r302.A0o("isMuted");
        r302.A0v(z3);
        AbstractC11224vw.A0D(r302, "viewerId", stellaInboxThread.viewerId);
        long j = stellaInboxThread.unreadCount;
        r302.A0o("unreadCount");
        r302.A0g(j);
        r302.A0Y();
    }
}
