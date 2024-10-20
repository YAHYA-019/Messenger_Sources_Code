package X;

import java.util.Collections;
import java.util.Set;

/* loaded from: C9G.class */
public final class C9G {
    public static volatile String A09;
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final String A06;
    public final String A07;
    public final Set A08;

    public C9G(String str, String str2, String str3, String str4, String str5, String str6, Set set, long j, boolean z) {
        this.A01 = str;
        C1pq.A08("imageUrl", str2);
        this.A02 = str2;
        this.A05 = z;
        this.A00 = j;
        C1pq.A08("price", str3);
        this.A03 = str3;
        this.A06 = str4;
        AbF.A1V(str5);
        this.A04 = str5;
        this.A07 = str6;
        this.A08 = Collections.unmodifiableSet(set);
    }

    public String A00() {
        if (this.A08.contains("reviewStatus")) {
            return this.A06;
        }
        if (A09 == null) {
            synchronized (this) {
                if (A09 == null) {
                    A09 = "";
                }
            }
        }
        return A09;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9G)) {
                return false;
            }
            C9G c9g = (C9G) obj;
            if (!11T.A0O(this.A01, c9g.A01) || !11T.A0O(this.A02, c9g.A02) || this.A05 != c9g.A05 || this.A00 != c9g.A00 || !11T.A0O(this.A03, c9g.A03) || !11T.A0O(A00(), c9g.A00()) || !11T.A0O(this.A04, c9g.A04) || !11T.A0O(this.A07, c9g.A07)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A07, C1pq.A04(this.A04, C1pq.A04(A00(), C1pq.A04(this.A03, C1pq.A01(C1pq.A02(C1pq.A04(this.A02, C1pq.A03(this.A01)), this.A05), this.A00)))));
    }
}
