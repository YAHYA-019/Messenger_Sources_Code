package com.google.common.collect;

import com.google.common.base.Preconditions;

/* loaded from: RegularImmutableList.class */
public class RegularImmutableList extends ImmutableList {
    public static final ImmutableList A02 = new RegularImmutableList(new Object[0], 0);
    public final transient Object[] A00;
    public final transient int A01;

    public RegularImmutableList(Object[] objArr, int i) {
        this.A00 = objArr;
        this.A01 = i;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int A0F() {
        return this.A01;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int A0G() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean A0H() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object[] A0I() {
        return this.A00;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] objArr, int i) {
        Object[] objArr2 = this.A00;
        int i2 = this.A01;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // java.util.List
    public Object get(int i) {
        Preconditions.checkElementIndex(i, this.A01);
        Object obj = this.A00[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.A01;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
