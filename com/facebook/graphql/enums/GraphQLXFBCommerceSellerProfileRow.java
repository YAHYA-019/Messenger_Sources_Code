package com.facebook.graphql.enums;

import com.facebook.acra.constants.ReportField;

/* loaded from: GraphQLXFBCommerceSellerProfileRow.class */
public enum GraphQLXFBCommerceSellerProfileRow {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    INFO("INFO"),
    PHOTO("PHOTO"),
    PRIVACY("PRIVACY"),
    PRODUCT(ReportField.PRODUCT);

    public final String serverValue;

    GraphQLXFBCommerceSellerProfileRow(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
