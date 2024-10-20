package com.facebook.messenger.platform_logger;

import X.03Y;
import X.11T;
import X.1QL;
import X.1QR;
import X.C0il;
import java.util.HashMap;
import java.util.Map;

/* loaded from: MPLTracker.class */
public final class MPLTracker {
    public static final MPLTracker INSTANCE = new Object();
    public static final HashMap completionCallbacks = new HashMap();

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.messenger.platform_logger.MPLTracker, java.lang.Object] */
    static {
        synchronized (1QR.class) {
            if (!1QR.A00) {
                C0il.A0B("messengerplatformloggerjni");
                1QR.A00 = true;
            }
        }
    }

    public static final void addStoredProcedureName(int i, int i2, String str, int i3, String str2) {
        INSTANCE.addStoredProcedureNameNative(i, i2, "thread_list", 1, "thread_list");
    }

    private final native void addStoredProcedureNameNative(int i, int i2, String str, int i3, String str2);

    private final native void allSyncGroupsUpToDateNative(int i, int i2, String str, long j);

    private final native void applicationWillResignActiveNative();

    public static final void endInteraction(int i, int i2, short s, long j) {
        INSTANCE.endInteractionNative(i, i2, s, j);
    }

    private final native void endInteractionNative(int i, int i2, short s, long j);

    public static final void endInteractions(int i, short s, long j) {
        INSTANCE.endInteractionsNative(i, (short) 22, j);
    }

    private final native void endInteractionsNative(int i, short s, long j);

    public static final void expectPoint(int i, int i2, String str, boolean z) {
        11T.A0F(str, 2);
        INSTANCE.expectPointNative(i, i2, str, z);
    }

    private final native void expectPointNative(int i, int i2, String str, boolean z);

    public static final void expectQuery(int i, int i2, String str, int i3, long j, long j2) {
        INSTANCE.expectQueryNative(i, i2, str, i3, j, 0L);
    }

    private final native void expectQueryNative(int i, int i2, String str, int i3, long j, long j2);

    public static final Map getCurrentSyncGroupState(int i) {
        return INSTANCE.getCurrentSyncGroupStateNative(i);
    }

    private final native Map getCurrentSyncGroupStateNative(int i);

    private final native long getTimestampNative();

    private final native int identifierNative(String str);

    public static final void interactionCancel(int i, int i2, long j, String str) {
        INSTANCE.interactionCancelledNative(i, i2, j, str);
    }

    private final native void interactionCancelledNative(int i, int i2, long j, String str);

    public static final void interactionDropped(int i, int i2) {
        INSTANCE.interactionDroppedNative(i, i2);
    }

    private final native void interactionDroppedNative(int i, int i2);

    public static final void interactionFailed(int i, int i2, long j, String str) {
        INSTANCE.interactionFailedNative(i, i2, j, str);
    }

    private final native void interactionFailedNative(int i, int i2, long j, String str);

    public static final void onCompletion(int i, int i2, short s) {
        1QL r0 = (1QL) completionCallbacks.remove(new 03Y(Integer.valueOf(i), Integer.valueOf(i2)));
        if (r0 != null) {
            r0.A02(i, i2, s);
        }
    }

    public static final void queryCompleted(String str, long j) {
        INSTANCE.queryCompletedNative(str, j);
    }

    private final native void queryCompletedNative(String str, long j);

    public static final void queryContentDisplayed(int i, int i2, String str, long j, String str2) {
        INSTANCE.queryContentDisplayedNative(i, i2, str, j, "");
    }

    private final native void queryContentDisplayedNative(int i, int i2, String str, long j, String str2);

    public static final void queryContentUnchanged(int i, int i2, String str, long j) {
        INSTANCE.queryContentUnchangedNative(i, i2, str, j);
    }

    private final native void queryContentUnchangedNative(int i, int i2, String str, long j);

    private final native void queryDebouncedNative(int i, int i2, String str, long j);

    public static final void queryStarted(String str, long j) {
        INSTANCE.queryStartedNative(str, j, System.currentTimeMillis());
    }

    private final native void queryStartedNative(String str, long j, long j2);

    public static final void recordPoint(int i, int i2, String str, long j) {
        INSTANCE.recordPointNative(i, i2, str, j);
    }

    private final native void recordPointNative(int i, int i2, String str, long j);

    public static final void recordSurfaceLeftOnly(int i, int i2, long j, String str, int i3) {
        INSTANCE.recordSurfaceLeftOnlyNative(i, i2, j, str, 0);
    }

    private final native void recordSurfaceLeftOnlyNative(int i, int i2, long j, String str, int i3);

    public static final void removeExpectedPoint(int i, int i2, String str) {
        INSTANCE.removeExpectedPointNative(i, i2, "inbox_tray/complete");
    }

    private final native void removeExpectedPointNative(int i, int i2, String str);

    public static final void removeQuery(int i, int i2, String str) {
        INSTANCE.removeQueryNative(i, i2, "chats_you_should_join_list");
    }

    private final native void removeQueryNative(int i, int i2, String str);

    public static final void removeQuerySyncGroup(int i, int i2, String str, int i3, long j) {
        INSTANCE.removeQuerySyncGroupNative(i, i2, "thread_view", i3, j);
    }

    private final native void removeQuerySyncGroupNative(int i, int i2, String str, int i3, long j);

    public static final void startInteraction(int i, int i2, long j) {
        INSTANCE.startInteractionNative(i, i2, j);
    }

    public static final void startInteraction(int i, int i2, long j, 1QL r305) {
        completionCallbacks.put(new 03Y(Integer.valueOf(i), Integer.valueOf(i2)), r305);
        INSTANCE.startInteractionNative(i, i2, j);
    }

    private final native void startInteractionNative(int i, int i2, long j);

    private final native void stopTrackingInteractionNative(int i, int i2);

    public static final void surfaceLeft(int i, int i2, long j, String str) {
        INSTANCE.surfaceLeftNative(i, i2, j, str);
    }

    private final native void surfaceLeftNative(int i, int i2, long j, String str);

    private final native void syncStatusChangedNative(int i, int i2, long j);

    private final native void traceCheckpointEventNative(int i, int i2, int i3, long j);

    public static final void trackInteraction(int i, int i2, long j, 1QL r305, boolean z, boolean z2) {
        INSTANCE.trackInteractionNative(i, i2, j, false, false);
    }

    private final native void trackInteractionNative(int i, int i2, long j, boolean z, boolean z2);

    public static final void trackQuery(int i, int i2, String str) {
        INSTANCE.trackQueryNative(i, i2, "contact_list");
    }

    private final native void trackQueryNative(int i, int i2, String str);

    public static final void trackSyncGroup(int i, int i2, int i3) {
        INSTANCE.trackSyncGroupNative(i, i2, i3);
    }

    private final native void trackSyncGroupNative(int i, int i2, int i3);
}
