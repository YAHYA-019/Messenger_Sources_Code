package X;

import android.provider.Settings;
import android.text.format.DateFormat;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.threads.NotificationSetting;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: C80.class */
public final class C80 {
    public final 1Br A01 = 7zM.A0d();
    public final 1BP A04 = FbInjector.A00;
    public final 1Br A00 = 1HG.A00(7zL.A09(), 83275);
    public final C15h A03 = DBX.A00;
    public final 1Br A02 = AbG.A0Q();

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    public final Cu9 A00(Integer num) {
        Locale locale;
        Date parse;
        String A0u;
        String string;
        Date date;
        Integer num2;
        switch (num.intValue()) {
            case 0:
                A0u = 1BK.A0u(FbInjector.A03, 2131954879);
                string = FbInjector.A03.getString(2131954885);
                date = new Date(1Br.A00(this.A01) + 900000);
                num2 = 0S2.A00;
                return new Cu9(new NotificationSetting(4YU.A06(date.getTime()), true, false, false), num2, A0u, string);
            case 1:
                A0u = 1BK.A0u(FbInjector.A03, 2131954880);
                string = FbInjector.A03.getString(2131954886);
                date = new Date(1Br.A00(this.A01) + 3600000);
                num2 = 0S2.A01;
                return new Cu9(new NotificationSetting(4YU.A06(date.getTime()), true, false, false), num2, A0u, string);
            case 2:
                A0u = 1BK.A0u(FbInjector.A03, 2131954878);
                string = FbInjector.A03.getString(2131954884);
                date = new Date(1Br.A00(this.A01) + 28800000);
                num2 = 0S2.A0C;
                return new Cu9(new NotificationSetting(4YU.A06(date.getTime()), true, false, false), num2, A0u, string);
            case 3:
                A0u = 1BK.A0u(FbInjector.A03, 2131954881);
                string = FbInjector.A03.getString(2131954887);
                date = new Date(1Br.A00(this.A01) + 86400000);
                num2 = 0S2.A0N;
                return new Cu9(new NotificationSetting(4YU.A06(date.getTime()), true, false, false), num2, A0u, string);
            case 4:
                long A00 = 1Br.A00(this.A01);
                BoC boC = (BoC) 1Br.A0B(this.A00);
                Date date2 = null;
                try {
                    String string2 = Settings.System.getString(boC.A00.getContentResolver(), "next_alarm_formatted");
                    if (string2 != null) {
                        try {
                            String bestDateTimePattern = DateFormat.getBestDateTimePattern(Locale.getDefault(), "Ehma");
                            locale = boC.A02;
                            parse = new SimpleDateFormat(bestDateTimePattern, locale).parse(string2);
                        } catch (ParseException unused) {
                            String bestDateTimePattern2 = DateFormat.getBestDateTimePattern(Locale.getDefault(), "EHm");
                            locale = boC.A02;
                            parse = new SimpleDateFormat(bestDateTimePattern2, locale).parse(string2);
                        }
                        Calendar calendar = Calendar.getInstance(locale);
                        calendar.setTime(parse);
                        Calendar calendar2 = Calendar.getInstance(locale);
                        calendar2.setTimeInMillis(boC.A01.now());
                        Calendar calendar3 = (Calendar) calendar2.clone();
                        calendar3.set(7, calendar.get(7));
                        calendar3.set(11, calendar.get(11));
                        calendar3.set(12, calendar.get(12));
                        AbK.A1U(calendar3);
                        if (calendar3.before(calendar2)) {
                            calendar3.add(3, 1);
                        }
                        date2 = calendar3.getTime();
                    }
                } catch (NullPointerException | ParseException unused2) {
                }
                Date date3 = new Date(A00 + 86400000);
                if (date2 == null || !date2.before(date3)) {
                    return null;
                }
                return new Cu9(new NotificationSetting(4YU.A06(date2.getTime()), true, false, false), 0S2.A0Y, AbK.A13(FbInjector.A03, DateFormat.getTimeFormat(FbInjector.A03).format(date2), 2131954882), FbInjector.A03.getString(2131954888));
            case 5:
                return new Cu9(NotificationSetting.A05, 0S2.A0j, 1BK.A0u(FbInjector.A03, 2131954877), FbInjector.A03.getString(2131954883));
            case 6:
                A0u = 1BK.A0u(FbInjector.A03, 2131954646);
                string = FbInjector.A03.getString(2131954646);
                date = new Date(1Br.A00(this.A01) + 86400000);
                num2 = 0S2.A0u;
                return new Cu9(new NotificationSetting(4YU.A06(date.getTime()), true, false, false), num2, A0u, string);
            case 7:
                A0u = 1BK.A0u(FbInjector.A03, 2131954648);
                string = FbInjector.A03.getString(2131954648);
                date = new Date(1Br.A00(this.A01) + 604800000);
                num2 = 0S2.A15;
                return new Cu9(new NotificationSetting(4YU.A06(date.getTime()), true, false, false), num2, A0u, string);
            default:
                A0u = 1BK.A0u(FbInjector.A03, 2131954647);
                string = FbInjector.A03.getString(2131954647);
                date = new Date(1Br.A00(this.A01) + 2592000000L);
                num2 = 0S2.A1G;
                return new Cu9(new NotificationSetting(4YU.A06(date.getTime()), true, false, false), num2, A0u, string);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x015a, code lost:
    
        if (X.AbL.A1b(r301.A03) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.common.collect.ImmutableList A01(com.facebook.messaging.model.threadkey.ThreadKey r302) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80.A01(com.facebook.messaging.model.threadkey.ThreadKey):com.google.common.collect.ImmutableList");
    }
}
