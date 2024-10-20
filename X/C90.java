package X;

import android.content.Context;
import android.text.format.DateUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* loaded from: C90.class */
public final class C90 {
    public final 1Br A00;
    public final 1Br A01;
    public final SimpleDateFormat A02;
    public final SimpleDateFormat A03;

    public C90() {
        1Br A0L = AbG.A0L();
        this.A01 = A0L;
        this.A00 = 7zM.A0d();
        this.A02 = new SimpleDateFormat("HH:mm", ((1GS) 1Br.A0B(A0L)).A05());
        this.A03 = new SimpleDateFormat("h:mm a", ((1GS) 1Br.A0B(this.A01)).A05());
    }

    public final long A00() {
        Calendar calendar = Calendar.getInstance();
        C00i c00i = this.A00.A00;
        calendar.setTimeInMillis(4YV.A05(c00i));
        calendar.add(11, 1);
        calendar.set(12, 0);
        AbK.A1U(calendar);
        if (calendar.getTimeInMillis() - 4YV.A05(c00i) <= 900000) {
            calendar.add(11, 1);
        }
        return calendar.getTimeInMillis();
    }

    public final long A01(long j) {
        Calendar calendar = Calendar.getInstance();
        C00i c00i = this.A00.A00;
        calendar.setTimeInMillis(4YV.A05(c00i));
        calendar.set(11, 0);
        calendar.set(12, 0);
        AbK.A1U(calendar);
        long timeInMillis = calendar.getTimeInMillis();
        if (4YV.A05(c00i) - timeInMillis < j) {
            return timeInMillis + j;
        }
        calendar.add(5, 1);
        return j + calendar.getTimeInMillis();
    }

    public final String A02(Context context, int i, int i2, int i3, long j) {
        String replace = this.A02.format(new Date(j)).replace(' ', (char) 160);
        11T.A0A(replace);
        String A0v = DateUtils.isToday(j) ? 1BK.A0v(context, replace, i) : DateUtils.isToday(j - 86400000) ? 1BK.A0v(context, replace, i2) : 1BK.A0v(context, DateUtils.formatDateTime(context, j, 98323).replace(' ', (char) 160), i3);
        11T.A0A(A0v);
        return A0v;
    }
}
