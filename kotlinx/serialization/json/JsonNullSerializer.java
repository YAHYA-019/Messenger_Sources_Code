package kotlinx.serialization.json;

import X.11T;
import X.5Yu;
import X.Kwm;
import X.Kwn;
import X.LuL;
import X.M9e;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: JsonNullSerializer.class */
public final class JsonNullSerializer implements 5Yu {
    public static final JsonNullSerializer A01 = new Object();
    public static final SerialDescriptor A00 = Kwm.A00("kotlinx.serialization.json.JsonNull", new LuL(0), M9e.A00, new SerialDescriptor[0]);

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        Kwn.A00(decoder);
        if (decoder.AM8()) {
            throw new IllegalArgumentException("Expected 'null' literal");
        }
        return JsonNull.A00;
    }

    public SerialDescriptor getDescriptor() {
        return A00;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        11T.A0F(encoder, 0);
        Kwn.A01(encoder);
        encoder.APu();
    }
}
