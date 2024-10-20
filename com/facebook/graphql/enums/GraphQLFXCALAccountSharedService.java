package com.facebook.graphql.enums;

/* loaded from: GraphQLFXCALAccountSharedService.class */
public enum GraphQLFXCALAccountSharedService {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    APP_PREFERRED_ACCOUNT("APP_PREFERRED_ACCOUNT"),
    /* JADX INFO: Fake field, exist only in values array */
    CROSS_ACCOUNT_DATA_USE("CROSS_ACCOUNT_DATA_USE"),
    /* JADX INFO: Fake field, exist only in values array */
    CROSS_POSTING_SETTING("CROSS_POSTING_SETTING"),
    /* JADX INFO: Fake field, exist only in values array */
    DYI("DYI"),
    /* JADX INFO: Fake field, exist only in values array */
    EXAMPLE_ENTRY_WITHOUT_SCHEMA("EXAMPLE_ENTRY_WITHOUT_SCHEMA"),
    /* JADX INFO: Fake field, exist only in values array */
    EXAMPLE_SERVICE("EXAMPLE_SERVICE"),
    /* JADX INFO: Fake field, exist only in values array */
    FBPAY_PROXY("FBPAY_PROXY"),
    /* JADX INFO: Fake field, exist only in values array */
    FB_TO_IG_CROSS_POSTING_FEED("FB_TO_IG_CROSS_POSTING_FEED"),
    /* JADX INFO: Fake field, exist only in values array */
    FULL_ACCESS_EXAMPLE_SERVICE("FULL_ACCESS_EXAMPLE_SERVICE"),
    /* JADX INFO: Fake field, exist only in values array */
    GEMSTONE("GEMSTONE"),
    /* JADX INFO: Fake field, exist only in values array */
    MESSAGING_REACHABILITY_SETTINGS("MESSAGING_REACHABILITY_SETTINGS"),
    /* JADX INFO: Fake field, exist only in values array */
    META_GALLERY_SETTINGS("META_GALLERY_SETTINGS"),
    /* JADX INFO: Fake field, exist only in values array */
    META_REELS_SETTINGS("META_REELS_SETTINGS"),
    /* JADX INFO: Fake field, exist only in values array */
    META_SOCIAL_SETTINGS("META_SOCIAL_SETTINGS"),
    /* JADX INFO: Fake field, exist only in values array */
    NME_SUBSCRIPTION("NME_SUBSCRIPTION"),
    /* JADX INFO: Fake field, exist only in values array */
    SHARED_PROFILES_EDUCATION("SHARED_PROFILES_EDUCATION"),
    /* JADX INFO: Fake field, exist only in values array */
    SSO("SSO"),
    /* JADX INFO: Fake field, exist only in values array */
    WEARABLES_LINKED_ACCOUNTS("WEARABLES_LINKED_ACCOUNTS");

    public final String serverValue;

    GraphQLFXCALAccountSharedService(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
