package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: J7U.class */
public final class J7U extends LinkedList {
    @Override // java.util.LinkedList, java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        11T.A0F((Object) null, 1);
        throw 0Q8.createAndThrow();
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        11T.A0F((Object) null, 0);
        throw 0Q8.createAndThrow();
    }

    @Override // java.util.LinkedList, java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        11T.A0F(collection, 1);
        int i2 = 0;
        if (i < 0) {
            return false;
        }
        LinkedList linkedList = new LinkedList(this);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            it.next();
            linkedList.remove((Object) null);
        }
        int min = Math.min(linkedList.size(), i);
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            it2.next();
            linkedList.add(min + i2, null);
            i2++;
        }
        super.clear();
        return super.addAll(linkedList);
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public boolean addAll(Collection collection) {
        11T.A0F(collection, 0);
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next();
        11T.A0F((Object) null, 0);
        throw 0Q8.createAndThrow();
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final /* bridge */ boolean contains(Object obj) {
        return false;
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        return -1;
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        return -1;
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final /* bridge */ boolean remove(Object obj) {
        return false;
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final /* bridge */ int size() {
        return super.size();
    }
}
