package X;

import android.database.sqlite.SQLiteDatabase;
import com.google.common.collect.ImmutableList;

/* renamed from: X.4zg, reason: invalid class name */
/* loaded from: 4zg.class */
public final class C4zg extends 1Dd {
    public static final 1Dj A00;
    public static final 1Dj A01;
    public static final 1Dj A02;
    public static final 1Dj A03;
    public static final 1Dj A04;
    public static final 1Dj A05;
    public static final 1Dj A06;
    public static final 1rV A07;
    public static final ImmutableList A08;
    public static final ImmutableList A09;

    static {
        1Dj r0 = new 1Dj("address", "TEXT");
        A00 = r0;
        1Dj r02 = new 1Dj("smsc", "TEXT");
        A05 = r02;
        1Dj r03 = new 1Dj("delete_score", "REAL DEFAULT 0");
        A01 = r03;
        1Dj r04 = new 1Dj("delete_score_ts", "INTEGER DEFAULT 0");
        A02 = r04;
        1Dj r05 = new 1Dj("spam_score", "REAL DEFAULT 0");
        A06 = r05;
        1Dj r06 = new 1Dj("ranking_score", "REAL DEFAULT 0");
        A03 = r06;
        1Dj r07 = new 1Dj("scores_ts", "INTEGER DEFAULT 0");
        A04 = r07;
        A08 = ImmutableList.of((Object) r0, (Object) r02, (Object) r03, (Object) r04, (Object) r05, (Object) r06, (Object) r07);
        1rU r08 = new 1rU(ImmutableList.of((Object) r0));
        A07 = r08;
        A09 = ImmutableList.of((Object) r08);
    }

    public C4zg() {
        super(A08, A09, "address_table");
    }

    public void A07(SQLiteDatabase sQLiteDatabase) {
        super.A07(sQLiteDatabase);
        String A032 = 1Dd.A03(ImmutableList.of((Object) A00), "address_table", "INDEX_ADDRESS");
        C01m.A00(2095868462);
        sQLiteDatabase.execSQL(A032);
        C01m.A00(-1128235896);
    }
}
