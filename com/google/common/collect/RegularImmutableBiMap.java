package com.google.common.collect;

import X.0Q8;
import X.7Kb;
import X.C5f2;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;

/* loaded from: RegularImmutableBiMap.class */
public final class RegularImmutableBiMap extends ImmutableBiMap {
    public static final RegularImmutableBiMap A05 = new RegularImmutableBiMap();
    public final transient RegularImmutableBiMap A00;
    public final transient Object[] A01;
    public final transient int A02;
    public final transient int A03;
    public final transient Object A04;

    public RegularImmutableBiMap() {
        this.A04 = null;
        this.A01 = new Object[0];
        this.A02 = 0;
        this.A03 = 0;
        this.A00 = this;
    }

    public RegularImmutableBiMap(RegularImmutableBiMap regularImmutableBiMap, Object obj, Object[] objArr, int i) {
        this.A04 = obj;
        this.A01 = objArr;
        this.A02 = 1;
        this.A03 = i;
        this.A00 = regularImmutableBiMap;
    }

    public RegularImmutableBiMap(Object[] objArr, int i) {
        this.A01 = objArr;
        this.A03 = i;
        this.A02 = 0;
        int A00 = i >= 2 ? ImmutableSet.A00(i) : 0;
        Object A02 = RegularImmutableMap.A02(objArr, i, A00, 0);
        if (!(A02 instanceof Object[])) {
            this.A04 = A02;
            A02 = RegularImmutableMap.A02(objArr, i, A00, 1);
            if (!(A02 instanceof Object[])) {
                this.A00 = new RegularImmutableBiMap(this, A02, objArr, i);
                return;
            }
        }
        throw ((7Kb) ((Object[]) A02)[2]).A00();
    }

    public RegularImmutableBiMap A00() {
        return this.A00;
    }

    @Override // X.C5f2
    public /* bridge */ /* synthetic */ C5f2 BPy() {
        throw 0Q8.createAndThrow();
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet createEntrySet() {
        return new RegularImmutableMap.EntrySet(this, this.A01, this.A02, this.A03);
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet createKeySet() {
        return new RegularImmutableMap.KeySet(new RegularImmutableMap.KeysOrValuesAsList(this.A01, this.A02, this.A03), this);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public Object get(Object obj) {
        Object A01 = RegularImmutableMap.A01(this.A04, obj, this.A01, this.A03, this.A02);
        if (A01 == null) {
            A01 = null;
        }
        return A01;
    }

    @Override // com.google.common.collect.ImmutableMap
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.A03;
    }

    @Override // com.google.common.collect.ImmutableBiMap, com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return new ImmutableMap.SerializedForm(this);
    }
}
