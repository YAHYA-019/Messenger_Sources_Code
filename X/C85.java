package X;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

/* loaded from: C85.class */
public final class C85 {
    public final C7M A00;
    public final ImmutableList A01;
    public final ImmutableMap A02;
    public final String A03;
    public final boolean A04;

    public C85(BvA bvA) {
        ImmutableList immutableList = bvA.A01;
        C1pq.A08("blockListItems", immutableList);
        this.A01 = immutableList;
        this.A00 = bvA.A00;
        ImmutableMap immutableMap = bvA.A02;
        C1pq.A08("inProgressStateMap", immutableMap);
        this.A02 = immutableMap;
        this.A04 = bvA.A04;
        String str = bvA.A03;
        C1pq.A08("pageTitle", str);
        this.A03 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C85)) {
                return false;
            }
            C85 c85 = (C85) obj;
            if (!11T.A0O(this.A01, c85.A01) || !11T.A0O(this.A00, c85.A00) || !11T.A0O(this.A02, c85.A02) || this.A04 != c85.A04 || !11T.A0O(this.A03, c85.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A02(C1pq.A04(this.A02, C1pq.A04(this.A00, C1pq.A03(this.A01))), this.A04));
    }
}
