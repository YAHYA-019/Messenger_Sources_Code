package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBMagicalMessengerTaskName.class */
public enum GraphQLXFBMagicalMessengerTaskName {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    CATCH_UP("CATCH_UP"),
    /* JADX INFO: Fake field, exist only in values array */
    DELEGATE_TASKS("DELEGATE_TASKS"),
    /* JADX INFO: Fake field, exist only in values array */
    FIND_A_TIME("FIND_A_TIME"),
    /* JADX INFO: Fake field, exist only in values array */
    FIND_IMPORTANT_INFO("FIND_IMPORTANT_INFO"),
    /* JADX INFO: Fake field, exist only in values array */
    GET_INFO("GET_INFO"),
    /* JADX INFO: Fake field, exist only in values array */
    IMAGINE("IMAGINE"),
    /* JADX INFO: Fake field, exist only in values array */
    INTENT_DETECTOR("INTENT_DETECTOR"),
    /* JADX INFO: Fake field, exist only in values array */
    JUST_FOR_US("JUST_FOR_US"),
    /* JADX INFO: Fake field, exist only in values array */
    MAGIC_ANSWER("MAGIC_ANSWER"),
    /* JADX INFO: Fake field, exist only in values array */
    MAGIC_LISTS("MAGIC_LISTS"),
    /* JADX INFO: Fake field, exist only in values array */
    MAGIC_MEME("MAGIC_MEME"),
    /* JADX INFO: Fake field, exist only in values array */
    MAGIC_PROMPT("MAGIC_PROMPT"),
    /* JADX INFO: Fake field, exist only in values array */
    MIRROR_AND_REFLECT_IMAGE("MIRROR_AND_REFLECT_IMAGE"),
    /* JADX INFO: Fake field, exist only in values array */
    MIRROR_AND_REFLECT_MESSAGE("MIRROR_AND_REFLECT_MESSAGE"),
    /* JADX INFO: Fake field, exist only in values array */
    MOOD_HOROSCOPE("MOOD_HOROSCOPE"),
    /* JADX INFO: Fake field, exist only in values array */
    PERSONALITIES("PERSONALITIES"),
    /* JADX INFO: Fake field, exist only in values array */
    PICK_A_PLACE("PICK_A_PLACE"),
    /* JADX INFO: Fake field, exist only in values array */
    POLAR_BEAR("POLAR_BEAR"),
    /* JADX INFO: Fake field, exist only in values array */
    PROBLEM_SOLVER("PROBLEM_SOLVER"),
    /* JADX INFO: Fake field, exist only in values array */
    REMINDER("REMINDER"),
    /* JADX INFO: Fake field, exist only in values array */
    STICKER("STICKER"),
    /* JADX INFO: Fake field, exist only in values array */
    SUGGESTED_ACTIONS("SUGGESTED_ACTIONS"),
    /* JADX INFO: Fake field, exist only in values array */
    SUGGESTED_SEARCH("SUGGESTED_SEARCH"),
    /* JADX INFO: Fake field, exist only in values array */
    SUMMARIES("SUMMARIES");

    public final String serverValue;

    GraphQLXFBMagicalMessengerTaskName(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
