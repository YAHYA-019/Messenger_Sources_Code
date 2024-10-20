package X;

/* loaded from: Hsm.class */
public final class Hsm {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x005e, code lost:
    
        if (com.google.common.base.Platform.stringIsNullOrEmpty(r307) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Hsm(java.lang.String r302, java.lang.String r303, java.lang.String r304, java.lang.String r305, java.lang.String r306, java.lang.String r307, int r308, int r309, int r310) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r301
            r1 = r302
            r0.A03 = r1
            r0 = r301
            r1 = r308
            r0.A00 = r1
            r0 = r301
            r1 = r309
            r0.A01 = r1
            r0 = r301
            r1 = r303
            r0.A04 = r1
            java.lang.String r0 = "mediaId"
            r1 = r304
            X.C1pq.A08(r0, r1)
            r0 = r301
            r1 = r304
            r0.A05 = r1
            r0 = r301
            r1 = r305
            r0.A06 = r1
            r0 = r301
            r1 = r306
            r0.A07 = r1
            r0 = r301
            r1 = r307
            r0.A08 = r1
            r0 = r301
            r1 = r310
            r0.A02 = r1
            r0 = r301
            java.lang.String r0 = r0.A04
            r311 = r0
            r0 = r311
            boolean r0 = com.google.common.base.Platform.stringIsNullOrEmpty(r0)
            r312 = r0
            r0 = r312
            if (r0 == 0) goto L61
            r0 = r307
            boolean r0 = com.google.common.base.Platform.stringIsNullOrEmpty(r0)
            r313 = r0
            r0 = 0
            r312 = r0
            r0 = 0
            r311 = r0
            r0 = r313
            if (r0 != 0) goto L64
        L61:
            r0 = 1
            r312 = r0
        L64:
            r0 = r312
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r301
            java.lang.String r0 = r0.A05
            boolean r0 = com.google.common.base.Platform.stringIsNullOrEmpty(r0)
            r1 = 1
            r0 = r0 ^ r1
            com.google.common.base.Preconditions.checkArgument(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Hsm.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Hsm)) {
                return false;
            }
            Hsm hsm = (Hsm) obj;
            if (!11T.A0O(this.A03, hsm.A03) || this.A00 != hsm.A00 || this.A01 != hsm.A01 || !11T.A0O(this.A04, hsm.A04) || !11T.A0O(this.A05, hsm.A05) || !11T.A0O(this.A06, hsm.A06) || !11T.A0O(this.A07, hsm.A07) || !11T.A0O(this.A08, hsm.A08) || this.A02 != hsm.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, (C1pq.A04(this.A04, (((C1pq.A03(this.A03) * 31 * 31 * 31 * 31) + this.A00) * 31 * 31) + this.A01) * 31) + 1237) * 31))) * 31) + this.A02;
    }
}
