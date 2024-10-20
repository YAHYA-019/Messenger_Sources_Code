package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: Lv6.class */
public final class Lv6 implements 5Yu {
    public static final Lv6 A00 = new Object();
    public static final SerialDescriptor A01 = new 5ZO("kotlin.Double", M9a.A00);

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        return Double.valueOf(decoder.ALs());
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        double A002 = DKC.A00(obj);
        11T.A0F(encoder, 0);
        encoder.APj(A002);
    }
}
