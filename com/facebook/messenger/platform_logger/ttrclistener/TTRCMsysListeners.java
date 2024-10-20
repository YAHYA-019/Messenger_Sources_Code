package com.facebook.messenger.platform_logger.ttrclistener;

import X.1jL;
import X.C1jK;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.msys.mci.SessionedNotificationCenter;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: TTRCMsysListeners.class */
public final class TTRCMsysListeners {
    public static final C1jK Companion = new Object();
    public NativeHolder mNativeHolder;

    public TTRCMsysListeners() {
        1jL.A00();
    }

    public static final native void disableTTRCMsysQueryTrackerNative(int i);

    public static final native void enableTTRCMsysQueryTrackerNative(int i);

    public static final native NativeHolder initNativeHolder(ArrayList arrayList);

    public static final native void loadInitialSyncStates(SqliteHolder sqliteHolder);

    public static final native void registerNotificationCenter(NotificationCenter notificationCenter, SessionedNotificationCenter sessionedNotificationCenter, boolean z, boolean z2, boolean z3, long j);

    public static final native void syncGroupStateListenForCompletion(int[] iArr, int i, NotificationCenter notificationCenter);
}
