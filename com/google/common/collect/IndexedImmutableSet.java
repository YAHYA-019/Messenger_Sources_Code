package com.google.common.collect;

import X.1Du;
import X.5sJ;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMultiset;
import java.util.Iterator;

/* loaded from: IndexedImmutableSet.class */
public abstract class IndexedImmutableSet extends ImmutableSet {
    @Override // com.google.common.collect.ImmutableSet
    public ImmutableList A0J() {
        return new ImmutableList() { // from class: com.google.common.collect.IndexedImmutableSet.1
            @Override // com.google.common.collect.ImmutableCollection
            public boolean A0H() {
                return IndexedImmutableSet.this.A0H();
            }

            @Override // java.util.List
            public Object get(int i) {
                IndexedImmutableSet indexedImmutableSet = IndexedImmutableSet.this;
                if (indexedImmutableSet instanceof ImmutableMultiset.EntrySet) {
                    return ImmutableMultiset.this.A0L(i);
                }
                5sJ r0 = RegularImmutableMultiset.this.A01;
                Preconditions.checkElementIndex(i, r0.A01);
                return r0.A06[i];
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return IndexedImmutableSet.this.size();
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            public Object writeReplace() {
                return super.writeReplace();
            }
        };
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] objArr, int i) {
        return asList().copyIntoArray(objArr, i);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public 1Du iterator() {
        return asList().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return asList().iterator();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
