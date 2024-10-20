package com.facebook.graphql.enums;

/* loaded from: GraphQLAutofillQRTTestGroup.class */
public enum GraphQLAutofillQRTTestGroup {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    AUTOFILL_BLACKOUT("AUTOFILL_BLACKOUT"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTACT_AUTOFILL_BLACKOUT("CONTACT_AUTOFILL_BLACKOUT"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTROL("CONTROL"),
    /* JADX INFO: Fake field, exist only in values array */
    NUX_BLACKOUT("NUX_BLACKOUT");

    public final String serverValue;

    GraphQLAutofillQRTTestGroup(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
