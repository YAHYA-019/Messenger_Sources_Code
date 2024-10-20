package com.google.common.collect;

import X.0Pz;
import X.1BJ;
import X.1Du;
import X.1NS;
import X.AnonymousClass001;
import X.C52z;
import X.JR1;
import X.K9c;
import X.KzK;
import com.google.common.base.Preconditions;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: RegularContiguousSet.class */
public final class RegularContiguousSet extends ContiguousSet {
    public static final long serialVersionUID = 0;
    public final Range range;

    /* loaded from: RegularContiguousSet$SerializedForm.class */
    public final class SerializedForm implements Serializable {
        public final KzK domain;
        public final Range range;

        public SerializedForm(KzK kzK, Range range) {
            this.range = range;
            this.domain = kzK;
        }

        private Object readResolve() {
            return new RegularContiguousSet(this.domain, this.range);
        }
    }

    public RegularContiguousSet(KzK kzK, Range range) {
        super(kzK);
        this.range = range;
    }

    public static ContiguousSet A0D(Range range, RegularContiguousSet regularContiguousSet) {
        Range range2 = regularContiguousSet.range;
        if (range2.lowerBound.A00(range.upperBound) > 0 || range.lowerBound.A00(range2.upperBound) > 0) {
            return new ContiguousSet(regularContiguousSet.domain);
        }
        return ContiguousSet.A0E(regularContiguousSet.domain, regularContiguousSet.range.A02(range));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean A0H() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet
    public ImmutableList A0J() {
        return this.domain.supportsFastOffset ? new ImmutableAsList() { // from class: com.google.common.collect.RegularContiguousSet.3
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.google.common.collect.ImmutableAsList
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public RegularContiguousSet A0J() {
                return RegularContiguousSet.this;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.List
            /* renamed from: A01, reason: merged with bridge method [inline-methods] */
            public Integer get(int i) {
                Preconditions.checkElementIndex(i, size());
                Object A03 = RegularContiguousSet.this.range.lowerBound.A03();
                A03.getClass();
                long j = i;
                Number number = (Number) A03;
                if (j >= 0) {
                    return Integer.valueOf(1NS.A00(number.longValue() + j));
                }
                throw AnonymousClass001.A0L(0Pz.A0g("distance", 1BJ.A00(592), j));
            }

            @Override // com.google.common.collect.ImmutableAsList, com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            public Object writeReplace() {
                return super.writeReplace();
            }
        } : super.A0J();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public /* bridge */ /* synthetic */ ImmutableSortedSet A0R(Object obj, Object obj2, boolean z, boolean z2) {
        return A0X((Comparable) obj, (Comparable) obj2, z, z2);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public /* bridge */ /* synthetic */ ImmutableSortedSet A0T(Object obj, boolean z) {
        return A0Y((Comparable) obj, z);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public /* bridge */ /* synthetic */ ImmutableSortedSet A0V(Object obj, boolean z) {
        return A0Z((Comparable) obj, z);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: A0W */
    public 1Du descendingIterator() {
        return new K9c(this, JR1.A0k(this), 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        if (r0.upperBound.A06(r0) != false) goto L20;
     */
    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean contains(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r302
            java.lang.Comparable r0 = (java.lang.Comparable) r0     // Catch: java.lang.ClassCastException -> L42
            r302 = r0
            r0 = r301
            com.google.common.collect.Range r0 = r0.range     // Catch: java.lang.ClassCastException -> L42
            r303 = r0
            r0 = r302
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.ClassCastException -> L42
            r0 = r303
            com.google.common.collect.Cut r0 = r0.lowerBound     // Catch: java.lang.ClassCastException -> L42
            r304 = r0
            r0 = r304
            r1 = r302
            boolean r0 = r0.A06(r1)     // Catch: java.lang.ClassCastException -> L42
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L3a
            r0 = r303
            com.google.common.collect.Cut r0 = r0.upperBound     // Catch: java.lang.ClassCastException -> L42
            r304 = r0
            r0 = r304
            r1 = r302
            boolean r0 = r0.A06(r1)     // Catch: java.lang.ClassCastException -> L42
            r306 = r0
            r0 = 1
            r305 = r0
            r0 = r306
            if (r0 == 0) goto L3f
        L3a:
            r0 = 0
            r305 = r0
            r0 = 0
            r304 = r0
        L3f:
            r0 = r305
            return r0
        L42:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.RegularContiguousSet.contains(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        return C52z.A01(this, collection);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public /* bridge */ /* synthetic */ Iterator descendingIterator() {
        return descendingIterator();
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof RegularContiguousSet) {
                RegularContiguousSet regularContiguousSet = (RegularContiguousSet) obj;
                if (this.domain.equals(regularContiguousSet.domain)) {
                    Comparable A03 = this.range.lowerBound.A03();
                    A03.getClass();
                    Comparable A032 = regularContiguousSet.range.lowerBound.A03();
                    A032.getClass();
                    if (!A03.equals(A032) || !JR1.A0k(this).equals(JR1.A0k(regularContiguousSet))) {
                        return false;
                    }
                }
            }
            return super.equals(obj);
        }
        return true;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ Object first() {
        Comparable A03 = this.range.lowerBound.A03();
        A03.getClass();
        return A03;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public 1Du iterator() {
        Comparable A03 = this.range.lowerBound.A03();
        A03.getClass();
        return new K9c(this, A03, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ Object last() {
        return JR1.A0k(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        this.range.lowerBound.A03().getClass();
        long A03 = AnonymousClass001.A03(JR1.A0k(this)) - ((Number) r0).intValue();
        return A03 >= 2147483647L ? (-1) >>> 1 : ((int) A03) + 1;
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this.domain, this.range);
    }
}
