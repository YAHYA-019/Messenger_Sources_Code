package com.facebook.msys.mci;

import com.facebook.msys.mci.sqliteholder.SqliteHolder;

/* loaded from: MsysDatabaseRedactor.class */
public interface MsysDatabaseRedactor {

    /* loaded from: MsysDatabaseRedactor$ProgressCallback.class */
    public interface ProgressCallback {
    }

    int copyAndRedactDatabase(SqliteHolder sqliteHolder, String str);

    int copyAndRedactDatabase(SqliteHolder sqliteHolder, String str, ProgressCallback progressCallback);
}
