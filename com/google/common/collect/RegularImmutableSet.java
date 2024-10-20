package com.google.common.collect;

import X.1Du;
import X.1FW;
import java.util.Iterator;

/* loaded from: RegularImmutableSet.class */
public final class RegularImmutableSet extends ImmutableSet {
    public static final RegularImmutableSet A05;
    public static final Object[] A06;
    public final transient int A00;
    public final transient Object[] A01;
    public final transient Object[] A02;
    public final transient int A03;
    public final transient int A04;

    static {
        Object[] objArr = new Object[0];
        A06 = objArr;
        A05 = new RegularImmutableSet(objArr, objArr, 0, 0, 0);
    }

    public RegularImmutableSet(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        this.A01 = objArr;
        this.A03 = i;
        this.A02 = objArr2;
        this.A04 = i2;
        this.A00 = i3;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object[] A0I() {
        return this.A01;
    }

    @Override // com.google.common.collect.ImmutableSet
    public ImmutableList A0J() {
        return ImmutableList.asImmutableList(this.A01, this.A00);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.A02;
        boolean z = false;
        if (obj != null && objArr.length != 0) {
            int A01 = 1FW.A01(obj.hashCode());
            while (true) {
                int i = A01 & this.A04;
                Object obj2 = objArr[i];
                if (obj2 == null) {
                    break;
                }
                if (obj2.equals(obj)) {
                    z = true;
                    break;
                }
                A01 = i + 1;
            }
        }
        return z;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] objArr, int i) {
        Object[] objArr2 = this.A01;
        int i2 = this.A00;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.A03;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public 1Du iterator() {
        return asList().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return asList().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.A00;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
