package com.facebook.graphql.enums;

/* loaded from: GraphQLGIFSource.class */
public enum GraphQLGIFSource {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    GIPHY("GIPHY"),
    /* JADX INFO: Fake field, exist only in values array */
    TENOR("TENOR");

    public final String serverValue;

    GraphQLGIFSource(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
