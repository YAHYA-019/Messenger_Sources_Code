package com.google.common.collect;

import X.1Du;
import X.KB9;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

/* loaded from: ImmutableEnumSet.class */
public final class ImmutableEnumSet extends ImmutableSet {
    public transient int A00;
    public final transient EnumSet A01;

    /* loaded from: ImmutableEnumSet$EnumSerializedForm.class */
    public class EnumSerializedForm implements Serializable {
        public static final long serialVersionUID = 0;
        public final EnumSet delegate;

        public EnumSerializedForm(EnumSet enumSet) {
            this.delegate = enumSet;
        }

        public Object readResolve() {
            return new ImmutableEnumSet(this.delegate.clone());
        }
    }

    public ImmutableEnumSet(EnumSet enumSet) {
        this.A01 = enumSet;
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

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.A01.contains(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        if (collection instanceof ImmutableEnumSet) {
            collection = ((ImmutableEnumSet) collection).A01;
        }
        return this.A01.containsAll(collection);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableEnumSet) {
            obj = ((ImmutableEnumSet) obj).A01;
        }
        return this.A01.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        int i = this.A00;
        if (i == 0) {
            i = this.A01.hashCode();
            this.A00 = i;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.A01.isEmpty();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public 1Du iterator() {
        1Du it = this.A01.iterator();
        it.getClass();
        return it instanceof 1Du ? it : new KB9(it);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.A01.size();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return this.A01.toString();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new EnumSerializedForm(this.A01);
    }
}
