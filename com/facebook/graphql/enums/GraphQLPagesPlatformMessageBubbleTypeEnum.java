package com.facebook.graphql.enums;

/* loaded from: GraphQLPagesPlatformMessageBubbleTypeEnum.class */
public enum GraphQLPagesPlatformMessageBubbleTypeEnum {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    ATTENDANCE_UPDATE("ATTENDANCE_UPDATE"),
    /* JADX INFO: Fake field, exist only in values array */
    CANCELLED("CANCELLED"),
    /* JADX INFO: Fake field, exist only in values array */
    DECLINED("DECLINED"),
    /* JADX INFO: Fake field, exist only in values array */
    NO_SHOW("NO_SHOW"),
    /* JADX INFO: Fake field, exist only in values array */
    REMINDER("REMINDER"),
    /* JADX INFO: Fake field, exist only in values array */
    REQUESTED("REQUESTED"),
    /* JADX INFO: Fake field, exist only in values array */
    SCHEDULEED("SCHEDULEED"),
    /* JADX INFO: Fake field, exist only in values array */
    SECONDARY_MESSAGE("SECONDARY_MESSAGE"),
    /* JADX INFO: Fake field, exist only in values array */
    UPDATED("UPDATED");

    public final String serverValue;

    GraphQLPagesPlatformMessageBubbleTypeEnum(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
