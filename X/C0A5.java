package X;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.0A5, reason: invalid class name */
/* loaded from: 0A5.class */
public abstract class C0A5 {
    public static final Object[] A00 = new Object[0];

    public static final Object[] A00(Collection collection) {
        Object[] objArr;
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                objArr = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i;
                    int i3 = i2 + 1;
                    objArr[i2] = it.next();
                    int length = objArr.length;
                    boolean hasNext = it.hasNext();
                    if (i3 >= length) {
                        if (!hasNext) {
                            break;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                            i4 = 2147483645;
                        }
                        objArr = Arrays.copyOf(objArr, i4);
                        11T.A0A(objArr);
                    } else if (!hasNext) {
                        Object[] copyOf = Arrays.copyOf(objArr, i3);
                        11T.A0A(copyOf);
                        return copyOf;
                    }
                    i = i3;
                }
            }
        }
        objArr = A00;
        return objArr;
    }

    public static final Object[] A01(Collection collection, Object[] objArr) {
        Object[] objArr2;
        int i = 0;
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    11T.A0I(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    i++;
                    objArr2[i2] = it.next();
                    int length = objArr2.length;
                    boolean hasNext = it.hasNext();
                    if (i >= length) {
                        if (!hasNext) {
                            return objArr2;
                        }
                        int i3 = ((i * 3) + 1) >>> 1;
                        if (i3 <= i) {
                            if (i >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                            i3 = 2147483645;
                        }
                        objArr2 = Arrays.copyOf(objArr2, i3);
                        11T.A0A(objArr2);
                    } else if (!hasNext) {
                        if (objArr2 != objArr) {
                            Object[] copyOf = Arrays.copyOf(objArr2, i);
                            11T.A0A(copyOf);
                            return copyOf;
                        }
                    }
                    i2 = i;
                }
            }
        }
        if (objArr.length <= 0) {
            return objArr;
        }
        objArr[i] = null;
        return objArr;
    }
}
