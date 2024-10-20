package com.facebook.graphql.enums;

/* loaded from: GraphQLFXSharedServiceStatus.class */
public enum GraphQLFXSharedServiceStatus {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_SET_UP("NOT_SET_UP"),
    /* JADX INFO: Fake field, exist only in values array */
    SET_UP_AND_DISABLED("SET_UP_AND_DISABLED"),
    /* JADX INFO: Fake field, exist only in values array */
    SET_UP_AND_ENABLED("SET_UP_AND_ENABLED");

    public final String serverValue;

    GraphQLFXSharedServiceStatus(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
