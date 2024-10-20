package kotlinx.serialization.json;

import X.11T;
import X.1BK;
import X.1BL;
import X.5Yu;
import X.5ZL;
import X.5ZR;
import X.7zQ;
import X.Kwn;
import X.LvQ;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: JsonObjectSerializer.class */
public final class JsonObjectSerializer implements 5Yu {
    public static final JsonObjectSerializer A01 = new Object();
    public static final SerialDescriptor A00 = LvQ.A01;

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        Kwn.A00(decoder);
        5ZL r0 = 5ZL.A01;
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.A00;
        1BK.A1M(r0, jsonElementSerializer);
        return new JsonObject((Map) new 5ZR(r0, jsonElementSerializer).deserialize(decoder));
    }

    public SerialDescriptor getDescriptor() {
        return A00;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        boolean A1W = 1BL.A1W(encoder, obj);
        Kwn.A01(encoder);
        5ZL r0 = 5ZL.A01;
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.A00;
        7zQ.A1Y(r0, jsonElementSerializer, A1W ? 1 : 0);
        new 5ZR(r0, jsonElementSerializer).serialize(encoder, obj);
    }
}
