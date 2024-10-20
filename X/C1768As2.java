package X;

/* renamed from: X.As2, reason: case insensitive filesystem */
/* loaded from: As2.class */
public final class C1768As2 extends C04v {
    public final long A00;
    public final Integer A01;
    public final Long A02;
    public final Long A03;
    public final Long A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final Long A09;
    public final String A0A;

    public C1768As2(Integer num, Long l, Long l2, Long l3, Long l4, String str, String str2, String str3, String str4, String str5, long j) {
        this.A00 = j;
        this.A08 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A0A = str4;
        this.A09 = l;
        this.A02 = l2;
        this.A03 = l3;
        this.A05 = str5;
        this.A01 = num;
        this.A04 = l4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1768As2)) {
                return false;
            }
            C1768As2 c1768As2 = (C1768As2) obj;
            if (this.A00 != c1768As2.A00 || !11T.A0O(this.A08, c1768As2.A08) || !11T.A0O(this.A07, c1768As2.A07) || !11T.A0O(this.A06, c1768As2.A06) || !11T.A0O(this.A0A, c1768As2.A0A) || !11T.A0O(this.A09, c1768As2.A09) || !11T.A0O(this.A02, c1768As2.A02) || !11T.A0O(this.A03, c1768As2.A03) || !11T.A0O(this.A05, c1768As2.A05) || this.A01 != c1768As2.A01 || !11T.A0O(this.A04, c1768As2.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str;
        int hashCode;
        int A02 = (((((((((((((((7zQ.A02(this.A00) + 1BL.A05(this.A08)) * 31) + 1BL.A05(this.A07)) * 31) + 1BL.A05(this.A06)) * 31) + 1BL.A05(this.A0A)) * 31) + AnonymousClass001.A02(this.A09)) * 31) + AnonymousClass001.A02(this.A02)) * 31) + AnonymousClass001.A02(this.A03)) * 31) + 1BL.A05(this.A05)) * 31;
        Integer num = this.A01;
        if (num == null) {
            hashCode = 0;
        } else {
            int intValue = num.intValue();
            switch (intValue) {
                case 1:
                    str = "WEEKLY";
                    break;
                case 2:
                    str = "ONE_TIME";
                    break;
                default:
                    str = "DAILY";
                    break;
            }
            hashCode = str.hashCode() + intValue;
        }
        return ((A02 + hashCode) * 31) + 4YU.A03(this.A04);
    }
}
