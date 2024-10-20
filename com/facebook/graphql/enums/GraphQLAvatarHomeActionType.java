package com.facebook.graphql.enums;

/* loaded from: GraphQLAvatarHomeActionType.class */
public enum GraphQLAvatarHomeActionType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    PROFILE_PICTURE("EDITOR"),
    /* JADX INFO: Fake field, exist only in values array */
    PROFILE_PICTURE("EDITOR_OUTFIT"),
    /* JADX INFO: Fake field, exist only in values array */
    PROFILE_PICTURE("EDITOR_WORKPLACE"),
    /* JADX INFO: Fake field, exist only in values array */
    PROFILE_PICTURE("FEELING"),
    /* JADX INFO: Fake field, exist only in values array */
    PROFILE_PICTURE("PROFILE_PICTURE"),
    SATP("SATP"),
    /* JADX INFO: Fake field, exist only in values array */
    SHARE_TO_FEED("SHARE_TO_FEED"),
    /* JADX INFO: Fake field, exist only in values array */
    STICKERS("STICKERS");

    public final String serverValue;

    GraphQLAvatarHomeActionType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
