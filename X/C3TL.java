package X;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* renamed from: X.3TL, reason: invalid class name */
/* loaded from: 3TL.class */
public final class C3TL {
    public static ParameterizedType A00(Type type) {
        if (type instanceof ParameterizedType) {
            return (ParameterizedType) type;
        }
        if (!(type instanceof WildcardType)) {
            return null;
        }
        WildcardType wildcardType = (WildcardType) type;
        if (wildcardType.getLowerBounds().length != 0) {
            return null;
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length == 1) {
            return A00(upperBounds[0]);
        }
        return null;
    }

    public static TypeVariable A01(Type type) {
        if (type instanceof TypeVariable) {
            return (TypeVariable) type;
        }
        if (!(type instanceof WildcardType)) {
            return null;
        }
        WildcardType wildcardType = (WildcardType) type;
        if (wildcardType.getLowerBounds().length != 0) {
            return null;
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length == 1) {
            return A01(upperBounds[0]);
        }
        return null;
    }

    public static boolean A02(24S r301, C24s c24s, Type type) {
        boolean z = false;
        if (r301.A0T(c24s.Ci9(type)._class)) {
            ParameterizedType A00 = A00(type);
            if (A00 != null && 2Go.A00(r301._class, A00.getRawType())) {
                Type[] actualTypeArguments = A00.getActualTypeArguments();
                24W A0I = r301.A0I();
                if (A0I._types.length == actualTypeArguments.length) {
                    int i = 0;
                    while (true) {
                        24S[] r0 = A0I._types;
                        int length = r0.length;
                        if (i >= length) {
                            break;
                        }
                        if (!A02((i < 0 || i >= length) ? null : r0[i], c24s, actualTypeArguments[i])) {
                            break;
                        }
                        i++;
                    }
                }
            }
            z = true;
        }
        return z;
    }
}
