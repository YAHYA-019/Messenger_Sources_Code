package com.google.common.collect;

import X.0Q8;
import X.AnonymousClass001;
import X.GOp;
import X.JQx;
import X.KzK;
import com.google.common.base.Preconditions;
import com.google.common.collect.Cut;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* loaded from: ContiguousSet.class */
public abstract class ContiguousSet extends ImmutableSortedSet {
    public final KzK domain;

    public ContiguousSet(KzK kzK) {
        super(NaturalOrdering.A02);
        this.domain = kzK;
    }

    public static ContiguousSet A0E(KzK kzK, Range range) {
        Range A02;
        kzK.getClass();
        try {
            Cut cut = range.lowerBound;
            Cut.BelowAll belowAll = Cut.BelowAll.A00;
            if (cut != belowAll) {
                A02 = range;
            } else {
                Integer valueOf = Integer.valueOf((-1) << (-1));
                valueOf.getClass();
                A02 = range.A02(new Range(new Cut(valueOf), Cut.AboveAll.A00));
            }
            if (range.upperBound == Cut.AboveAll.A00) {
                Integer valueOf2 = Integer.valueOf((-1) >>> 1);
                valueOf2.getClass();
                A02 = A02.A02(new Range(belowAll, new Cut(valueOf2)));
            }
            if (!A02.lowerBound.equals(A02.upperBound)) {
                Comparable A03 = range.lowerBound.A03();
                A03.getClass();
                Comparable A022 = range.upperBound.A02();
                A022.getClass();
                if (A03.compareTo(A022) <= 0) {
                    return new RegularContiguousSet(kzK, A02);
                }
            }
            return new ContiguousSet(kzK);
        } catch (NoSuchElementException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet A0L() {
        return this instanceof EmptyContiguousSet ? ImmutableSortedSet.A0B(ReverseNaturalOrdering.A00) : new DescendingImmutableSortedSet(this);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: A0N */
    public /* bridge */ /* synthetic */ ImmutableSortedSet headSet(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return A0Y(comparable, false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: A0O */
    public /* bridge */ /* synthetic */ ImmutableSortedSet tailSet(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return A0Z(comparable, true);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: A0P */
    public /* bridge */ /* synthetic */ ImmutableSortedSet subSet(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        Preconditions.checkArgument(GOp.A1U(comparator().compare(comparable, comparable2)));
        return A0X(comparable, comparable2, true, false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: A0Q */
    public /* bridge */ /* synthetic */ ImmutableSortedSet subSet(Object obj, Object obj2, boolean z, boolean z2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        Preconditions.checkArgument(GOp.A1U(comparator().compare(comparable, comparable2)));
        return A0X(comparable, comparable2, z, z2);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: A0S */
    public /* bridge */ /* synthetic */ ImmutableSortedSet headSet(Object obj, boolean z) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return A0Y(comparable, z);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: A0U */
    public /* bridge */ /* synthetic */ ImmutableSortedSet tailSet(Object obj, boolean z) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return A0Z(comparable, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0042, code lost:
    
        if (r304 != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.common.collect.ContiguousSet A0X(java.lang.Comparable r302, java.lang.Comparable r303, boolean r304, boolean r305) {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0 instanceof com.google.common.collect.RegularContiguousSet
            r306 = r0
            r0 = r306
            if (r0 == 0) goto Lce
            r0 = r301
            r307 = r0
            r0 = r301
            com.google.common.collect.RegularContiguousSet r0 = (com.google.common.collect.RegularContiguousSet) r0
            r307 = r0
            r0 = r302
            r1 = r303
            int r0 = r0.compareTo(r1)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L41
            r0 = r304
            if (r0 != 0) goto L45
            r0 = r305
            if (r0 != 0) goto Lc6
            r0 = r307
            X.KzK r0 = r0.domain
            r308 = r0
            com.google.common.collect.EmptyContiguousSet r0 = new com.google.common.collect.EmptyContiguousSet
            r309 = r0
            r0 = r309
            r1 = r308
            r0.<init>(r1)
            r0 = r309
            return r0
        L41:
            r0 = r304
            if (r0 == 0) goto Lc6
        L45:
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.CLOSED
            r310 = r0
        L4a:
            r0 = r305
            if (r0 == 0) goto Lbe
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.CLOSED
            r308 = r0
        L54:
            com.google.common.collect.Range r0 = com.google.common.collect.Range.A00
            r309 = r0
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
            r309 = r0
            r0 = r310
            r1 = r309
            if (r0 != r1) goto Lb0
            com.google.common.collect.Cut$AboveValue r0 = new com.google.common.collect.Cut$AboveValue
            r310 = r0
            r0 = r310
            r1 = r302
            r0.<init>(r1)
        L70:
            r0 = r308
            r1 = r309
            if (r0 != r1) goto L9d
            r0 = r303
            java.lang.Class r0 = r0.getClass()
            com.google.common.collect.Cut$BelowValue r0 = new com.google.common.collect.Cut$BelowValue
            r308 = r0
            r0 = r308
            r1 = r303
            r0.<init>(r1)
        L87:
            com.google.common.collect.Range r0 = new com.google.common.collect.Range
            r309 = r0
            r0 = r309
            r1 = r310
            r2 = r308
            r0.<init>(r1, r2)
            r0 = r309
            r1 = r307
            com.google.common.collect.ContiguousSet r0 = com.google.common.collect.RegularContiguousSet.A0D(r0, r1)
            return r0
        L9d:
            r0 = r303
            java.lang.Class r0 = r0.getClass()
            com.google.common.collect.Cut$AboveValue r0 = new com.google.common.collect.Cut$AboveValue
            r308 = r0
            r0 = r308
            r1 = r303
            r0.<init>(r1)
            goto L87
        Lb0:
            com.google.common.collect.Cut$BelowValue r0 = new com.google.common.collect.Cut$BelowValue
            r310 = r0
            r0 = r310
            r1 = r302
            r0.<init>(r1)
            goto L70
        Lbe:
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
            r308 = r0
            goto L54
        Lc6:
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
            r310 = r0
            goto L4a
        Lce:
            r0 = r301
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ContiguousSet.A0X(java.lang.Comparable, java.lang.Comparable, boolean, boolean):com.google.common.collect.ContiguousSet");
    }

    public ContiguousSet A0Y(Comparable comparable, boolean z) {
        if (this instanceof RegularContiguousSet) {
            return RegularContiguousSet.A0D(Range.A01(z ? BoundType.CLOSED : BoundType.OPEN, comparable), (RegularContiguousSet) this);
        }
        return this;
    }

    public ContiguousSet A0Z(Comparable comparable, boolean z) {
        if (this instanceof RegularContiguousSet) {
            return RegularContiguousSet.A0D(Range.A00(z ? BoundType.CLOSED : BoundType.OPEN, comparable), (RegularContiguousSet) this);
        }
        return this;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public /* bridge */ /* synthetic */ NavigableSet headSet(Object obj, boolean z) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return A0Y(comparable, z);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return A0Y(comparable, false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public /* bridge */ /* synthetic */ NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        Preconditions.checkArgument(GOp.A1U(comparator().compare(comparable, comparable2)));
        return A0X(comparable, comparable2, z, z2);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        Preconditions.checkArgument(GOp.A1U(comparator().compare(comparable, comparable2)));
        return A0X(comparable, comparable2, true, false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public /* bridge */ /* synthetic */ NavigableSet tailSet(Object obj, boolean z) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return A0Z(comparable, z);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return A0Z(comparable, true);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        Integer valueOf;
        Integer valueOf2;
        if (!(this instanceof RegularContiguousSet)) {
            throw AnonymousClass001.A10();
        }
        RegularContiguousSet regularContiguousSet = (RegularContiguousSet) this;
        Cut cut = regularContiguousSet.range.lowerBound;
        if (!(cut instanceof Cut.BelowValue)) {
            if (cut instanceof Cut.BelowAll) {
                throw JQx.A0o();
            }
            if (!(cut instanceof Cut.AboveValue)) {
                throw AnonymousClass001.A0J("this statement should be unreachable");
            }
            int A03 = AnonymousClass001.A03(cut.endpoint);
            cut = (A03 == ((-1) >>> 1) || (valueOf2 = Integer.valueOf(A03 + 1)) == null) ? Cut.BelowAll.A00 : new Cut(valueOf2);
        }
        Cut cut2 = regularContiguousSet.range.upperBound;
        if (cut2 instanceof Cut.BelowValue) {
            int A032 = AnonymousClass001.A03(cut2.endpoint);
            cut2 = (A032 == ((-1) << (-1)) || (valueOf = Integer.valueOf(A032 + (-1))) == null) ? Cut.AboveAll.A00 : new Cut(valueOf);
        } else {
            if (cut2 instanceof Cut.BelowAll) {
                throw AnonymousClass001.A0J("this statement should be unreachable");
            }
            if (!(cut2 instanceof Cut.AboveValue)) {
                throw JQx.A0o();
            }
        }
        return new Range(cut, cut2).toString();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        throw 0Q8.createAndThrow();
    }
}
