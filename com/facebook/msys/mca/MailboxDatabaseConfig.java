package com.facebook.msys.mca;

import X.1Vt;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.DatabaseHealthMonitorFatalErrorCallback;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

/* loaded from: MailboxDatabaseConfig.class */
public class MailboxDatabaseConfig {
    public static final MailboxDatabaseConfig $redex_init_class = null;
    public final NativeHolder mNativeHolder;

    static {
        1Vt.A00();
    }

    public MailboxDatabaseConfig(String str, String str2, Map map, DatabaseHealthMonitorFatalErrorCallback databaseHealthMonitorFatalErrorCallback, MailboxDatabaseCallback mailboxDatabaseCallback, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, int i2, boolean z9, boolean z10, Database.SchemaDeployer schemaDeployer, Database.SchemaDeployer schemaDeployer2, Database.SchemaDeployer schemaDeployer3, Database.SchemaDeployer schemaDeployer4, Database.VirtualTableModuleRegistrator virtualTableModuleRegistrator) {
        this.mNativeHolder = initNativeHolder(str, str2, map, databaseHealthMonitorFatalErrorCallback, mailboxDatabaseCallback, z, false, false, z4, z5, z6, z7, z8, 0, -1, false, z10, schemaDeployer, schemaDeployer2, schemaDeployer3, schemaDeployer4, virtualTableModuleRegistrator);
    }

    private native NativeHolder initNativeHolder(String str, String str2, Map map, DatabaseHealthMonitorFatalErrorCallback databaseHealthMonitorFatalErrorCallback, MailboxDatabaseCallback mailboxDatabaseCallback, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, int i2, boolean z9, boolean z10, Database.SchemaDeployer schemaDeployer, Database.SchemaDeployer schemaDeployer2, Database.SchemaDeployer schemaDeployer3, Database.SchemaDeployer schemaDeployer4, Database.VirtualTableModuleRegistrator virtualTableModuleRegistrator);
}
