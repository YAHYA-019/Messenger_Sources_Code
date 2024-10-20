package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* loaded from: MAM.class */
public final class MAM extends M9p {
    public final JsonElement A00;

    public MAM(String str, 5Yj r303, JsonElement jsonElement) {
        super(str, r303, jsonElement);
        this.A00 = jsonElement;
        ((LvU) this).A01.add("primitive");
    }

    public int ALu(SerialDescriptor serialDescriptor) {
        return 0;
    }
}
