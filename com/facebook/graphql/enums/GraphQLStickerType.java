package com.facebook.graphql.enums;

/* loaded from: GraphQLStickerType.class */
public enum GraphQLStickerType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    AVATAR("AVATAR"),
    AVATAR_AI_GENERATED("AVATAR_AI_GENERATED"),
    AVATAR_STUDIO("AVATAR_STUDIO"),
    CUSTOM("CUSTOM"),
    PAIR_AI_GENERATED("PAIR_AI_GENERATED"),
    REGULAR("REGULAR");

    public final String serverValue;

    GraphQLStickerType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
