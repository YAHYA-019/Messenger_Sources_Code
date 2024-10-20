package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: K75.class */
public abstract class K75 extends Ly5 implements List, RandomAccess {
    public static final K7A A00 = new K79(K74.A02, 0);

    public static K75 A00() {
        return K74.A02;
    }

    public static K75 A01(Object obj) {
        Object[] objArr = {obj};
        A04(objArr, 1);
        return A03(objArr, 1);
    }

    public static K75 A02(Collection collection) {
        Object[] array;
        int length;
        K75 k75;
        if (collection instanceof Ly5) {
            k75 = ((Ly5) collection).A0B();
            if (k75.A09()) {
                array = k75.toArray();
                length = array.length;
            }
            return k75;
        }
        array = collection.toArray();
        length = array.length;
        A04(array, length);
        k75 = A03(array, length);
        return k75;
    }

    public static K75 A03(Object[] objArr, int i) {
        return i == 0 ? K74.A02 : new K74(objArr, i);
    }

    public static void A04(Object[] objArr, int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= i) {
                return;
            }
            if (objArr[i3] == null) {
                throw AnonymousClass001.A0Q(0Pz.A0T("at index ", i3));
            }
            i2 = i3 + 1;
        }
    }

    public static boolean A05(Object obj, Object obj2) {
        boolean z = false;
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            z = true;
        }
        return z;
    }

    @Override // X.Ly5
    public int A0A(Object[] objArr, int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= size) {
                return size;
            }
            objArr[i3] = get(i3);
            i2 = i3 + 1;
        }
    }

    @Override // X.Ly5
    public final K75 A0B() {
        return this;
    }

    @Override // java.util.List
    /* renamed from: A0C, reason: merged with bridge method [inline-methods] */
    public K75 subList(int i, int i2) {
        LBh.A03(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? K74.A02 : new K73(this, i, i3);
    }

    @Override // java.util.List
    /* renamed from: A0D, reason: merged with bridge method [inline-methods] */
    public final K7A listIterator(int i) {
        LBh.A02(i, size());
        return isEmpty() ? A00 : new K79(this, i);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw AnonymousClass001.A0p();
    }

    @Override // X.Ly5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return 1BL.A1S(indexOf(obj));
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (list instanceof RandomAccess) {
                        for (int i = 0; i < size; i++) {
                            if (A05(get(i), list.get(i))) {
                            }
                        }
                    } else {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            boolean hasNext2 = it2.hasNext();
                            if (hasNext) {
                                if (!hasNext2 || !A05(it.next(), it2.next())) {
                                    break;
                                }
                            } else if (!hasNext2) {
                                return true;
                            }
                        }
                    }
                }
            }
            z = false;
            break;
        }
        return z;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= size) {
                return i;
            }
            i = 1BK.A03(get(i3), i * 31);
            i2 = i3 + 1;
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj != null) {
            int size = size();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= size) {
                    break;
                }
                if (obj.equals(get(i2))) {
                    return i2;
                }
                i = i2 + 1;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj != null) {
            int size = size();
            do {
                size--;
                if (size >= 0) {
                }
            } while (!obj.equals(get(size)));
            return size;
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw AnonymousClass001.A0p();
    }
}
