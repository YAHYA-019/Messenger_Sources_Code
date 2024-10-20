package kotlinx.serialization.json;

import X.11T;
import X.1BK;
import X.5Yu;
import X.5Yv;
import X.Kwm;
import X.Kwn;
import X.LuL;
import X.M9W;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: JsonElementSerializer.class */
public final class JsonElementSerializer implements 5Yu {
    public static final JsonElementSerializer A00 = new Object();
    public static final SerialDescriptor A01 = Kwm.A00("kotlinx.serialization.json.JsonElement", new LuL(1), M9W.A00, new SerialDescriptor[0]);

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        return Kwn.A00(decoder).AM5();
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        5Yv r305;
        11T.A0H(encoder, obj);
        Kwn.A01(encoder);
        if (obj instanceof JsonPrimitive) {
            r305 = JsonPrimitiveSerializer.A01;
        } else if (obj instanceof JsonObject) {
            r305 = JsonObjectSerializer.A01;
        } else {
            if (!(obj instanceof JsonArray)) {
                throw 1BK.A1F();
            }
            r305 = JsonArraySerializer.A01;
        }
        encoder.APx(obj, r305);
    }
}
