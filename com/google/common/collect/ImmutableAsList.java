package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: ImmutableAsList.class */
public abstract class ImmutableAsList extends ImmutableList {

    /* loaded from: ImmutableAsList$SerializedForm.class */
    public class SerializedForm implements Serializable {
        public static final long serialVersionUID = 0;
        public final ImmutableCollection collection;

        public SerializedForm(ImmutableCollection immutableCollection) {
            this.collection = immutableCollection;
        }

        public Object readResolve() {
            return this.collection.asList();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean A0H() {
        return A0J().A0H();
    }

    public abstract ImmutableCollection A0J();

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return A0J().contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return A0J().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return A0J().size();
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(A0J());
    }
}
