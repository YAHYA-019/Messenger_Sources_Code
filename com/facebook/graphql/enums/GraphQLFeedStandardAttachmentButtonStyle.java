package com.facebook.graphql.enums;

/* loaded from: GraphQLFeedStandardAttachmentButtonStyle.class */
public enum GraphQLFeedStandardAttachmentButtonStyle {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    MICRO("MICRO"),
    /* JADX INFO: Fake field, exist only in values array */
    PRIMARY("PRIMARY"),
    /* JADX INFO: Fake field, exist only in values array */
    SECONDARY("SECONDARY"),
    /* JADX INFO: Fake field, exist only in values array */
    SMALL("SMALL");

    public final String serverValue;

    GraphQLFeedStandardAttachmentButtonStyle(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
