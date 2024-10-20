package com.google.common.base;

/* loaded from: Ascii.class */
public abstract class Ascii {
    public static boolean equalsIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        char c;
        int length = charSequence.length();
        if (charSequence != charSequence2) {
            if (length != charSequence2.length()) {
                return false;
            }
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    break;
                }
                if (charSequence.charAt(i2) != charSequence2.charAt(i2) && ((c = (char) ((r0 | ' ') - 97)) >= 26 || c != ((char) ((r0 | ' ') - 97)))) {
                    return false;
                }
                i = i2 + 1;
            }
        }
        return true;
    }

    public static String toLowerCase(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                break;
            }
            char charAt = str.charAt(i2);
            if (charAt < 'A' || charAt > 'Z') {
                i = i2 + 1;
            } else {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c = charArray[i2];
                    if (c >= 'A' && c <= 'Z') {
                        charArray[i2] = (char) (c ^ ' ');
                    }
                    i2++;
                }
                str = String.valueOf(charArray);
            }
        }
        return str;
    }

    public static String toUpperCase(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                break;
            }
            char charAt = str.charAt(i2);
            if (charAt < 'a' || charAt > 'z') {
                i = i2 + 1;
            } else {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c = charArray[i2];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i2] = (char) (c ^ ' ');
                    }
                    i2++;
                }
                str = String.valueOf(charArray);
            }
        }
        return str;
    }
}
