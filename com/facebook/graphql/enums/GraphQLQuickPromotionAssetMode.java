package com.facebook.graphql.enums;

/* loaded from: GraphQLQuickPromotionAssetMode.class */
public enum GraphQLQuickPromotionAssetMode {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    DARK_MODE("DARK_MODE"),
    /* JADX INFO: Fake field, exist only in values array */
    LIGHT_MODE("LIGHT_MODE");

    public final String serverValue;

    GraphQLQuickPromotionAssetMode(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
