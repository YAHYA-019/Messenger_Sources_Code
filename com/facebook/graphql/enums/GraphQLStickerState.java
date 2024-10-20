package com.facebook.graphql.enums;

/* loaded from: GraphQLStickerState.class */
public enum GraphQLStickerState {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    LOCKED("LOCKED"),
    /* JADX INFO: Fake field, exist only in values array */
    UNLOCKED("UNLOCKED");

    public final String serverValue;

    GraphQLStickerState(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
