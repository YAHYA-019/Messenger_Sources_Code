package X;

import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;

/* renamed from: X.4G6, reason: invalid class name */
/* loaded from: 4G6.class */
public class C4G6 implements C4G7 {
    public final int A00;
    public volatile /* synthetic */ Object _closeCause$volatile;
    public volatile /* synthetic */ long bufferEnd$volatile;
    public volatile /* synthetic */ Object bufferEndSegment$volatile;
    public volatile /* synthetic */ Object closeHandler$volatile;
    public volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public volatile /* synthetic */ Object receiveSegment$volatile;
    public volatile /* synthetic */ long receivers$volatile;
    public volatile /* synthetic */ Object sendSegment$volatile;
    public volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    public static final /* synthetic */ AtomicLongFieldUpdater A04 = AtomicLongFieldUpdater.newUpdater(C4G6.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater A03 = AtomicLongFieldUpdater.newUpdater(C4G6.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater A01 = AtomicLongFieldUpdater.newUpdater(C4G6.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater A02 = AtomicLongFieldUpdater.newUpdater(C4G6.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A09 = AtomicReferenceFieldUpdater.newUpdater(C4G6.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A08 = AtomicReferenceFieldUpdater.newUpdater(C4G6.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A06 = AtomicReferenceFieldUpdater.newUpdater(C4G6.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A05 = AtomicReferenceFieldUpdater.newUpdater(C4G6.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A07 = AtomicReferenceFieldUpdater.newUpdater(C4G6.class, Object.class, "closeHandler$volatile");

    public C4G6(int i) {
        this.A00 = i;
        if (i < 0) {
            throw 0Pz.A06("Invalid channel capacity: ", ", should be >=0", i);
        }
        int i2 = 4GB.A01;
        this.bufferEnd$volatile = i != 0 ? i != ((-1) >>> 1) ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = A01.get(this);
        4GC r311 = new 4GC(this, (4GC) null, 3, 0L);
        this.sendSegment$volatile = r311;
        this.receiveSegment$volatile = r311;
        if (A0C()) {
            r311 = 4GB.A02;
            11T.A0I(r311, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = r311;
        this._closeCause$volatile = 4GB.A0C;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00f6 -> B:32:0x008d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int A00(java.lang.Object r301, java.lang.Object r302, X.C4G6 r303, X.4GC r304, int r305, long r306, boolean r308) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4G6.A00(java.lang.Object, java.lang.Object, X.4G6, X.4GC, int, long, boolean):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x01ac, code lost:
    
        r302.A08();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01b3, code lost:
    
        return X.4GB.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x018a, code lost:
    
        if (r301 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x018d, code lost:
    
        r316 = r303.A0A(r304, r318, r301);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0080, code lost:
    
        r302.A08();
        r0 = r0.get(r0);
        r0.set(r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0097, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a9, code lost:
    
        if (r0 != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x007d, code lost:
    
        if (r316 == false) goto L73;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007d -> B:15:0x0098). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x018d -> B:8:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A01(java.lang.Object r301, X.C4G6 r302, X.4GC r303, int r304, long r305) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4G6.A01(java.lang.Object, X.4G6, X.4GC, int, long):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object A02(X.0DR r301, X.C4G6 r302) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4G6.A02(X.0DR, X.4G6):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A03(X.0DR r301, X.C4G6 r302, X.4GC r303, int r304, long r305) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4G6.A03(X.0DR, X.4G6, X.4GC, int, long):java.lang.Object");
    }

    public static final Throwable A04(C4G6 c4g6) {
        Throwable th = (Throwable) A05.get(c4g6);
        if (th == null) {
            th = new NoSuchElementException("Channel was closed");
        }
        return th;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x026f, code lost:
    
        r321 = (X.4GC) ((X.45C) X.45C.A01.get(r321));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02f6, code lost:
    
        r308 = (X.4GC) ((X.45C) X.45C.A01.get(r308));
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x030c, code lost:
    
        if (r308 != null) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final X.4GC A05(long r302) {
        /*
            Method dump skipped, instructions count: 885
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4G6.A05(long):X.4GC");
    }

    public static final 4GC A06(C4G6 c4g6, 4GC r302, long j) {
        Object A00;
        boolean z;
        long j2;
        long j3;
        long A0I;
        4GC r305 = r302;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A08;
        int i = 4GB.A01;
        C4Y1 c4y1 = C4Y1.A00;
        loop0: while (true) {
            A00 = 4GG.A00(c4y1, r305, j);
            z = true;
            if (A00 == 4GG.A00) {
                break;
            }
            z = false;
            45B A002 = 4SY.A00(A00);
            while (true) {
                45B r0 = (45B) atomicReferenceFieldUpdater.get(c4g6);
                if (r0.A00 >= A002.A00) {
                    break loop0;
                }
                if (A002.A08()) {
                    if (!C2am.A00(c4g6, r0, A002, atomicReferenceFieldUpdater)) {
                        A0B(A002);
                    } else if (r0.A07()) {
                        r0.A02();
                    }
                }
            }
        }
        if (z) {
            c4g6.BRB();
            j2 = ((45B) r305).A00 * 4GB.A01;
            A0I = c4g6.A0I();
        } else {
            r305 = (4GC) 4SY.A00(A00);
            if (!c4g6.A0C() && j <= A01.get(c4g6) / 4GB.A01) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = A06;
                while (true) {
                    45B r02 = (45B) atomicReferenceFieldUpdater2.get(c4g6);
                    if (r02.A00 >= ((45B) r305).A00 || !r305.A08()) {
                        break;
                    }
                    if (!C2am.A00(c4g6, r02, r305, atomicReferenceFieldUpdater2)) {
                        A0B(r305);
                    } else if (r02.A07()) {
                        r02.A02();
                    }
                }
            }
            long j4 = ((45B) r305).A00;
            if (j4 <= j) {
                return r305;
            }
            j2 = j4 * 4GB.A01;
            AtomicLongFieldUpdater atomicLongFieldUpdater = A03;
            do {
                j3 = atomicLongFieldUpdater.get(c4g6);
                if (j3 >= j2) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(c4g6, j3, j2));
            A0I = c4g6.A0I();
        }
        if (j2 >= A0I) {
            return null;
        }
        r305.A01();
        return null;
    }

    public static final 4GC A07(C4G6 c4g6, 4GC r302, long j) {
        Object A00;
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        4GC r305 = r302;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A09;
        int i = 4GB.A01;
        C4Y1 c4y1 = C4Y1.A00;
        loop0: while (true) {
            A00 = 4GG.A00(c4y1, r305, j);
            z = true;
            if (A00 == 4GG.A00) {
                break;
            }
            z = false;
            45B A002 = 4SY.A00(A00);
            while (true) {
                45B r0 = (45B) atomicReferenceFieldUpdater.get(c4g6);
                if (r0.A00 >= A002.A00) {
                    break loop0;
                }
                if (A002.A08()) {
                    if (!C2am.A00(c4g6, r0, A002, atomicReferenceFieldUpdater)) {
                        A0B(A002);
                    } else if (r0.A07()) {
                        r0.A02();
                    }
                }
            }
        }
        if (z) {
            c4g6.BRB();
            j2 = ((45B) r305).A00 * 4GB.A01;
            j5 = A03.get(c4g6);
        } else {
            r305 = (4GC) 4SY.A00(A00);
            long j6 = ((45B) r305).A00;
            if (j6 <= j) {
                return r305;
            }
            j2 = j6 * 4GB.A01;
            AtomicLongFieldUpdater atomicLongFieldUpdater = A04;
            do {
                j3 = atomicLongFieldUpdater.get(c4g6);
                j4 = 1152921504606846975L & j3;
                if (j4 >= j2) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(c4g6, j3, (((int) (j3 >> 60)) << 60) + j4));
            j5 = A03.get(c4g6);
        }
        if (j2 >= j5) {
            return null;
        }
        r305.A01();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x01fe, code lost:
    
        if (r0 >= X.C4G6.A03.get(r301)) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0213, code lost:
    
        if (r305.A0A(r0, r337, X.4GB.A0F) == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0222, code lost:
    
        if (A0F(r337, r305, r0) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x02fb, code lost:
    
        r0.set(r0, X.4GB.A0A);
        r305.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0225, code lost:
    
        r0.set(r0, X.4GB.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0092, code lost:
    
        if ((r0.addAndGet(r301, 1) & 4611686018427387904L) == 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a7, code lost:
    
        if ((r0.get(r301) & 4611686018427387904L) == 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x025d -> B:45:0x0201). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A08() {
        /*
            Method dump skipped, instructions count: 786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4G6.A08():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v54, types: [X.0DR] */
    private final void A09(C2s9 c2s9, boolean z) {
        C2s7 c2s7;
        0DV r307;
        if (c2s9 instanceof C2s8) {
            c2s7 = (0DR) c2s9;
            Throwable A042 = z ? A04(this) : A0J();
            11T.A0F(A042, 0);
            r307 = new 0DV(A042);
        } else {
            if (!(c2s9 instanceof 5RU)) {
                if (!(c2s9 instanceof 4GF)) {
                    if (!(c2s9 instanceof 5RT)) {
                        throw 1BL.A0h(c2s9, "Unexpected waiter: ", AnonymousClass001.A0k());
                    }
                    5RT.A00(this, 4GB.A04, (5RT) c2s9);
                    return;
                }
                4GF r0 = (4GF) c2s9;
                C2s7 c2s72 = r0.A01;
                11T.A0D(c2s72);
                r0.A01 = null;
                r0.A00 = 4GB.A04;
                Throwable th = (Throwable) A05.get(r0.A02);
                c2s72.resumeWith(th == null ? false : new 0DV(th));
                return;
            }
            c2s7 = ((5RU) c2s9).A00;
            r307 = new 5qQ(new C7xo((Throwable) A05.get(this)));
        }
        c2s7.resumeWith(r307);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0025, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A0A(X.4GC r302, long r303) {
        /*
            r301 = this;
        L0:
            r0 = r302
            long r0 = r0.A00
            r305 = r0
            r0 = r305
            r1 = r303
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r307 = r0
            r0 = r307
            if (r0 >= 0) goto L25
            r0 = r302
            X.45C r0 = r0.A00()
            X.45B r0 = (X.45B) r0
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L25
            r0 = r308
            r302 = r0
            goto L0
        L25:
            r0 = r302
            boolean r0 = r0.A03()
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L44
            r0 = r302
            X.45C r0 = r0.A00()
            X.45B r0 = (X.45B) r0
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L44
            r0 = r308
            r302 = r0
            goto L25
        L44:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C4G6.A06
            r309 = r0
        L49:
            r0 = r309
            r1 = r301
            java.lang.Object r0 = r0.get(r1)
            X.45B r0 = (X.45B) r0
            r310 = r0
            r0 = r310
            long r0 = r0.A00
            r311 = r0
            r0 = r302
            long r0 = r0.A00
            r305 = r0
            r0 = r311
            r1 = r305
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r307 = r0
            r0 = r307
            if (r0 >= 0) goto L8d
            r0 = r302
            boolean r0 = r0.A08()
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L25
            r0 = r301
            r1 = r310
            r2 = r302
            r3 = r309
            boolean r0 = X.C2am.A00(r0, r1, r2, r3)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L8e
            r0 = r310
            A0B(r0)
        L8d:
            return
        L8e:
            r0 = r302
            A0B(r0)
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4G6.A0A(X.4GC, long):void");
    }

    public static void A0B(45B r301) {
        if (r301.A07()) {
            r301.A02();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (r0 == Long.MAX_VALUE) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean A0C() {
        /*
            r301 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.C4G6.A01
            r302 = r0
            r0 = r302
            r1 = r301
            long r0 = r0.get(r1)
            r303 = r0
            r0 = 0
            r305 = r0
            r0 = r303
            r1 = r305
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L2d
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r308 = r0
            r0 = r303
            r1 = r308
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r310 = r0
            r0 = 0
            r307 = r0
            r0 = 0
            r302 = r0
            r0 = r310
            if (r0 != 0) goto L30
        L2d:
            r0 = 1
            r307 = r0
        L30:
            r0 = r307
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4G6.A0C():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003a, code lost:
    
        if (r302 < (X.C4G6.A03.get(r301) + r301.A00)) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean A0D(long r302) {
        /*
            r301 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.C4G6.A01
            r304 = r0
            r0 = r304
            r1 = r301
            long r0 = r0.get(r1)
            r305 = r0
            r0 = r302
            r1 = r305
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r307 = r0
            r0 = r307
            if (r0 < 0) goto L3d
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.C4G6.A03
            r1 = r301
            long r0 = r0.get(r1)
            r308 = r0
            r0 = r301
            int r0 = r0.A00
            long r0 = (long) r0
            r310 = r0
            r0 = r308
            r1 = r310
            long r0 = r0 + r1
            r308 = r0
            r0 = r302
            r1 = r308
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r312 = r0
            r0 = 0
            r307 = r0
            r0 = 0
            r304 = r0
            r0 = r312
            if (r0 >= 0) goto L40
        L3d:
            r0 = 1
            r307 = r0
        L40:
            r0 = r307
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4G6.A0D(long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (X.5RT.A00(r301, r303, (X.5RT) r302) == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean A0E(java.lang.Object r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4G6.A0E(java.lang.Object, java.lang.Object):boolean");
    }

    private final boolean A0F(Object obj, 4GC r303, int i) {
        if (!(obj instanceof C2s8)) {
            if (!(obj instanceof 5RT)) {
                throw 1BL.A0h(obj, "Unexpected waiter: ", AnonymousClass001.A0k());
            }
            11T.A0I(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            int A00 = 5RT.A00(this, 04S.A00, (5RT) obj);
            Integer num = A00 != 0 ? A00 != 1 ? A00 != 2 ? 0S2.A0N : 0S2.A0C : 0S2.A01 : 0S2.A00;
            if (num == 0S2.A01) {
                r303.A01.set(i * 2, null);
            }
            return num == 0S2.A00;
        }
        11T.A0I(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        C2s8 c2s8 = (C2s8) obj;
        04S r0 = 04S.A00;
        int i2 = 4GB.A01;
        Object D5M = c2s8.D5M(r0, null, null);
        if (D5M == null) {
            return false;
        }
        c2s8.AGx(D5M);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006d, code lost:
    
        if (r303 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0070, code lost:
    
        r0 = r0.get(r301);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0098, code lost:
    
        if (r0.compareAndSet(r301, r0, (3 << 60) + (1152921504606846975L & r0)) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009b, code lost:
    
        BRB();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a2, code lost:
    
        if (r0 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a5, code lost:
    
        r0 = X.C4G6.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00aa, code lost:
    
        r0 = r0.get(r301);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b4, code lost:
    
        if (r0 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b7, code lost:
    
        r315 = X.4GB.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ca, code lost:
    
        if (X.C2am.A00(r301, r0, r315, r0) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cf, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d2, code lost:
    
        X.C0B7.A04(r0, 1);
        ((kotlin.jvm.functions.Function1) r0).invoke(r0.get(r301));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f8, code lost:
    
        r315 = X.4GB.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0100, code lost:
    
        r0 = r0.get(r301);
        r0 = (int) (r0 >> 60);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x011f, code lost:
    
        if (r0 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0129, code lost:
    
        if (r0 != 1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x012c, code lost:
    
        r319 = r0 & 1152921504606846975L;
        r311 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0153, code lost:
    
        if (r0.compareAndSet(r301, r0, (r311 << 60) + r319) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0159, code lost:
    
        r319 = r0 & 1152921504606846975L;
        r311 = 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0G(java.lang.Throwable r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4G6.A0G(java.lang.Throwable, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e2, code lost:
    
        r313.A01.set(r317 * 2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0203, code lost:
    
        r313 = (X.45C) X.45C.A01.get(r313);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v155, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v208, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A0H(X.C4G6 r301, long r302, boolean r304) {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4G6.A0H(X.4G6, long, boolean):boolean");
    }

    public final long A0I() {
        return A04.get(this) & 1152921504606846975L;
    }

    public final Throwable A0J() {
        Throwable th = (Throwable) A05.get(this);
        if (th == null) {
            th = new IllegalStateException("Channel was closed");
        }
        return th;
    }

    public final void A0K(long j) {
        4GC r306 = (4GC) A08.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = A03;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.A00 + j2, A01.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j2, j2 + 1)) {
                long j3 = 4GB.A01;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (((45B) r306).A00 != j4) {
                    4GC A062 = A06(this, r306, j4);
                    if (A062 != null) {
                        r306 = A062;
                    }
                }
                if (A01(null, this, r306, i, j2) != 4GB.A08 || j2 < A0I()) {
                    r306.A01();
                }
            }
        }
    }

    public final void A0L(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        long j3;
        if (A0C()) {
            return;
        }
        do {
            atomicLongFieldUpdater = A01;
        } while (atomicLongFieldUpdater.get(this) <= j);
        int i = 4GB.A00;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= i) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = A02;
                do {
                    j2 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j2, 4611686018427387904L + (j2 & 4611686018427387903L)));
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(this);
                    long j5 = atomicLongFieldUpdater2.get(this);
                    long j6 = j5 & 4611686018427387903L;
                    boolean A1N = AnonymousClass001.A1N(((4611686018427387904L & j5) > 0L ? 1 : ((4611686018427387904L & j5) == 0L ? 0 : -1)));
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!A1N) {
                        atomicLongFieldUpdater2.compareAndSet(this, j5, 4611686018427387904L + j6);
                    }
                }
                do {
                    j3 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, j3 & 4611686018427387903L));
                return;
            }
            long j7 = atomicLongFieldUpdater.get(this);
            if (j7 == (A02.get(this) & 4611686018427387903L) && j7 == atomicLongFieldUpdater.get(this)) {
                return;
            } else {
                i2 = i3 + 1;
            }
        }
    }

    @Override // X.C4G9
    public final void AE0(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        A0G(cancellationException, true);
    }

    @Override // X.C4G8
    public boolean AGE(Throwable th) {
        return A0G(th, false);
    }

    @Override // X.C4G9
    public 7N7 B0A() {
        7N5 r0 = 7N5.A00;
        11T.A0I(r0, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        C0B7.A04(r0, 3);
        7N6 r02 = 7N6.A00;
        11T.A0I(r02, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        C0B7.A04(r02, 3);
        return new 7N7(this, r0, r02);
    }

    @Override // X.C4G8
    public void BQG(Function1 function1) {
        0DJ r0;
        0DJ r02;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A07;
        if (C2am.A00(this, null, function1, atomicReferenceFieldUpdater)) {
            return;
        }
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            r0 = 4GB.A05;
            r02 = 4GB.A06;
            if (obj != r0) {
                if (obj != r02) {
                    throw 1BL.A0h(obj, "Another handler is already registered: ", AnonymousClass001.A0k());
                }
                throw AnonymousClass001.A0N("Another handler was already registered and successfully invoked");
            }
        } while (!C2am.A00(this, r0, r02, atomicReferenceFieldUpdater));
        function1.invoke(A05.get(this));
    }

    @Override // X.C4G8
    public boolean BRB() {
        return A0H(this, A04.get(this), false);
    }

    @Override // X.C4G9
    public 4GF BXX() {
        return new 4GF(this);
    }

    @Override // X.C4G9
    public Object CbH(0DR r302) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A08;
        4GC r305 = (4GC) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = A04;
            if (A0H(this, atomicLongFieldUpdater.get(this), true)) {
                Throwable A042 = A04(this);
                StackTraceElement stackTraceElement = C4Sh.A00;
                throw A042;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = A03;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(this);
            long j = 4GB.A01;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (((45B) r305).A00 != j2) {
                4GC A062 = A06(this, r305, j2);
                if (A062 != null) {
                    r305 = A062;
                } else {
                    continue;
                }
            }
            Object A012 = A01(null, this, r305, i, andIncrement);
            0DJ r0 = 4GB.A0H;
            if (A012 == r0) {
                throw AnonymousClass001.A0N("unexpected");
            }
            0DJ r02 = 4GB.A08;
            if (A012 != r02) {
                0DJ r03 = 4GB.A0I;
                if (A012 != r03) {
                    r305.A01();
                    return A012;
                }
                C2s7 A00 = AnonymousClass459.A00(0DT.A02(r302));
                try {
                    Object A013 = A01(A00, this, r305, i, andIncrement);
                    if (A013 == r0) {
                        A00.BQF(r305, i);
                    } else {
                        C2s7 c2s7 = null;
                        if (A013 == r02) {
                            if (andIncrement < A0I()) {
                                r305.A01();
                            }
                            r305 = (4GC) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (A0H(this, atomicLongFieldUpdater.get(this), true)) {
                                    Throwable A043 = A04(this);
                                    11T.A0F(A043, 0);
                                    A00.resumeWith(new 0DV(A043));
                                    break;
                                }
                                long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(this);
                                long j3 = andIncrement2 / j;
                                int i2 = (int) (andIncrement2 % j);
                                if (((45B) r305).A00 != j3) {
                                    4GC A063 = A06(this, r305, j3);
                                    if (A063 != null) {
                                        r305 = A063;
                                    } else {
                                        continue;
                                    }
                                }
                                A013 = A01(A00, this, r305, i2, andIncrement2);
                                if (A013 == r0) {
                                    if (A00 instanceof C2s9) {
                                        c2s7 = A00;
                                    }
                                    if (c2s7 != null) {
                                        c2s7.BQF(r305, i2);
                                    }
                                } else if (A013 == r02) {
                                    if (andIncrement2 < A0I()) {
                                        r305.A01();
                                    }
                                } else if (A013 == r03) {
                                    throw AnonymousClass001.A0N("unexpected");
                                }
                            }
                        }
                        r305.A01();
                        A00.CiL(null, A013);
                    }
                    return A00.A0C();
                } catch (Throwable th) {
                    A00.A0H();
                    throw th;
                }
            }
            if (andIncrement < A0I()) {
                r305.A01();
            }
        }
    }

    @Override // X.C4G9
    public Object CbK(0DR r302) {
        return A02(r302, this);
    }

    @Override // X.C4G8
    public Object CkQ(Object obj, 0DR r303) {
        Object obj2;
        04S r307;
        IllegalStateException A0N;
        4GC r334;
        if (this instanceof C4YD) {
            C4YD c4yd = (C4YD) this;
            if (C4YD.A05(obj, c4yd) instanceof C7xo) {
                throw c4yd.A0J();
            }
        } else {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A09;
            4GC r310 = (4GC) atomicReferenceFieldUpdater.get(this);
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = A04;
                long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
                long j = 1152921504606846975L & andIncrement;
                boolean A0H = A0H(this, andIncrement, false);
                int i = 4GB.A01;
                long j2 = i;
                long j3 = j / j2;
                int i2 = (int) (j % j2);
                if (((45B) r310).A00 != j3) {
                    4GC A072 = A07(this, r310, j3);
                    if (A072 != null) {
                        r310 = A072;
                    } else if (A0H) {
                        break;
                    }
                }
                int A00 = A00(obj, null, this, r310, i2, j, A0H);
                if (A00 == 0) {
                    r310.A01();
                    break;
                }
                if (A00 == 1) {
                    break;
                }
                if (A00 != 2) {
                    if (A00 == 3) {
                        C2s7 A002 = AnonymousClass459.A00(0DT.A02(r303));
                        try {
                            int A003 = A00(obj, A002, this, r310, i2, j, false);
                            if (A003 == 0) {
                                r310.A01();
                                r307 = 04S.A00;
                            } else if (A003 != 1) {
                                if (A003 != 2) {
                                    if (A003 != 4) {
                                        if (A003 == 5) {
                                            r310.A01();
                                            4GC r339 = (4GC) atomicReferenceFieldUpdater.get(this);
                                            while (true) {
                                                long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                                long j4 = andIncrement2 & 1152921504606846975L;
                                                boolean A0H2 = A0H(this, andIncrement2, false);
                                                long j5 = j4 / j2;
                                                int i3 = (int) (j4 % j2);
                                                if (((45B) r339).A00 != j5) {
                                                    r334 = A07(this, r339, j5);
                                                    if (r334 == null) {
                                                        if (A0H2) {
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    r334 = r339;
                                                }
                                                int A004 = A00(obj, A002, this, r334, i3, j4, A0H2);
                                                if (A004 == 0) {
                                                    r334.A01();
                                                    r307 = 04S.A00;
                                                    break;
                                                }
                                                if (A004 == 1) {
                                                    r307 = 04S.A00;
                                                    break;
                                                }
                                                if (A004 != 2) {
                                                    if (A004 == 3) {
                                                        A0N = AnonymousClass001.A0N("unexpected");
                                                        break;
                                                    }
                                                    if (A004 != 4) {
                                                        r334.A01();
                                                        r339 = r334;
                                                    } else if (j4 < A03.get(this)) {
                                                        r334.A01();
                                                    }
                                                } else if (A0H2) {
                                                    r334.A05();
                                                } else {
                                                    C2s7 c2s7 = null;
                                                    if (A002 instanceof C2s9) {
                                                        c2s7 = A002;
                                                    }
                                                    if (c2s7 != null) {
                                                        c2s7.BQF(r334, i3 + i);
                                                    }
                                                }
                                            }
                                        } else {
                                            A0N = AnonymousClass001.A0N("unexpected");
                                        }
                                        throw A0N;
                                    }
                                    if (j < A03.get(this)) {
                                        r310.A01();
                                    }
                                    Throwable A0J = A0J();
                                    11T.A0F(A0J, 0);
                                    new 0DV(A0J);
                                } else {
                                    A002.BQF(r310, i2 + i);
                                }
                                obj2 = A002.A0C();
                            } else {
                                r307 = 04S.A00;
                            }
                            A002.resumeWith(r307);
                            obj2 = A002.A0C();
                        } catch (Throwable th) {
                            A002.A0H();
                            throw th;
                        }
                    } else if (A00 != 4) {
                        r310.A01();
                    } else if (j < A03.get(this)) {
                        r310.A01();
                    }
                } else if (A0H) {
                    r310.A05();
                }
            }
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C2s7.A02;
            C2s7 c2s72 = new C2s7(1, 0DT.A02(r303));
            c2s72.A0F();
            Throwable A0J2 = A0J();
            11T.A0F(A0J2, 0);
            c2s72.resumeWith(new 0DV(A0J2));
            obj2 = c2s72.A0C();
            Object obj3 = 0Ds.A02;
            if (obj2 != obj3) {
                obj2 = 04S.A00;
            }
            if (obj2 == obj3) {
                return obj2;
            }
        }
        return 04S.A00;
    }

    @Override // X.C4G9
    public Object D5L() {
        4GC r321;
        C2s9 c2s9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = A03;
        long j = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = A04;
        long j2 = atomicLongFieldUpdater2.get(this);
        if (!A0H(this, j2, true)) {
            if (j < (j2 & 1152921504606846975L)) {
                C2s9 c2s92 = 4GB.A09;
                4GC r315 = (4GC) A08.get(this);
                while (!A0H(this, atomicLongFieldUpdater2.get(this), true)) {
                    long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
                    long j3 = 4GB.A01;
                    long j4 = andIncrement / j3;
                    int i = (int) (andIncrement % j3);
                    if (((45B) r315).A00 != j4) {
                        r321 = A06(this, r315, j4);
                        if (r321 == null) {
                            continue;
                        }
                    } else {
                        r321 = r315;
                    }
                    Object A012 = A01(c2s92, this, r321, i, andIncrement);
                    if (A012 == 4GB.A0H) {
                        if ((c2s92 instanceof C2s9) && (c2s9 = c2s92) != null) {
                            c2s9.BQF(r321, i);
                        }
                        A0L(andIncrement);
                        r321.A05();
                    } else {
                        if (A012 != 4GB.A08) {
                            if (A012 == 4GB.A0I) {
                                throw AnonymousClass001.A0N("unexpected");
                            }
                            r321.A01();
                            return A012;
                        }
                        if (andIncrement < A0I()) {
                            r321.A01();
                        }
                        r315 = r321;
                    }
                }
            }
            return 5qQ.A01;
        }
        return new C7xo((Throwable) A05.get(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
    
        return new X.C7xo(A0J());
     */
    @Override // X.C4G8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object D5N(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4G6.D5N(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x039d, code lost:
    
        r316 = r316.A00();
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 987
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4G6.toString():java.lang.String");
    }
}
