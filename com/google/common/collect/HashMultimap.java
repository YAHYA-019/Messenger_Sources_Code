package com.google.common.collect;

import X.1Mu;
import X.L9Q;
import com.google.common.base.Preconditions;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* loaded from: HashMultimap.class */
public final class HashMultimap extends HashMultimapGwtSerializationDependencies {
    public static final long serialVersionUID = 0;
    public transient int A00;

    public HashMultimap() {
        this(12, 2);
    }

    public HashMultimap(int i, int i2) {
        CompactHashMap compactHashMap = new CompactHashMap(i);
        Preconditions.checkArgument(compactHashMap.isEmpty());
        this.A01 = compactHashMap;
        this.A00 = 2;
        Preconditions.checkArgument(i2 >= 0);
        this.A00 = i2;
    }

    public HashMultimap(1Mu r302) {
        CompactHashMap compactHashMap = new CompactHashMap(r302.keySet().size());
        Preconditions.checkArgument(compactHashMap.isEmpty());
        this.A01 = compactHashMap;
        this.A00 = 2;
        Ca0(r302);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.A00 = 2;
        int readInt = objectInputStream.readInt();
        A0I(new CompactHashMap(12));
        L9Q.A01(this, objectInputStream, readInt);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        L9Q.A02(this, objectOutputStream);
    }
}
