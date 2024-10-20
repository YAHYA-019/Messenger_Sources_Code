package X;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.ReferenceQueue;
import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;

/* renamed from: X.1kf, reason: invalid class name */
/* loaded from: 1kf.class */
public final class C1kf extends ReentrantLock {
    public final Queue accessQueue;
    public volatile int count;
    public final ReferenceQueue keyReferenceQueue;
    public final 1kN map;
    public final long maxSegmentWeight;
    public int modCount;
    public final AtomicInteger readCount = new AtomicInteger();
    public final Queue recencyQueue;
    public final 1kA statsCounter;
    public volatile AtomicReferenceArray table;
    public int threshold;
    public long totalWeight;
    public final ReferenceQueue valueReferenceQueue;
    public final Queue writeQueue;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.util.Queue] */
    public C1kf(1kA r302, 1kN r303, int i, long j) {
        boolean z;
        ConcurrentLinkedQueue concurrentLinkedQueue;
        this.map = r303;
        this.maxSegmentWeight = j;
        r302.getClass();
        this.statsCounter = r302;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i);
        int length = (atomicReferenceArray.length() * 3) / 4;
        this.threshold = length;
        if (this.map.A0J == C1ka.A01 && length == this.maxSegmentWeight) {
            this.threshold = length + 1;
        }
        this.table = atomicReferenceArray;
        1kR r0 = r303.A0G;
        1kR r02 = 1kR.A01;
        ReferenceQueue referenceQueue = null;
        this.keyReferenceQueue = r0 != r02 ? new ReferenceQueue() : null;
        this.valueReferenceQueue = r303.A0H != r02 ? new ReferenceQueue() : referenceQueue;
        if (r303.A06 > 0 || r303.A08 >= 0) {
            z = true;
            concurrentLinkedQueue = new ConcurrentLinkedQueue();
        } else {
            z = false;
            concurrentLinkedQueue = 1kN.A0N;
        }
        this.recencyQueue = concurrentLinkedQueue;
        this.writeQueue = r303.A07 > 0 ? new 5HR() : 1kN.A0N;
        this.accessQueue = z ? new AbstractQueue() { // from class: X.1kh
            public final C1kk A00 = new C1ki();

            @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
            public void clear() {
                C1kk c1kk = this.A00;
                C1kk AzA = c1kk.AzA();
                while (true) {
                    C1kk c1kk2 = AzA;
                    if (c1kk2 == c1kk) {
                        c1kk.Crf(c1kk);
                        c1kk.CtK(c1kk);
                        return;
                    } else {
                        C1kk AzA2 = c1kk2.AzA();
                        2FK r03 = 2FK.A01;
                        c1kk2.Crf(r03);
                        c1kk2.CtK(r03);
                        AzA = AzA2;
                    }
                }
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public boolean contains(Object obj) {
                boolean z2 = false;
                if (((C1kk) obj).AzA() != 2FK.A01) {
                    z2 = true;
                }
                return z2;
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public boolean isEmpty() {
                C1kk c1kk = this.A00;
                return AnonymousClass001.A1W(c1kk.AzA(), c1kk);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public Iterator iterator() {
                C1kk c1kk = this.A00;
                C1kk AzA = c1kk.AzA();
                if (AzA == c1kk) {
                    AzA = null;
                }
                return new 3CU(this, AzA);
            }

            @Override // java.util.Queue
            public /* bridge */ /* synthetic */ boolean offer(Object obj) {
                C1kk c1kk = (C1kk) obj;
                C1kk B4Z = c1kk.B4Z();
                C1kk AzA = c1kk.AzA();
                B4Z.Crf(AzA);
                AzA.CtK(B4Z);
                C1kk c1kk2 = this.A00;
                C1kk B4Z2 = c1kk2.B4Z();
                B4Z2.Crf(c1kk);
                c1kk.CtK(B4Z2);
                c1kk.Crf(c1kk2);
                c1kk2.CtK(c1kk);
                return true;
            }

            @Override // java.util.Queue
            public /* bridge */ /* synthetic */ Object peek() {
                C1kk c1kk = this.A00;
                C1kk AzA = c1kk.AzA();
                if (AzA == c1kk) {
                    AzA = null;
                }
                return AzA;
            }

            @Override // java.util.Queue
            public /* bridge */ /* synthetic */ Object poll() {
                C1kk c1kk = this.A00;
                C1kk AzA = c1kk.AzA();
                if (AzA == c1kk) {
                    return null;
                }
                remove(AzA);
                return AzA;
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public boolean remove(Object obj) {
                C1kk c1kk = (C1kk) obj;
                C1kk B4Z = c1kk.B4Z();
                2FK AzA = c1kk.AzA();
                B4Z.Crf(AzA);
                AzA.CtK(B4Z);
                2FK r03 = 2FK.A01;
                c1kk.Crf(r03);
                c1kk.CtK(r03);
                boolean z2 = false;
                if (AzA != r03) {
                    z2 = true;
                }
                return z2;
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public int size() {
                C1kk c1kk = this.A00;
                int i2 = 0;
                for (C1kk AzA = c1kk.AzA(); AzA != c1kk; AzA = AzA.AzA()) {
                    i2++;
                }
                return i2;
            }
        } : 1kN.A0N;
    }

    public static C1kk A00(C1kf c1kf, 1kP r302, C1kk c1kk, C1kk c1kk2, EnumC01303qn enumC01303qn, Object obj, Object obj2) {
        A0H(c1kf, enumC01303qn, obj, obj2, r302.BKd());
        c1kf.writeQueue.remove(c1kk2);
        c1kf.accessQueue.remove(c1kk2);
        if (r302.BTn()) {
            r302.BgS((Object) null);
            return c1kk;
        }
        int i = c1kf.count;
        C1kk Az6 = c1kk2.Az6();
        while (c1kk != c1kk2) {
            C1kk A03 = c1kf.A03(c1kk, Az6);
            if (A03 != null) {
                Az6 = A03;
            } else {
                c1kf.A0I(c1kk);
                i--;
            }
            c1kk = c1kk.Az6();
        }
        c1kf.count = i;
        return Az6;
    }

    public static C1kk A01(C1kf c1kf, Object obj, int i) {
        C1kk c1kk = (C1kk) c1kf.table.get((r0.length() - 1) & i);
        while (true) {
            C1kk c1kk2 = c1kk;
            if (c1kk2 == null) {
                return null;
            }
            if (c1kk2.Aoj() == i) {
                Object key = c1kk2.getKey();
                if (key == null) {
                    c1kf.A09();
                } else if (c1kf.map.A0A.equivalent(obj, key)) {
                    return c1kk2;
                }
            }
            c1kk = c1kk2.Az6();
        }
    }

    public static C1kk A02(C1kf c1kf, Object obj, int i, long j) {
        C1kk A01 = A01(c1kf, obj, i);
        if (A01 == null) {
            return null;
        }
        if (!c1kf.map.A02(A01, j)) {
            return A01;
        }
        if (!c1kf.tryLock()) {
            return null;
        }
        try {
            c1kf.A0A(j);
            c1kf.unlock();
            return null;
        } catch (Throwable th) {
            c1kf.unlock();
            throw th;
        }
    }

    private C1kk A03(C1kk c1kk, C1kk c1kk2) {
        Object key = c1kk.getKey();
        if (key == null) {
            return null;
        }
        1kP BIt = c1kk.BIt();
        Object obj = BIt.get();
        if (obj == null && BIt.BQN()) {
            return null;
        }
        C2zr c2zr = (C2zr) this.map.A0F;
        int i = c2zr.A00;
        C1kk A01 = c2zr.A01(this, c1kk2, key, c1kk.Aoj());
        switch (i) {
            case 1:
            case 5:
                C1kd.A00(c1kk, A01);
                break;
            case 3:
            case 7:
                C1kd.A00(c1kk, A01);
            case 2:
            case 6:
                A01.Cwk(c1kk.BL5());
                C1kk B4a = c1kk.B4a();
                B4a.Crg(A01);
                A01.CtL(B4a);
                C1kk AzB = c1kk.AzB();
                A01.Crg(AzB);
                AzB.CtL(A01);
                2FK r0 = 2FK.A01;
                c1kk.Crg(r0);
                c1kk.CtL(r0);
                break;
        }
        A01.Cw2(BIt.AIH(A01, obj, this.valueReferenceQueue));
        return A01;
    }

    public static Object A04(2FG r301, C1kf c1kf, ListenableFuture listenableFuture, Object obj, int i) {
        Object obj2;
        Throwable th;
        C1kk c1kk;
        try {
            obj2 = 1Yz.A00(listenableFuture);
            try {
                if (obj2 != null) {
                    r301.A00.elapsed(TimeUnit.NANOSECONDS);
                    c1kf.lock();
                    try {
                        long read = c1kf.map.A0C.read();
                        A0C(c1kf, read);
                        int i2 = c1kf.count + 1;
                        if (i2 > c1kf.threshold) {
                            c1kf.A08();
                            i2 = c1kf.count + 1;
                        }
                        AtomicReferenceArray atomicReferenceArray = c1kf.table;
                        int length = i & (atomicReferenceArray.length() - 1);
                        C1kk c1kk2 = (C1kk) atomicReferenceArray.get(length);
                        C1kk c1kk3 = c1kk2;
                        while (true) {
                            c1kk = c1kk3;
                            if (c1kk == null) {
                                c1kf.modCount++;
                                C1kd c1kd = c1kf.map.A0F;
                                obj.getClass();
                                c1kk = c1kd.A01(c1kf, c1kk2, obj, i);
                                A0G(c1kf, c1kk, obj2, read);
                                atomicReferenceArray.set(length, c1kk);
                                break;
                            }
                            Object key = c1kk.getKey();
                            if (c1kk.Aoj() == i && key != null && c1kf.map.A0A.equivalent(obj, key)) {
                                1kP BIt = c1kk.BIt();
                                Object obj3 = BIt.get();
                                if (r301 == BIt || (obj3 == null && BIt != 1kN.A0M)) {
                                    c1kf.modCount++;
                                    if (r301.A02.BQN()) {
                                        A0H(c1kf, obj3 == null ? EnumC01303qn.A00 : EnumC01303qn.A03, obj, obj3, r301.A02.BKd());
                                        i2--;
                                    }
                                    A0G(c1kf, c1kk, obj2, read);
                                } else {
                                    A0H(c1kf, EnumC01303qn.A03, obj, obj2, 0);
                                }
                            } else {
                                c1kk3 = c1kk.Az6();
                            }
                        }
                        c1kf.count = i2;
                        A0D(c1kf, c1kk);
                        c1kf.unlock();
                        A0B(c1kf);
                        return obj2;
                    } catch (Throwable th2) {
                        th = th2;
                        c1kf.unlock();
                        A0B(c1kf);
                    }
                } else {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("CacheLoader returned null for key ");
                    A0k.append(obj);
                    new RuntimeException(AnonymousClass001.A0d(".", A0k));
                }
                throw th;
            } catch (Throwable th3) {
                th = th3;
                if (obj2 == null) {
                    r301.A00.elapsed(TimeUnit.NANOSECONDS);
                    c1kf.lock();
                    try {
                        AtomicReferenceArray atomicReferenceArray2 = c1kf.table;
                        int length2 = (atomicReferenceArray2.length() - 1) & i;
                        C1kk c1kk4 = (C1kk) atomicReferenceArray2.get(length2);
                        C1kk c1kk5 = c1kk4;
                        while (true) {
                            C1kk c1kk6 = c1kk5;
                            if (c1kk6 == null) {
                                break;
                            }
                            Object key2 = c1kk6.getKey();
                            if (c1kk6.Aoj() != i || key2 == null || !c1kf.map.A0A.equivalent(obj, key2)) {
                                c1kk5 = c1kk6.Az6();
                            } else if (c1kk6.BIt() == r301) {
                                if (r301.A02.BQN()) {
                                    c1kk6.Cw2(r301.A02);
                                } else {
                                    int i3 = c1kf.count;
                                    C1kk Az6 = c1kk6.Az6();
                                    while (c1kk4 != c1kk6) {
                                        C1kk A03 = c1kf.A03(c1kk4, Az6);
                                        if (A03 != null) {
                                            Az6 = A03;
                                        } else {
                                            c1kf.A0I(c1kk4);
                                            i3--;
                                        }
                                        c1kk4 = c1kk4.Az6();
                                    }
                                    c1kf.count = i3;
                                    atomicReferenceArray2.set(length2, Az6);
                                }
                            }
                        }
                    } finally {
                        c1kf.unlock();
                        A0B(c1kf);
                    }
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            obj2 = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Throwable, boolean] */
    public static Object A05(C1kf c1kf, 1kP r302, C1kk c1kk, Object obj) {
        if (!r302.BTn()) {
            throw new AssertionError();
        }
        Preconditions.checkState((boolean) (!Thread.holdsLock(c1kk)), "Recursive load of: %s", obj);
        Object DA6 = r302.DA6();
        if (DA6 != null) {
            A0F(c1kf, c1kk, c1kf.map.A0C.read());
            return DA6;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CacheLoader returned null for key ");
        A0k.append(obj);
        throw new RuntimeException(AnonymousClass001.A0d(".", A0k));
    }

    private void A06() {
        while (true) {
            Object poll = this.recencyQueue.poll();
            if (poll == null) {
                return;
            }
            if (this.accessQueue.contains(poll)) {
                this.accessQueue.add(poll);
            }
        }
    }

    private void A07() {
        1kR r0 = this.map.A0G;
        1kR r02 = 1kR.A01;
        if (r0 != r02) {
            int i = 0;
            do {
                Object poll = this.keyReferenceQueue.poll();
                if (poll == null) {
                    break;
                }
                C1kk c1kk = (C1kk) poll;
                1kN r03 = this.map;
                int Aoj = c1kk.Aoj();
                C1kf A01 = 1kN.A01(r03, Aoj);
                A01.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = A01.table;
                    int length = (atomicReferenceArray.length() - 1) & Aoj;
                    C1kk c1kk2 = (C1kk) atomicReferenceArray.get(length);
                    C1kk c1kk3 = c1kk2;
                    while (true) {
                        C1kk c1kk4 = c1kk3;
                        if (c1kk4 == null) {
                            break;
                        }
                        if (c1kk4 == c1kk) {
                            A01.modCount++;
                            C1kk A00 = A00(A01, c1kk4.BIt(), c1kk2, c1kk4, EnumC01303qn.A00, c1kk4.getKey(), c1kk4.BIt().get());
                            int i2 = A01.count - 1;
                            atomicReferenceArray.set(length, A00);
                            A01.count = i2;
                            break;
                        }
                        c1kk3 = c1kk4.Az6();
                    }
                    A01.unlock();
                    A0B(A01);
                    i++;
                } catch (Throwable th) {
                    A01.unlock();
                    A0B(A01);
                    throw th;
                }
            } while (i != 16);
        }
        if (this.map.A0H != r02) {
            int i3 = 0;
            do {
                1kP poll2 = this.valueReferenceQueue.poll();
                if (poll2 == null) {
                    return;
                }
                1kP r04 = poll2;
                1kN r05 = this.map;
                C1kk Ak6 = r04.Ak6();
                int Aoj2 = Ak6.Aoj();
                C1kf A012 = 1kN.A01(r05, Aoj2);
                Object key = Ak6.getKey();
                A012.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray2 = A012.table;
                    int length2 = (atomicReferenceArray2.length() - 1) & Aoj2;
                    C1kk c1kk5 = (C1kk) atomicReferenceArray2.get(length2);
                    C1kk c1kk6 = c1kk5;
                    while (true) {
                        C1kk c1kk7 = c1kk6;
                        if (c1kk7 == null) {
                            break;
                        }
                        Object key2 = c1kk7.getKey();
                        if (c1kk7.Aoj() != Aoj2 || key2 == null || !A012.map.A0A.equivalent(key, key2)) {
                            c1kk6 = c1kk7.Az6();
                        } else if (c1kk7.BIt() == r04) {
                            A012.modCount++;
                            C1kk A002 = A00(A012, r04, c1kk5, c1kk7, EnumC01303qn.A00, key2, r04.get());
                            int i4 = A012.count - 1;
                            atomicReferenceArray2.set(length2, A002);
                            A012.count = i4;
                        }
                    }
                    i3++;
                } finally {
                    A012.unlock();
                    if (!A012.isHeldByCurrentThread()) {
                        A0B(A012);
                    }
                }
            } while (i3 != 16);
        }
    }

    private void A08() {
        AtomicReferenceArray atomicReferenceArray = this.table;
        int length = atomicReferenceArray.length();
        if (length >= 1073741824) {
            return;
        }
        int i = this.count;
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length << 1);
        this.threshold = (atomicReferenceArray2.length() * 3) / 4;
        int length2 = atomicReferenceArray2.length() - 1;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= length) {
                this.table = atomicReferenceArray2;
                this.count = i;
                return;
            }
            C1kk c1kk = (C1kk) atomicReferenceArray.get(i3);
            if (c1kk != null) {
                C1kk Az6 = c1kk.Az6();
                int Aoj = c1kk.Aoj() & length2;
                if (Az6 == null) {
                    atomicReferenceArray2.set(Aoj, c1kk);
                } else {
                    C1kk c1kk2 = c1kk;
                    do {
                        int Aoj2 = Az6.Aoj() & length2;
                        if (Aoj2 != Aoj) {
                            c1kk2 = Az6;
                            Aoj = Aoj2;
                        }
                        Az6 = Az6.Az6();
                    } while (Az6 != null);
                    atomicReferenceArray2.set(Aoj, c1kk2);
                    while (c1kk != c1kk2) {
                        int Aoj3 = c1kk.Aoj() & length2;
                        C1kk A03 = A03(c1kk, (C1kk) atomicReferenceArray2.get(Aoj3));
                        if (A03 != null) {
                            atomicReferenceArray2.set(Aoj3, A03);
                        } else {
                            A0I(c1kk);
                            i--;
                        }
                        c1kk = c1kk.Az6();
                    }
                }
            }
            i2 = i3 + 1;
        }
    }

    private void A09() {
        if (tryLock()) {
            try {
                A07();
            } finally {
                unlock();
            }
        }
    }

    private void A0A(long j) {
        C1kk c1kk;
        C1kk c1kk2;
        A06();
        do {
            c1kk = (C1kk) this.writeQueue.peek();
            if (c1kk == null || !this.map.A02(c1kk, j)) {
                do {
                    c1kk2 = (C1kk) this.accessQueue.peek();
                    if (c1kk2 == null || !this.map.A02(c1kk2, j)) {
                        return;
                    }
                } while (A0J(c1kk2, EnumC01303qn.A01, c1kk2.Aoj()));
                throw new AssertionError();
            }
        } while (A0J(c1kk, EnumC01303qn.A01, c1kk.Aoj()));
        throw new AssertionError();
    }

    public static void A0B(C1kf c1kf) {
        if (c1kf.isHeldByCurrentThread()) {
            return;
        }
        1kN r0 = c1kf.map;
        while (true) {
            2FL r02 = (2FL) r0.A0K.poll();
            if (r02 == null) {
                return;
            }
            try {
                r0.A0I.CGK(r02);
            } catch (Throwable th) {
                1kN.A0O.log(Level.WARNING, "Exception thrown by removal listener", th);
            }
        }
    }

    public static void A0C(C1kf c1kf, long j) {
        if (c1kf.tryLock()) {
            try {
                c1kf.A07();
                c1kf.A0A(j);
                c1kf.readCount.set(0);
            } finally {
                c1kf.unlock();
            }
        }
    }

    public static void A0D(C1kf c1kf, C1kk c1kk) {
        if (c1kf.map.A08 >= 0) {
            c1kf.A06();
            if (c1kk.BIt().BKd() > c1kf.maxSegmentWeight) {
                if (!c1kf.A0J(c1kk, EnumC01303qn.A04, c1kk.Aoj())) {
                    throw new AssertionError();
                }
            }
            while (c1kf.totalWeight > c1kf.maxSegmentWeight) {
                for (C1kk c1kk2 : c1kf.accessQueue) {
                    if (c1kk2.BIt().BKd() > 0) {
                        if (!c1kf.A0J(c1kk2, EnumC01303qn.A04, c1kk2.Aoj())) {
                            throw new AssertionError();
                        }
                    }
                }
                throw new AssertionError();
            }
        }
    }

    public static void A0E(C1kf c1kf, C1kk c1kk, long j) {
        if (c1kf.map.A06 > 0) {
            c1kk.ClW(j);
        }
        c1kf.accessQueue.add(c1kk);
    }

    public static void A0F(C1kf c1kf, C1kk c1kk, long j) {
        if (c1kf.map.A06 > 0) {
            c1kk.ClW(j);
        }
        c1kf.recencyQueue.add(c1kk);
    }

    public static void A0G(C1kf c1kf, C1kk c1kk, Object obj, long j) {
        1kP BIt = c1kk.BIt();
        1kR r0 = c1kf.map.A0H;
        c1kk.Cw2(r0 instanceof 1kS ? new 2FM(obj) : r0 instanceof 1kV ? new C3ju(c1kk, obj, c1kf.valueReferenceQueue) : new C3jt(c1kk, obj, c1kf.valueReferenceQueue));
        c1kf.A06();
        c1kf.totalWeight++;
        if (c1kf.map.A06 > 0) {
            c1kk.ClW(j);
        }
        1kN r02 = c1kf.map;
        if (r02.A07 > 0 || r02.A09 > 0) {
            c1kk.Cwk(j);
        }
        c1kf.accessQueue.add(c1kk);
        c1kf.writeQueue.add(c1kk);
        BIt.BgS(obj);
    }

    public static void A0H(C1kf c1kf, EnumC01303qn enumC01303qn, Object obj, Object obj2, int i) {
        c1kf.totalWeight -= i;
        if (c1kf.map.A0K != 1kN.A0N) {
            c1kf.map.A0K.offer(new 2FL(enumC01303qn, obj, obj2));
        }
    }

    private void A0I(C1kk c1kk) {
        Object key = c1kk.getKey();
        c1kk.Aoj();
        A0H(this, EnumC01303qn.A00, key, c1kk.BIt().get(), c1kk.BIt().BKd());
        this.writeQueue.remove(c1kk);
        this.accessQueue.remove(c1kk);
    }

    private boolean A0J(C1kk c1kk, EnumC01303qn enumC01303qn, int i) {
        AtomicReferenceArray atomicReferenceArray = this.table;
        int length = (atomicReferenceArray.length() - 1) & i;
        C1kk c1kk2 = (C1kk) atomicReferenceArray.get(length);
        C1kk c1kk3 = c1kk2;
        while (true) {
            C1kk c1kk4 = c1kk3;
            if (c1kk4 == null) {
                return false;
            }
            if (c1kk4 == c1kk) {
                this.modCount++;
                C1kk A00 = A00(this, c1kk4.BIt(), c1kk2, c1kk4, enumC01303qn, c1kk4.getKey(), c1kk4.BIt().get());
                int i2 = this.count - 1;
                atomicReferenceArray.set(length, A00);
                this.count = i2;
                return true;
            }
            c1kk3 = c1kk4.Az6();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x01b3, code lost:
    
        r301.count = r319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01b9, code lost:
    
        A0D(r301, r314);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01bf, code lost:
    
        unlock();
        A0B(r301);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c7, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A0K(int r302, java.lang.Object r303, java.lang.Object r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1kf.A0K(int, java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r313v3 ??, still in use, count: 2, list:
          (r313v3 ??) from 0x014c: PHI (r313v1 ??) = (r313v0 ??), (r313v3 ??), (r313v4 ??) binds: [B:84:0x0141, B:63:0x00f4, B:34:0x0149] A[DONT_GENERATE, DONT_INLINE]
          (r313v3 ?? I:X.1kP) from 0x00f6: INVOKE (r312v0 ?? I:X.1kk), (r313v3 ?? I:X.1kP) INTERFACE call: X.1kk.Cw2(X.1kP):void A[Catch: all -> 0x0197, MD:(X.1kP):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public java.lang.Object A0L(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r313v3 ??, still in use, count: 2, list:
          (r313v3 ??) from 0x014c: PHI (r313v1 ??) = (r313v0 ??), (r313v3 ??), (r313v4 ??) binds: [B:84:0x0141, B:63:0x00f4, B:34:0x0149] A[DONT_GENERATE, DONT_INLINE]
          (r313v3 ?? I:X.1kP) from 0x00f6: INVOKE (r312v0 ?? I:X.1kk), (r313v3 ?? I:X.1kP) INTERFACE call: X.1kk.Cw2(X.1kP):void A[Catch: all -> 0x0197, MD:(X.1kP):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r302v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:80)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
        */

    public Object A0M(C1kk c1kk, long j) {
        Object obj;
        if (c1kk.getKey() == null || (obj = c1kk.BIt().get()) == null) {
            A09();
            return null;
        }
        if (!this.map.A02(c1kk, j)) {
            return obj;
        }
        if (!tryLock()) {
            return null;
        }
        try {
            A0A(j);
            unlock();
            return null;
        } catch (Throwable th) {
            unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c1, code lost:
    
        if (r305 == null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A0N(java.lang.Object r302, int r303) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1kf.A0N(java.lang.Object, int):java.lang.Object");
    }

    public void A0O() {
        if ((this.readCount.incrementAndGet() & 63) == 0) {
            A0C(this, this.map.A0C.read());
            A0B(this);
        }
    }
}
