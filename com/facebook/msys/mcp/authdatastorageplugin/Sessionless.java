package com.facebook.msys.mcp.authdatastorageplugin;

import com.facebook.msys.mci.AuthData;

/* loaded from: Sessionless.class */
public abstract class Sessionless {
    private Object MsysAuthDataStorageImpl_MsysAuthDataStorageGetCopyJNI(AuthData authData, String str) {
        Object MsysAuthDataStorageImpl_MsysAuthDataStorageGetCopy = MsysAuthDataStorageImpl_MsysAuthDataStorageGetCopy(authData, str);
        if (MsysAuthDataStorageImpl_MsysAuthDataStorageGetCopy == null) {
            MsysAuthDataStorageImpl_MsysAuthDataStorageGetCopy = null;
        }
        return MsysAuthDataStorageImpl_MsysAuthDataStorageGetCopy;
    }

    private void MsysAuthDataStorageImpl_MsysAuthDataStorageResetJNI(AuthData authData) {
        MsysAuthDataStorageImpl_MsysAuthDataStorageReset(authData);
    }

    private void MsysAuthDataStorageImpl_MsysAuthDataStorageSetJNI(AuthData authData, String str, Object obj) {
        if (obj == null) {
            obj = null;
        }
        MsysAuthDataStorageImpl_MsysAuthDataStorageSet(authData, str, obj);
    }

    public abstract Object MsysAuthDataStorageImpl_MsysAuthDataStorageGetCopy(AuthData authData, String str);

    public abstract void MsysAuthDataStorageImpl_MsysAuthDataStorageReset(AuthData authData);

    public abstract void MsysAuthDataStorageImpl_MsysAuthDataStorageSet(AuthData authData, String str, Object obj);
}
