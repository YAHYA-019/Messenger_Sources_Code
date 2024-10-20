package com.msys;

import X.0Q8;
import X.3DE;
import X.3DF;
import com.facebook.msys.mcf.MsysError;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import com.facebook.simplejni.NativeHolder;
import com.mcftypeholder.McfTypeHolder;

/* loaded from: MsysInfraMCFBridgeCallbacks.class */
public class MsysInfraMCFBridgeCallbacks {

    /* loaded from: MsysInfraMCFBridgeCallbacks$MCIDatabaseConfigureCallback.class */
    public abstract class MCIDatabaseConfigureCallback {
        public MCIDatabaseConfigureCallback() {
            throw 0Q8.createAndThrow();
        }

        private boolean callbackJNI(SqliteHolder sqliteHolder, int i, boolean z, NativeHolder nativeHolder) {
            throw 0Q8.createAndThrow();
        }
    }

    /* loaded from: MsysInfraMCFBridgeCallbacks$MCIDatabaseFatalErrorHandler.class */
    public abstract class MCIDatabaseFatalErrorHandler {
        public MCIDatabaseFatalErrorHandler() {
            throw 0Q8.createAndThrow();
        }

        private void callbackJNI(MsysError msysError) {
            throw 0Q8.createAndThrow();
        }
    }

    /* loaded from: MsysInfraMCFBridgeCallbacks$MCIDatabaseInitializedCallback.class */
    public abstract class MCIDatabaseInitializedCallback {
        public MCIDatabaseInitializedCallback() {
            throw 0Q8.createAndThrow();
        }

        private void callbackJNI(SqliteHolder sqliteHolder) {
            throw 0Q8.createAndThrow();
        }
    }

    /* loaded from: MsysInfraMCFBridgeCallbacks$MCIDatabaseSchemaDeployer.class */
    public abstract class MCIDatabaseSchemaDeployer {
        private NativeHolder callbackJNI(SqliteHolder sqliteHolder) {
            int upgrade = ((3DE) this).A00.upgrade(sqliteHolder);
            NativeHolder MCIDatabaseSchemaDeployerResultCreateDefaultNative = msysInfraMCFBridgejniDispatcher.MCIDatabaseSchemaDeployerResultCreateDefaultNative();
            McfTypeHolder mcfTypeHolder = McfTypeHolder.$redex_init_class;
            msysInfraMCFBridgejniDispatcher.MCIDatabaseSchemaDeployerResultSetSqliteErrorCodeNative(MCIDatabaseSchemaDeployerResultCreateDefaultNative, upgrade);
            return MCIDatabaseSchemaDeployerResultCreateDefaultNative;
        }
    }

    /* loaded from: MsysInfraMCFBridgeCallbacks$MCIDatabaseVirtualTableModuleRegistrator.class */
    public abstract class MCIDatabaseVirtualTableModuleRegistrator {
        private int callbackJNI(SqliteHolder sqliteHolder) {
            return ((3DF) this).A00.register(sqliteHolder);
        }
    }

    /* loaded from: MsysInfraMCFBridgeCallbacks$MCIMailboxDatabaseOpenCallback.class */
    public abstract class MCIMailboxDatabaseOpenCallback {
        public MCIMailboxDatabaseOpenCallback() {
            throw 0Q8.createAndThrow();
        }

        private void callbackJNI(boolean z, AccountSession accountSession, MsysError msysError) {
            throw 0Q8.createAndThrow();
        }
    }
}
