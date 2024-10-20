package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: Lv7.class */
public final class Lv7 implements 5Yu {
    public static final Lv7 A00 = new Object();
    public static final SerialDescriptor A01 = new 5ZO("kotlin.Float", M9b.A00);

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        return Float.valueOf(decoder.ALw());
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        float A002 = 7zM.A00(obj);
        11T.A0F(encoder, 0);
        encoder.APm(A002);
    }
}
