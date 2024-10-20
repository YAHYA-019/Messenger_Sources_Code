package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBUEGMediaPlaceholderIconVariant.class */
public enum GraphQLXFBUEGMediaPlaceholderIconVariant {
    /* JADX INFO: Fake field, exist only in values array */
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    FILLED("FILLED"),
    /* JADX INFO: Fake field, exist only in values array */
    OUTLINE("OUTLINE");

    public final String serverValue;

    GraphQLXFBUEGMediaPlaceholderIconVariant(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
