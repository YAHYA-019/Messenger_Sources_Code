package X;

/* loaded from: Fdc.class */
public final class Fdc implements GCb {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public Fdc(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2) {
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A06 = str5;
        this.A00 = i;
        this.A01 = i2;
        this.A07 = str6;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Fdc)) {
                return false;
            }
            Fdc fdc = (Fdc) obj;
            if (!11T.A0O(this.A02, fdc.A02) || !11T.A0O(this.A03, fdc.A03) || !11T.A0O(this.A04, fdc.A04) || !11T.A0O(this.A05, fdc.A05) || !11T.A0O(this.A06, fdc.A06) || this.A00 != fdc.A00 || this.A01 != fdc.A01 || !11T.A0O(this.A07, fdc.A07)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A07, (((C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A03(this.A02))))) * 31) + this.A00) * 31) + this.A01);
    }
}
