package X;

import android.database.sqlite.SQLiteDatabase;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Aot, reason: case insensitive filesystem */
/* loaded from: Aot.class */
public final class C1651Aot extends 1Dd {
    public static final 1rV A00;
    public static final 1rV A01;
    public static final ImmutableList A02;
    public static final String A03;

    static {
        1Dj r0 = BZa.A01;
        1Dj r02 = BZa.A00;
        ImmutableList of = ImmutableList.of((Object) r0, (Object) r02);
        A02 = of;
        A01 = new 1rU(of);
        A00 = new 4xE(ImmutableList.of((Object) r02), ImmutableList.of((Object) BaE.A08), "recent_search_items", "ON DELETE CASCADE");
        A03 = 1Dd.A03(ImmutableList.of((Object) r02, (Object) r0), "recent_search_name_index", "recent_search_fbid_token_index");
    }

    public C1651Aot() {
        super(A02, ImmutableList.of((Object) A01, (Object) A00), "recent_search_name_index");
    }

    public void A07(SQLiteDatabase sQLiteDatabase) {
        super.A07(sQLiteDatabase);
        String str = A03;
        C01m.A00(-170956902);
        sQLiteDatabase.execSQL(str);
        C01m.A00(-956448935);
    }

    public void A09(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 6) {
            super.A09(sQLiteDatabase, i, i2);
        }
    }
}
