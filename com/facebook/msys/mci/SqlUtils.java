package com.facebook.msys.mci;

import X.C1jh;

/* loaded from: SqlUtils.class */
public class SqlUtils {
    static {
        C1jh.A00();
    }

    public static native void disableSqliteMemoryStatus();

    public static native void enableCustomAllocationTracker();

    public static native void enableSqliteMultiThreadAndroid();

    public static native void enableSqliteSmallMalloc();

    public static native boolean isMultiThreadEnabled();

    public static native void setSqliteLookasideAllocation(long j, long j2);

    public static native void setSqliteMMAPSize(long j);
}
