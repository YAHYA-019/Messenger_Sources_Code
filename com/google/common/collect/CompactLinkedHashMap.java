package com.google.common.collect;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: CompactLinkedHashMap.class */
public class CompactLinkedHashMap extends CompactHashMap {
    public transient long[] A00;
    public transient int A01;
    public transient int A02;
    public final boolean accessOrder;

    public CompactLinkedHashMap() {
        this(3);
    }

    public CompactLinkedHashMap(int i) {
        super(i);
        this.accessOrder = false;
    }

    private void A02(int i, int i2) {
        if (i == -2) {
            this.A01 = i2;
        } else {
            long[] jArr = this.A00;
            jArr.getClass();
            long j = (jArr[i] & (-4294967296L)) | ((i2 + 1) & 4294967295L);
            long[] jArr2 = this.A00;
            jArr2.getClass();
            jArr2[i] = j;
        }
        if (i2 == -2) {
            this.A02 = i;
            return;
        }
        long[] jArr3 = this.A00;
        jArr3.getClass();
        long j2 = (jArr3[i2] & 4294967295L) | ((i + 1) << 32);
        long[] jArr4 = this.A00;
        jArr4.getClass();
        jArr4[i2] = j2;
    }

    @Override // com.google.common.collect.CompactHashMap
    public int A04() {
        int A04 = super.A04();
        this.A00 = new long[A04];
        return A04;
    }

    @Override // com.google.common.collect.CompactHashMap
    public int A05() {
        return this.A01;
    }

    @Override // com.google.common.collect.CompactHashMap
    public int A06(int i) {
        this.A00.getClass();
        return ((int) r0[i]) - 1;
    }

    @Override // com.google.common.collect.CompactHashMap
    public int A07(int i, int i2) {
        return i >= size() ? i2 : i;
    }

    @Override // com.google.common.collect.CompactHashMap
    public LinkedHashMap A08(int i) {
        return new LinkedHashMap(i, 1.0f, this.accessOrder);
    }

    @Override // com.google.common.collect.CompactHashMap
    public Map A09() {
        Map A09 = super.A09();
        this.A00 = null;
        return A09;
    }

    @Override // com.google.common.collect.CompactHashMap
    public void A0A(int i) {
        if (this.accessOrder) {
            this.A00.getClass();
            A02(((int) (r0[i] >>> 32)) - 1, A06(i));
            A02(this.A02, i);
            A02(i, -2);
            super.A00 += 32;
        }
    }

    @Override // com.google.common.collect.CompactHashMap
    public void A0B(int i) {
        super.A0B(i);
        this.A01 = -2;
        this.A02 = -2;
    }

    @Override // com.google.common.collect.CompactHashMap
    public void A0C(int i) {
        super.A0C(i);
        long[] jArr = this.A00;
        jArr.getClass();
        this.A00 = Arrays.copyOf(jArr, i);
    }

    @Override // com.google.common.collect.CompactHashMap
    public void A0D(int i, int i2) {
        int size = size() - 1;
        super.A0D(i, i2);
        this.A00.getClass();
        A02(((int) (r0[i] >>> 32)) - 1, A06(i));
        if (i < size) {
            this.A00.getClass();
            A02(((int) (r0[size] >>> 32)) - 1, i);
            A02(i, A06(size));
        }
        long[] jArr = this.A00;
        jArr.getClass();
        jArr[size] = 0;
    }

    @Override // com.google.common.collect.CompactHashMap
    public void A0E(Object obj, int i, Object obj2, int i2, int i3) {
        super.A0E(obj, i, obj2, i2, i3);
        A02(this.A02, i);
        A02(i, -2);
    }

    @Override // com.google.common.collect.CompactHashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        if (super.A02 != null) {
            this.A01 = -2;
            this.A02 = -2;
            long[] jArr = this.A00;
            if (jArr != null) {
                Arrays.fill(jArr, 0, size(), 0L);
            }
            super.clear();
        }
    }
}
