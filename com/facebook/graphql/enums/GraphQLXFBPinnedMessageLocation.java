package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBPinnedMessageLocation.class */
public enum GraphQLXFBPinnedMessageLocation {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    THREAD_DETAILS_ONLY("THREAD_DETAILS_ONLY"),
    /* JADX INFO: Fake field, exist only in values array */
    THREAD_VIEW_AND_DETAILS("THREAD_VIEW_AND_DETAILS");

    public final String serverValue;

    GraphQLXFBPinnedMessageLocation(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
