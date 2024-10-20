package com.facebook.graphql.enums;

/* loaded from: GraphQLGroupRoomType.class */
public enum GraphQLGroupRoomType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    AUDIO_CHANNEL_FOR_CM_CHAT("AUDIO_CHANNEL_FOR_CM_CHAT"),
    CM_AUDIO_CHANNEL("CM_AUDIO_CHANNEL"),
    CM_THREAD_AUDIO("CM_THREAD_AUDIO"),
    GAMING_AUDIO("GAMING_AUDIO"),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE("GROUP_OWNED"),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE("LIVE"),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE("LIVE_AUDIO"),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE("OPEN"),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE("PRIVATE"),
    SPEAKER_ONLY_AUDIO("SPEAKER_ONLY_AUDIO");

    public final String serverValue;

    GraphQLGroupRoomType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
