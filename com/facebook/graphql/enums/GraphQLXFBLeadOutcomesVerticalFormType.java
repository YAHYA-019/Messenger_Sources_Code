package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBLeadOutcomesVerticalFormType.class */
public enum GraphQLXFBLeadOutcomesVerticalFormType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    BOOK_NOW("BOOK_NOW"),
    GET_QUOTE("GET_QUOTE");

    public final String serverValue;

    GraphQLXFBLeadOutcomesVerticalFormType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
