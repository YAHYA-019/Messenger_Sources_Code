package X;

import java.util.Arrays;

/* renamed from: X.00p, reason: invalid class name */
/* loaded from: 00p.class */
public final class C00p implements Cloneable {
    public /* synthetic */ int A00;
    public /* synthetic */ boolean A01;
    public /* synthetic */ long[] A02;
    public /* synthetic */ Object[] A03;

    public C00p() {
        this(10);
    }

    public C00p(int i) {
        int i2;
        Object[] objArr;
        if (i == 0) {
            this.A02 = 0QP.A01;
            objArr = 0QP.A02;
        } else {
            int i3 = i * 8;
            int i4 = 4;
            while (true) {
                i2 = (1 << i4) - 12;
                if (i3 <= i2) {
                    break;
                }
                i4++;
                if (i4 >= 32) {
                    i2 = i3;
                    break;
                }
            }
            int i5 = i2 / 8;
            this.A02 = new long[i5];
            objArr = new Object[i5];
        }
        this.A03 = objArr;
    }

    public int A00() {
        if (this.A01) {
            int i = this.A00;
            long[] jArr = this.A02;
            Object[] objArr = this.A03;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != 0CK.A00) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.A01 = false;
            this.A00 = i2;
        }
        return this.A00;
    }

    public int A01(long j) {
        if (this.A01) {
            int i = this.A00;
            long[] jArr = this.A02;
            Object[] objArr = this.A03;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != 0CK.A00) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.A01 = false;
            this.A00 = i2;
        }
        return 0QP.A01(this.A02, this.A00, j);
    }

    public long A02(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.A00)) {
            KTq.A00(0Pz.A0T("Expected index to be within 0..size()-1, but was ", i));
            throw 0Q8.createAndThrow();
        }
        if (this.A01) {
            long[] jArr = this.A02;
            Object[] objArr = this.A03;
            int i3 = 0;
            int i4 = 0;
            do {
                Object obj = objArr[i3];
                if (obj != 0CK.A00) {
                    if (i3 != i4) {
                        jArr[i4] = jArr[i3];
                        objArr[i4] = obj;
                        objArr[i3] = null;
                    }
                    i4++;
                }
                i3++;
            } while (i3 < i2);
            this.A01 = false;
            this.A00 = i4;
        }
        return this.A02[i];
    }

    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public C00p clone() {
        Object clone = super.clone();
        11T.A0I(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C00p c00p = (C00p) clone;
        c00p.A02 = (long[]) this.A02.clone();
        c00p.A03 = (Object[]) this.A03.clone();
        return c00p;
    }

    public Object A04(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.A00)) {
            KTq.A00(0Pz.A0T("Expected index to be within 0..size()-1, but was ", i));
            throw 0Q8.createAndThrow();
        }
        if (this.A01) {
            long[] jArr = this.A02;
            Object[] objArr = this.A03;
            int i3 = 0;
            int i4 = 0;
            do {
                Object obj = objArr[i3];
                if (obj != 0CK.A00) {
                    if (i3 != i4) {
                        jArr[i4] = jArr[i3];
                        objArr[i4] = obj;
                        objArr[i3] = null;
                    }
                    i4++;
                }
                i3++;
            } while (i3 < i2);
            this.A01 = false;
            this.A00 = i4;
        }
        return this.A03[i];
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if (r304 == X.0CK.A00) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A05(long r302) {
        /*
            r301 = this;
            r0 = r301
            long[] r0 = r0.A02
            r304 = r0
            r0 = r301
            int r0 = r0.A00
            r305 = r0
            r0 = r304
            r1 = r305
            r2 = r302
            int r0 = X.0QP.A01(r0, r1, r2)
            r306 = r0
            r0 = r306
            if (r0 < 0) goto L2c
            r0 = r301
            java.lang.Object[] r0 = r0.A03
            r1 = r306
            r0 = r0[r1]
            r304 = r0
            java.lang.Object r0 = X.0CK.A00
            r307 = r0
            r0 = r304
            r1 = r307
            if (r0 != r1) goto L31
        L2c:
            r0 = 0
            r306 = r0
            r0 = 0
            r304 = r0
        L31:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C00p.A05(long):java.lang.Object");
    }

    public Object A06(Object obj, long j) {
        Object obj2;
        int A01 = 0QP.A01(this.A02, this.A00, j);
        return (A01 < 0 || (obj2 = this.A03[A01]) == 0CK.A00) ? obj : obj2;
    }

    public void A07() {
        int i = this.A00;
        Object[] objArr = this.A03;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= i) {
                this.A00 = 0;
                this.A01 = false;
                return;
            } else {
                objArr[i3] = null;
                i2 = i3 + 1;
            }
        }
    }

    public void A08(int i) {
        Object[] objArr = this.A03;
        Object obj = objArr[i];
        Object obj2 = 0CK.A00;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.A01 = true;
        }
    }

    public void A09(int i, Object obj) {
        int i2;
        if (i < 0 || i >= (i2 = this.A00)) {
            KTq.A00(0Pz.A0T("Expected index to be within 0..size()-1, but was ", i));
            throw 0Q8.createAndThrow();
        }
        if (this.A01) {
            long[] jArr = this.A02;
            Object[] objArr = this.A03;
            int i3 = 0;
            int i4 = 0;
            do {
                Object obj2 = objArr[i3];
                if (obj2 != 0CK.A00) {
                    if (i3 != i4) {
                        jArr[i4] = jArr[i3];
                        objArr[i4] = obj2;
                        objArr[i3] = null;
                    }
                    i4++;
                }
                i3++;
            } while (i3 < i2);
            this.A01 = false;
            this.A00 = i4;
        }
        this.A03[i] = obj;
    }

    public void A0A(long j) {
        int A01 = 0QP.A01(this.A02, this.A00, j);
        if (A01 >= 0) {
            Object[] objArr = this.A03;
            Object obj = objArr[A01];
            Object obj2 = 0CK.A00;
            if (obj != obj2) {
                objArr[A01] = obj2;
                this.A01 = true;
            }
        }
    }

    public void A0B(long j, Object obj) {
        int i;
        int i2 = this.A00;
        if (i2 != 0 && j <= this.A02[i2 - 1]) {
            A0C(j, obj);
            return;
        }
        if (this.A01) {
            long[] jArr = this.A02;
            if (i2 >= jArr.length) {
                Object[] objArr = this.A03;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj2 = objArr[i4];
                    if (obj2 != 0CK.A00) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj2;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                this.A01 = false;
                this.A00 = i3;
                i2 = i3;
            }
        }
        long[] jArr2 = this.A02;
        if (i2 >= jArr2.length) {
            int i5 = (i2 + 1) * 8;
            int i6 = 4;
            while (true) {
                i = (1 << i6) - 12;
                if (i5 <= i) {
                    break;
                }
                i6++;
                if (i6 >= 32) {
                    i = i5;
                    break;
                }
            }
            int i7 = i / 8;
            long[] copyOf = Arrays.copyOf(jArr2, i7);
            11T.A0A(copyOf);
            this.A02 = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.A03, i7);
            11T.A0A(copyOf2);
            this.A03 = copyOf2;
        }
        this.A02[i2] = j;
        this.A03[i2] = obj;
        this.A00 = i2 + 1;
    }

    public void A0C(long j, Object obj) {
        int i;
        int A01 = 0QP.A01(this.A02, this.A00, j);
        if (A01 < 0) {
            A01 ^= -1;
            int i2 = this.A00;
            if (A01 >= i2 || this.A03[A01] != 0CK.A00) {
                if (this.A01) {
                    long[] jArr = this.A02;
                    if (i2 >= jArr.length) {
                        Object[] objArr = this.A03;
                        int i3 = 0;
                        for (int i4 = 0; i4 < i2; i4++) {
                            Object obj2 = objArr[i4];
                            if (obj2 != 0CK.A00) {
                                if (i4 != i3) {
                                    jArr[i3] = jArr[i4];
                                    objArr[i3] = obj2;
                                    objArr[i4] = null;
                                }
                                i3++;
                            }
                        }
                        this.A01 = false;
                        this.A00 = i3;
                        A01 = 0QP.A01(jArr, i3, j) ^ (-1);
                    }
                }
                int i5 = this.A00;
                long[] jArr2 = this.A02;
                if (i5 >= jArr2.length) {
                    int i6 = (i5 + 1) * 8;
                    int i7 = 4;
                    while (true) {
                        i = (1 << i7) - 12;
                        if (i6 <= i) {
                            break;
                        }
                        i7++;
                        if (i7 >= 32) {
                            i = i6;
                            break;
                        }
                    }
                    int i8 = i / 8;
                    long[] copyOf = Arrays.copyOf(jArr2, i8);
                    11T.A0A(copyOf);
                    this.A02 = copyOf;
                    Object[] copyOf2 = Arrays.copyOf(this.A03, i8);
                    11T.A0A(copyOf2);
                    this.A03 = copyOf2;
                }
                int i9 = this.A00;
                if (i9 - A01 != 0) {
                    long[] jArr3 = this.A02;
                    int i10 = A01 + 1;
                    11T.A0F(jArr3, 0);
                    System.arraycopy(jArr3, A01, jArr3, i10, i9 - A01);
                    Object[] objArr2 = this.A03;
                    C1A9.A0I(objArr2, objArr2, i10, A01, this.A00);
                }
                this.A02[A01] = j;
                this.A03[A01] = obj;
                this.A00++;
                return;
            }
            this.A02[A01] = j;
        }
        this.A03[A01] = obj;
    }

    public String toString() {
        if (A00() <= 0) {
            return "{}";
        }
        int i = this.A00;
        StringBuilder A0l = AnonymousClass001.A0l(i * 28);
        A0l.append('{');
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= i) {
                String A0f = AnonymousClass001.A0f(A0l);
                11T.A0A(A0f);
                return A0f;
            }
            if (i3 > 0) {
                AnonymousClass001.A1H(A0l);
            }
            A0l.append(A02(i3));
            A0l.append('=');
            Object A04 = A04(i3);
            if (A04 != A0l) {
                A0l.append(A04);
            } else {
                A0l.append("(this Map)");
            }
            i2 = i3 + 1;
        }
    }
}
