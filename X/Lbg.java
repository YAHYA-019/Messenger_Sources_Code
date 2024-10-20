package X;

/* loaded from: Lbg.class */
public final class Lbg implements C6a9 {
    public byte[] A00;
    public final long A01 = 6aC.A03.getAndIncrement();
    public final 6DQ A02;
    public final C6aA A03;

    public Lbg(6D7 r302, 6DQ r303) {
        this.A02 = r303;
        this.A03 = new C6aA(r302);
    }

    @Override // X.C6a9
    public void AEC() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return;
     */
    @Override // X.C6a9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BYQ() {
        /*
            r301 = this;
            r0 = r301
            X.6aA r0 = r0.A03
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = r303
            r0.A00 = r1
            r0 = r301
            X.6DQ r0 = r0.A02     // Catch: java.lang.Throwable -> L82
            r305 = r0
            r0 = r302
            r1 = r305
            long r0 = r0.CVO(r1)     // Catch: java.lang.Throwable -> L82
        L19:
            r0 = r302
            long r0 = r0.A00     // Catch: java.lang.Throwable -> L82
            r303 = r0
            r0 = r303
            int r0 = (int) r0
            r306 = r0
            r0 = r301
            byte[] r0 = r0.A00     // Catch: java.lang.Throwable -> L82
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L5f
            r0 = 1024(0x400, float:1.435E-42)
            r308 = r0
            r0 = r308
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L82
            r307 = r0
        L38:
            r0 = r301
            r1 = r307
            r0.A00 = r1     // Catch: java.lang.Throwable -> L82
        L3e:
            r0 = r307
            int r0 = r0.length     // Catch: java.lang.Throwable -> L82
            r1 = r306
            int r0 = r0 - r1
            r308 = r0
            r0 = r302
            r1 = r307
            r2 = r306
            r3 = r308
            int r0 = r0.read(r1, r2, r3)     // Catch: java.lang.Throwable -> L82
            r309 = r0
            r0 = -1
            r308 = r0
            r0 = r309
            r1 = r308
            if (r0 != r1) goto L19
            goto L7d
        L5f:
            r0 = r307
            int r0 = r0.length     // Catch: java.lang.Throwable -> L82
            r308 = r0
            r0 = r306
            r1 = r308
            if (r0 != r1) goto L3e
            r0 = r308
            r1 = 2
            int r0 = r0 * r1
            r308 = r0
            r0 = r307
            r1 = r308
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch: java.lang.Throwable -> L82
            r307 = r0
            goto L38
        L7d:
            r0 = r302
            r0.close()     // Catch: java.io.IOException -> L8b
        L81:
            return
        L82:
            r305 = move-exception
            r0 = r302
            r0.close()     // Catch: java.io.IOException -> L8f
        L88:
            r0 = r305
            throw r0
        L8b:
            goto L81
        L8f:
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lbg.BYQ():void");
    }
}
