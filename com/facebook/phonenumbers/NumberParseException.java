package com.facebook.phonenumbers;

import X.AnonymousClass001;

/* loaded from: NumberParseException.class */
public class NumberParseException extends Exception {
    public ErrorType errorType;
    public String message;

    /* loaded from: NumberParseException$ErrorType.class */
    public enum ErrorType {
        INVALID_COUNTRY_CODE,
        NOT_A_NUMBER,
        TOO_SHORT_AFTER_IDD,
        TOO_SHORT_NSN,
        TOO_LONG
    }

    public NumberParseException(ErrorType errorType, String str) {
        super(str);
        this.message = str;
        this.errorType = errorType;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Error type: ");
        A0k.append(this.errorType);
        A0k.append(". ");
        return AnonymousClass001.A0d(this.message, A0k);
    }
}
