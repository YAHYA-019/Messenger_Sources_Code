package com.google.common.collect;

import X.0Q8;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: Iterators$EmptyModifiableIterator.class */
public final class Iterators$EmptyModifiableIterator implements Iterator {
    public static final /* synthetic */ Iterators$EmptyModifiableIterator[] A00;
    public static final Iterators$EmptyModifiableIterator A01;

    static {
        Iterators$EmptyModifiableIterator iterators$EmptyModifiableIterator = new Iterators$EmptyModifiableIterator();
        A01 = iterators$EmptyModifiableIterator;
        A00 = new Iterators$EmptyModifiableIterator[]{iterators$EmptyModifiableIterator};
    }

    public static Iterators$EmptyModifiableIterator valueOf(String str) {
        return (Iterators$EmptyModifiableIterator) Enum.valueOf(Iterators$EmptyModifiableIterator.class, str);
    }

    public static Iterators$EmptyModifiableIterator[] values() {
        return (Iterators$EmptyModifiableIterator[]) A00.clone();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        Preconditions.checkState(false, "no calls to next() since the last call to remove()");
        throw 0Q8.createAndThrow();
    }
}
