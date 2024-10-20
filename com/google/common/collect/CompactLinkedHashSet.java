package com.google.common.collect;

import X.1Dz;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* loaded from: CompactLinkedHashSet.class */
public class CompactLinkedHashSet extends CompactHashSet {
    public transient int A00;
    public transient int[] A01;
    public transient int[] A02;
    public transient int A03;

    private void A00(int i, int i2) {
        if (i == -2) {
            this.A00 = i2;
        } else {
            int[] iArr = this.A02;
            iArr.getClass();
            iArr[i] = i2 + 1;
        }
        if (i2 == -2) {
            this.A03 = i;
            return;
        }
        int[] iArr2 = this.A01;
        iArr2.getClass();
        iArr2[i2] = i + 1;
    }

    @Override // com.google.common.collect.CompactHashSet
    public int A01() {
        int A01 = super.A01();
        this.A01 = new int[A01];
        this.A02 = new int[A01];
        return A01;
    }

    @Override // com.google.common.collect.CompactHashSet
    public Set A03() {
        Set A03 = super.A03();
        this.A01 = null;
        this.A02 = null;
        return A03;
    }

    @Override // com.google.common.collect.CompactHashSet
    public void A04(int i) {
        super.A04(i);
        this.A00 = -2;
        this.A03 = -2;
    }

    @Override // com.google.common.collect.CompactHashSet
    public void A05(int i) {
        super.A05(i);
        int[] iArr = this.A01;
        iArr.getClass();
        this.A01 = Arrays.copyOf(iArr, i);
        int[] iArr2 = this.A02;
        iArr2.getClass();
        this.A02 = Arrays.copyOf(iArr2, i);
    }

    @Override // com.google.common.collect.CompactHashSet
    public void A06(int i, int i2) {
        int size = size() - 1;
        super.A06(i, i2);
        this.A01.getClass();
        A00(r0[i] - 1, A02(i));
        if (i < size) {
            this.A01.getClass();
            A00(r0[size] - 1, i);
            A00(i, A02(size));
        }
        int[] iArr = this.A01;
        iArr.getClass();
        iArr[size] = 0;
        int[] iArr2 = this.A02;
        iArr2.getClass();
        iArr2[size] = 0;
    }

    @Override // com.google.common.collect.CompactHashSet
    public void A07(Object obj, int i, int i2, int i3) {
        super.A07(obj, i, i2, i3);
        A00(this.A03, i);
        A00(i, -2);
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (super.A01 != null) {
            this.A00 = -2;
            this.A03 = -2;
            int[] iArr = this.A01;
            if (iArr != null && this.A02 != null) {
                Arrays.fill(iArr, 0, size(), 0);
                Arrays.fill(this.A02, 0, size(), 0);
            }
            super.clear();
        }
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        Object[] objArr = new Object[size()];
        Iterator<E> it = iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return objArr;
            }
            objArr[i2] = it.next();
            i = i2 + 1;
        }
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        return 1Dz.A01(this, objArr);
    }
}
