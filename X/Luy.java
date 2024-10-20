package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: Luy.class */
public final class Luy implements 5Yu {
    public static final Luy A00 = new Object();
    public static final SerialDescriptor A01 = Kwm.A01("VaultedPaymentErrorCode", 5ZM.A00);

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        String A0y = JR1.A0y(decoder);
        KNr[] values = KNr.values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                throw 0Pz.A05("Unknown VaultedPaymentErrorCode value: ", A0y);
            }
            KNr kNr = values[i2];
            if (11T.A0O(kNr.value, A0y)) {
                return kNr;
            }
            i = i2 + 1;
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        KNr kNr = (KNr) obj;
        11T.A0H(encoder, kNr);
        encoder.APz(kNr.value);
    }
}
