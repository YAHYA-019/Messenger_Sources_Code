package com.facebook.graphql.enums;

/* loaded from: GraphQLConnectionStyle.class */
public enum GraphQLConnectionStyle {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    INTERESTED("INTERESTED"),
    /* JADX INFO: Fake field, exist only in values array */
    RSVP("RSVP");

    public final String serverValue;

    GraphQLConnectionStyle(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
