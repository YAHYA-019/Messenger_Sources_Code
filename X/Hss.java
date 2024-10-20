package X;

import com.google.common.collect.ImmutableList;

/* loaded from: Hss.class */
public final class Hss {
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;
    public final int A04;
    public final int A05;
    public final ImmutableList A06;
    public final ImmutableList A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;

    public Hss(ImmutableList immutableList, ImmutableList immutableList2, String str, String str2, String str3, double d, double d2, double d3, double d4, int i, int i2, boolean z) {
        this.A00 = d;
        this.A01 = d2;
        this.A04 = i;
        C1pq.A08("mapAddress", str);
        this.A08 = str;
        this.A0B = z;
        this.A02 = d3;
        this.A03 = d4;
        C1pq.A08("pointOfInterestViewModels", immutableList);
        this.A06 = immutableList;
        this.A05 = i2;
        this.A09 = str2;
        C1pq.A08("sharerViewModels", immutableList2);
        this.A07 = immutableList2;
        C1pq.A08("userId", str3);
        this.A0A = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Hss)) {
                return false;
            }
            Hss hss = (Hss) obj;
            if (this.A00 != hss.A00 || this.A01 != hss.A01 || this.A04 != hss.A04 || !11T.A0O(this.A08, hss.A08) || this.A0B != hss.A0B || this.A02 != hss.A02 || this.A03 != hss.A03 || !11T.A0O(this.A06, hss.A06) || this.A05 != hss.A05 || !11T.A0O(this.A09, hss.A09) || !11T.A0O(this.A07, hss.A07) || !11T.A0O(this.A0A, hss.A0A)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A0A, C1pq.A04(this.A07, C1pq.A04(this.A09, (C1pq.A04(this.A06, C1pq.A00(this.A03, C1pq.A00(this.A02, C1pq.A02(C1pq.A04(this.A08, (C1pq.A00(this.A01, C1pq.A00(this.A00, 1)) * 31) + this.A04), this.A0B)))) * 31) + this.A05)));
    }
}
