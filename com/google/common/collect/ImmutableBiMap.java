package com.google.common.collect;

import X.0Q8;
import X.5fI;
import X.C5f2;
import X.JQw;
import com.google.common.collect.ImmutableMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;

/* loaded from: ImmutableBiMap.class */
public abstract class ImmutableBiMap extends ImmutableMap implements C5f2 {
    public static final long serialVersionUID = 912559;

    /* loaded from: ImmutableBiMap$SerializedForm.class */
    public class SerializedForm extends ImmutableMap.SerializedForm {
        public static final long serialVersionUID = 0;

        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        public /* bridge */ /* synthetic */ ImmutableMap.Builder A00(int i) {
            return new ImmutableMap.Builder(i);
        }
    }

    public static 5fI A00() {
        return new ImmutableMap.Builder(4);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableMap
    public /* bridge */ /* synthetic */ ImmutableCollection createValues() {
        throw new AssertionError(JQw.A00(3));
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public /* bridge */ /* synthetic */ ImmutableCollection values() {
        return ((RegularImmutableBiMap) this).A00.keySet();
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public /* bridge */ /* synthetic */ Collection values() {
        return ((RegularImmutableBiMap) this).A00.keySet();
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        throw 0Q8.createAndThrow();
    }
}
