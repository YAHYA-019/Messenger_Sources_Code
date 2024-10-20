package com.facebook.resources.compat;

import X.0CU;
import X.11T;
import X.AnonymousClass001;
import android.content.res.Resources;

/* loaded from: RedexResourcesCompat.class */
public final class RedexResourcesCompat {
    public static final int getIdentifier(Resources resources, String str, String str2, String str3) {
        int identifier;
        if (resources == null) {
            throw AnonymousClass001.A0Q("Resources null");
        }
        int i = 0;
        if (str == null || str.length() == 0) {
            return 0;
        }
        if (str.charAt(0) == '^') {
            identifier = resources.getIdentifier(str, str2, str3);
        } else {
            int A00 = 0CU.A00(str, ':', 0);
            if (A00 > -1) {
                str3 = str.substring(0, A00);
                11T.A0A(str3);
            }
            int A002 = 0CU.A00(str, '/', 0);
            if (A002 > -1) {
                if (A00 > 0) {
                    i = A00 + 1;
                }
                str2 = str.substring(i, A002);
                11T.A0A(str2);
            }
            if (A00 > -1 || A002 > -1) {
                str = AnonymousClass001.A0W(Math.max(A00, A002), str);
                11T.A0A(str);
            }
            identifier = resources.getIdentifier(str, str2, str3);
            if (identifier == 0) {
                identifier = 0;
                if (str2 != null) {
                    int length = str2.length() + 1;
                    StringBuilder A0l = AnonymousClass001.A0l(length + 1);
                    A0l.append(str2);
                    A0l.append(".");
                    int i2 = 2;
                    do {
                        A0l.setLength(length);
                        A0l.append(i2);
                        int identifier2 = resources.getIdentifier(str, 11T.A02(A0l), str3);
                        if (identifier2 != 0) {
                            return identifier2;
                        }
                        i2++;
                    } while (i2 < 7);
                }
            }
        }
        return identifier;
    }

    public static final String getResourceTypeName(Resources resources, int i) {
        int length;
        11T.A0F(resources, 0);
        String resourceTypeName = resources.getResourceTypeName(i);
        if (resourceTypeName == null || (length = resourceTypeName.length()) == 0) {
            11T.A0D(resourceTypeName);
        } else {
            int i2 = 0;
            for (int i3 = length - 1; -1 < i3; i3--) {
                char charAt = resourceTypeName.charAt(i3);
                if (!Character.isDigit(charAt) && charAt != '.') {
                    break;
                }
                i2++;
            }
            if (i2 != 0) {
                String substring = resourceTypeName.substring(0, length - i2);
                11T.A0A(substring);
                return substring;
            }
        }
        return resourceTypeName;
    }
}
