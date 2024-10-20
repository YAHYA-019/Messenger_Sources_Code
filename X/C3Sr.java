package X;

import java.lang.reflect.Field;
import java.util.EnumMap;
import java.util.EnumSet;

/* renamed from: X.3Sr, reason: invalid class name */
/* loaded from: 3Sr.class */
public final class C3Sr {
    public static final C3Sr A04 = new C3Sr();
    public final String A00;
    public final String A01;
    public final Field A02;
    public final Field A03;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Class] */
    public C3Sr() {
        String obj;
        Field field;
        String obj2;
        Field field2 = null;
        Object obj3 = EnumSet.class;
        try {
            obj3 = A00(obj3, "elementType");
            field = obj3;
            obj = null;
        } catch (Exception unused) {
            obj = obj3.toString();
            field = null;
        }
        this.A03 = field;
        this.A01 = obj;
        Object obj4 = EnumMap.class;
        try {
            obj4 = A00(obj4, "keyType");
            obj2 = null;
            field2 = obj4;
        } catch (Exception unused2) {
            obj2 = obj4.toString();
        }
        this.A02 = field2;
        this.A00 = obj2;
    }

    public static Field A00(Class cls, String str) {
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                throw AnonymousClass001.A0N(String.format("No field named '%s' in class '%s'", str, cls.getName()));
            }
            Field field = declaredFields[i2];
            if (str.equals(field.getName()) && field.getType() == Class.class) {
                field.setAccessible(true);
                return field;
            }
            i = i2 + 1;
        }
    }
}
