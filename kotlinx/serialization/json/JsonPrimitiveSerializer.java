package kotlinx.serialization.json;

import X.11T;
import X.5Yu;
import X.5ZM;
import X.AnonymousClass001;
import X.C7uj;
import X.JR1;
import X.Kwm;
import X.Kwn;
import X.LuL;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: JsonPrimitiveSerializer.class */
public final class JsonPrimitiveSerializer implements 5Yu {
    public static final JsonPrimitiveSerializer A01 = new Object();
    public static final SerialDescriptor A00 = Kwm.A00("kotlinx.serialization.json.JsonPrimitive", new LuL(0), 5ZM.A00, new SerialDescriptor[0]);

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        JsonElement AM5 = Kwn.A00(decoder).AM5();
        if (AM5 instanceof JsonPrimitive) {
            return AM5;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        throw C7uj.A01(AM5.toString(), AnonymousClass001.A0a(JR1.A17(AM5, "Unexpected JSON element, expected JsonPrimitive, had ", A0k), A0k), -1);
    }

    public SerialDescriptor getDescriptor() {
        return A00;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        11T.A0H(encoder, obj);
        Kwn.A01(encoder);
        if (!(obj instanceof JsonNull)) {
            encoder.APx(obj, JsonLiteralSerializer.A01);
        } else {
            encoder.APx(JsonNull.A00, JsonNullSerializer.A01);
        }
    }
}
