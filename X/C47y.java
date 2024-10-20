package X;

/* renamed from: X.47y, reason: invalid class name */
/* loaded from: 47y.class */
public final class C47y {
    public Integer A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final long A05;
    public final String A06;
    public final /* synthetic */ C47s A07;

    public C47y(C47s c47s, String str) {
        this.A07 = c47s;
        this.A06 = str;
        this.A00 = 0S2.A01;
        this.A05 = -1;
        c47s.A0C.add(str);
    }

    public C47y(C47s c47s, String str, long j) {
        this.A07 = c47s;
        if (j < 0) {
            C47s.A09(c47s, 0Pz.A0W("Negative Cache Recency Threshold Entered For Query: ", str));
        }
        c47s.A0B.add(str);
        c47s.Bcg(0Pz.A0W("recency_threshold_for_", str), j);
        this.A06 = str;
        this.A00 = 0S2.A00;
        this.A05 = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        if (r301.A01 == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A00() {
        /*
            Method dump skipped, instructions count: 196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47y.A00():void");
    }
}
