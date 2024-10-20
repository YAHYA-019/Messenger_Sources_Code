package com.facebook.graphql.enums;

/* loaded from: GraphQLJobOpeningSource.class */
public enum GraphQLJobOpeningSource {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    TEST("CATALOG"),
    /* JADX INFO: Fake field, exist only in values array */
    TEST("JOBS_MANAGER"),
    /* JADX INFO: Fake field, exist only in values array */
    TEST("OTHER"),
    /* JADX INFO: Fake field, exist only in values array */
    TEST("PAGE_COMPOSER"),
    /* JADX INFO: Fake field, exist only in values array */
    TEST("PAGE_POST"),
    /* JADX INFO: Fake field, exist only in values array */
    TEST("PLATFORM"),
    /* JADX INFO: Fake field, exist only in values array */
    TEST("PLATFORM_PROVISIONED_API"),
    /* JADX INFO: Fake field, exist only in values array */
    TEST("PLATFORM_PROVISIONED_FEED"),
    /* JADX INFO: Fake field, exist only in values array */
    TEST("SCRAPE"),
    /* JADX INFO: Fake field, exist only in values array */
    TEST("TEST"),
    USER("USER"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_DEPRECATED_DO_NOT_USE("USER_DEPRECATED_DO_NOT_USE");

    public final String serverValue;

    GraphQLJobOpeningSource(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
