package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBGenAIPersonaApps.class */
public enum GraphQLXFBGenAIPersonaApps {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    INSTAGRAM("INSTAGRAM"),
    /* JADX INFO: Fake field, exist only in values array */
    MESSENGER("MESSENGER"),
    /* JADX INFO: Fake field, exist only in values array */
    WHATS_APP("WHATS_APP");

    public final String serverValue;

    GraphQLXFBGenAIPersonaApps(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
