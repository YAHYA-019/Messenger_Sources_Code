package com.facebookpay.offsite.models.message;

import X.11T;
import X.1BL;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: PaymentResponse.class */
public final class PaymentResponse {
    public final PaymentResponseContent content;
    public final PaymentError error;
    public final String messageType;
    public final String msgId;
    public final String requestId;
    public final String sourceMessageId;
    public final long timeStamp;

    public PaymentResponse(String str, String str2, PaymentResponseContent paymentResponseContent, long j, String str3, String str4, PaymentError paymentError) {
        1BL.A1F(str, str2);
        11T.A0F(str4, 6);
        this.msgId = str;
        this.requestId = str2;
        this.content = paymentResponseContent;
        this.timeStamp = j;
        this.sourceMessageId = str3;
        this.messageType = str4;
        this.error = paymentError;
    }

    public /* synthetic */ PaymentResponse(String str, String str2, PaymentResponseContent paymentResponseContent, long j, String str3, String str4, PaymentError paymentError, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, paymentResponseContent, j, str3, (i & 32) != 0 ? MessageType$Companion.PAYMENT_RESPONSE : str4, (i & 64) != 0 ? null : paymentError);
    }

    public final PaymentResponseContent getContent() {
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

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getSourceMessageId() {
        return this.sourceMessageId;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }
}
