package X;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* loaded from: MAO.class */
public final class MAO extends MAP {
    public int A00;
    public final int A01;
    public final List A02;
    public final JsonObject A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAO(5Yj r302, JsonObject jsonObject) {
        super((String) null, (SerialDescriptor) null, r302, jsonObject);
        11T.A0F(jsonObject, 2);
        this.A03 = jsonObject;
        List A0V = 0QD.A0V(jsonObject.keySet());
        this.A02 = A0V;
        this.A01 = A0V.size() * 2;
        this.A00 = -1;
    }
}
