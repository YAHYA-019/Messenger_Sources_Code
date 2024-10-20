package X;

import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import com.facebook.phonenumbers.PhoneNumberMatch;
import com.facebook.phonenumbers.PhoneNumberMatcher;
import com.facebook.phonenumbers.PhoneNumberUtil;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.53t, reason: invalid class name */
/* loaded from: 53t.class */
public abstract class C53t {
    public static Pattern A00;
    public static final String[] A03 = {"http://", "https://", "rtsp://"};
    public static final String[] A01 = {"mailto:"};
    public static final String[] A02 = {"tel:"};
    public static final Comparator A04 = new AHV(3);

    public static final ArrayList A00(Spannable spannable, C5um c5um, int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            Pattern pattern = A00;
            if (pattern == null) {
                pattern = 0LT.A00("FbLinkify#getWebUrlPattern", "(?=(?:\\b|$|^)(.{1,2048})(?:\\b|$|^))(((?:(?i:http|https|rtsp):\\/\\/(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?(?:((?=(.{0,255})(xn\\-\\-[\\w\\-]{0,58}\\w|[a-zA-Z[ -\ud7ff豈-﷏ﷰ-\uffef��-����-����-����-����-����-����-����-����-����-����-����-����-����-��&&[^ \u2000-\u200a\u2028\u2029 \u3000]]]{2,63}))([a-zA-Z0-9[ -\ud7ff豈-﷏ﷰ-\uffef��-����-����-����-����-����-����-����-����-����-����-����-����-����-��&&[^ \u2000-\u200a\u2028\u2029 \u3000]]](?:[a-zA-Z0-9[ -\ud7ff豈-﷏ﷰ-\uffef��-����-����-����-����-����-����-����-����-����-����-����-����-����-��&&[^ \u2000-\u200a\u2028\u2029 \u3000]]\\-\\_]{0,61}[a-zA-Z0-9[ -\ud7ff豈-﷏ﷰ-\uffef��-����-����-����-����-����-����-����-����-����-����-����-����-����-��&&[^ \u2000-\u200a\u2028\u2029 \u3000]]]){0,1}\\.){1,255}(xn\\-\\-[\\w\\-]{0,58}\\w|[a-zA-Z[ -\ud7ff豈-﷏ﷰ-\uffef��-����-����-����-����-����-����-����-����-����-����-����-����-����-��&&[^ \u2000-\u200a\u2028\u2029 \u3000]]]{2,63})|((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))))(?:\\:\\d{1,5})?)(\\/(?:(?:[a-zA-Z0-9[ -\ud7ff豈-﷏ﷰ-\uffef��-����-����-����-����-����-����-����-����-����-����-����-����-����-��&&[^ \u2000-\u200a\u2028\u2029 \u3000]]\\;\\/\\?\\:\\@\\&\\=\\#\\~\\[\\]\\-\\.\\+\\!\\*\\'\\(\\)\\,\\_\\$])|(?:\\%))*)?(?:\\b|$|^))");
            }
            A00 = pattern;
            A01(spannable, Linkify.sUrlMatchFilter, null, arrayList, pattern, A03);
        }
        if ((i & 2) != 0) {
            A01(spannable, null, null, arrayList, 0PA.A00, A01);
        }
        if (A06(spannable, c5um, arrayList, i)) {
            A01(spannable, Linkify.sPhoneNumberMatchFilter, Linkify.sPhoneNumberTransformFilter, arrayList, C0eg.A00, A02);
        }
        if ((i & 8) != 0) {
            A02(spannable, null, arrayList);
        }
        A04(arrayList);
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ee, code lost:
    
