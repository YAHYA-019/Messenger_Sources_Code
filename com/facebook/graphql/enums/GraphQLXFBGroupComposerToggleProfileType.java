package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBGroupComposerToggleProfileType.class */
public enum GraphQLXFBGroupComposerToggleProfileType {
    /* JADX INFO: Fake field, exist only in values array */
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    MAIN_PROFILE("MAIN_PROFILE"),
    /* JADX INFO: Fake field, exist only in values array */
    SOAP("SOAP");

    public final String serverValue;

    GraphQLXFBGroupComposerToggleProfileType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
