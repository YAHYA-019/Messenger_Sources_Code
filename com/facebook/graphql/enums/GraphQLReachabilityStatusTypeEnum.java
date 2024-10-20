package com.facebook.graphql.enums;

/* loaded from: GraphQLReachabilityStatusTypeEnum.class */
public enum GraphQLReachabilityStatusTypeEnum {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    REACHABLE("REACHABLE"),
    /* JADX INFO: Fake field, exist only in values array */
    UNREACHABLE_RS_UPSELL_ELIGIBLE("REACHABLE_INVITE_BANNER"),
    /* JADX INFO: Fake field, exist only in values array */
    UNREACHABLE_RS_UPSELL_ELIGIBLE("REACHABLE_INVITE_MODEL_TEXT_ONLY"),
    UNREACHABLE_ADULT_TYPE("UNREACHABLE_ADULT_TYPE"),
    /* JADX INFO: Fake field, exist only in values array */
    UNREACHABLE_RS_UPSELL_ELIGIBLE("UNREACHABLE_INTEROP_THIRD_PARTY_APP_NOT_SUPPORTED"),
    /* JADX INFO: Fake field, exist only in values array */
    UNREACHABLE_RS_UPSELL_ELIGIBLE("UNREACHABLE_INTEROP_THIRD_PARTY_USER"),
    /* JADX INFO: Fake field, exist only in values array */
    UNREACHABLE_RS_UPSELL_ELIGIBLE("UNREACHABLE_INTEROP_USER_OPT_OUT"),
    /* JADX INFO: Fake field, exist only in values array */
    UNREACHABLE_RS_UPSELL_ELIGIBLE("UNREACHABLE_INTEROP_USER_REMOVED_THIRD_PARTY_APP"),
    /* JADX INFO: Fake field, exist only in values array */
    UNREACHABLE_RS_UPSELL_ELIGIBLE("UNREACHABLE_INVITE_BLOCK"),
    /* JADX INFO: Fake field, exist only in values array */
    UNREACHABLE_RS_UPSELL_ELIGIBLE("UNREACHABLE_MR_LIMIT_BLOCK"),
    /* JADX INFO: Fake field, exist only in values array */
    UNREACHABLE_RS_UPSELL_ELIGIBLE("UNREACHABLE_NULL_INTEROP_USER"),
    /* JADX INFO: Fake field, exist only in values array */
    UNREACHABLE_RS_UPSELL_ELIGIBLE("UNREACHABLE_RS_UPSELL_ELIGIBLE"),
    UNREACHABLE_USER_TYPE("UNREACHABLE_USER_TYPE");

    public final String serverValue;

    GraphQLReachabilityStatusTypeEnum(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
