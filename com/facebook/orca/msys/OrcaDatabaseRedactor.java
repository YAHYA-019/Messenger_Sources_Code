package com.facebook.orca.msys;

import X.C0il;
import com.facebook.msys.mci.MsysDatabaseRedactor;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

/* loaded from: OrcaDatabaseRedactor.class */
public class OrcaDatabaseRedactor implements MsysDatabaseRedactor {
    static {
        C0il.A0B("orcaDatabaseRedactor-jni");
    }

    public static native int copyAndRedactDatabaseNative(SqliteHolder sqliteHolder, String str, MsysDatabaseRedactor.ProgressCallback progressCallback);

    @Override // com.facebook.msys.mci.MsysDatabaseRedactor
    public int copyAndRedactDatabase(SqliteHolder sqliteHolder, String str) {
        return copyAndRedactDatabaseNative(sqliteHolder, str, null);
    }

    @Override // com.facebook.msys.mci.MsysDatabaseRedactor
    public int copyAndRedactDatabase(SqliteHolder sqliteHolder, String str, MsysDatabaseRedactor.ProgressCallback progressCallback) {
        return copyAndRedactDatabaseNative(sqliteHolder, str, progressCallback);
    }
}
