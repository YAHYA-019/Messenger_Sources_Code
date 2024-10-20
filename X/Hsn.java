package X;

import com.google.common.collect.ImmutableList;

/* loaded from: Hsn.class */
public final class Hsn {
    public final int A00;
    public final HBG A01;
    public final ImmutableList A02;
    public final ImmutableList A03;
    public final ImmutableList A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public Hsn(HBG hbg, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, Integer num, String str, String str2, int i) {
        this.A02 = immutableList;
        C1pq.A08("appIconParams", immutableList2);
        this.A03 = immutableList2;
        this.A00 = i;
        this.A06 = str;
        C1pq.A08("mediaParams", immutableList3);
        this.A04 = immutableList3;
        this.A07 = str2;
        this.A05 = num;
        this.A08 = "MESSENGER_INTERFACE";
        C1pq.A08("searchType", hbg);
        this.A01 = hbg;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Hsn)) {
                return false;
            }
            Hsn hsn = (Hsn) obj;
            if (!11T.A0O(this.A02, hsn.A02) || !11T.A0O(this.A03, hsn.A03) || this.A00 != hsn.A00 || !11T.A0O(this.A06, hsn.A06) || !11T.A0O(this.A04, hsn.A04) || !11T.A0O(this.A07, hsn.A07) || this.A05 != hsn.A05 || !"MESSENGER_INTERFACE".equals("MESSENGER_INTERFACE") || this.A01 != hsn.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A07, C1pq.A04(this.A04, (C1pq.A04(this.A06, ((C1pq.A04(this.A03, C1pq.A03(this.A02)) * 31) + this.A00) * 31) * 31 * 31) + 1237));
        int A042 = (((A04 * 31) + C3o5.A04(this.A05)) * 31) + "MESSENGER_INTERFACE".hashCode();
        return (A042 * 31) + this.A01.ordinal();
    }
}
