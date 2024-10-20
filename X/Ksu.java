package X;

/* loaded from: Ksu.class */
public final class Ksu {
    public final String A00;
    public final String A01;

    public Ksu(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003b, code lost:
    
        if (com.google.common.base.Objects.equal(r301.A01, r0.A01) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof X.Ksu
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L45
            r0 = r302
            X.Ksu r0 = (X.Ksu) r0
            r302 = r0
            r0 = r301
            java.lang.String r0 = r0.A00
            r304 = r0
            r0 = r302
            java.lang.String r0 = r0.A00
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = com.google.common.base.Objects.equal(r0, r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3e
            r0 = r301
            java.lang.String r0 = r0.A01
            r304 = r0
            r0 = r302
            java.lang.String r0 = r0.A01
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = com.google.common.base.Objects.equal(r0, r1)
            r306 = r0
            r0 = 1
            r303 = r0
            r0 = r306
            if (r0 != 0) goto L43
        L3e:
            r0 = 0
            r303 = r0
            r0 = 0
            r305 = r0
        L43:
            r0 = r303
            return r0
        L45:
            r0 = r301
            r1 = r302
            boolean r0 = super.equals(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ksu.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return AbM.A05(this.A00, this.A01);
    }

    public String toString() {
        return 0Pz.A0j(this.A00, "_", this.A01);
    }
}
