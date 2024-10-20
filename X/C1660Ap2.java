package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Ap2, reason: case insensitive filesystem */
/* loaded from: Ap2.class */
public final class C1660Ap2 extends 1Da {
    public final CaK A00;

    public C1660Ap2() {
        super(ImmutableList.of((Object) new C1648Aoq(), (Object) new C1649Aor(), (Object) new C1650Aos(), (Object) new C1646Aoo(), (Object) new C1651Aot(), (Object) new C1645Aon(), (Object) new C1647Aop()), "search_db_cache", 27);
        this.A00 = (CaK) 1Bn.A0A(84433);
    }

    public void A08(SQLiteDatabase sQLiteDatabase) {
        super.A08(sQLiteDatabase);
        if (sQLiteDatabase.isReadOnly()) {
            return;
        }
        C01m.A00(-1274471838);
        sQLiteDatabase.execSQL("PRAGMA foreign_keys=ON;");
        C01m.A00(1507280231);
    }

    public void A09(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3;
        super.A09(sQLiteDatabase, i, i2);
        1Ql.A01(1BL.A0V(this.A00.A00), CaK.A01, false);
        if (i < 2 || i > 5 || i2 < 6) {
            return;
        }
        FbUserSession A00 = 1Fw.A00();
        1Bn.A0A(148123);
        CGA cga = (CGA) 1Bn.A0A(84404);
        C01m.A01(sQLiteDatabase, 113290060);
        try {
            try {
                Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT fbid, item_type, display_name, first_name, last_name, picture_url, most_recent_pick_time_ms, total_pick_count FROM recent_search_metadata INNER JOIN search_items ON fbid = recent_search_fbid WHERE total_pick_count NOT NULL AND total_pick_count > 0", null);
                try {
                    1Ms A04 = CQk.A04(rawQuery, sQLiteDatabase);
                    rawQuery.moveToPosition(-1);
                    int columnIndex = rawQuery.getColumnIndex("fbid");
                    int columnIndex2 = rawQuery.getColumnIndex("item_type");
                    int columnIndex3 = rawQuery.getColumnIndex("display_name");
                    int columnIndex4 = rawQuery.getColumnIndex("first_name");
                    int columnIndex5 = rawQuery.getColumnIndex("last_name");
                    int columnIndex6 = rawQuery.getColumnIndex("picture_url");
                    int columnIndex7 = rawQuery.getColumnIndex("most_recent_pick_time_ms");
                    int columnIndex8 = rawQuery.getColumnIndex("total_pick_count");
                    ContentValues A07 = 4YU.A07();
                    while (rawQuery.moveToNext()) {
                        String string = rawQuery.getString(columnIndex);
                        int i4 = rawQuery.getInt(columnIndex2);
                        String A002 = i4 == BNK.A0A.dbValue ? BVf.A00(ImmutableList.copyOf(A04.AUe(string))) : null;
                        A07.put("fbid", string);
                        4YU.A1E(A07, "item_type", i4);
                        A07.put("display_name", rawQuery.getString(columnIndex3));
                        A07.put("first_name", rawQuery.getString(columnIndex4));
                        A07.put("last_name", rawQuery.getString(columnIndex5));
                        A07.put("picture_url", rawQuery.getString(columnIndex6));
                        A07.put("group_participants_blob", A002);
                        4YU.A1E(A07, "most_recent_pick_time_ms", rawQuery.getInt(columnIndex7));
                        A07.put("most_recent_pick_rank_section", "unknown");
                        4YU.A1E(A07, "total_pick_count", rawQuery.getInt(columnIndex8));
                        C01m.A00(-1790027266);
                        sQLiteDatabase.insertWithOnConflict("recent_search_items", null, A07, 5);
                        C01m.A00(-489956100);
                        AcZ.A01(sQLiteDatabase, A00, CQk.A03(rawQuery, A04), cga);
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    rawQuery.close();
                    i3 = -987537624;
                } catch (Throwable th) {
                    if (rawQuery != null) {
                        try {
                            rawQuery.close();
                        } catch (Throwable th2) {
                            7kF.A00(th, th2);
                        }
                    }
                    throw th;
                }
            } catch (Exception e) {
                0fH.A0x("RecentSearchDbMigrator", "Encountered an exception migrating recent searches", e);
                i3 = -652730727;
            }
            C01m.A03(sQLiteDatabase, i3);
            String A0W = 0Pz.A0W(1BJ.A00(25), "recent_search_metadata");
            C01m.A00(-34282884);
            sQLiteDatabase.execSQL(A0W);
            C01m.A00(353063685);
        } catch (Throwable th3) {
            C01m.A03(sQLiteDatabase, 2078380936);
            throw th3;
        }
    }
}
