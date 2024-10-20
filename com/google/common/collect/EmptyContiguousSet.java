package com.google.common.collect;

import X.1Du;
import X.4nW;
import X.AnonymousClass001;
import X.KzK;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;

/* loaded from: EmptyContiguousSet.class */
public final class EmptyContiguousSet extends ContiguousSet {

    /* loaded from: EmptyContiguousSet$SerializedForm.class */
    public final class SerializedForm implements Serializable {
        public static final long serialVersionUID = 0;
        public final KzK domain;

        public SerializedForm(KzK kzK) {
            this.domain = kzK;
        }

        private Object readResolve() {
            return new ContiguousSet(this.domain);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean A0H() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet
    public boolean A0K() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public /* bridge */ /* synthetic */ ImmutableSortedSet A0R(Object obj, Object obj2, boolean z, boolean z2) {
        return this;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public /* bridge */ /* synthetic */ ImmutableSortedSet A0T(Object obj, boolean z) {
        return this;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public /* bridge */ /* synthetic */ ImmutableSortedSet A0V(Object obj, boolean z) {
        return this;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: A0W */
    public 1Du descendingIterator() {
        return 4nW.A01;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public ImmutableList asList() {
        return ImmutableList.of();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public /* bridge */ /* synthetic */ Iterator descendingIterator() {
        return 4nW.A01;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj instanceof Set) {
            return ((Set) obj).isEmpty();
        }
        return false;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ Object first() {
        throw AnonymousClass001.A10();
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public 1Du iterator() {
        return 4nW.A01;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return 4nW.A01;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ Object last() {
        throw AnonymousClass001.A10();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 0;
    }

    @Override // com.google.common.collect.ContiguousSet, java.util.AbstractCollection
    public String toString() {
        return "[]";
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this.domain);
    }
}
