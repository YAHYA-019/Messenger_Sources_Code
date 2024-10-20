package X;

import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.lang.Character;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.StringTokenizer;

/* renamed from: X.1tm, reason: invalid class name */
/* loaded from: 1tm.class */
public final class C1tm {
    public final int A00;
    public final HashSet A01;
    public final HashSet A02;
    public final HashSet A03;
    public final HashSet A04;
    public final Locale A05;
    public final String A06;
    public static final String A09 = Locale.JAPANESE.getLanguage().toLowerCase();
    public static final String A0A = Locale.KOREAN.getLanguage().toLowerCase();
    public static final String A08 = Locale.CHINESE.getLanguage().toLowerCase();
    public static final String[] A07 = {"강전", "남궁", "독고", "동방", "망절", "사공", "서문", "선우", "소봉", "어금", "장곡", "제갈", "황보"};

    public C1tm(String str, String str2, String str3, String str4, Locale locale) {
        locale = locale == null ? Locale.getDefault() : locale;
        this.A05 = locale;
        this.A03 = A01(str, locale);
        this.A02 = A01(str2, locale);
        HashSet A01 = A01(str3, locale);
        this.A04 = A01;
        this.A01 = A01(str4, locale);
        this.A06 = locale.getLanguage().toLowerCase();
        int i = 0;
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            int length = ((String) it.next()).length();
            if (length > i) {
                i = length;
            }
        }
        this.A00 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x02a1, code lost:
    
