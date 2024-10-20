package X;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonWriter;
import java.io.Writer;
import java.util.List;

/* renamed from: X.6f4, reason: invalid class name */
/* loaded from: 6f4.class */
public final class C6f4 extends JsonWriter {
    public JsonElement A00;
    public String A01;
    public final List A02;
    public static final Writer A04 = new KM6();
    public static final JsonPrimitive A03 = new JsonPrimitive("closed");

    public C6f4() {
        super(A04);
        this.A02 = AnonymousClass001.A0s();
        this.A00 = C6f0.A00;
    }

    public static void A00(JsonElement jsonElement, C6f4 c6f4) {
        if (c6f4.A01 != null) {
            if (!(jsonElement instanceof C6f0) || c6f4.A03) {
                List list = c6f4.A02;
                ((JsonObject) ((JsonElement) list.get(AnonymousClass001.A04(list)))).add(c6f4.A01, jsonElement);
            }
            c6f4.A01 = null;
            return;
        }
        List list2 = c6f4.A02;
        if (list2.isEmpty()) {
            c6f4.A00 = jsonElement;
            return;
        }
        JsonElement jsonElement2 = (JsonElement) list2.get(AnonymousClass001.A04(list2));
        if (!(jsonElement2 instanceof JsonArray)) {
            throw new IllegalStateException();
        }
        ((JsonArray) jsonElement2).add(jsonElement);
    }
}
