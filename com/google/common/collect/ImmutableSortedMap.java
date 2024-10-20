package com.google.common.collect;

import X.1BJ;
import X.1BK;
import X.1Du;
import X.7Qw;
import X.AnonymousClass001;
import X.C1zA;
import X.JQw;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: ImmutableSortedMap.class */
public final class ImmutableSortedMap extends ImmutableMap implements NavigableMap {
    public static final ImmutableSortedMap A03;
    public static final Comparator A04;
    public static final long serialVersionUID = 0;
    public transient ImmutableSortedMap A00;
    public final transient ImmutableList A01;
    public final transient RegularImmutableSortedSet A02;

    /* renamed from: com.google.common.collect.ImmutableSortedMap$1EntrySet, reason: invalid class name */
    /* loaded from: ImmutableSortedMap$1EntrySet.class */
    public class C1EntrySet extends ImmutableMapEntrySet {
        public C1EntrySet() {
        }

        @Override // com.google.common.collect.ImmutableSet
        public ImmutableList A0J() {
            return new ImmutableList() { // from class: com.google.common.collect.ImmutableSortedMap.1EntrySet.1
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.List
                /* renamed from: A00, reason: merged with bridge method [inline-methods] */
                public AbstractMap.SimpleImmutableEntry get(int i) {
                    ImmutableSortedMap immutableSortedMap = ImmutableSortedMap.this;
                    ImmutableSortedMap immutableSortedMap2 = ImmutableSortedMap.A03;
                    return new AbstractMap.SimpleImmutableEntry(immutableSortedMap.A02.A00.get(i), ImmutableSortedMap.this.A01.get(i));
                }

                @Override // com.google.common.collect.ImmutableCollection
                public boolean A0H() {
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return ImmutableSortedMap.this.size();
                }

                @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                public Object writeReplace() {
                    return super.writeReplace();
                }
            };
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public 1Du iterator() {
            return asList().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return asList().iterator();
        }

        @Override // com.google.common.collect.ImmutableMapEntrySet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* loaded from: ImmutableSortedMap$SerializedForm.class */
    public class SerializedForm extends ImmutableMap.SerializedForm {
        public static final long serialVersionUID = 0;
        public final Comparator comparator;

        public SerializedForm(ImmutableSortedMap immutableSortedMap) {
            super(immutableSortedMap);
            this.comparator = immutableSortedMap.comparator();
        }

        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        public /* bridge */ /* synthetic */ ImmutableMap.Builder A00(int i) {
            return new 7Qw(this.comparator);
        }
    }

    static {
        NaturalOrdering naturalOrdering = NaturalOrdering.A02;
        A04 = naturalOrdering;
        A03 = new ImmutableSortedMap(ImmutableList.of(), null, ImmutableSortedSet.A0B(naturalOrdering));
    }

    public ImmutableSortedMap(ImmutableList immutableList, ImmutableSortedMap immutableSortedMap, RegularImmutableSortedSet regularImmutableSortedSet) {
        this.A02 = regularImmutableSortedSet;
        this.A01 = immutableList;
        this.A00 = immutableSortedMap;
    }

    private ImmutableSortedMap A00(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i == i2) {
            return A03(comparator());
        }
        return new ImmutableSortedMap(this.A01.subList(i, i2), null, this.A02.A0Z(i, i2));
    }

