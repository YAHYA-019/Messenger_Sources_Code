package com.facebook.graphql.enums;

/* loaded from: GraphQLCommentAttachmentType.class */
public enum GraphQLCommentAttachmentType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    AUTHORITATIVE_FACT("AUTHORITATIVE_FACT"),
    /* JADX INFO: Fake field, exist only in values array */
    COMPASS_UNIT("COMPASS_UNIT"),
    /* JADX INFO: Fake field, exist only in values array */
    FILE("FILE"),
    /* JADX INFO: Fake field, exist only in values array */
    GIF("GIF"),
    /* JADX INFO: Fake field, exist only in values array */
    LINK("LINK"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE("NONE"),
    /* JADX INFO: Fake field, exist only in values array */
    PHOTO("PHOTO"),
    /* JADX INFO: Fake field, exist only in values array */
    STICKER("STICKER"),
    /* JADX INFO: Fake field, exist only in values array */
    VIDEO("VIDEO");

    public final String serverValue;

    GraphQLCommentAttachmentType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
