package com.facebook.hermes.unicode;

import X.AbM;
import X.AnonymousClass001;
import java.text.Collator;
import java.text.DateFormat;
import java.text.Normalizer;
import java.util.Locale;

/* loaded from: AndroidUnicodeUtils.class */
public class AndroidUnicodeUtils {
    public static String convertToCase(String str, int i, boolean z) {
        Locale locale = z ? Locale.getDefault() : Locale.ENGLISH;
        if (i == 0) {
            return str.toUpperCase(locale);
        }
        if (i == 1) {
            return str.toLowerCase(locale);
        }
        throw AnonymousClass001.A0T("Invalid target case");
    }

    public static String dateFormat(double d, boolean z, boolean z2) {
        DateFormat timeInstance;
        if (z) {
            timeInstance = z2 ? DateFormat.getDateTimeInstance(2, 2) : DateFormat.getDateInstance(2);
        } else {
            if (!z2) {
                throw AnonymousClass001.A0T("Bad dateFormat configuration");
            }
            timeInstance = DateFormat.getTimeInstance(2);
        }
        return AbM.A12(timeInstance, (long) d);
    }

    public static int localeCompare(String str, String str2) {
        return Collator.getInstance().compare(str, str2);
    }

    public static String normalize(String str, int i) {
        Normalizer.Form form;
        if (i == 0) {
            form = Normalizer.Form.NFC;
        } else if (i == 1) {
            form = Normalizer.Form.NFD;
        } else if (i == 2) {
            form = Normalizer.Form.NFKC;
        } else {
            if (i != 3) {
                throw AnonymousClass001.A0T("Invalid form");
            }
            form = Normalizer.Form.NFKD;
        }
        return Normalizer.normalize(str, form);
    }
}
