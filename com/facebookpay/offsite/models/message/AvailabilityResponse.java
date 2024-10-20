package com.facebookpay.offsite.models.message;

import X.C3o5;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: AvailabilityResponse.class */
public final class AvailabilityResponse {
    public final AvailableMessageContent content;
    public final PaymentError error;
    public final String messageType;
    public final String msgId;
    public final String sourceMessageId;
    public final long timeStamp;

    public AvailabilityResponse(String str, AvailableMessageContent availableMessageContent, long j, String str2, String str3, PaymentError paymentError) {
        C3o5.A0k(str, 1, str3);
        this.msgId = str;
        this.content = availableMessageContent;
        this.timeStamp = j;
        this.sourceMessageId = str2;
        this.messageType = str3;
        this.error = paymentError;
    }

    public /* synthetic */ AvailabilityResponse(String str, AvailableMessageContent availableMessageContent, long j, String str2, String str3, PaymentError paymentError, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, availableMessageContent, j, str2, (i & 16) != 0 ? MessageType$Companion.AVAILABLE_RESPONSE : str3, (i & 32) != 0 ? null : paymentError);
    }

    public final AvailableMessageContent getContent() {
        return this.content;
    }

    public final PaymentError getError() {
        return this.error;
    }

    public final String getMessageType() {
        return this.messageType;
    }

    public final String getMsgId() {
        return this.msgId;
    }

    public final String getSourceMessageId() {
        return this.sourceMessageId;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }
}
