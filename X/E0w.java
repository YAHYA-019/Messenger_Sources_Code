package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: E0w.class */
public final class E0w extends 2Yf {
    public int A00;
    public int A01;
    public int A02;
    public 1LI A03;
    public 1Im A04;
    public 1Im A05;
    public 1Im A06;
    public 1Im A07;
    public 1Im A08;
    public 1Im A09;
    public C2ko A0A;
    public C2ko A0B;
    public C2ko A0C;
    public ELJ A0D;
    public LW1 A0E;
    public GKa A0F;
    public C6td A0G;
    public 5TY A0H;
    public F8X A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;

    public E0w() {
        super("BasePaginationSection");
        this.A0J = true;
        this.A00 = 1;
        this.A01 = 5;
        this.A02 = 10;
    }

    public static 1LI A0I(1LI r301, C1qb c1qb, boolean z) {
        2yD A0K = 1BK.A0K();
        if (z) {
            C1rq A0L = AbJ.A0L(c1qb);
            A0L.A1L(1);
            r301 = A0L.A00;
        } else {
            if (A0K.AZk(36312097357500281L)) {
                Dyw dyw = new Dyw();
                C1rs c1rs = new C1rs(dyw, c1qb, 0, 0);
                ((DrW) c1rs).A01 = dyw;
                ((DrW) c1rs).A00 = c1qb;
                dyw.A02 = "tail_load_spinner";
                c1rs.A0J();
                return ((DrW) c1rs).A01;
            }
            if (r301 == null) {
                Dyw dyw2 = new Dyw();
                C1rs c1rs2 = new C1rs(dyw2, c1qb, 0, 0);
                ((DrW) c1rs2).A01 = dyw2;
                ((DrW) c1rs2).A00 = c1qb;
                c1rs2.A0J();
                return ((DrW) c1rs2).A01;
            }
        }
        return r301;
    }

    public static 1Im A0J(C1qb c1qb) {
        if (c1qb.A0J() == null) {
            return null;
        }
        return ((E0w) c1qb.A0J()).A06;
    }

    public static 1Im A0K(C1qb c1qb) {
        if (c1qb.A0J() == null) {
            return null;
        }
        return ((E0w) c1qb.A0J()).A07;
    }

    public Object A0W(C2ko c2ko, Object obj, Object[] objArr) {
        int i = c2ko.A02;
        if (i == -153942713) {
            C1qb c1qb = (C1qb) c2ko.A00;
            E0w e0w = (E0w) c2ko.A01;
            ((E0a) ((2Yf) e0w).A03).A01.ByC(c1qb, e0w.A0E, e0w.A02, e0w.A00);
            return null;
        }
        if (i == 1954813542) {
            C1qb c1qb2 = (C1qb) c2ko.A00;
            E0w e0w2 = (E0w) c2ko.A01;
            ((E0a) ((2Yf) e0w2).A03).A01.CFv(c1qb2, e0w2.A0E, e0w2.A02, e0w2.A00);
            return null;
        }
        if (i != 2111713739) {
            return null;
        }
        C1qb c1qb3 = (C1qb) c2ko.A00;
        E0w e0w3 = (E0w) c2ko.A01;
        ((E0a) ((2Yf) e0w3).A03).A01.ByD(c1qb3, e0w3.A0E, e0w3.A02, e0w3.A00);
        return null;
    }

    public void A0X(2Yv r302, 2Yv r303) {
        E0a e0a = (E0a) r302;
        E0a e0a2 = (E0a) r303;
        e0a2.A03 = e0a.A03;
        e0a2.A04 = e0a.A04;
        e0a2.A02 = e0a.A02;
        e0a2.A01 = e0a.A01;
        e0a2.A00 = e0a.A00;
    }

    public void A0Y(C1qp c1qp) {
        if (c1qp != null) {
            this.A0I = (F8X) c1qp.A01(F8X.class);
            this.A0G = (C6td) c1qp.A01(C6td.class);
            this.A0H = (5TY) c1qp.A01(5TY.class);
        }
    }

