package com.facebook.spectrum;

import X.AnonymousClass001;

/* loaded from: SpectrumException.class */
public class SpectrumException extends Exception {
    public final String description;
    public final String location;
    public final String name;

    public SpectrumException(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, null);
    }

    public SpectrumException(String str, String str2, String str3, String str4, Exception exc) {
        super(str2, exc);
        this.name = str;
        this.location = str3;
        this.description = str4;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("SpectrumException{name='");
        A0k.append(this.name);
        A0k.append('\'');
        A0k.append(", message='");
        A0k.append(getMessage());
        A0k.append('\'');
        A0k.append(", location='");
        A0k.append(this.location);
        A0k.append('\'');
        A0k.append(", description='");
        A0k.append(this.description);
        A0k.append('\'');
        return AnonymousClass001.A0f(A0k);
    }
}
