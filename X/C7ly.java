package X;

import java.util.Formatter;
import java.util.Locale;

/* renamed from: X.7ly, reason: invalid class name */
/* loaded from: 7ly.class */
public abstract class C7ly {
    public static String A00(long j) {
        Object[] objArr;
        String str;
        StringBuilder A0k = AnonymousClass001.A0k();
        Formatter formatter = new Formatter(A0k, Locale.getDefault());
        long A06 = 4YU.A06(j);
        long j2 = 60;
        long j3 = A06 % j2;
        long j4 = (A06 / j2) % j2;
        long j5 = A06 / 3600;
        A0k.setLength(0);
        if (j5 > 0) {
            objArr = new Object[]{Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)};
            str = "%d:%02d:%02d";
        } else {
            objArr = new Object[]{Long.valueOf(j4), Long.valueOf(j3)};
            str = "%d:%02d";
        }
        return formatter.format(str, objArr).toString();
    }
}
