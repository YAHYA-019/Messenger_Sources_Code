package com.google.common.collect;

import X.4YT;
import X.JQy;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Map;

/* loaded from: ImmutableMapEntrySet.class */
public abstract class ImmutableMapEntrySet extends ImmutableSet {

    /* loaded from: ImmutableMapEntrySet$EntrySetSerializedForm.class */
    public class EntrySetSerializedForm implements Serializable {
        public static final long serialVersionUID = 0;
        public final ImmutableMap map;

        public EntrySetSerializedForm(ImmutableMap immutableMap) {
            this.map = immutableMap;
        }

        public Object readResolve() {
            return this.map.entrySet();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException(4YT.A00(804));
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean A0H() {
        return ImmutableSortedMap.this.isPartialView();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        boolean z = false;
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = ImmutableSortedMap.this.get(entry.getKey());
            if (obj2 != null) {
                z = JQy.A1Z(obj2, entry.getValue());
            }
        }
        return z;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return ImmutableSortedMap.this.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return ImmutableSortedMap.this.size();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new EntrySetSerializedForm(ImmutableSortedMap.this);
    }
}
