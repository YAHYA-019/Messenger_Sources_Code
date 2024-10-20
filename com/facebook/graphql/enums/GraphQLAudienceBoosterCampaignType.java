package com.facebook.graphql.enums;

/* loaded from: GraphQLAudienceBoosterCampaignType.class */
public enum GraphQLAudienceBoosterCampaignType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    DEFAULT("DEFAULT"),
    /* JADX INFO: Fake field, exist only in values array */
    FACEBOOK_GAMING("FACEBOOK_GAMING"),
    /* JADX INFO: Fake field, exist only in values array */
    WATCH_GROWTH("WATCH_GROWTH");

    public final String serverValue;

    GraphQLAudienceBoosterCampaignType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
