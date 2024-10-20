package X;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.EnumSet;

/* loaded from: LgU.class */
public final class LgU implements MGd {
    public final int A00;
    public final Object A01;

    public LgU(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.MGd
    public Object AHa() {
        switch (this.A00) {
            case 0:
                Type type = (Type) this.A01;
                if (!(type instanceof ParameterizedType)) {
                    throw new RuntimeException(0Pz.A0V("Invalid EnumSet type: ", type));
                }
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new RuntimeException(0Pz.A0V("Invalid EnumSet type: ", type));
            case 1:
                Type type3 = (Type) this.A01;
                if (!(type3 instanceof ParameterizedType)) {
                    throw new RuntimeException(0Pz.A0V("Invalid EnumMap type: ", type3));
                }
                Type type4 = ((ParameterizedType) type3).getActualTypeArguments()[0];
                if (type4 instanceof Class) {
                    return new EnumMap((Class) type4);
                }
                throw new RuntimeException(0Pz.A0V("Invalid EnumMap type: ", type3));
            default:
                try {
                    return ((Constructor) this.A01).newInstance(AnonymousClass001.A1Z());
                } catch (IllegalAccessException e) {
                    KRw kRw = LBs.A00;
                    throw 1BK.A0s("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
                } catch (InstantiationException e2) {
                    throw 1BK.A0s(0Pz.A0j("Failed to invoke constructor '", LBs.A01((Constructor) this.A01), "' with no args"), e2);
                } catch (InvocationTargetException e3) {
                    throw 1BK.A0s(0Pz.A0j("Failed to invoke constructor '", LBs.A01((Constructor) this.A01), "' with no args"), e3.getCause());
                }
        }
    }
}
