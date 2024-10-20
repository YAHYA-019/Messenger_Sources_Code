package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBMsgrSafetyInterventionType.class */
public enum GraphQLXFBMsgrSafetyInterventionType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    BEFORE_MESSAGE_RISKY_ACTOR_SAFETY_NOTICE("BEFORE_MESSAGE_RISKY_ACTOR_SAFETY_NOTICE"),
    /* JADX INFO: Fake field, exist only in values array */
    MESSAGE_SEND_COLD_OPEN_FEATURE_LIMIT_COMPOSER_BLOCK("MESSAGE_SEND_COLD_OPEN_FEATURE_LIMIT_COMPOSER_BLOCK");

    public final String serverValue;

    GraphQLXFBMsgrSafetyInterventionType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
