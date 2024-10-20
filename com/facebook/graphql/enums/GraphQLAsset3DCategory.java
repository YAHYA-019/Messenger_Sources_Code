package com.facebook.graphql.enums;

/* loaded from: GraphQLAsset3DCategory.class */
public enum GraphQLAsset3DCategory {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    COMPOSER("COMPOSER"),
    /* JADX INFO: Fake field, exist only in values array */
    LINK_SCRAPE("LINK_SCRAPE"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIUM("MEDIUM"),
    /* JADX INFO: Fake field, exist only in values array */
    METAVERSITY("METAVERSITY"),
    /* JADX INFO: Fake field, exist only in values array */
    PHOTOS_3D("PHOTOS_3D"),
    /* JADX INFO: Fake field, exist only in values array */
    QUILLUSTRATION("QUILLUSTRATION"),
    /* JADX INFO: Fake field, exist only in values array */
    SPACES_MARKER_DRAWING("SPACES_MARKER_DRAWING"),
    /* JADX INFO: Fake field, exist only in values array */
    THIRD_PARTY("THIRD_PARTY"),
    /* JADX INFO: Fake field, exist only in values array */
    UNSPECIFIED("UNSPECIFIED"),
    /* JADX INFO: Fake field, exist only in values array */
    VALIDATOR("VALIDATOR");

    public final String serverValue;

    GraphQLAsset3DCategory(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
