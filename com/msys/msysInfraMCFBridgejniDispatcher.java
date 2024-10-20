package com.msys;

import X.C0il;
import com.facebook.simplejni.NativeHolder;
import com.msys.MsysInfraMCFBridgeCallbacks;
import java.util.Map;

/* loaded from: msysInfraMCFBridgejniDispatcher.class */
public class msysInfraMCFBridgejniDispatcher {
    static {
        C0il.A0B("msysInfraMCFBridgejni");
    }

    public static native NativeHolder MCIDatabaseConfigCreateNative(NativeHolder nativeHolder, MsysInfraMCFBridgeCallbacks.MCIDatabaseSchemaDeployer mCIDatabaseSchemaDeployer, MsysInfraMCFBridgeCallbacks.MCIDatabaseSchemaDeployer mCIDatabaseSchemaDeployer2, MsysInfraMCFBridgeCallbacks.MCIDatabaseSchemaDeployer mCIDatabaseSchemaDeployer3, MsysInfraMCFBridgeCallbacks.MCIDatabaseSchemaDeployer mCIDatabaseSchemaDeployer4, MsysInfraMCFBridgeCallbacks.MCIDatabaseConfigureCallback mCIDatabaseConfigureCallback, MsysInfraMCFBridgeCallbacks.MCIDatabaseInitializedCallback mCIDatabaseInitializedCallback, MsysInfraMCFBridgeCallbacks.MCIMailboxDatabaseOpenCallback mCIMailboxDatabaseOpenCallback, NativeHolder nativeHolder2, Map map, MsysInfraMCFBridgeCallbacks.MCIDatabaseFatalErrorHandler mCIDatabaseFatalErrorHandler, MsysInfraMCFBridgeCallbacks.MCIDatabaseVirtualTableModuleRegistrator mCIDatabaseVirtualTableModuleRegistrator);

    public static native void MCIDatabaseConfigSetEarlyInjectAuxDBConnectionsNative(NativeHolder nativeHolder, boolean z);

    public static native void MCIDatabaseConfigSetEnableEarlyAuxDBOpenNative(NativeHolder nativeHolder, boolean z);

    public static native NativeHolder MCIDatabaseSchemaDeployerResultCreateDefaultNative();

    public static native void MCIDatabaseSchemaDeployerResultSetSqliteErrorCodeNative(NativeHolder nativeHolder, int i);
}
