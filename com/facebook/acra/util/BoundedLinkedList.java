package com.facebook.acra.util;

import X.AnonymousClass001;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: BoundedLinkedList.class */
public class BoundedLinkedList extends LinkedList {
    public int maxSize;

    public BoundedLinkedList(int i) {
        this.maxSize = i;
    }

    @Override // java.util.LinkedList, java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        if (size() == this.maxSize) {
            removeFirst();
        }
        super.add(i, obj);
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
    public boolean add(Object obj) {
        if (size() == this.maxSize) {
            removeFirst();
        }
        return super.add(obj);
    }

    @Override // java.util.LinkedList, java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public boolean addAll(Collection collection) {
        int size = (size() + collection.size()) - this.maxSize;
        if (size > 0) {
            removeRange(0, size);
        }
        return super.addAll(collection);
    }

    @Override // java.util.LinkedList, java.util.Deque
    public void addFirst(Object obj) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.LinkedList, java.util.Deque
    public void addLast(Object obj) {
        add(obj);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            Object next = it.next();
            A0k.append(next == null ? "null" : next.toString());
        }
        return A0k.toString();
    }
}
