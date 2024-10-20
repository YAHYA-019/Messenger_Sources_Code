package com.facebook.graphql.enums;

/* loaded from: GraphQLPageCommPlatform.class */
public enum GraphQLPageCommPlatform {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIA_MANAGER_PRIORITY("ALL"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIA_MANAGER_PRIORITY("CHANNELS"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIA_MANAGER_PRIORITY("COMMENTS"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIA_MANAGER_PRIORITY("FACEBOOK"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIA_MANAGER_PRIORITY("GROUP"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIA_MANAGER_PRIORITY("INSTAGRAM"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIA_MANAGER_PRIORITY("INSTAGRAM_DIRECT"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIA_MANAGER_PRIORITY("INSTAGRAM_UNPUBLISHED"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIA_MANAGER_PRIORITY("MEDIA_MANAGER_FB_COMMS"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIA_MANAGER_PRIORITY("MEDIA_MANAGER_PRIORITY"),
    MESSENGER("MESSENGER"),
    /* JADX INFO: Fake field, exist only in values array */
    OFFSITE_EMAIL("OFFSITE_EMAIL"),
    /* JADX INFO: Fake field, exist only in values array */
    WEC("WEC");

    public final String serverValue;

    GraphQLPageCommPlatform(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
