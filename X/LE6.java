package X;

import androidx.compose.ui.unit.Constraints;

/* loaded from: LE6.class */
public final class LE6 {
    public Constraints A00;
    public boolean A01;
    public boolean A02;
    public final LPQ A05;
    public final L1t A04 = new L1t();
    public final L1u A06 = new L1u();
    public final LtK A07 = LtK.A02(new MBd[16]);
    public final LtK A03 = LtK.A02(new KiZ[16]);

    public LE6(LPQ lpq) {
        this.A05 = lpq;
    }

    public static final void A00(LPQ lpq, LE6 le6) {
        LtK A0D = lpq.A0D();
        int i = A0D.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0D.A02;
            do {
                LPQ lpq2 = (LPQ) objArr[i2];
                if (7zR.A1X(lpq2.A0G()) && !lpq2.A0I) {
                    if (le6.A04.A00.A00.contains(lpq2)) {
                        lpq2.A0P();
                    }
                    A00(lpq2, le6);
                }
                i2++;
            } while (i2 < i);
        }
    }

    public static final void A01(LPQ lpq, LE6 le6) {
        Constraints constraints;
        LtK A0D = lpq.A0D();
        int i = A0D.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0D.A02;
            do {
                LPQ lpq2 = (LPQ) objArr[i2];
                if (A06(lpq2)) {
                    if (!KUj.A00(lpq2)) {
                        A01(lpq2, le6);
                    } else if (!lpq2.A0I) {
                        if (lpq2 == le6.A05) {
                            constraints = le6.A00;
                            11T.A0D(constraints);
                        } else {
                            constraints = null;
                        }
                        A08(lpq2, constraints);
                    }
                }
                i2++;
            } while (i2 < i);
        }
    }

    private final void A02(LPQ lpq, boolean z) {
        LtK A0D = lpq.A0D();
        int i = A0D.A00;
        if (i > 0) {
            Object[] objArr = A0D.A02;
            int i2 = 0;
            do {
                LPQ lpq2 = (LPQ) objArr[i2];
                if (z ? A07(lpq2) : A06(lpq2)) {
                    if (KUj.A00(lpq2) && !z) {
                        if (lpq2.A0R.A0G && this.A04.A00.A00.contains(lpq2)) {
                            A0A(lpq2, true, false);
                        } else {
                            A0B(lpq2, true);
                        }
                    }
                    A03(lpq2, z);
                    L3O l3o = lpq2.A0R;
                    if (!(z ? l3o.A0G : l3o.A0H)) {
                        A02(lpq2, z);
                    }
                }
                i2++;
            } while (i2 < i);
        }
        A03(lpq, z);
    }

    private final void A03(LPQ lpq, boolean z) {
        L3O l3o = lpq.A0R;
        if (z ? l3o.A0G : l3o.A0H) {
            L1t l1t = this.A04;
            boolean contains = l1t.A00.A00.contains(lpq);
            if (!z) {
                if (!contains) {
                    contains = l1t.A01.A00.contains(lpq);
                }
                A0A(lpq, z, false);
            }
            if (!contains) {
                return;
            }
            A0A(lpq, z, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x011e, code lost:
    
        if (r316 == 1) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A04(X.LE6 r301) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LE6.A04(X.LE6):void");
    }

    public static final void A05(LE6 le6) {
        LtK ltK = le6.A03;
        int i = ltK.A00;
        if (i != 0) {
            if (i > 0) {
                int i2 = 0;
                Object[] objArr = ltK.A02;
                do {
                    KiZ kiZ = (KiZ) objArr[i2];
                    if (kiZ.A00.A0A != null) {
                        if (kiZ.A02) {
                            LPQ.A0A(kiZ.A00, kiZ.A01, true, false);
                        } else {
                            LPQ.A0B(kiZ.A00, kiZ.A01, true, false);
                        }
                    }
                    i2++;
                } while (i2 < i);
            }
            ltK.A06();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if (r0.A00 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A06(X.LPQ r301) {
        /*
            r0 = r301
            X.L3O r0 = r0.A0R
            X.JdE r0 = r0.A0J
            r301 = r0
            r0 = r301
            java.lang.Integer r0 = r0.A09
            r302 = r0
            java.lang.Integer r0 = X.0S2.A00
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L2c
            r0 = r301
            X.L4u r0 = r0.A0N
            r303 = r0
            r0 = r303
            r0.A04()
            r0 = r303
            X.MNK r0 = r0.A00
            r302 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            if (r0 == 0) goto L2e
        L2c:
            r0 = 1
            r304 = r0
        L2e:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LE6.A06(X.LPQ):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r0.A00 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A07(X.LPQ r301) {
        /*
            r0 = r301
            X.L3O r0 = r0.A0R
            r302 = r0
            r0 = r302
            X.JdD r0 = r0.A05
            r301 = r0
            r0 = r301
            if (r0 == 0) goto L3c
            r0 = r301
            java.lang.Integer r0 = r0.A05
            r303 = r0
        L13:
            java.lang.Integer r0 = X.0S2.A00
            r302 = r0
            r0 = 0
            r304 = r0
            r0 = r303
            r1 = r302
            if (r0 == r1) goto L38
            r0 = r301
            if (r0 == 0) goto L3a
            r0 = r301
            X.L4u r0 = r0.A0H
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L3a
            r0 = r302
            r0.A04()
            r0 = r302
            X.MNK r0 = r0.A00
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L3a
        L38:
            r0 = 1
            r304 = r0
        L3a:
            r0 = r304
            return r0
        L3c:
            java.lang.Integer r0 = X.0S2.A0C
            r303 = r0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LE6.A07(X.LPQ):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r302 != null) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A08(X.LPQ r301, androidx.compose.ui.unit.Constraints r302) {
        /*
            r0 = r301
            X.LPQ r0 = r0.A08
            r303 = r0
            r0 = r303
            if (r0 != 0) goto Lb
            r0 = 0
            return r0
        Lb:
            r0 = r301
            X.L3O r0 = r0.A0R
            r304 = r0
            r0 = r304
            X.JdD r0 = r0.A05
            r303 = r0
            r0 = r302
            if (r0 != 0) goto L26
            r0 = r303
            if (r0 == 0) goto La0
            r0 = r303
            androidx.compose.ui.unit.Constraints r0 = r0.A04
            r302 = r0
            r0 = r302
            if (r0 == 0) goto La0
        L26:
            r0 = r303
            X.11T.A0D(r0)
            r0 = r302
            long r0 = r0.A00
            r305 = r0
            r0 = r303
            r1 = r305
            boolean r0 = r0.A0N(r1)
            r307 = r0
        L38:
            r0 = r301
            X.LPQ r0 = r0.A0E()
            r308 = r0
            r0 = r307
            if (r0 == 0) goto L5e
            r0 = r308
            if (r0 == 0) goto L5e
            r0 = r308
            X.LPQ r0 = r0.A08
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L61
            r0 = 1
            r309 = r0
            r0 = r308
            r1 = 0
            r2 = r309
            r3 = 0
            X.LPQ.A0B(r0, r1, r2, r3)
        L5e:
            r0 = r307
            return r0
        L61:
            r0 = r304
            X.JdD r0 = r0.A05
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L85
            r0 = r303
            java.lang.Integer r0 = r0.A05
            r310 = r0
        L70:
            java.lang.Integer r0 = X.0S2.A00
            r303 = r0
            r0 = r310
            r1 = r303
            if (r0 != r1) goto L8d
            r0 = r308
            r1 = 0
            r2 = 1
            r3 = 0
            X.LPQ.A0A(r0, r1, r2, r3)
            r0 = r307
            return r0
        L85:
            java.lang.Integer r0 = X.0S2.A0C
            r310 = r0
            goto L70
        L8d:
            java.lang.Integer r0 = X.0S2.A01
            r303 = r0
            r0 = r310
            r1 = r303
            if (r0 != r1) goto L5e
            r0 = r308
            r1 = 0
            r0.A0Z(r1)
            r0 = r307
            return r0
        La0:
            r0 = 0
            r307 = r0
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LE6.A08(X.LPQ, androidx.compose.ui.unit.Constraints):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A09(X.LPQ r301, androidx.compose.ui.unit.Constraints r302) {
        /*
            r0 = r302
            if (r0 != 0) goto L29
            r0 = r301
            X.L3O r0 = r0.A0R
            r303 = r0
            r0 = r303
            X.JdE r0 = r0.A0J
            r304 = r0
            r0 = r304
            boolean r0 = r0.A0H
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L9a
            r0 = r304
            long r0 = r0.A04
            r306 = r0
            androidx.compose.ui.unit.Constraints r0 = new androidx.compose.ui.unit.Constraints
            r302 = r0
            r0 = r302
            r1 = r306
            r0.<init>(r1)
        L29:
            r0 = r301
            java.lang.Integer r0 = r0.A0E
            r308 = r0
            java.lang.Integer r0 = X.0S2.A0C
            r303 = r0
            r0 = r308
            r1 = r303
            if (r0 != r1) goto L3d
            r0 = r301
            r0.A0K()
        L3d:
            r0 = r301
            X.L3O r0 = r0.A0R
            r303 = r0
            r0 = r303
            X.JdE r0 = r0.A0J
            r304 = r0
            r0 = r302
            long r0 = r0.A00
            r306 = r0
            r0 = r304
            r1 = r306
            boolean r0 = r0.A0O(r1)
            r309 = r0
        L55:
            r0 = r301
            X.LPQ r0 = r0.A0E()
            r310 = r0
            r0 = r309
            if (r0 == 0) goto L84
            r0 = r310
            if (r0 == 0) goto L84
            r0 = r304
            java.lang.Integer r0 = r0.A09
            r308 = r0
            java.lang.Integer r0 = X.0S2.A00
            r303 = r0
            r0 = r308
            r1 = r303
            if (r0 != r1) goto L87
            r0 = 0
            r308 = r0
            r0 = 1
            r305 = r0
            r0 = r310
            r1 = 0
            r2 = r305
            r3 = 0
            X.LPQ.A0B(r0, r1, r2, r3)
        L84:
            r0 = r309
            return r0
        L87:
            java.lang.Integer r0 = X.0S2.A01
            r303 = r0
            r0 = r308
            r1 = r303
            if (r0 != r1) goto L84
            r0 = r310
            r1 = 0
            r0.A0a(r1)
            r0 = r309
            return r0
        L9a:
            r0 = 0
            r309 = r0
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LE6.A09(X.LPQ, androidx.compose.ui.unit.Constraints):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0203, code lost:
    
        if (r0.A00 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0143, code lost:
    
        if (r307 == null) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v54, types: [X.L8T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean A0A(X.LPQ r302, boolean r303, boolean r304) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LE6.A0A(X.LPQ, boolean, boolean):boolean");
    }

    public final void A0B(LPQ lpq, boolean z) {
        L1t l1t = this.A04;
        if ((z ? l1t.A00 : l1t.A01).A00.isEmpty()) {
            return;
        }
        if (!this.A02) {
            throw AnonymousClass001.A0N("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        L3O l3o = lpq.A0R;
        if (!(!(z ? l3o.A0G : l3o.A0H))) {
            throw AnonymousClass001.A0L("node not yet measured");
        }
        A02(lpq, z);
    }

    public final boolean A0C(LPQ lpq, boolean z) {
        L3O l3o = lpq.A0R;
        int intValue = l3o.A06.intValue();
        if (intValue == 1 || intValue == 0) {
            return false;
        }
        if (intValue == 3 || intValue == 2) {
            this.A03.A0C(new KiZ(lpq, false, z));
            return false;
        }
        if (intValue != 4) {
            throw 1BK.A1F();
        }
        if (l3o.A0H && !z) {
            return false;
        }
        l3o.A0H = true;
        if (lpq.A0I) {
            return false;
        }
        if (!l3o.A0J.A0E && !A06(lpq)) {
            return false;
        }
        LPQ A0E = lpq.A0E();
        if (A0E == null || !A0E.A0R.A0H) {
            this.A04.A01(lpq, false);
        }
        return !this.A01;
    }

    public final boolean A0D(C00m c00m) {
        String str;
        LPQ lpq = this.A05;
        if (lpq.A0A == null) {
            str = "performMeasureAndLayout called with unattached root";
        } else if (!lpq.A0R.A0J.A0E) {
            str = "performMeasureAndLayout called with unplaced root";
        } else {
            if (!this.A02) {
                boolean z = false;
                if (this.A00 != null) {
                    this.A02 = true;
                    this.A01 = true;
                    try {
                        L1t l1t = this.A04;
                        boolean z2 = false;
                        if (!L1t.A00(l1t)) {
                            while (!L1t.A00(l1t)) {
                                KrV krV = l1t.A00;
                                boolean A1b = 7zM.A1b(krV.A00);
                                if (!A1b) {
                                    krV = l1t.A01;
                                }
                                LPQ lpq2 = (LPQ) krV.A00.first();
                                krV.A00(lpq2);
                                boolean A0A = A0A(lpq2, A1b, true);
                                if (lpq2 == lpq && A0A) {
                                    z2 = true;
                                }
                            }
                            if (c00m != null) {
                                c00m.invoke();
                            }
                        }
                        this.A02 = false;
                        this.A01 = false;
                        z = z2;
                    } catch (Throwable th) {
                        this.A02 = false;
                        this.A01 = false;
                        throw th;
                    }
                }
                A04(this);
                return z;
            }
            str = "performMeasureAndLayout called during measure layout";
        }
        throw AnonymousClass001.A0L(str);
    }
}
