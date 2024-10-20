package X;

import android.database.sqlite.SQLiteDatabase;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Ddr, reason: case insensitive filesystem */
/* loaded from: Ddr.class */
public final class C2105Ddr extends 1Da {
    public static final ImmutableList A00 = ImmutableList.of((Object) new C2093Ddf());

    public C2105Ddr() {
        super(A00, "payment_pin", 1);
    }

    public void A06(SQLiteDatabase sQLiteDatabase) {
    }

    public void A09(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        0fH.A0V(Integer.valueOf(i), C2105Ddr.class, "onUpgrade from %d to %d", Integer.valueOf(i2));
        1Du it = A00.iterator();
        while (it.hasNext()) {
            String A0W = 0Pz.A0W(1BJ.A00(25), ((1Dd) it.next()).A00);
            C01m.A00(964372216);
            sQLiteDatabase.execSQL(A0W);
            C01m.A00(845519503);
        }
        A07(sQLiteDatabase);
    }
}
