package com.facebook.assistant.stella.ipc.common.model;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: InboxMessageAttachmentSerializer.class */
public class InboxMessageAttachmentSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), InboxMessageAttachment.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        InboxMessageAttachment inboxMessageAttachment = (InboxMessageAttachment) obj;
        if (inboxMessageAttachment == null) {
            r302.A0Z();
        }
        r302.A0b();
        int i = inboxMessageAttachment.type;
        r302.A0o(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        r302.A0f(i);
        AbstractC11224vw.A0D(r302, TraceFieldType.Uri, inboxMessageAttachment.uri);
        AbstractC11224vw.A0D(r302, "attachmentId", inboxMessageAttachment.attachmentId);
        AbstractC11224vw.A0D(r302, "mimeType", inboxMessageAttachment.mimeType);
        AbstractC11224vw.A0D(r302, "mediaKey", inboxMessageAttachment.mediaKey);
        AbstractC11224vw.A0D(r302, "encHash", inboxMessageAttachment.encHash);
        AbstractC11224vw.A0D(r302, "decHash", inboxMessageAttachment.decHash);
        r302.A0Y();
    }
}
