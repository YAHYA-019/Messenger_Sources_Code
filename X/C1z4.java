package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mediaplatform.lifecycle.plugins.messenger.MessengerMediaPlatformLifecycleListener;
import com.facebook.messaging.communitymessaging.mobileconfig.plugins.mcinfra.lifecycleinit.GroupMobileConfigLifecycleInit;
import com.facebook.messaging.media.upload.act.plugins.lifecycle.MediaUploadProgressMsysLifecyclePluginImpl;
import com.facebook.messaging.msys.lifecycle.plugins.lifecycle.communitymessaging.communitycapabilities.CommunityCapabilitiesCheckerPluginImplementation;
import com.facebook.messaging.msys.lifecycle.plugins.lifecycle.encryptedbackups.EncryptedBackupsTraceConfigPluginImplementation;
import com.facebook.messaging.msys.lifecycle.plugins.lifecycle.errorhandling.ErrorHandlingImplementation;
import com.facebook.messaging.msys.lifecycle.plugins.lifecycle.familycenter.scheduledbreaks.ScheduledBreaksMailboxLifecycleListener;
import com.facebook.messaging.msys.lifecycle.plugins.lifecycle.familycenter.screentime.ScreenTimeMailboxLifecycleListener;
import com.facebook.messaging.msys.lifecycle.plugins.lifecycle.familycenter.supervision.SupervisionEdgeMailboxLifecycleListener;
import com.facebook.messaging.msys.lifecycle.plugins.lifecycle.inboxtray.closeconnections.CloseConnectionsLoaderPluginImplementation;
import com.facebook.messaging.msys.lifecycle.plugins.lifecycle.notifications.MsysNotificationHandlerPluginImplementation;
import com.facebook.messaging.msys.lifecycle.plugins.lifecycle.pageadminnotifications.MsysPageAdminNotificationHandlerPluginImplementation;
import com.facebook.messaging.msys.lifecycle.plugins.lifecycle.syncstate.MsysLifecycleSyncStateTrackerPluginImplementation;
import com.facebook.messaging.msys.lifecycle.plugins.lifecycle.transports.TransportTaskDispatcherPluginImplementation;
import com.facebook.messaging.msys.lifecycle.plugins.lifecycle.userprefs.UserPrefsMsysLifecyclePluginImplementation;
import com.facebook.messaging.msys.notificationengine.plugins.notificationengine.lifecycle.NotificationEngineIntegratorPluginImplementation;
import com.facebook.messaging.msys.pushnotifications.plugins.notifications.lifecycle.MsysPushNotificationHandlerPluginImplementation;
import com.facebook.messaging.privacyframework.cmcd.messenger.plugins.cmcddbsource.cmcdperiodicdataloading.CMCDPeriodicDataUpdateImplementation;
import com.facebook.messaging.tincan.tincanoverwamsys.plugins.clearnotification.msysnotificationinboxlifecycle.MsysNotificationInboxLifecycleImplementation;

/* renamed from: X.1z4, reason: invalid class name */
/* loaded from: 1z4.class */
public final class C1z4 {
    public MessengerMediaPlatformLifecycleListener A00;
    public GroupMobileConfigLifecycleInit A01;
    public MediaUploadProgressMsysLifecyclePluginImpl A02;
    public CommunityCapabilitiesCheckerPluginImplementation A03;
    public ErrorHandlingImplementation A04;
    public ScheduledBreaksMailboxLifecycleListener A05;
    public ScreenTimeMailboxLifecycleListener A06;
    public SupervisionEdgeMailboxLifecycleListener A07;
    public CloseConnectionsLoaderPluginImplementation A08;
    public MsysNotificationHandlerPluginImplementation A09;
    public MsysPageAdminNotificationHandlerPluginImplementation A0A;
    public MsysLifecycleSyncStateTrackerPluginImplementation A0B;
    public TransportTaskDispatcherPluginImplementation A0C;
    public UserPrefsMsysLifecyclePluginImplementation A0D;
    public NotificationEngineIntegratorPluginImplementation A0E;
    public MsysPushNotificationHandlerPluginImplementation A0F;
    public CMCDPeriodicDataUpdateImplementation A0G;
    public 1SI A0H;
    public MsysNotificationInboxLifecycleImplementation A0I;
    public EncryptedBackupsTraceConfigPluginImplementation A0K;
    public C1v5 A0L;
    public Object A0M;
    public Object A0N;
    public Object A0O;
    public Object A0P;
    public Object A0Q;
    public Object A0R;
    public Object A0S;
    public Object A0T;
    public Object A0U;
    public Object A0V;
    public Object A0W;
    public Object A0X;
    public Object A0Y;
    public Object A0Z;
    public Object A0a;
    public Object A0b;
    public Object A0c;
    public Object A0d;
    public Object A0e;
    public boolean A0f;
    public final Context A0g;
    public final FbUserSession A0i;
    public int A0J = -1;
    public final 1YC A0h = 1YC.A03;

