package com.facebook.msys.mcs;

import X.1Vt;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

/* loaded from: Messaging.class */
public class Messaging {
    static {
        1Vt.A00();
    }

    public static native boolean setContactSyncParamsNative(SqliteHolder sqliteHolder, Integer num, Integer num2);

    public static native boolean setMailboxSyncParamsNative(SqliteHolder sqliteHolder, Integer num, Integer num2, Integer num3, Integer num4, Float f, Integer num5, Integer num6, String str, String str2, Integer num7);
}
