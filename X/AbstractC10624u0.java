package X;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractMapBasedMultiset;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.4u0, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4u0.class */
public abstract class AbstractC10624u0 extends AbstractCollection implements C4u1 {
    public transient Set A00;
    public transient Set A01;

    public Set A02() {
        return new KAp(this);
    }

    public Set A03() {
        return new KAr(this);
    }

    public int A04() {
        return ((C10614tz) this).A00.AAK().size();
    }

    public int A05(Object obj, int i) {
        throw AnonymousClass001.A0p();
    }

    public int A06(Object obj, int i) {
        1Fg.A00(i, "count");
        int AIN = AIN(obj);
        int i2 = i - AIN;
        if (i2 > 0) {
            A05(obj, i2);
        } else if (i2 < 0) {
            Cdf(obj, -i2);
            return AIN;
        }
        return AIN;
    }

    public Iterator A07() {
        throw new AssertionError(JQw.A00(3));
    }

    public Iterator A08() {
        return new KB3(((C10614tz) this).A00.AAK().entrySet().iterator());
    }

    public Set APB() {
        Set set = this.A00;
        if (set == null) {
            set = A02();
            this.A00 = set;
        }
        return set;
    }

    @Override // X.C4u1
    public int Cdf(Object obj, int i) {
        Object obj2;
        int size;
        C10614tz c10614tz = (C10614tz) this;
        1Fg.A00(i, "occurrences");
        if (i == 0) {
            size = c10614tz.AIN(obj);
        } else {
            java.util.Map AAK = c10614tz.A00.AAK();
            AAK.getClass();
            try {
                obj2 = AAK.get(obj);
            } catch (ClassCastException | NullPointerException unused) {
                obj2 = null;
            }
            Collection collection = (Collection) obj2;
            if (collection == null) {
                return 0;
            }
            size = collection.size();
            if (i >= size) {
                collection.clear();
                return size;
            }
            Iterator it = collection.iterator();
            for (int i2 = 0; i2 < i; i2++) {
                it.next();
                it.remove();
            }
        }
        return size;
    }

    @Override // X.C4u1
    public boolean CnX(Object obj, int i, int i2) {
        1Fg.A00(i, "oldCount");
        1Fg.A00(i2, "newCount");
        if (AIN(obj) != i) {
            return false;
        }
        A06(obj, i2);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.C4u1
    public final boolean add(Object obj) {
        A05(obj, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (!(collection instanceof C4u1)) {
            if (collection.isEmpty()) {
                return false;
            }
            return C1Jp.A02(this, collection.iterator());
        }
        C4u1 c4u1 = (C4u1) collection;
        if (!(c4u1 instanceof AbstractMapBasedMultiset)) {
            if (c4u1.isEmpty()) {
                return false;
            }
            for (C5ps c5ps : c4u1.entrySet()) {
                A05(c5ps.A01(), c5ps.A00());
            }
            return true;
        }
        AbstractMapBasedMultiset abstractMapBasedMultiset = (AbstractMapBasedMultiset) c4u1;
        if (abstractMapBasedMultiset.isEmpty()) {
            return false;
        }
        5sJ r304 = abstractMapBasedMultiset.A01;
        int A06 = r304.A06();
        while (true) {
            int i = A06;
            if (i < 0) {
                return true;
            }
            Preconditions.checkElementIndex(i, r304.A01);
            Object obj = r304.A06[i];
            5sJ r0 = abstractMapBasedMultiset.A01;
            Preconditions.checkElementIndex(i, r0.A01);
            A05(obj, r0.A04[i]);
            r304 = abstractMapBasedMultiset.A01;
            A06 = r304.A07(i);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract void clear();

    @Override // java.util.AbstractCollection, java.util.Collection, X.C4u1
    public boolean contains(Object obj) {
        return AnonymousClass001.A1P(AIN(obj));
    }

    @Override // X.C4u1
    public Set entrySet() {
        Set set = this.A01;
        if (set == null) {
            set = A03();
            this.A01 = set;
        }
        return set;
    }

    @Override // java.util.Collection, X.C4u1
    public final boolean equals(Object obj) {
        return 7mS.A00(this, obj);
    }

    @Override // java.util.Collection, X.C4u1
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.C4u1
    public final boolean remove(Object obj) {
        boolean z = true;
        if (Cdf(obj, 1) <= 0) {
            z = false;
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection instanceof C4u1) {
            collection = ((C4u1) collection).APB();
        }
        return APB().removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        if (collection instanceof C4u1) {
            collection = ((C4u1) collection).APB();
        }
        return APB().retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return entrySet().toString();
    }
}
