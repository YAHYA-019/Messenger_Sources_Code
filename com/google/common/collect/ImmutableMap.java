package com.google.common.collect;

import X.1Du;
import X.1Fg;
import X.1Fj;
import X.7Kb;
import X.AnonymousClass001;
import X.C1n3;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: ImmutableMap.class */
public abstract class ImmutableMap implements Map, Serializable {
    public static final Map.Entry[] EMPTY_ENTRY_ARRAY = new Map.Entry[0];
    public static final long serialVersionUID = 912559;
    public transient ImmutableSet entrySet;
    public transient ImmutableSet keySet;
    public transient ImmutableCollection values;

    /* loaded from: ImmutableMap$Builder.class */
    public class Builder {
        public Object[] alternatingKeysAndValues;
        public 7Kb duplicateKey;
        public boolean entriesUsed;
        public int size;

        public Builder() {
            this(4);
        }

        public Builder(int i) {
            this.alternatingKeysAndValues = new Object[i * 2];
            this.size = 0;
            this.entriesUsed = false;
        }

        public ImmutableMap build() {
            return buildOrThrow();
        }

        public ImmutableMap buildKeepingLast() {
            int i = this.size;
            Object[] objArr = this.alternatingKeysAndValues;
            this.entriesUsed = true;
            return RegularImmutableMap.A00(this, objArr, i);
        }

        public ImmutableMap buildOrThrow() {
            7Kb r302 = this.duplicateKey;
            if (r302 == null) {
                int i = this.size;
                Object[] objArr = this.alternatingKeysAndValues;
                this.entriesUsed = true;
                RegularImmutableMap A00 = RegularImmutableMap.A00(this, objArr, i);
                r302 = this.duplicateKey;
                if (r302 == null) {
                    return A00;
                }
            }
            throw r302.A00();
        }

        public Builder put(Object obj, Object obj2) {
            int i = (this.size + 1) * 2;
            Object[] objArr = this.alternatingKeysAndValues;
            int length = objArr.length;
            if (i > length) {
                this.alternatingKeysAndValues = Arrays.copyOf(objArr, 1Fj.A00(length, i));
                this.entriesUsed = false;
            }
            1Fg.A01(obj, obj2);
            Object[] objArr2 = this.alternatingKeysAndValues;
            int i2 = this.size;
            int i3 = i2 * 2;
            objArr2[i3] = obj;
            objArr2[i3 + 1] = obj2;
            this.size = i2 + 1;
            return this;
        }

        public Builder put(Map.Entry entry) {
            put(entry.getKey(), entry.getValue());
            return this;
        }

        public Builder putAll(Iterable iterable) {
            int size;
            Object[] objArr;
            int length;
            if ((iterable instanceof Collection) && (size = (this.size + ((Collection) iterable).size()) * 2) > (length = (objArr = this.alternatingKeysAndValues).length)) {
                this.alternatingKeysAndValues = Arrays.copyOf(objArr, 1Fj.A00(length, size));
                this.entriesUsed = false;
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                put((Map.Entry) it.next());
            }
            return this;
        }

        public Builder putAll(Map map) {
            putAll(map.entrySet());
            return this;
        }
    }

    /* loaded from: ImmutableMap$SerializedForm.class */
    public class SerializedForm implements Serializable {
        public static final long serialVersionUID = 0;
        public final Object keys;
        public final Object values;

        public SerializedForm(ImmutableMap immutableMap) {
            Object[] objArr = new Object[immutableMap.size()];
            Object[] objArr2 = new Object[immutableMap.size()];
            1Du it = immutableMap.entrySet().iterator();
            int i = 0;
            while (true) {
                int i2 = i;
                if (!it.hasNext()) {
                    this.keys = objArr;
                    this.values = objArr2;
                    return;
                } else {
                    Map.Entry A0z = AnonymousClass001.A0z(it);
                    objArr[i2] = A0z.getKey();
                    objArr2[i2] = A0z.getValue();
                    i = i2 + 1;
                }
            }
        }

        public Builder A00(int i) {
            return new Builder(i);
        }

