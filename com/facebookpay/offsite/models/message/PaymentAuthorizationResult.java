package com.facebookpay.offsite.models.message;

import X.11T;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: PaymentAuthorizationResult.class */
public final class PaymentAuthorizationResult {
    public final AuthorizationState authorizationState;
    public final PaymentDataError error;
    public final String orderId;
    public final boolean retryable;

    public PaymentAuthorizationResult(AuthorizationState authorizationState, PaymentDataError paymentDataError, boolean z, String str) {
        11T.A0F(authorizationState, 1);
        this.authorizationState = authorizationState;
        this.error = paymentDataError;
        this.retryable = z;
        this.orderId = str;
    }

    public /* synthetic */ PaymentAuthorizationResult(AuthorizationState authorizationState, PaymentDataError paymentDataError, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(authorizationState, paymentDataError, z, (i & 8) != 0 ? null : str);
    }

    public final AuthorizationState getAuthorizationState() {
        return this.authorizationState;
    }

    public final PaymentDataError getError() {
        return this.error;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final boolean getRetryable() {
        return this.retryable;
    }
}
