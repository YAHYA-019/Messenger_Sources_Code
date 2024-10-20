package X;

/* renamed from: X.JaQ, reason: case insensitive filesystem */
/* loaded from: JaQ.class */
public final class C2817JaQ extends L4S {
    public int A00;

    public C2817JaQ() {
        C2818Jaa c2818Jaa = Ky4.A01;
        A01(this, 6);
    }

    private final int A00(int i) {
        int i2 = super.A00;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long A0C = JR2.A0C(JR2.A0I(this.A04, i3));
            if (A0C != 0) {
                return JR0.A0K(A0C, i3, i2);
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public static final void A01(C2817JaQ c2817JaQ, int i) {
        int A05 = JR2.A05(i);
        ((L4S) c2817JaQ).A00 = A05;
        long[] A0p = JR2.A0p(A05);
        c2817JaQ.A04 = A0p;
        JR2.A0Z(A05, A0p);
        c2817JaQ.A00 = JR1.A05(((L4S) c2817JaQ).A00) - c2817JaQ.A01;
        c2817JaQ.A02 = new int[A05];
        c2817JaQ.A03 = new int[A05];
    }

    public final void A02() {
        this.A01 = 0;
        long[] jArr = this.A04;
        if (jArr != Ky4.A00) {
            JR0.A1M(jArr);
            JR2.A0Z(super.A00, this.A04);
        }
        this.A00 = JR1.A05(super.A00) - this.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d1, code lost:
    
        if ((X.JR0.A0U(r0) & (-9187201950435737472L)) == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d4, code lost:
    
        r306 = A00(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00eb, code lost:
    
        if (r301.A00 != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0105, code lost:
    
        if (X.JR1.A0W(r0, r306) == 254) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0110, code lost:
    
        if (r0 <= 8) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0140, code lost:
    
        if ((X.JR0.A0R(r301.A01) ^ Long.MIN_VALUE) > (X.JQz.A0H(r0) ^ Long.MIN_VALUE)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0143, code lost:
    
        r0 = r301.A02;
        r0 = r301.A03;
        X.Ky4.A00(r0, r0);
        r309 = 0;
        r344 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0164, code lost:
    
        r0 = r309 >> 3;
        r0 = r0[r0];
        r0 = (r309 & 7) << 3;
        r0 = (r0 >> r0) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0192, code lost:
    
        if (r0 != 128) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0195, code lost:
    
        r344 = r309;
        r309 = r309 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01a7, code lost:
    
        if (r309 != r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01aa, code lost:
    
        r301.A00 = X.JR1.A05(r301.A00) - r301.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01c9, code lost:
    
        r306 = A00(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x028e, code lost:
    
        if (r0 != 254) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0291, code lost:
    
        r0 = X.JQz.A08(r0[r309], -862048943);
        r0 = r0 >>> 7;
        r0 = A00(r0);
        r0 = r0 & r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x02de, code lost:
    
        if (X.JQz.A09(r0, r0, r0) != X.JQz.A09(r309, r0, r0)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x02e1, code lost:
    
        r0[r0] = ((r0 & 127) << r0) | (((255 << r0) ^ r0) & r0[r0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0312, code lost:
    
        r0[r0.length - 1] = (r0[0] & 72057594037927935L) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0339, code lost:
    
        r0 = r0 >> 3;
        r0 = r0[r0];
        r0 = (r0 & 7) << 3;
        r0 = (r0 >> r0) & 255;
        r0 = r0 & 127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0369, code lost:
    
        if (r0 != 128) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x036c, code lost:
    
        r0[r0] = (r0 & ((255 << r0) ^ r0)) | (r0 << r0);
        r0[r0] = (r0[r0] & ((255 << r0) ^ r0)) | (128 << r0);
        X.JQz.A1U(r0, r309, r0, 0);
        X.JQz.A1U(r0, r309, r0, 0);
        r344 = r309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x03df, code lost:
    
        r0[r0] = (r0 << r0) | (r0 & ((255 << r0) ^ r0));
        r344 = X.JR1.A0P(r0, r344, r309, r0);
        X.JR1.A1R(r0, r0, r344, r309);
        X.JR1.A1R(r0, r0, r344, r309);
        r309 = r309 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0330, code lost:
    
        r309 = r309 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0432, code lost:
    
        r0 = X.JR0.A0A(r0);
        r0 = r301.A02;
        r0 = r301.A03;
        A01(r301, r0);
        r0 = r301.A04;
        r0 = r301.A02;
        r0 = r301.A03;
        r0 = r301.A00;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0471, code lost:
    
        r328 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0475, code lost:
    
        if (r328 >= r0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x048f, code lost:
    
        if (X.JR1.A0W(r0, r328) >= 128) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0492, code lost:
    
        r0 = r0[r328];
        r0 = X.JQz.A08(-862048943, r0);
        r0 = A00(r0 >>> 7);
        r0 = r0 & 127;
        r0 = r0 >> 3;
        r0 = (r0 & 7) << 3;
        r0 = (r0 << r0) | (r0[r0] & ((255 << r0) ^ r0));
        r0[r0] = r0;
        X.JR1.A1S(r0, r0, r0, r0);
        r0[r0] = r0;
        r0[r0] = r0[r328];
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0518, code lost:
    
        r0 = r328 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01d2, code lost:
    
        r301.A01++;
        r0 = r301.A00;
        r0 = r301.A04;
        r0 = r306 >> 3;
        r0 = r0[r0];
        r0 = (r306 & 7) << 3;
        r301.A00 = r0 - (X.AnonymousClass001.A1O((((r0 >> r0) & 255) > 128 ? 1 : (((r0 >> r0) & 255) == 128 ? 0 : -1))) ? 1 : 0);
        r0 = r301.A00;
        r0 = (((255 << r0) ^ r0) & r0) | (r0 << r0);
        r0[r0] = r0;
        X.JR1.A1S(r0, r306, r0, r0);
        r328 = r306 ^ (-1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A03(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 1333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2817JaQ.A03(int, int):void");
    }
}
