package X;

import java.util.Arrays;

/* renamed from: X.0ru, reason: invalid class name */
/* loaded from: 0ru.class */
public abstract class C0ru extends C13o {
    public static final boolean A0F(Object[] objArr, Object[] objArr2) {
        int length;
        if (objArr != objArr2) {
            if (objArr != null && objArr2 != null && (length = objArr.length) == objArr2.length) {
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= length) {
                        break;
                    }
                    Object obj = objArr[i2];
                    Object obj2 = objArr2[i2];
                    if (obj != obj2) {
                        if (obj == null || obj2 == null) {
                            return false;
                        }
                        if (!(((obj instanceof Object[]) && (obj2 instanceof Object[])) ? A0F((Object[]) obj, (Object[]) obj2) : ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : ((obj instanceof short[]) && (obj2 instanceof short[])) ? Arrays.equals((short[]) obj, (short[]) obj2) : ((obj instanceof int[]) && (obj2 instanceof int[])) ? Arrays.equals((int[]) obj, (int[]) obj2) : ((obj instanceof long[]) && (obj2 instanceof long[])) ? Arrays.equals((long[]) obj, (long[]) obj2) : ((obj instanceof float[]) && (obj2 instanceof float[])) ? Arrays.equals((float[]) obj, (float[]) obj2) : ((obj instanceof double[]) && (obj2 instanceof double[])) ? Arrays.equals((double[]) obj, (double[]) obj2) : ((obj instanceof char[]) && (obj2 instanceof char[])) ? Arrays.equals((char[]) obj, (char[]) obj2) : ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) ? Arrays.equals((boolean[]) obj, (boolean[]) obj2) : ((obj instanceof C0rg) && (obj2 instanceof C0rg)) ? Arrays.equals(((C0rg) obj).A00, ((C0rg) obj2).A00) : ((obj instanceof C0rn) && (obj2 instanceof C0rn)) ? Arrays.equals(((C0rn) obj).A00, ((C0rn) obj2).A00) : ((obj instanceof C0ri) && (obj2 instanceof C0ri)) ? Arrays.equals(((C0ri) obj).A00, ((C0ri) obj2).A00) : ((obj instanceof C0rl) && (obj2 instanceof C0rl)) ? Arrays.equals(((C0rl) obj).A00, ((C0rl) obj2).A00) : obj.equals(obj2))) {
                            return false;
                        }
                    }
                    i = i2 + 1;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
