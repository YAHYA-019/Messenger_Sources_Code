package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBCoplayDifficulty.class */
public enum GraphQLXFBCoplayDifficulty {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    EASY("EASY"),
    /* JADX INFO: Fake field, exist only in values array */
    HARD("HARD"),
    /* JADX INFO: Fake field, exist only in values array */
    MODERATE("MODERATE");

    public final String serverValue;

    GraphQLXFBCoplayDifficulty(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
