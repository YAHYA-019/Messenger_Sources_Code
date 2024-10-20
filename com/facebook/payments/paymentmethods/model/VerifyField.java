package com.facebook.payments.paymentmethods.model;

/* loaded from: VerifyField.class */
public enum VerifyField {
    ADDRESS("ADDRESS"),
    ZIP("ZIP"),
    EXP("CARD_EXPIRATION"),
    CSC("CSC"),
    CARD_HOLDER_NAME("CARD_HOLDER_NAME"),
    UNKNOWN("UNSET_OR_UNRECOGNIZED_ENUM_VALUE");

    public final String mValue;

    VerifyField(String str) {
        this.mValue = str;
    }

    public static VerifyField forValue(String str) {
        VerifyField verifyField;
        VerifyField[] values = values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                verifyField = UNKNOWN;
                break;
            }
            verifyField = values[i2];
            if (verifyField.mValue.equalsIgnoreCase(str)) {
                break;
            }
            i = i2 + 1;
        }
        return verifyField;
    }
}
