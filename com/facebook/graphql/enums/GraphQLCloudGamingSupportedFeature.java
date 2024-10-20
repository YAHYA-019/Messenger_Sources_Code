package com.facebook.graphql.enums;

/* loaded from: GraphQLCloudGamingSupportedFeature.class */
public enum GraphQLCloudGamingSupportedFeature {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    SHORTCUT("CANVAS_HYBRID_GAME_TYPE_SWAP"),
    /* JADX INFO: Fake field, exist only in values array */
    SHORTCUT("CLOSE"),
    /* JADX INFO: Fake field, exist only in values array */
    SHORTCUT("FAVORITE"),
    /* JADX INFO: Fake field, exist only in values array */
    SHORTCUT("GAME_BOT_SUBSCRIPTION"),
    /* JADX INFO: Fake field, exist only in values array */
    SHORTCUT("MULTI_TOUCH_OVERLAY"),
    /* JADX INFO: Fake field, exist only in values array */
    SHORTCUT("PLAYER_INVITE_BUTTON"),
    /* JADX INFO: Fake field, exist only in values array */
    SHORTCUT("SHORTCUT"),
    TAKE_SCREENSHOT("TAKE_SCREENSHOT");

    public final String serverValue;

    GraphQLCloudGamingSupportedFeature(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
