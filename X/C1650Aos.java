package X;

import android.database.sqlite.SQLiteDatabase;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Aos, reason: case insensitive filesystem */
/* loaded from: Aos.class */
public final class C1650Aos extends 1Dd {
    public static final 1rV A00;
    public static final 1rV A01;
    public static final ImmutableList A02;
    public static final String A03;

    static {
        1Dj r0 = BZZ.A01;
        1Dj r02 = BZZ.A00;
        ImmutableList of = ImmutableList.of((Object) r0, (Object) r02);
        A02 = of;
        A01 = new 1rU(of);
        A00 = new 4xE(ImmutableList.of((Object) r02), ImmutableList.of((Object) BaC.A09), "search_items", "ON DELETE CASCADE");
        A03 = 1Dd.A03(ImmutableList.of((Object) r02, (Object) r0), "name_index", "fbid_token_index");
    }

    public C1650Aos() {
        super(A02, ImmutableList.of((Object) A01, (Object) A00), "name_index");
    }

    public void A07(SQLiteDatabase sQLiteDatabase) {
        super.A07(sQLiteDatabase);
        String str = A03;
        C01m.A00(-2059303099);
        sQLiteDatabase.execSQL(str);
        C01m.A00(322466298);
    }

    public void A09(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 4) {
            super.A09(sQLiteDatabase, i, i2);
        }
    }
}
