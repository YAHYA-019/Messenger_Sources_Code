package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBGenAIAgentsProxyRefusal.class */
public enum GraphQLXFBGenAIAgentsProxyRefusal {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    IS_ERROR("IS_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    IS_REFUSAL("IS_REFUSAL"),
    /* JADX INFO: Fake field, exist only in values array */
    NEEDS_MORE_INFO("NEEDS_MORE_INFO");

    public final String serverValue;

    GraphQLXFBGenAIAgentsProxyRefusal(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
