package X;

/* loaded from: L8h.class */
public final class L8h {
    public int A00;
    public LBJ A04;
    public LBJ A05;
    public LBJ A06;
    public int A03 = -1;
    public int A01 = -1;
    public int A02 = 0;

    public L8h() {
        LBJ lbj = new LBJ(-1, -1);
        this.A06 = lbj;
        lbj.A02 = 0;
        lbj.A03 = 0;
        lbj.A04 = 0;
        this.A04 = lbj;
        this.A05 = lbj;
        this.A00 = 0;
    }

    private String A00(LBJ lbj, int i) {
        String A0V;
        if (i < 0) {
            A0V = "<snip>";
        } else {
            if (lbj == null) {
                return "\n{x}";
            }
            A0V = 0Pz.A0V("\n", lbj);
            LBJ[] lbjArr = lbj.A09;
            int i2 = 0;
            do {
                A0V = 0Pz.A0W(A0V, A00(lbjArr[i2], i - 1).replace("\n", "\n-"));
                i2++;
            } while (i2 < 4);
        }
        return A0V;
    }

    public static void A01(L8h l8h, LBJ lbj) {
        if (lbj == l8h.A04) {
            l8h.A04 = lbj.A07;
        }
        if (lbj == l8h.A05) {
            l8h.A05 = lbj.A06;
        }
        LBJ lbj2 = lbj.A07;
        if (lbj2 != null) {
            lbj2.A06 = lbj.A06;
        }
        LBJ lbj3 = lbj.A06;
        if (lbj3 != null) {
            lbj3.A07 = lbj2;
        }
        lbj.A07 = null;
        lbj.A06 = null;
    }

    public void A02() {
        boolean z;
        LBJ[] lbjArr;
        long nanoTime = System.nanoTime();
        try {
            int i = this.A01;
            if (i != -1) {
                int i2 = i - this.A02;
                int i3 = this.A03;
                int i4 = i2 + (i3 != -1 ? 1 << (i3 << 1) : 0);
                if (this.A00 > i4) {
                    LBJ lbj = this.A04;
                    while (true) {
                        LBJ lbj2 = lbj;
                        if (this.A00 <= i4 || lbj2 == null) {
                            break;
                        }
                        if (lbj2.A02() != null && lbj2.A04 != this.A03 && lbj2.A0B == 0) {
                            synchronized (lbj2) {
                                if (lbj2.A05 != null) {
                                    LBJ.A01(lbj2);
                                }
                                lbj2.A05 = null;
                            }
                            this.A00--;
                        }
                        lbj = lbj2.A07;
                    }
                    do {
                        z = false;
                        for (LBJ lbj3 = this.A04; lbj3 != null; lbj3 = lbj3.A07) {
                            int i5 = 0;
                            while (true) {
                                int i6 = i5;
                                if (i6 < 4) {
                                    LBJ lbj4 = lbj3.A09[i6];
                                    if (lbj4 != null && lbj4.A0B == 0 && lbj4.A02() == null) {
                                        int i7 = 0;
                                        int i8 = 0;
                                        int i9 = -1;
                                        do {
                                            lbjArr = lbj4.A09;
                                            if (lbjArr[i7] != null) {
                                                i8++;
                                                i9 = i7;
                                            }
                                            i7++;
                                        } while (i7 < 4);
                                        if (i8 == 1) {
                                            lbj3.A09[i6] = lbjArr[i9];
                                            A01(this, lbj4);
                                            lbj4.A03();
                                        } else if (i8 == 0) {
                                            lbj3.A09[i6] = null;
                                            A01(this, lbj4);
                                            lbj4.A03();
                                        }
                                        z = true;
                                    }
                                    i5 = i6 + 1;
                                }
                            }
                        }
                    } while (z);
                }
            }
        } finally {
            JQy.A1F(LBH.A0X, nanoTime);
        }
    }

    public void A03(LBJ lbj) {
        int i;
        int i2;
        int i3;
        int A05;
        LBJ[] lbjArr;
        int i4;
        if (lbj.A02() != null) {
            this.A00++;
        }
        LBJ lbj2 = this.A06;
        while (true) {
            LBJ lbj3 = lbj2;
            i = lbj.A02;
            i2 = lbj.A03;
            i3 = lbj.A04;
            A05 = JQy.A05(i3, lbj3.A04, i, i2);
            lbjArr = lbj3.A09;
            LBJ lbj4 = lbjArr[A05];
            if (lbj4 == null || i3 <= (i4 = lbj4.A04)) {
                break;
            }
            int i5 = i3 - i4;
            if ((i >> i5) != lbj4.A02 || (i2 >> i5) != lbj4.A03) {
                break;
            } else {
                lbj2 = lbjArr[A05];
            }
        }
        LBJ lbj5 = lbjArr[A05];
        if (lbj5 == null) {
            lbjArr[A05] = lbj;
        } else {
            int i6 = lbj5.A04;
            if (i3 < i6) {
                lbjArr[A05] = lbj;
                lbj.A09[JQy.A05(lbj5.A04, i3, lbj5.A02, lbj5.A03)] = lbj5;
            } else if (i6 == i3 && lbj5.A02 == i && lbj5.A03 == i2) {
                A01(this, lbj5);
                System.arraycopy(lbj5.A09, 0, lbj.A09, 0, 4);
                lbjArr[A05] = lbj;
                if (lbj5.A02() != null) {
                    this.A00--;
                }
                lbj5.A03();
            } else {
                int i7 = i3 - i6;
                int i8 = i >> i7;
                int i9 = i2 >> i7;
                int i10 = lbj5.A02;
                int i11 = lbj5.A03;
                while (true) {
                    if (i8 == i10 && i9 == i11) {
                        break;
                    }
                    i8 >>= 1;
                    i9 >>= 1;
                    i10 >>= 1;
                    i11 >>= 1;
                    i6--;
                }
                LBJ lbj6 = new LBJ(-1, -1);
                lbj6.A02 = i8;
                lbj6.A03 = i9;
                lbj6.A04 = i6;
                lbjArr[A05] = lbj6;
                LBJ[] lbjArr2 = lbj6.A09;
                lbjArr2[JQy.A05(lbj5.A04, i6, lbj5.A02, lbj5.A03)] = lbj5;
                lbjArr2[JQy.A05(lbj.A04, i6, lbj.A02, lbj.A03)] = lbj;
                A01(this, lbj6);
                LBJ lbj7 = this.A05;
                lbj7.A07 = lbj6;
                lbj6.A06 = lbj7;
                this.A05 = lbj6;
            }
        }
        A01(this, lbj);
        LBJ lbj8 = this.A05;
        lbj8.A07 = lbj;
        lbj.A06 = lbj8;
        this.A05 = lbj;
        A02();
    }

    public String toString() {
        return 0Pz.A0W(A00(this.A06, 10), "\n");
    }
}
