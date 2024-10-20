package X;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* loaded from: Ly5.class */
public abstract class Ly5 extends AbstractCollection implements Serializable {
    public static final Object[] A00 = AnonymousClass001.A1Z();

    public int A06() {
        throw AnonymousClass001.A0p();
    }

    public int A07() {
        throw AnonymousClass001.A0p();
    }

    public Object[] A08() {
        return null;
    }

    public abstract boolean A09();

    public abstract int A0A(Object[] objArr, int i);

    public abstract K75 A0B();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public abstract boolean contains(Object obj);

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
    public final Spliterator spliterator() {
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
            Object[] A08 = A08();
            if (A08 != null) {
                return Arrays.copyOfRange(A08, A07(), A06(), objArr.getClass());
            }
            if (length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        A0A(objArr, 0);
        return objArr;
    }
}
