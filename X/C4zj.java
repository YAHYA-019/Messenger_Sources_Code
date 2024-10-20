package X;

import android.database.sqlite.SQLiteDatabase;
import com.google.common.collect.ImmutableList;

/* renamed from: X.4zj, reason: invalid class name */
/* loaded from: 4zj.class */
public final class C4zj extends 1Dd {
    public static final 1Dj A00;
    public static final 1Dj A01;
    public static final 1rV A02;
    public static final ImmutableList A03;
    public static final ImmutableList A04;

    static {
        1Dj r0 = new 1Dj("address", "TEXT");
        A00 = r0;
        1Dj r02 = new 1Dj("normalized_address", "TEXT");
        A01 = r02;
        A03 = ImmutableList.of((Object) r0, (Object) r02);
        1rU r03 = new 1rU(ImmutableList.of((Object) r0));
        A02 = r03;
        A04 = ImmutableList.of((Object) r03);
    }

    public C4zj() {
        super(A03, A04, "normalized_address_table");
    }

    public void A07(SQLiteDatabase sQLiteDatabase) {
        super.A07(sQLiteDatabase);
        String A032 = 1Dd.A03(ImmutableList.of((Object) A00), "normalized_address_table", "INDEX_ADDRESS");
        C01m.A00(1846841506);
        sQLiteDatabase.execSQL(A032);
        C01m.A00(-739579831);
    }
}
