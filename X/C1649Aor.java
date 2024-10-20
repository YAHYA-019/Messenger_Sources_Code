package X;

import android.database.sqlite.SQLiteDatabase;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Aor, reason: case insensitive filesystem */
/* loaded from: Aor.class */
public final class C1649Aor extends 1Dd {
    public static final 1rV A00;
    public static final 1rV A01;
    public static final ImmutableList A02;

    static {
        1Dj r0 = BZY.A00;
        ImmutableList of = ImmutableList.of((Object) r0, (Object) BZY.A01);
        A02 = of;
        A01 = new 1rU(of);
        A00 = new 4xE(ImmutableList.of((Object) r0), ImmutableList.of((Object) BaC.A09), "search_items", "ON DELETE CASCADE");
    }

    public C1649Aor() {
        super(A02, ImmutableList.of((Object) A01, (Object) A00), "group_participants");
    }

    public void A09(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 1) {
            super.A09(sQLiteDatabase, i, i2);
        }
    }
}
