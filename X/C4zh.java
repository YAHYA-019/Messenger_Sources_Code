package X;

import android.database.sqlite.SQLiteDatabase;
import com.facebook.privacy.e2ee.genericimpl.store.PublicKeyStoreImplKt;
import com.google.common.collect.ImmutableList;

/* renamed from: X.4zh, reason: invalid class name */
/* loaded from: 4zh.class */
public final class C4zh extends 1Dd {
    public static final 1Dj A00;
    public static final 1Dj A01;
    public static final 1Dj A02;
    public static final 1rV A03;
    public static final ImmutableList A04;
    public static final ImmutableList A05;

    static {
        1Dj r0 = new 1Dj("phoneNumber", "TEXT");
        A00 = r0;
        1Dj r02 = new 1Dj("rawPhoneNumber", "TEXT");
        A01 = r02;
        1Dj r03 = new 1Dj(PublicKeyStoreImplKt.KEYS_UPDATE_TIMESTAMP, "INTEGER DEFAULT 0");
        A02 = r03;
        A04 = ImmutableList.of((Object) r0, (Object) r02, (Object) r03);
        1rU r04 = new 1rU(ImmutableList.of((Object) r0));
        A03 = r04;
        A05 = ImmutableList.of((Object) r04);
    }

    public C4zh() {
        super(A04, A05, "block_table");
    }

    public void A07(SQLiteDatabase sQLiteDatabase) {
        super.A07(sQLiteDatabase);
        String A032 = 1Dd.A03(ImmutableList.of((Object) A00), "block_table", "INDEX_PHONE_NUMBER");
        C01m.A00(-231123785);
        sQLiteDatabase.execSQL(A032);
        C01m.A00(323431586);
    }
}
