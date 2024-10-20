package X;

import java.lang.reflect.Field;

/* renamed from: X.18g, reason: invalid class name */
/* loaded from: 18g.class */
public final class C18g extends 0tU {
    public static Class A01;
    public static boolean A02;
    public static boolean A03;
    public static Field[] A04;
    public static Field[] A05;
    public final Object A00;

    public C18g(Object obj) {
        this.A00 = obj;
    }

    public static Field[] A00(Class cls, Class cls2, String str, int i) {
        Field[] fieldArr = new Field[i];
        int i2 = 0;
        while (i2 <= i) {
            int i3 = i2 + 1;
            String A0T = 0Pz.A0T(str, i3);
            try {
                Field A07 = C0cZ.A07(null, cls, cls2, A0T);
                if (A07 != null) {
                    A07.setAccessible(true);
                }
                fieldArr[i2] = A07;
            } catch (Exception e) {
                0KO r0 = 0Z4.A00;
                if (i3 <= 2) {
                    r0.A0C(e, "Could not find %s class needed field %s (%d of %d) on this platform", new Object[]{cls, A0T, Integer.valueOf(i3), 2});
                    return null;
                }
                r0.A09(e, "Could not find %s class field %s on this platform", new Object[]{cls, A0T});
            }
            i2 = i3;
        }
        return fieldArr;
    }

    public int A01(int i) {
        Field[] fieldArr = A04;
        fieldArr.getClass();
        Field field = fieldArr[i - 1];
        if (field == null) {
            throw new Exception(String.format("Don't know how to access SomeArgs int field for %s%d.", AnonymousClass001.A1b("argi", i)));
        }
        try {
            return field.getInt(this.A00);
        } catch (Exception e) {
            String format = String.format("Cannot access SomeArgs int field for %s%d.", AnonymousClass001.A1b("argi", i));
            0Z4.A00.A03(format, e);
            throw new Exception(format, e);
        }
    }

    public Object A02(int i) {
        Field[] fieldArr = A05;
        fieldArr.getClass();
        Field field = fieldArr[0];
        if (field == null) {
            throw new Exception(String.format("Don't know how to access SomeArgs obj field for %s%d.", AnonymousClass001.A1b("arg", 1)));
        }
        try {
            return field.get(this.A00);
        } catch (Exception e) {
            String format = String.format("Cannot access SomeArgs obj field for %s%d.", AnonymousClass001.A1b("arg", 1));
            0Z4.A00.A03(format, e);
            throw new Exception(format, e);
        }
    }
}
