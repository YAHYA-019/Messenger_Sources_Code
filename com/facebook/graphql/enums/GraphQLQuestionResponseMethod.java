package com.facebook.graphql.enums;

/* loaded from: GraphQLQuestionResponseMethod.class */
public enum GraphQLQuestionResponseMethod {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIA_CHOOSE_ONE("CHOOSE_MULTIPLE"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIA_CHOOSE_ONE("CHOOSE_ONE"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIA_CHOOSE_ONE("GIF_CHOOSE_ONE"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIA_CHOOSE_ONE("IMAGE_CHOOSE_MULTIPLE"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIA_CHOOSE_ONE("IMAGE_CHOOSE_ONE"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIA_CHOOSE_ONE("MEDIA_CHOOSE_ONE"),
    MOST_LIKELY_TO("MOST_LIKELY_TO"),
    /* JADX INFO: Fake field, exist only in values array */
    NON_POLL("NON_POLL"),
    /* JADX INFO: Fake field, exist only in values array */
    PAGE_CHOOSE_MULTIPLE("PAGE_CHOOSE_MULTIPLE"),
    /* JADX INFO: Fake field, exist only in values array */
    RANKED("RANKED"),
    /* JADX INFO: Fake field, exist only in values array */
    VISUAL_TEXT_CHOOSE_ONE("VISUAL_TEXT_CHOOSE_ONE");

    public final String serverValue;

    GraphQLQuestionResponseMethod(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
