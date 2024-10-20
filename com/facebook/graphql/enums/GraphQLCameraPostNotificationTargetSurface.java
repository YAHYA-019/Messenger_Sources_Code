package com.facebook.graphql.enums;

/* loaded from: GraphQLCameraPostNotificationTargetSurface.class */
public enum GraphQLCameraPostNotificationTargetSurface {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    CHAT_VIEW("CHAT_VIEW"),
    /* JADX INFO: Fake field, exist only in values array */
    COMMENTS("COMMENTS"),
    /* JADX INFO: Fake field, exist only in values array */
    PAGE_STORY_CONVERSATION("PAGE_STORY_CONVERSATION"),
    /* JADX INFO: Fake field, exist only in values array */
    STORY_ARCHIVE_SETTING("STORY_ARCHIVE_SETTING"),
    /* JADX INFO: Fake field, exist only in values array */
    STORY_MEDIA("STORY_MEDIA"),
    /* JADX INFO: Fake field, exist only in values array */
    STORY_REPLY_IN_BLUE("STORY_REPLY_IN_BLUE"),
    /* JADX INFO: Fake field, exist only in values array */
    VIEWER_SHEET("VIEWER_SHEET");

    public final String serverValue;

    GraphQLCameraPostNotificationTargetSurface(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
