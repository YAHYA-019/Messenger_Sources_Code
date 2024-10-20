package com.facebook.graphql.enums;

/* loaded from: GraphQLVideoChannelCurationType.class */
public enum GraphQLVideoChannelCurationType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    INTERNAL("INTERNAL"),
    /* JADX INFO: Fake field, exist only in values array */
    USER("USER");

    public final String serverValue;

    GraphQLVideoChannelCurationType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
