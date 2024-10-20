package com.facebook.graphql.enums;

/* loaded from: GraphQLCallToActionStyle.class */
public enum GraphQLCallToActionStyle {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    ATTACHMENT_AND_ENDSCREEN("ATTACHMENT_AND_ENDSCREEN"),
    /* JADX INFO: Fake field, exist only in values array */
    BUTTON_UNDER_DESC("BUTTON_UNDER_DESC"),
    /* JADX INFO: Fake field, exist only in values array */
    BUTTON_WITH_ICON_ONLY("BUTTON_WITH_ICON_ONLY"),
    /* JADX INFO: Fake field, exist only in values array */
    BUTTON_WITH_TEXT_ONLY("BUTTON_WITH_TEXT_ONLY"),
    /* JADX INFO: Fake field, exist only in values array */
    HIDE_FROM_FEED("HIDE_FROM_FEED"),
    /* JADX INFO: Fake field, exist only in values array */
    SHOW_SPONSORSHIP("SHOW_SPONSORSHIP"),
    /* JADX INFO: Fake field, exist only in values array */
    VIDEO_DR_STYLE("VIDEO_DR_STYLE");

    public final String serverValue;

    GraphQLCallToActionStyle(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
