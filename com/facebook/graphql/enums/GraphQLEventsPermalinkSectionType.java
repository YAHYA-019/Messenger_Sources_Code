package com.facebook.graphql.enums;

/* loaded from: GraphQLEventsPermalinkSectionType.class */
public enum GraphQLEventsPermalinkSectionType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    ABOUT("ABOUT"),
    /* JADX INFO: Fake field, exist only in values array */
    COMPOSER("COMPOSER"),
    /* JADX INFO: Fake field, exist only in values array */
    DISCUSSION("DISCUSSION"),
    /* JADX INFO: Fake field, exist only in values array */
    FEED_LIST("FEED_LIST"),
    /* JADX INFO: Fake field, exist only in values array */
    NT_CARD_LIST("NT_CARD_LIST");

    public final String serverValue;

    GraphQLEventsPermalinkSectionType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
