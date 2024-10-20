package com.facebook.graphql.enums;

/* loaded from: GraphQLPrivacyFlowTriggerBehavior.class */
public enum GraphQLPrivacyFlowTriggerBehavior {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTEXTUAL_FLOW_LAUNCH("CONTEXTUAL_FLOW_LAUNCH"),
    DEFAULT_LAUNCH("DEFAULT_LAUNCH"),
    /* JADX INFO: Fake field, exist only in values array */
    HTTP_HEADER_LAUNCH("HTTP_HEADER_LAUNCH"),
    /* JADX INFO: Fake field, exist only in values array */
    NO_LAUNCH_HOLD_ON_CLIENT("NO_LAUNCH_HOLD_ON_CLIENT");

    public final String serverValue;

    GraphQLPrivacyFlowTriggerBehavior(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
