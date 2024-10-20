package X;

import android.database.sqlite.SQLiteDatabase;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Aon, reason: case insensitive filesystem */
/* loaded from: Aon.class */
public final class C1645Aon extends 1Dd {
    public static final 1rV A00;
    public static final ImmutableList A01;

    static {
        1Dj r0 = BZX.A00;
        1Dj r02 = BZX.A01;
        A01 = ImmutableList.of((Object) r0, (Object) r02);
        A00 = new 1rU(ImmutableList.of((Object) r0, (Object) r02));
    }

    public C1645Aon() {
        super(A00, A01, "click_stream_tokens");
    }

    public void A09(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 8) {
            super.A09(sQLiteDatabase, i, i2);
        }
    }
}
