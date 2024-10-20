package com.facebook.phonenumbers;

import X.0Pz;
import X.AnonymousClass001;
import android.util.Log;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.facebook.phonenumbers.Phonenumber$PhoneNumber;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.lang.Character;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: PhoneNumberMatcher.class */
public final class PhoneNumberMatcher implements Iterator {
    public static final Pattern LEAD_CLASS;
    public static final Pattern MATCHING_BRACKETS;
    public static final Pattern PATTERN;
    public final PhoneNumberUtil.Leniency leniency;
    public long maxTries;
    public final PhoneNumberUtil phoneUtil;
    public final String preferredRegion;
    public final CharSequence text;
    public static final Pattern PUB_PAGES = Pattern.compile("\\d{1,5}-+\\d{1,5}\\s{0,4}\\(\\d{1,4}");
    public static final Pattern SLASH_SEPARATED_DATES = Pattern.compile("(?:(?:[0-3]?\\d/[01]?\\d)|(?:[01]?\\d/[0-3]?\\d))/(?:[12]\\d)?\\d{2}");
    public static final Pattern TIME_STAMPS = Pattern.compile("[12]\\d{3}[-/]?[01]\\d[-/]?[0-3]\\d +[0-2]\\d$");
    public static final Pattern TIME_STAMPS_SUFFIX = Pattern.compile(":[0-5]\\d");
    public static final Pattern[] INNER_MATCHES = {Pattern.compile("/+(.*)"), Pattern.compile("(\\([^(]*)"), Pattern.compile("(?:\\p{Z}-|-\\p{Z})\\p{Z}*(.+)"), Pattern.compile("[‒-―－]\\p{Z}*(.+)"), Pattern.compile("\\.+\\p{Z}*([^.]+)"), Pattern.compile("\\p{Z}+(\\P{Z}+)")};
    public State state = State.NOT_READY;
    public PhoneNumberMatch lastMatch = null;
    public int searchIndex = 0;

    /* loaded from: PhoneNumberMatcher$State.class */
    public enum State {
        NOT_READY,
        READY,
        DONE
    }

