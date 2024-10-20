package com.facebook.graphql.enums;

/* loaded from: GraphQLMontageShareIntent.class */
public enum GraphQLMontageShareIntent {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    SHARE("RTC_CAPTURE"),
    /* JADX INFO: Fake field, exist only in values array */
    SHARE("SHARE"),
    TAG("TAG");

    public final String serverValue;

    GraphQLMontageShareIntent(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
