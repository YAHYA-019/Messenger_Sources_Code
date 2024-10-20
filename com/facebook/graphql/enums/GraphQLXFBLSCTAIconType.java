package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBLSCTAIconType.class */
public enum GraphQLXFBLSCTAIconType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    CAMERA("CAMERA"),
    /* JADX INFO: Fake field, exist only in values array */
    CHEVRON_DOWN("CHEVRON_DOWN"),
    /* JADX INFO: Fake field, exist only in values array */
    CIRCLED_X("CIRCLED_X"),
    /* JADX INFO: Fake field, exist only in values array */
    DOTS_THREE_HORIZONTAL("DOTS_THREE_HORIZONTAL"),
    /* JADX INFO: Fake field, exist only in values array */
    FB("FB"),
    /* JADX INFO: Fake field, exist only in values array */
    FB_ALWAYS_WHITE("FB_ALWAYS_WHITE"),
    /* JADX INFO: Fake field, exist only in values array */
    FB_INFO_SMALL("FB_INFO_SMALL"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE("NONE"),
    /* JADX INFO: Fake field, exist only in values array */
    PENCIL("PENCIL");

    public final String serverValue;

    GraphQLXFBLSCTAIconType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
