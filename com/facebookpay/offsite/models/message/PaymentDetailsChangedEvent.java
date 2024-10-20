package com.facebookpay.offsite.models.message;

import X.11T;
import X.1BL;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: PaymentDetailsChangedEvent.class */
public final class PaymentDetailsChangedEvent {
    public final PaymentDetailsChangedContent content;
    public final PaymentError error;
    public final String messageType;
    public final String msgId;
    public final String sourceMessageId;
    public final long timeStamp;

    public PaymentDetailsChangedEvent(String str, PaymentDetailsChangedContent paymentDetailsChangedContent, long j, String str2, String str3, PaymentError paymentError) {
        1BL.A1F(str, paymentDetailsChangedContent);
        11T.A0F(str3, 5);
        this.msgId = str;
        this.content = paymentDetailsChangedContent;
        this.timeStamp = j;
        this.sourceMessageId = str2;
        this.messageType = str3;
        this.error = paymentError;
    }

    public /* synthetic */ PaymentDetailsChangedEvent(String str, PaymentDetailsChangedContent paymentDetailsChangedContent, long j, String str2, String str3, PaymentError paymentError, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, paymentDetailsChangedContent, j, str2, (i & 16) != 0 ? MessageType$Companion.PAYMENT_DETAILS_CHANGED : str3, (i & 32) != 0 ? null : paymentError);
    }

    public final PaymentDetailsChangedContent getContent() {
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
