package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.4u1, reason: invalid class name */
/* loaded from: 4u1.class */
public interface C4u1 extends Collection {
    int AIN(Object obj);

    Set APB();

    int Cdf(Object obj, int i);

    boolean CnX(Object obj, int i, int i2);

    @Override // java.util.Collection, X.C4u1
    boolean add(Object obj);

    @Override // java.util.Collection, X.C4u1
    boolean contains(Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection collection);

    Set entrySet();

    @Override // X.C4u1
    boolean equals(Object obj);

    @Override // X.C4u1
    int hashCode();

    @Override // java.util.Collection, java.lang.Iterable, X.C4u1
    Iterator iterator();

    @Override // java.util.Collection, X.C4u1
    boolean remove(Object obj);

    @Override // java.util.Collection, X.C4u1
    int size();
}
