package X;

import com.facebook.graphql.enums.GraphQLXFBCommerceSellerProfileRow;
import com.facebook.graphql.enums.GraphQLXFBCommerceSellerProfileTreatmentGroup;

/* loaded from: C9m.class */
public abstract class C9m {
    public static final boolean A00(GraphQLXFBCommerceSellerProfileRow graphQLXFBCommerceSellerProfileRow, 2Sh r302) {
        boolean z = false;
        C1275Ace c1275Ace = (C1275Ace) AbH.A14(r302, C1275Ace.class);
        if (c1275Ace != null) {
            z = c1275Ace.A01.contains(graphQLXFBCommerceSellerProfileRow);
        }
        return z;
    }

    public static final boolean A01(2Sh r301) {
        GraphQLXFBCommerceSellerProfileTreatmentGroup graphQLXFBCommerceSellerProfileTreatmentGroup;
        C1275Ace c1275Ace = (C1275Ace) AbH.A14(r301, C1275Ace.class);
        boolean z = true;
        if (c1275Ace != null && (graphQLXFBCommerceSellerProfileTreatmentGroup = c1275Ace.A00) != GraphQLXFBCommerceSellerProfileTreatmentGroup.CONTROL_GROUP && graphQLXFBCommerceSellerProfileTreatmentGroup != GraphQLXFBCommerceSellerProfileTreatmentGroup.EXCLUDED_FROM_EXPERIMENT) {
            z = false;
        }
        return z;
    }
}
