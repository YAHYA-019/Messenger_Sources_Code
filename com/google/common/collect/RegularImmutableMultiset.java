package com.google.common.collect;

import X.1NS;
import X.5sI;
import X.5sJ;
import X.C4u1;
import X.C5ps;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;

/* loaded from: RegularImmutableMultiset.class */
public class RegularImmutableMultiset extends ImmutableMultiset {
    public static final RegularImmutableMultiset A03 = new RegularImmutableMultiset(new 5sJ());
    public transient ImmutableSet A00;
    public final transient 5sJ A01;
    public final transient int A02;

    /* loaded from: RegularImmutableMultiset$ElementSet.class */
    public final class ElementSet extends IndexedImmutableSet {
        public ElementSet() {
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean A0H() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return RegularImmutableMultiset.this.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return RegularImmutableMultiset.this.A01.A01;
        }

        @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* loaded from: RegularImmutableMultiset$SerializedForm.class */
    public class SerializedForm implements Serializable {
        public static final long serialVersionUID = 0;
        public final int[] counts;
        public final Object[] elements;

        public SerializedForm(C4u1 c4u1) {
            int size = c4u1.entrySet().size();
            this.elements = new Object[size];
            this.counts = new int[size];
            Iterator it = c4u1.entrySet().iterator();
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
            5sI r0 = new 5sI(this.elements.length);
            int i = 0;
            while (true) {
                int i2 = i;
                Object[] objArr = this.elements;
                if (i2 >= objArr.length) {
                    return r0.A07();
                }
                r0.A05(objArr[i2], this.counts[i2]);
                i = i2 + 1;
            }
        }
    }

    public RegularImmutableMultiset(5sJ r302) {
        this.A01 = r302;
        long j = 0;
        int i = 0;
        while (true) {
            int i2 = i;
            int i3 = r302.A01;
            if (i2 >= i3) {
                this.A02 = 1NS.A01(j);
                return;
            }
            Preconditions.checkElementIndex(i2, i3);
            j += r302.A04[i2];
            i = i2 + 1;
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean A0H() {
        return false;
    }

    @Override // X.C4u1
    public int AIN(Object obj) {
        5sJ r0 = this.A01;
        int A04 = r0.A04(obj);
        if (A04 == -1) {
            return 0;
        }
        return r0.A04[A04];
    }

    @Override // X.C4u1
    public /* bridge */ /* synthetic */ Set APB() {
        return A0J();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.C4u1
    public int size() {
        return this.A02;
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
