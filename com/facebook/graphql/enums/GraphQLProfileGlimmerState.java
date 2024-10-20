package com.facebook.graphql.enums;

/* loaded from: GraphQLProfileGlimmerState.class */
public enum GraphQLProfileGlimmerState {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    COVER_AREA_AND_NAME_HIDDEN("COVER_AREA_AND_NAME_HIDDEN"),
    /* JADX INFO: Fake field, exist only in values array */
    COVER_AREA_HIDDEN("COVER_AREA_HIDDEN"),
    /* JADX INFO: Fake field, exist only in values array */
    EXPANDED("EXPANDED"),
    /* JADX INFO: Fake field, exist only in values array */
    NO_COVER_PHOTO_PROFILE_GLIMMER("NO_COVER_PHOTO_PROFILE_GLIMMER");

    public final String serverValue;

    GraphQLProfileGlimmerState(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
