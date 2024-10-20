package X;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;

/* loaded from: K66.class */
public final class K66 extends LtH implements NavigableMap {
    public static final Comparator A03;
    public static final K66 A04;
    public final transient K65 A00;
    public final transient K6A A01;
    public final transient K66 A02;

    static {
        K6D k6d = K6D.A00;
        A03 = k6d;
        K6A A00 = K6A.A00(k6d);
        K6H k6h = K65.A00;
        A04 = new K66(K64.A02, null, A00);
    }

    public K66(K65 k65, K66 k66, K6A k6a) {
        this.A01 = k6a;
        this.A00 = k65;
        this.A02 = k66;
    }

    private final K66 A00(int i, int i2) {
        if (i == 0) {
            if (i2 == this.A00.size()) {
                return this;
            }
            i = 0;
        }
        if (i == i2) {
            return A03(this.A01.A02);
        }
        K6A k6a = this.A01;
        return new K66(this.A00.subList(i, i2), null, k6a.A0B(i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.NavigableMap
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final K66 subMap(Object obj, Object obj2, boolean z, boolean z2) {
        obj.getClass();
        obj2.getClass();
        K6A k6a = this.A01;
        if (k6a.A02.compare(obj, obj2) <= 0) {
            return A00(0, k6a.A09(obj2, z2)).tailMap(obj, z);
        }
        throw AnonymousClass001.A0L(KYC.A00(AbstractC00603o4.A00(487), new Object[]{obj, obj2}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.NavigableMap
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final K66 tailMap(Object obj, boolean z) {
        obj.getClass();
        K6A k6a = this.A01;
        int binarySearch = Collections.binarySearch(k6a.A01, obj, k6a.A02);
        if (binarySearch < 0) {
            binarySearch ^= -1;
        } else if (!z) {
            binarySearch++;
        }
        return A00(binarySearch, this.A00.size());
    }

    public static K66 A03(Comparator comparator) {
        if (K6D.A00.equals(comparator)) {
            return A04;
        }
        K6A A00 = K6A.A00(comparator);
        K6H k6h = K65.A00;
        return new K66(K64.A02, null, A00);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        Map.Entry ceilingEntry = ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return ceilingEntry.getKey();
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.A01.A02;
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.A01.A0A();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        K66 k66 = this.A02;
        if (k66 == null) {
            boolean isEmpty = isEmpty();
            K6A k6a = this.A01;
            if (!isEmpty) {
                return new K66(this.A00.A08(), this, k6a.A0A());
            }
            K6C k6c = k6a.A02;
            Ls5 k6b = k6c instanceof Ls5 ? (Ls5) k6c : new K6B(k6c);
            k66 = A03(k6b instanceof K6C ? ((K6C) k6b).zza : k6b instanceof K6E ? K6D.A00 : k6b instanceof K6D ? K6E.A00 : new K6C(k6b));
        }
        return k66;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) 1BK.A0r(A04().A08());
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.A01.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        obj.getClass();
        return A00(0, this.A01.A09(obj, true)).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        Map.Entry floorEntry = floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return floorEntry.getKey();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap headMap(Object obj, boolean z) {
        obj.getClass();
        return A00(0, this.A01.A09(obj, z));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        obj.getClass();
        return A00(0, this.A01.A09(obj, false));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        Map.Entry higherEntry = higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return higherEntry.getKey();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) A04().A08().get(DKC.A06(this.A00));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.A01.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        obj.getClass();
        return A00(0, this.A01.A09(obj, false)).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        Map.Entry lowerEntry = lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return lowerEntry.getKey();
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.A01;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.Map
    public final int size() {
        return this.A00.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, obj2, true, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
