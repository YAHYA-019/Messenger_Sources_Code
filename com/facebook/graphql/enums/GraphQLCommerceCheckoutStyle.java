package com.facebook.graphql.enums;

/* loaded from: GraphQLCommerceCheckoutStyle.class */
public enum GraphQLCommerceCheckoutStyle {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTACT_MERCHANT("CONTACT_MERCHANT"),
    /* JADX INFO: Fake field, exist only in values array */
    OFFSITE_IAB_CHECKOUT("OFFSITE_IAB_CHECKOUT"),
    /* JADX INFO: Fake field, exist only in values array */
    OFFSITE_LINK("OFFSITE_LINK"),
    /* JADX INFO: Fake field, exist only in values array */
    ONSITE_CHECKOUT("ONSITE_CHECKOUT");

    public final String serverValue;

    GraphQLCommerceCheckoutStyle(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
