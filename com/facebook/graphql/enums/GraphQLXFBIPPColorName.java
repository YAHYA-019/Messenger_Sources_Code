package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBIPPColorName.class */
public enum GraphQLXFBIPPColorName {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    BLUE("BLUE"),
    /* JADX INFO: Fake field, exist only in values array */
    GREEN("GREEN"),
    /* JADX INFO: Fake field, exist only in values array */
    ORANGE("ORANGE"),
    /* JADX INFO: Fake field, exist only in values array */
    RED("RED");

    public final String serverValue;

    GraphQLXFBIPPColorName(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
