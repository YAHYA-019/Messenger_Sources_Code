package X;

import android.database.sqlite.SQLiteDatabase;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Dds, reason: case insensitive filesystem */
/* loaded from: Dds.class */
public final class C2106Dds extends 1Da {
    public static final ImmutableList A00 = ImmutableList.of(new C2101Ddn(), new C2100Ddm(), new C2102Ddo(), new C2103Ddp(), new C2104Ddq(), new C2094Ddg(), new C2099Ddl(), new C2095Ddh(), new C2096Ddi(), new C2098Ddk(), new C2097Ddj());

    public C2106Dds() {
        super(A00, "payments", 28);
    }

    public void A06(SQLiteDatabase sQLiteDatabase) {
    }

    public void A09(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        0fH.A0V(Integer.valueOf(i), C2106Dds.class, "onUpgrade from %d to %d", Integer.valueOf(i2));
        1Du it = A00.iterator();
        while (it.hasNext()) {
            String A0W = 0Pz.A0W(1BJ.A00(25), ((1Dd) it.next()).A00);
            C01m.A00(1311127991);
            sQLiteDatabase.execSQL(A0W);
            C01m.A00(-297729384);
        }
        A07(sQLiteDatabase);
    }
}
