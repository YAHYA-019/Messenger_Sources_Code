package com.facebook.graphql.enums;

/* loaded from: GraphQLInteractive360CallToActionTypeEnum.class */
public enum GraphQLInteractive360CallToActionTypeEnum {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    PLAY_NOW("PLAY_NOW"),
    /* JADX INFO: Fake field, exist only in values array */
    TAKE_THE_TOUR("TAKE_THE_TOUR"),
    /* JADX INFO: Fake field, exist only in values array */
    VIEW_NOW("VIEW_NOW");

    public final String serverValue;

    GraphQLInteractive360CallToActionTypeEnum(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
