package com.google.common.collect;

import X.4uU;
import X.5Px;
import X.AnonymousClass001;
import X.KAz;
import X.LsW;
import com.google.common.base.Preconditions;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: LinkedHashMultimap.class */
public final class LinkedHashMultimap extends LinkedHashMultimapGwtSerializationDependencies {
    public static final long serialVersionUID = 1;
    public transient int A00;
    public transient ValueEntry A01;

    /* loaded from: LinkedHashMultimap$ValueEntry.class */
    public final class ValueEntry extends ImmutableEntry implements 5Px {
        public ValueEntry nextInValueBucket;
        public ValueEntry predecessorInMultimap;
        public 5Px predecessorInValueSet;
        public final int smearedValueHash;
        public ValueEntry successorInMultimap;
        public 5Px successorInValueSet;

        public ValueEntry(ValueEntry valueEntry, Object obj, Object obj2, int i) {
            super(obj, obj2);
            this.smearedValueHash = i;
            this.nextInValueBucket = valueEntry;
        }

        public 5Px A00() {
            5Px r0 = this.predecessorInValueSet;
            r0.getClass();
            return r0;
        }

        public 5Px BDY() {
            5Px r0 = this.successorInValueSet;
            r0.getClass();
            return r0;
        }

        public void Ct4(5Px r302) {
            this.predecessorInValueSet = r302;
        }

        public void Cuz(5Px r302) {
            this.successorInValueSet = r302;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.common.collect.AbstractMapBasedMultimap, java.lang.Object, com.google.common.collect.LinkedHashMultimap] */
    public static LinkedHashMultimap A00() {
        CompactLinkedHashMap compactLinkedHashMap = new CompactLinkedHashMap(16);
        ?? obj = new Object();
        Preconditions.checkArgument(compactLinkedHashMap.isEmpty());
        obj.A01 = compactLinkedHashMap;
        obj.A00 = 2;
        obj.A00 = 2;
        ValueEntry valueEntry = new ValueEntry(null, null, null, 0);
        obj.A01 = valueEntry;
        valueEntry.successorInMultimap = valueEntry;
        valueEntry.predecessorInMultimap = valueEntry;
        return obj;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        ValueEntry valueEntry = new ValueEntry(null, null, null, 0);
        this.A01 = valueEntry;
        valueEntry.successorInMultimap = valueEntry;
        valueEntry.predecessorInMultimap = valueEntry;
        this.A00 = 2;
        int readInt = objectInputStream.readInt();
        CompactLinkedHashMap compactLinkedHashMap = new CompactLinkedHashMap(12);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= readInt) {
                break;
            }
            Object readObject = objectInputStream.readObject();
            compactLinkedHashMap.put(readObject, A0G(readObject));
            i = i2 + 1;
        }
        int readInt2 = objectInputStream.readInt();
        for (int i3 = 0; i3 < readInt2; i3++) {
            Object readObject2 = objectInputStream.readObject();
            Object readObject3 = objectInputStream.readObject();
            Collection collection = (Collection) compactLinkedHashMap.get(readObject2);
            collection.getClass();
            collection.add(readObject3);
        }
        A0I(compactLinkedHashMap);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(keySet().size());
        Iterator it = keySet().iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
        objectOutputStream.writeInt(super.A00);
        Iterator it2 = AQp().iterator();
        while (it2.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(it2);
            objectOutputStream.writeObject(A0z.getKey());
            objectOutputStream.writeObject(A0z.getValue());
        }
    }

    public Iterator A0B() {
        return new LsW(this);
    }

    public Iterator A0C() {
        return new 4uU(new LsW(this));
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public /* bridge */ /* synthetic */ Collection A0F() {
        return new CompactHashSet(this.A00);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public Collection A0G(Object obj) {
        return new KAz(this, obj, this.A00);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public /* bridge */ /* synthetic */ Collection Cfv(Iterable iterable, Object obj) {
        return A0J(iterable, obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public void clear() {
        super.clear();
        ValueEntry valueEntry = this.A01;
        valueEntry.successorInMultimap = valueEntry;
        valueEntry.predecessorInMultimap = valueEntry;
    }
}
