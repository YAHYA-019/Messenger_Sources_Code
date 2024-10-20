package com.facebook.graphql.enums;

/* loaded from: GraphQLGamesInstantPlaySupportedOrientation.class */
public enum GraphQLGamesInstantPlaySupportedOrientation {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    LANDSCAPE("LANDSCAPE"),
    PORTRAIT("PORTRAIT"),
    /* JADX INFO: Fake field, exist only in values array */
    PORTRAIT_LANDSCAPE("PORTRAIT_LANDSCAPE"),
    /* JADX INFO: Fake field, exist only in values array */
    RESPONSIVE("RESPONSIVE");

    public final String serverValue;

    GraphQLGamesInstantPlaySupportedOrientation(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
