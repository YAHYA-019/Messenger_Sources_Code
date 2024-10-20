package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBMsgrSafetyInterventionComponentInternalActionType.class */
public enum GraphQLXFBMsgrSafetyInterventionComponentInternalActionType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    DISMISS("DISMISS");

    public final String serverValue;

    GraphQLXFBMsgrSafetyInterventionComponentInternalActionType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
