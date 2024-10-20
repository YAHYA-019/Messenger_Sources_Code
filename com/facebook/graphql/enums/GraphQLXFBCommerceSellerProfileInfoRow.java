package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBCommerceSellerProfileInfoRow.class */
public enum GraphQLXFBCommerceSellerProfileInfoRow {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    ADDRESS("ADDRESS"),
    CMS_ADDRESS("CMS_ADDRESS"),
    CMS_EMAIL("CMS_EMAIL"),
    /* JADX INFO: Fake field, exist only in values array */
    CMS_PHONE("CMS_PHONE"),
    DESCRIPTION("DESCRIPTION"),
    FRIENDED_FANS("FRIENDED_FANS"),
    HOURS("HOURS"),
    LIKES("LIKES"),
    PRICE_RANGE("PRICE_RANGE"),
    RATING("RATING"),
    TENURE("TENURE"),
    WEBSITE("WEBSITE");

    public final String serverValue;

    GraphQLXFBCommerceSellerProfileInfoRow(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
