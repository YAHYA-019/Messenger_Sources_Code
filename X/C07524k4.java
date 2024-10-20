package X;

import android.util.JsonReader;
import android.util.JsonToken;

/* renamed from: X.4k4, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4k4.class */
public final class C07524k4 {
    public static final C07524k4 A00 = new Object();

    private final void A00(JsonReader jsonReader, 0CP r303, String str) {
        Object valueOf;
        while (jsonReader.hasNext()) {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NUMBER) {
                valueOf = Double.valueOf(jsonReader.nextDouble());
            } else if (peek == JsonToken.STRING) {
                valueOf = jsonReader.nextString();
            } else if (peek == JsonToken.BOOLEAN) {
                valueOf = Boolean.valueOf(jsonReader.nextBoolean());
            } else if (peek == JsonToken.BEGIN_OBJECT) {
                jsonReader.beginObject();
                A01(jsonReader, r303.A0D(), this, str);
            } else if (peek == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                A00(jsonReader, r303.A0C(), str);
            } else {
                jsonReader.skipValue();
                0fH.A0U(C07524k4.class, "Ignoring extra array field in %s, unsupported type %s", new Object[]{str, peek.name()});
            }
            0CP.A00(r303, valueOf);
        }
        jsonReader.endArray();
    }

    public static final void A01(JsonReader jsonReader, 07S r302, C07524k4 c07524k4, String str) {
        Object valueOf;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NUMBER) {
                valueOf = Double.valueOf(jsonReader.nextDouble());
            } else if (peek == JsonToken.STRING) {
                valueOf = jsonReader.nextString();
            } else if (peek == JsonToken.BOOLEAN) {
                valueOf = Boolean.valueOf(jsonReader.nextBoolean());
            } else if (peek == JsonToken.BEGIN_OBJECT) {
                jsonReader.beginObject();
                11T.A0D(nextName);
                A01(jsonReader, r302.A0D(nextName), c07524k4, nextName);
            } else if (peek == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                11T.A0D(nextName);
                c07524k4.A00(jsonReader, r302.A0C(nextName), nextName);
            } else {
                jsonReader.skipValue();
                0fH.A04(C07524k4.class, nextName, str, peek.name(), "Ignoring extra field %s on %s, unsupported type %s");
            }
            07S.A00(r302, valueOf, nextName);
        }
        jsonReader.endObject();
    }
}
