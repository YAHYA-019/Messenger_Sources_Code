package X;

/* renamed from: X.Jaa, reason: case insensitive filesystem */
/* loaded from: Jaa.class */
public final class C2818Jaa extends Kui {
    public int A00;

    public C2818Jaa() {
        this(6);
    }

    public C2818Jaa(int i) {
        if (i < 0) {
            KTq.A00("Capacity must be a positive value.");
            throw 0Q8.createAndThrow();
        }
        C2818Jaa c2818Jaa = Ky4.A01;
        A01(i == 7 ? 8 : i + ((i - 1) / 7));
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

    private final void A01(int i) {
        int A05 = JR2.A05(i);
        super.A00 = A05;
        long[] A0p = JR2.A0p(A05);
        this.A02 = A0p;
        JR2.A0Z(A05, A0p);
        this.A00 = JR1.A05(super.A00) - this.A01;
        this.A03 = new Object[A05];
        this.A04 = new Object[A05];
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00cc, code lost:
    
        if ((X.JR0.A0U(r0) & (-9187201950435737472L)) == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00cf, code lost:
    
        r330 = A00(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e4, code lost:
    
        if (r301.A00 != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e7, code lost:
    
        r0 = r301.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0101, code lost:
    
        if (X.JR1.A0W(r0, r330) == 254) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0104, code lost:
    
        r0 = r301.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0111, code lost:
    
        if (r0 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x013f, code lost:
    
        if ((X.JR0.A0R(r301.A01) ^ Long.MIN_VALUE) > (X.JQz.A0H(r0) ^ Long.MIN_VALUE)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0142, code lost:
    
        r0 = r301.A03;
        r0 = r301.A04;
        X.Ky4.A00(r0, r0);
        r309 = 0;
        r339 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x015c, code lost:
    
        r0 = r309 >> 3;
        r0 = r0[r0];
        r0 = (r309 & 7) << 3;
        r0 = (r0 >> r0) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0187, code lost:
    
        if (r0 != 128) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x018a, code lost:
    
        r339 = r309;
        r309 = r309 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x019a, code lost:
    
        if (r309 != r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x019d, code lost:
    
        r301.A00 = X.JR1.A05(r301.A00) - r301.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01ba, code lost:
    
        r330 = A00(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x024c, code lost:
    
        if (r0 != 254) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x024f, code lost:
    
        r0 = X.JQz.A08(X.AnonymousClass002.A04(r0[r309]), -862048943);
        r0 = r0 >>> 7;
        r0 = A00(r0);
        r0 = r0 & r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x028b, code lost:
    
        if (X.JQz.A09(r0, r0, r0) != X.JQz.A09(r309, r0, r0)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x028e, code lost:
    
        r0[r0] = ((r0 & 127) << r0) | (((255 << r0) ^ r0) & r0[r0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x02bb, code lost:
    
        r0[r0.length - 1] = r0[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x02d7, code lost:
    
        r0 = r0 >> 3;
        r0 = r0[r0];
        r0 = (r0 & 7) << 3;
        r0 = (r0 >> r0) & 255;
        r0 = r0 & 127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0305, code lost:
    
        if (r0 != 128) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0308, code lost:
    
        r0[r0] = (r0 & ((255 << r0) ^ r0)) | (r0 << r0);
        r0[r0] = (r0[r0] & ((255 << r0) ^ r0)) | (128 << r0);
        r0[r0] = r0[r309];
        r0[r309] = null;
        r0[r0] = r0[r309];
        r0[r309] = null;
        r339 = r309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x038e, code lost:
    
        r0[r0] = (r0 << r0) | (r0 & ((255 << r0) ^ r0));
        r339 = X.JR1.A0P(r0, r339, r309, r0);
        X.JR1.A1T(r0, r0, r339, r309);
        X.JR1.A1T(r0, r0, r339, r309);
        r309 = r309 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x02ce, code lost:
    
        r309 = r309 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x03de, code lost:
    
        r0 = X.JR0.A0A(r0);
        r0 = r301.A03;
        r0 = r301.A04;
        A01(r0);
        r0 = r301.A02;
        r0 = r301.A03;
        r0 = r301.A04;
        r0 = r301.A00;
        r326 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0424, code lost:
    
        if (r326 >= r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x043b, code lost:
    
        if (X.JR1.A0W(r0, r326) >= 128) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x043e, code lost:
    
        r0 = r0[r326];
        r0 = X.JQz.A08(X.AnonymousClass002.A04(r0), -862048943);
        r0 = A00(r0 >>> 7);
        r0 = r0 & 127;
        r0 = r0 >> 3;
        r0 = (r0 & 7) << 3;
        r0 = (r0 << r0) | (r0[r0] & ((255 << r0) ^ r0));
        r0[r0] = r0;
        X.JR1.A1S(r0, r0, r0, r0);
        r0[r0] = r0;
        r0[r0] = r0[r326];
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x04c5, code lost:
    
        r326 = r326 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01c3, code lost:
    
        r301.A01++;
        r0 = r301.A00;
        r0 = r301.A02;
        r0 = r330 >> 3;
        r0 = r0[r0];
        r0 = (r330 & 7) << 3;
        r301.A00 = r0 - (X.AnonymousClass001.A1O((((r0 >> r0) & 255) > 128 ? 1 : (((r0 >> r0) & 255) == 128 ? 0 : -1))) ? 1 : 0);
        r0 = r301.A00;
        r0 = (((255 << r0) ^ r0) & r0) | (r0 << r0);
        r0[r0] = r0;
        X.JR1.A1S(r0, r330, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0244, code lost:
    
        return r330 ^ (-1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A05(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 1250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2818Jaa.A05(java.lang.Object):int");
    }

    public final Object A06(int i) {
        this.A01--;
        long[] jArr = this.A02;
        JR1.A1S(jArr, i, super.A00, JR2.A0H(jArr, i));
        this.A03[i] = null;
        Object[] objArr = this.A04;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b4, code lost:
    
        if ((X.JR0.A0U(r0) & (-9187201950435737472L)) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A07(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2818Jaa.A07(java.lang.Object):java.lang.Object");
    }

    public final void A08() {
        this.A01 = 0;
        long[] jArr = this.A02;
        if (jArr != Ky4.A00) {
            JR0.A1M(jArr);
            JR2.A0Z(super.A00, this.A02);
        }
        C1A9.A0H(this.A04, 0, super.A00);
        C1A9.A0H(this.A03, 0, super.A00);
        this.A00 = JR1.A05(super.A00) - this.A01;
    }

    public final void A09(Object obj, Object obj2) {
        int A05 = A05(obj);
        if (A05 < 0) {
            A05 ^= -1;
        }
        this.A03[A05] = obj;
        this.A04[A05] = obj2;
    }
}
