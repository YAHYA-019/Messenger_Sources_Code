package X;

/* loaded from: N6c.class */
public final class N6c implements C4Av {
    public NAF A00;
    public final 1Br A03 = 1Bq.A00(16432);
    public final 1Br A01 = 1Bq.A00(16441);
    public final 1Br A02 = 1Bq.A00(147929);

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r302 < r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A00(long r302) {
        /*
            r301 = this;
            r0 = r301
            monitor-enter(r0)
            r0 = r301
            X.1Br r0 = r0.A02     // Catch: java.lang.Throwable -> Laa
            r304 = r0
            r0 = r304
            java.lang.Object r0 = X.1Br.A0B(r0)     // Catch: java.lang.Throwable -> Laa
            r305 = r0
            r0 = r305
            X.4nd r0 = (X.C08644nd) r0     // Catch: java.lang.Throwable -> Laa
            r305 = r0
            r0 = r305
            monitor-enter(r0)     // Catch: java.lang.Throwable -> Laa
            r0 = r305
            long r0 = r0.A00     // Catch: java.lang.Throwable -> La4
            r306 = r0
            r0 = -1
            long r0 = (long) r0
            r308 = r0
            r0 = 0
            r310 = r0
            r0 = r306
            r1 = r308
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r311 = r0
            r0 = r311
            if (r0 == 0) goto L3f
            r0 = r302
            r1 = r306
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r311 = r0
            r0 = 0
            r312 = r0
            r0 = r311
            if (r0 >= 0) goto L42
        L3f:
            r0 = 1
            r312 = r0
        L42:
            r0 = r305
            r1 = r302
            r0.A00 = r1     // Catch: java.lang.Throwable -> La4
            r0 = r302
            r1 = r308
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r313 = r0
            r0 = 0
            r311 = r0
            r0 = 0
            r304 = r0
            r0 = r313
            if (r0 == 0) goto L5b
            r0 = 1
            r311 = r0
        L5b:
            r0 = r305
            r1 = r311
            r0.A02 = r1     // Catch: java.lang.Throwable -> La4
            r0 = r305
            boolean r0 = r0.A02     // Catch: java.lang.Throwable -> La4
            r311 = r0
            r0 = r311
            if (r0 == 0) goto L76
            r0 = r312
            if (r0 == 0) goto L76
            r0 = 1
            r310 = r0
        L76:
            r0 = r305
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Laa
            r0 = r310
            if (r0 == 0) goto La1
            r0 = r301
            X.1Br r0 = r0.A01     // Catch: java.lang.Throwable -> Laa
            r304 = r0
            r0 = r304
            java.lang.Object r0 = X.1Br.A0B(r0)     // Catch: java.lang.Throwable -> Laa
            r314 = r0
            r0 = r314
            X.1ED r0 = (X.1ED) r0     // Catch: java.lang.Throwable -> Laa
            r314 = r0
            X.N8n r0 = new X.N8n     // Catch: java.lang.Throwable -> Laa
            r304 = r0
            r0 = r304
            r1 = r301
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Laa
            r0 = r314
            r1 = r304
            r0.execute(r1)     // Catch: java.lang.Throwable -> Laa
        La1:
            r0 = r301
            monitor-exit(r0)
            return
        La4:
            r304 = move-exception
            r0 = r305
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Laa
            r0 = r304
            throw r0     // Catch: java.lang.Throwable -> Laa
        Laa:
            r304 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r304
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6c.A00(long):void");
    }

    @Override // X.C4Av
    public boolean Ciy(4Yg r302) {
        boolean z = false;
        11T.A0F(r302, 0);
        if (r302.A01()) {
            if (this.A00 != null) {
                A00(-1);
                4YV.A11(this.A03).execute(new N8o(this.A00));
            }
            z = true;
        }
        return z;
    }
}
