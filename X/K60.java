package X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* loaded from: K60.class */
public abstract class K60 extends Ly4 implements Set {
    public transient K65 A00;

    public static int A00(int i) {
        int i2;
        int max = Math.max(i, 2);
        if (max < 751619276) {
            i2 = Integer.highestOneBit(max - 1);
            do {
                i2 += i2;
            } while (i2 * 0.7d < max);
        } else {
            i2 = 1073741824;
            if (max >= 1073741824) {
                throw AnonymousClass001.A0L("collection too large");
            }
        }
        return i2;
    }

    public static K60 A01(Object[] objArr, int i) {
        Object[] objArr2 = objArr;
        if (i == 0) {
            return K69.A05;
        }
        if (i != 1) {
            int A00 = A00(i);
            Object[] objArr3 = new Object[A00];
            int i2 = A00 - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj = objArr2[i5];
                if (obj == null) {
                    throw AnonymousClass001.A0Q(0Pz.A0T("at index ", i5));
                }
                int hashCode = obj.hashCode();
                int A06 = JQz.A06(hashCode);
                while (true) {
                    int i6 = A06;
                    int i7 = i6 & i2;
                    Object obj2 = objArr3[i7];
                    if (obj2 == null) {
                        objArr2[i4] = obj;
                        objArr3[i7] = obj;
                        i3 += hashCode;
                        i4++;
                        break;
                    }
                    if (!obj2.equals(obj)) {
                        A06 = i6 + 1;
                    }
                }
            }
            Arrays.fill(objArr2, i4, i, (Object) null);
            if (i4 != 1) {
                if (A00(i4) < A00 / 2) {
                    return A01(objArr2, i4);
                }
                if (i4 <= 0) {
                    objArr2 = Arrays.copyOf(objArr2, i4);
                }
                return new K69(objArr2, objArr3, i3, i2, i4);
            }
        }
        Object obj3 = objArr2[0];
        obj3.getClass();
        return new K67(obj3);
    }

    public K65 A08() {
        K65 k65;
        Object[] array;
        int length;
        K65 k61;
        if (this instanceof K67) {
            k65 = K65.A01(((K67) this).A00);
        } else {
            if (this instanceof K6A) {
                return ((K6A) this).A01;
            }
            k65 = this.A00;
            if (k65 == null) {
                if (this instanceof K69) {
                    K69 k69 = (K69) this;
                    array = k69.A01;
                    length = k69.A00;
                } else {
                    if (this instanceof K68) {
                        k61 = new K61((K68) this);
                        this.A00 = k61;
                        return k61;
                    }
                    array = toArray();
                    length = array.length;
                }
                K6H k6h = K65.A00;
                k61 = length == 0 ? K64.A02 : new K64(array, length);
                this.A00 = k61;
                return k61;
            }
        }
        return k65;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj != this) {
            if (((obj instanceof K60) && (this instanceof K69) && (((K60) obj) instanceof K69) && hashCode() != obj.hashCode()) || !(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            try {
                if (size() != set.size()) {
                    return false;
                }
                if (!containsAll(set)) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            i = i2 + AnonymousClass002.A04(it.next());
        }
    }
}
