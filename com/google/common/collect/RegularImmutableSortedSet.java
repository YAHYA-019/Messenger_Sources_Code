package com.google.common.collect;

import X.1Du;
import X.6T3;
import X.C4u1;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: RegularImmutableSortedSet.class */
public final class RegularImmutableSortedSet extends ImmutableSortedSet {
    public static final RegularImmutableSortedSet A01 = new RegularImmutableSortedSet(ImmutableList.of(), NaturalOrdering.A02);
    public final transient ImmutableList A00;

    public RegularImmutableSortedSet(ImmutableList immutableList, Comparator comparator) {
        super(comparator);
        this.A00 = immutableList;
    }

    public static boolean A0D(Iterable iterable, Comparator comparator) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = NaturalOrdering.A02;
            }
        } else {
            if (!(iterable instanceof 6T3)) {
                return false;
            }
            comparator2 = ((6T3) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int A0F() {
        return this.A00.A0F();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int A0G() {
        return this.A00.A0G();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean A0H() {
        return this.A00.A0H();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object[] A0I() {
        return this.A00.A0I();
    }

    public int A0X(Object obj, boolean z) {
        ImmutableList immutableList = this.A00;
        obj.getClass();
        int binarySearch = Collections.binarySearch(immutableList, obj, comparator());
        if (binarySearch < 0) {
            return binarySearch ^ (-1);
        }
        if (z) {
            binarySearch++;
        }
        return binarySearch;
    }

    public int A0Y(Object obj, boolean z) {
        ImmutableList immutableList = this.A00;
        obj.getClass();
        int binarySearch = Collections.binarySearch(immutableList, obj, comparator());
        if (binarySearch < 0) {
            return binarySearch ^ (-1);
        }
        if (!z) {
            binarySearch++;
        }
        return binarySearch;
    }

    public RegularImmutableSortedSet A0Z(int i, int i2) {
        return (i == 0 && i2 == size()) ? this : i < i2 ? new RegularImmutableSortedSet(this.A00.subList(i, i2), this.A01) : ImmutableSortedSet.A0B(this.A01);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public ImmutableList asList() {
        return this.A00;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        boolean z = false;
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.A00, obj, this.A01) >= 0) {
                    z = true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        boolean containsAll;
        if (collection instanceof C4u1) {
            collection = ((C4u1) collection).APB();
        }
        if (!A0D(collection, comparator()) || collection.size() <= 1) {
            containsAll = super.containsAll(collection);
        } else {
            1Du it = this.A00.iterator();
            Iterator it2 = collection.iterator();
            containsAll = false;
            if (it.hasNext()) {
                Object next = it2.next();
                Object next2 = it.next();
                while (true) {
                    try {
                        int compare = this.A01.compare(next2, next);
                        if (compare < 0) {
                            if (!it.hasNext()) {
                                break;
                            }
                            next2 = it.next();
                        } else {
                            if (compare != 0) {
                                return false;
                            }
                            if (!it2.hasNext()) {
                                return true;
                            }
                            next = it2.next();
                        }
                    } catch (ClassCastException | NullPointerException unused) {
                        return false;
                    }
                }
            }
        }
        return containsAll;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] objArr, int i) {
        return this.A00.copyIntoArray(objArr, i);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj != this) {
            boolean z = false;
            if (obj instanceof Set) {
                Set set = (Set) obj;
                if (size() == set.size()) {
                    if (!isEmpty()) {
                        Comparator comparator = this.A01;
                        if (A0D(set, comparator)) {
                            Iterator it = set.iterator();
                            try {
                                1Du it2 = this.A00.iterator();
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    Object next2 = it.next();
                                    if (next2 != null) {
                                        if (comparator.compare(next, next2) != 0) {
                                            return false;
                                        }
                                    }
                                }
                            } catch (ClassCastException | NoSuchElementException unused) {
                                return false;
                            }
                        } else {
                            z = containsAll(set);
                        }
                    }
                }
            }
            return z;
        }
        return true;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public 1Du iterator() {
        return this.A00.iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return this.A00.iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.A00.size();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
