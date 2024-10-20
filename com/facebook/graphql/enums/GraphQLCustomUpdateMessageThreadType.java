package com.facebook.graphql.enums;

/* loaded from: GraphQLCustomUpdateMessageThreadType.class */
public enum GraphQLCustomUpdateMessageThreadType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    GROUP_THREAD("GROUP_THREAD"),
    /* JADX INFO: Fake field, exist only in values array */
    ONE_TO_ONE_THREAD("ONE_TO_ONE_THREAD");

    public final String serverValue;

    GraphQLCustomUpdateMessageThreadType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
