package com.google.common.collect;

import X.0Pz;
import X.0Q8;
import X.1BK;
import X.1Du;
import X.1Hz;
import X.1Xl;
import X.4YT;
import X.5uU;
import X.AnonymousClass001;
import X.KAH;
import X.KbA;
import X.KcE;
import X.Koy;
import X.L9Q;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: ImmutableSetMultimap.class */
public class ImmutableSetMultimap extends ImmutableMultimap implements 1Xl {
    public static final long serialVersionUID = 0;
    public transient ImmutableSet A00;
    public final transient ImmutableSet A01;

    /* loaded from: ImmutableSetMultimap$EntrySet.class */
    public final class EntrySet extends ImmutableSet {
        public final transient ImmutableSetMultimap A00;

        public EntrySet(ImmutableSetMultimap immutableSetMultimap) {
            this.A00 = immutableSetMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean A0H() {
            return false;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.A00.AHm(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public 1Du iterator() {
            return new 5uU(this.A00);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return new 5uU(this.A00);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ((ImmutableMultimap) this.A00).A00;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public ImmutableSetMultimap(ImmutableMap immutableMap, int i) {
        super(immutableMap, i);
        this.A01 = RegularImmutableSet.A05;
    }

    public static ImmutableSetMultimap A00(Collection collection) {
        if (collection.isEmpty()) {
            return EmptyImmutableSetMultimap.A00;
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder(collection.size());
        int i = 0;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(it);
            Object key = A0z.getKey();
            ImmutableSet A07 = ImmutableSet.A07((Collection) A0z.getValue());
            if (!A07.isEmpty()) {
                builder.put(key, A07);
                i += A07.size();
            }
        }
        return new ImmutableSetMultimap(builder.buildOrThrow(), i);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(0Pz.A0T(4YT.A00(650), readInt));
        }
        ImmutableMap.Builder A0c = 1BK.A0c();
        int i = 0;
        for (int i2 = 0; i2 < readInt; i2++) {
            Object readObject = objectInputStream.readObject();
            readObject.getClass();
            int readInt2 = objectInputStream.readInt();
            if (readInt2 <= 0) {
                throw new InvalidObjectException(0Pz.A0T(4YT.A00(654), readInt2));
            }
            1Hz r310 = comparator == null ? new 1Hz() : new KAH(comparator);
            int i3 = 0;
            do {
                Object readObject2 = objectInputStream.readObject();
                readObject2.getClass();
                r310.A05(readObject2);
                i3++;
            } while (i3 < readInt2);
            ImmutableSet A07 = r310.A07();
            if (A07.size() != readInt2) {
                throw new InvalidObjectException(AnonymousClass001.A0Z(readObject, "Duplicate key-value pairs exist for key ", AnonymousClass001.A0k()));
            }
            A0c.put(readObject, A07);
            i += readInt2;
        }
        try {
            KcE.A00.A00(this, A0c.buildOrThrow());
            Koy koy = KcE.A01;
            try {
                koy.A00.set(this, Integer.valueOf(i));
                KbA.A00.A00(this, comparator == null ? RegularImmutableSet.A05 : ImmutableSortedSet.A0B(comparator));
            } catch (IllegalAccessException unused) {
                throw AnonymousClass001.A0J(koy);
            }
        } catch (IllegalArgumentException e) {
            throw new InvalidObjectException(e.getMessage()).initCause(e);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        ImmutableSet immutableSet = this.A01;
        objectOutputStream.writeObject(immutableSet instanceof ImmutableSortedSet ? ((ImmutableSortedSet) immutableSet).comparator() : null);
        L9Q.A02(this, objectOutputStream);
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* renamed from: A0F */
    public /* bridge */ /* synthetic */ ImmutableCollection AQp() {
        ImmutableSet immutableSet = this.A00;
        if (immutableSet == null) {
            immutableSet = new EntrySet(this);
            this.A00 = immutableSet;
        }
        return immutableSet;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* renamed from: A0H */
    public /* bridge */ /* synthetic */ ImmutableCollection AUg(Object obj) {
        return (ImmutableCollection) MoreObjects.firstNonNull(super.A01.get(obj), this.A01);
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public /* bridge */ /* synthetic */ Collection AQp() {
        ImmutableSet immutableSet = this.A00;
        if (immutableSet == null) {
            immutableSet = new EntrySet(this);
            this.A00 = immutableSet;
        }
        return immutableSet;
    }

    public /* bridge */ /* synthetic */ Set AQq() {
        ImmutableSet immutableSet = this.A00;
        if (immutableSet == null) {
            immutableSet = new EntrySet(this);
            this.A00 = immutableSet;
        }
        return immutableSet;
    }

    public /* bridge */ /* synthetic */ Collection AUe(Object obj) {
        return (ImmutableCollection) MoreObjects.firstNonNull(super.A01.get(obj), this.A01);
    }

    public /* bridge */ /* synthetic */ Set AUh(Object obj) {
        return (ImmutableSet) MoreObjects.firstNonNull(super.A01.get(obj), this.A01);
    }

    public /* bridge */ /* synthetic */ Collection Cdw(Object obj) {
        throw AnonymousClass001.A0p();
    }

    public /* bridge */ /* synthetic */ Set Cdy(Object obj) {
        throw 0Q8.createAndThrow();
    }

    public /* bridge */ /* synthetic */ Collection Cfv(Iterable iterable, Object obj) {
        throw AnonymousClass001.A0p();
    }
}
