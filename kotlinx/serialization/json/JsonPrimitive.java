package kotlinx.serialization.json;

import X.5Yu;

/* loaded from: JsonPrimitive.class */
public abstract class JsonPrimitive extends JsonElement {
    public static final Companion Companion = new Object();

    /* loaded from: JsonPrimitive$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return JsonPrimitiveSerializer.A01;
        }
    }

    public String A00() {
        return this instanceof JsonNull ? "null" : ((JsonLiteral) this).A00;
    }

    public String toString() {
        return A00();
    }
}
