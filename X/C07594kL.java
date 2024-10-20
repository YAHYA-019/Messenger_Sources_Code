package X;

/* renamed from: X.4kL, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4kL.class */
public final class C07594kL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final Integer A06;
    public final Long A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B = true;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final long A0R;
    public final long A0S;

    public C07594kL(Integer num, Long l, String str, int i, int i2, int i3, int i4, long j, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.A09 = z;
        this.A05 = j;
        this.A00 = i;
        this.A01 = i2;
        this.A0A = z2;
        this.A0C = z3;
        this.A0D = z4;
        this.A0E = z5;
        this.A02 = i3;
        C1pq.A08("msysThreadKey", str);
        this.A08 = str;
        this.A03 = i4;
        this.A04 = 1000;
        this.A0R = j2;
        this.A06 = num;
        this.A0F = true;
        this.A0G = true;
        this.A0H = z6;
        this.A0I = true;
        this.A0J = z7;
        this.A0K = true;
        this.A0L = z8;
        this.A0M = z9;
        this.A0N = true;
        this.A0O = true;
        this.A0P = z10;
        this.A0Q = z11;
        this.A07 = l;
        this.A0S = j3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C07594kL)) {
                return false;
            }
            C07594kL c07594kL = (C07594kL) obj;
            if (this.A09 != c07594kL.A09 || this.A05 != c07594kL.A05 || this.A00 != c07594kL.A00 || this.A01 != c07594kL.A01 || this.A0A != c07594kL.A0A || this.A0C != c07594kL.A0C || this.A0D != c07594kL.A0D || this.A0E != c07594kL.A0E || this.A02 != c07594kL.A02 || !11T.A0O(this.A08, c07594kL.A08) || !"".equals("") || this.A03 != c07594kL.A03 || this.A0R != c07594kL.A0R || !11T.A0O(this.A06, c07594kL.A06) || this.A0H != c07594kL.A0H || this.A0J != c07594kL.A0J || this.A0L != c07594kL.A0L || this.A0M != c07594kL.A0M || this.A0P != c07594kL.A0P || this.A0Q != c07594kL.A0Q || !11T.A0O(this.A07, c07594kL.A07) || this.A0S != c07594kL.A0S) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A01(C1pq.A04(this.A07, C1pq.A02(C1pq.A02((((C1pq.A02(C1pq.A02((C1pq.A02((C1pq.A02((((C1pq.A04(this.A06, C1pq.A01((((1BK.A03("", C1pq.A04(this.A08, ((((C1pq.A02(C1pq.A02(C1pq.A02((C1pq.A02((((C1pq.A01((C1pq.A05(this.A09) * 31) + 1237, this.A05) * 31) + this.A00) * 31) + this.A01, this.A0A) * 31) + 1231, this.A0C), this.A0D), this.A0E) * 31) + 1237) * 31) + this.A02) * 31) * 31) * 31) + this.A03) * 31) + 1000, this.A0R)) * 31) + 1231) * 31) + 1231, this.A0H) * 31) + 1231, this.A0J) * 31) + 1231, this.A0L), this.A0M) * 31) + 1231) * 31) + 1231, this.A0P), this.A0Q)), this.A0S);
    }
}
