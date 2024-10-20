package com.facebookpay.offsite.models.message;

import X.1BK;
import X.C3o5;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: PaymentDetailsUpdatedResponse.class */
public final class PaymentDetailsUpdatedResponse {
    public final PaymentDetailsUpdate content;
    public final PaymentError error;
    public final String messageType;
    public final String msgId;
    public final String sourceMessageId;
    public final long timeStamp;

    public PaymentDetailsUpdatedResponse(String str, PaymentDetailsUpdate paymentDetailsUpdate, long j, String str2, String str3, PaymentError paymentError) {
        C3o5.A0k(str, 1, str3);
        this.msgId = str;
        this.content = paymentDetailsUpdate;
        this.timeStamp = j;
        this.sourceMessageId = str2;
        this.messageType = str3;
        this.error = paymentError;
    }

    public /* synthetic */ PaymentDetailsUpdatedResponse(String str, PaymentDetailsUpdate paymentDetailsUpdate, long j, String str2, String str3, PaymentError paymentError, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, paymentDetailsUpdate, j, str2, str3, (i & 32) != 0 ? null : paymentError);
    }

    public static /* synthetic */ PaymentDetailsUpdatedResponse createCopy$default(PaymentDetailsUpdatedResponse paymentDetailsUpdatedResponse, String str, PaymentDetailsUpdate paymentDetailsUpdate, long j, String str2, String str3, PaymentError paymentError, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentDetailsUpdatedResponse.msgId;
        }
        if ((i & 2) != 0) {
            paymentDetailsUpdate = paymentDetailsUpdatedResponse.content;
        }
        if ((i & 4) != 0) {
            j = paymentDetailsUpdatedResponse.timeStamp;
        }
        if ((i & 8) != 0) {
            str2 = paymentDetailsUpdatedResponse.sourceMessageId;
        }
        if ((i & 16) != 0) {
            str3 = paymentDetailsUpdatedResponse.messageType;
        }
        if ((i & 32) != 0) {
            paymentError = paymentDetailsUpdatedResponse.error;
        }
        return paymentDetailsUpdatedResponse.createCopy(str, paymentDetailsUpdate, j, str2, str3, paymentError);
    }

    public final PaymentDetailsUpdatedResponse createCopy(String str, PaymentDetailsUpdate paymentDetailsUpdate, long j, String str2, String str3, PaymentError paymentError) {
        1BK.A1K(str, 0, str3);
        return new PaymentDetailsUpdatedResponse(str, paymentDetailsUpdate, j, str2, str3, paymentError);
    }

    public final PaymentDetailsUpdate getContent() {
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
