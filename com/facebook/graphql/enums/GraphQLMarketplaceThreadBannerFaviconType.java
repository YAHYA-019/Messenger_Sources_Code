package com.facebook.graphql.enums;

/* loaded from: GraphQLMarketplaceThreadBannerFaviconType.class */
public enum GraphQLMarketplaceThreadBannerFaviconType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    BSG("BSG"),
    /* JADX INFO: Fake field, exist only in values array */
    MARKETPLACE("MARKETPLACE");

    public final String serverValue;

    GraphQLMarketplaceThreadBannerFaviconType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
