package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBRMSCTAAction.class */
public enum GraphQLXFBRMSCTAAction {
    /* JADX INFO: Fake field, exist only in values array */
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    ADD_YOURS("ADD_YOURS"),
    /* JADX INFO: Fake field, exist only in values array */
    AI_GENERATION_IMAGINE("AI_GENERATION_IMAGINE"),
    /* JADX INFO: Fake field, exist only in values array */
    BROWSE_TEMPLATES("BROWSE_TEMPLATES"),
    /* JADX INFO: Fake field, exist only in values array */
    DELETE_DRAFT("DELETE_DRAFT"),
    /* JADX INFO: Fake field, exist only in values array */
    DIRECT_GBF_SEND("DIRECT_GBF_SEND"),
    /* JADX INFO: Fake field, exist only in values array */
    EDIT("EDIT"),
    /* JADX INFO: Fake field, exist only in values array */
    EDIT_SEND_FORWARD("EDIT_SEND_FORWARD"),
    /* JADX INFO: Fake field, exist only in values array */
    LOAD_DRAFT("LOAD_DRAFT"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIA_PICKER("MEDIA_PICKER"),
    /* JADX INFO: Fake field, exist only in values array */
    POST("POST"),
    /* JADX INFO: Fake field, exist only in values array */
    SHARE_SHEET("SHARE_SHEET");

    public final String serverValue;

    GraphQLXFBRMSCTAAction(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
