package com.facebook.messenger.platform_logger.mplsyncmonitor;

import X.0fH;
import X.AnonymousClass001;
import X.C0il;
import X.C23y;
import X.C3Mf;
import com.facebook.msys.mca.Mailbox;
import java.util.ArrayList;
import java.util.List;

/* loaded from: MPLSyncMonitor.class */
public final class MPLSyncMonitor {
    public static final MPLSyncMonitor INSTANCE = new Object();
    public static final List delayedSyncMonitorRequests;
    public static boolean isFirstSyncInitiated;
    public static Mailbox mailbox;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.messenger.platform_logger.mplsyncmonitor.MPLSyncMonitor, java.lang.Object] */
    static {
        synchronized (C23y.class) {
            if (!C23y.A00) {
                C0il.A0B("messengerplatformloggermplsyncmonitorjni");
                C23y.A00 = true;
            }
        }
        delayedSyncMonitorRequests = new ArrayList();
    }

    private final native void syncMonitorAppendTrackQueryNative(int i, int i2, int i3, Mailbox mailbox2, String str, String str2);

    private final native void syncMonitorExpectAllQueriesEndNative(int i, int i2);

    private final native void syncMonitorForegroundTTRCAppendTrackQueryNative(int i, int i2, Mailbox mailbox2, String str, String str2);

    public static final void syncMonitorStartForegroundTTRC(int i, int i2, String str, String str2, boolean z) {
        synchronized (MPLSyncMonitor.class) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("syncMonitorStartForegroundTTRC, ");
            0fH.A0j("MPLSyncMonitor", AnonymousClass001.A0a(mailbox, A0k));
            Mailbox mailbox2 = mailbox;
            if (mailbox2 == null || (z && !isFirstSyncInitiated)) {
                delayedSyncMonitorRequests.add(new C3Mf(str, str2, i, i2, null));
            } else {
                INSTANCE.syncMonitorStartForegroundTTRCNative(i, i2, mailbox2, str, str2);
            }
        }
    }

    private final native void syncMonitorStartForegroundTTRCNative(int i, int i2, Mailbox mailbox2, String str, String str2);

    public static final void syncMonitorStartSingleQueryTTRC(int i, int i2, int i3, String str, String str2, boolean z) {
        synchronized (MPLSyncMonitor.class) {
            StringBuilder sb = new StringBuilder();
            sb.append("syncMonitorStartSingleQueryTTRC, ");
            sb.append(mailbox);
            0fH.A0j("MPLSyncMonitor", sb.toString());
            Mailbox mailbox2 = mailbox;
            if (mailbox2 != null) {
                INSTANCE.syncMonitorStartSingleQueryTTRCNative(i, i2, i3, mailbox2, str, str2);
            } else {
                delayedSyncMonitorRequests.add(new C3Mf(str, str2, i, i2, Integer.valueOf(i3)));
            }
        }
    }

    private final native void syncMonitorStartSingleQueryTTRCNative(int i, int i2, int i3, Mailbox mailbox2, String str, String str2);
}
