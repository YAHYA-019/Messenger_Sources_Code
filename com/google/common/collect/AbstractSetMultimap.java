package com.google.common.collect;

import X.1Xl;
import java.util.Collection;
import java.util.Set;

/* loaded from: AbstractSetMultimap.class */
public abstract class AbstractSetMultimap extends AbstractMapBasedMultimap implements 1Xl {
    public static final long serialVersionUID = 7431625294878419160L;

    public Set A0J(Iterable iterable, Object obj) {
        return (Set) super.Cfv(iterable, obj);
    }

    /* renamed from: AQq, reason: merged with bridge method [inline-methods] */
    public Set AQp() {
        return (Set) super.AQp();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* renamed from: AUh, reason: merged with bridge method [inline-methods] */
    public Set AUe(Object obj) {
        return (Set) super.AUe(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* renamed from: Cdy, reason: merged with bridge method [inline-methods] */
    public Set Cdw(Object obj) {
        return (Set) super.Cdw(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public /* bridge */ /* synthetic */ Collection Cfv(Iterable iterable, Object obj) {
        return super.Cfv(iterable, obj);
    }
}
