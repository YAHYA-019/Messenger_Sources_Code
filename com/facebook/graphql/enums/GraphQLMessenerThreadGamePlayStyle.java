package com.facebook.graphql.enums;

/* loaded from: GraphQLMessenerThreadGamePlayStyle.class */
public enum GraphQLMessenerThreadGamePlayStyle {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    BASIC("BASIC"),
    /* JADX INFO: Fake field, exist only in values array */
    MULTIPLAYER_COOP("MULTIPLAYER_COOP"),
    /* JADX INFO: Fake field, exist only in values array */
    MULTIPLAYER_SCORE("MULTIPLAYER_SCORE"),
    /* JADX INFO: Fake field, exist only in values array */
    MULTIPLAYER_TURN("MULTIPLAYER_TURN"),
    /* JADX INFO: Fake field, exist only in values array */
    REALTIME("REALTIME"),
    /* JADX INFO: Fake field, exist only in values array */
    TWOPLAYER_SCORE("TWOPLAYER_SCORE"),
    /* JADX INFO: Fake field, exist only in values array */
    TWOPLAYER_TURN("TWOPLAYER_TURN");

    public final String serverValue;

    GraphQLMessenerThreadGamePlayStyle(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
