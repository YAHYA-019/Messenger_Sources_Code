package com.facebookpay.offsite.models.message;

import java.util.List;

/* loaded from: PaymentDetailsUpdate.class */
public final class PaymentDetailsUpdate {
    public final List errors;
    public final PaymentDetailsUpdatedError offerCodeErrors;
    public final PaymentDetails paymentDetails;
    public final PaymentDetailsUpdatedError shippingAddressErrors;

    public PaymentDetailsUpdate(PaymentDetailsUpdatedError paymentDetailsUpdatedError, PaymentDetailsUpdatedError paymentDetailsUpdatedError2, PaymentDetails paymentDetails, List list) {
        this.shippingAddressErrors = paymentDetailsUpdatedError;
        this.offerCodeErrors = paymentDetailsUpdatedError2;
        this.paymentDetails = paymentDetails;
        this.errors = list;
    }

    public static /* synthetic */ PaymentDetailsUpdate createCopy$default(PaymentDetailsUpdate paymentDetailsUpdate, PaymentDetailsUpdatedError paymentDetailsUpdatedError, PaymentDetailsUpdatedError paymentDetailsUpdatedError2, PaymentDetails paymentDetails, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentDetailsUpdatedError = paymentDetailsUpdate.shippingAddressErrors;
        }
        if ((i & 2) != 0) {
            paymentDetailsUpdatedError2 = paymentDetailsUpdate.offerCodeErrors;
        }
        if ((i & 4) != 0) {
            paymentDetails = paymentDetailsUpdate.paymentDetails;
        }
        if ((i & 8) != 0) {
            list = paymentDetailsUpdate.errors;
        }
        return new PaymentDetailsUpdate(paymentDetailsUpdatedError, paymentDetailsUpdatedError2, paymentDetails, list);
    }

    public final PaymentDetailsUpdate createCopy(PaymentDetailsUpdatedError paymentDetailsUpdatedError, PaymentDetailsUpdatedError paymentDetailsUpdatedError2, PaymentDetails paymentDetails, List list) {
        return new PaymentDetailsUpdate(paymentDetailsUpdatedError, paymentDetailsUpdatedError2, paymentDetails, list);
    }

    public final List getErrors() {
        return this.errors;
    }

    public final PaymentDetailsUpdatedError getOfferCodeErrors() {
        return this.offerCodeErrors;
    }

    public final PaymentDetails getPaymentDetails() {
        return this.paymentDetails;
    }

    public final PaymentDetailsUpdatedError getShippingAddressErrors() {
        return this.shippingAddressErrors;
    }
}
