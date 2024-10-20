package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBGenAISpeechOutputType.class */
public enum GraphQLXFBGenAISpeechOutputType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    BRIEF("BRIEF"),
    /* JADX INFO: Fake field, exist only in values array */
    FULL("FULL"),
    /* JADX INFO: Fake field, exist only in values array */
    OFF("OFF");

    public final String serverValue;

    GraphQLXFBGenAISpeechOutputType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
