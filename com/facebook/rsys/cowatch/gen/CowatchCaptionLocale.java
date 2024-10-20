package com.facebook.rsys.cowatch.gen;

import X.1BL;
import X.2JQ;
import X.7zN;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.GOq;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: CowatchCaptionLocale.class */
public class CowatchCaptionLocale {
    public static 2JQ CONVERTER = IR0.A00(64);
    public static long sMcfTypeId;
    public final String captionsUrl;
    public final String locale;
    public final String localizedCountry;
    public final String localizedCreationMethod;
    public final String localizedLanguage;

    public CowatchCaptionLocale(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        this.locale = str;
        this.localizedLanguage = str2;
        this.localizedCountry = str3;
        this.localizedCreationMethod = str4;
        this.captionsUrl = str5;
    }

    public static native CowatchCaptionLocale createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchCaptionLocale)) {
                return false;
            }
            CowatchCaptionLocale cowatchCaptionLocale = (CowatchCaptionLocale) obj;
            if (!this.locale.equals(cowatchCaptionLocale.locale)) {
                return false;
            }
            String str = this.localizedLanguage;
            String str2 = cowatchCaptionLocale.localizedLanguage;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.localizedCountry;
            String str4 = cowatchCaptionLocale.localizedCountry;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.localizedCreationMethod;
            String str6 = cowatchCaptionLocale.localizedCreationMethod;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            String str7 = this.captionsUrl;
            String str8 = cowatchCaptionLocale.captionsUrl;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((AbstractC2326GOr.A07(this.locale) + 1BL.A05(this.localizedLanguage)) * 31) + 1BL.A05(this.localizedCountry)) * 31) + 1BL.A05(this.localizedCreationMethod)) * 31) + 7zN.A05(this.captionsUrl);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CowatchCaptionLocale{locale=");
        A0k.append(this.locale);
        A0k.append(",localizedLanguage=");
        A0k.append(this.localizedLanguage);
        A0k.append(",localizedCountry=");
        A0k.append(this.localizedCountry);
        A0k.append(",localizedCreationMethod=");
        A0k.append(this.localizedCreationMethod);
        A0k.append(",captionsUrl=");
        return GOq.A12(this.captionsUrl, A0k);
    }
}
