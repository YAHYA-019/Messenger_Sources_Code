package com.facebook.msys.mci;

import X.1XV;

/* loaded from: TaskTracker.class */
public class TaskTracker {
    public static final TaskTracker TRACKER_CRYPTO;
    public static final TaskTracker TRACKER_DATABASE;
    public static final TaskTracker TRACKER_DATABASE_READ_ONLY;
    public static final TaskTracker TRACKER_MAIN;
    public static final TaskTracker TRACKER_NETWORK;
    public static final TaskTracker TRACKER_UTILITY;
    public final int mExecutionContext;
    public final String mQueueName;

    static {
        1XV.A00();
        TRACKER_MAIN = new TaskTracker(1, "Main");
        TRACKER_DATABASE = new TaskTracker(2, "Database");
        TRACKER_NETWORK = new TaskTracker(3, "Network");
        TRACKER_UTILITY = new TaskTracker(4, "Utility");
        TRACKER_CRYPTO = new TaskTracker(5, "Crypto");
        TRACKER_DATABASE_READ_ONLY = new TaskTracker(6, "DatabaseReadOnly");
    }

    public TaskTracker(int i, String str) {
        this.mExecutionContext = i;
        this.mQueueName = str;
    }

    public static native long nativeGetLong(int i, int i2);

    public static native String nativeGetString(int i, int i2);

    public static native int nativeGetTaskCount(int i);
}
