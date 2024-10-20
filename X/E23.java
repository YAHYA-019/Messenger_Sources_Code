package X;

/* loaded from: E23.class */
public final class E23 extends 62R implements AnonymousClass624 {
    public final long A00;
    public final AnonymousClass214 A01;

    public E23(AnonymousClass214 anonymousClass214) {
        this.A01 = anonymousClass214;
        this.A00 = 0J6.A00(E23.class, anonymousClass214);
    }

    @Override // X.AnonymousClass626
    public long AsR() {
        return this.A00;
    }

    @Override // X.AnonymousClass624
    public C62b B8O() {
        return C62b.A0K;
    }

    @Override // X.AnonymousClass624
    public boolean BVc(AnonymousClass624 anonymousClass624) {
        boolean z = false;
        if (anonymousClass624.getClass() == E23.class && this.A01 == ((E23) anonymousClass624).A01) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (r301.A00 != r302.AsR()) goto L6;
     */
    @Override // X.AnonymousClass624
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BVk(X.AnonymousClass624 r302) {
        /*
            r301 = this;
            X.62b r0 = X.C62b.A0K
            r303 = r0
            r0 = r302
            X.62b r0 = r0.B8O()
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 != r1) goto L2d
            r0 = r301
            long r0 = r0.A00
            r305 = r0
            r0 = r302
            long r0 = r0.AsR()
            r307 = r0
            r0 = r305
            r1 = r307
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r309 = r0
            r0 = 1
            r310 = r0
            r0 = r309
            if (r0 == 0) goto L32
        L2d:
            r0 = 0
            r310 = r0
            r0 = 0
            r304 = r0
        L32:
            r0 = r310
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E23.BVk(X.624):boolean");
    }
}
