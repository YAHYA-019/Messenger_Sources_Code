package X;

/* renamed from: X.As0, reason: case insensitive filesystem */
/* loaded from: As0.class */
public final class C1766As0 extends C04v {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Integer A06;
    public final Integer A07;

    public C1766As0(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A04 = str;
        this.A05 = str2;
        this.A07 = num;
        this.A01 = str3;
        this.A02 = str4;
        this.A06 = num2;
        this.A03 = str5;
        this.A00 = str6;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1766As0)) {
                return false;
            }
            C1766As0 c1766As0 = (C1766As0) obj;
            if (!11T.A0O(this.A04, c1766As0.A04) || !11T.A0O(this.A05, c1766As0.A05) || !11T.A0O(this.A07, c1766As0.A07) || !11T.A0O(this.A01, c1766As0.A01) || !11T.A0O(this.A02, c1766As0.A02) || !11T.A0O(this.A06, c1766As0.A06) || !11T.A0O(this.A03, c1766As0.A03) || !11T.A0O(this.A00, c1766As0.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A00, AnonymousClass002.A07(this.A03, ((((((((((1BL.A05(this.A04) * 31) + 1BL.A05(this.A05)) * 31) + AnonymousClass001.A02(this.A07)) * 31) + 1BL.A05(this.A01)) * 31) + 1BL.A05(this.A02)) * 31) + 4YU.A03(this.A06)) * 31));
    }
}
