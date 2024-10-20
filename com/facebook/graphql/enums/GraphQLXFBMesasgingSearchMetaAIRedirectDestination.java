package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBMesasgingSearchMetaAIRedirectDestination.class */
public enum GraphQLXFBMesasgingSearchMetaAIRedirectDestination {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    META_AI("META_AI"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE("NONE");

    public final String serverValue;

    GraphQLXFBMesasgingSearchMetaAIRedirectDestination(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
