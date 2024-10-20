package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.784, reason: invalid class name */
/* loaded from: 784.class */
public final class AnonymousClass784 implements C6xq {
    public final int A00;
    public final int A01;
    public final ImmutableList A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public AnonymousClass784(AnonymousClass783 anonymousClass783) {
        this.A05 = anonymousClass783.A05;
        this.A06 = anonymousClass783.A06;
        this.A07 = anonymousClass783.A07;
        this.A00 = anonymousClass783.A00;
        this.A08 = anonymousClass783.A08;
        String str = anonymousClass783.A03;
        C1pq.A08("stickerImpressionId", str);
        this.A03 = str;
        String str2 = anonymousClass783.A04;
        C1pq.A08("stickerRankingId", str2);
        this.A04 = str2;
        ImmutableList immutableList = anonymousClass783.A02;
        C1pq.A08("stickerTabs", immutableList);
        this.A02 = immutableList;
        this.A01 = anonymousClass783.A01;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass784)) {
                return false;
            }
            AnonymousClass784 anonymousClass784 = (AnonymousClass784) obj;
            if (this.A05 != anonymousClass784.A05 || this.A06 != anonymousClass784.A06 || this.A07 != anonymousClass784.A07 || this.A00 != anonymousClass784.A00 || this.A08 != anonymousClass784.A08 || !11T.A0O(this.A03, anonymousClass784.A03) || !11T.A0O(this.A04, anonymousClass784.A04) || !11T.A0O(this.A02, anonymousClass784.A02) || this.A01 != anonymousClass784.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A04(this.A02, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A02((C1pq.A02(C1pq.A02(C1pq.A05(this.A05), this.A06), this.A07) * 31) + this.A00, this.A08)))) * 31) + this.A01;
    }
}
