package com.facebook.graphql.enums;

/* loaded from: GraphQLBizInboxCTSSuggestedActionType.class */
public enum GraphQLBizInboxCTSSuggestedActionType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    CREATE_OFFER("CREATE_OFFER"),
    /* JADX INFO: Fake field, exist only in values array */
    CTD_UPSELL("CTD_UPSELL"),
    /* JADX INFO: Fake field, exist only in values array */
    CTM_UPSELL("CTM_UPSELL"),
    /* JADX INFO: Fake field, exist only in values array */
    EXTRACT_INFO_TO_CONTACT_CARD("EXTRACT_INFO_TO_CONTACT_CARD"),
    /* JADX INFO: Fake field, exist only in values array */
    MARK_AS_PAID("MARK_AS_PAID"),
    /* JADX INFO: Fake field, exist only in values array */
    MARK_AS_SHIPPED("MARK_AS_SHIPPED"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE("NONE"),
    /* JADX INFO: Fake field, exist only in values array */
    ONBOARD_TO_EMAIL("ONBOARD_TO_EMAIL"),
    /* JADX INFO: Fake field, exist only in values array */
    SAVE_LAST_SENT_MESSAGE("SAVE_LAST_SENT_MESSAGE"),
    /* JADX INFO: Fake field, exist only in values array */
    SET_AWAY_MESSAGE_AUTOMATION("SET_AWAY_MESSAGE_AUTOMATION"),
    /* JADX INFO: Fake field, exist only in values array */
    SET_COMMENT_TO_MESSAGE_AUTOMATION("SET_COMMENT_TO_MESSAGE_AUTOMATION"),
    /* JADX INFO: Fake field, exist only in values array */
    SET_FAQ("SET_FAQ"),
    /* JADX INFO: Fake field, exist only in values array */
    SET_FOLLOW_UP("SET_FOLLOW_UP"),
    /* JADX INFO: Fake field, exist only in values array */
    SET_ICEBREAKER_QUESTIONS("SET_ICEBREAKER_QUESTIONS"),
    /* JADX INFO: Fake field, exist only in values array */
    SET_INSTANT_REPLY("SET_INSTANT_REPLY"),
    /* JADX INFO: Fake field, exist only in values array */
    SET_INSTANT_REPLY_AUTOMATION("SET_INSTANT_REPLY_AUTOMATION"),
    /* JADX INFO: Fake field, exist only in values array */
    SUGGESTED_LABEL("SUGGESTED_LABEL"),
    /* JADX INFO: Fake field, exist only in values array */
    SUGGESTED_REPLY("SUGGESTED_REPLY");

    public final String serverValue;

    GraphQLBizInboxCTSSuggestedActionType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
