package com.facebook.msys.mcp.authdatastorageplugin;

import X.0fH;
import com.facebook.msys.mci.AuthData;
import com.facebook.msys.mci.AuthDataStorage;

/* loaded from: MsysAuthDataStoragePluginSessionless.class */
public class MsysAuthDataStoragePluginSessionless extends Sessionless {
    private boolean checkAuthDataStorageReadiness() {
        boolean z = AuthDataStorage.sInitialized;
        if (!z) {
            0fH.A0k("MsysAuthDataStorage", "AuthDataStorage is not initialized.");
        }
        return z;
    }

    private boolean checkAuthDataValid(AuthData authData) {
        boolean z = false;
        if (authData.getFacebookUserID() != null) {
            z = true;
        }
        return z;
    }

    @Override // com.facebook.msys.mcp.authdatastorageplugin.Sessionless
    public Object MsysAuthDataStorageImpl_MsysAuthDataStorageGetCopy(AuthData authData, String str) {
        if (authData.getFacebookUserID() == null || !checkAuthDataStorageReadiness()) {
            return null;
        }
        return AuthDataStorage.getFromRawKey(str);
    }

    @Override // com.facebook.msys.mcp.authdatastorageplugin.Sessionless
    public void MsysAuthDataStorageImpl_MsysAuthDataStorageReset(AuthData authData) {
        if (authData.getFacebookUserID() == null || !checkAuthDataStorageReadiness()) {
            return;
        }
        AuthDataStorage.resetFromFacebookUserId(authData.getFacebookUserID());
    }

    @Override // com.facebook.msys.mcp.authdatastorageplugin.Sessionless
    public void MsysAuthDataStorageImpl_MsysAuthDataStorageSet(AuthData authData, String str, Object obj) {
        if (authData.getFacebookUserID() == null || !checkAuthDataStorageReadiness()) {
            return;
        }
        AuthDataStorage.setWithRawKey(str, obj);
    }
}
