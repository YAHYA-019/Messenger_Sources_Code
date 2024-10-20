package com.google.common.collect;

import X.1Du;
import X.AnonymousClass001;
import com.google.common.collect.ImmutableList;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* loaded from: ImmutableCollection.class */
public abstract class ImmutableCollection extends AbstractCollection implements Serializable {
    public static final Object[] A00 = new Object[0];
    public static final long serialVersionUID = 912559;

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public int A0F() {
        if (this instanceof RegularImmutableSet) {
            return ((RegularImmutableSet) this).A00;
        }
        throw AnonymousClass001.A0p();
    }

    public int A0G() {
        if (this instanceof RegularImmutableSet) {
            return 0;
        }
        throw AnonymousClass001.A0p();
    }

    public boolean A0H() {
        return ((this instanceof SingletonImmutableSet) || (this instanceof RegularImmutableSet)) ? false : true;
    }

    public Object[] A0I() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw AnonymousClass001.A0p();
    }

    public ImmutableList asList() {
        return isEmpty() ? ImmutableList.of() : ImmutableList.asImmutableList(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    public int copyIntoArray(Object[] objArr, int i) {
        1Du it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public abstract 1Du iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] A0I = A0I();
            if (A0I != null) {
                return Arrays.copyOfRange(A0I, A0G(), A0F(), objArr.getClass());
            }
            if (length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        copyIntoArray(objArr, 0);
        return objArr;
    }

    public Object writeReplace() {
        return new ImmutableList.SerializedForm(toArray());
    }
}
