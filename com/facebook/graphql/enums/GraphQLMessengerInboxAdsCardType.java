package com.facebook.graphql.enums;

/* loaded from: GraphQLMessengerInboxAdsCardType.class */
public enum GraphQLMessengerInboxAdsCardType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    END_CARD("END_CARD"),
    IMAGE("IMAGE"),
    VIDEO("VIDEO");

    public final String serverValue;

    GraphQLMessengerInboxAdsCardType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
