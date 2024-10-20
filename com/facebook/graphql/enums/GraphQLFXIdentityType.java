package com.facebook.graphql.enums;

/* loaded from: GraphQLFXIdentityType.class */
public enum GraphQLFXIdentityType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    AR_USER("AR_USER"),
    /* JADX INFO: Fake field, exist only in values array */
    FB_ADDITIONAL_PROFILE("FB_ADDITIONAL_PROFILE"),
    /* JADX INFO: Fake field, exist only in values array */
    FB_PAGE("FB_PAGE"),
    /* JADX INFO: Fake field, exist only in values array */
    FB_USER("FB_USER"),
    /* JADX INFO: Fake field, exist only in values array */
    FRL_USER("FRL_USER"),
    /* JADX INFO: Fake field, exist only in values array */
    IG_PROFESSIONAL("IG_PROFESSIONAL"),
    /* JADX INFO: Fake field, exist only in values array */
    IG_USER("IG_USER"),
    /* JADX INFO: Fake field, exist only in values array */
    MESSENGER_KID("MESSENGER_KID"),
    /* JADX INFO: Fake field, exist only in values array */
    META("META"),
    /* JADX INFO: Fake field, exist only in values array */
    THREADS_USER("THREADS_USER"),
    /* JADX INFO: Fake field, exist only in values array */
    VR_PROFILE("VR_PROFILE"),
    /* JADX INFO: Fake field, exist only in values array */
    WA_BUSINESS_PROFILE("WA_BUSINESS_PROFILE"),
    /* JADX INFO: Fake field, exist only in values array */
    WA_USER("WA_USER");

    public final String serverValue;

    GraphQLFXIdentityType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
