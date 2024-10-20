package com.facebook.graphql.enums;

/* loaded from: GraphQLMessengerCallToActionRenderStyle.class */
public enum GraphQLMessengerCallToActionRenderStyle {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    LARGE_BUTTON("LARGE_BUTTON"),
    NORMAL("NORMAL");

    public final String serverValue;

    GraphQLMessengerCallToActionRenderStyle(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
