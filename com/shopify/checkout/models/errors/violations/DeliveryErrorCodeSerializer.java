package com.shopify.checkout.models.errors.violations;

import X.0Pz;
import X.11T;
import X.5Yu;
import X.5ZM;
import X.JR1;
import X.Kwm;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: DeliveryErrorCodeSerializer.class */
public final class DeliveryErrorCodeSerializer implements 5Yu {
    public static final DeliveryErrorCodeSerializer A00 = new Object();
    public static final SerialDescriptor A01 = Kwm.A01("DeliveryErrorCode", 5ZM.A00);

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        String A0y = JR1.A0y(decoder);
        DeliveryErrorCode[] values = DeliveryErrorCode.values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                throw 0Pz.A05("Unknown DeliveryErrorCode value: ", A0y);
            }
            DeliveryErrorCode deliveryErrorCode = values[i2];
            if (11T.A0O(deliveryErrorCode.value, A0y)) {
                return deliveryErrorCode;
            }
            i = i2 + 1;
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        DeliveryErrorCode deliveryErrorCode = (DeliveryErrorCode) obj;
        11T.A0H(encoder, deliveryErrorCode);
        encoder.APz(deliveryErrorCode.value);
    }
}
