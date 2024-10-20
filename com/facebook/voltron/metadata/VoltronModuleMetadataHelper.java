package com.facebook.voltron.metadata;

import X.0fH;
import X.AnonymousClass001;

/* loaded from: VoltronModuleMetadataHelper.class */
public class VoltronModuleMetadataHelper {
    public static int getBase62ClassName(String str) {
        int i;
        int i2 = 0;
        for (int lastIndexOf = str.lastIndexOf(46) + 1; lastIndexOf < str.length(); lastIndexOf++) {
            i2 *= 62;
            char charAt = str.charAt(lastIndexOf);
            if (charAt >= '0') {
                if (charAt <= '9') {
                    i = charAt - '0';
                } else if (charAt >= 'A') {
                    if (charAt <= 'Z') {
                        i = (charAt - 'A') + 10;
                    } else if (charAt >= 'a' && charAt <= 'z') {
                        i = (charAt - 'a') + 10 + 26;
                    }
                }
                i2 += i;
            }
        }
        return i2;
    }

    public static int getModuleRangeIndexForRedexClassName(int i, int[] iArr, int i2, int i3) {
        int i4;
        int i5 = -1;
        if (i2 <= i3) {
            int i6 = (i2 + i3) / 2;
            int i7 = i6 * 2;
            int i8 = i7 + 1;
            int i9 = iArr[i7];
            if (i9 == -1 || (i4 = iArr[i8]) == -1) {
                0fH.A0n("VoltronModuleMetadataHelper", "Invalid range in module range index");
                return -1;
            }
            if (i <= i4) {
                return i < i9 ? getModuleRangeIndexForRedexClassName(i, iArr, i2, i6 - 1) : i6;
            }
            i5 = getModuleRangeIndexForRedexClassName(i, iArr, i6 + 1, i3);
        }
        return i5;
    }

    public static int getModuleRangeIndexForRedexClassName(String str, int[] iArr) {
        return getModuleRangeIndexForRedexClassName(getBase62ClassName(str), iArr, 0, (iArr.length / 2) - 1);
    }

    public static String getPackageNameForClass(String str) {
        if (str.isEmpty()) {
            throw AnonymousClass001.A0L("Class name is empty");
        }
        if (str.startsWith("X.")) {
            return "X";
        }
        if (Character.isLowerCase(str.codePointAt(0))) {
            int length = str.length() - 1;
            int indexOf = str.indexOf(46);
            while (true) {
                int i = indexOf;
                if (i <= 0 || i >= length) {
                    break;
                }
                int i2 = i + 1;
                if (!Character.isLowerCase(str.codePointAt(i2))) {
                    return str.substring(0, i);
                }
                indexOf = str.indexOf(46, i2);
            }
        }
        return "";
    }

    public static String getShortNameForClass(String str, String str2) {
        if (!str2.isEmpty()) {
            str = str.substring(str2.length() + 1);
        }
        return str;
    }
}
