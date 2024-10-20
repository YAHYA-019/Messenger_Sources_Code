package com.facebook.graphql.enums;

/* loaded from: GraphQLMessageImageType.class */
public enum GraphQLMessageImageType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    FILE_ATTACHMENT("FILE_ATTACHMENT"),
    MESSENGER_CAM("MESSENGER_CAM"),
    /* JADX INFO: Fake field, exist only in values array */
    TRANSPARENT("TRANSPARENT");

    public final String serverValue;

    GraphQLMessageImageType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
