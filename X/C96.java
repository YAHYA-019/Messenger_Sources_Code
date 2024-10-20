package X;

import com.google.common.collect.ImmutableList;

/* loaded from: C96.class */
public final class C96 {
    public final int A00;
    public final int A01;
    public final BP5 A02;
    public final ImmutableList A03;
    public final Integer A04;
    public final boolean A05;
    public final boolean A06;

    public C96(BP5 bp5, ImmutableList immutableList, Integer num, int i, int i2, boolean z, boolean z2) {
        this.A05 = z;
        this.A04 = num;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = immutableList;
        this.A06 = z2;
        this.A02 = bp5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C96)) {
                return false;
            }
            C96 c96 = (C96) obj;
            if (this.A05 != c96.A05 || !11T.A0O(this.A04, c96.A04) || this.A00 != c96.A00 || this.A01 != c96.A01 || !11T.A0O(this.A03, c96.A03) || this.A06 != c96.A06 || this.A02 != c96.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A02 = C1pq.A02(C1pq.A04(this.A03, (((C1pq.A04(this.A04, C1pq.A05(this.A05)) * 31) + this.A00) * 31) + this.A01), this.A06);
        return (A02 * 31) + C3o5.A03(this.A02);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("NullStateInput{excludeRestrictedContacts=");
        A0k.append(this.A05);
        A0k.append(", maxAiBots=");
        A0k.append(this.A04);
        A0k.append(", maxRecentSearches=");
        A0k.append(this.A00);
        A0k.append(", maxSuggestions=");
        A0k.append(this.A01);
        A0k.append(", selectedUsersFbIds=");
        A0k.append(this.A03);
        A0k.append(", showInstagramContacts=");
        A0k.append(this.A06);
        A0k.append(", tabType=");
        A0k.append(this.A02);
        return 1BL.A0v(A0k);
    }
}
