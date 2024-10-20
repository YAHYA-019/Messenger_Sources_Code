package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* loaded from: LgM.class */
public final class LgM implements 5xY {
    public final L2z A00;

    public LgM(L2z l2z) {
        this.A00 = l2z;
    }

    public TypeAdapter create(Gson gson, TypeToken typeToken) {
        Type type = typeToken.type;
        Class cls = typeToken.rawType;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        if (!Collection.class.isAssignableFrom(cls)) {
            throw JQx.A0n();
        }
        Type A03 = LDK.A03(cls, type, LDK.A02(cls, Collection.class, type), AnonymousClass001.A0u());
        Class cls2 = A03 instanceof ParameterizedType ? ((ParameterizedType) A03).getActualTypeArguments()[0] : Object.class;
        return new KDb(gson, JQx.A0k(gson, cls2), this.A00.A01(typeToken), cls2);
    }
}
