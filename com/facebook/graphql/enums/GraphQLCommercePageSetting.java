package com.facebook.graphql.enums;

/* loaded from: GraphQLCommercePageSetting.class */
public enum GraphQLCommercePageSetting {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    COMMERCE_FAQ_ENABLED("COMMERCE_FAQ_ENABLED"),
    /* JADX INFO: Fake field, exist only in values array */
    COMMERCE_NUX_ENABLED("COMMERCE_NUX_ENABLED"),
    /* JADX INFO: Fake field, exist only in values array */
    COMPOSER_INPUT_DISABLED("COMPOSER_INPUT_DISABLED"),
    /* JADX INFO: Fake field, exist only in values array */
    IN_MESSENGER_SHOPPING_ENABLED("IN_MESSENGER_SHOPPING_ENABLED"),
    /* JADX INFO: Fake field, exist only in values array */
    NULL_STATE_CTA_BUTTON_ALWAYS_ENABLED("NULL_STATE_CTA_BUTTON_ALWAYS_ENABLED"),
    /* JADX INFO: Fake field, exist only in values array */
    STRUCTURED_MENU_ENABLED("STRUCTURED_MENU_ENABLED"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_CONTROL_TOPIC_MANAGE_ENABLED("USER_CONTROL_TOPIC_MANAGE_ENABLED");

    public final String serverValue;

    GraphQLCommercePageSetting(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
