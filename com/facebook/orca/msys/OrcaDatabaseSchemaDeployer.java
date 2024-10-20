package com.facebook.orca.msys;

import com.facebook.msys.mci.sqliteholder.SqliteHolder;

/* loaded from: OrcaDatabaseSchemaDeployer.class */
public class OrcaDatabaseSchemaDeployer {
    public static native int deployInMemorySchemaNative(SqliteHolder sqliteHolder);

    public static native int deployPersistentSchemaNative(SqliteHolder sqliteHolder);

    public static native int deployPersistentSchemaNoVirtualTablesNative(SqliteHolder sqliteHolder);

    public static native int registerVirtualTableModuleFunctionsNative(SqliteHolder sqliteHolder);
}
