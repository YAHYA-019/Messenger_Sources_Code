package com.google.common.collect;

import X.2Rj;
import com.google.common.base.Function;
import com.google.common.collect.Lists$TransformingRandomAccessList;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: Lists$TransformingRandomAccessList.class */
public class Lists$TransformingRandomAccessList extends AbstractList implements Serializable, RandomAccess {
    public static final long serialVersionUID = 0;
    public final List fromList;
    public final Function function;

    public Lists$TransformingRandomAccessList(Function function, List list) {
        list.getClass();
        this.fromList = list;
        this.function = function;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        return this.function.apply(this.fromList.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.fromList.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i) {
        final ListIterator listIterator = this.fromList.listIterator(i);
        return new 2Rj(listIterator) { // from class: X.2hh
            public Object A00(Object obj) {
                return Lists$TransformingRandomAccessList.this.function.apply(obj);
            }
        };
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i) {
        return this.function.apply(this.fromList.remove(i));
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        this.fromList.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.fromList.size();
    }
}
