package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.5jx, reason: invalid class name */
/* loaded from: 5jx.class */
public final class C5jx extends 5Tm {
    public 5To A00;
    public 5To A01;
    public 5To A02;
    public 5To A03;
    public 5To A04;
    public 5To A05;
    public 5To A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public Object A0B;
    public Object A0C;
    public Object A0D;
    public final 5Tn A0E;
    public final 5Tn A0F;
    public final 5Tn A0G;
    public final 5Tn A0H;
    public final 5Tn A0I;
    public final 5Tn A0J;
    public final 5Tn A0K;
    public final 5iP A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final C5jw A0W;
    public final 1cP A0X;
    public final Runnable A0Y;
    public final AtomicBoolean A0Z;

    public C5jx(C5jw c5jw, 5Tn r303, 5Tn r304, 5Tn r305, 5Tn r306, 5Tn r307, 5Tn r308, 5Tn r309, 5iJ r310, 5iP r311, 1cP r312, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(r310, r311, r312);
        this.A0Y = new Runnable() { // from class: X.5jy
            public static final String __redex_internal_original_name = "ComposedData$1";

            @Override // java.lang.Runnable
            public void run() {
                C5jx.A02(C5jx.this);
            }
        };
        this.A0Z = new AtomicBoolean();
        this.A0E = r303;
        this.A0F = r304;
        this.A0G = r305;
        this.A0H = r306;
        this.A0I = r307;
        this.A0J = r308;
        this.A0K = r309;
        this.A0N = z;
        this.A0O = z2;
        this.A0P = z3;
        this.A0Q = true;
        this.A0R = z4;
        this.A0S = z5;
        this.A0T = true;
        this.A0U = true;
        this.A0V = true;
        this.A0M = true;
        this.A0W = c5jw;
        this.A0L = r311;
        this.A0X = r312;
    }

    public static C5jx A00(C5jw c5jw, 5Tn r302, 5Tn r303, 5Tn r304, 5Tn r305, 5Tn r306, 5Tn r307, 5Tn r308, 5iJ r309, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        final C5jx c5jx = new C5jx(c5jw, r302, r303, r304, r305, r306, r307, r308, r309, new 5iP(), 1NF.A02(), z, z2, z3, z4, z5);
        5Tn r0 = c5jx.A0E;
        if (r0 != null) {
            5To r02 = new 5To() { // from class: X.5jz
                public void CbI(Object obj) {
                    C5jx c5jx2 = C5jx.this;
                    synchronized (c5jx2) {
                        c5jx2.A07 = obj;
                    }
                    C5jx.A03(c5jx2);
                }

                public void CbM(Object obj) {
                    C5jx c5jx2 = C5jx.this;
                    synchronized (c5jx2) {
                        c5jx2.A07 = obj;
                    }
                    C5jx.A03(c5jx2);
                }
            };
            c5jx.A00 = r02;
            r0.Crj(r02);
        }
        5Tn r03 = c5jx.A0F;
        if (r03 != null) {
            5To r04 = new 5To() { // from class: X.5k1
                public void CbI(Object obj) {
                    C5jx c5jx2 = C5jx.this;
                    synchronized (c5jx2) {
                        c5jx2.A08 = obj;
                    }
                    C5jx.A03(c5jx2);
                }

                public void CbM(Object obj) {
                    C5jx c5jx2 = C5jx.this;
                    synchronized (c5jx2) {
                        c5jx2.A08 = obj;
                    }
                    C5jx.A03(c5jx2);
                }
            };
            c5jx.A01 = r04;
            r03.Crj(r04);
        }
        5Tn r05 = c5jx.A0G;
        if (r05 != null) {
            5To r06 = new 5To() { // from class: X.5k2
                public void CbI(Object obj) {
                    C5jx c5jx2 = C5jx.this;
                    synchronized (c5jx2) {
                        c5jx2.A09 = obj;
                    }
                    C5jx.A03(c5jx2);
                }

                public void CbM(Object obj) {
                    C5jx c5jx2 = C5jx.this;
                    synchronized (c5jx2) {
                        c5jx2.A09 = obj;
                    }
                    C5jx.A03(c5jx2);
                }
            };
            c5jx.A02 = r06;
            r05.Crj(r06);
        }
        5Tn r07 = c5jx.A0H;
        if (r07 != null) {
            5To r08 = new 5To() { // from class: X.5k3
                public void CbI(Object obj) {
                    C5jx c5jx2 = C5jx.this;
                    synchronized (c5jx2) {
                        c5jx2.A0A = obj;
                    }
                    C5jx.A03(c5jx2);
                }

                public void CbM(Object obj) {
                    C5jx c5jx2 = C5jx.this;
                    synchronized (c5jx2) {
                        c5jx2.A0A = obj;
                    }
                    C5jx.A03(c5jx2);
                }
            };
            c5jx.A03 = r08;
            r07.Crj(r08);
        }
        5Tn r09 = c5jx.A0I;
        if (r09 != null) {
            5To r010 = new 5To() { // from class: X.5k4
                public void CbI(Object obj) {
                    C5jx c5jx2 = C5jx.this;
                    synchronized (c5jx2) {
                        c5jx2.A0B = obj;
                    }
                    C5jx.A03(c5jx2);
                }

                public void CbM(Object obj) {
                    C5jx c5jx2 = C5jx.this;
                    synchronized (c5jx2) {
                        c5jx2.A0B = obj;
                    }
                    C5jx.A03(c5jx2);
                }
            };
            c5jx.A04 = r010;
            r09.Crj(r010);
        }
        5Tn r011 = c5jx.A0J;
        if (r011 != null) {
            5To r012 = new 5To() { // from class: X.5k5
                public void CbI(Object obj) {
                    C5jx c5jx2 = C5jx.this;
                    synchronized (c5jx2) {
                        c5jx2.A0C = obj;
                    }
                    C5jx.A03(c5jx2);
                }

                public void CbM(Object obj) {
                    C5jx c5jx2 = C5jx.this;
                    synchronized (c5jx2) {
                        c5jx2.A0C = obj;
                    }
                    C5jx.A03(c5jx2);
                }
            };
            c5jx.A05 = r012;
            r011.Crj(r012);
        }
        5Tn r013 = c5jx.A0K;
        if (r013 != null) {
            Fs3 fs3 = new Fs3(c5jx);
            c5jx.A06 = fs3;
            r013.Crj(fs3);
        }
        return c5jx;
    }

