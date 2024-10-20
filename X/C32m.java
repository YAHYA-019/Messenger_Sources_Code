package X;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.32m, reason: invalid class name */
/* loaded from: 32m.class */
public final class C32m extends SQLiteOpenHelper {
    public SQLiteDatabase A00;
    public final InterfaceC11004vV A01;
    public final 4uG A02;
    public final 4uJ A03;
    public final C11024vb A04;
    public final 4uI A05;

    public C32m(Context context, 4uG r303, 4uJ r304, C11024vb c11024vb, 4uI r306) {
        super(context, "location_sharing.db", (SQLiteDatabase.CursorFactory) null, 4);
        this.A01 = new InterfaceC11004vV() { // from class: X.3X1
            @Override // X.InterfaceC11004vV
            public SQLiteDatabase AUF() {
                return C32m.this.A00;
            }
        };
        this.A04 = c11024vb;
        this.A05 = r306;
        this.A02 = r303;
        this.A03 = r304;
    }

    private void A00(SQLiteDatabase sQLiteDatabase) {
        C01m.A00(1030865728);
        sQLiteDatabase.execSQL("PRAGMA defer_foreign_keys = ON");
        C01m.A00(876326482);
        Iterator it = 4vX.A01(new 4vW(this.A01)).iterator();
        while (it.hasNext()) {
            String A0W = 0Pz.A0W("DROP TABLE IF EXISTS ", AnonymousClass001.A0i(it));
            C01m.A00(-965982083);
            sQLiteDatabase.execSQL(A0W);
            C01m.A00(-594913825);
        }
        C01m.A00(1976812883);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS sqliteproc_metadata");
        C01m.A00(-712954275);
        C01m.A00(1166523650);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS sqliteproc_schema");
        C01m.A00(-1932114081);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.A00 = sQLiteDatabase;
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (this.A00 == null) {
            onConfigure(sQLiteDatabase);
        }
        0T9.A02("onCreate", 1958808839);
        try {
            4vR.A02(sQLiteDatabase, 4YT.A00(1500), 4vO.A00, 4vO.A01);
            4vR.A02(sQLiteDatabase, 4YT.A00(1501), 4vS.A00, 4vS.A01);
            0T9.A00(102040505);
        } catch (Throwable th) {
            0T9.A00(895824256);
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (this.A00 == null) {
            onConfigure(sQLiteDatabase);
        }
        A00(sQLiteDatabase);
        onCreate(sQLiteDatabase);
        4uG r0 = this.A02;
        HashSet A0v = AnonymousClass001.A0v();
        A0v.add("metadata_version_downgrade");
        r0.BiE(A0v);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.A00 == null) {
            onConfigure(sQLiteDatabase);
        }
        InterfaceC11004vV interfaceC11004vV = this.A01;
        String A00 = 4vX.A00(new 4vW(interfaceC11004vV), 4YT.A00(818));
        0T9.A02("migrate", 1731506034);
        try {
            4uJ r0 = this.A03;
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
            new 4vR(interfaceC11004vV, r0, this.A05, AnonymousClass001.A1U(A00)).A09(this.A02);
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
            0T9.A00(-1080327695);
        } catch (Throwable th) {
            0T9.A00(1309693588);
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (this.A00 == null) {
            onConfigure(sQLiteDatabase);
        }
        if (i < 3) {
            A00(sQLiteDatabase);
            onCreate(sQLiteDatabase);
            4uG r0 = this.A02;
            HashSet A0v = AnonymousClass001.A0v();
            A0v.add("metadata_version_upgrade_old");
            r0.BiE(A0v);
            return;
        }
        0T9.A02("upgrade_metadata", -1719321993);
        7uK.A00(sQLiteDatabase, "update_metadata_savepoint");
        C01m.A00(-295715942);
        sQLiteDatabase.execSQL("PRAGMA defer_foreign_keys = ON");
        C01m.A00(774941575);
        SQLException e = null;
        if (i == 3) {
            try {
                try {
                    C01m.A00(-134207813);
                    sQLiteDatabase.execSQL("ALTER TABLE sqliteproc_metadata ADD COLUMN index_hash TEXT;");
                    C01m.A00(-1409265254);
                    String A0j = 0Pz.A0j("CREATE TABLE _temp_sqliteproc_schema (", "_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, table_name TEXT NOT NULL, name TEXT NOT NULL, type_name TEXT NOT NULL, default_value TEXT, is_nullable INTEGER NOT NULL, is_primary INTEGER NOT NULL, is_autoincrement INTEGER NOT NULL, is_deleted INTEGER NOT NULL, is_added INTEGER NOT NULL, foreign_table TEXT, foreign_column TEXT, on_foreign_key_update TEXT, on_foreign_key_delete TEXT", ")");
                    C01m.A00(788577765);
                    sQLiteDatabase.execSQL(A0j);
                    C01m.A00(228951583);
                    String A0z = 0Pz.A0z("INSERT OR IGNORE INTO _temp_sqliteproc_schema (", "_id, table_name, name, type_name, default_value, is_nullable, is_primary, is_autoincrement, is_deleted, is_added, foreign_table, foreign_column, on_foreign_key_update, on_foreign_key_delete", ")SELECT ", "_id, table_name, name, type_name, default_value, is_nullable, is_primary, is_autoincrement, is_deleted, is_added, foreign_table, foreign_column, on_foreign_key_update, on_foreign_key_delete", " FROM sqliteproc_schema;");
                    C01m.A00(-176873696);
                    sQLiteDatabase.execSQL(A0z);
                    C01m.A00(1393872108);
                    C01m.A00(1728415561);
                    sQLiteDatabase.execSQL("DROP TABLE sqliteproc_schema;");
                    C01m.A00(-1817531416);
                    String A0j2 = 0Pz.A0j("CREATE TABLE sqliteproc_schema (", "_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, table_name TEXT NOT NULL, name TEXT NOT NULL, type_name TEXT NOT NULL, default_value TEXT, is_nullable INTEGER NOT NULL, is_primary INTEGER NOT NULL, is_autoincrement INTEGER NOT NULL, is_deleted INTEGER NOT NULL, is_added INTEGER NOT NULL, foreign_table TEXT, foreign_column TEXT, on_foreign_key_update TEXT, on_foreign_key_delete TEXT", ")");
                    C01m.A00(-564102168);
                    sQLiteDatabase.execSQL(A0j2);
                    C01m.A00(-1398834549);
                    C01m.A00(-1008897924);
                    sQLiteDatabase.execSQL("CREATE UNIQUE INDEX sqliteproc_schema_name_table_name ON sqliteproc_schema(name, table_name)");
                    C01m.A00(-581202494);
                    String A0z2 = 0Pz.A0z("INSERT OR IGNORE INTO sqliteproc_schema (", "_id, table_name, name, type_name, default_value, is_nullable, is_primary, is_autoincrement, is_deleted, is_added, foreign_table, foreign_column, on_foreign_key_update, on_foreign_key_delete", ")SELECT ", "_id, table_name, name, type_name, default_value, is_nullable, is_primary, is_autoincrement, is_deleted, is_added, foreign_table, foreign_column, on_foreign_key_update, on_foreign_key_delete", " FROM _temp_sqliteproc_schema;");
                    C01m.A00(-1977747350);
                    sQLiteDatabase.execSQL(A0z2);
                    C01m.A00(1503411433);
                    C01m.A00(-736911587);
                    sQLiteDatabase.execSQL("DROP TABLE _temp_sqliteproc_schema");
                    C01m.A00(-1718174911);
                } catch (SQLException e2) {
                    e = e2;
                    7uK.A02(sQLiteDatabase, "update_metadata_savepoint");
                }
            } catch (Throwable th) {
                7uK.A01(sQLiteDatabase, "update_metadata_savepoint");
                throw th;
            }
        }
        7uK.A01(sQLiteDatabase, "update_metadata_savepoint");
        if (e != null) {
            4uG r02 = this.A02;
            r02.Bsm(e, "Failed to migrate table metadata, so dropping all tables");
            A00(sQLiteDatabase);
            onCreate(sQLiteDatabase);
            HashSet A0v2 = AnonymousClass001.A0v();
            A0v2.add("metadata_version_upgrade_error");
            r02.BiE(A0v2);
        }
        0T9.A00(-813160151);
    }
}
