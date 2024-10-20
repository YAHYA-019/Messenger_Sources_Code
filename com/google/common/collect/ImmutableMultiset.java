package com.google.common.collect;

import X.1Du;
import X.5sJ;
import X.5sM;
import X.7mS;
import X.AnonymousClass001;
import X.C1n3;
import X.C4u1;
import X.C5ps;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.RegularImmutableMultiset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: ImmutableMultiset.class */
public abstract class ImmutableMultiset extends ImmutableMultisetGwtSerializationDependencies implements C4u1 {
    public static final long serialVersionUID = 912559;
    public transient ImmutableList A00;
    public transient ImmutableSet A01;

    /* loaded from: ImmutableMultiset$EntrySet.class */
    public final class EntrySet extends IndexedImmutableSet {
        public static final long serialVersionUID = 0;

        public EntrySet() {
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("Use EntrySetSerializedForm");
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean A0H() {
            return ImmutableMultiset.this.A0H();
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            boolean z = false;
            if (obj instanceof C5ps) {
                C5ps c5ps = (C5ps) obj;
                if (c5ps.A00() > 0 && ImmutableMultiset.this.AIN(c5ps.A01()) == c5ps.A00()) {
                    z = true;
                }
            }
            return z;
        }

        @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return ImmutableMultiset.this.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ImmutableMultiset.this.A0J().size();
        }

        @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return new EntrySetSerializedForm(ImmutableMultiset.this);
        }
    }

    /* loaded from: ImmutableMultiset$EntrySetSerializedForm.class */
    public class EntrySetSerializedForm implements Serializable {
        public final ImmutableMultiset multiset;

        public EntrySetSerializedForm(ImmutableMultiset immutableMultiset) {
            this.multiset = immutableMultiset;
        }

        public Object readResolve() {
            return this.multiset.entrySet();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public ImmutableSet A0J() {
        ImmutableSet immutableSet;
        if (this instanceof ImmutableMultimap.Keys) {
            immutableSet = ImmutableMultimap.this.A01.keySet();
        } else {
            RegularImmutableMultiset regularImmutableMultiset = (RegularImmutableMultiset) this;
            immutableSet = regularImmutableMultiset.A00;
            if (immutableSet == null) {
                RegularImmutableMultiset.ElementSet elementSet = new RegularImmutableMultiset.ElementSet();
                regularImmutableMultiset.A00 = elementSet;
                return elementSet;
            }
        }
        return immutableSet;
    }

    @Override // X.C4u1
    /* renamed from: A0K, reason: merged with bridge method [inline-methods] */
    public ImmutableSet entrySet() {
        ImmutableSet immutableSet = this.A01;
        if (immutableSet == null) {
            immutableSet = isEmpty() ? RegularImmutableSet.A05 : new EntrySet();
            this.A01 = immutableSet;
        }
        return immutableSet;
    }

    public C5ps A0L(int i) {
        if (this instanceof ImmutableMultimap.Keys) {
            Map.Entry entry = (Map.Entry) ImmutableMultimap.this.A01.entrySet().asList().get(i);
            return new Multisets$ImmutableEntry(entry.getKey(), ((Collection) entry.getValue()).size());
        }
        5sJ r0 = ((RegularImmutableMultiset) this).A01;
        Preconditions.checkElementIndex(i, r0.A01);
        return new 5sM(r0, i);
    }

    @Override // X.C4u1
    public final int Cdf(Object obj, int i) {
        throw AnonymousClass001.A0p();
    }

    @Override // X.C4u1
    public final boolean CnX(Object obj, int i, int i2) {
        throw AnonymousClass001.A0p();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList asList() {
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            immutableList = super.asList();
            this.A00 = immutableList;
        }
        return immutableList;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return AnonymousClass001.A1P(AIN(obj));
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] objArr, int i) {
        1Du it = entrySet().iterator();
        while (it.hasNext()) {
            C5ps c5ps = (C5ps) it.next();
            Arrays.fill(objArr, i, c5ps.A00() + i, c5ps.A01());
            i += c5ps.A00();
        }
        return i;
    }

    @Override // java.util.Collection, X.C4u1
    public boolean equals(Object obj) {
        return 7mS.A00(this, obj);
    }

    @Override // java.util.Collection, X.C4u1
    public int hashCode() {
        return C1n3.A00(entrySet());
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public 1Du iterator() {
        final 1Du it = entrySet().iterator();
        return new 1Du() { // from class: X.5ac
            public int A00;
            public Object A01;

            /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
            
                if (r302.hasNext() != false) goto L6;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean hasNext() {
                /*
                    r301 = this;
                    r0 = r301
                    int r0 = r0.A00
                    r302 = r0
                    r0 = r302
                    if (r0 > 0) goto L19
                    r0 = r301
                    java.util.Iterator r0 = r302
                    boolean r0 = r0.hasNext()
                    r303 = r0
                    r0 = 0
                    r302 = r0
                    r0 = r303
                    if (r0 == 0) goto L1b
                L19:
                    r0 = 1
                    r302 = r0
                L1b:
                    r0 = r302
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C5ac.hasNext():boolean");
            }

            public Object next() {
                int i = this.A00;
                if (i <= 0) {
                    C5ps c5ps = (C5ps) it.next();
                    this.A01 = c5ps.A01();
                    i = c5ps.A00();
                    this.A00 = i;
                }
                this.A00 = i - 1;
                Object obj = this.A01;
                obj.getClass();
                return obj;
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, X.C4u1
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public abstract Object writeReplace();
}
