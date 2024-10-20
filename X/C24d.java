package X;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* renamed from: X.24d, reason: invalid class name */
/* loaded from: 24d.class */
public final class C24d extends DateFormat {
    public static final C24d A03;
    public static final DateFormat A04;
    public static final Calendar A05;
    public static final Locale A06;
    public static final TimeZone A07;
    public static final Pattern A08;
    public static final Pattern A09 = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d");
    public static final String[] A0A;
    public transient DateFormat A00;
    public transient Calendar A01;
    public transient TimeZone A02;
    public Boolean _lenient;
    public final Locale _locale;
    public boolean _tzSerializedWithColon;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.regex.Pattern] */
    static {
        ?? r0 = "\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d[T]\\d\\d[:]\\d\\d(?:[:]\\d\\d)?(\\.\\d+)?(Z|[+-]\\d\\d(?:[:]?\\d\\d)?)?";
        r0 = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d[T]\\d\\d[:]\\d\\d(?:[:]\\d\\d)?(\\.\\d+)?(Z|[+-]\\d\\d(?:[:]?\\d\\d)?)?");
        A08 = r0;
        A0A = new String[]{"yyyy-MM-dd'T'HH:mm:ss.SSSX", "yyyy-MM-dd'T'HH:mm:ss.SSS", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd"};
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        A07 = timeZone;
        Locale locale = Locale.US;
        A06 = locale;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", locale);
        A04 = simpleDateFormat;
        simpleDateFormat.setTimeZone(timeZone);
        A03 = new C24d();
        A05 = new GregorianCalendar(timeZone, locale);
    }

    public C24d() {
        this._tzSerializedWithColon = true;
        this._locale = A06;
    }

    public C24d(Boolean bool, Locale locale, TimeZone timeZone, boolean z) {
        this.A02 = timeZone;
        this._locale = locale;
        this._lenient = bool;
        this._tzSerializedWithColon = z;
    }

    public static int A00(String str, int i) {
        return ((str.charAt(i) - '0') * 10) + (str.charAt(i + 1) - '0');
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x051f, code lost:
    
        if (r331 != null) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x057f, code lost:
    
        if (r0 < 0) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0584, code lost:
    
        if (r306 != false) goto L229;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.Date A01(java.lang.String r302, java.text.ParsePosition r303) {
        /*
            Method dump skipped, instructions count: 1502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24d.A01(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static void A02(StringBuffer stringBuffer, int i) {
        int i2 = i / 10;
        if (i2 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i2 + 48));
            i -= i2 * 10;
        }
        stringBuffer.append((char) (i + 48));
    }

    @Override // java.text.DateFormat, java.text.Format
    public /* bridge */ /* synthetic */ Object clone() {
        TimeZone timeZone = this.A02;
        return new C24d(this._lenient, this._locale, timeZone, this._tzSerializedWithColon);
    }

    @Override // java.text.DateFormat
    public boolean equals(Object obj) {
        return AnonymousClass001.A1W(obj, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x019d  */
    @Override // java.text.DateFormat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.StringBuffer format(java.util.Date r302, java.lang.StringBuffer r303, java.text.FieldPosition r304) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24d.format(java.util.Date, java.lang.StringBuffer, java.text.FieldPosition):java.lang.StringBuffer");
    }

    @Override // java.text.DateFormat
    public TimeZone getTimeZone() {
        return this.A02;
    }

    @Override // java.text.DateFormat
    public int hashCode() {
        return System.identityHashCode(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r0.booleanValue() != false) goto L6;
     */
    @Override // java.text.DateFormat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isLenient() {
        /*
            r301 = this;
            r0 = r301
            java.lang.Boolean r0 = r0._lenient
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L16
            r0 = r302
            boolean r0 = r0.booleanValue()
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
            r0 = r303
            if (r0 == 0) goto L18
        L16:
            r0 = 1
            r304 = r0
        L18:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24d.isLenient():boolean");
    }

    @Override // java.text.DateFormat
    public Date parse(String str) {
        String trim = str.trim();
        ParsePosition parsePosition = new ParsePosition(0);
        Date A01 = A01(trim, parsePosition);
        if (A01 != null) {
            return A01;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        String[] strArr = A0A;
        int length = strArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                break;
            }
            String str2 = strArr[i2];
            if (A0k.length() > 0) {
                A0k.append("\", \"");
            } else {
                A0k.append('\"');
            }
            A0k.append(str2);
            i = i2 + 1;
        }
        A0k.append('\"');
        throw new ParseException(String.format("Cannot parse date \"%s\": not compatible with any of standard forms (%s)", trim, A0k.toString()), parsePosition.getErrorIndex());
    }

    @Override // java.text.DateFormat
    public Date parse(String str, ParsePosition parsePosition) {
        try {
            return A01(str, parsePosition);
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // java.text.DateFormat
    public void setLenient(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Boolean bool = this._lenient;
        if (valueOf != bool) {
            if (valueOf == null || !valueOf.equals(bool)) {
                this._lenient = valueOf;
                this.A00 = null;
            }
        }
    }

    @Override // java.text.DateFormat
    public void setTimeZone(TimeZone timeZone) {
        if (timeZone.equals(this.A02)) {
            return;
        }
        this.A00 = null;
        this.A02 = timeZone;
    }

    public String toString() {
        return String.format("DateFormat %s: (timezone: %s, locale: %s, lenient: %s)", AnonymousClass001.A0Y(this), this.A02, this._locale, this._lenient);
    }
}
