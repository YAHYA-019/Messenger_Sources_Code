package com.facebook.messaging.msys.common.bootstrap;

import X.C0il;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import java.util.Map;

/* loaded from: MsysTransportBootstrapJNI.class */
public class MsysTransportBootstrapJNI {
    static {
        C0il.A0B("msystransportbootstrapjni");
    }

    public static native Map onInit(SqliteHolder sqliteHolder, boolean z, Long l, String str);
}
