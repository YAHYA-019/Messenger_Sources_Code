package X;

import com.facebook.graphql.enums.GraphQLXFBLeadOutcomesVerticalFormType;

/* renamed from: X.Art, reason: case insensitive filesystem */
/* loaded from: Art.class */
public final class C1759Art extends C04v {
    public final GraphQLXFBLeadOutcomesVerticalFormType A00;
    public final boolean A01;
    public final String A02;

    public C1759Art(GraphQLXFBLeadOutcomesVerticalFormType graphQLXFBLeadOutcomesVerticalFormType, String str, boolean z) {
        this.A02 = str;
        this.A01 = z;
        this.A00 = graphQLXFBLeadOutcomesVerticalFormType;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1759Art)) {
                return false;
            }
            C1759Art c1759Art = (C1759Art) obj;
            if (!11T.A0O(this.A02, c1759Art.A02) || this.A01 != c1759Art.A01 || this.A00 != c1759Art.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, ((1BL.A05(this.A02) * 31) + AnonymousClass002.A00(this.A01 ? 1 : 0)) * 31);
    }
}
