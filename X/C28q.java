package X;

import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.28q, reason: invalid class name */
/* loaded from: 28q.class */
public abstract class C28q {
    public static final boolean A00(SparseArray sparseArray, SparseArray sparseArray2) {
        int size;
        if (sparseArray != sparseArray2) {
            if (sparseArray != null && sparseArray2 != null && (size = sparseArray.size()) == sparseArray2.size()) {
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= size) {
                        break;
                    }
                    if (!11T.A0O(sparseArray.valueAt(i2), sparseArray2.get(sparseArray.keyAt(i2)))) {
                        return false;
                    }
                    i = i2 + 1;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static final boolean A01(1Ip r301, 1Ip r302) {
        if (r301 == r302) {
            return true;
        }
        if (r301 == null || r302 == null) {
            return false;
        }
        return r301.BSF(r302);
    }

    public static final boolean A02(Object obj, Object obj2) {
        int compare;
        boolean z = true;
        if (obj != obj2) {
            int i = 0;
            if (obj == null || obj2 == null) {
                return false;
            }
            Class<?> cls = obj.getClass();
            if (!11T.A0O(cls, obj2.getClass())) {
                return false;
            }
            if (obj instanceof Float) {
                compare = Float.compare(((Number) obj).floatValue(), ((Number) obj2).floatValue());
            } else if (obj instanceof Double) {
                compare = Double.compare(((Number) obj).doubleValue(), ((Number) obj2).doubleValue());
            } else {
                if (obj instanceof 1Ip) {
                    return ((1Ip) obj).BSF(obj2);
                }
                if (cls.isArray()) {
                    if (obj instanceof byte[]) {
                        return Arrays.equals((byte[]) obj, (byte[]) obj2);
                    }
                    if (obj instanceof short[]) {
                        return Arrays.equals((short[]) obj, (short[]) obj2);
                    }
                    if (obj instanceof char[]) {
                        return Arrays.equals((char[]) obj, (char[]) obj2);
                    }
                    if (obj instanceof int[]) {
                        return Arrays.equals((int[]) obj, (int[]) obj2);
                    }
                    if (obj instanceof long[]) {
                        return Arrays.equals((long[]) obj, (long[]) obj2);
                    }
                    if (obj instanceof float[]) {
                        return Arrays.equals((float[]) obj, (float[]) obj2);
                    }
                    if (obj instanceof double[]) {
                        return Arrays.equals((double[]) obj, (double[]) obj2);
                    }
                    if (obj instanceof boolean[]) {
                        return Arrays.equals((boolean[]) obj, (boolean[]) obj2);
                    }
                    Object[] objArr = (Object[]) obj;
                    Object[] objArr2 = (Object[]) obj2;
                    int length = objArr.length;
                    if (length != objArr2.length) {
                        return false;
                    }
                    while (i < length) {
                        if (!A02(objArr[i], objArr2[i])) {
                            return false;
                        }
                        i++;
                    }
                    return true;
                }
                if ((obj instanceof List) && (obj instanceof RandomAccess)) {
                    List list = (List) obj;
                    List list2 = (List) obj2;
                    z = false;
                    if (list.size() == list2.size()) {
                        int size = list.size();
                        while (i < size) {
                            if (A02(list.get(i), list2.get(i))) {
                                i++;
                            }
                        }
                        return true;
                    }
                } else {
                    if (!(obj instanceof Collection)) {
                        return obj.equals(obj2);
                    }
                    Collection collection = (Collection) obj;
                    Collection collection2 = (Collection) obj2;
                    z = false;
                    if (collection.size() == collection2.size()) {
                        Iterator it = collection.iterator();
                        Iterator it2 = collection2.iterator();
                        while (it.hasNext()) {
                            if (!A02(it.next(), it2.next())) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
            }
            if (compare != 0) {
                return false;
            }
        }
        return z;
    }

    public static final boolean A03(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || obj2 == null) {
                return false;
            }
            Class<?> cls = obj.getClass();
            if (!11T.A0O(cls, obj2.getClass())) {
                return false;
            }
            Field[] declaredFields = cls.getDeclaredFields();
            11T.A0A(declaredFields);
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    break;
                }
                Field field = declaredFields[i2];
                try {
                    boolean isAccessible = field.isAccessible();
                    if (!isAccessible) {
                        field.setAccessible(true);
                    }
                    Object obj3 = field.get(obj);
                    Object obj4 = field.get(obj2);
                    if (!isAccessible) {
                        field.setAccessible(false);
                    }
                    if (!A02(obj3, obj4)) {
                        return false;
                    }
                    i = i2 + 1;
                } catch (IllegalAccessException e) {
                    throw new IllegalStateException("Unable to get fields by reflection.", e);
                }
            }
        }
        return true;
    }
}
