package com.google.common.collect;

import X.1NS;
import X.C5ps;
import X.MQm;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSortedMultiset;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

/* loaded from: RegularImmutableSortedMultiset.class */
public final class RegularImmutableSortedMultiset extends ImmutableSortedMultiset {
    public final transient int A00;
    public final transient int A01;
    public final transient RegularImmutableSortedSet A02;
    public final transient long[] A03;
    public static final long[] A05 = {0};
    public static final ImmutableSortedMultiset A04 = new RegularImmutableSortedMultiset(NaturalOrdering.A02);

    public RegularImmutableSortedMultiset(RegularImmutableSortedSet regularImmutableSortedSet, long[] jArr, int i, int i2) {
        this.A02 = regularImmutableSortedSet;
        this.A03 = jArr;
        this.A01 = i;
        this.A00 = i2;
    }

    public RegularImmutableSortedMultiset(Comparator comparator) {
        this.A02 = ImmutableSortedSet.A0B(comparator);
        this.A03 = A05;
        this.A01 = 0;
        this.A00 = 0;
    }

    public static ImmutableSortedMultiset A00(RegularImmutableSortedMultiset regularImmutableSortedMultiset, int i, int i2) {
        int i3 = regularImmutableSortedMultiset.A00;
        Preconditions.checkPositionIndexes(i, i2, i3);
        if (i != i2) {
            return (i == 0 && i2 == i3) ? regularImmutableSortedMultiset : new RegularImmutableSortedMultiset(regularImmutableSortedMultiset.A02.A0Z(i, i2), regularImmutableSortedMultiset.A03, regularImmutableSortedMultiset.A01 + i, i2 - i);
        }
        Comparator comparator = regularImmutableSortedMultiset.A0P().comparator();
        return NaturalOrdering.A02.equals(comparator) ? A04 : new RegularImmutableSortedMultiset(comparator);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean A0H() {
        boolean z = true;
        if (this.A01 <= 0 && this.A00 >= this.A03.length - 1) {
            z = false;
        }
        return z;
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public /* bridge */ /* synthetic */ ImmutableSet A0J() {
        return this.A02;
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public C5ps A0L(int i) {
        Object obj = this.A02.A00.get(i);
        long[] jArr = this.A03;
        int i2 = this.A01 + i;
        return new Multisets$ImmutableEntry(obj, (int) (jArr[i2 + 1] - jArr[i2]));
    }

    @Override // X.C4u1
    public int AIN(Object obj) {
        RegularImmutableSortedSet regularImmutableSortedSet = this.A02;
        if (obj == null) {
            return 0;
        }
        try {
            int binarySearch = Collections.binarySearch(regularImmutableSortedSet.A00, obj, regularImmutableSortedSet.A01);
            if (binarySearch < 0) {
                return 0;
            }
            long[] jArr = this.A03;
            int i = this.A01 + binarySearch;
            return (int) (jArr[i + 1] - jArr[i]);
        } catch (ClassCastException unused) {
            return 0;
        }
    }

    @Override // X.MQm
    /* renamed from: APA */
    public /* bridge */ /* synthetic */ NavigableSet APB() {
        return this.A02;
    }

    @Override // X.C4u1
    public /* bridge */ /* synthetic */ Set APB() {
        return this.A02;
    }

    @Override // X.MQm
    public C5ps ATE() {
        if (isEmpty()) {
            return null;
        }
        return A0L(0);
    }

    @Override // X.MQm
    public /* bridge */ /* synthetic */ MQm BNq(BoundType boundType, Object obj) {
        return A0N(boundType, obj);
    }

    @Override // X.MQm
    public C5ps BXi() {
        if (isEmpty()) {
            return null;
        }
        return A0L(this.A00 - 1);
    }

    @Override // X.MQm
    public /* bridge */ /* synthetic */ MQm D3y(BoundType boundType, Object obj) {
        return A0O(boundType, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.C4u1
    public int size() {
        long[] jArr = this.A03;
        int i = this.A01;
        return 1NS.A01(jArr[this.A00 + i] - jArr[i]);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new ImmutableSortedMultiset.SerializedForm(this);
    }
}
