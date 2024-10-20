package X;

import java.lang.reflect.Field;

/* loaded from: L6w.class */
public final class L6w {
    public static final LiY A00;
    public static final Field[] A01;

    static {
        LiY liY = new LiY();
        A00 = liY;
        A01 = new Field[]{LiY.A00(liY, liY.lowerEndpoint), LiY.A00(liY, liY.upperEndpoint), LiY.A00(liY, liY.lowerBoundType), LiY.A00(liY, liY.upperBoundType)};
    }

    public static LiY A00(C00913pS c00913pS, AnonymousClass253 anonymousClass253) {
        if (c00913pS == null) {
            return A00;
        }
        new La1(anonymousClass253._base._typeFactory);
        Field[] fieldArr = A01;
        return new LiY(fieldArr[0].getName(), fieldArr[1].getName(), fieldArr[2].getName(), fieldArr[3].getName());
    }
}
