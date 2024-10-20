package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBRMSCTAButtonIconName.class */
public enum GraphQLXFBRMSCTAButtonIconName {
    /* JADX INFO: Fake field, exist only in values array */
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    APP_MESSENGER("APP_MESSENGER"),
    /* JADX INFO: Fake field, exist only in values array */
    DMA_MESSENGER_OPT_OUT("DMA_MESSENGER_OPT_OUT"),
    /* JADX INFO: Fake field, exist only in values array */
    FRIENDS("FRIENDS"),
    /* JADX INFO: Fake field, exist only in values array */
    PLUS_CIRCLE("PLUS_CIRCLE"),
    /* JADX INFO: Fake field, exist only in values array */
    SHARE("SHARE");

    public final String serverValue;

    GraphQLXFBRMSCTAButtonIconName(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
