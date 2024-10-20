package com.facebook.orca.msys;

import com.facebook.msys.mci.sqliteholder.SqliteHolder;

/* loaded from: OrcaDatabaseSchemaDeployerMDMS_DEFERRED.class */
public class OrcaDatabaseSchemaDeployerMDMS_DEFERRED {
    public static native int deployInMemorySchemaNative(SqliteHolder sqliteHolder);

    public static native int deployPersistentSchemaNative(SqliteHolder sqliteHolder);

    public static native int deployPersistentSchemaNoVirtualTablesNative(SqliteHolder sqliteHolder);

    public static native int registerVirtualTableModuleFunctionsNative(SqliteHolder sqliteHolder);
}
