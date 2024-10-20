package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBGenAIVoiceCategory.class */
public enum GraphQLXFBGenAIVoiceCategory {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOM("CUSTOM"),
    /* JADX INFO: Fake field, exist only in values array */
    META_AI_VOICE("META_AI_VOICE"),
    /* JADX INFO: Fake field, exist only in values array */
    PUBLIC_FIGURE("PUBLIC_FIGURE");

    public final String serverValue;

    GraphQLXFBGenAIVoiceCategory(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
