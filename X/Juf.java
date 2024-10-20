package X;

/* loaded from: Juf.class */
public final class Juf extends KTA {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0082, code lost:
    
        if (r312 > 0.0f) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0066, code lost:
    
        if (r312 >= 0.0f) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0085, code lost:
    
        r312 = r312 + ((((((-r312) * 15.0f) / r0) + 5.0f) * r0) * r0);
        r301.A02 = r312;
        r301.A01 *= 1.0f - (10.0f * r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A00(long r302) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Juf.A00(long):void");
    }

    public void A01(LXb lXb) {
        ((KTA) this).A07 = lXb;
        ((KTA) this).A04 = 0.0f;
        ((KTA) this).A05 = 0.0f;
        ((KTA) this).A06 = 0L;
        ((KTA) this).A09 = lXb.A08.BDc(0L);
        ((KTA) this).A0A = ((KTA) this).A07.A09.BDc(0L);
        ((KTA) this).A08 = ((KTA) this).A07.A07.BDc(0L);
        ((KTA) this).A01 = lXb.A04.AUB();
        ((KTA) this).A02 = lXb.A03.AUB();
        this.A01 = lXb.A05.AUB();
        this.A02 = lXb.A06.AUB();
        this.A00 = lXb.A00.AUB();
        float f = 1.0f / 0.0f;
        float f2 = (-1.0f) / 0.0f;
        if (lXb.A0A) {
            float f3 = this.A02;
            if (f3 < 0.0f) {
                f2 = f3;
            }
            this.A04 = f2;
            if (f3 > 0.0f) {
                f = f3;
            }
        } else {
            this.A04 = f2;
        }
        this.A03 = f;
    }
}
