package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBMusicPickerSongMonetizationInfo.class */
public enum GraphQLXFBMusicPickerSongMonetizationInfo {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    NOT_MONETIZABLE("NOT_MONETIZABLE"),
    REVSHARE("REVSHARE"),
    ROYALTY_FREE("ROYALTY_FREE");

    public final String serverValue;

    GraphQLXFBMusicPickerSongMonetizationInfo(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
