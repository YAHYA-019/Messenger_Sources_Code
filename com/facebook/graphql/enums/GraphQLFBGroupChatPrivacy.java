package com.facebook.graphql.enums;

/* loaded from: GraphQLFBGroupChatPrivacy.class */
public enum GraphQLFBGroupChatPrivacy {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    ADMIN_AND_MODS_ONLY("ADMIN_AND_MODS_ONLY"),
    /* JADX INFO: Fake field, exist only in values array */
    ADMIN_ONLY("ADMIN_ONLY"),
    /* JADX INFO: Fake field, exist only in values array */
    BROADCAST("BROADCAST"),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE("PRIVATE"),
    /* JADX INFO: Fake field, exist only in values array */
    PUBLIC("PUBLIC"),
    /* JADX INFO: Fake field, exist only in values array */
    SUPPORTERS_ONLY("SUPPORTERS_ONLY");

    public final String serverValue;

    GraphQLFBGroupChatPrivacy(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
