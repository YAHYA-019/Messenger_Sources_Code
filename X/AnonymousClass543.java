package X;

/* renamed from: X.543, reason: invalid class name */
/* loaded from: 543.class */
public final class AnonymousClass543 implements AnonymousClass544 {
    public final int A00;
    public final int A01;
    public final int A02;

    public AnonymousClass543() {
        this(-1, -1);
    }

    public AnonymousClass543(int i, int i2) {
        this.A01 = i;
        this.A02 = i2;
        this.A00 = 0J6.A01(AnonymousClass543.class, Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (r301.A00 != ((X.AnonymousClass543) r302).A00) goto L6;
     */
    @Override // X.AnonymousClass544
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BVd(X.AnonymousClass544 r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof X.AnonymousClass543
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L21
            r0 = r301
            int r0 = r0.A00
            r304 = r0
            r0 = r302
            X.543 r0 = (X.AnonymousClass543) r0
            r302 = r0
            r0 = r302
            int r0 = r0.A00
            r305 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            r1 = r305
            if (r0 == r1) goto L23
        L21:
            r0 = 0
            r303 = r0
        L23:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass543.BVd(X.544):boolean");
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return this.A00;
    }
}
