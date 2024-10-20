package X;

/* loaded from: L1u.class */
public final class L1u {
    public LPQ[] A00;
    public final LtK A01 = LtK.A02(new LPQ[16]);

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0066, code lost:
    
        if ((((X.LPR) r308).A00 & 256) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0075, code lost:
    
        if ((((X.LPR) r308).A01 & 256) == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0078, code lost:
    
        r309 = null;
        r310 = r308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0088, code lost:
    
        if ((r310 instanceof X.MNS) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008b, code lost:
    
        r0 = r310;
        r0.C0m(X.LDX.A04(r0, 256));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a4, code lost:
    
        r310 = X.LDX.A00(r309);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ad, code lost:
    
        if (r310 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c5, code lost:
    
        if ((((X.LPR) r310).A01 & 256) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d1, code lost:
    
        if ((r310 instanceof X.AbstractC2887Jc8) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d4, code lost:
    
        r303 = ((X.AbstractC2887Jc8) r310).A00;
        r312 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00eb, code lost:
    
        if (r303 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f9, code lost:
    
        if ((((X.LPR) r303).A01 & 256) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fc, code lost:
    
        r312 = r312 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0106, code lost:
    
        if (r312 != 1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0109, code lost:
    
        r310 = r303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010c, code lost:
    
        r303 = ((X.LPR) r303).A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0114, code lost:
    
        r309 = X.JQy.A0T(r309);
        r310 = X.JQx.A0Z(r309, (X.LPR) r310);
        r309.A0C(r303);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0135, code lost:
    
        if (r312 != 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x014a, code lost:
    
        if ((((X.LPR) r308).A00 & 256) == 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x014d, code lost:
    
        r308 = ((X.LPR) r308).A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0159, code lost:
    
        if (r308 == null) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A00(X.LPQ r302) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L1u.A00(X.LPQ):void");
    }

    public final void A01() {
        LtK ltK = this.A01;
        ltK.A0A(LsD.A00);
        int i = ltK.A00;
        LPQ[] lpqArr = this.A00;
        if (lpqArr == null || lpqArr.length < i) {
            lpqArr = new LPQ[Math.max(16, i)];
        }
        this.A00 = null;
        for (int i2 = 0; i2 < i; i2++) {
            lpqArr[i2] = ltK.A02[i2];
        }
        ltK.A06();
        while (true) {
            i--;
            if (-1 >= i) {
                this.A00 = lpqArr;
                return;
            }
            LPQ lpq = lpqArr[i];
            11T.A0D(lpq);
            if (lpq.A0J) {
                A00(lpq);
            }
        }
    }
}
