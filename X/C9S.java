package X;

import android.content.Context;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: C9S.class */
public final class C9S {
    public final Context A00;
    public final 1De A05;
    public final 5Ou A03 = (5Ou) 1Bi.A03(83273);
    public final C3R4 A04 = (C3R4) 1Bi.A03(85238);
    public final 5Ou A02 = (5Ou) 1Bi.A03(49709);
    public final C2sT A01 = (C2sT) 1Bi.A03(67517);

    public C9S(1De r302) {
        this.A05 = r302;
        this.A00 = AbK.A0A(r302);
    }

    public final String A00(TimeZone timeZone, long j) {
        11T.A0F(timeZone, 1);
        SimpleDateFormat A09 = this.A01.A09();
        A09.setTimeZone(timeZone);
        long j2 = 1000 * j;
        return AbG.A17(this.A00, new Object[]{AbM.A12(A09, j2), A02(timeZone, j), timeZone.getDisplayName(timeZone.inDaylightTime(new Date(j2)), 0)}, 2131967271);
    }

    public final String A01(TimeZone timeZone, long j) {
        11T.A0F(timeZone, 1);
        SimpleDateFormat A0A = this.A01.A0A();
        A0A.setTimeZone(timeZone);
        String A12 = AbM.A12(A0A, j * 1000);
        11T.A0A(A12);
        return A12;
    }

    public final String A02(TimeZone timeZone, long j) {
        11T.A0F(timeZone, 1);
        DateFormat A01 = this.A01.A01();
        A01.setTimeZone(timeZone);
        String A12 = AbM.A12(A01, j * 1000);
        11T.A0A(A12);
        return A12;
    }

    public final String A03(TimeZone timeZone, long j, long j2) {
        11T.A0F(timeZone, 2);
        if (j2 == j) {
            return A02(timeZone, j);
        }
        String string = this.A00.getString(2131952864, A02(timeZone, j), A02(timeZone, j2), timeZone.getDisplayName(timeZone.inDaylightTime(AbK.A1B(j)), 0));
        11T.A0D(string);
        return string;
    }
}
