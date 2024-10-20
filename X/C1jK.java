package X;

import com.facebook.messenger.platform_logger.ttrclistener.TTRCMsysListeners;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.msys.mci.SessionedNotificationCenter;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* renamed from: X.1jK, reason: invalid class name */
/* loaded from: 1jK.class */
public final class C1jK {
    private final void disableTTRCMsysQueryTrackerNative(int i) {
        TTRCMsysListeners.disableTTRCMsysQueryTrackerNative(i);
    }

    private final void enableTTRCMsysQueryTrackerNative(int i) {
        TTRCMsysListeners.enableTTRCMsysQueryTrackerNative(i);
    }

    private final NativeHolder initNativeHolder(ArrayList arrayList) {
        return TTRCMsysListeners.initNativeHolder(arrayList);
    }

    private final void loadInitialSyncStates(SqliteHolder sqliteHolder) {
        TTRCMsysListeners.loadInitialSyncStates(sqliteHolder);
    }

    private final void registerNotificationCenter(NotificationCenter notificationCenter, SessionedNotificationCenter sessionedNotificationCenter, boolean z, boolean z2, boolean z3, long j) {
        TTRCMsysListeners.registerNotificationCenter(notificationCenter, sessionedNotificationCenter, z, z2, z3, j);
    }

    private final void syncGroupStateListenForCompletion(int[] iArr, int i, NotificationCenter notificationCenter) {
        TTRCMsysListeners.syncGroupStateListenForCompletion(iArr, i, notificationCenter);
    }
}
