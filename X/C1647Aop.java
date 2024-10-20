package X;

import android.database.sqlite.SQLiteDatabase;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Aop, reason: case insensitive filesystem */
/* loaded from: Aop.class */
public final class C1647Aop extends 1Dd {
    public static final 1rV A00;
    public static final ImmutableList A01;

    static {
        1Dj r0 = BZy.A02;
        1Dj r02 = BZy.A00;
        A01 = ImmutableList.of((Object) r0, (Object) r02, (Object) BZy.A01);
        A00 = new 1rU(ImmutableList.of((Object) r0, (Object) r02));
    }

    public C1647Aop() {
        super(A00, A01, "search_context_lines");
    }

    public void A09(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 10) {
            super.A09(sQLiteDatabase, i, i2);
        } else if (i < 11) {
            String A002 = 1Dd.A00(BZy.A01, "search_context_lines");
            C01m.A00(-516465202);
            sQLiteDatabase.execSQL(A002);
            C01m.A00(-52018683);
        }
    }
}
