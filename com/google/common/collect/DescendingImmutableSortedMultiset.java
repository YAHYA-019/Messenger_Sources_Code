package com.google.common.collect;

import X.C5ps;
import X.MQm;
import com.google.common.collect.ImmutableSortedMultiset;
import java.util.NavigableSet;
import java.util.Set;

/* loaded from: DescendingImmutableSortedMultiset.class */
public final class DescendingImmutableSortedMultiset extends ImmutableSortedMultiset {
    public final transient ImmutableSortedMultiset A00;

    public DescendingImmutableSortedMultiset(ImmutableSortedMultiset immutableSortedMultiset) {
        this.A00 = immutableSortedMultiset;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean A0H() {
        return this.A00.A0H();
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public /* bridge */ /* synthetic */ ImmutableSet A0J() {
        return A0P();
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public C5ps A0L(int i) {
        return (C5ps) this.A00.entrySet().asList().reverse().get(i);
    }

    @Override // X.C4u1
    public int AIN(Object obj) {
        return this.A00.AIN(obj);
    }

    @Override // X.MQm
    /* renamed from: APA */
    public /* bridge */ /* synthetic */ NavigableSet APB() {
        return A0P();
    }

    @Override // X.C4u1
    public /* bridge */ /* synthetic */ Set APB() {
        return A0P();
    }

    @Override // X.MQm
    public C5ps ATE() {
        return this.A00.BXi();
    }

    @Override // X.MQm
    public /* bridge */ /* synthetic */ MQm BNq(BoundType boundType, Object obj) {
        return A0N(boundType, obj);
    }

    @Override // X.MQm
    public C5ps BXi() {
        return this.A00.ATE();
    }

    @Override // X.MQm
    public /* bridge */ /* synthetic */ MQm D3y(BoundType boundType, Object obj) {
        return A0O(boundType, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.C4u1
    public int size() {
        return this.A00.size();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new ImmutableSortedMultiset.SerializedForm(this);
    }
}
