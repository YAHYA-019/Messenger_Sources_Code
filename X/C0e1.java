package X;

/* renamed from: X.0e1, reason: invalid class name */
/* loaded from: 0e1.class */
public abstract class C0e1 {
    public static Enum A00(Class cls, String str) {
        Enum r305;
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        if (enumArr != null) {
            int length = enumArr.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    break;
                }
                r305 = enumArr[i2];
                if (r305.name().equalsIgnoreCase(str)) {
                    break;
                }
                i = i2 + 1;
            }
            return r305;
        }
        r305 = null;
        return r305;
    }
}
