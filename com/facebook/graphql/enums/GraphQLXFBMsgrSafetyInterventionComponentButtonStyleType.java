package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBMsgrSafetyInterventionComponentButtonStyleType.class */
public enum GraphQLXFBMsgrSafetyInterventionComponentButtonStyleType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    PRIMARY("PRIMARY"),
    /* JADX INFO: Fake field, exist only in values array */
    SECONDARY("SECONDARY");

    public final String serverValue;

    GraphQLXFBMsgrSafetyInterventionComponentButtonStyleType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
