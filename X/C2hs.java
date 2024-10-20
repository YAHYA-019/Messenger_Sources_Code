package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2hs, reason: invalid class name */
/* loaded from: 2hs.class */
public final class C2hs extends C2ht {
    public static final C2hu A08 = new Object();
    public final 1Im A00;
    public final List A01;
    public final List A02;
    public final 1Im A03;
    public final C1qb A04;
    public final C2hu A05;
    public final ThreadLocal A06;
    public final AtomicBoolean A07;

    /* JADX WARN: Type inference failed for: r0v23, types: [X.2hu, java.lang.Object] */
    public C2hs(C1qb c1qb, List list, List list2) {
        this.A04 = c1qb;
        this.A03 = c1qb.A0J() == null ? null : ((C2he) c1qb.A0J()).A01;
        this.A00 = c1qb.A0J() == null ? null : ((C2he) c1qb.A0J()).A00;
        this.A02 = list;
        this.A01 = list2;
        this.A06 = new ThreadLocal() { // from class: X.2hv
            /* JADX WARN: Type inference failed for: r0v0, types: [X.2hu, java.lang.Object] */
            @Override // java.lang.ThreadLocal
            public /* bridge */ /* synthetic */ Object initialValue() {
                ?? obj = new Object();
                C2hu c2hu = C2hs.A08;
                obj.A01 = c2hu.A01;
                obj.A00 = c2hu.A00;
                return obj;
            }
        };
        this.A05 = new Object();
        this.A07 = new AtomicBoolean(false);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [X.2hu, java.lang.Object] */
    public static boolean A00(C2hs c2hs, Object obj, Object obj2) {
        boolean A1V;
        if (obj == obj2) {
            return true;
        }
        1Im r0 = c2hs.A03;
        if (r0 == null) {
            return obj.equals(obj2);
        }
        1Is r02 = r0.A00.A01;
        AtomicBoolean atomicBoolean = c2hs.A07;
        boolean compareAndSet = atomicBoolean.compareAndSet(false, true);
        C2hu c2hu = compareAndSet ? c2hs.A05 : (C2hu) c2hs.A06.get();
        if (C02A.reduceMemorySpikeDataDiffSection && r02 != null && c2hu != null) {
            Object obj3 = c2hu.A01;
            C2hu c2hu2 = A08;
            if (obj3 == c2hu2.A01) {
                c2hu.A01 = obj;
                c2hu.A00 = obj2;
                try {
                    Object A00 = r0.A00(c2hu);
                    if (A00 == null) {
                    }
                    A1V = ((Boolean) A00).booleanValue();
                    c2hu.A01 = c2hu2.A01;
                    c2hu.A00 = c2hu2.A00;
                    if (compareAndSet) {
                        atomicBoolean.set(false);
                        return A1V;
                    }
                    return A1V;
                } finally {
                    c2hu.A01 = c2hu2.A01;
                    c2hu.A00 = c2hu2.A00;
                    if (compareAndSet) {
                        atomicBoolean.set(false);
                    }
                }
            }
        }
        ?? obj4 = new Object();
        obj4.A01 = obj;
        obj4.A00 = obj2;
        A1V = AnonymousClass001.A1V(r0.A00((Object) obj4));
        return A1V;
    }

    @Override // X.C2ht
    public int A04() {
        List list = this.A01;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // X.C2ht
    public int A05() {
        List list = this.A02;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
