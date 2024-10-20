package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBInstantGameCustomUpdateMuteManagementUserActionType.class */
public enum GraphQLXFBInstantGameCustomUpdateMuteManagementUserActionType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    MUTE("MUTE"),
    UNMUTE("UNMUTE");

    public final String serverValue;

    GraphQLXFBInstantGameCustomUpdateMuteManagementUserActionType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
