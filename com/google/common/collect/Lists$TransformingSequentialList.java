package com.google.common.collect;

import X.2Rj;
import com.google.common.base.Function;
import com.google.common.collect.Lists$TransformingSequentialList;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: Lists$TransformingSequentialList.class */
public class Lists$TransformingSequentialList extends AbstractSequentialList implements Serializable {
    public static final long serialVersionUID = 0;
    public final List fromList;
    public final Function function;

    public Lists$TransformingSequentialList(Function function, List list) {
        list.getClass();
        this.fromList = list;
        this.function = function;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.fromList.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i) {
        final ListIterator listIterator = this.fromList.listIterator(i);
        return new 2Rj(listIterator) { // from class: X.3ty
            public Object A00(Object obj) {
                return Lists$TransformingSequentialList.this.function.apply(obj);
            }
        };
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