    public static void A02(C5jx c5jx) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        boolean z = false;
        c5jx.A0Z.set(false);
        synchronized (c5jx) {
            obj = c5jx.A07;
            obj2 = c5jx.A08;
            obj3 = c5jx.A09;
            obj4 = c5jx.A0A;
            obj5 = c5jx.A0B;
            obj6 = c5jx.A0C;
            obj7 = c5jx.A0D;
        }
        if (obj != null || c5jx.A0N) {
            if (obj2 != null || c5jx.A0O) {
                if (obj3 != null || c5jx.A0P) {
                    if (obj4 != null || c5jx.A0Q) {
                        if (obj5 != null || c5jx.A0R) {
                            if (obj6 != null || c5jx.A0S) {
                                if ((obj7 != null || c5jx.A0T) && c5jx.A0U && c5jx.A0V && c5jx.A0M) {
                                    5iH.A00();
                                    try {
                                        Object AGz = c5jx.A0W.AGz(obj, obj2, obj3, obj4, obj5, obj6, obj7, null, null, null);
                                        synchronized (c5jx) {
                                            if (c5jx.A07 == obj && c5jx.A08 == obj2 && c5jx.A09 == obj3 && c5jx.A0A == obj4 && c5jx.A0B == obj5 && c5jx.A0C == obj6 && c5jx.A0D == obj7) {
                                                z = true;
                                            }
                                        }
                                        if (z) {
                                            c5jx.A0L.A08(AGz);
                                        }
                                    } finally {
                                        5iH.A00();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void A03(C5jx c5jx) {
        1cP r0 = c5jx.A0X;
        if (r0.BUa()) {
            r0.Cdn(c5jx.A0Y);
            A02(c5jx);
        } else {
            if (c5jx.A0Z.getAndSet(true)) {
                return;
            }
            r0.CXv(c5jx.A0Y, "ComposedData_EmitResult");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x01da, code lost:
    
        if (r307.ARw(2) != false) goto L64;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:42:0x01f5. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean ARw(int r302) {
        /*
            Method dump skipped, instructions count: 848
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5jx.ARw(int):boolean");
    }

    public void Ce2() {
        this.A0L.A04();
    }

    public void Ceh(5To r302) {
        this.A0L.A06(r302);
    }

    public void Crj(5To r302) {
        this.A0L.A07(r302);
    }

    public boolean D6l(Object obj, String str) {
        5Tn r0 = this.A0E;
        boolean z = false;
        if (r0 != null) {
            z = false | r0.D6l(obj, str);
        }
        5Tn r02 = this.A0F;
        if (r02 != null) {
            z |= r02.D6l(obj, str);
        }
        5Tn r03 = this.A0G;
        if (r03 != null) {
            z |= r03.D6l(obj, str);
        }
        5Tn r04 = this.A0H;
        if (r04 != null) {
            z |= r04.D6l(obj, str);
        }
        5Tn r05 = this.A0I;
        if (r05 != null) {
            z |= r05.D6l(obj, str);
        }
        5Tn r06 = this.A0J;
        if (r06 != null) {
            z |= r06.D6l(obj, str);
        }
        5Tn r07 = this.A0K;
        if (r07 != null) {
            z |= r07.D6l(obj, str);
        }
        return z;
    }
}
