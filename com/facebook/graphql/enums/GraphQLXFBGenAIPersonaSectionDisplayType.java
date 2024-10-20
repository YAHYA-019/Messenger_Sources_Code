package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBGenAIPersonaSectionDisplayType.class */
public enum GraphQLXFBGenAIPersonaSectionDisplayType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    HSCROLL_SMALL("HIDDEN"),
    /* JADX INFO: Fake field, exist only in values array */
    HSCROLL_SMALL("HSCROLL"),
    /* JADX INFO: Fake field, exist only in values array */
    HSCROLL_SMALL("HSCROLL_CONTINUE_CHATTING"),
    HSCROLL_ICEBREAKERS("HSCROLL_ICEBREAKERS"),
    /* JADX INFO: Fake field, exist only in values array */
    HSCROLL_SMALL("HSCROLL_LARGE"),
    /* JADX INFO: Fake field, exist only in values array */
    HSCROLL_SMALL("HSCROLL_SMALL"),
    LISTVIEW("LISTVIEW"),
    /* JADX INFO: Fake field, exist only in values array */
    PILLS("PILLS");

    public final String serverValue;

    GraphQLXFBGenAIPersonaSectionDisplayType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
