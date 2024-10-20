package com.facebook.msys.mci;

import X.C1jh;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

/* loaded from: PrivacyContextCoding.class */
public class PrivacyContextCoding {
    public static final PrivacyContextCoding $redex_init_class = null;

    static {
        C1jh.A00();
    }

    public static native PrivacyContext newPrivacyContextAllTransportNative(SqliteHolder sqliteHolder);

    public static native PrivacyContext newPrivacyContextNative(SqliteHolder sqliteHolder, String str, String str2);

    public static native PrivacyContext newPrivacyContextWithTransportKeyNative(SqliteHolder sqliteHolder, String str);
}
