package X;

import android.text.TextUtils;

/* renamed from: X.198, reason: invalid class name */
/* loaded from: 198.class */
public final class AnonymousClass198 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public AnonymousClass198(String str, String str2, String str3, String str4) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A00 = str4;
    }

    public static AnonymousClass198 A00(String str) {
        int i;
        String substring;
        String substring2;
        AnonymousClass197 anonymousClass197 = new AnonymousClass197();
        int indexOf = str.contains("|") ? str.indexOf("|") : str.indexOf("#");
        if (indexOf < 0) {
            anonymousClass197.A02 = str;
        } else {
            anonymousClass197.A02 = indexOf == 0 ? "" : AnonymousClass001.A0c(str, indexOf);
            String substring3 = str.substring(indexOf);
            if (substring3.startsWith("|")) {
                int length = substring3.length();
                i = 12;
                if (length == 12) {
                    anonymousClass197.A01(substring3.substring(1));
                } else if (length == 23) {
                    substring = substring3.substring(1, 12);
                    anonymousClass197.A01(substring);
                    substring2 = substring3.substring(i);
                    if (!TextUtils.isEmpty(substring2) && substring2.length() == 11) {
                        anonymousClass197.A00 = substring2;
                    }
                }
            }
            if (substring3.startsWith("#")) {
                int length2 = substring3.length();
                if (length2 == 23) {
                    anonymousClass197.A00(substring3.substring(1));
                } else {
                    i = 34;
                    if (length2 == 45) {
                        anonymousClass197.A00(substring3.substring(1, 23));
                        substring = substring3.substring(23, 34);
                        anonymousClass197.A01(substring);
                        substring2 = substring3.substring(i);
                        if (!TextUtils.isEmpty(substring2)) {
                            anonymousClass197.A00 = substring2;
                        }
                    }
                }
            }
        }
        return new AnonymousClass198(anonymousClass197.A02, anonymousClass197.A03, anonymousClass197.A01, anonymousClass197.A00);
    }
}
