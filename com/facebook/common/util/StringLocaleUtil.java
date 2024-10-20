package com.facebook.common.util;

import java.util.Locale;

/* loaded from: StringLocaleUtil.class */
public abstract class StringLocaleUtil {
    public static final String toLowerCaseLocaleSafe(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(Locale.US);
    }

    public static final String toUpperCaseLocaleSafe(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase(Locale.US);
    }
}
