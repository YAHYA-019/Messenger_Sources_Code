package X;

/* renamed from: X.As3, reason: case insensitive filesystem */
/* loaded from: As3.class */
public final class C1769As3 extends C04v {
    public final long A00;
    public final long A01;
    public final long A02;
    public final C96f A03;
    public final Long A04;
    public final Long A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final long A0A;

    public C1769As3(C96f c96f, Long l, Long l2, String str, String str2, String str3, long j, long j2, long j3, long j4, boolean z) {
        this.A0A = j;
        this.A00 = j2;
        this.A05 = l;
        this.A04 = l2;
        this.A06 = str;
        this.A08 = str2;
        this.A07 = str3;
        this.A01 = j3;
        this.A02 = j4;
        this.A09 = z;
        this.A03 = c96f;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1769As3)) {
                return false;
            }
            C1769As3 c1769As3 = (C1769As3) obj;
            if (this.A0A != c1769As3.A0A || this.A00 != c1769As3.A00 || !11T.A0O(this.A05, c1769As3.A05) || !11T.A0O(this.A04, c1769As3.A04) || !11T.A0O(this.A06, c1769As3.A06) || !11T.A0O(this.A08, c1769As3.A08) || !11T.A0O(this.A07, c1769As3.A07) || this.A01 != c1769As3.A01 || this.A02 != c1769As3.A02 || this.A09 != c1769As3.A09 || this.A03 != c1769As3.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long j = this.A0A;
        return 1BK.A03(this.A03, (AnonymousClass002.A02(this.A02, AnonymousClass002.A02(this.A01, AnonymousClass002.A07(this.A07, (AnonymousClass002.A07(this.A06, (((AnonymousClass002.A02(this.A00, ((int) (j ^ (j >>> 32))) * 31) + AnonymousClass001.A02(this.A05)) * 31) + AnonymousClass001.A02(this.A04)) * 31) + 7zN.A05(this.A08)) * 31))) + AnonymousClass002.A00(this.A09 ? 1 : 0)) * 31);
    }
}
