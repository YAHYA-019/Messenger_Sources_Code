package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.677, reason: invalid class name */
/* loaded from: 677.class */
public final class AnonymousClass677 implements 1iL {
    public final List A00;
    public final boolean A01;

    public AnonymousClass677(List list, boolean z) {
        C0By.A05(!list.isEmpty(), "List of suppliers is empty!");
        this.A00 = list;
        this.A01 = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AnonymousClass677) {
            return C2qv.A01(this.A00, ((AnonymousClass677) obj).A00);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Object get() {
        return new 1OV() { // from class: X.678
            public int A00;
            public int A01;
            public Throwable A02;
            public ArrayList A03;
            public java.util.Map A04;
            public AtomicInteger A05;

            {
                if (AnonymousClass677.this.A01) {
                    return;
                }
                A03();
            }

            public static 1OW A01(AnonymousClass678 anonymousClass678) {
                1OW A02;
                synchronized (anonymousClass678) {
                    A02 = A02(anonymousClass678, anonymousClass678.A00);
                }
                return A02;
            }

            public static 1OW A02(AnonymousClass678 anonymousClass678, int i) {
                1OW r305;
                synchronized (anonymousClass678) {
                    ArrayList arrayList = anonymousClass678.A03;
                    r305 = (arrayList == null || i >= arrayList.size()) ? null : (1OW) arrayList.get(i);
                }
                return r305;
            }

            private void A03() {
                if (this.A05 == null) {
                    synchronized (this) {
                        if (this.A05 == null) {
                            this.A05 = new AtomicInteger(0);
                            List list = AnonymousClass677.this.A00;
                            int size = list.size();
                            this.A01 = size;
                            this.A00 = size;
                            this.A03 = new ArrayList(size);
                            for (int i = 0; i < size; i++) {
                                1OW r0 = (1OW) ((1iL) list.get(i)).get();
                                this.A03.add(r0);
                                r0.D3K(new 67B(this, i), 4DP.A00);
                                if (r0.BNS()) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }

            public static void A04(1OW r301, AnonymousClass678 anonymousClass678, int i) {
                1OW r304;
                Throwable th;
                synchronized (anonymousClass678) {
                    if (r301 == A01(anonymousClass678)) {
                        r304 = null;
                    } else if (r301 == A02(anonymousClass678, i)) {
                        ArrayList arrayList = anonymousClass678.A03;
                        r304 = null;
                        if (arrayList != null && i < arrayList.size()) {
                            r304 = (1OW) arrayList.set(i, null);
                        }
                    } else {
                        r304 = r301;
                    }
                }
                if (r304 != null) {
                    r304.AGD();
                }
                if (i == 0) {
                    anonymousClass678.A02 = r301.AlY();
                    anonymousClass678.A04 = ((1OV) r301).A04;
                }
                if (anonymousClass678.A05.incrementAndGet() != anonymousClass678.A01 || (th = anonymousClass678.A02) == null) {
                    return;
                }
                anonymousClass678.A09(th, anonymousClass678.A04);
            }

            public boolean AGD() {
                if (AnonymousClass677.this.A01) {
                    A03();
                }
                synchronized (this) {
                    if (!super.AGD()) {
                        return false;
                    }
                    ArrayList arrayList = this.A03;
                    this.A03 = null;
                    if (arrayList == null) {
                        return true;
                    }
                    for (int i = 0; i < arrayList.size(); i++) {
                        1OW r0 = (1OW) arrayList.get(i);
                        if (r0 != null) {
                            r0.AGD();
                        }
                    }
                    return true;
                }
            }

            public Object B7p() {
                Object B7p;
                synchronized (this) {
                    if (AnonymousClass677.this.A01) {
                        A03();
                    }
                    1OW A01 = A01(this);
                    B7p = A01 != null ? A01.B7p() : null;
                }
                return B7p;
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
            
                if (r0.BNS() == false) goto L16;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean BNS() {
                /*
                    r301 = this;
                    r0 = r301
                    monitor-enter(r0)
                    r0 = r301
                    X.677 r0 = X.AnonymousClass677.this     // Catch: java.lang.Throwable -> L32
                    r302 = r0
                    r0 = r302
                    boolean r0 = r0.A01     // Catch: java.lang.Throwable -> L32
                    r303 = r0
                    r0 = r303
                    if (r0 == 0) goto L14
                    r0 = r301
                    r0.A03()     // Catch: java.lang.Throwable -> L32
                L14:
                    r0 = r301
                    X.1OW r0 = A01(r0)     // Catch: java.lang.Throwable -> L32
                    r302 = r0
                    r0 = r302
                    if (r0 == 0) goto L2a
                    r0 = r302
                    boolean r0 = r0.BNS()     // Catch: java.lang.Throwable -> L32
                    r304 = r0
                    r0 = 1
                    r303 = r0
                    r0 = r304
                    if (r0 != 0) goto L2e
                L2a:
                    r0 = 0
                    r303 = r0
                    r0 = 0
                    r302 = r0
                L2e:
                    r0 = r301
                    monitor-exit(r0)
                    r0 = r303
                    return r0
                L32:
                    r302 = move-exception
                    r0 = r301
                    monitor-exit(r0)
                    r0 = r302
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass678.BNS():boolean");
            }
        };
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        C46q A00 = C2qv.A00(this);
        C46q.A00(A00, this.A00, "list");
        return A00.toString();
    }
}
