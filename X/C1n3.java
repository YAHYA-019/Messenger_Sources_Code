package X;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: X.1n3, reason: invalid class name */
/* loaded from: 1n3.class */
public abstract class C1n3 {
    public static int A00(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            Object next = it.next();
            i = ((i2 + (next != null ? next.hashCode() : 0)) ^ (-1)) ^ (-1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.common.collect.ImmutableSet A01(java.lang.Iterable r301) {
        /*
            r0 = r301
            boolean r0 = r0 instanceof com.google.common.collect.ImmutableEnumSet
            r302 = r0
            r0 = r302
            if (r0 == 0) goto Le
            r0 = r301
            com.google.common.collect.ImmutableSet r0 = (com.google.common.collect.ImmutableSet) r0
            return r0
        Le:
            r0 = r301
            boolean r0 = r0 instanceof java.util.Collection
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L47
            r0 = r301
            java.util.Collection r0 = (java.util.Collection) r0
            r301 = r0
            r0 = r301
            boolean r0 = r0.isEmpty()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L89
            r0 = r301
            java.util.EnumSet r0 = java.util.EnumSet.copyOf(r0)
            r303 = r0
        L2c:
            r0 = r303
            int r0 = r0.size()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L89
            r0 = 1
            r302 = r0
            r0 = r304
            r1 = r302
            if (r0 == r1) goto L77
            com.google.common.collect.ImmutableEnumSet r0 = new com.google.common.collect.ImmutableEnumSet
            r301 = r0
            r0 = r301
            r1 = r303
            r0.<init>(r1)
            r0 = r301
            return r0
        L47:
            r0 = r301
            java.util.Iterator r0 = r0.iterator()
            r305 = r0
            r0 = r305
            boolean r0 = r0.hasNext()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L89
            r0 = r305
            java.lang.Object r0 = r0.next()
            java.lang.Enum r0 = (java.lang.Enum) r0
            r306 = r0
            r0 = r306
            java.util.EnumSet r0 = java.util.EnumSet.of(r0)
            r303 = r0
            r0 = r303
            r1 = r305
            boolean r0 = X.C1Jp.A02(r0, r1)
            goto L2c
        L77:
            r0 = r303
            java.lang.Object r0 = X.2Ri.A0A(r0)
            r306 = r0
            com.google.common.collect.SingletonImmutableSet r0 = new com.google.common.collect.SingletonImmutableSet
            r301 = r0
            r0 = r301
            r1 = r306
            r0.<init>(r1)
            r0 = r301
            return r0
        L89:
            com.google.common.collect.RegularImmutableSet r0 = com.google.common.collect.RegularImmutableSet.A05
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1n3.A01(java.lang.Iterable):com.google.common.collect.ImmutableSet");
    }

    public static 3Cm A02(Set set, Set set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new 3Cm(set, set2);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.2e5] */
    public static C2e5 A03(final Set set, final Set set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new C2e6() { // from class: X.2e5
            /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
            
                if (r303.contains(r302) != false) goto L6;
             */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean contains(java.lang.Object r302) {
                /*
                    r301 = this;
                    r0 = r301
                    java.util.Set r0 = r302
                    r303 = r0
                    r0 = r303
                    r1 = r302
                    boolean r0 = r0.contains(r1)
                    r304 = r0
                    r0 = r304
                    if (r0 == 0) goto L26
                    r0 = r301
                    java.util.Set r0 = r303
                    r303 = r0
                    r0 = r303
                    r1 = r302
                    boolean r0 = r0.contains(r1)
                    r305 = r0
                    r0 = 1
                    r304 = r0
                    r0 = r305
                    if (r0 == 0) goto L2a
                L26:
                    r0 = 0
                    r304 = r0
                    r0 = 0
                    r303 = r0
                L2a:
                    r0 = r304
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2e5.contains(java.lang.Object):boolean");
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return set2.containsAll(set);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public /* bridge */ /* synthetic */ Iterator iterator() {
                return new 3CS(this, 1);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Iterator it = set.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (!set2.contains(it.next())) {
                        i++;
                    }
                }
                return i;
            }
        };
    }

    public static HashSet A04(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new HashSet((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        HashSet A0v = AnonymousClass001.A0v();
        C1Jp.A02(A0v, it);
        return A0v;
    }

    public static HashSet A05(Object... objArr) {
        HashSet hashSet = new HashSet(C1my.A00(objArr.length));
        Collections.addAll(hashSet, objArr);
        return hashSet;
    }

    public static LinkedHashSet A06(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        2Ri.A0H(iterable, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Set, X.1n5] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.Set, X.1n5] */
    public static Set A07(Predicate predicate, Set set) {
        Collection collection;
        if (set instanceof SortedSet) {
            Collection collection2 = (SortedSet) set;
            if (collection2 instanceof C1n4) {
                C1n5 c1n5 = (C1n5) collection2;
                predicate = Predicates.and(c1n5.A00, predicate);
                collection2 = c1n5.A01;
            } else {
                collection2.getClass();
                predicate.getClass();
            }
            return new C1n5(predicate, collection2);
        }
        if (set instanceof C1n4) {
            C1n5 c1n52 = (C1n5) set;
            predicate = Predicates.and(c1n52.A00, predicate);
            collection = c1n52.A01;
        } else {
            set.getClass();
            predicate.getClass();
            collection = set;
        }
        return new C1n5(predicate, collection);
    }

    public static boolean A08(Object obj, Set set) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static boolean A09(Collection collection, Set set) {
        boolean z;
        collection.getClass();
        if (collection instanceof C4u1) {
            collection = ((C4u1) collection).APB();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            Iterator it = collection.iterator();
            boolean z2 = false;
            while (true) {
                z = z2;
                if (!it.hasNext()) {
                    break;
                }
                z2 = z | set.remove(it.next());
            }
        } else {
            Iterator it2 = set.iterator();
            z = false;
            while (it2.hasNext()) {
                if (collection.contains(it2.next())) {
                    it2.remove();
                    z = true;
                }
            }
        }
        return z;
    }
}
