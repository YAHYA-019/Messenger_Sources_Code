package com.facebook.msys.mci;

import X.C1jh;

/* loaded from: DatabaseFileManager.class */
public class DatabaseFileManager {
    static {
        C1jh.A00();
    }

    public static native void deleteDatabaseFilesForPathNative(String str);

    public static native void encryptAndDeleteDatabaseNative(long j, String str);
}
