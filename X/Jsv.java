package X;

import com.fbpay.w3c.CardDetails;

/* loaded from: Jsv.class */
public final class Jsv extends C04v {
    public CardDetails A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final F6i A04;
    public final String A05;

    public Jsv(CardDetails cardDetails, F6i f6i, String str, long j, long j2, long j3) {
        this.A00 = cardDetails;
        this.A04 = f6i;
        this.A01 = j;
        this.A05 = str;
        this.A03 = j2;
        this.A02 = j3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Jsv)) {
                return false;
            }
            Jsv jsv = (Jsv) obj;
            if (!11T.A0O(this.A00, jsv.A00) || !11T.A0O(this.A04, jsv.A04) || this.A01 != jsv.A01 || !11T.A0O(this.A05, jsv.A05) || this.A03 != jsv.A03 || this.A02 != jsv.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A03(this.A02, AnonymousClass002.A02(this.A03, (AnonymousClass002.A02(this.A01, ((AnonymousClass001.A02(this.A00) * 31) + AnonymousClass001.A02(this.A04)) * 31) + 7zN.A05(this.A05)) * 31));
    }
}
