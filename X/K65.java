package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: K65.class */
public abstract class K65 extends Ly4 implements List, RandomAccess {
    public static final K6H A00 = new K6G(K64.A02, 0);

    public static K65 A00(Object[] objArr) {
        if (objArr.length != 0) {
            Object[] objArr2 = (Object[]) objArr.clone();
            int length = objArr2.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < length) {
                    if (objArr2[i2] == null) {
                        throw AnonymousClass001.A0Q(0Pz.A0T("at index ", i2));
                    }
                    i = i2 + 1;
                } else if (length != 0) {
                    return new K64(objArr2, length);
                }
            }
        }
        return K64.A02;
    }

    public static K64 A01(Object obj) {
        Object[] objArr = {obj};
        if (objArr[0] != null) {
            return new K64(objArr, 1);
        }
        throw AnonymousClass001.A0Q(0Pz.A0T("at index ", 0));
    }

    public K65 A08() {
        return this instanceof K63 ? ((K63) this).A00 : size() <= 1 ? this : new K63(this);
    }

    @Override // java.util.List
    /* renamed from: A09, reason: merged with bridge method [inline-methods] */
    public K65 subList(int i, int i2) {
        if (this instanceof K62) {
            K62 k62 = (K62) this;
            L6F.A02(i, i2, k62.A01);
            int i3 = k62.A00;
            return k62.zzc.subList(i + i3, i2 + i3);
        }
        if (this instanceof K63) {
            K65 k65 = ((K63) this).A00;
            L6F.A02(i, i2, k65.size());
            return k65.subList(JQx.A0L(k65, i2), JQx.A0L(k65, i)).A08();
        }
        L6F.A02(i, i2, size());
        int i4 = i2 - i;
        return i4 == size() ? this : i4 == 0 ? K64.A02 : new K62(this, i, i4);
    }

    @Override // java.util.List
    /* renamed from: A0A, reason: merged with bridge method [inline-methods] */
    public final K6H listIterator(int i) {
        int size = size();
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException(L6F.A00(i, size, "index"));
        }
        return isEmpty() ? A00 : new K6G(this, i);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw AnonymousClass001.A0p();
    }

    @Override // X.Ly4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return 1BL.A1S(indexOf(obj));
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        boolean z = true;
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (list instanceof RandomAccess) {
                        for (int i = 0; i < size; i++) {
                            Object obj2 = get(i);
                            Object obj3 = list.get(i);
                            if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                            }
                        }
                    } else {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            boolean hasNext2 = it2.hasNext();
                            if (hasNext) {
                                if (!hasNext2 || ((next = it.next()) != (next2 = it2.next()) && (next == null || !next.equals(next2)))) {
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
    public int indexOf(Object obj) {
        int i;
        if (!(this instanceof K63)) {
            if (obj != null) {
                int size = size();
                int i2 = 0;
                while (true) {
                    i = i2;
                    if (i >= size) {
                        break;
                    }
                    if (obj.equals(get(i))) {
                        break;
                    }
                    i2 = i + 1;
                }
            }
            return -1;
        }
        K65 k65 = ((K63) this).A00;
        int lastIndexOf = k65.lastIndexOf(obj);
        if (lastIndexOf < 0) {
            return -1;
        }
        i = DKC.A06(k65) - lastIndexOf;
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (this instanceof K63) {
            K65 k65 = ((K63) this).A00;
            int indexOf = k65.indexOf(obj);
            if (indexOf >= 0) {
                return DKC.A06(k65) - indexOf;
            }
            return -1;
        }
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
