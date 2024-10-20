package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBInstantGameConsentExperienceType.class */
public enum GraphQLXFBInstantGameConsentExperienceType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    NONE("NONE"),
    /* JADX INFO: Fake field, exist only in values array */
    PERMISSION_2_0("PERMISSION_2_0"),
    PLATFORM("PLATFORM"),
    SANDBOX_NEW_GAME_NOTICE("SANDBOX_NEW_GAME_NOTICE"),
    SANDBOX_ONBOARDING("SANDBOX_ONBOARDING");

    public final String serverValue;

    GraphQLXFBInstantGameConsentExperienceType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
