package com.google.common.collect;

import X.1nB;
import X.2Ri;
import X.C1Jp;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* loaded from: EvictingQueue.class */
public final class EvictingQueue extends 1nB implements Queue, Serializable {
    public static final long serialVersionUID = 0;
    public final Queue delegate;
    public final int maxSize;

    public EvictingQueue() {
    }

    public EvictingQueue(int i) {
        Preconditions.checkArgument(i >= 0, "maxSize (%s) must >= 0", i);
        this.delegate = new ArrayDeque(i);
        this.maxSize = i;
    }

    public /* bridge */ /* synthetic */ Object A01() {
        return this.delegate;
    }

    public /* bridge */ /* synthetic */ Collection A02() {
        return this.delegate;
    }

    @Override // java.util.Queue, java.util.Collection
    public boolean add(Object obj) {
        obj.getClass();
        if (this.maxSize != 0) {
            if (size() == this.maxSize) {
                this.delegate.remove();
            }
            this.delegate.add(obj);
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        int size = collection.size();
        if (size < this.maxSize) {
            return C1Jp.A02(this, collection.iterator());
        }
        clear();
        return 2Ri.A0H(2Ri.A05(collection, size - this.maxSize), this);
    }

    @Override // java.util.Queue
    public Object element() {
        return this.delegate.element();
    }

    @Override // java.util.Queue
    public boolean offer(Object obj) {
        return add(obj);
    }

    @Override // java.util.Queue
    public Object peek() {
        return this.delegate.peek();
    }

    @Override // java.util.Queue
    public Object poll() {
        return this.delegate.poll();
    }

    @Override // java.util.Queue
    public Object remove() {
        return this.delegate.remove();
    }
}
