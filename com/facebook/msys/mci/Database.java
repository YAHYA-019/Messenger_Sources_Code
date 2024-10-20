package com.facebook.msys.mci;

import X.AnonymousClass001;
import X.C1jh;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import com.facebook.simplejni.NativeHolder;

/* loaded from: Database.class */
public class Database {
    public NativeHolder mNativeHolder;
    public volatile DatabaseConnection mReadWriteConnection;

    /* loaded from: Database$InitializedCallback.class */
    public class InitializedCallback {
        public void onInit(SqliteHolder sqliteHolder) {
        }
    }

    /* loaded from: Database$OpenCallback.class */
    public class OpenCallback {
        public void onConfig(SqliteHolder sqliteHolder, int i, DatabaseConnectionSettings databaseConnectionSettings) {
        }

        public boolean onConfig(SqliteHolder sqliteHolder, int i, boolean z, long j, DatabaseConnectionSettings databaseConnectionSettings) {
            onConfig(sqliteHolder, i, databaseConnectionSettings);
            return true;
        }

        public void onOpen(boolean z, Throwable th) {
            if (th != null) {
                throw AnonymousClass001.A0U(th);
            }
        }
    }

    /* loaded from: Database$SchemaDeployer.class */
    public interface SchemaDeployer {
        int upgrade(SqliteHolder sqliteHolder);
    }

    /* loaded from: Database$VirtualTableModuleRegistrator.class */
    public interface VirtualTableModuleRegistrator {
        int register(SqliteHolder sqliteHolder);
    }

    static {
        C1jh.A00();
    }

    public Database(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