    public C1z4(Context context, FbUserSession fbUserSession) {
        this.A0g = context;
        this.A0i = fbUserSession;
    }

    public static int A00(C1z4 c1z4) {
        int i = c1z4.A0J;
        if (i == -1) {
            i = A0B(c1z4) ? 1 : 0;
            if (A0K(c1z4)) {
                i++;
            }
            if (A0E(c1z4)) {
                i++;
            }
            if (A0F(c1z4)) {
                i++;
            }
            if (A0I(c1z4)) {
                i++;
            }
            if (A0C(c1z4)) {
                i++;
            }
            if (A0H(c1z4)) {
                i++;
            }
            if (A0G(c1z4)) {
                i++;
            }
            if (A07(c1z4)) {
                i++;
            }
            if (A05(c1z4)) {
                i++;
            }
            if (A0J(c1z4)) {
                i++;
            }
            if (A06(c1z4)) {
                i++;
            }
            if (A03(c1z4)) {
                i++;
            }
            if (A09(c1z4)) {
                i++;
            }
            if (A08(c1z4)) {
                i++;
            }
            if (A0D(c1z4)) {
                i++;
            }
            if (A0A(c1z4)) {
                i++;
            }
            if (A02(c1z4)) {
                i++;
            }
            if (A04(c1z4)) {
                i++;
            }
            c1z4.A0J = i;
        }
        return i;
    }

