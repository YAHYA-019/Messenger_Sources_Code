package com.google.common.collect;

import X.1BK;
import X.1Ms;
import X.2Iz;
import X.2J0;
import X.5D1;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: AbstractMapBasedMultimap.class */
public abstract class AbstractMapBasedMultimap extends 1Ms implements Serializable {
    public static final long serialVersionUID = 2447537837011683357L;
    public transient int A00;
    public transient Map A01;

    public Collection A0F() {
        return this instanceof ArrayListMultimap ? new ArrayList(((ArrayListMultimap) this).A00) : new CompactHashSet(((HashMultimap) this).A00);
    }

    public Collection A0G(Object obj) {
        return A0F();
    }

    public Collection A0H(Object obj, Collection collection) {
        if (!(this instanceof AbstractListMultimap)) {
            return new 5D1(this, obj, (Set) collection);
        }
        List list = (List) collection;
        return list instanceof RandomAccess ? new 2Iz((2J0) null, this, obj, list) : new 2Iz((2J0) null, this, obj, list);
    }

    public final void A0I(Map map) {
        this.A01 = map;
        this.A00 = 0;
        Iterator A1A = 1BK.A1A(map);
        while (A1A.hasNext()) {
            Collection collection = (Collection) A1A.next();
            Preconditions.checkArgument(!collection.isEmpty());
            this.A00 += collection.size();
        }
    }

    public Collection AUe(Object obj) {
        Collection collection = (Collection) this.A01.get(obj);
        if (collection == null) {
            collection = A0G(obj);
        }
        return A0H(obj, collection);
    }

    public Collection Cdw(Object obj) {
        Collection collection = (Collection) this.A01.remove(obj);
        if (collection == null) {
            return this instanceof AbstractSetMultimap ? Collections.emptySet() : Collections.emptyList();
        }
        Collection A0F = A0F();
        A0F.addAll(collection);
        this.A00 -= collection.size();
        collection.clear();
        return this instanceof AbstractSetMultimap ? Collections.unmodifiableSet((Set) A0F) : Collections.unmodifiableList((List) A0F);
    }

    public Collection Cfv(Iterable iterable, Object obj) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return Cdw(obj);
        }
        Collection collection = (Collection) this.A01.get(obj);
        if (collection == null) {
            collection = A0G(obj);
            this.A01.put(obj, collection);
        }
        Collection A0F = A0F();
        A0F.addAll(collection);
        this.A00 -= collection.size();
        collection.clear();
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                this.A00++;
            }
        }
        return this instanceof AbstractSetMultimap ? Collections.unmodifiableSet((Set) A0F) : Collections.unmodifiableList((List) A0F);
    }

    public void clear() {
        Iterator it = this.A01.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.A01.clear();
        this.A00 = 0;
    }

    public boolean containsKey(Object obj) {
        return this.A01.containsKey(obj);
    }

    public int size() {
        return this.A00;
    }
}