    public void A0Z(2Yy r302, C1qb c1qb, int i, int i2, int i3, long j, boolean z, boolean z2) {
        E0a e0a = (E0a) ((2Yf) this).A03;
        LW1 lw1 = this.A0E;
        EpX epX = e0a.A00;
        GKa gKa = e0a.A01;
        AtomicBoolean atomicBoolean = e0a.A03;
        gKa.CGW(r302, c1qb, lw1, i, i2, i3);
        if (epX.A04.get()) {
            epX.A03.execute(new S7W(epX));
        }
        if (lw1 == null || lw1.A02.mTrees.size() == 0) {
            return;
        }
        atomicBoolean.set(true);
    }

    public void A0a(C1qb c1qb) {
        E0a e0a = (E0a) ((2Yf) this).A03;
        GKa gKa = this.A0F;
        EpX epX = (EpX) 1Bn.A0A(99915);
        String A0t = 1BK.A0t();
        DKE.A1S(c1qb);
        AtomicBoolean A1E = DKC.A1E(false);
        AtomicBoolean A1E2 = DKC.A1E(false);
        if (A0t != null) {
            e0a.A02 = A0t;
        }
        if (gKa != null) {
            e0a.A01 = gKa;
        }
        if (epX != null) {
            e0a.A00 = epX;
        }
        e0a.A04 = A1E;
        e0a.A03 = A1E2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ee, code lost:
    
        if ((r304 + 1) >= r305) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0058, code lost:
    
        if (r0 == X.ELJ.A02) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0b(X.C1qb r302, int r303, int r304, int r305, int r306, int r307) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E0w.A0b(X.1qb, int, int, int, int, int):void");
    }

    public boolean A0c(2Yf r302, 2Yf r303, C1qb c1qb, C1qb c1qb2) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cd, code lost:
    
