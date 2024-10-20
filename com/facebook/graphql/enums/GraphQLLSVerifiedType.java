package com.facebook.graphql.enums;

/* loaded from: GraphQLLSVerifiedType.class */
public enum GraphQLLSVerifiedType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    DEFAULT("DEFAULT"),
    NOT_VERIFIED("NOT_VERIFIED"),
    /* JADX INFO: Fake field, exist only in values array */
    VERIFIED_CONTENT_TITLE_ONLY("VERIFIED_CONTENT_TITLE_ONLY"),
    VERIFIED_FOOTER("VERIFIED_FOOTER"),
    /* JADX INFO: Fake field, exist only in values array */
    VERIFIED_HEADER_TITLE_ONLY("VERIFIED_HEADER_TITLE_ONLY");

    public final String serverValue;

    GraphQLLSVerifiedType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
