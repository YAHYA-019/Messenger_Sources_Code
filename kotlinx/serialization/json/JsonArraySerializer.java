package kotlinx.serialization.json;

import X.11T;
import X.5Yu;
import X.5cI;
import X.Kwn;
import X.LvP;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: JsonArraySerializer.class */
public final class JsonArraySerializer implements 5Yu {
    public static final JsonArraySerializer A01 = new Object();
    public static final SerialDescriptor A00 = LvP.A01;

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        Kwn.A00(decoder);
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.A00;
        11T.A0F(jsonElementSerializer, 0);
        return new JsonArray((List) new 5cI(jsonElementSerializer).deserialize(decoder));
    }

    public SerialDescriptor getDescriptor() {
        return A00;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        11T.A0H(encoder, obj);
        Kwn.A01(encoder);
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.A00;
        11T.A0F(jsonElementSerializer, 0);
        new 5cI(jsonElementSerializer).serialize(encoder, obj);
    }
}
