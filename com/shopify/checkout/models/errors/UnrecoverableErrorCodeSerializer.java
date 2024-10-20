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

/* loaded from: UnrecoverableErrorCodeSerializer.class */
public final class UnrecoverableErrorCodeSerializer implements 5Yu {
    public static final UnrecoverableErrorCodeSerializer A00 = new Object();
    public static final SerialDescriptor A01 = Kwm.A01("UnrecoverablesErrorCode", 5ZM.A00);

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        String A0y = JR1.A0y(decoder);
        UnrecoverableErrorCode[] values = UnrecoverableErrorCode.values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                throw 0Pz.A05("Unknown UnrecoverableErrorCode value: ", A0y);
            }
            UnrecoverableErrorCode unrecoverableErrorCode = values[i2];
            if (11T.A0O(unrecoverableErrorCode.value, A0y)) {
                return unrecoverableErrorCode;
            }
            i = i2 + 1;
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        UnrecoverableErrorCode unrecoverableErrorCode = (UnrecoverableErrorCode) obj;
        11T.A0H(encoder, unrecoverableErrorCode);
        encoder.APz(unrecoverableErrorCode.value);
    }
}
