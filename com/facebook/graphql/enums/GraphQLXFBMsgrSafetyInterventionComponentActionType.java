package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBMsgrSafetyInterventionComponentActionType.class */
public enum GraphQLXFBMsgrSafetyInterventionComponentActionType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    BLOKS("BLOKS"),
    EXTERNAL_PAGE("EXTERNAL_PAGE"),
    /* JADX INFO: Fake field, exist only in values array */
    INTERNAL("INTERNAL");

    public final String serverValue;

    GraphQLXFBMsgrSafetyInterventionComponentActionType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
