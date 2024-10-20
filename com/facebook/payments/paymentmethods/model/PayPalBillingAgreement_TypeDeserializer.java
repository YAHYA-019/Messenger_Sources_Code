package com.facebook.payments.paymentmethods.model;

import X.AbstractC01033pi;
import X.C27T;
import com.facebook.common.json.FbJsonDeserializer;
import com.facebook.payments.paymentmethods.model.PayPalBillingAgreement;

/* loaded from: PayPalBillingAgreement_TypeDeserializer.class */
public class PayPalBillingAgreement_TypeDeserializer extends FbJsonDeserializer {
    @Override // com.facebook.common.json.FbJsonDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        return PayPalBillingAgreement.Type.forValue(abstractC01033pi.A1Z());
    }
}
