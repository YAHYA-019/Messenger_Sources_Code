package com.facebook.graphql.enums;

/* loaded from: GraphQLRightsManagerMusicTag.class */
public enum GraphQLRightsManagerMusicTag {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTAINS_LICENSED_MUSIC("CONTAINS_LICENSED_MUSIC"),
    CONTAINS_NEARLY_COMPLETE_LICENSED("CONTAINS_NEARLY_COMPLETE_LICENSED"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTAINS_NEARLY_COMPLETE_SOUND_COLLECTION("CONTAINS_NEARLY_COMPLETE_SOUND_COLLECTION"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTAINS_SOUND_COLLECTION_MUSIC("CONTAINS_SOUND_COLLECTION_MUSIC");

    public final String serverValue;

    GraphQLRightsManagerMusicTag(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