        public final Object readResolve() {
            Builder A00;
            Object obj = this.keys;
            if (obj instanceof ImmutableSet) {
                ImmutableCollection immutableCollection = (ImmutableCollection) obj;
                ImmutableCollection immutableCollection2 = (ImmutableCollection) this.values;
                A00 = A00(immutableCollection.size());
                1Du it = immutableCollection.iterator();
                1Du it2 = immutableCollection2.iterator();
                while (it.hasNext()) {
                    A00.put(it.next(), it2.next());
                }
            } else {
                Object[] objArr = (Object[]) obj;
                Object[] objArr2 = (Object[]) this.values;
                A00 = A00(objArr.length);
                for (int i = 0; i < objArr.length; i++) {
                    A00.put(objArr[i], objArr2[i]);
                }
            }
            return A00.buildOrThrow();
        }
    }

    public static Builder builder() {
        return new Builder(4);
    }

    public static ImmutableMap copyOf(Map map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap immutableMap = (ImmutableMap) map;
            if (!immutableMap.isPartialView()) {
                return immutableMap;
            }
        }
        Set entrySet = map.entrySet();
        Builder builder = new Builder(entrySet instanceof Collection ? entrySet.size() : 4);
        builder.putAll(entrySet);
        return builder.build();
    }

    public static ImmutableMap of() {
        return RegularImmutableMap.A03;
    }

    public static ImmutableMap of(Object obj, Object obj2) {
        1Fg.A01(obj, obj2);
        return RegularImmutableMap.A00(null, new Object[]{obj, obj2}, 1);
    }

    public static ImmutableMap of(Object obj, Object obj2, Object obj3, Object obj4) {
        1Fg.A01(obj, obj2);
        1Fg.A01(obj3, obj4);
        return RegularImmutableMap.A00(null, new Object[]{obj, obj2, obj3, obj4}, 2);
    }

    public static ImmutableMap of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        1Fg.A01(obj, obj2);
        1Fg.A01(obj3, obj4);
        1Fg.A01(obj5, obj6);
        return RegularImmutableMap.A00(null, new Object[]{obj, obj2, obj3, obj4, obj5, obj6}, 3);
    }

    public static ImmutableMap of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        1Fg.A01(obj, obj2);
        1Fg.A01(obj3, obj4);
        1Fg.A01(obj5, obj6);
        1Fg.A01(obj7, obj8);
        return RegularImmutableMap.A00(null, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}, 4);
    }

    public static ImmutableMap of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        1Fg.A01(obj, obj2);
        1Fg.A01(obj3, obj4);
        1Fg.A01(obj5, obj6);
        1Fg.A01(obj7, obj8);
        1Fg.A01(obj9, obj10);
        return RegularImmutableMap.A00(null, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10}, 5);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.Map
    public final void clear() {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        boolean z = false;
        if (get(obj) != null) {
            z = true;
        }
        return z;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract ImmutableSet createEntrySet();

    public abstract ImmutableSet createKeySet();

    public abstract ImmutableCollection createValues();

    @Override // java.util.Map
    public ImmutableSet entrySet() {
        ImmutableSet immutableSet = this.entrySet;
        if (immutableSet == null) {
            immutableSet = createEntrySet();
            this.entrySet = immutableSet;
        }
        return immutableSet;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public int hashCode() {
        return C1n3.A00(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        boolean z = false;
        if (size() == 0) {
            z = true;
        }
        return z;
    }

    public abstract boolean isPartialView();

    @Override // java.util.Map
    public ImmutableSet keySet() {
        ImmutableSet immutableSet = this.keySet;
        if (immutableSet == null) {
            immutableSet = createKeySet();
            this.keySet = immutableSet;
        }
        return immutableSet;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw AnonymousClass001.A0p();
    }

    public String toString() {
        int size = size();
        1Fg.A00(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public ImmutableCollection values() {
        ImmutableCollection immutableCollection = this.values;
        if (immutableCollection == null) {
            immutableCollection = createValues();
            this.values = immutableCollection;
        }
        return immutableCollection;
    }

    public abstract Object writeReplace();
}
