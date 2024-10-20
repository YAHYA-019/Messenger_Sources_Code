package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBMessengerGenAIMediaLayoutType.class */
public enum GraphQLXFBMessengerGenAIMediaLayoutType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    CHAT("CHAT"),
    /* JADX INFO: Fake field, exist only in values array */
    DEFAULT("DEFAULT"),
    /* JADX INFO: Fake field, exist only in values array */
    FACEPILE("FACEPILE"),
    /* JADX INFO: Fake field, exist only in values array */
    LOCATION("LOCATION"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIA_HERO("MEDIA_HERO"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIA_THUMBNAIL("MEDIA_THUMBNAIL"),
    /* JADX INFO: Fake field, exist only in values array */
    NUMERIC("NUMERIC");

    public final String serverValue;

    GraphQLXFBMessengerGenAIMediaLayoutType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
