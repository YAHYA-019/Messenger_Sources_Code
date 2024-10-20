package com.facebook.java2js;

/* loaded from: JSException.class */
public class JSException extends RuntimeException {
    public final String mStack;

    public JSException(String str, String str2) {
        super(str);
        this.mStack = str2;
    }

    public JSException(String str, String str2, Throwable th) {
        super(str, th);
        this.mStack = str2;
    }
}
