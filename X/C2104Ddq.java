package X;

import android.database.sqlite.SQLiteDatabase;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Ddq, reason: case insensitive filesystem */
/* loaded from: Ddq.class */
public final class C2104Ddq extends 1Dd {
    public static final 1Dj A00;
    public static final 1Dj A01;
    public static final 1rV A02;
    public static final ImmutableList A03;
    public static final String A04;

    static {
        1Dj A0F = AbF.A0F("creation_time", "INTEGER");
        A00 = A0F;
        1Dj A0F2 = AbF.A0F("transaction_id", "INTEGER");
        A01 = A0F2;
        A02 = DKD.A0I(A0F2);
        A03 = ImmutableList.of((Object) A0F, (Object) A0F2);
        A04 = 1Dd.A04(ImmutableList.of((Object) 0Pz.A0W("creation_time", " DESC")), "recent_outgoing_transactions", "outgoing_transactions_creation_time_index");
    }

    public C2104Ddq() {
        super(A02, A03, "recent_outgoing_transactions");
    }

    public void A07(SQLiteDatabase sQLiteDatabase) {
        super.A07(sQLiteDatabase);
        String str = A04;
        C01m.A00(-1487561733);
        sQLiteDatabase.execSQL(str);
        C01m.A00(-2026350344);
    }
}
