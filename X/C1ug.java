package X;

import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import com.facebook.orca.msys.OrcaDatabaseSchemaDeployer;

/* renamed from: X.1ug, reason: invalid class name */
/* loaded from: 1ug.class */
public final /* synthetic */ class C1ug implements Database.VirtualTableModuleRegistrator {
    @Override // com.facebook.msys.mci.Database.VirtualTableModuleRegistrator
    public final int register(SqliteHolder sqliteHolder) {
        C0il.A0B("orcaDatabaseSchemaDeployer-jni");
        return OrcaDatabaseSchemaDeployer.registerVirtualTableModuleFunctionsNative(sqliteHolder);
    }
}
