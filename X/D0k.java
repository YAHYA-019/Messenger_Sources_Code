package X;

/* loaded from: D0k.class */
public final class D0k implements DIH {
    public final /* synthetic */ C54p A00;

    public D0k(C54p c54p) {
        this.A00 = c54p;
    }

    public /* bridge */ /* synthetic */ Object AMx(byte[] bArr, int i) {
        return D1R.A00(C54f.A00(bArr, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r0.errorCode != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ boolean BSO(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            X.D1R r0 = (X.D1R) r0
            r302 = r0
            r0 = r302
            java.lang.String r0 = r0.syncToken
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L1c
            r0 = r302
            java.lang.String r0 = r0.errorCode
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L1f
        L1c:
            r0 = 1
            r305 = r0
        L1f:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D0k.BSO(java.lang.Object):boolean");
    }

    public /* bridge */ /* synthetic */ BrC CZT(Object obj) {
        D1R d1r = (D1R) obj;
        String str = d1r.syncToken;
        return str != null ? new BrC(true, str, (String) null) : new BrC(false, (String) null, d1r.errorCode);
    }
}
