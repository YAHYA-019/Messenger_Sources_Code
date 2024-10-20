package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBMessagingSearchMetaAISnippetStatus.class */
public enum GraphQLXFBMessagingSearchMetaAISnippetStatus {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    COMPLETE("COMPLETE"),
    FETCHING("FETCHING"),
    /* JADX INFO: Fake field, exist only in values array */
    INELIGIBLE("INELIGIBLE"),
    SNIPPET_ERROR("SNIPPET_ERROR"),
    SUGGESTED_PROMPT_ERROR("SUGGESTED_PROMPT_ERROR");

    public final String serverValue;

    GraphQLXFBMessagingSearchMetaAISnippetStatus(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
