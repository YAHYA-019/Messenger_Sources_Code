package com.facebook.graphql.enums;

/* loaded from: GraphQLMessageReactionStyle.class */
public enum GraphQLMessageReactionStyle {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    BASIC_SUPER_REACT_ANIMATION("BASIC_SUPER_REACT_ANIMATION");

    public final String serverValue;

    GraphQLMessageReactionStyle(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
