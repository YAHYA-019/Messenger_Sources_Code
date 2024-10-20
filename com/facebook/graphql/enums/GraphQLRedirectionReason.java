package com.facebook.graphql.enums;

/* loaded from: GraphQLRedirectionReason.class */
public enum GraphQLRedirectionReason {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    REDIRECT_SPORTSDATA_TO_PERMALINK("REDIRECT_CHILD_EVENTS_TO_ITS_PARENT"),
    /* JADX INFO: Fake field, exist only in values array */
    REDIRECT_SPORTSDATA_TO_PERMALINK("REDIRECT_EVENT_TO_EXTERNAL_URL"),
    /* JADX INFO: Fake field, exist only in values array */
    REDIRECT_SPORTSDATA_TO_PERMALINK("REDIRECT_GLOBAL_PAGE_TO_MARKET_PAGE"),
    /* JADX INFO: Fake field, exist only in values array */
    REDIRECT_SPORTSDATA_TO_PERMALINK("REDIRECT_PAGE_TO_BEST_PAGE"),
    /* JADX INFO: Fake field, exist only in values array */
    REDIRECT_SPORTSDATA_TO_PERMALINK("REDIRECT_PAGE_TO_TOPIC"),
    /* JADX INFO: Fake field, exist only in values array */
    REDIRECT_SPORTSDATA_TO_PERMALINK("REDIRECT_ROVI_PAGES_TO_MSITE"),
    /* JADX INFO: Fake field, exist only in values array */
    REDIRECT_SPORTSDATA_TO_PERMALINK("REDIRECT_SPORTSDATA_TO_PERMALINK"),
    REDIRECT_TO_CITY_GUIDE("REDIRECT_TO_CITY_GUIDE"),
    /* JADX INFO: Fake field, exist only in values array */
    REDIRECT_WORK_PAGE_TO_DEMO_GROUP("REDIRECT_WORK_PAGE_TO_DEMO_GROUP");

    public final String serverValue;

    GraphQLRedirectionReason(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