        if (r0.A02.mHasNextPage == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f1, code lost:
    
        if (r0.A02.mHasPreviousPage == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0118, code lost:
    
        if (r0.A02.mIsLoadingNext == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013f, code lost:
    
        if (r0.A02.mIsLoadingPrevious == false) goto L52;
     */
    /* JADX WARN: Type inference failed for: r0v141, types: [X.RER, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v195, types: [X.RER, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.2Ys A0d(X.C1qb r302) {
        /*
            Method dump skipped, instructions count: 1136
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E0w.A0d(X.1qb):X.2Ys");
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [X.REQ, java.lang.Object] */
    public Object A0e(1Im r302, Object obj) {
        boolean z;
        switch (r302.A01) {
            case -1333837402:
                2lD r0 = (2lD) obj;
                1Iv r02 = r302.A00;
                E0w e0w = r02.A01;
                C1qb c1qb = (C1qb) r02.A00;
                int i = r0.A04;
                float f = r0.A00;
                EKi eKi = (EKi) r302.A03[0];
                E0w e0w2 = e0w;
                E0a e0a = (E0a) ((2Yf) this).A03;
                LW1 lw1 = e0w2.A0E;
                GKa gKa = e0a.A01;
                AtomicBoolean atomicBoolean = e0a.A04;
                Ei5 ei5 = (Ei5) 1Bi.A03(98455);
                if (f <= 50.0f && i <= ei5.A00) {
                    z = false;
                } else {
                    if (atomicBoolean.get()) {
                        return null;
                    }
                    gKa.BZl(c1qb, lw1, eKi);
                    z = true;
                }
                atomicBoolean.set(z);
                return null;
            case -714058481:
                C1qb c1qb2 = (C1qb) r302.A00.A00;
                int i2 = ((9Lr) obj).A00;
                E0a e0a2 = (E0a) ((2Yf) this).A03;
                EpX epX = e0a2.A00;
                GKa gKa2 = e0a2.A01;
                if (i2 != 1) {
                    return null;
                }
                if (epX.A04.get()) {
                    epX.A03.execute(new S7X(epX));
                }
                gKa2.BtH(c1qb2);
                return null;
            case 1706202311:
                DKE.A1S((C1qb) r302.A00.A00);
                throw AnonymousClass001.A0Q("dispatchEvent");
            case 1784618281:
                C1qb c1qb3 = (C1qb) r302.A00.A00;
                1Im r03 = (1Im) r302.A03[0];
                Object obj2 = ((C2i6) obj).A01;
                ?? obj3 = new Object();
                ((REQ) obj3).A00 = obj2;
                C2hj c2hj = (C2hj) r03.A00((Object) obj3);
                2dD A00 = C2dB.A00(c1qb3);
                A00.A1v(2Yg.A0B(c1qb3, E0w.class, "BasePaginationSection", new Object[]{obj2}, 1706202311));
                A00.A2X(new C2hl(c2hj).A00);
                c2hj.A00 = A00.A2W();
                return new C2hl(c2hj);
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    public /* bridge */ /* synthetic */ 2Yv A0f() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.2Yv, java.lang.Object] */
    public /* bridge */ /* synthetic */ 2Yf A0g(boolean z) {
        E0w e0w = (E0w) super.A0g(z);
        e0w.A03 = 4YV.A0J(e0w.A03);
        if (!z) {
            ((2Yf) e0w).A03 = new Object();
        }
        return e0w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0h(1Iw r302, 1sE r303) {
        7zQ.A1H(r302, this.A0C, this, r303);
        7zQ.A1H(r302, this.A0A, this, r303);
        7zQ.A1H(r302, this.A0B, this, r303);
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            E0w e0w = (E0w) r302;
            if (this.A0J != e0w.A0J) {
                return false;
            }
            ELJ elj = this.A0D;
            ELJ elj2 = e0w.A0D;
            if (elj != null) {
                if (!elj.equals(elj2)) {
                    return false;
                }
            } else if (elj2 != null) {
                return false;
            }
            if (this.A0K != e0w.A0K || this.A00 != e0w.A00 || this.A0L != e0w.A0L) {
                return false;
            }
            1Im r0 = this.A04;
            1Im r02 = e0w.A04;
            if (r0 != null) {
                if (!r0.A01(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            1Im r03 = this.A05;
            1Im r04 = e0w.A05;
            if (r03 != null) {
                if (!r03.A01(r04)) {
                    return false;
                }
            } else if (r04 != null) {
                return false;
            }
            1LI r05 = this.A03;
            1LI r06 = e0w.A03;
            if (r05 != null) {
                if (!C4Cv.A05(r05, r06, z)) {
                    return false;
                }
            } else if (r06 != null) {
                return false;
            }
            if (this.A01 != e0w.A01 || this.A02 != e0w.A02) {
                return false;
            }
            LW1 lw1 = this.A0E;
            LW1 lw12 = e0w.A0E;
            if (lw1 != null) {
                if (!lw1.equals(lw12)) {
                    return false;
                }
            } else if (lw12 != null) {
                return false;
            }
            GKa gKa = this.A0F;
            GKa gKa2 = e0w.A0F;
            if (gKa != null) {
                if (!gKa.equals(gKa2)) {
                    return false;
                }
            } else if (gKa2 != null) {
                return false;
            }
            F8X f8x = this.A0I;
            F8X f8x2 = e0w.A0I;
            if (f8x != null) {
                if (!f8x.equals(f8x2)) {
                    return false;
                }
            } else if (f8x2 != null) {
                return false;
            }
            C6td c6td = this.A0G;
            C6td c6td2 = e0w.A0G;
            if (c6td != null) {
                if (!c6td.equals(c6td2)) {
                    return false;
                }
            } else if (c6td2 != null) {
                return false;
            }
            5TY r07 = this.A0H;
            5TY r08 = e0w.A0H;
            if (r07 != null) {
                if (!r07.equals(r08)) {
                    return false;
                }
            } else if (r08 != null) {
                return false;
            }
        }
        return true;
    }
}
