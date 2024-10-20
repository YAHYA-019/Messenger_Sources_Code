package X;

import android.database.sqlite.SQLiteDatabase;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Ap0, reason: case insensitive filesystem */
/* loaded from: Ap0.class */
public final class C1658Ap0 extends 1Da {
    public C1658Ap0() {
        super(ImmutableList.of((Object) new Q5q()), "sms_matching_schema", 7);
    }

    public void A09(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3;
        while (i < i2) {
            int i4 = i + 1;
            if (i == 1) {
                String A00 = 1Dd.A00(Q5q.A03, "match_table");
                C01m.A00(2050850178);
                sQLiteDatabase.execSQL(A00);
                C01m.A00(1274541032);
                String A002 = 1Dd.A00(Q5q.A08, "match_table");
                C01m.A00(609919942);
                sQLiteDatabase.execSQL(A002);
                i3 = 121344302;
            } else if (i == 2) {
                String A003 = 1Dd.A00(Q5q.A02, "match_table");
                C01m.A00(-83564172);
                sQLiteDatabase.execSQL(A003);
                i3 = 1416120276;
            } else if (i == 3) {
                String A004 = 1Dd.A00(Q5q.A06, "match_table");
                C01m.A00(-1616627812);
                sQLiteDatabase.execSQL(A004);
                C01m.A00(1182985754);
                String A005 = 1Dd.A00(Q5q.A05, "match_table");
                C01m.A00(-455914571);
                sQLiteDatabase.execSQL(A005);
                i3 = 986819190;
            } else if (i == 4) {
                String A006 = 1Dd.A00(Q5q.A0A, "match_table");
                C01m.A00(1586498942);
                sQLiteDatabase.execSQL(A006);
                i3 = 154644007;
            } else if (i == 5) {
                String A007 = 1Dd.A00(Q5q.A09, "match_table");
                C01m.A00(-1557832613);
                sQLiteDatabase.execSQL(A007);
                i3 = 1440410412;
            } else if (i == 6) {
                String A008 = 1Dd.A00(Q5q.A04, "match_table");
                C01m.A00(-982236548);
                sQLiteDatabase.execSQL(A008);
                i3 = -1260878970;
            } else {
                i = i4;
            }
            C01m.A00(i3);
            i = i4;
        }
    }
}
