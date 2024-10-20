package X;

/* loaded from: Dqu.class */
public final class Dqu extends C04v implements C6tP {
    public final int A00 = 0;
    public final Object A01;
    public final boolean A02;

    public Dqu(ELy eLy, boolean z) {
        11T.A0F(eLy, 1);
        this.A01 = eLy;
        this.A02 = z;
    }

    public Dqu(EPD epd) {
        11T.A0F(epd, 1);
        this.A01 = epd;
        this.A02 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (((X.Dqu) r302).A00 != r301) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A00(int r301, java.lang.Object r302) {
        /*
            r0 = r302
            boolean r0 = r0 instanceof X.Dqu
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1a
            r0 = r302
            X.Dqu r0 = (X.Dqu) r0
            r302 = r0
            r0 = r302
            int r0 = r0.A00
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            r1 = r301
            if (r0 == r1) goto L1c
        L1a:
            r0 = 0
            r303 = r0
        L1c:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dqu.A00(int, java.lang.Object):boolean");
    }

    @Override // X.C6tP
    public boolean BRa() {
        return this.A02;
    }

    public boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else {
            if (this == obj) {
                return true;
            }
            i = 0;
        }
        if (!A00(i, obj)) {
            return false;
        }
        Dqu dqu = (Dqu) obj;
        return this.A01 == dqu.A01 && this.A02 == dqu.A02;
    }

    public int hashCode() {
        return 1BL.A03(this.A01) + AnonymousClass002.A00(this.A02 ? 1 : 0);
    }
}
