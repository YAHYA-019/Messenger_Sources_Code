package com.facebook.graphql.enums;

/* loaded from: GraphQLQuestionPollStage.class */
public enum GraphQLQuestionPollStage {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    CLOSED("CLOSED"),
    /* JADX INFO: Fake field, exist only in values array */
    NOMINATING("NOMINATING"),
    /* JADX INFO: Fake field, exist only in values array */
    VOTING("VOTING");

    public final String serverValue;

    GraphQLQuestionPollStage(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
