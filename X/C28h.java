package X;

import java.lang.reflect.Array;

/* renamed from: X.28h, reason: invalid class name */
/* loaded from: 28h.class */
public final class C28h {
    public Jzq A00 = null;
    public Jzr A01 = null;
    public Jzw A06 = null;
    public Jzu A04 = null;
    public Jzv A05 = null;
    public Jzt A03 = null;
    public Jzs A02 = null;

    public static Object[] A00(Object obj, Object[] objArr) {
        Object[] objArr2;
        int length = objArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), length + 1);
                if (length > 0) {
                    System.arraycopy(objArr, 0, objArr2, 1, length);
                }
                objArr2[0] = obj;
            } else if (objArr[i2] != obj) {
                i = i2 + 1;
            } else {
                if (i2 == 0) {
                    return objArr;
                }
                objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), length);
                System.arraycopy(objArr, 0, objArr2, 1, i2);
                objArr2[0] = obj;
                int i3 = i2 + 1;
                int i4 = length - i3;
                if (i4 > 0) {
                    System.arraycopy(objArr, i3, objArr2, i3, i4);
                    return objArr2;
                }
            }
        }
        return objArr2;
    }
}
