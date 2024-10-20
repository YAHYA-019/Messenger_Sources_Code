package com.facebook.msys.mci;

import X.C1jh;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import com.facebook.simplejni.NativeHolder;

/* loaded from: DatabaseConnection.class */
public class DatabaseConnection {
    public final NativeHolder mNativeHolder;

    /* loaded from: DatabaseConnection$DatabaseRunnable.class */
    public interface DatabaseRunnable {
        void run(SqliteHolder sqliteHolder);
    }

    static {
        C1jh.A00();
    }

    public DatabaseConnection(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public native void execute(DatabaseRunnable databaseRunnable);

    public native int getMode();
}
