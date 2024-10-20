package com.google.common.collect;

import X.4eK;
import X.4uO;
import X.K9K;
import X.K9L;
import X.K9M;
import X.K9N;
import com.google.common.base.Supplier;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: Multimaps$CustomListMultimap.class */
public class Multimaps$CustomListMultimap extends AbstractListMultimap {
    public static final long serialVersionUID = 0;
    public transient Supplier A00;

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Object readObject = objectInputStream.readObject();
        readObject.getClass();
        this.A00 = (Supplier) readObject;
        Object readObject2 = objectInputStream.readObject();
        readObject2.getClass();
        A0I((Map) readObject2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.A00);
        objectOutputStream.writeObject(this.A01);
    }

    public Map A0D() {
        Map map = this.A01;
        return map instanceof NavigableMap ? new K9K(this, (NavigableMap) map) : map instanceof SortedMap ? new K9L(this, (SortedMap) map) : new 4uO(this, map);
    }

    public Set A0E() {
        Map map = this.A01;
        return map instanceof NavigableMap ? new K9M(this, (NavigableMap) map) : map instanceof SortedMap ? new K9N(this, (SortedMap) map) : new 4eK(this, map);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public /* bridge */ /* synthetic */ Collection A0F() {
        return (Collection) this.A00.get();
    }
}
