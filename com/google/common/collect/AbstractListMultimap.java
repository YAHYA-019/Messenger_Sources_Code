package com.google.common.collect;

import X.1Mv;
import java.util.Collection;
import java.util.List;

/* loaded from: AbstractListMultimap.class */
public abstract class AbstractListMultimap extends AbstractMapBasedMultimap implements 1Mv {
    public static final long serialVersionUID = 6588350623831699109L;

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* renamed from: AUg, reason: merged with bridge method [inline-methods] */
    public List AUe(Object obj) {
        return (List) super.AUe(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* renamed from: Cdx, reason: merged with bridge method [inline-methods] */
    public List Cdw(Object obj) {
        return (List) super.Cdw(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public /* bridge */ /* synthetic */ Collection Cfv(Iterable iterable, Object obj) {
        return super.Cfv(iterable, obj);
    }
}
