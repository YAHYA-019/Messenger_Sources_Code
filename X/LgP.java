package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.reflect.TypeToken;

/* loaded from: LgP.class */
public final class LgP implements 5xY {
    public final L2z A00;

    public LgP(L2z l2z) {
        this.A00 = l2z;
    }

    public static TypeAdapter A00(Gson gson, JsonAdapter jsonAdapter, L2z l2z, TypeToken typeToken) {
        TypeAdapter create;
        Object AHa = l2z.A01(new TypeToken(jsonAdapter.value())).AHa();
        boolean nullSafe = jsonAdapter.nullSafe();
        if (AHa instanceof TypeAdapter) {
            create = (TypeAdapter) AHa;
        } else {
            if (!(AHa instanceof 5xY)) {
                boolean z = AHa instanceof MGb;
                if (!z && !(AHa instanceof MGa)) {
                    throw AnonymousClass001.A0L(0Pz.A0z("Invalid attempt to bind an instance of ", AnonymousClass001.A0Y(AHa), " as a @JsonAdapter for ", typeToken.toString(), ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."));
                }
                MGa mGa = null;
                MGb mGb = z ? (MGb) AHa : null;
                if (AHa instanceof MGa) {
                    mGa = (MGa) AHa;
                }
                return new KDx(gson, mGa, mGb, typeToken, nullSafe);
            }
            create = ((5xY) AHa).create(gson, typeToken);
        }
        return (create == null || !nullSafe) ? create : new JRN(create);
    }

    public TypeAdapter create(Gson gson, TypeToken typeToken) {
        JsonAdapter jsonAdapter = (JsonAdapter) typeToken.rawType.getAnnotation(JsonAdapter.class);
        if (jsonAdapter == null) {
            return null;
        }
        return A00(gson, jsonAdapter, this.A00, typeToken);
    }
}
