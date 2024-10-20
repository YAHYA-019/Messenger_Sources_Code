package com.facebookpay.offsite.models.message;

import X.1BL;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: PaymentContainer.class */
public final class PaymentContainer {
    public final String containerData;
    public final String containerId;
    public final PaymentContainerType containerType;
    public final PaymentMode mode;

    public PaymentContainer(String str, PaymentMode paymentMode, String str2, PaymentContainerType paymentContainerType) {
        1BL.A1F(str, paymentMode);
        this.containerId = str;
        this.mode = paymentMode;
        this.containerData = str2;
        this.containerType = paymentContainerType;
    }

    public /* synthetic */ PaymentContainer(String str, PaymentMode paymentMode, String str2, PaymentContainerType paymentContainerType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, paymentMode, str2, (i & 8) != 0 ? null : paymentContainerType);
    }

    public final String getContainerData() {
        return this.containerData;
    }

    public final String getContainerId() {
        return this.containerId;
    }

    public final PaymentContainerType getContainerType() {
        return this.containerType;
    }

    public final PaymentMode getMode() {
        return this.mode;
    }
}