    public static ImmutableSortedMap A01(Object obj, Object obj2, Comparator comparator) {
        RegularImmutableSortedSet regularImmutableSortedSet = RegularImmutableSortedSet.A01;
        return new ImmutableSortedMap(ImmutableList.of(obj2), null, new RegularImmutableSortedSet(ImmutableList.of(obj), comparator));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.NavigableMap
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMap tailMap(Object obj, boolean z) {
        RegularImmutableSortedSet regularImmutableSortedSet = this.A02;
        obj.getClass();
        return A00(regularImmutableSortedSet.A0Y(obj, z), size());
    }

    public static ImmutableSortedMap A03(Comparator comparator) {
        if (NaturalOrdering.A02.equals(comparator)) {
            return A03;
        }
        return new ImmutableSortedMap(ImmutableList.of(), null, ImmutableSortedSet.A0B(comparator));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        if (r304 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.common.collect.ImmutableSortedMap A04(java.util.Comparator r301, java.util.Map r302) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableSortedMap.A04(java.util.Comparator, java.util.Map):com.google.common.collect.ImmutableSortedMap");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException(1BJ.A00(901));
    }

    @Override // java.util.NavigableMap
    public Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public Object ceilingKey(Object obj) {
        Map.Entry ceilingEntry = ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return ceilingEntry.getKey();
    }

    @Override // java.util.SortedMap
    public Comparator comparator() {
        return this.A02.comparator();
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet createEntrySet() {
        return isEmpty() ? RegularImmutableSet.A05 : new C1EntrySet();
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet createKeySet() {
        throw new AssertionError(JQw.A00(3));
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableCollection createValues() {
        throw new AssertionError(JQw.A00(3));
    }

    @Override // java.util.NavigableMap
    public /* bridge */ /* synthetic */ NavigableSet descendingKeySet() {
        return this.A02.descendingSet();
    }

    @Override // java.util.NavigableMap
    public /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        ImmutableSortedMap immutableSortedMap = this.A00;
        if (immutableSortedMap == null) {
            if (!isEmpty()) {
                return new ImmutableSortedMap(this.A01.reverse(), this, (RegularImmutableSortedSet) this.A02.descendingSet());
            }
            immutableSortedMap = A03(C1zA.A00(comparator()).A03());
        }
        return immutableSortedMap;
    }

    @Override // java.util.NavigableMap
    public Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) 1BK.A0r(entrySet().asList());
    }

    @Override // java.util.SortedMap
    public Object firstKey() {
        return this.A02.first();
    }

    @Override // java.util.NavigableMap
    public Map.Entry floorEntry(Object obj) {
        RegularImmutableSortedSet regularImmutableSortedSet = this.A02;
        obj.getClass();
        return A00(0, regularImmutableSortedSet.A0X(obj, true)).lastEntry();
    }

    @Override // java.util.NavigableMap
    public Object floorKey(Object obj) {
        Map.Entry floorEntry = floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return floorEntry.getKey();
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public Object get(Object obj) {
        RegularImmutableSortedSet regularImmutableSortedSet = this.A02;
        int i = -1;
        if (obj != null) {
            try {
                int binarySearch = Collections.binarySearch(regularImmutableSortedSet.A00, obj, regularImmutableSortedSet.A01);
                if (binarySearch >= 0) {
                    i = binarySearch;
                }
            } catch (ClassCastException unused) {
            }
        }
        if (i == -1) {
            return null;
        }
        return this.A01.get(i);
    }

    @Override // java.util.NavigableMap
    public /* bridge */ /* synthetic */ NavigableMap headMap(Object obj, boolean z) {
        RegularImmutableSortedSet regularImmutableSortedSet = this.A02;
        obj.getClass();
        return A00(0, regularImmutableSortedSet.A0X(obj, z));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
        RegularImmutableSortedSet regularImmutableSortedSet = this.A02;
        obj.getClass();
        return A00(0, regularImmutableSortedSet.A0X(obj, false));
    }

    @Override // java.util.NavigableMap
    public Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public Object higherKey(Object obj) {
        Map.Entry higherEntry = higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return higherEntry.getKey();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r301.A01.A0H() != false) goto L6;
     */
    @Override // com.google.common.collect.ImmutableMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isPartialView() {
        /*
            r301 = this;
            r0 = r301
            com.google.common.collect.RegularImmutableSortedSet r0 = r0.A02
            r302 = r0
            r0 = r302
            boolean r0 = r0.A0H()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L1e
            r0 = r301
            com.google.common.collect.ImmutableList r0 = r0.A01
            boolean r0 = r0.A0H()
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r304
            if (r0 == 0) goto L20
        L1e:
            r0 = 1
            r303 = r0
        L20:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableSortedMap.isPartialView():boolean");
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public /* bridge */ /* synthetic */ ImmutableSet keySet() {
        return this.A02;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public /* bridge */ /* synthetic */ Set keySet() {
        return this.A02;
    }

    @Override // java.util.NavigableMap
    public Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().asList().get(size() - 1);
    }

    @Override // java.util.SortedMap
    public Object lastKey() {
        return this.A02.last();
    }

    @Override // java.util.NavigableMap
    public Map.Entry lowerEntry(Object obj) {
        RegularImmutableSortedSet regularImmutableSortedSet = this.A02;
        obj.getClass();
        return A00(0, regularImmutableSortedSet.A0X(obj, false)).lastEntry();
    }

    @Override // java.util.NavigableMap
    public Object lowerKey(Object obj) {
        Map.Entry lowerEntry = lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return lowerEntry.getKey();
    }

    @Override // java.util.NavigableMap
    public /* bridge */ /* synthetic */ NavigableSet navigableKeySet() {
        return this.A02;
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
    public int size() {
        return this.A01.size();
    }

    @Override // java.util.NavigableMap
    public /* bridge */ /* synthetic */ NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        boolean z3 = false;
        if (comparator().compare(obj, obj2) <= 0) {
            z3 = true;
        }
        Preconditions.checkArgument(z3, "expected fromKey <= toKey but %s > %s", obj, obj2);
        return A00(0, this.A02.A0X(obj2, z2)).tailMap(obj, z);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        boolean z = false;
        if (comparator().compare(obj, obj2) <= 0) {
            z = true;
        }
        Preconditions.checkArgument(z, "expected fromKey <= toKey but %s > %s", obj, obj2);
        return A00(0, this.A02.A0X(obj2, false)).tailMap(obj, true);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public ImmutableCollection values() {
        return this.A01;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public /* bridge */ /* synthetic */ Collection values() {
        return this.A01;
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
