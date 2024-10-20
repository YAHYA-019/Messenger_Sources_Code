package X;

import com.google.common.collect.ImmutableList;

/* loaded from: Hsv.class */
public final class Hsv {
    public final int A00;
    public final int A01;
    public final C1u3 A02;
    public final C1u4 A03;
    public final 1LI A04;
    public final ImmutableList A05;
    public final ImmutableList A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;

    public Hsv(HkE hkE) {
        this.A07 = hkE.A07;
        this.A08 = hkE.A08;
        this.A00 = hkE.A00;
        this.A05 = hkE.A05;
        this.A06 = hkE.A06;
        this.A09 = hkE.A09;
        this.A04 = hkE.A04;
        this.A0A = hkE.A0A;
        this.A01 = hkE.A01;
        this.A02 = hkE.A02;
        this.A03 = hkE.A03;
        this.A0B = hkE.A0B;
        this.A0C = hkE.A0C;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Hsv)) {
                return false;
            }
            Hsv hsv = (Hsv) obj;
            if (!11T.A0O(this.A07, hsv.A07) || !11T.A0O(this.A08, hsv.A08) || this.A00 != hsv.A00 || !11T.A0O(this.A05, hsv.A05) || !11T.A0O(this.A06, hsv.A06) || !11T.A0O(this.A09, hsv.A09) || !11T.A0O(this.A04, hsv.A04) || !11T.A0O(this.A0A, hsv.A0A) || this.A01 != hsv.A01 || this.A02 != hsv.A02 || this.A03 != hsv.A03 || !11T.A0O(this.A0B, hsv.A0B) || !11T.A0O(this.A0C, hsv.A0C)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A04 = (((C1pq.A04(this.A0A, C1pq.A04(this.A04, C1pq.A04(this.A09, C1pq.A04(this.A06, C1pq.A04(this.A05, (C1pq.A04(this.A08, C1pq.A03(this.A07) * 31) * 31) + this.A00))) * 31 * 31) * 31) * 31) + this.A01) * 31) + C3o5.A03(this.A02);
        C1u4 c1u4 = this.A03;
        if (c1u4 != null) {
            i = c1u4.ordinal();
        }
        return C1pq.A04(this.A0C, C1pq.A04(this.A0B, (((((((((A04 * 31) + i) * 31) + 1237) * 31) + 1237) * 31) + 1237) * 31) + 1237) * 31) * 31;
    }
}
