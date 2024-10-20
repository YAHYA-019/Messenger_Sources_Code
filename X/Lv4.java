package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: Lv4.class */
public final class Lv4 implements 5Yu {
    public static final Lv4 A00 = new Object();
    public static final SerialDescriptor A01 = new 5ZO("kotlin.Byte", M9Y.A00);

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        return Byte.valueOf(decoder.ALo());
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        byte byteValue = ((Number) obj).byteValue();
        11T.A0F(encoder, 0);
        encoder.APh(byteValue);
    }
}
