package X;

import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: Kwn.class */
public abstract class Kwn {
    public static final 5Z8 A00(Decoder decoder) {
        5Z8 r0;
        if ((decoder instanceof 5Z8) && (r0 = (5Z8) decoder) != null) {
            return r0;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        throw AnonymousClass002.A0E(JR1.A17(decoder, "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ", A0k), A0k);
    }

    public static final void A01(Encoder encoder) {
        if (!(encoder instanceof 5ZZ) || encoder == null) {
            StringBuilder A0k = AnonymousClass001.A0k();
            throw AnonymousClass002.A0E(JR1.A17(encoder, "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ", A0k), A0k);
        }
    }
}