    static {
        String A0o = 0Pz.A0o("{", InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "}", 0, 3);
        StringBuilder sb = new StringBuilder();
        sb.append("(?:[");
        sb.append("(\\[（［");
        sb.append("])?(?:");
        sb.append("[^(\\[（［)\\]）］]");
        sb.append("+[");
        sb.append(")\\]）］");
        sb.append("])?");
        sb.append("[^(\\[（［)\\]）］]");
        sb.append("+(?:[");
        sb.append("(\\[（［");
        sb.append("]");
        sb.append("[^(\\[（［)\\]）］]");
        sb.append("+[");
        sb.append(")\\]）］");
        sb.append("])");
        sb.append(A0o);
        sb.append("[^(\\[（［)\\]）］]");
        sb.append("*");
        MATCHING_BRACKETS = Pattern.compile(sb.toString());
        String A0o2 = 0Pz.A0o("{", InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "}", 0, 2);
        String A0o3 = 0Pz.A0o("{", InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "}", 0, 4);
        String A0o4 = 0Pz.A0o("{", InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "}", 0, 20);
        String A0W = 0Pz.A0W("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]", A0o3);
        String A0W2 = 0Pz.A0W("\\p{Nd}", 0Pz.A0o("{", InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "}", 1, 20));
        String A0j = 0Pz.A0j("[", "(\\[（［+＋", "]");
        LEAD_CLASS = Pattern.compile(A0j);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(?:");
        sb2.append(A0j);
        sb2.append(A0W);
        sb2.append(")");
        sb2.append(A0o2);
        sb2.append(A0W2);
        sb2.append("(?:");
        sb2.append(A0W);
        sb2.append(A0W2);
        sb2.append(")");
        sb2.append(A0o4);
        sb2.append("(?:");
        sb2.append(";ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|[xｘ#＃~～]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*(\\p{Nd}{1,7})#?|[- ]+(\\p{Nd}{1,5})#");
        sb2.append(")?");
        PATTERN = Pattern.compile(sb2.toString(), 66);
    }

    public PhoneNumberMatcher(PhoneNumberUtil phoneNumberUtil, String str, String str2, PhoneNumberUtil.Leniency leniency, long j) {
        if (phoneNumberUtil == null) {
            throw null;
        }
        this.phoneUtil = phoneNumberUtil;
        this.text = str == null ? "" : str;
        this.preferredRegion = str2;
        this.leniency = leniency;
        this.maxTries = Long.MAX_VALUE;
    }

    public static boolean isLatinLetter(char c) {
        if (!Character.isLetter(c) && Character.getType(c) != 6) {
            return false;
        }
        Character.UnicodeBlock of = Character.UnicodeBlock.of(c);
        return of.equals(Character.UnicodeBlock.BASIC_LATIN) || of.equals(Character.UnicodeBlock.LATIN_1_SUPPLEMENT) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_A) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_B) || of.equals(Character.UnicodeBlock.COMBINING_DIACRITICAL_MARKS);
    }

    private PhoneNumberMatch parseAndVerify(String str, int i) {
        try {
            if (!MATCHING_BRACKETS.matcher(str).matches() || PUB_PAGES.matcher(str).find()) {
                return null;
            }
            if (this.leniency.compareTo(PhoneNumberUtil.Leniency.VALID) >= 0) {
                if (i > 0 && !LEAD_CLASS.matcher(str).lookingAt()) {
                    char charAt = this.text.charAt(i - 1);
                    if (charAt == '%' || Character.getType(charAt) == 26 || isLatinLetter(charAt)) {
                        return null;
                    }
                }
                int length = str.length() + i;
                if (length < this.text.length()) {
                    char charAt2 = this.text.charAt(length);
                    if (charAt2 == '%' || Character.getType(charAt2) == 26 || isLatinLetter(charAt2)) {
                        return null;
                    }
                }
            }
            Phonenumber$PhoneNumber parseAndKeepRawInput = this.phoneUtil.parseAndKeepRawInput(str, this.preferredRegion);
            if (this.phoneUtil.data.getRegionCodeForCountryCallingCode(parseAndKeepRawInput.countryCode_).equals("IL") && this.phoneUtil.getNationalSignificantNumber(parseAndKeepRawInput).length() == 4) {
                if (i == 0) {
                    return null;
                }
                if (i > 0 && this.text.charAt(i - 1) != '*') {
                    return null;
                }
            }
            if (!this.leniency.verify(parseAndKeepRawInput, str, this.phoneUtil)) {
                return null;
            }
            parseAndKeepRawInput.hasCountryCodeSource = false;
            parseAndKeepRawInput.countryCodeSource_ = Phonenumber$PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN;
            parseAndKeepRawInput.hasRawInput = false;
            parseAndKeepRawInput.rawInput_ = "";
            parseAndKeepRawInput.hasPreferredDomesticCarrierCode = false;
            parseAndKeepRawInput.preferredDomesticCarrierCode_ = "";
            return new PhoneNumberMatch(i, str, parseAndKeepRawInput);
        } catch (NumberParseException unused) {
            return null;
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        PhoneNumberMatch phoneNumberMatch;
        State state = this.state;
        if (state == State.NOT_READY) {
            int i = this.searchIndex;
            Matcher matcher = PATTERN.matcher(this.text);
            loop0: while (this.maxTries > 0 && matcher.find(i)) {
                int start = matcher.start();
                CharSequence subSequence = this.text.subSequence(start, matcher.end());
                Pattern pattern = PhoneNumberUtil.LAZY_SECOND_NUMBER_START_PATTERN;
                if (pattern == null) {
                    Log.d("com.facebook.phonenumbers.PhoneNumberUtil", "getSecondNumberStartPattern()");
                    pattern = Pattern.compile("[\\\\/] *x", 0);
                }
                PhoneNumberUtil.LAZY_SECOND_NUMBER_START_PATTERN = pattern;
                Matcher matcher2 = pattern.matcher(subSequence);
                if (matcher2.find()) {
                    subSequence = subSequence.subSequence(0, matcher2.start());
                }
                if (!SLASH_SEPARATED_DATES.matcher(subSequence).find()) {
                    if (TIME_STAMPS.matcher(subSequence).find()) {
                        if (TIME_STAMPS_SUFFIX.matcher(this.text.toString().substring(subSequence.length() + start)).lookingAt()) {
                            continue;
                        }
                    }
                    String charSequence = subSequence.toString();
                    phoneNumberMatch = parseAndVerify(charSequence, start);
                    if (phoneNumberMatch != null) {
                        break;
                    }
                    Pattern[] patternArr = INNER_MATCHES;
                    int i2 = 0;
                    do {
                        Matcher matcher3 = patternArr[i2].matcher(charSequence);
                        boolean z = true;
                        while (matcher3.find() && this.maxTries > 0) {
                            if (z) {
                                Pattern unwantedEndCharPattern = PhoneNumberUtil.getUnwantedEndCharPattern();
                                String substring = charSequence.substring(0, matcher3.start());
                                Matcher matcher4 = unwantedEndCharPattern.matcher(substring);
                                if (matcher4.find()) {
                                    substring = substring.subSequence(0, matcher4.start());
                                }
                                phoneNumberMatch = parseAndVerify(substring.toString(), start);
                                if (phoneNumberMatch != null) {
                                    break loop0;
                                }
                                this.maxTries--;
                                z = false;
                            }
                            Pattern unwantedEndCharPattern2 = PhoneNumberUtil.getUnwantedEndCharPattern();
                            String group = matcher3.group(1);
                            Matcher matcher5 = unwantedEndCharPattern2.matcher(group);
                            if (matcher5.find()) {
                                group = group.subSequence(0, matcher5.start());
                            }
                            phoneNumberMatch = parseAndVerify(group.toString(), matcher3.start(1) + start);
                            if (phoneNumberMatch != null) {
                                break loop0;
                            }
                            this.maxTries--;
                        }
                        i2++;
                    } while (i2 < 6);
                }
                i = start + subSequence.length();
                this.maxTries--;
            }
            phoneNumberMatch = null;
            this.lastMatch = phoneNumberMatch;
            if (phoneNumberMatch == null) {
                state = State.DONE;
            } else {
                this.searchIndex = phoneNumberMatch.start + phoneNumberMatch.rawString.length();
                state = State.READY;
            }
            this.state = state;
        }
        boolean z2 = false;
        if (state == State.READY) {
            z2 = true;
        }
        return z2;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        PhoneNumberMatch phoneNumberMatch = this.lastMatch;
        this.lastMatch = null;
        this.state = State.NOT_READY;
        return phoneNumberMatch;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw AnonymousClass001.A0p();
    }
}
