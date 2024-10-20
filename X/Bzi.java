package X;

import android.content.Context;
import android.text.format.DateUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* loaded from: Bzi.class */
public final class Bzi {
    public final String A00(Context context, Long l) {
        Integer num;
        SimpleDateFormat A05;
        int i;
        String str = "";
        if (l != null) {
            long longValue = l.longValue();
            if (DateUtils.isToday(longValue)) {
                num = 0S2.A01;
            } else if (DateUtils.isToday(longValue + 86400000)) {
                num = 0S2.A00;
            } else if (DateUtils.isToday(longValue - 86400000)) {
                num = 0S2.A0C;
            } else {
                long A06 = 4YU.A06(Calendar.getInstance().getTimeInMillis() - longValue);
                long j = 60;
                num = ((int) Math.abs(((A06 / j) / j) / ((long) 24))) < 180 ? 0S2.A0N : 0S2.A0Y;
            }
            switch (num.intValue()) {
                case 0:
                    i = 2131958617;
                    break;
                case 1:
                    i = 2131958615;
                    break;
                case 2:
                    i = 2131958616;
                    break;
                case 3:
                    A05 = ((C2sT) 1Bi.A03(67517)).A05();
                    str = AbI.A1E(A05, longValue);
                    break;
                default:
                    A05 = ((C2sT) 1Bi.A03(67517)).A06();
                    str = AbI.A1E(A05, longValue);
                    break;
            }
            str = context.getString(i);
            11T.A0A(str);
        }
        return str;
    }
}
