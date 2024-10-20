package X;

import android.content.Context;
import android.content.IntentFilter;
import com.facebook.inject.FbInjector;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.3R4, reason: invalid class name */
/* loaded from: 3R4.class */
public final class C3R4 {
    public C0dp A00;
    public TimeZone A01;
    public TimeZone A02;
    public DateFormat A03;
    public DateFormat A04;
    public DateFormat A05;
    public DateFormat A06;
    public DateFormat A07;
    public DateFormat A08;
    public DateFormat A09;
    public DateFormat A0A;
    public DateFormat A0B;
    public DateFormat A0C;
    public DateFormat A0D;
    public DateFormat A0E;
    public final Context A0F;
    public final C15h A0G;

    public C3R4() {
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        TimeZone timeZone = (TimeZone) 1Bn.A0A(85239);
        11T.A0F(timeZone, 2);
        SFf sFf = SFf.A00;
        C0dp c0dp = (C0dp) 1Bi.A03(99390);
        Locale locale = (Locale) 1Bn.A0A(99932);
        this.A0F = A00;
        this.A00 = c0dp;
        this.A0G = SFe.A00;
        String str = QxO.A01;
        String str2 = QxO.A02;
        String str3 = QxO.A00;
        QxO.A01 = str;
        QxO.A02 = str2;
        QxO.A00 = str3;
        A00.getString(2131967278);
        A00.getString(2131956635);
        A00.getString(2131956633);
        A00.getString(2131956634);
        A00.getString(2131956630);
        A01(locale, timeZone, this.A02);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        AnonymousClass023.A00(new PzU(this, locale, sFf), this.A0F, intentFilter);
    }

    public static SimpleDateFormat A00(String str, Locale locale, TimeZone timeZone) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(android.text.format.DateFormat.getBestDateTimePattern(locale, str), locale);
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat;
    }

    public final void A01(Locale locale, TimeZone timeZone, TimeZone timeZone2) {
        Context context;
        int i;
        DateFormat timeInstance;
        synchronized (this) {
            11T.A0F(locale, 0);
            this.A01 = timeZone;
            this.A02 = timeZone2;
            if (timeZone == null || !timeZone.hasSameRules(timeZone2)) {
                context = this.A0F;
                context.getString(2131956628);
                context.getString(2131956632);
                i = 2131956629;
            } else {
                context = this.A0F;
                context.getString(2131956629);
                i = 2131956631;
            }
            context.getString(i);
            String[] stringArray = context.getResources().getStringArray(2130903066);
            11T.A0A(stringArray);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(QxO.A02, locale);
            simpleDateFormat.setTimeZone(timeZone);
            this.A05 = simpleDateFormat;
            SimpleDateFormat A00 = A00("EEEMMMd", locale, timeZone);
            A00.setTimeZone(timeZone);
            this.A0C = A00;
            SimpleDateFormat A002 = A00("EEEMMMdyyyy", locale, timeZone);
            A002.setTimeZone(timeZone);
            this.A0D = A002;
            this.A04 = A00(android.text.format.DateFormat.is24HourFormat(context) ? "HH:mm" : "h:mm a", locale, timeZone);
            if (android.text.format.DateFormat.is24HourFormat(context)) {
                new SimpleDateFormat("HH:mm", locale);
            } else {
                timeInstance = DateFormat.getTimeInstance(3, locale);
                11T.A0A(timeInstance);
                if (timeInstance instanceof SimpleDateFormat) {
                    DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(locale);
                    dateFormatSymbols.setAmPmStrings(stringArray);
                    ((SimpleDateFormat) timeInstance).setDateFormatSymbols(dateFormatSymbols);
                }
            }
            timeInstance.setTimeZone(timeZone);
            this.A0E = timeInstance;
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(QxO.A00, locale);
            simpleDateFormat2.setTimeZone(timeZone);
            this.A06 = simpleDateFormat2;
            SimpleDateFormat A003 = A00("MMMMyyyy", locale, timeZone);
            A003.setTimeZone(timeZone);
            this.A09 = A003;
            SimpleDateFormat A004 = A00("MMMd", locale, timeZone);
            A004.setTimeZone(timeZone);
            this.A07 = A004;
            SimpleDateFormat A005 = A00("MMMdyyyy", locale, timeZone);
            A005.setTimeZone(timeZone);
            this.A08 = A005;
            SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("MMM", locale);
            simpleDateFormat3.setTimeZone(timeZone);
            this.A0B = simpleDateFormat3;
            this.A0A = A00("d", locale, timeZone);
            this.A03 = A00("dd", locale, timeZone);
            if (!11T.A0O(Locale.US, locale)) {
                Calendar.getInstance().getFirstDayOfWeek();
            }
        }
    }
}