    public static void A01(C1z4 c1z4) {
        synchronized (c1z4) {
            if (!c1z4.A0f) {
                if (c1z4.A0g == null) {
                    throw AnonymousClass001.A0Q("The context passed in the MsysLifecyclePluginInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                }
                c1z4.A0L = C1v5.A01;
                c1z4.A0f = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d9 A[Catch: Exception -> 0x011e, all -> 0x0135, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x011e, blocks: (B:6:0x0047, B:10:0x0051, B:13:0x005b, B:16:0x00d9, B:18:0x00fc, B:23:0x00e1, B:24:0x00e7, B:26:0x00ec, B:27:0x00f2, B:28:0x00f6, B:28:0x00f6, B:30:0x0064, B:31:0x0069, B:34:0x0075, B:37:0x007d, B:38:0x0086, B:43:0x00c7, B:43:0x00c7, B:45:0x00cb, B:46:0x0095, B:48:0x00a6, B:56:0x00c2, B:59:0x010b, B:61:0x0116, B:63:0x011d), top: B:5:0x0047, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e1 A[Catch: Exception -> 0x011e, all -> 0x0135, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x011e, blocks: (B:6:0x0047, B:10:0x0051, B:13:0x005b, B:16:0x00d9, B:18:0x00fc, B:23:0x00e1, B:24:0x00e7, B:26:0x00ec, B:27:0x00f2, B:28:0x00f6, B:28:0x00f6, B:30:0x0064, B:31:0x0069, B:34:0x0075, B:37:0x007d, B:38:0x0086, B:43:0x00c7, B:43:0x00c7, B:45:0x00cb, B:46:0x0095, B:48:0x00a6, B:56:0x00c2, B:59:0x010b, B:61:0x0116, B:63:0x011d), top: B:5:0x0047, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A02(X.C1z4 r301) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1z4.A02(X.1z4):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A03(X.C1z4 r301) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1z4.A03(X.1z4):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A04(X.C1z4 r301) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1z4.A04(X.1z4):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0099 A[Catch: Exception -> 0x00e6, all -> 0x00fd, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00e6, blocks: (B:5:0x004a, B:9:0x0054, B:12:0x005e, B:15:0x0099, B:17:0x00a3, B:18:0x00a9, B:19:0x00ae, B:22:0x00b9, B:23:0x00bf, B:25:0x00c6, B:26:0x00cc, B:27:0x00d0, B:27:0x00d0, B:30:0x00de, B:36:0x00d8, B:37:0x0067, B:38:0x006c, B:41:0x0078, B:44:0x0080, B:46:0x008d), top: B:4:0x004a, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A05(X.C1z4 r301) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1z4.A05(X.1z4):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009c A[Catch: Exception -> 0x00c7, all -> 0x00de, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00c7, blocks: (B:5:0x004a, B:9:0x0054, B:12:0x005e, B:15:0x009c, B:17:0x00bf, B:23:0x00a4, B:24:0x00aa, B:26:0x00af, B:27:0x00b5, B:28:0x00b9, B:28:0x00b9, B:30:0x0067, B:31:0x006c, B:34:0x0078, B:37:0x0080, B:39:0x008d), top: B:4:0x004a, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[Catch: Exception -> 0x00c7, all -> 0x00de, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00c7, blocks: (B:5:0x004a, B:9:0x0054, B:12:0x005e, B:15:0x009c, B:17:0x00bf, B:23:0x00a4, B:24:0x00aa, B:26:0x00af, B:27:0x00b5, B:28:0x00b9, B:28:0x00b9, B:30:0x0067, B:31:0x006c, B:34:0x0078, B:37:0x0080, B:39:0x008d), top: B:4:0x004a, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A06(X.C1z4 r301) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1z4.A06(X.1z4):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009c A[Catch: Exception -> 0x00cf, all -> 0x00e6, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00cf, blocks: (B:5:0x004a, B:9:0x0054, B:12:0x005e, B:15:0x009c, B:17:0x00c7, B:23:0x00a4, B:24:0x00aa, B:25:0x00b0, B:27:0x00b7, B:28:0x00bd, B:29:0x00c1, B:29:0x00c1, B:31:0x0067, B:32:0x006c, B:35:0x0078, B:38:0x0080, B:40:0x008d), top: B:4:0x004a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[Catch: Exception -> 0x00cf, all -> 0x00e6, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00cf, blocks: (B:5:0x004a, B:9:0x0054, B:12:0x005e, B:15:0x009c, B:17:0x00c7, B:23:0x00a4, B:24:0x00aa, B:25:0x00b0, B:27:0x00b7, B:28:0x00bd, B:29:0x00c1, B:29:0x00c1, B:31:0x0067, B:32:0x006c, B:35:0x0078, B:38:0x0080, B:40:0x008d), top: B:4:0x004a, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A07(X.C1z4 r301) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1z4.A07(X.1z4):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A08(X.C1z4 r301) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1z4.A08(X.1z4):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A09(X.C1z4 r301) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1z4.A09(X.1z4):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0A(X.C1z4 r301) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1z4.A0A(X.1z4):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0B(X.C1z4 r301) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1z4.A0B(X.1z4):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009c A[Catch: Exception -> 0x00cf, all -> 0x00e6, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00cf, blocks: (B:5:0x004a, B:9:0x0054, B:12:0x005e, B:15:0x009c, B:17:0x00c7, B:23:0x00a4, B:24:0x00aa, B:25:0x00b0, B:27:0x00b7, B:28:0x00bd, B:29:0x00c1, B:29:0x00c1, B:31:0x0067, B:32:0x006c, B:35:0x0078, B:38:0x0080, B:40:0x008d), top: B:4:0x004a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[Catch: Exception -> 0x00cf, all -> 0x00e6, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00cf, blocks: (B:5:0x004a, B:9:0x0054, B:12:0x005e, B:15:0x009c, B:17:0x00c7, B:23:0x00a4, B:24:0x00aa, B:25:0x00b0, B:27:0x00b7, B:28:0x00bd, B:29:0x00c1, B:29:0x00c1, B:31:0x0067, B:32:0x006c, B:35:0x0078, B:38:0x0080, B:40:0x008d), top: B:4:0x004a, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0C(X.C1z4 r301) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1z4.A0C(X.1z4):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0D(X.C1z4 r301) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1z4.A0D(X.1z4):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009c A[Catch: Exception -> 0x00cf, all -> 0x00e6, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00cf, blocks: (B:5:0x004a, B:9:0x0054, B:12:0x005e, B:15:0x009c, B:17:0x00c7, B:23:0x00a4, B:24:0x00aa, B:25:0x00b0, B:27:0x00b7, B:28:0x00bd, B:29:0x00c1, B:29:0x00c1, B:31:0x0067, B:32:0x006c, B:35:0x0078, B:38:0x0080, B:40:0x008d), top: B:4:0x004a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[Catch: Exception -> 0x00cf, all -> 0x00e6, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00cf, blocks: (B:5:0x004a, B:9:0x0054, B:12:0x005e, B:15:0x009c, B:17:0x00c7, B:23:0x00a4, B:24:0x00aa, B:25:0x00b0, B:27:0x00b7, B:28:0x00bd, B:29:0x00c1, B:29:0x00c1, B:31:0x0067, B:32:0x006c, B:35:0x0078, B:38:0x0080, B:40:0x008d), top: B:4:0x004a, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0E(X.C1z4 r301) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1z4.A0E(X.1z4):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009c A[Catch: Exception -> 0x00cf, all -> 0x00e6, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00cf, blocks: (B:5:0x004a, B:9:0x0054, B:12:0x005e, B:15:0x009c, B:17:0x00c7, B:23:0x00a4, B:24:0x00aa, B:25:0x00b0, B:27:0x00b7, B:28:0x00bd, B:29:0x00c1, B:29:0x00c1, B:31:0x0067, B:32:0x006c, B:35:0x0078, B:38:0x0080, B:40:0x008d), top: B:4:0x004a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[Catch: Exception -> 0x00cf, all -> 0x00e6, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00cf, blocks: (B:5:0x004a, B:9:0x0054, B:12:0x005e, B:15:0x009c, B:17:0x00c7, B:23:0x00a4, B:24:0x00aa, B:25:0x00b0, B:27:0x00b7, B:28:0x00bd, B:29:0x00c1, B:29:0x00c1, B:31:0x0067, B:32:0x006c, B:35:0x0078, B:38:0x0080, B:40:0x008d), top: B:4:0x004a, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0F(X.C1z4 r301) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1z4.A0F(X.1z4):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009c A[Catch: Exception -> 0x00cf, all -> 0x00e6, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00cf, blocks: (B:5:0x004a, B:9:0x0054, B:12:0x005e, B:15:0x009c, B:17:0x00c7, B:23:0x00a4, B:24:0x00aa, B:25:0x00b0, B:27:0x00b7, B:28:0x00bd, B:29:0x00c1, B:29:0x00c1, B:31:0x0067, B:32:0x006c, B:35:0x0078, B:38:0x0080, B:40:0x008d), top: B:4:0x004a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[Catch: Exception -> 0x00cf, all -> 0x00e6, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00cf, blocks: (B:5:0x004a, B:9:0x0054, B:12:0x005e, B:15:0x009c, B:17:0x00c7, B:23:0x00a4, B:24:0x00aa, B:25:0x00b0, B:27:0x00b7, B:28:0x00bd, B:29:0x00c1, B:29:0x00c1, B:31:0x0067, B:32:0x006c, B:35:0x0078, B:38:0x0080, B:40:0x008d), top: B:4:0x004a, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0G(X.C1z4 r301) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1z4.A0G(X.1z4):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00dd A[Catch: Exception -> 0x012a, all -> 0x0141, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x012a, blocks: (B:5:0x004a, B:9:0x0054, B:12:0x005e, B:15:0x00dd, B:17:0x0108, B:22:0x00e5, B:23:0x00eb, B:24:0x00f1, B:26:0x00f8, B:27:0x00fe, B:28:0x0102, B:28:0x0102, B:30:0x0067, B:31:0x006c, B:34:0x0078, B:37:0x0080, B:38:0x0089, B:43:0x00cb, B:43:0x00cb, B:45:0x00cf, B:46:0x0098, B:48:0x00aa, B:56:0x00c6, B:64:0x0117, B:66:0x0122, B:68:0x0129), top: B:4:0x004a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e5 A[Catch: Exception -> 0x012a, all -> 0x0141, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x012a, blocks: (B:5:0x004a, B:9:0x0054, B:12:0x005e, B:15:0x00dd, B:17:0x0108, B:22:0x00e5, B:23:0x00eb, B:24:0x00f1, B:26:0x00f8, B:27:0x00fe, B:28:0x0102, B:28:0x0102, B:30:0x0067, B:31:0x006c, B:34:0x0078, B:37:0x0080, B:38:0x0089, B:43:0x00cb, B:43:0x00cb, B:45:0x00cf, B:46:0x0098, B:48:0x00aa, B:56:0x00c6, B:64:0x0117, B:66:0x0122, B:68:0x0129), top: B:4:0x004a, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0H(X.C1z4 r301) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1z4.A0H(X.1z4):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00dd A[Catch: Exception -> 0x012a, all -> 0x0141, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x012a, blocks: (B:5:0x004a, B:9:0x0054, B:12:0x005e, B:15:0x00dd, B:17:0x0108, B:22:0x00e5, B:23:0x00eb, B:24:0x00f1, B:26:0x00f8, B:27:0x00fe, B:28:0x0102, B:28:0x0102, B:30:0x0067, B:31:0x006c, B:34:0x0078, B:37:0x0080, B:38:0x0089, B:43:0x00cb, B:43:0x00cb, B:45:0x00cf, B:46:0x0098, B:48:0x00aa, B:56:0x00c6, B:64:0x0117, B:66:0x0122, B:68:0x0129), top: B:4:0x004a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e5 A[Catch: Exception -> 0x012a, all -> 0x0141, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x012a, blocks: (B:5:0x004a, B:9:0x0054, B:12:0x005e, B:15:0x00dd, B:17:0x0108, B:22:0x00e5, B:23:0x00eb, B:24:0x00f1, B:26:0x00f8, B:27:0x00fe, B:28:0x0102, B:28:0x0102, B:30:0x0067, B:31:0x006c, B:34:0x0078, B:37:0x0080, B:38:0x0089, B:43:0x00cb, B:43:0x00cb, B:45:0x00cf, B:46:0x0098, B:48:0x00aa, B:56:0x00c6, B:64:0x0117, B:66:0x0122, B:68:0x0129), top: B:4:0x004a, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0I(X.C1z4 r301) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1z4.A0I(X.1z4):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0J(X.C1z4 r301) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1z4.A0J(X.1z4):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0144 A[Catch: Exception -> 0x0178, all -> 0x018f, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0178, blocks: (B:6:0x004a, B:10:0x0054, B:13:0x005e, B:16:0x0144, B:18:0x0170, B:23:0x014c, B:25:0x015a, B:26:0x0160, B:28:0x0166, B:29:0x016a, B:29:0x016a, B:31:0x0067, B:32:0x006c, B:35:0x0078, B:38:0x0080, B:39:0x0089, B:42:0x0094, B:44:0x00a2, B:45:0x00a9, B:47:0x00b1, B:48:0x00b6, B:48:0x00b6, B:52:0x00be, B:55:0x0132, B:55:0x0132, B:57:0x0136, B:58:0x00ca, B:60:0x00dc, B:72:0x012d, B:81:0x0114, B:83:0x011f, B:85:0x0126), top: B:5:0x004a, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x014c A[Catch: Exception -> 0x0178, all -> 0x018f, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0178, blocks: (B:6:0x004a, B:10:0x0054, B:13:0x005e, B:16:0x0144, B:18:0x0170, B:23:0x014c, B:25:0x015a, B:26:0x0160, B:28:0x0166, B:29:0x016a, B:29:0x016a, B:31:0x0067, B:32:0x006c, B:35:0x0078, B:38:0x0080, B:39:0x0089, B:42:0x0094, B:44:0x00a2, B:45:0x00a9, B:47:0x00b1, B:48:0x00b6, B:48:0x00b6, B:52:0x00be, B:55:0x0132, B:55:0x0132, B:57:0x0136, B:58:0x00ca, B:60:0x00dc, B:72:0x012d, B:81:0x0114, B:83:0x011f, B:85:0x0126), top: B:5:0x004a, outer: #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0K(X.C1z4 r301) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1z4.A0K(X.1z4):boolean");
    }
}
