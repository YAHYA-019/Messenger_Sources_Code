package com.facebook.msys.mcp.tamstoragedirectoryplugin;

import X.0Pz;
import X.1BY;
import X.1Bi;
import X.1Yq;

/* loaded from: MsysTamStorageDirectoryPluginSessionless.class */
public class MsysTamStorageDirectoryPluginSessionless extends Sessionless {
    public 1BY _UL_mInjectionContext;
    public String storagePath;

    private String getAppStoragePath() {
        String A01 = ((1Yq) 1Bi.A03(16708)).A01();
        if (A01 == null) {
            return null;
        }
        return 0Pz.A0W(A01, "/");
    }

    @Override // com.facebook.msys.mcp.tamstoragedirectoryplugin.Sessionless
    public String MsysTamStorageDirectoryImpl_MsysTamStorageDirectoryGetPath() {
        if (this.storagePath == null) {
            synchronized (MsysTamStorageDirectoryPluginSessionless.class) {
                if (this.storagePath == null) {
                    this.storagePath = getAppStoragePath();
                }
            }
        }
        return this.storagePath;
    }
}
