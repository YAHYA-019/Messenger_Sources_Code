package com.facebook.graphql.enums;

/* loaded from: GraphQLGroupMemberMuteAction.class */
public enum GraphQLGroupMemberMuteAction {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    MUTE("MUTE"),
    /* JADX INFO: Fake field, exist only in values array */
    UNMUTE("UNMUTE");

    public final String serverValue;

    GraphQLGroupMemberMuteAction(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
