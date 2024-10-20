package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.79z, reason: invalid class name */
/* loaded from: 79z.class */
public final class C79z {
    public final Context A00;
    public final 1GS A01;
    public final Pattern A02;
    public final Pattern A03;
    public final Pattern A04;

    public C79z(Context context, 1GS r303) {
        11T.A0F(r303, 1);
        this.A01 = r303;
        this.A00 = context;
        this.A02 = Pattern.compile("(\\@+)([^\\s]+)*");
        this.A03 = Pattern.compile("(\\/+)([^\\s]+)*");
        this.A04 = Pattern.compile("([^\\s]+$)");
    }

    public static final int A00(C79z c79z, CharSequence charSequence, boolean z) {
        int i;
        int i2;
        11T.A0F(charSequence, 0);
        Pattern pattern = c79z.A02;
        if (z && 0CU.A01(charSequence, '/', charSequence.length() - 1) > 0CU.A01(charSequence, '@', charSequence.length() - 1)) {
            pattern = c79z.A03;
        }
        Matcher matcher = pattern.matcher(charSequence);
        int i3 = -1;
        int i4 = -1;
        while (true) {
            i = i4;
            if (!matcher.find()) {
                break;
            }
            i4 = matcher.start();
        }
        7IB[] r0 = (7IB[]) SpannedString.valueOf(charSequence).getSpans(i, i + 1, 7IB.class);
        11T.A0D(r0);
        if (r0.length == 0) {
            i3 = i;
        }
        Matcher matcher2 = c79z.A04.matcher(charSequence);
        boolean z2 = false;
        int i5 = 0;
        while (true) {
            i2 = i5;
            if (!matcher2.find()) {
                break;
            }
            i5 = matcher2.start();
        }
        7IB[] r02 = (7IB[]) SpannedString.valueOf(charSequence).getSpans(i2, i2 + 1, 7IB.class);
        11T.A0D(r02);
        if (r02.length == 0) {
            z2 = true;
        }
        if (!z2) {
            i2 = -1;
        }
        return i3 == -1 ? i2 : i3;
    }

    public static final String A01(C79z c79z, CharSequence charSequence, int i, boolean z) {
        String obj;
        int length;
        if (i < 0) {
            return null;
        }
        int length2 = charSequence.length();
        if (length2 > i) {
            length2 = i;
        }
        CharSequence subSequence = charSequence.subSequence(0, length2);
        int A00 = A00(c79z, subSequence, z);
        int length3 = subSequence.length();
        if (A00 < 0 || (obj = subSequence.subSequence(A00, length3).toString()) == null || (length = obj.length()) == 0) {
            return null;
        }
        if (0CU.A00(obj, '@', 0) < 0 && (!z || 0CU.A00(obj, '/', 0) < 0)) {
            if (length < 3) {
                return null;
            }
            if (!Character.isUpperCase(obj.codePointAt(0)) && length < 4) {
                return null;
            }
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003d, code lost:
    
        if (r302.startsWith("/") != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String A02(X.C79z r301, java.lang.String r302) {
        /*
            r0 = r301
            X.1GS r0 = r0.A01
            java.util.Locale r0 = r0.A05()
            r303 = r0
            r0 = r303
            X.11T.A0A(r0)
            r0 = r302
            r1 = r303
            java.lang.String r0 = r0.toLowerCase(r1)
            r302 = r0
            r0 = r302
            X.11T.A0A(r0)
            java.lang.String r0 = "@"
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            r1 = r304
            X.11T.A0F(r0, r1)
            r0 = r302
            r1 = r303
            boolean r0 = r0.startsWith(r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L40
            java.lang.String r0 = "/"
            r303 = r0
            r0 = r303
            r1 = r304
            X.11T.A0F(r0, r1)
            r0 = r302
            r1 = r303
            boolean r0 = r0.startsWith(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L4a
        L40:
            r0 = r302
            r1 = r304
            java.lang.String r0 = r0.substring(r1)
            r302 = r0
            r0 = r302
            X.11T.A0A(r0)
        L4a:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79z.A02(X.79z, java.lang.String):java.lang.String");
    }

    public static final void A03(SpannableStringBuilder spannableStringBuilder, String str, ArrayList arrayList, int i) {
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
        SpannableStringBuilder append = new SpannableStringBuilder(str).append((CharSequence) " ");
        append.setSpan(foregroundColorSpan, 0, append.length() - 1, 33);
        arrayList.add(foregroundColorSpan);
        spannableStringBuilder.append((CharSequence) append);
    }

    public static final boolean A04(C79z c79z, String str, String str2, boolean z) {
        Boolean bool = null;
        if (str != null) {
            Locale A05 = c79z.A01.A05();
            11T.A0A(A05);
            String lowerCase = str.toLowerCase(A05);
            11T.A0A(lowerCase);
            bool = Boolean.valueOf(lowerCase.startsWith(str2));
        }
        if (!11T.A0O(bool, true)) {
            return false;
        }
        String string = c79z.A00.getString(2131959848);
        11T.A0A(string);
        if (11T.A0O(str, string) && 11T.A0P(str2, 1, string)) {
            return z;
        }
        return true;
    }
}
