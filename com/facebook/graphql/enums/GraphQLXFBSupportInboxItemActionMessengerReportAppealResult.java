package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBSupportInboxItemActionMessengerReportAppealResult.class */
public enum GraphQLXFBSupportInboxItemActionMessengerReportAppealResult {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    FAILED("FAILED"),
    SUCCESS("SUCCESS");

    public final String serverValue;

    GraphQLXFBSupportInboxItemActionMessengerReportAppealResult(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
