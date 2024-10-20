package com.facebook.graphql.enums;

/* loaded from: GraphQLChatroomLandingPage.class */
public enum GraphQLChatroomLandingPage {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    ADD_PEOPLE("ADD_PEOPLE"),
    /* JADX INFO: Fake field, exist only in values array */
    JOIN_REQUESTS("JOIN_REQUESTS"),
    /* JADX INFO: Fake field, exist only in values array */
    THREAD_VIEW("THREAD_VIEW");

    public final String serverValue;

    GraphQLChatroomLandingPage(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
