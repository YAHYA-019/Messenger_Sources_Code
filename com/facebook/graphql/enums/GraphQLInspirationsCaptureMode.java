package com.facebook.graphql.enums;

/* loaded from: GraphQLInspirationsCaptureMode.class */
public enum GraphQLInspirationsCaptureMode {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    IG_AVATAR_PRESET("AR_ADS"),
    /* JADX INFO: Fake field, exist only in values array */
    IG_AVATAR_PRESET("CARDS"),
    /* JADX INFO: Fake field, exist only in values array */
    IG_AVATAR_PRESET("DIRECT"),
    /* JADX INFO: Fake field, exist only in values array */
    IG_AVATAR_PRESET("DIRECT_SELFIE_EFFECTS"),
    /* JADX INFO: Fake field, exist only in values array */
    IG_AVATAR_PRESET("IG_AVATAR_PRESET"),
    LIVE("LIVE"),
    POSTCAPTURE_PHOTO("POSTCAPTURE_PHOTO"),
    POSTCAPTURE_VIDEO("POSTCAPTURE_VIDEO"),
    PRECAPTURE_PHOTO("PRECAPTURE_PHOTO"),
    PRECAPTURE_VIDEO("PRECAPTURE_VIDEO");

    public final String serverValue;

    GraphQLInspirationsCaptureMode(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
