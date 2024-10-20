package X;

import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import com.facebook.orca.msys.OrcaDatabaseSchemaDeployerMDMS;
import com.facebook.orca.msys.OrcaDatabaseSchemaDeployerMDMS_DEFERRED;

/* loaded from: N86.class */
public final class N86 implements Database.SchemaDeployer {
    public final int A00;

    public N86(int i) {
        this.A00 = i;
    }

    @Override // com.facebook.msys.mci.Database.SchemaDeployer
    public final int upgrade(SqliteHolder sqliteHolder) {
        switch (this.A00) {
            case 0:
                C0il.A0B("orcaDatabaseSchemaDeployer-jniMDMS_DEFERREDnovt");
                return OrcaDatabaseSchemaDeployerMDMS_DEFERRED.deployInMemorySchemaNative(sqliteHolder);
            case 1:
                C0il.A0B("orcaDatabaseSchemaDeployer-jniMDMSnovt");
                return OrcaDatabaseSchemaDeployerMDMS.deployInMemorySchemaNative(sqliteHolder);
            default:
                return 0;
        }
    }
}
