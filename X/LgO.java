package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

/* loaded from: LgO.class */
public final class LgO implements 5xY {
    public final int A00;
    public final Object A01;

    public LgO(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public TypeAdapter create(Gson gson, TypeToken typeToken) {
        int i = this.A00;
        Class cls = typeToken.rawType;
        if (i == 0) {
            if (cls == Number.class) {
                return (TypeAdapter) this.A01;
            }
            return null;
        }
        KDn kDn = null;
        if (cls == Object.class) {
            kDn = new KDn(gson, (MGc) this.A01);
        }
        return kDn;
    }
}
