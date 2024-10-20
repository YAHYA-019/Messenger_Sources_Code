package com.facebook.graphql.enums;

/* loaded from: GraphQLCommercePageType.class */
public enum GraphQLCommercePageType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    COMMERCE_PAGE_TYPE_AGENT("COMMERCE_PAGE_TYPE_AGENT"),
    /* JADX INFO: Fake field, exist only in values array */
    COMMERCE_PAGE_TYPE_AIRLINE("COMMERCE_PAGE_TYPE_AIRLINE"),
    /* JADX INFO: Fake field, exist only in values array */
    COMMERCE_PAGE_TYPE_BANK("COMMERCE_PAGE_TYPE_BANK"),
    /* JADX INFO: Fake field, exist only in values array */
    COMMERCE_PAGE_TYPE_BUSINESS("COMMERCE_PAGE_TYPE_BUSINESS"),
    /* JADX INFO: Fake field, exist only in values array */
    COMMERCE_PAGE_TYPE_MESSENGER_EXTENSION("COMMERCE_PAGE_TYPE_MESSENGER_EXTENSION"),
    /* JADX INFO: Fake field, exist only in values array */
    COMMERCE_PAGE_TYPE_NONE("COMMERCE_PAGE_TYPE_NONE"),
    /* JADX INFO: Fake field, exist only in values array */
    COMMERCE_PAGE_TYPE_RIDE_SHARE("COMMERCE_PAGE_TYPE_RIDE_SHARE");

    public final String serverValue;

    GraphQLCommercePageType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
