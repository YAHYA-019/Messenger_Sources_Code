package X;

/* loaded from: DqA.class */
public final class DqA extends C04v {
    public final int A00;
    public final Integer A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public DqA(Integer num, String str, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        11T.A0F(num, 6);
        this.A02 = str;
        this.A04 = z;
        this.A06 = z2;
        this.A00 = i;
        this.A05 = z3;
        this.A01 = num;
        this.A03 = z4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DqA)) {
                return false;
            }
            DqA dqA = (DqA) obj;
            if (!11T.A0O(this.A02, dqA.A02) || this.A04 != dqA.A04 || this.A06 != dqA.A06 || this.A00 != dqA.A00 || this.A05 != dqA.A05 || this.A01 != dqA.A01 || this.A03 != dqA.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str;
        int A05 = ((((((((1BL.A05(this.A02) * 31) + AnonymousClass002.A00(this.A04 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A06 ? 1 : 0)) * 31) + this.A00) * 31) + AnonymousClass002.A00(this.A05 ? 1 : 0)) * 31;
        int intValue = this.A01.intValue();
        switch (intValue) {
            case 1:
                str = "CENTER";
                break;
            case 2:
                str = "BOTTOM";
                break;
            default:
                str = "TOP";
                break;
        }
        return 7zR.A07(str, intValue, A05) + AnonymousClass002.A00(this.A03 ? 1 : 0);
    }
}
