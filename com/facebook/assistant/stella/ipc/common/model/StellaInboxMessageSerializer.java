package com.facebook.assistant.stella.ipc.common.model;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: StellaInboxMessageSerializer.class */
public class StellaInboxMessageSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), StellaInboxMessage.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        StellaInboxMessage stellaInboxMessage = (StellaInboxMessage) obj;
        if (stellaInboxMessage == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, "mid", stellaInboxMessage.mid);
        AbstractC11224vw.A0D(r302, "prev_mid", stellaInboxMessage.prevMid);
        AbstractC11224vw.A0D(r302, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, stellaInboxMessage.type);
        AbstractC11224vw.A0D(r302, "senderName", stellaInboxMessage.senderName);
        AbstractC11224vw.A0D(r302, "senderId", stellaInboxMessage.senderId);
        long j = stellaInboxMessage.timestamp;
        r302.A0o("timestamp");
        r302.A0g(j);
        AbstractC11224vw.A0D(r302, "content", stellaInboxMessage.content);
        boolean z = stellaInboxMessage.isAdminMessage;
        r302.A0o("isAdminMessage");
        r302.A0v(z);
        int i = stellaInboxMessage.adminMessageContentSubTypeId;
        r302.A0o("adminMessageContentSubTypeId");
        r302.A0f(i);
        AbstractC11224vw.A06(r302, c26c, "attachments", stellaInboxMessage.attachments);
        AbstractC11224vw.A0D(r302, "messageDelivery", stellaInboxMessage.messageDelivery);
        r302.A0Y();
    }
}
