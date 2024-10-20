package X;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.3jz, reason: invalid class name */
/* loaded from: 3jz.class */
public final class C3jz extends AbstractMap {
    public final List A00;
    public final List A01;
    public final java.util.Map A02;
    public final Comparator A03;
    public final java.util.Map A04;

    public C3jz(Comparator comparator) {
        this.A03 = comparator;
        HashMap A0u = AnonymousClass001.A0u();
        this.A02 = A0u;
        ArrayList A0s = AnonymousClass001.A0s();
        this.A00 = A0s;
        this.A04 = Collections.unmodifiableMap(A0u);
        this.A01 = Collections.unmodifiableList(A0s);
    }

    private int A00(Object obj) {
        int i;
        Object obj2;
        List list = this.A00;
        Comparator comparator = this.A03;
        int binarySearch = Collections.binarySearch(list, obj, comparator);
        if (binarySearch >= 0) {
            int i2 = binarySearch;
            while (true) {
                i = i2;
                if (i >= list.size()) {
                    break;
                }
                Object obj3 = list.get(i);
                if (comparator.compare(obj, obj3) != 0) {
                    break;
                }
                if (obj == obj3) {
                    break;
                }
                i2 = i + 1;
            }
            do {
                binarySearch--;
                if (binarySearch >= 0) {
                    obj2 = list.get(binarySearch);
                    if (comparator.compare(obj, obj2) == 0) {
                    }
                }
            } while (obj != obj2);
            return binarySearch;
        }
        int i3 = 0;
        while (true) {
            i = i3;
            if (i >= list.size()) {
                i = -1;
                break;
            }
            if (list.get(i) == obj) {
                break;
            }
            i3 = i + 1;
        }
        return i;
    }

    private void A01(Object obj) {
        List list = this.A00;
        Comparator comparator = this.A03;
        int binarySearch = Collections.binarySearch(list, obj, comparator);
        if (binarySearch < 0) {
            binarySearch = -(binarySearch + 1);
            list.add(binarySearch, obj);
        }
        do {
            binarySearch++;
            if (binarySearch >= list.size()) {
                break;
            }
        } while (comparator.compare(list.get(binarySearch - 1), list.get(binarySearch)) == 0);
        list.add(binarySearch, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        java.util.Map map = this.A02;
        Object[] array = map.keySet().toArray();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= array.length) {
                return;
            }
            Object remove = map.remove(array[i2]);
            if (remove != null) {
                int A00 = A00(remove);
                if (A00 < 0) {
                    throw AnonymousClass001.A0T("The collection is in an invalid state");
                }
                this.A00.remove(A00);
            }
            i = i2 + 1;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.A02.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return this.A04.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.A02.get(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        java.util.Map map;
        Object obj3 = get(obj);
        if (obj3 == null) {
            A01(obj2);
        } else {
            if (this.A03.compare(obj3, obj2) != 0) {
                map = this.A02;
                int A00 = A00(map.remove(obj));
                if (A00 < 0) {
                    throw AnonymousClass001.A0T("The collection is in an invalid state");
                }
                this.A00.remove(A00);
                A01(obj2);
                map.put(obj, obj2);
                return obj3;
            }
            int A002 = A00(obj3);
            if (A002 < 0) {
                throw AnonymousClass001.A0T("The collection is in an invalid state");
            }
            this.A00.set(A002, obj2);
        }
        map = this.A02;
        map.put(obj, obj2);
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Object remove = this.A02.remove(obj);
        if (remove == null) {
            return null;
        }
        int A00 = A00(remove);
        if (A00 < 0) {
            throw AnonymousClass001.A0T("The collection is in an invalid state");
        }
        this.A00.remove(A00);
        return remove;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.A02.size();
    }
}
