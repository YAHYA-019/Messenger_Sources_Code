package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Properties;

/* loaded from: LgN.class */
public final class LgN implements 5xY {
    public final L2z A00;

    public LgN(L2z l2z) {
        this.A00 = l2z;
    }

    public TypeAdapter create(Gson gson, TypeToken typeToken) {
        Type[] typeArr;
        Type type;
        Type type2 = typeToken.type;
        Class cls = typeToken.rawType;
        if (!java.util.Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (type2 == Properties.class) {
            typeArr = new Type[2];
            type = String.class;
        } else {
            if (type2 instanceof WildcardType) {
                type2 = ((WildcardType) type2).getUpperBounds()[0];
            }
            if (!java.util.Map.class.isAssignableFrom(cls)) {
                throw JQx.A0n();
            }
            Type A03 = LDK.A03(cls, type2, LDK.A02(cls, java.util.Map.class, type2), AnonymousClass001.A0u());
            if (A03 instanceof ParameterizedType) {
                typeArr = ((ParameterizedType) A03).getActualTypeArguments();
                Type type3 = typeArr[0];
                return new KDg(gson, (type3 != Boolean.TYPE || type3 == Boolean.class) ? 5xZ.A07 : JQx.A0k(gson, type3), JQx.A0k(gson, typeArr[1]), this.A00.A01(typeToken), this, typeArr[0], typeArr[1]);
            }
            typeArr = new Type[2];
            type = Object.class;
        }
        typeArr[0] = type;
        typeArr[1] = type;
        Type type32 = typeArr[0];
        return new KDg(gson, (type32 != Boolean.TYPE || type32 == Boolean.class) ? 5xZ.A07 : JQx.A0k(gson, type32), JQx.A0k(gson, typeArr[1]), this.A00.A01(typeToken), this, typeArr[0], typeArr[1]);
    }
}
