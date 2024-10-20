package X;

import java.util.Iterator;

/* renamed from: X.Jac, reason: case insensitive filesystem */
/* loaded from: Jac.class */
public final class C2820Jac extends Ku5 {
    public int A00;

    public C2820Jac() {
        this(6);
    }

    public C2820Jac(int i) {
        C2818Jaa c2818Jaa = Ky4.A01;
        A03(i + ((i - 1) / 7));
    }

    private final int A00(int i) {
        int i2 = super.A00;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long A0C = JR2.A0C(JR2.A0I(this.A02, i3));
            if (A0C != 0) {
                return JR0.A0K(A0C, i3, i2);
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00cc, code lost:
    
        if ((X.JR0.A0U(r0) & (-9187201950435737472L)) == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00cf, code lost:
    
        r310 = r301.A00(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e4, code lost:
    
        if (r301.A00 != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e7, code lost:
    
        r0 = r301.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0103, code lost:
    
        if (X.JR1.A0W(r0, r310) == 254) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0106, code lost:
    
        r0 = ((X.Ku5) r301).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0113, code lost:
    
        if (r0 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0141, code lost:
    
        if ((X.JR0.A0R(r301.A01) ^ Long.MIN_VALUE) > (X.JQz.A0H(r0) ^ Long.MIN_VALUE)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0144, code lost:
    
        r0 = r301.A03;
        X.Ky4.A00(r0, r0);
        r325 = 0;
        r339 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x015b, code lost:
    
        r0 = r325 >> 3;
        r0 = r0[r0];
        r0 = (r325 & 7) << 3;
        r0 = (r0 >> r0) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0187, code lost:
    
        if (r0 != 128) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x018a, code lost:
    
        r339 = r325;
        r325 = r325 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x019a, code lost:
    
        if (r325 != r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x019d, code lost:
    
        r301.A00 = X.JR1.A05(((X.Ku5) r301).A00) - r301.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01ba, code lost:
    
        r310 = r301.A00(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x024e, code lost:
    
        if (r0 != 254) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0251, code lost:
    
        r0 = X.JQz.A08(X.AnonymousClass002.A04(r0[r325]), -862048943);
        r0 = r0 >>> 7;
        r0 = r301.A00(r0);
        r0 = r0 & r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0297, code lost:
    
        if (X.JQz.A09(r0, r0, r0) != X.JQz.A09(r325, r0, r0)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x029a, code lost:
    
        r0[r0] = ((r0 & 127) << r0) | (((255 << r0) ^ r0) & r0[r0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x02c9, code lost:
    
        r0[r0.length - 1] = (r0[0] & 72057594037927935L) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x02ee, code lost:
    
        r0 = r0 >> 3;
        r0 = r0[r0];
        r0 = (r0 & 7) << 3;
        r0 = (r0 >> r0) & 255;
        r0 = r0 & 127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x031d, code lost:
    
        if (r0 != 128) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0320, code lost:
    
        r0[r0] = (r0 & ((255 << r0) ^ r0)) | (r0 << r0);
        r0[r0] = (r0[r0] & ((255 << r0) ^ r0)) | (128 << r0);
        X.JR0.A1N(r0, r325, r0);
        r339 = r325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0387, code lost:
    
        r0[r0] = (r0 << r0) | (r0 & ((255 << r0) ^ r0));
        r339 = X.JR1.A0P(r0, r339, r325, r0);
        X.JR1.A1T(r0, r0, r339, r325);
        r325 = r325 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x02e5, code lost:
    
        r325 = r325 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x03ce, code lost:
    
        r0 = X.JR0.A0A(r0);
        r0 = r301.A03;
        r301.A03(r0);
        r0 = r301.A02;
        r0 = r301.A03;
        r0 = ((X.Ku5) r301).A00;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0401, code lost:
    
        r339 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0405, code lost:
    
        if (r339 >= r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x041d, code lost:
    
        if (X.JR1.A0W(r0, r339) >= 128) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0420, code lost:
    
        r0 = r0[r339];
        r0 = X.JQz.A08(X.AnonymousClass002.A04(r0), -862048943);
        r0 = r301.A00(r0 >>> 7);
        r0 = r0 & 127;
        r0 = r0 >> 3;
        r0 = (r0 & 7) << 3;
        r0 = (r0[r0] & ((255 << r0) ^ r0)) | (r0 << r0);
        r0[r0] = r0;
        X.JR1.A1S(r0, r0, r0, r0);
        r0[r0] = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x049d, code lost:
    
        r0 = r339 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01c3, code lost:
    
        r301.A01++;
        r0 = r301.A00;
        r0 = r301.A02;
        r0 = r310 >> 3;
        r0 = r0[r0];
        r0 = (r310 & 7) << 3;
        r301.A00 = r0 - (X.AnonymousClass001.A1O((((r0 >> r0) & 255) > 128 ? 1 : (((r0 >> r0) & 255) == 128 ? 0 : -1))) ? 1 : 0);
        r0 = ((X.Ku5) r301).A00;
        r0 = (((255 << r0) ^ r0) & r0) | (r0 << r0);
        r0[r0] = r0;
        X.JR1.A1S(r0, r310, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0246, code lost:
    
        return r310;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int A01(X.C2820Jac r301, java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 1210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2820Jac.A01(X.Jac, java.lang.Object):int");
    }

    public static C2820Jac A02() {
        return new C2820Jac(6);
    }

    private final void A03(int i) {
        int A05 = JR2.A05(i);
        super.A00 = A05;
        long[] A0p = JR2.A0p(A05);
        this.A02 = A0p;
        JR2.A0Z(A05, A0p);
        this.A00 = JR1.A05(super.A00) - this.A01;
        this.A03 = new Object[A05];
    }

    public static void A04(C2820Jac c2820Jac, Object obj) {
        c2820Jac.A03[A01(c2820Jac, obj)] = obj;
    }

    public final void A06() {
        this.A01 = 0;
        long[] jArr = this.A02;
        if (jArr != Ky4.A00) {
            JR0.A1M(jArr);
            JR2.A0Z(super.A00, this.A02);
        }
        C1A9.A0H(this.A03, 0, super.A00);
        this.A00 = JR1.A05(super.A00) - this.A01;
    }

    public final void A07(int i) {
        this.A01--;
        long[] jArr = this.A02;
        JR1.A1S(jArr, i, super.A00, JR2.A0H(jArr, i));
        this.A03[i] = null;
    }

    public final void A08(Ku5 ku5) {
        Object[] objArr = ku5.A03;
        long[] jArr = ku5.A02;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            long j = jArr[i2];
            if ((JQy.A0L(j) & (-9187201950435737472L)) != -9187201950435737472L) {
                int A08 = 8 - JQx.A08(i2, length);
                int i3 = 0;
                while (true) {
                    int i4 = i3;
                    if (i4 >= A08) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        A04(this, JQx.A0t(objArr, i2, i4));
                    }
                    j >>= 8;
                    i3 = i4 + 1;
                }
                if (A08 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i = i2 + 1;
            }
        }
    }

    public final boolean A09(Iterable iterable) {
        int i = this.A01;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            A04(this, it.next());
        }
        return 4YV.A1W(i, this.A01);
    }

    public final boolean A0A(Object obj) {
        int i = this.A01;
        A04(this, obj);
        return 4YV.A1W(this.A01, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b5, code lost:
    
        if ((X.JR0.A0U(r0) & (-9187201950435737472L)) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0B(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2820Jac.A0B(java.lang.Object):boolean");
    }
}
