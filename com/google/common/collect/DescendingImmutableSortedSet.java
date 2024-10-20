package com.google.common.collect;

import X.1Du;
import X.AnonymousClass001;
import X.C1zA;
import java.util.Iterator;
import java.util.NavigableSet;

/* loaded from: DescendingImmutableSortedSet.class */
public final class DescendingImmutableSortedSet extends ImmutableSortedSet {
    public final ImmutableSortedSet forward;

    public DescendingImmutableSortedSet(ImmutableSortedSet immutableSortedSet) {
        super(C1zA.A00(immutableSortedSet.comparator()).A03());
        this.forward = immutableSortedSet;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean A0H() {
        return this.forward.A0H();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet A0L() {
        throw AnonymousClass001.A0J("should never be called");
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: A0M */
    public ImmutableSortedSet descendingSet() {
        return this.forward;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet A0R(Object obj, Object obj2, boolean z, boolean z2) {
        return this.forward.subSet(obj2, obj, z2, z).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet A0T(Object obj, boolean z) {
        return this.forward.tailSet(obj, z).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet A0V(Object obj, boolean z) {
        return this.forward.headSet(obj, z).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: A0W */
    public 1Du descendingIterator() {
        return this.forward.iterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public Object ceiling(Object obj) {
        return this.forward.floor(obj);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.forward.contains(obj);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public /* bridge */ /* synthetic */ Iterator descendingIterator() {
        return this.forward.iterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public /* bridge */ /* synthetic */ NavigableSet descendingSet() {
        return this.forward;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public Object floor(Object obj) {
        return this.forward.ceiling(obj);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public Object higher(Object obj) {
        return this.forward.lower(obj);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public 1Du iterator() {
        return this.forward.descendingIterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return this.forward.descendingIterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public Object lower(Object obj) {
        return this.forward.higher(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.forward.size();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
