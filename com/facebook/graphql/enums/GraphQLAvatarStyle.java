package com.facebook.graphql.enums;

/* loaded from: GraphQLAvatarStyle.class */
public enum GraphQLAvatarStyle {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    STYLE_1("STYLE_1"),
    /* JADX INFO: Fake field, exist only in values array */
    STYLE_2("STYLE_2");

    public final String serverValue;

    GraphQLAvatarStyle(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
