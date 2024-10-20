package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBUEGMediaPlaceholderIconName.class */
public enum GraphQLXFBUEGMediaPlaceholderIconName {
    /* JADX INFO: Fake field, exist only in values array */
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    PHOTO("PHOTO"),
    /* JADX INFO: Fake field, exist only in values array */
    PHOTO_ADD("PHOTO_ADD");

    public final String serverValue;

    GraphQLXFBUEGMediaPlaceholderIconName(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
