package com.facebook.payments.logging;

import X.AbstractC01033pi;
import X.C27T;
import com.facebook.common.json.FbJsonDeserializer;

/* loaded from: PaymentsFlowNameDeserializer.class */
public class PaymentsFlowNameDeserializer extends FbJsonDeserializer {
    @Override // com.facebook.common.json.FbJsonDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        return PaymentsFlowName.forValue(abstractC01033pi.A1Z());
    }
}