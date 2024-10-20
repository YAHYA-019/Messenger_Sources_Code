package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: Lv8.class */
public final class Lv8 implements 5Yu {
    public static final Lv8 A00 = new Object();
    public static final SerialDescriptor A01 = new 5ZO("kotlin.Int", M9c.A00);

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        return Integer.valueOf(decoder.AM3());
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int A03 = AnonymousClass001.A03(obj);
        11T.A0F(encoder, 0);
        encoder.APq(A03);
    }
}
