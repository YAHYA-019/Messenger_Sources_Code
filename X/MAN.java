package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;

/* loaded from: MAN.class */
public final class MAN extends M9p {
    public int A00;
    public final JsonArray A01;
    public final int A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAN(5Yj r302, JsonArray jsonArray) {
        super(null, r302, jsonArray);
        11T.A0F(jsonArray, 2);
        this.A01 = jsonArray;
        this.A02 = jsonArray.size();
        this.A00 = -1;
    }

    public int ALu(SerialDescriptor serialDescriptor) {
        int i = this.A00;
        int i2 = -1;
        if (i < this.A02 - 1) {
            i2 = i + 1;
            this.A00 = i2;
        }
        return i2;
    }
}
