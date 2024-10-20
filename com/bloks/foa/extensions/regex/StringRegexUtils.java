package com.bloks.foa.extensions.regex;

import X.C0il;

/* loaded from: StringRegexUtils.class */
public final class StringRegexUtils {
    public static final StringRegexUtils INSTANCE = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.bloks.foa.extensions.regex.StringRegexUtils] */
    static {
        C0il.A0B("stringregex-jni");
    }

    public static final native boolean matchesRegex(String str, String str2);
}
