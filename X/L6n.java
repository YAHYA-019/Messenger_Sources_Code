package X;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* loaded from: L6n.class */
public abstract class L6n {
    public static final Joiner A00;

    static {
        Joiner joiner = new Joiner(", ");
        A00 = new Joiner.AnonymousClass1(joiner, "null");
    }

    public static Type A00(Type type) {
        Type A002;
        Type[] typeArr;
        Type[] typeArr2;
        if (!(type instanceof WildcardType)) {
            return KME.A00.A01(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        int length = lowerBounds.length;
        boolean z = true;
        Preconditions.checkArgument(DKD.A1V(length, 1), "Wildcard cannot have more than one lower bounds.");
        if (length == 1) {
            typeArr = new Type[]{A00(lowerBounds[0])};
            typeArr2 = new Type[1];
            A002 = Object.class;
        } else {
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length != 1) {
                z = false;
            }
            Preconditions.checkArgument(z, "Wildcard should have only one upper bound.");
            A002 = A00(upperBounds[0]);
            typeArr = new Type[0];
            typeArr2 = new Type[1];
        }
        typeArr2[0] = A002;
        return new Lrr(typeArr, typeArr2);
    }

    public static void A01(String str, Type[] typeArr) {
        int length = typeArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            Type type = typeArr[i2];
            if (type instanceof Class) {
                Preconditions.checkArgument(!r0.isPrimitive(), "Primitive type '%s' used as %s", (Class) type, str);
            }
            i = i2 + 1;
        }
    }
}
