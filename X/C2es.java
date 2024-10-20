package X;

import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.2es, reason: invalid class name */
/* loaded from: 2es.class */
public final class C2es {
    public static volatile ImmutableList A0I;
    public static volatile ImmutableList A0J;
    public static volatile ImmutableList A0K;
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final Long A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final ImmutableList A0E;
    public final ImmutableList A0F;
    public final ImmutableList A0G;
    public final Set A0H;

    public C2es(ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, Integer num, Integer num2, Integer num3, Integer num4, Long l, String str, Set set, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A00 = num;
        this.A04 = l;
        this.A0E = immutableList;
        this.A0F = immutableList2;
        this.A0G = immutableList3;
        this.A06 = z;
        this.A07 = z2;
        this.A08 = z3;
        this.A09 = z4;
        this.A0A = z5;
        this.A0B = z6;
        C1pq.A08("maxResults", num2);
        this.A01 = num2;
        C1pq.A08("minimumAuthorityLevel", num3);
        this.A02 = num3;
        this.A03 = num4;
        this.A0C = z7;
        this.A0D = z8;
        this.A05 = str;
        this.A0H = Collections.unmodifiableSet(set);
    }

    public ImmutableList A00() {
        if (this.A0H.contains("contactExactTypes")) {
            return this.A0E;
        }
        if (A0I == null) {
            synchronized (this) {
                if (A0I == null) {
                    A0I = ImmutableList.of();
                }
            }
        }
        return A0I;
    }

    public ImmutableList A01() {
        if (this.A0H.contains("contactIdsToExclude")) {
            return this.A0F;
        }
        if (A0J == null) {
            synchronized (this) {
                if (A0J == null) {
                    A0J = ImmutableList.of();
                }
            }
        }
        return A0J;
    }

    public ImmutableList A02() {
        if (this.A0H.contains("contactIdsToInclude")) {
            return this.A0G;
        }
        if (A0K == null) {
            synchronized (this) {
                if (A0K == null) {
                    A0K = ImmutableList.of();
                }
            }
        }
        return A0K;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2es)) {
                return false;
            }
            C2es c2es = (C2es) obj;
            if (!11T.A0O(this.A00, c2es.A00) || !11T.A0O(this.A04, c2es.A04) || !11T.A0O(A00(), c2es.A00()) || !11T.A0O(A01(), c2es.A01()) || !11T.A0O(A02(), c2es.A02()) || this.A06 != c2es.A06 || this.A07 != c2es.A07 || this.A08 != c2es.A08 || this.A09 != c2es.A09 || this.A0A != c2es.A0A || this.A0B != c2es.A0B || !11T.A0O(this.A01, c2es.A01) || !11T.A0O(this.A02, c2es.A02) || !"".equals("") || !11T.A0O(this.A03, c2es.A03) || this.A0C != c2es.A0C || this.A0D != c2es.A0D || !11T.A0O(this.A05, c2es.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, C1pq.A02(C1pq.A02(C1pq.A04(this.A03, 1BK.A03("", C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A02(C1pq.A02(C1pq.A02((C1pq.A02(C1pq.A02(C1pq.A02((C1pq.A04(A02(), C1pq.A04(A01(), C1pq.A04(A00(), C1pq.A04(this.A04, C1pq.A03(this.A00))))) * 31) + 1237, this.A06), this.A07), this.A08) * 31) + 1237, this.A09), this.A0A), this.A0B))) * 31)), this.A0C), this.A0D));
    }
}
