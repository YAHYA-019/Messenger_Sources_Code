package X;

import android.database.sqlite.SQLiteDatabase;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Aom, reason: case insensitive filesystem */
/* loaded from: Aom.class */
public final class C1644Aom extends 1Dd {
    public static final ImmutableList A00 = ImmutableList.of((Object) DJ5.A01, (Object) DJ5.A00);

    public C1644Aom() {
        super(A00, ImmutableList.of((Object) new 1rU(ImmutableList.of((Object) DJ5.A01, (Object) DJ5.A00))), "tags");
    }

    public void A08(SQLiteDatabase sQLiteDatabase) {
        C01m.A00(-1869856658);
        sQLiteDatabase.execSQL("PRAGMA foreign_keys = ON");
        C01m.A00(1381465299);
    }
}
