package X;

import android.database.sqlite.SQLiteDatabase;
import com.google.common.collect.ImmutableList;

/* renamed from: X.4bw, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4bw.class */
public final class C04764bw extends 1Da {
    public C04764bw() {
        super(ImmutableList.of((Object) new 1Dd() { // from class: X.4bx
            public static final ImmutableList A00 = ImmutableList.of((Object) 1rJ.A02, (Object) 1rJ.A03);

            {
                ImmutableList immutableList = A00;
            }

            public void A09(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            }
        }, (Object) new 1Dd() { // from class: X.4bz
            public static final 1rV A00;
            public static final ImmutableList A01;
            public static final String A02;

            static {
                1Dj r0 = 4cD.A01;
                1Dj r02 = 4cD.A05;
                1Dj r03 = 4cD.A03;
                1Dj r04 = 4cD.A04;
                A00 = new 1rU(ImmutableList.of((Object) r0, (Object) r02, (Object) r03, (Object) r04));
                A01 = ImmutableList.of((Object) r0, (Object) 4cD.A06, (Object) 4cD.A02, (Object) 4cD.A08, (Object) 4cD.A00, (Object) 4cD.A07, (Object) r02, (Object) r03, (Object) r04);
                A02 = 1Dd.A04(ImmutableList.of((Object) "pos"), "units", "units_position_index");
            }

            {
                ImmutableList immutableList = A01;
                1rV r0 = A00;
            }

            public void A07(SQLiteDatabase sQLiteDatabase) {
                super.A07(sQLiteDatabase);
                String str = A02;
                C01m.A00(-2056448604);
                sQLiteDatabase.execSQL(str);
                C01m.A00(-1696873919);
            }

            public void A09(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            }
        }), "units", 9);
    }

    public void A06(SQLiteDatabase sQLiteDatabase) {
    }

    public void A09(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        0fH.A0d(Integer.valueOf(i), Integer.valueOf(i2), "UnitStoreSchemaPart", "onUpgrade (incremental path) from %d to %d");
        while (i < i2) {
            String A0W = 0Pz.A0W("DROP TABLE IF EXISTS ", "properties");
            C01m.A00(-1889933480);
            sQLiteDatabase.execSQL(A0W);
            C01m.A00(-758415459);
            String A0W2 = 0Pz.A0W("DROP TABLE IF EXISTS ", "units");
            C01m.A00(439872622);
            sQLiteDatabase.execSQL(A0W2);
            C01m.A00(-1525660733);
            A07(sQLiteDatabase);
            i = i2;
        }
    }
}
