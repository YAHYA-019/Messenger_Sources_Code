package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBManageNotificationMessagesUserActionType.class */
public enum GraphQLXFBManageNotificationMessagesUserActionType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    RESUME_MESSAGES("EDIT_TOPIC"),
    /* JADX INFO: Fake field, exist only in values array */
    RESUME_MESSAGES("MUTE"),
    /* JADX INFO: Fake field, exist only in values array */
    RESUME_MESSAGES("REPORT"),
    /* JADX INFO: Fake field, exist only in values array */
    RESUME_MESSAGES("RESUME_MESSAGES"),
    STOP_MESSAGES("STOP_MESSAGES");

    public final String serverValue;

    GraphQLXFBManageNotificationMessagesUserActionType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
