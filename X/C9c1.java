package X;

import com.facebook.payments.currency.CurrencyAmount;
import com.google.common.collect.ImmutableList;

/* renamed from: X.9c1, reason: invalid class name */
/* loaded from: 9c1.class */
public final class C9c1 {
    public final int A00;
    public final CurrencyAmount A01;
    public final ImmutableList A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C9c1(CurrencyAmount currencyAmount, ImmutableList immutableList, String str, String str2, String str3, String str4, int i) {
        this.A03 = str;
        this.A04 = str2;
        C1pq.A08("imageUrls", immutableList);
        this.A02 = immutableList;
        this.A05 = str3;
        this.A00 = i;
        this.A06 = str4;
        this.A01 = currencyAmount;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9c1)) {
                return false;
            }
            C9c1 c9c1 = (C9c1) obj;
            if (!11T.A0O(this.A03, c9c1.A03) || !11T.A0O(this.A04, c9c1.A04) || !11T.A0O(this.A02, c9c1.A02) || !11T.A0O(this.A05, c9c1.A05) || this.A00 != c9c1.A00 || !11T.A0O(this.A06, c9c1.A06) || !11T.A0O(this.A01, c9c1.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A04(this.A06, (C1pq.A04(this.A05, C1pq.A04(this.A02, C1pq.A04(this.A04, C1pq.A03(this.A03)))) * 31) + this.A00));
    }
}
