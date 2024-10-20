package com.google.common.collect;

import X.0Pz;
import X.1Du;
import X.1mS;
import java.util.Iterator;

/* loaded from: SingletonImmutableSet.class */
public final class SingletonImmutableSet extends ImmutableSet {
    public final transient Object A00;

    public SingletonImmutableSet(Object obj) {
        obj.getClass();
        this.A00 = obj;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public ImmutableList asList() {
        return ImmutableList.of(this.A00);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.A00.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] objArr, int i) {
        objArr[i] = this.A00;
        return i + 1;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1Du, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.1Du, java.lang.Object, X.1mS] */
    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public 1Du iterator() {
        Object obj = this.A00;
        if (obj == null) {
            return new Object();
        }
        ?? obj2 = new Object();
        ((1mS) obj2).A00 = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return 0Pz.A0L(this.A00.toString(), '[', ']');
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
