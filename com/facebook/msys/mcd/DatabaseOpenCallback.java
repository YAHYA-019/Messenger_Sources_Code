package com.facebook.msys.mcd;

import X.1Vt;
import X.AnonymousClass001;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.DatabaseConnectionSettings;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

/* loaded from: DatabaseOpenCallback.class */
public class DatabaseOpenCallback extends Database.OpenCallback {
    static {
        1Vt.A00();
    }

    private native boolean onConfigNative(SqliteHolder sqliteHolder, int i, boolean z, long j);

    @Override // com.facebook.msys.mci.Database.OpenCallback
    public final boolean onConfig(SqliteHolder sqliteHolder, int i, boolean z, long j, DatabaseConnectionSettings databaseConnectionSettings) {
        onConfig(sqliteHolder, i, databaseConnectionSettings);
        return AnonymousClass001.A1N(onConfigNative(sqliteHolder, i, z, j) ? 1 : 0);
    }
}
