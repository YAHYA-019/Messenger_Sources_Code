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

/* loaded from: ViolationErrorTypeSerializer.class */
public final class ViolationErrorTypeSerializer implements 5Yu {
    public static final ViolationErrorTypeSerializer A00 = new Object();
    public static final SerialDescriptor A01 = Kwm.A01("ViolationErrorType", 5ZM.A00);

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        String A0y = JR1.A0y(decoder);
        ViolationErrorType[] values = ViolationErrorType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                throw 0Pz.A05("Unknown ViolationErrorType value: ", A0y);
            }
            ViolationErrorType violationErrorType = values[i2];
            if (11T.A0O(violationErrorType.value, A0y)) {
                return violationErrorType;
            }
            i = i2 + 1;
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        ViolationErrorType violationErrorType = (ViolationErrorType) obj;
        11T.A0H(encoder, violationErrorType);
        encoder.APz(violationErrorType.value);
    }
}
