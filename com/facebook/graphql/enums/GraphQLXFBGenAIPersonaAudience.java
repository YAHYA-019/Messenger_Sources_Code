package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBGenAIPersonaAudience.class */
public enum GraphQLXFBGenAIPersonaAudience {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    PERSONA_SET("ANYONE_WITH_LINK"),
    /* JADX INFO: Fake field, exist only in values array */
    PERSONA_SET("CLOSE_FRIENDS"),
    /* JADX INFO: Fake field, exist only in values array */
    PERSONA_SET("FRIENDS"),
    /* JADX INFO: Fake field, exist only in values array */
    PERSONA_SET("META_INTERNAL"),
    ONLY_ME("ONLY_ME"),
    /* JADX INFO: Fake field, exist only in values array */
    PERSONA_SET("PERSONA_SET"),
    PUBLIC("PUBLIC"),
    /* JADX INFO: Fake field, exist only in values array */
    PUBLIC_FOR_IG_PRIVATE_ACCOUNTS("PUBLIC_FOR_IG_PRIVATE_ACCOUNTS");

    public final String serverValue;

    GraphQLXFBGenAIPersonaAudience(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
