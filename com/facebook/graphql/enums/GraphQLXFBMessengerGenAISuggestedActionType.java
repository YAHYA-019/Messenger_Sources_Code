package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBMessengerGenAISuggestedActionType.class */
public enum GraphQLXFBMessengerGenAISuggestedActionType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    APP_DEEPLINK("APP_DEEPLINK"),
    /* JADX INFO: Fake field, exist only in values array */
    OPEN_AI_STICKERS_INTENT("OPEN_AI_STICKERS_INTENT"),
    /* JADX INFO: Fake field, exist only in values array */
    OPEN_AI_THEMES_INTENT("OPEN_AI_THEMES_INTENT"),
    /* JADX INFO: Fake field, exist only in values array */
    OPEN_IMAGINE_INTENT("OPEN_IMAGINE_INTENT"),
    /* JADX INFO: Fake field, exist only in values array */
    OPEN_VOICE_INTENT("OPEN_VOICE_INTENT"),
    /* JADX INFO: Fake field, exist only in values array */
    OPEN_WRITE_WITH_AI_INTENT("OPEN_WRITE_WITH_AI_INTENT"),
    /* JADX INFO: Fake field, exist only in values array */
    SEND_TO_META_AI_THREAD("SEND_TO_META_AI_THREAD");

    public final String serverValue;

    GraphQLXFBMessengerGenAISuggestedActionType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
