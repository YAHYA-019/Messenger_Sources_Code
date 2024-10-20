package com.facebook.graphql.enums;

/* loaded from: GraphQLXCXPShareToSurface.class */
public enum GraphQLXCXPShareToSurface {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    FEED("FEED"),
    /* JADX INFO: Fake field, exist only in values array */
    REELS_DRAFT("MEMORIES"),
    /* JADX INFO: Fake field, exist only in values array */
    REELS_DRAFT("MESSAGING"),
    /* JADX INFO: Fake field, exist only in values array */
    REELS_DRAFT("META_GALLERY"),
    /* JADX INFO: Fake field, exist only in values array */
    REELS_DRAFT("OCULUS_FILES"),
    REELS("REELS"),
    /* JADX INFO: Fake field, exist only in values array */
    REELS_DRAFT("REELS_DRAFT"),
    STORY("STORY");

    public final String serverValue;

    GraphQLXCXPShareToSurface(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
