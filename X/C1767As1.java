package X;

/* renamed from: X.As1, reason: case insensitive filesystem */
/* loaded from: As1.class */
public final class C1767As1 extends C04v {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final long A09;

    public C1767As1(String str, String str2, String str3, String str4, String str5, int i, long j, long j2, long j3, long j4) {
        this.A03 = j;
        this.A08 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A05 = str4;
        this.A04 = str5;
        this.A00 = i;
        this.A01 = j2;
        this.A02 = j3;
        this.A09 = j4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1767As1)) {
                return false;
            }
            C1767As1 c1767As1 = (C1767As1) obj;
            if (this.A03 != c1767As1.A03 || !11T.A0O(this.A08, c1767As1.A08) || !11T.A0O(this.A07, c1767As1.A07) || !11T.A0O(this.A06, c1767As1.A06) || !11T.A0O(this.A05, c1767As1.A05) || !11T.A0O(this.A04, c1767As1.A04) || this.A00 != c1767As1.A00 || this.A01 != c1767As1.A01 || this.A02 != c1767As1.A02 || this.A09 != c1767As1.A09) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long j = this.A03;
        int A02 = AnonymousClass002.A02(this.A02, AnonymousClass002.A02(this.A01, (AnonymousClass002.A07(this.A04, (AnonymousClass002.A07(this.A06, (AnonymousClass002.A07(this.A08, ((int) (j ^ (j >>> 32))) * 31) + 1BL.A05(this.A07)) * 31) + 7zN.A05(this.A05)) * 31) + this.A00) * 31));
        long j2 = this.A09;
        return A02 + ((int) (j2 ^ (j2 >>> 32)));
    }
}
