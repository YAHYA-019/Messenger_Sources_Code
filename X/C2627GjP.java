package X;

/* renamed from: X.GjP, reason: case insensitive filesystem */
/* loaded from: GjP.class */
public final class C2627GjP extends C04v {
    public final int A00;
    public final Float A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2627GjP() {
        /*
            r301 = this;
            java.lang.Integer r0 = X.0S2.A01
            r302 = r0
            java.lang.Integer r0 = X.0S2.A00
            r303 = r0
            r0 = r301
            r1 = 0
            r2 = r302
            r3 = r302
            r4 = 0
            r5 = r303
            r6 = 6
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2627GjP.<init>():void");
    }

    public C2627GjP(Float f, Integer num, Integer num2, Integer num3, Integer num4, int i) {
        11T.A0F(num, 1);
        this.A02 = num;
        this.A05 = num2;
        this.A03 = num3;
        this.A04 = num4;
        this.A00 = i;
        this.A01 = f;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2627GjP)) {
                return false;
            }
            C2627GjP c2627GjP = (C2627GjP) obj;
            if (this.A02 != c2627GjP.A02 || this.A05 != c2627GjP.A05 || !11T.A0O(this.A03, c2627GjP.A03) || this.A04 != c2627GjP.A04 || this.A00 != c2627GjP.A00 || !11T.A0O(this.A01, c2627GjP.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str;
        String str2;
        int intValue = this.A02.intValue();
        int hashCode = ((1 != intValue ? "SQUARE" : "PORTRAIT").hashCode() + intValue) * 31;
        int intValue2 = this.A05.intValue();
        switch (intValue2) {
            case 1:
                str = "CENTER";
                break;
            case 2:
                str = "RIGHT";
                break;
            default:
                str = "LEFT";
                break;
        }
        int A07 = (7zR.A07(str, intValue2, hashCode) + AnonymousClass001.A02(this.A03)) * 31 * 31;
        int intValue3 = this.A04.intValue();
        switch (intValue3) {
            case 1:
                str2 = "FIXED";
                break;
            case 2:
                str2 = "FIXED_RATIO";
                break;
            default:
                str2 = "DEFAULT";
                break;
        }
        return ((((((((7zR.A07(str2, intValue3, A07) + this.A00) * 31 * 31) + 4YU.A03(this.A01)) * 31 * 31) + 1237) * 31 * 31 * 31) + 1237) * 31) + 1237;
    }
}
