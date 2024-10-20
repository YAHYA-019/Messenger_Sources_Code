package com.shopify.checkout.models.errors;

import X.0Pz;
import X.11T;
import X.5Yu;
import X.5ZM;
import X.JR1;
import X.Kwm;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: CheckoutErrorTypeSerializer.class */
public final class CheckoutErrorTypeSerializer implements 5Yu {
    public static final CheckoutErrorTypeSerializer A00 = new Object();
    public static final SerialDescriptor A01 = Kwm.A01("CheckoutErrorType", 5ZM.A00);

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        String A0y = JR1.A0y(decoder);
        CheckoutErrorType[] values = CheckoutErrorType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                throw 0Pz.A05("Unknown CheckoutErrorType value: ", A0y);
            }
            CheckoutErrorType checkoutErrorType = values[i2];
            if (11T.A0O(checkoutErrorType.value, A0y)) {
                return checkoutErrorType;
            }
            i = i2 + 1;
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        CheckoutErrorType checkoutErrorType = (CheckoutErrorType) obj;
        11T.A0H(encoder, checkoutErrorType);
        encoder.APz(checkoutErrorType.value);
    }
}
