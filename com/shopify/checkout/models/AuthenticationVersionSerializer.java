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

/* loaded from: AuthenticationVersionSerializer.class */
public final class AuthenticationVersionSerializer implements 5Yu {
    public static final AuthenticationVersionSerializer A00 = new Object();
    public static final SerialDescriptor A01 = Kwm.A01("AuthenticationVersion", 5ZM.A00);

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        String A0y = JR1.A0y(decoder);
        AuthenticationVersion[] values = AuthenticationVersion.values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                throw 0Pz.A05("Unknown AuthenticationVersion value: ", A0y);
            }
            AuthenticationVersion authenticationVersion = values[i2];
            if (11T.A0O(authenticationVersion.value, A0y)) {
                return authenticationVersion;
            }
            i = i2 + 1;
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        AuthenticationVersion authenticationVersion = (AuthenticationVersion) obj;
        11T.A0H(encoder, authenticationVersion);
        encoder.APz(authenticationVersion.value);
    }
}
