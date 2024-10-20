package com.facebook.graphql.enums;

/* loaded from: GraphQLEventWatchStatus.class */
public enum GraphQLEventWatchStatus {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    DECLINED("DECLINED"),
    /* JADX INFO: Fake field, exist only in values array */
    GOING("GOING"),
    /* JADX INFO: Fake field, exist only in values array */
    GOING_ALL("GOING_ALL"),
    /* JADX INFO: Fake field, exist only in values array */
    UNWATCHED("UNWATCHED"),
    /* JADX INFO: Fake field, exist only in values array */
    WATCHED("WATCHED"),
    /* JADX INFO: Fake field, exist only in values array */
    WATCHED_ALL("WATCHED_ALL");

    public final String serverValue;

    GraphQLEventWatchStatus(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
