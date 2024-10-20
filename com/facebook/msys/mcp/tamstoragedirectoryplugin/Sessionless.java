package com.facebook.msys.mcp.tamstoragedirectoryplugin;

/* loaded from: Sessionless.class */
public abstract class Sessionless {
    private String MsysTamStorageDirectoryImpl_MsysTamStorageDirectoryGetPathJNI() {
        String MsysTamStorageDirectoryImpl_MsysTamStorageDirectoryGetPath = MsysTamStorageDirectoryImpl_MsysTamStorageDirectoryGetPath();
        if (MsysTamStorageDirectoryImpl_MsysTamStorageDirectoryGetPath == null) {
            MsysTamStorageDirectoryImpl_MsysTamStorageDirectoryGetPath = null;
        }
        return MsysTamStorageDirectoryImpl_MsysTamStorageDirectoryGetPath;
    }

    public abstract String MsysTamStorageDirectoryImpl_MsysTamStorageDirectoryGetPath();
}
