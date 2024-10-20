package com.facebookpay.offsite.models.message;

import X.1BL;

/* loaded from: StartCheckoutRequest.class */
public final class StartCheckoutRequest {
    public final StartCheckoutContent content;
    public final String messageType;
    public final String msgId;

    public StartCheckoutRequest(String str, String str2, StartCheckoutContent startCheckoutContent) {
        1BL.A1H(str, str2, startCheckoutContent);
        this.msgId = str;
        this.messageType = str2;
        this.content = startCheckoutContent;
    }

    public final StartCheckoutContent getContent() {
        return this.content;
    }

    public final String getMessageType() {
        return this.messageType;
    }

    public final String getMsgId() {
        return this.msgId;
    }
}
