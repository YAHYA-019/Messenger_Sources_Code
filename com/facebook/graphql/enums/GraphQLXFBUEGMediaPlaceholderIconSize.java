package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBUEGMediaPlaceholderIconSize.class */
public enum GraphQLXFBUEGMediaPlaceholderIconSize {
    /* JADX INFO: Fake field, exist only in values array */
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    DP20("DP20"),
    /* JADX INFO: Fake field, exist only in values array */
    DP32("DP32");

    public final String serverValue;

    GraphQLXFBUEGMediaPlaceholderIconSize(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
