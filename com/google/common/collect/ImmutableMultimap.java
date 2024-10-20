package com.google.common.collect;

import X.1Du;
import X.1Mu;
import X.5uU;
import X.62F;
import X.AnonymousClass001;
import X.AnonymousClass532;
import X.C4u1;
import X.JQw;
import com.facebook.acra.constants.ActionId;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: ImmutableMultimap.class */
public abstract class ImmutableMultimap extends AnonymousClass532 implements Serializable {
    public static final long serialVersionUID = 0;
    public final transient int A00;
    public final transient ImmutableMap A01;

    /* loaded from: ImmutableMultimap$EntryCollection.class */
    public class EntryCollection extends ImmutableCollection {
        public static final long serialVersionUID = 0;
        public final ImmutableMultimap multimap;

        public EntryCollection(ImmutableMultimap immutableMultimap) {
            this.multimap = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean A0H() {
            return this.multimap.A01.isPartialView();
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.multimap.AHm(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public 1Du iterator() {
            return new 5uU(this.multimap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return new 5uU(this.multimap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.multimap.A00;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* loaded from: ImmutableMultimap$Keys.class */
    public class Keys extends ImmutableMultiset {
        public Keys() {
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("Use KeysSerializedForm");
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean A0H() {
            return true;
        }

        @Override // X.C4u1
        public int AIN(Object obj) {
            Collection collection = (Collection) ImmutableMultimap.this.A01.get(obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        @Override // X.C4u1
        public /* bridge */ /* synthetic */ Set APB() {
            return A0J();
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return ImmutableMultimap.this.A01.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, X.C4u1
        public int size() {
            return ImmutableMultimap.this.A00;
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return new KeysSerializedForm(ImmutableMultimap.this);
        }
    }

    /* loaded from: ImmutableMultimap$KeysSerializedForm.class */
    public final class KeysSerializedForm implements Serializable {
        public final ImmutableMultimap multimap;

        public KeysSerializedForm(ImmutableMultimap immutableMultimap) {
            this.multimap = immutableMultimap;
        }

        public Object readResolve() {
            return this.multimap.A0I();
        }
    }

    /* loaded from: ImmutableMultimap$Values.class */
    public final class Values extends ImmutableCollection {
        public static final long serialVersionUID = 0;
        public final transient ImmutableMultimap A00;

        public Values(ImmutableMultimap immutableMultimap) {
            this.A00 = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean A0H() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.A00.containsValue(obj);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int copyIntoArray(Object[] objArr, int i) {
            1Du it = this.A00.A01.values().iterator();
            while (it.hasNext()) {
                i = ((ImmutableCollection) it.next()).copyIntoArray(objArr, i);
            }
            return i;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public 1Du iterator() {
            return new 62F(this.A00);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return new 62F(this.A00);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.A00.A00;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public ImmutableMultimap(ImmutableMap immutableMap, int i) {
        this.A01 = immutableMap;
        this.A00 = i;
    }

    public static ImmutableMultimap A07(1Mu r301) {
        if (r301 instanceof ImmutableMultimap) {
            ImmutableMultimap immutableMultimap = (ImmutableMultimap) r301;
            if (!immutableMultimap.A01.isPartialView()) {
                return immutableMultimap;
            }
        }
        return ImmutableListMultimap.A02(r301);
    }

    public /* bridge */ /* synthetic */ C4u1 A08() {
        return new Keys();
    }

    public /* bridge */ /* synthetic */ Collection A09() {
        return new EntryCollection(this);
    }

    public /* bridge */ /* synthetic */ Collection A0A() {
        return new Values(this);
    }

    public /* bridge */ /* synthetic */ Iterator A0B() {
        return new 5uU(this);
    }

    public /* bridge */ /* synthetic */ Iterator A0C() {
        return new 62F(this);
    }

    public Map A0D() {
        throw new AssertionError(JQw.A00(3));
    }

    public Set A0E() {
        throw new AssertionError(JQw.A00(ActionId.ACTION_BAR_COMPLETE));
    }

    @Override // 
    /* renamed from: A0F, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection AQp() {
        return (ImmutableCollection) super.AQp();
    }

    public ImmutableCollection A0G() {
        return (ImmutableCollection) super.values();
    }

    /* renamed from: A0H */
    public abstract ImmutableCollection AUg(Object obj);

    public ImmutableMultiset A0I() {
        return (ImmutableMultiset) super.BXh();
    }

    public /* bridge */ /* synthetic */ Map AAK() {
        return this.A01;
    }

    public /* bridge */ /* synthetic */ C4u1 BXh() {
        return super.BXh();
    }

    public final boolean CZw(Object obj, Object obj2) {
        throw AnonymousClass001.A0p();
    }

    public final boolean Ca0(1Mu r302) {
        throw AnonymousClass001.A0p();
    }

    public final boolean Ca1(Iterable iterable, Object obj) {
        throw AnonymousClass001.A0p();
    }

    public final void clear() {
        throw AnonymousClass001.A0p();
    }

    public boolean containsKey(Object obj) {
        return this.A01.containsKey(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (super.containsValue(r302) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean containsValue(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            if (r0 == 0) goto L10
            r0 = r301
            r1 = r302
            boolean r0 = super.containsValue(r1)
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L12
        L10:
            r0 = 0
            r304 = r0
        L12:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableMultimap.containsValue(java.lang.Object):boolean");
    }

    public /* bridge */ /* synthetic */ Set keySet() {
        return this.A01.keySet();
    }

    public final boolean remove(Object obj, Object obj2) {
        throw AnonymousClass001.A0p();
    }

    public int size() {
        return this.A00;
    }

    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }
}
