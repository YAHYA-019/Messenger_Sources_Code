package com.google.common.collect;

import X.1BK;
import X.1Du;
import X.1Dz;
import X.2Ri;
import X.6T3;
import X.AnonymousClass001;
import X.KAH;
import com.google.common.base.Preconditions;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;

/* loaded from: ImmutableSortedSet.class */
public abstract class ImmutableSortedSet extends ImmutableSet implements NavigableSet, 6T3 {
    public static final long serialVersionUID = 912559;
    public transient ImmutableSortedSet A00;
    public final transient Comparator A01;

    /* loaded from: ImmutableSortedSet$SerializedForm.class */
    public class SerializedForm implements Serializable {
        public static final long serialVersionUID = 0;
        public final Comparator comparator;
        public final Object[] elements;

        public SerializedForm(Object[] objArr, Comparator comparator) {
            this.comparator = comparator;
            this.elements = objArr;
        }

        public Object readResolve() {
            KAH kah = new KAH(this.comparator);
            kah.A0B(this.elements);
            return kah.A09();
        }
    }

    public ImmutableSortedSet(Comparator comparator) {
        this.A01 = comparator;
    }

    public static RegularImmutableSortedSet A0B(Comparator comparator) {
        if (NaturalOrdering.A02.equals(comparator)) {
            return RegularImmutableSortedSet.A01;
        }
        RegularImmutableSortedSet regularImmutableSortedSet = RegularImmutableSortedSet.A01;
        return new RegularImmutableSortedSet(ImmutableList.of(), comparator);
    }

    public static RegularImmutableSortedSet A0C(Comparator comparator, Object[] objArr, int i) {
        if (i == 0) {
            return A0B(comparator);
        }
        1Dz.A00(objArr, i);
        Arrays.sort(objArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (comparator.compare(obj, objArr[i2 - 1]) != 0) {
                objArr[i2] = obj;
                i2++;
            }
        }
        Arrays.fill(objArr, i2, i, (Object) null);
        if (i2 < objArr.length / 2) {
            objArr = Arrays.copyOf(objArr, i2);
        }
        RegularImmutableSortedSet regularImmutableSortedSet = RegularImmutableSortedSet.A01;
        return new RegularImmutableSortedSet(ImmutableList.asImmutableList(objArr, i2), comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public ImmutableSortedSet A0L() {
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        Comparator reverseOrder = Collections.reverseOrder(regularImmutableSortedSet.A01);
        return regularImmutableSortedSet.isEmpty() ? A0B(reverseOrder) : new RegularImmutableSortedSet(regularImmutableSortedSet.A00.reverse(), reverseOrder);
    }

    @Override // java.util.NavigableSet
    /* renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet descendingSet() {
        ImmutableSortedSet immutableSortedSet = this.A00;
        if (immutableSortedSet == null) {
            immutableSortedSet = A0L();
            this.A00 = immutableSortedSet;
            immutableSortedSet.A00 = this;
        }
        return immutableSortedSet;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: A0N, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: A0P, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, obj2, true, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: A0Q, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet subSet(Object obj, Object obj2, boolean z, boolean z2) {
        obj.getClass();
        obj2.getClass();
        boolean z3 = false;
        if (this.A01.compare(obj, obj2) <= 0) {
            z3 = true;
        }
        Preconditions.checkArgument(z3);
        return A0R(obj, obj2, z, z2);
    }

    public ImmutableSortedSet A0R(Object obj, Object obj2, boolean z, boolean z2) {
        return A0V(obj, z).A0T(obj2, z2);
    }

    @Override // java.util.NavigableSet
    /* renamed from: A0S, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet headSet(Object obj, boolean z) {
        obj.getClass();
        return A0T(obj, z);
    }

    public ImmutableSortedSet A0T(Object obj, boolean z) {
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        return regularImmutableSortedSet.A0Z(0, regularImmutableSortedSet.A0X(obj, z));
    }

    @Override // java.util.NavigableSet
    /* renamed from: A0U, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet tailSet(Object obj, boolean z) {
        obj.getClass();
        return A0V(obj, z);
    }

    public ImmutableSortedSet A0V(Object obj, boolean z) {
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        return regularImmutableSortedSet.A0Z(regularImmutableSortedSet.A0Y(obj, z), regularImmutableSortedSet.size());
    }

    @Override // java.util.NavigableSet
    /* renamed from: A0W, reason: merged with bridge method [inline-methods] */
    public 1Du descendingIterator() {
        return ((RegularImmutableSortedSet) this).A00.reverse().iterator();
    }

    public Object ceiling(Object obj) {
        if (!(this instanceof RegularImmutableSortedSet)) {
            return 2Ri.A0D(tailSet(obj, true), (Object) null);
        }
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        int A0Y = regularImmutableSortedSet.A0Y(obj, true);
        if (A0Y == regularImmutableSortedSet.size()) {
            return null;
        }
        return regularImmutableSortedSet.A00.get(A0Y);
    }

    @Override // java.util.SortedSet
    public Comparator comparator() {
        return this.A01;
    }

    public Object first() {
        if (!(this instanceof RegularImmutableSortedSet)) {
            return iterator().next();
        }
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        if (regularImmutableSortedSet.isEmpty()) {
            throw new NoSuchElementException();
        }
        return 1BK.A0r(regularImmutableSortedSet.A00);
    }

    public Object floor(Object obj) {
        if (!(this instanceof RegularImmutableSortedSet)) {
            1Du descendingIterator = headSet(obj, true).descendingIterator();
            if (descendingIterator.hasNext()) {
                return descendingIterator.next();
            }
            return null;
        }
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        int A0X = regularImmutableSortedSet.A0X(obj, true) - 1;
        if (A0X == -1) {
            return null;
        }
        return regularImmutableSortedSet.A00.get(A0X);
    }

    public Object higher(Object obj) {
        if (!(this instanceof RegularImmutableSortedSet)) {
            return 2Ri.A0D(tailSet(obj, false), (Object) null);
        }
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        int A0Y = regularImmutableSortedSet.A0Y(obj, false);
        if (A0Y == regularImmutableSortedSet.size()) {
            return null;
        }
        return regularImmutableSortedSet.A00.get(A0Y);
    }

    public Object last() {
        if (!(this instanceof RegularImmutableSortedSet)) {
            return descendingIterator().next();
        }
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        if (regularImmutableSortedSet.isEmpty()) {
            throw new NoSuchElementException();
        }
        return regularImmutableSortedSet.A00.get(regularImmutableSortedSet.size() - 1);
    }

    public Object lower(Object obj) {
        if (!(this instanceof RegularImmutableSortedSet)) {
            1Du descendingIterator = headSet(obj, false).descendingIterator();
            if (descendingIterator.hasNext()) {
                return descendingIterator.next();
            }
            return null;
        }
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        int A0X = regularImmutableSortedSet.A0X(obj, false) - 1;
        if (A0X == -1) {
            return null;
        }
        return regularImmutableSortedSet.A00.get(A0X);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw AnonymousClass001.A0p();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(toArray(), this.A01);
    }
}