        if (r301.A04.contains(r311.toUpperCase(r301.A05)) == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0115, code lost:
    
        if (r301.A04.contains(r311.toUpperCase(r301.A05)) == false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A00(X.C1tm r301, java.lang.String r302, java.lang.String r303, java.lang.String r304, java.lang.String r305, java.lang.String r306, java.lang.String r307, boolean r308, boolean r309) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1tm.A00(X.1tm, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):java.lang.String");
    }

    public static HashSet A01(String str, Locale locale) {
        HashSet hashSet = new HashSet();
        if (str != null) {
            String[] split = str.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= split.length) {
                    break;
                }
                hashSet.add(split[i2].trim().toUpperCase(locale));
                i = i2 + 1;
            }
        }
        return hashSet;
    }

    public static void A02(String str) {
        Character.UnicodeBlock of;
        if (str == null) {
            return;
        }
        int length = str.length();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            int codePointAt = Character.codePointAt(str, i2);
            if (Character.isLetter(codePointAt) && ((of = Character.UnicodeBlock.of(codePointAt)) == Character.UnicodeBlock.KATAKANA || of == Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS || of == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS || of == Character.UnicodeBlock.HIRAGANA || of == Character.UnicodeBlock.HANGUL_SYLLABLES || of == Character.UnicodeBlock.HANGUL_JAMO || of == Character.UnicodeBlock.HANGUL_COMPATIBILITY_JAMO || of == Character.UnicodeBlock.BASIC_LATIN || of == Character.UnicodeBlock.LATIN_1_SUPPLEMENT || of == Character.UnicodeBlock.LATIN_EXTENDED_A || of == Character.UnicodeBlock.LATIN_EXTENDED_B || of == Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL)) {
                return;
            } else {
                i = i2 + Character.charCount(codePointAt);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        if (X.C1tm.A0A.equals(r0) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A03(int r302) {
        /*
            r301 = this;
            r0 = 3
            r303 = r0
            r0 = 5
            r304 = r0
            r0 = 4
            r305 = r0
            r0 = r302
            if (r0 != 0) goto L4e
            java.lang.String r0 = X.C1tm.A09
            r306 = r0
            r0 = r301
            java.lang.String r0 = r0.A06
            r307 = r0
            r0 = r306
            r1 = r307
            boolean r0 = r0.equals(r1)
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L87
            java.lang.String r0 = X.C1tm.A0A
            r306 = r0
            r0 = r306
            r1 = r307
            boolean r0 = r0.equals(r1)
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L83
            java.lang.String r0 = X.C1tm.A08
            r306 = r0
            r0 = r306
            r1 = r307
            boolean r0 = r0.equals(r1)
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L85
            r0 = 1
            r302 = r0
        L4c:
            r0 = r302
            return r0
        L4e:
            r0 = 2
            r308 = r0
            r0 = r302
            r1 = r308
            if (r0 != r1) goto L4c
            java.lang.String r0 = X.C1tm.A09
            r306 = r0
            r0 = r301
            java.lang.String r0 = r0.A06
            r307 = r0
            r0 = r306
            r1 = r307
            boolean r0 = r0.equals(r1)
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L87
            java.lang.String r0 = X.C1tm.A0A
            r306 = r0
            r0 = r306
            r1 = r307
            boolean r0 = r0.equals(r1)
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L85
        L83:
            r0 = r304
            return r0
        L85:
            r0 = r303
            return r0
        L87:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1tm.A03(int):int");
    }

    public int A04(String str) {
        int i = 0;
        if (str == null) {
            return 0;
        }
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            int codePointAt = Character.codePointAt(str, i);
            if (Character.isLetter(codePointAt)) {
                Character.UnicodeBlock of = Character.UnicodeBlock.of(codePointAt);
                if (of != Character.UnicodeBlock.BASIC_LATIN && of != Character.UnicodeBlock.LATIN_1_SUPPLEMENT && of != Character.UnicodeBlock.LATIN_EXTENDED_A && of != Character.UnicodeBlock.LATIN_EXTENDED_B && of != Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL) {
                    if (of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B || of == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || of == Character.UnicodeBlock.CJK_RADICALS_SUPPLEMENT || of == Character.UnicodeBlock.CJK_COMPATIBILITY || of == Character.UnicodeBlock.CJK_COMPATIBILITY_FORMS || of == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || of == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT) {
                        while (true) {
                            i += Character.charCount(codePointAt);
                            if (i >= length) {
                                return 2;
                            }
                            codePointAt = Character.codePointAt(str, i);
                            if (Character.isLetter(codePointAt)) {
                                Character.UnicodeBlock of2 = Character.UnicodeBlock.of(codePointAt);
                                if (of2 != Character.UnicodeBlock.KATAKANA && of2 != Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS && of2 != Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS && of2 != Character.UnicodeBlock.HIRAGANA) {
                                    if (of2 == Character.UnicodeBlock.HANGUL_SYLLABLES || of2 == Character.UnicodeBlock.HANGUL_JAMO || of2 == Character.UnicodeBlock.HANGUL_COMPATIBILITY_JAMO) {
                                        break;
                                    }
                                } else {
                                    return 4;
                                }
                            }
                        }
                    } else {
                        if (of == Character.UnicodeBlock.KATAKANA || of == Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS || of == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS || of == Character.UnicodeBlock.HIRAGANA) {
                            return 4;
                        }
                        if (of != Character.UnicodeBlock.HANGUL_SYLLABLES) {
                            if (of != Character.UnicodeBlock.HANGUL_JAMO) {
                                if (of == Character.UnicodeBlock.HANGUL_COMPATIBILITY_JAMO) {
                                }
                            }
                        }
                    }
                    i2 = 5;
                    break;
                }
                i2 = 1;
            }
            i += Character.charCount(codePointAt);
        }
        return i2;
    }

    public String A05(C1tl c1tl) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z;
        boolean z2;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String substring;
        int i;
        int i2;
        int i3;
        int i4;
        String str11 = c1tl.A07;
        if (TextUtils.isEmpty(c1tl.A03) && TextUtils.isEmpty(c1tl.A01) && TextUtils.isEmpty(c1tl.A04) && !TextUtils.isEmpty(c1tl.A02)) {
            String str12 = c1tl.A02;
            int i5 = c1tl.A00;
            if (str12 != null) {
                c1tl.A00 = i5;
                if (i5 == 3) {
                    StringTokenizer stringTokenizer = new StringTokenizer(str12);
                    while (stringTokenizer.hasMoreTokens()) {
                        String nextToken = stringTokenizer.nextToken();
                        String str13 = c1tl.A03;
                        if (str13 != null) {
                            if (c1tl.A01 == null) {
                                c1tl.A01 = str13;
                            } else {
                                String str14 = c1tl.A04;
                                if (str14 == null) {
                                    c1tl.A04 = str13;
                                } else {
                                    c1tl.A04 = 0Pz.A0W(str14, str13);
                                }
                            }
                        }
                        c1tl.A03 = nextToken;
                    }
                    if (c1tl.A03 != null && c1tl.A01 == null && c1tl.A04 == null) {
                        int length = str12.length();
                        if (length == 2) {
                            c1tl.A01 = str12.substring(0, 1);
                            substring = str12.substring(1);
                        } else if (length == 3) {
                            c1tl.A01 = str12.substring(0, 1);
                            c1tl.A04 = str12.substring(1, 2);
                            substring = str12.substring(2);
                        } else if (length == 4) {
                            c1tl.A01 = str12.substring(0, 2);
                            c1tl.A04 = str12.substring(2, 3);
                            substring = str12.substring(3);
                        }
                        c1tl.A03 = substring;
                    }
                } else if (i5 == 4) {
                    StringTokenizer stringTokenizer2 = new StringTokenizer(str12);
                    while (stringTokenizer2.hasMoreTokens()) {
                        String nextToken2 = stringTokenizer2.nextToken();
                        String str15 = c1tl.A03;
                        if (str15 != null) {
                            if (c1tl.A01 == null) {
                                c1tl.A01 = str15;
                            } else {
                                nextToken2 = 0Pz.A0j(str15, " ", nextToken2);
                            }
                        }
                        c1tl.A03 = nextToken2;
                    }
                } else if (i5 != 5) {
                    1uX r0 = new 1uX(str12);
                    int i6 = r0.A03;
                    if (i6 != r0.A02) {
                        String str16 = r0.A04[i6];
                        if (this.A03.contains(str16.toUpperCase(this.A05))) {
                            int i7 = r0.A03;
                            if (((1 << i7) & r0.A01) != 0) {
                                str16 = 0Pz.A0J(str16, '.');
                            }
                            c1tl.A07 = str16;
                            r0.A03 = i7 + 1;
                        }
                    }
                    int i8 = r0.A02;
                    if (i8 > 2 && (i3 = r0.A03) != i8) {
                        String[] strArr = r0.A04;
                        int i9 = i8 - 1;
                        String str17 = strArr[i9];
                        if (i8 - i3 > 2) {
                            if (((1 << (i8 - 2)) & r0.A00) != 0) {
                                if (((1 << i9) & r0.A01) != 0) {
                                    str17 = 0Pz.A0J(str17, '.');
                                }
                                c1tl.A08 = str17;
                                i4 = r0.A02 - 1;
                                r0.A02 = i4;
                            }
                        }
                        int length2 = str17.length();
                        int i10 = this.A00;
                        if (length2 <= i10) {
                            Locale locale = this.A05;
                            String upperCase = str17.toUpperCase(locale);
                            HashSet hashSet = this.A04;
                            if (!hashSet.contains(upperCase)) {
                                i4 = r0.A02 - 1;
                                int i11 = r0.A01;
                                if (((1 << i4) & i11) != 0) {
                                    str17 = 0Pz.A0J(str17, '.');
                                }
                                String A0W = 0Pz.A0W(upperCase, ".");
                                while (true) {
                                    String str18 = A0W;
                                    if (str18.length() <= i10) {
                                        if (!hashSet.contains(str18)) {
                                            if (i4 == r0.A03) {
                                                break;
                                            }
                                            i4--;
                                            boolean z3 = true;
                                            if (((1 << i4) & i11) == 0) {
                                                z3 = false;
                                            }
                                            StringBuilder sb = new StringBuilder();
                                            String str19 = strArr[i4];
                                            if (z3) {
                                                sb.append(str19);
                                                sb.append(".");
                                            } else {
                                                sb.append(str19);
                                                sb.append(" ");
                                            }
                                            sb.append(str17);
                                            str17 = sb.toString();
                                            A0W = 0Pz.A0j(str19.toUpperCase(locale), ".", str18);
                                        } else {
                                            c1tl.A08 = str17;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                r0.A02 = i4;
                            }
                            c1tl.A08 = str17;
                            i4 = r0.A02 - 1;
                            r0.A02 = i4;
                        }
                    }
                    if (c1tl.A07 == null) {
                        int i12 = r0.A02;
                        int i13 = r0.A03;
                        if (i12 - i13 == 1) {
                            substring = r0.A04[i13];
                            c1tl.A03 = substring;
                        }
                    }
                    int i14 = r0.A03;
                    int i15 = r0.A02;
                    if (i14 != i15) {
                        int i16 = r0.A00;
                        if (((1 << i14) & i16) != 0) {
                            c1tl.A01 = r0.A04[i14];
                            i2 = i14 + 1;
                        } else {
                            int i17 = i14 + 1;
                            if (i17 < i15 && ((1 << i17) & i16) != 0) {
                                String[] strArr2 = r0.A04;
                                String upperCase2 = strArr2[i14].toUpperCase(this.A05);
                                HashSet hashSet2 = this.A02;
                                if (hashSet2.contains(upperCase2) || hashSet2.contains(0Pz.A0W(upperCase2, "."))) {
                                    int i18 = r0.A03;
                                    String str20 = strArr2[i18];
                                    if (((1 << i18) & r0.A01) != 0) {
                                        str20 = 0Pz.A0J(str20, '.');
                                    }
                                    c1tl.A01 = 0Pz.A0j(str20, " ", strArr2[i18 + 1]);
                                    i2 = i18 + 2;
                                }
                            }
                            String[] strArr3 = r0.A04;
                            int i19 = r0.A02 - 1;
                            c1tl.A01 = strArr3[i19];
                            r0.A02 = i19;
                            if (i19 - r0.A03 > 0) {
                                String str21 = strArr3[i19 - 1];
                                String upperCase3 = str21.toUpperCase(this.A05);
                                HashSet hashSet3 = this.A02;
                                if (hashSet3.contains(upperCase3) || hashSet3.contains(0Pz.A0W(upperCase3, "."))) {
                                    int i20 = r0.A02 - 1;
                                    if (((1 << i20) & r0.A01) != 0) {
                                        str21 = 0Pz.A0J(str21, '.');
                                    }
                                    c1tl.A01 = 0Pz.A0j(str21, " ", c1tl.A01);
                                    r0.A02 = i20;
                                }
                            }
                        }
                        r0.A03 = i2;
                    }
                    int i21 = r0.A03;
                    int i22 = r0.A02;
                    if (i21 != i22 && (i = i22 - i21) > 1 && (i == 2 || !this.A01.contains(r0.A04[i22 - 2].toUpperCase(this.A05)))) {
                        String[] strArr4 = r0.A04;
                        int i23 = r0.A02;
                        int i24 = i23 - 1;
                        String str22 = strArr4[i24];
                        c1tl.A04 = str22;
                        if (((1 << i24) & r0.A01) != 0) {
                            c1tl.A04 = 0Pz.A0J(str22, '.');
                        }
                        r0.A02 = i23 - 1;
                    }
                    int i25 = r0.A03;
                    int i26 = r0.A02;
                    if (i25 != i26) {
                        if (i26 - i25 == 1) {
                            substring = r0.A04[i25];
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            int i27 = i25;
                            while (true) {
                                int i28 = i27;
                                if (i28 >= i26) {
                                    break;
                                }
                                if (i28 != i25) {
                                    sb2.append(' ');
                                }
                                sb2.append(r0.A04[i28]);
                                if (((1 << i28) & r0.A01) != 0) {
                                    sb2.append('.');
                                }
                                i27 = i28 + 1;
                            }
                            substring = sb2.toString();
                        }
                        c1tl.A03 = substring;
                    }
                } else {
                    StringTokenizer stringTokenizer3 = new StringTokenizer(str12);
                    int i29 = 1;
                    if (stringTokenizer3.countTokens() <= 1) {
                        String[] strArr5 = A07;
                        int i30 = 0;
                        while (true) {
                            if (!str12.startsWith(strArr5[i30])) {
                                i30++;
                                if (i30 >= 13) {
                                    break;
                                }
                            } else {
                                i29 = 2;
                                break;
                            }
                        }
                        c1tl.A01 = str12.substring(0, i29);
                        if (str12.length() > i29) {
                            substring = str12.substring(i29);
                            c1tl.A03 = substring;
                        }
                    } else {
                        while (stringTokenizer3.hasMoreTokens()) {
                            String nextToken3 = stringTokenizer3.nextToken();
                            String str23 = c1tl.A03;
                            if (str23 != null) {
                                if (c1tl.A01 == null) {
                                    c1tl.A01 = str23;
                                } else {
                                    nextToken3 = 0Pz.A0j(str23, " ", nextToken3);
                                }
                            }
                            c1tl.A03 = nextToken3;
                        }
                    }
                }
            }
        }
        int i31 = c1tl.A00;
        if (i31 != 2 && i31 != 3) {
            if (i31 == 4) {
                str = c1tl.A01;
                z = true;
                z2 = false;
                str10 = str11;
                str9 = c1tl.A04;
                str8 = c1tl.A03;
                str7 = c1tl.A08;
                str6 = c1tl.A09;
                return A00(this, str10, str, str9, str8, str7, str6, z, z2);
            }
            if (i31 != 5) {
                str = c1tl.A03;
                str2 = c1tl.A04;
                str3 = c1tl.A01;
                str4 = c1tl.A08;
                str5 = c1tl.A09;
                z = true;
                str10 = str11;
                str9 = str2;
                str8 = str3;
                str7 = str4;
                str6 = str5;
                z2 = z;
                return A00(this, str10, str, str9, str8, str7, str6, z, z2);
            }
        }
        str = c1tl.A01;
        str2 = c1tl.A04;
        str3 = c1tl.A03;
        str4 = c1tl.A08;
        str5 = c1tl.A09;
        z = false;
        str10 = str11;
        str9 = str2;
        str8 = str3;
        str7 = str4;
        str6 = str5;
        z2 = z;
        return A00(this, str10, str, str9, str8, str7, str6, z, z2);
    }

    public String A06(C1tl c1tl) {
        return A00(this, null, c1tl.A05, null, c1tl.A06, c1tl.A09, null, true, false);
    }
}
