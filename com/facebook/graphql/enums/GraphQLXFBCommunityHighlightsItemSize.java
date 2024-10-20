package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBCommunityHighlightsItemSize.class */
public enum GraphQLXFBCommunityHighlightsItemSize {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    LARGE("LARGE"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIUM("MEDIUM"),
    /* JADX INFO: Fake field, exist only in values array */
    SMALL("SMALL");

    public final String serverValue;

    GraphQLXFBCommunityHighlightsItemSize(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
