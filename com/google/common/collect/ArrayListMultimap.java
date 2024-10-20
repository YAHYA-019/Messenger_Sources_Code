package com.google.common.collect;

import X.1Fg;
import X.1Mu;
import X.L9Q;
import com.google.common.base.Preconditions;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* loaded from: ArrayListMultimap.class */
public final class ArrayListMultimap extends ArrayListMultimapGwtSerializationDependencies {
    public static final long serialVersionUID = 0;
    public transient int A00;

    public ArrayListMultimap() {
        CompactHashMap compactHashMap = new CompactHashMap(12);
        Preconditions.checkArgument(compactHashMap.isEmpty());
        this.A01 = compactHashMap;
        this.A00 = 3;
    }

    public ArrayListMultimap(1Mu r302) {
        int size = r302.keySet().size();
        int i = r302 instanceof ArrayListMultimap ? ((ArrayListMultimap) r302).A00 : 3;
        CompactHashMap compactHashMap = new CompactHashMap(size);
        Preconditions.checkArgument(compactHashMap.isEmpty());
        this.A01 = compactHashMap;
        1Fg.A00(i, "expectedValuesPerKey");
        this.A00 = i;
        Ca0(r302);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.A00 = 3;
        int readInt = objectInputStream.readInt();
        A0I(new CompactHashMap());
        L9Q.A01(this, objectInputStream, readInt);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        L9Q.A02(this, objectOutputStream);
    }
}
