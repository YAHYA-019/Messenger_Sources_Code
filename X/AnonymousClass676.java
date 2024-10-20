package X;

import java.util.List;

/* renamed from: X.676, reason: invalid class name */
/* loaded from: 676.class */
public final class AnonymousClass676 implements 1iL {
    public final List A00;

    public AnonymousClass676(List list) {
        C0By.A05(!list.isEmpty(), "List of suppliers is empty!");
        this.A00 = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AnonymousClass676) {
            return C2qv.A01(this.A00, ((AnonymousClass676) obj).A00);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Object get() {
        return new 1OV() { // from class: X.679
            public int A00 = 0;
            public 1OW A01 = null;
            public 1OW A02 = null;

            {
                if (A03()) {
                    return;
                }
                A08(AnonymousClass001.A0T("No data source supplier or supplier returned null."));
            }

            public static 1OW A01(AnonymousClass679 anonymousClass679) {
                1OW r0;
                synchronized (anonymousClass679) {
                    r0 = anonymousClass679.A02;
                }
                return r0;
            }

            public static void A02(1OW r301, AnonymousClass679 anonymousClass679) {
                boolean z;
                synchronized (anonymousClass679) {
                    if (anonymousClass679.isClosed() || r301 != anonymousClass679.A01) {
                        z = false;
                    } else {
                        anonymousClass679.A01 = null;
                        z = true;
                    }
                }
                if (z) {
                    if (r301 != A01(anonymousClass679) && r301 != null) {
                        r301.AGD();
                    }
                    if (anonymousClass679.A03()) {
                        return;
                    }
                    anonymousClass679.A09(r301.AlY(), ((1OV) r301).A04);
                }
            }

            private boolean A03() {
                1iL r305;
                boolean z;
                synchronized (this) {
                    if (!isClosed()) {
                        int i = this.A00;
                        List list = AnonymousClass676.this.A00;
                        if (i < list.size()) {
                            int i2 = this.A00;
                            this.A00 = i2 + 1;
                            r305 = (1iL) list.get(i2);
                        }
                    }
                    r305 = null;
                }
                1OW r306 = null;
                if (r305 != null) {
                    r306 = (1OW) r305.get();
                }
                synchronized (this) {
                    if (isClosed()) {
                        z = false;
                    } else {
                        this.A01 = r306;
                        z = true;
                    }
                }
                if (!z) {
                    if (r306 == null) {
                        return false;
                    }
                    r306.AGD();
                    return false;
                }
                if (r306 == null) {
                    return false;
                }
                r306.D3K(new 67A(this), 4DP.A00);
                return true;
            }

            public boolean AGD() {
                synchronized (this) {
                    if (!super.AGD()) {
                        return false;
                    }
                    1OW r0 = this.A01;
                    this.A01 = null;
                    1OW r02 = this.A02;
                    this.A02 = null;
                    if (r02 != null) {
                        r02.AGD();
                    }
                    if (r0 == null) {
                        return true;
                    }
                    r0.AGD();
                    return true;
                }
            }

            public Object B7p() {
                Object B7p;
                synchronized (this) {
                    1OW A01 = A01(this);
                    B7p = A01 != null ? A01.B7p() : null;
                }
                return B7p;
            }

            /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
            
                if (r0.BNS() == false) goto L10;
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
                    X.1OW r0 = A01(r0)     // Catch: java.lang.Throwable -> L20
                    r302 = r0
                    r0 = r302
                    if (r0 == 0) goto L18
                    r0 = r302
                    boolean r0 = r0.BNS()     // Catch: java.lang.Throwable -> L20
                    r303 = r0
                    r0 = 1
                    r304 = r0
                    r0 = r303
                    if (r0 != 0) goto L1c
                L18:
                    r0 = 0
                    r304 = r0
                    r0 = 0
                    r302 = r0
                L1c:
                    r0 = r301
                    monitor-exit(r0)
                    r0 = r304
                    return r0
                L20:
                    r302 = move-exception
                    r0 = r301
                    monitor-exit(r0)
                    r0 = r302
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass679.BNS():boolean");
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
