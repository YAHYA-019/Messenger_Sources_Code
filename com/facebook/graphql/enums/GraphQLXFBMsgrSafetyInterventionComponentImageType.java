package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBMsgrSafetyInterventionComponentImageType.class */
public enum GraphQLXFBMsgrSafetyInterventionComponentImageType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    ICON("ICON"),
    STOCK_IMAGE("STOCK_IMAGE");

    public final String serverValue;

    GraphQLXFBMsgrSafetyInterventionComponentImageType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
