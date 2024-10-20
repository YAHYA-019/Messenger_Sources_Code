package com.facebookpay.offsite.models.message;

import X.1BL;

/* loaded from: BaseMessage.class */
public final class BaseMessage {
    public final String messageType;
    public final String msgId;

    public BaseMessage(String str, String str2) {
        1BL.A1F(str, str2);
        this.msgId = str;
        this.messageType = str2;
    }

    public final String getMessageType() {
        return this.messageType;
    }

    public final String getMsgId() {
        return this.msgId;
    }
}
