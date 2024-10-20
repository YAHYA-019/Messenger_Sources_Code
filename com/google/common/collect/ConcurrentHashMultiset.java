package com.google.common.collect;

import X.1BK;
import X.1Fg;
import X.1JW;
import X.1NS;
import X.1PP;
import X.3Ce;
import X.AbstractC10624u0;
import X.AnonymousClass001;
import X.C5ps;
import X.GOn;
import X.JQx;
import X.JQy;
import X.K9I;
import X.K9Z;
import X.KA2;
import X.Kb9;
import X.Lsf;
import com.google.common.base.Preconditions;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: ConcurrentHashMultiset.class */
public final class ConcurrentHashMultiset extends AbstractC10624u0 implements Serializable {
    public static final long serialVersionUID = 1;
    public final transient ConcurrentMap A00;

    public ConcurrentHashMultiset(ConcurrentMap concurrentMap) {
        Preconditions.checkArgument(concurrentMap.isEmpty(), "the backing map (%s) must be empty", concurrentMap);
        this.A00 = concurrentMap;
    }

    private ArrayList A00() {
        ArrayList A01 = 1JW.A01(size());
        for (C5ps c5ps : entrySet()) {
            Object A012 = c5ps.A01();
            int A00 = c5ps.A00();
            while (true) {
                int i = A00;
                if (i > 0) {
                    A01.add(A012);
                    A00 = i - 1;
                }
            }
        }
        return A01;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Object readObject = objectInputStream.readObject();
        readObject.getClass();
        Kb9.A00.A00(this, readObject);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.A00);
    }

    @Override // X.AbstractC10624u0
    public Set A02() {
        return new 3Ce(this.A00.keySet());
    }

    @Override // X.AbstractC10624u0
    public Set A03() {
        return new K9Z(this);
    }

    @Override // X.AbstractC10624u0
    public int A04() {
        return this.A00.size();
    }

    @Override // X.AbstractC10624u0
    public int A05(Object obj, int i) {
        ConcurrentMap concurrentMap;
        Object obj2;
        AtomicInteger atomicInteger;
        int i2;
        int i3;
        AtomicInteger A1K;
        obj.getClass();
        if (i != 0) {
            if (i <= 0) {
                throw AnonymousClass001.A0L(AnonymousClass001.A0e(" must be positive but was: ", AnonymousClass001.A0n("occurrences"), i));
            }
            do {
                concurrentMap = this.A00;
                concurrentMap.getClass();
                try {
                    obj2 = concurrentMap.get(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    obj2 = null;
                }
                atomicInteger = (AtomicInteger) obj2;
                i2 = 0;
                if (atomicInteger == null) {
                    atomicInteger = (AtomicInteger) concurrentMap.putIfAbsent(obj, GOn.A1K(i));
                    if (atomicInteger == null) {
                        return 0;
                    }
                }
                do {
                    i3 = atomicInteger.get();
                    if (i3 != 0) {
                        try {
                        } catch (ArithmeticException unused2) {
                            throw JQy.A0i("Overflow adding ", " occurrences to a count of ", i, i3);
                        }
                    } else {
                        A1K = GOn.A1K(i);
                        if (concurrentMap.putIfAbsent(obj, A1K) != null) {
                        }
                    }
                } while (!atomicInteger.compareAndSet(i3, 1PP.A00(i3, i)));
                return i3;
            } while (!concurrentMap.replace(obj, atomicInteger, A1K));
            return 0;
        }
        i2 = AIN(obj);
        return i2;
    }

    @Override // X.AbstractC10624u0
    public int A06(Object obj, int i) {
        ConcurrentMap concurrentMap;
        Object obj2;
        AtomicInteger atomicInteger;
        int i2;
        AtomicInteger A1K;
        obj.getClass();
        1Fg.A00(i, "count");
        do {
            concurrentMap = this.A00;
            concurrentMap.getClass();
            try {
                obj2 = concurrentMap.get(obj);
            } catch (ClassCastException | NullPointerException unused) {
                obj2 = null;
            }
            atomicInteger = (AtomicInteger) obj2;
            if (atomicInteger == null) {
                if (i == 0) {
                    return 0;
                }
                atomicInteger = (AtomicInteger) concurrentMap.putIfAbsent(obj, GOn.A1K(i));
                if (atomicInteger == null) {
                    return 0;
                }
            }
            do {
                i2 = atomicInteger.get();
                if (i2 == 0) {
                    if (i == 0) {
                        return 0;
                    }
                    A1K = GOn.A1K(i);
                    if (concurrentMap.putIfAbsent(obj, A1K) == null) {
                        return 0;
                    }
                }
            } while (!atomicInteger.compareAndSet(i2, i));
            if (i == 0) {
                concurrentMap.remove(obj, atomicInteger);
            }
            return i2;
        } while (!concurrentMap.replace(obj, atomicInteger, A1K));
        return 0;
    }

    @Override // X.AbstractC10624u0
    public Iterator A07() {
        throw AnonymousClass001.A0J("should never be called");
    }

    @Override // X.AbstractC10624u0
    public Iterator A08() {
        return new KA2(this, new K9I(this));
    }

    @Override // X.C4u1
    public int AIN(Object obj) {
        Object obj2;
        ConcurrentMap concurrentMap = this.A00;
        concurrentMap.getClass();
        try {
            obj2 = concurrentMap.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        AtomicInteger atomicInteger = (AtomicInteger) obj2;
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.get();
    }

    @Override // X.AbstractC10624u0, X.C4u1
    public int Cdf(Object obj, int i) {
        Object obj2;
        int i2;
        int A0C;
        if (i == 0) {
            i2 = AIN(obj);
        } else {
            if (i <= 0) {
                throw AnonymousClass001.A0L(AnonymousClass001.A0e(" must be positive but was: ", AnonymousClass001.A0n("occurrences"), i));
            }
            ConcurrentMap concurrentMap = this.A00;
            concurrentMap.getClass();
            try {
                obj2 = concurrentMap.get(obj);
            } catch (ClassCastException | NullPointerException unused) {
                obj2 = null;
            }
            AtomicInteger atomicInteger = (AtomicInteger) obj2;
            if (atomicInteger == null) {
                return 0;
            }
            do {
                i2 = atomicInteger.get();
                if (i2 == 0) {
                    return 0;
                }
                A0C = JQx.A0C(i2, i, 0);
            } while (!atomicInteger.compareAndSet(i2, A0C));
            if (A0C == 0) {
                concurrentMap.remove(obj, atomicInteger);
                return i2;
            }
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0060, code lost:
    
        if (r0.putIfAbsent(r302, X.GOn.A1K(r304)) == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a6, code lost:
    
        if (r0.replace(r302, r0, r0) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bc, code lost:
    
        if (r304 == 0) goto L32;
     */
    @Override // X.AbstractC10624u0, X.C4u1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean CnX(java.lang.Object r302, int r303, int r304) {
        /*
            r301 = this;
            r0 = r302
            java.lang.Class r0 = r0.getClass()
            r0 = r303
            java.lang.String r1 = "oldCount"
            X.1Fg.A00(r0, r1)
            java.lang.String r0 = "newCount"
            r305 = r0
            r0 = r304
            r1 = r305
            X.1Fg.A00(r0, r1)
            r0 = r301
            java.util.concurrent.ConcurrentMap r0 = r0.A00
            r306 = r0
            r0 = r306
            java.lang.Class r0 = r0.getClass()
            r0 = r306
            r1 = r302
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2e
            r307 = r0
            goto L32
        L2e:
            r0 = 0
            r307 = r0
        L32:
            r0 = r307
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            r307 = r0
            r0 = 0
            r308 = r0
            r0 = 1
            r309 = r0
            r0 = r307
            if (r0 != 0) goto L69
            r0 = r303
            if (r0 != 0) goto L66
            r0 = r304
            if (r0 == 0) goto Lca
            r0 = r304
            java.util.concurrent.atomic.AtomicInteger r0 = X.GOn.A1K(r0)
            r305 = r0
            r0 = r306
            r1 = r302
            r2 = r305
            java.lang.Object r0 = r0.putIfAbsent(r1, r2)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L66
        L63:
            r0 = 1
            r308 = r0
        L66:
            r0 = r308
            return r0
        L69:
            r0 = r307
            int r0 = r0.get()
            r310 = r0
            r0 = r310
            r1 = r303
            if (r0 != r1) goto L66
            r0 = r310
            if (r0 != 0) goto Lac
            r0 = r304
            if (r0 == 0) goto Lbf
            r0 = r304
            java.util.concurrent.atomic.AtomicInteger r0 = X.GOn.A1K(r0)
            r311 = r0
            r0 = r306
            r1 = r302
            r2 = r311
            java.lang.Object r0 = r0.putIfAbsent(r1, r2)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L63
            r0 = r306
            r1 = r302
            r2 = r307
            r3 = r311
            boolean r0 = r0.replace(r1, r2, r3)
            r310 = r0
            r0 = r310
            if (r0 == 0) goto L66
            goto L63
        Lac:
            r0 = r307
            r1 = r310
            r2 = r304
            boolean r0 = r0.compareAndSet(r1, r2)
            r310 = r0
            r0 = r310
            if (r0 == 0) goto L66
            r0 = r304
            if (r0 != 0) goto Lca
        Lbf:
            r0 = r306
            r1 = r302
            r2 = r307
            boolean r0 = r0.remove(r1, r2)
        Lca:
            r0 = r309
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ConcurrentHashMultiset.CnX(java.lang.Object, int, int):boolean");
    }

    @Override // X.AbstractC10624u0, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.A00.clear();
    }

    @Override // X.AbstractC10624u0, java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, X.C4u1
    public Iterator iterator() {
        return new Lsf(this, entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.C4u1
    public int size() {
        long j = 0;
        while (true) {
            long j2 = j;
            if (!1BK.A1A(this.A00).hasNext()) {
                return 1NS.A01(j2);
            }
            j = j2 + ((AtomicInteger) r0.next()).get();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return A00().toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return A00().toArray(objArr);
    }
}
