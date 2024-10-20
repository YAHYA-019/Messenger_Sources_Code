package com.shopify.checkout.models;

import X.0Pz;
import X.11T;
import X.5Yu;
import X.5ZM;
import X.JR1;
import X.Kwm;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: DeliveryMethodSerializer.class */
public final class DeliveryMethodSerializer implements 5Yu {
    public static final DeliveryMethodSerializer A00 = new Object();
    public static final SerialDescriptor A01 = Kwm.A01("DeliveryMethod", 5ZM.A00);

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        String A0y = JR1.A0y(decoder);
        DeliveryMethod[] values = DeliveryMethod.values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                throw 0Pz.A05("Unknown DeliveryMethod value: ", A0y);
            }
            DeliveryMethod deliveryMethod = values[i2];
            if (11T.A0O(deliveryMethod.value, A0y)) {
                return deliveryMethod;
            }
            i = i2 + 1;
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        DeliveryMethod deliveryMethod = (DeliveryMethod) obj;
        11T.A0H(encoder, deliveryMethod);
        encoder.APz(deliveryMethod.value);
    }
}
