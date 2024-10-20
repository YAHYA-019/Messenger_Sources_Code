package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBCommerceSellerProfileTreatmentGroup.class */
public enum GraphQLXFBCommerceSellerProfileTreatmentGroup {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    ALL_SIGNALS("ALL_SIGNALS"),
    CONTROL_GROUP("CONTROL_GROUP"),
    EXCLUDED_FROM_EXPERIMENT("EXCLUDED_FROM_EXPERIMENT"),
    /* JADX INFO: Fake field, exist only in values array */
    PRODUCT_INFO("INFO_FRIENDED_FANS"),
    INFO_ONLY("INFO_ONLY"),
    /* JADX INFO: Fake field, exist only in values array */
    PRODUCT_INFO("INFO_PHOTO"),
    /* JADX INFO: Fake field, exist only in values array */
    PRODUCT_INFO("PHOTOS_ONLY"),
    /* JADX INFO: Fake field, exist only in values array */
    PRODUCT_INFO("PHOTO_INFO"),
    /* JADX INFO: Fake field, exist only in values array */
    PRODUCT_INFO("PHOTO_INFO_COMPACT"),
    /* JADX INFO: Fake field, exist only in values array */
    PRODUCT_INFO("PRODUCT_INFO"),
    RATING_ONLY("RATING_ONLY");

    public final String serverValue;

    GraphQLXFBCommerceSellerProfileTreatmentGroup(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
