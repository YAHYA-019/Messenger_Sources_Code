package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: Lv3.class */
public final class Lv3 implements 5Yu {
    public static final Lv3 A00 = new Object();
    public static final SerialDescriptor A01 = new 5ZO("kotlin.Boolean", M9X.A00);

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        return Boolean.valueOf(decoder.ALm());
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        boolean A1V = AnonymousClass001.A1V(obj);
        11T.A0F(encoder, 0);
        encoder.APf(A1V);
    }
}
