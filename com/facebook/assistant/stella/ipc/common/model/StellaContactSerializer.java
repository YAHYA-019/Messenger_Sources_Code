package com.facebook.assistant.stella.ipc.common.model;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: StellaContactSerializer.class */
public class StellaContactSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), StellaContact.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        StellaContact stellaContact = (StellaContact) obj;
        if (stellaContact == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, "threadId", stellaContact.threadId);
        AbstractC11224vw.A0D(r302, "fullName", stellaContact.fullName);
        AbstractC11224vw.A0D(r302, "profilePictureSquareUrl", stellaContact.profilePictureSquareUrl);
        boolean z = stellaContact.isEpdRestricted;
        r302.A0o("epdStatus");
        r302.A0v(z);
        boolean z2 = stellaContact.isGroup;
        r302.A0o("isGroup");
        r302.A0v(z2);
        float f = stellaContact.userRank;
        r302.A0o("userRank");
        r302.A0e(f);
        AbstractC11224vw.A0D(r302, "nickName", stellaContact.nickName);
        AbstractC11224vw.A06(r302, c26c, "groupChatParticipant", stellaContact.groupChatParticipant);
        AbstractC11224vw.A0D(r302, "relationship", stellaContact.relationship);
        boolean z3 = stellaContact.isE2ee;
        r302.A0o("isE2ee");
        r302.A0v(z3);
        AbstractC11224vw.A0B(r302, stellaContact.msgRank, "msgRank");
        AbstractC11224vw.A0B(r302, stellaContact.callRank, "callRank");
        r302.A0Y();
    }
}
