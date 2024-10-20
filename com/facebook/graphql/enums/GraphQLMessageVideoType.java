package com.facebook.graphql.enums;

/* loaded from: GraphQLMessageVideoType.class */
public enum GraphQLMessageVideoType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    FILE_ATTACHMENT("FILE_ATTACHMENT"),
    /* JADX INFO: Fake field, exist only in values array */
    SPEAKING_STICKER("IG_SELFIE_STICKER"),
    /* JADX INFO: Fake field, exist only in values array */
    SPEAKING_STICKER("OPEN_EB"),
    RECORDED_STICKER("RECORDED_STICKER"),
    RECORDED_VIDEO("RECORDED_VIDEO"),
    /* JADX INFO: Fake field, exist only in values array */
    SPEAKING_STICKER("SPATIAL_SIDE_BY_SIDE"),
    /* JADX INFO: Fake field, exist only in values array */
    SPEAKING_STICKER("SPEAKING_STICKER"),
    VIDEO_MAIL("VIDEO_MAIL");

    public final String serverValue;

    GraphQLMessageVideoType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