        r314 = r319.toString();
     */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, X.53u] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A01(android.text.Spannable r301, android.text.util.Linkify.MatchFilter r302, android.text.util.Linkify.TransformFilter r303, java.util.ArrayList r304, java.util.regex.Pattern r305, java.lang.String[] r306) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53t.A01(android.text.Spannable, android.text.util.Linkify$MatchFilter, android.text.util.Linkify$TransformFilter, java.util.ArrayList, java.util.regex.Pattern, java.lang.String[]):void");
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.53u] */
    public static final void A02(Spannable spannable, C5un c5un, ArrayList arrayList) {
        String obj = spannable.toString();
        if (c5un == null) {
            c5un = C5un.A00;
        }
        int i = 0;
        while (true) {
            try {
                String AST = c5un.AST(obj);
                if (AST == null) {
                    return;
                }
                int indexOf = obj.indexOf(AST);
                if (indexOf < 0) {
                    return;
                }
                ?? obj2 = new Object();
                int length = AST.length() + indexOf;
                obj2.A01 = indexOf + i;
                i += length;
                obj2.A00 = i;
                obj = obj.substring(length);
                try {
                    obj2.A02 = 0Pz.A0W("geo:0,0?q=", URLEncoder.encode(AST, "UTF-8"));
                    arrayList.add(obj2);
                } catch (UnsupportedEncodingException unused) {
                }
            } catch (UnsupportedOperationException unused2) {
                return;
            }
        }
    }

    public static final void A03(Spannable spannable, C5n1 c5n1, String str, int i, int i2) {
        if (c5n1 != null) {
            c5n1.A8v(spannable, i, i2, str);
        } else {
            spannable.setSpan(new URLSpan(str), i, i2, 33);
        }
    }

    public static final void A04(ArrayList arrayList) {
        int i;
        Collections.sort(arrayList, A04);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size - 1) {
            C53u c53u = (C53u) arrayList.get(i2);
            int i3 = i2 + 1;
            C53u c53u2 = (C53u) arrayList.get(i3);
            if (c53u.A01 <= c53u2.A01 && c53u.A00 > c53u2.A01) {
                if (c53u2.A00 <= c53u.A00 || c53u.A00 - c53u.A01 > c53u2.A00 - c53u2.A01) {
                    i = i3;
                } else if (c53u.A00 - c53u.A01 < c53u2.A00 - c53u2.A01) {
                    i = i2;
                }
                if (i != -1) {
                    arrayList.remove(i);
                    size--;
                }
            }
            i2 = i3;
        }
    }

    public static final boolean A05(Spannable spannable, C5um c5um, C5n1 c5n1, int i) {
        int length = spannable.length();
        ClickableSpan[] Atx = c5n1 != null ? c5n1.Atx(spannable, 0, length) : (ClickableSpan[]) spannable.getSpans(0, length, URLSpan.class);
        int length2 = Atx.length - 1;
        while (true) {
            int i2 = length2;
            if (i2 < 0) {
                break;
            }
            spannable.removeSpan(Atx[i2]);
            length2 = i2 - 1;
        }
        ArrayList A002 = A00(spannable, c5um, i);
        if (A002.isEmpty()) {
            return false;
        }
        Iterator it = A002.iterator();
        while (it.hasNext()) {
            C53u c53u = (C53u) it.next();
            A03(spannable, c5n1, c53u.A02, c53u.A01, c53u.A00);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, X.53u] */
    public static final boolean A06(Spannable spannable, C5um c5um, List list, int i) {
        boolean z = false;
        if ((i & 4) != 0) {
            if (c5um != null) {
                int length = spannable.length();
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    if (Character.isDigit(spannable.charAt(i2))) {
                        PhoneNumberMatcher phoneNumberMatcher = new PhoneNumberMatcher(c5um.A01, spannable.toString(), c5um.A00.A05().getCountry(), PhoneNumberUtil.Leniency.POSSIBLE, Long.MAX_VALUE);
                        while (phoneNumberMatcher.hasNext()) {
                            PhoneNumberMatch phoneNumberMatch = (PhoneNumberMatch) phoneNumberMatcher.next();
                            ?? obj = new Object();
                            obj.A02 = 0Pz.A0W("tel:", C5um.A00(phoneNumberMatch.rawString));
                            int i3 = phoneNumberMatch.start;
                            obj.A01 = i3;
                            obj.A00 = i3 + phoneNumberMatch.rawString.length();
                            list.add(obj);
                        }
                    } else {
                        i2++;
                    }
                }
            } else {
                z = true;
            }
        }
        return z;
    }
}
