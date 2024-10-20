package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBInstantGameBotMessageSubscriptionManagementUserActionType.class */
public enum GraphQLXFBInstantGameBotMessageSubscriptionManagementUserActionType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBSCRIBE("SUBSCRIBE"),
    /* JADX INFO: Fake field, exist only in values array */
    UNSUBSCRIBE("UNSUBSCRIBE");

    public final String serverValue;

    GraphQLXFBInstantGameBotMessageSubscriptionManagementUserActionType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
