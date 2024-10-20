package X;

/* loaded from: Cm4.class */
public final class Cm4 implements JK0 {
    public final /* synthetic */ C8a A00;

    public Cm4(C8a c8a) {
        this.A00 = c8a;
    }

    @Override // X.JK0
    public 06Z AnP() {
        return 7zN.A08(this.A00.A02);
    }

    @Override // X.JK0
    public boolean BRK() {
        return AnonymousClass001.A1T(this.A00.A07.getParent());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r301.A00.A07.getVisibility() != 0) goto L6;
     */
    @Override // X.JK0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BRL() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.BRK()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1c
            r0 = r301
            X.C8a r0 = r0.A00
            com.facebook.resources.ui.FbFrameLayout r0 = r0.A07
            r303 = r0
            r0 = r303
            int r0 = r0.getVisibility()
            r304 = r0
            r0 = 1
            r302 = r0
            r0 = r304
            if (r0 == 0) goto L20
        L1c:
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
        L20:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cm4.BRL():boolean");
    }
}
