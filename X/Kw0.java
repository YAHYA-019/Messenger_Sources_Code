package X;

import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: Kw0.class */
public final class Kw0 {
    public static Calendar A00(Calendar calendar, Calendar calendar2) {
        Calendar calendar3 = Calendar.getInstance(TimeZone.getDefault());
        calendar3.clear();
        calendar3.set(calendar.get(1), calendar.get(2), calendar.get(5), calendar2.get(11), calendar2.get(12));
        return calendar3;
    }
}
