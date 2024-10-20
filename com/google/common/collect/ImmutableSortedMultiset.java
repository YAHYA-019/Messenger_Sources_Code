package com.google.common.collect;

import X.0Q8;
import X.AnonymousClass001;
import X.C1zA;
import X.C5ps;
import X.GOp;
import X.KAG;
import X.MQm;
import com.google.common.base.Preconditions;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: ImmutableSortedMultiset.class */
public abstract class ImmutableSortedMultiset extends ImmutableMultiset implements MQm {
    public static final long serialVersionUID = 912559;
    public transient ImmutableSortedMultiset A00;

    /* loaded from: ImmutableSortedMultiset$SerializedForm.class */
    public final class SerializedForm implements Serializable {
        public final Comparator comparator;
        public final int[] counts;
        public final Object[] elements;

        public SerializedForm(MQm mQm) {
            this.comparator = mQm.comparator();
            int size = mQm.entrySet().size();
            this.elements = new Object[size];
            this.counts = new int[size];
            Iterator it = mQm.entrySet().iterator();
            int i = 0;
            while (true) {
                int i2 = i;
                if (!it.hasNext()) {
                    return;
                }
                C5ps c5ps = (C5ps) it.next();
                this.elements[i2] = c5ps.A01();
                this.counts[i2] = c5ps.A00();
                i = i2 + 1;
            }
        }

        public Object readResolve() {
            int length = this.elements.length;
            KAG kag = new KAG(this.comparator);
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    return kag.A08();
                }
                kag.A09(this.elements[i2], this.counts[i2]);
                i = i2 + 1;
            }
        }
    }

    private ImmutableSortedMultiset A0M() {
        ImmutableSortedMultiset immutableSortedMultiset;
        ImmutableSortedMultiset descendingImmutableSortedMultiset;
        if (this instanceof DescendingImmutableSortedMultiset) {
            immutableSortedMultiset = ((DescendingImmutableSortedMultiset) this).A00;
        } else {
            immutableSortedMultiset = this.A00;
            if (immutableSortedMultiset == null) {
                if (isEmpty()) {
                    C1zA A03 = C1zA.A00(A0P().comparator()).A03();
                    descendingImmutableSortedMultiset = NaturalOrdering.A02.equals(A03) ? RegularImmutableSortedMultiset.A04 : new RegularImmutableSortedMultiset(A03);
                } else {
                    descendingImmutableSortedMultiset = new DescendingImmutableSortedMultiset(this);
                }
                this.A00 = descendingImmutableSortedMultiset;
                return descendingImmutableSortedMultiset;
            }
        }
        return immutableSortedMultiset;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public ImmutableSortedMultiset A0N(BoundType boundType, Object obj) {
        if (!(this instanceof RegularImmutableSortedMultiset)) {
            return ((DescendingImmutableSortedMultiset) this).A00.A0O(boundType, obj).A0M();
        }
        RegularImmutableSortedMultiset regularImmutableSortedMultiset = (RegularImmutableSortedMultiset) this;
        RegularImmutableSortedSet regularImmutableSortedSet = regularImmutableSortedMultiset.A02;
        boundType.getClass();
        return RegularImmutableSortedMultiset.A00(regularImmutableSortedMultiset, 0, regularImmutableSortedSet.A0X(obj, AnonymousClass001.A1W(boundType, BoundType.CLOSED)));
    }

    public ImmutableSortedMultiset A0O(BoundType boundType, Object obj) {
        if (!(this instanceof RegularImmutableSortedMultiset)) {
            return ((DescendingImmutableSortedMultiset) this).A00.A0N(boundType, obj).A0M();
        }
        RegularImmutableSortedMultiset regularImmutableSortedMultiset = (RegularImmutableSortedMultiset) this;
        RegularImmutableSortedSet regularImmutableSortedSet = regularImmutableSortedMultiset.A02;
        boundType.getClass();
        return RegularImmutableSortedMultiset.A00(regularImmutableSortedMultiset, regularImmutableSortedSet.A0Y(obj, AnonymousClass001.A1W(boundType, BoundType.CLOSED)), regularImmutableSortedMultiset.A00);
    }

    public ImmutableSortedSet A0P() {
        return this instanceof RegularImmutableSortedMultiset ? ((RegularImmutableSortedMultiset) this).A02 : ((DescendingImmutableSortedMultiset) this).A00.A0P().descendingSet();
    }

    @Override // X.MQm
    public /* bridge */ /* synthetic */ MQm AMu() {
        return this instanceof DescendingImmutableSortedMultiset ? ((DescendingImmutableSortedMultiset) this).A00 : A0M();
    }

    @Override // X.MQm
    public final C5ps CXh() {
        throw AnonymousClass001.A0p();
    }

    @Override // X.MQm
    public final C5ps CXi() {
        throw AnonymousClass001.A0p();
    }

    @Override // X.MQm
    public /* bridge */ /* synthetic */ MQm D39(BoundType boundType, BoundType boundType2, Object obj, Object obj2) {
        Preconditions.checkArgument(GOp.A1U(A0P().comparator().compare(obj, obj2)), "Expected lowerBound <= upperBound but %s > %s", obj, obj2);
        return A0O(boundType, obj).A0N(boundType2, obj2);
    }

    @Override // X.MQm
    public final Comparator comparator() {
        return A0P().comparator();
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        throw 0Q8.createAndThrow();
    }
}
