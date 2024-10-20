package X;

/* loaded from: DqG.class */
public final class DqG extends C04v {
    public final int A00 = 0;
    public final int A01;
    public final int A02;
    public final long A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public DqG(String str, String str2, String str3, int i, int i2, int i3, long j) {
        1BK.A1K(str, 1, str2);
        11T.A0F(str3, 6);
        this.A06 = str;
        this.A01 = i;
        this.A02 = i2;
        this.A04 = str2;
        this.A03 = j;
        this.A05 = str3;
    }

    public DqG(String str, String str2, String str3, int i, int i2, long j) {
        11T.A0F(str, 1);
        this.A06 = str;
        this.A02 = i;
        this.A01 = i2;
        this.A03 = j;
        this.A04 = str2;
        this.A05 = str3;
    }

    public boolean equals(Object obj) {
        DqG dqG;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DqG)) {
                return false;
            }
            dqG = (DqG) obj;
            if (dqG.A00 != 1 || !11T.A0O(this.A06, dqG.A06) || this.A02 != dqG.A02 || this.A01 != dqG.A01 || this.A03 != dqG.A03 || !11T.A0O(this.A04, dqG.A04)) {
                return false;
            }
        } else {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DqG)) {
                return false;
            }
            dqG = (DqG) obj;
            if (dqG.A00 != 0 || !11T.A0O(this.A06, dqG.A06) || this.A01 != dqG.A01 || this.A02 != dqG.A02 || !11T.A0O(this.A04, dqG.A04) || this.A03 != dqG.A03) {
                return false;
            }
        }
        return 11T.A0O(this.A05, dqG.A05);
    }

    public int hashCode() {
        int A02;
        String str;
        int hashCode;
        int i = this.A00;
        String str2 = this.A06;
        if (i != 0) {
            A02 = AnonymousClass002.A07(this.A04, AnonymousClass002.A02(this.A03, (((4YV.A02(str2) + this.A02) * 31) + this.A01) * 31));
            str = this.A05;
            if (str == null) {
                hashCode = 0;
                return A02 + hashCode;
            }
        } else {
            A02 = AnonymousClass002.A02(this.A03, AnonymousClass002.A07(this.A04, (((4YV.A02(str2) + this.A01) * 31) + this.A02) * 31));
            str = this.A05;
        }
        hashCode = str.hashCode();
        return A02 + hashCode;
    }

    public String toString() {
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("DcpSubscriptionOffer(period=");
        A0k.append(this.A06);
        A0k.append(", periodValue=");
        A0k.append(this.A02);
        A0k.append(", periodCount=");
        A0k.append(this.A01);
        A0k.append(JQw.A00(41));
        A0k.append(this.A03);
        A0k.append(", formattedPrice=");
        A0k.append(this.A04);
        A0k.append(", offerId=");
        return DKH.A0o(this.A05, A0k);
    }
}
