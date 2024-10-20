package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: Lv5.class */
public final class Lv5 implements 5Yu {
    public static final Lv5 A00 = new Object();
    public static final SerialDescriptor A01 = new 5ZO("kotlin.Char", M9Z.A00);

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        return Character.valueOf(decoder.ALq());
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        char charValue = ((Character) obj).charValue();
        11T.A0F(encoder, 0);
        encoder.APi(charValue);
    }
}
