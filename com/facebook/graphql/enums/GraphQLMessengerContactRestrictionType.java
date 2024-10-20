package com.facebook.graphql.enums;

/* loaded from: GraphQLMessengerContactRestrictionType.class */
public enum GraphQLMessengerContactRestrictionType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_PRIVACY("DATA_PRIVACY"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE("NONE");

    public final String serverValue;

    GraphQLMessengerContactRestrictionType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
