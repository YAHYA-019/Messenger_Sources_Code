package X;

/* loaded from: DqC.class */
public final class DqC extends C04v {
    public C84j A00;
    public Integer A01;
    public String A02;
    public String A03;
    public String A04;
    public final EQx A05;
    public final String A06;
    public final String A07;
    public final java.util.Map A08;
    public final boolean A09;
    public final boolean A0A;

    public DqC(C84j c84j, EQx eQx, String str, String str2, String str3, java.util.Map map, boolean z, boolean z2) {
        1BL.A1F(str, eQx);
        this.A03 = str;
        this.A05 = eQx;
        this.A06 = str2;
        this.A0A = z;
        this.A07 = str3;
        this.A08 = map;
        this.A09 = z2;
        this.A04 = null;
        this.A02 = null;
        this.A01 = null;
        this.A00 = c84j;
        if (z && str3 == null) {
            throw 1BK.A0h();
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DqC)) {
                return false;
            }
            DqC dqC = (DqC) obj;
            if (!11T.A0O(this.A03, dqC.A03) || this.A05 != dqC.A05 || !11T.A0O(this.A06, dqC.A06) || this.A0A != dqC.A0A || !11T.A0O(this.A07, dqC.A07) || !11T.A0O(this.A08, dqC.A08) || this.A09 != dqC.A09 || !11T.A0O(this.A04, dqC.A04) || !11T.A0O(this.A02, dqC.A02) || !11T.A0O(this.A01, dqC.A01) || !11T.A0O(this.A00, dqC.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((AnonymousClass002.A05(this.A05, 4YV.A02(this.A03)) + 1BL.A05(this.A06)) * 31) + AnonymousClass002.A00(this.A0A ? 1 : 0)) * 31) + 1BL.A05(this.A07)) * 31) + AnonymousClass001.A02(this.A08)) * 31) + AnonymousClass002.A00(this.A09 ? 1 : 0)) * 31 * 31) + 1BL.A05(this.A04)) * 31) + 1BL.A05(this.A02)) * 31) + AnonymousClass001.A02(this.A01)) * 31 * 31) + 4YU.A03(this.A00);
    }
}
