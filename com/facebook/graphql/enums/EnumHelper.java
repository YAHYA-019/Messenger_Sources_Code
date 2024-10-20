package com.facebook.graphql.enums;

import java.util.Locale;

/* loaded from: EnumHelper.class */
public abstract class EnumHelper {
    public static Enum A00(Enum r301, String str) {
        if (str != null && str.length() != 0) {
            try {
                return Enum.valueOf(r301.getClass(), str.toUpperCase(Locale.US));
            } catch (IllegalArgumentException unused) {
            }
        }
        return r301;
    }
}
