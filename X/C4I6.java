package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.advancedcrypto.plugins.core.privacysettings.unseencount.SecurityAlertsUnseenCountProvider;
import com.facebook.messaging.metab.plugins.unseencount.MeTabSettingUnseenCountProvider;

/* renamed from: X.4I6, reason: invalid class name */
/* loaded from: 4I6.class */
public final class C4I6 {
    public 20L A00;
    public SecurityAlertsUnseenCountProvider A01;
    public MeTabSettingUnseenCountProvider A02;
    public C1v5 A03;
    public Object A04;
    public Object A05;
    public boolean A06;
    public final Context A07;
    public final 1YC A08 = 1YC.A03;
    public final FbUserSession A09;
    public final C4I3 A0A;

    public C4I6(Context context, FbUserSession fbUserSession, C4I3 c4i3) {
        this.A07 = context;
        this.A0A = c4i3;
        this.A09 = fbUserSession;
    }

    public static void A00(C4I6 c4i6) {
        synchronized (c4i6) {
            if (!c4i6.A06) {
                if (c4i6.A07 == null) {
                    throw AnonymousClass001.A0Q("The context passed in the MeSettingsUnseenCountProvider.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                }
                c4i6.A03 = C1v5.A01;
                c4i6.A06 = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00bc A[Catch: Exception -> 0x00f7, all -> 0x010e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00f7, blocks: (B:5:0x0047, B:9:0x0051, B:12:0x005b, B:15:0x00bc, B:16:0x00c2, B:17:0x00c8, B:18:0x00ce, B:20:0x00d7, B:21:0x00dd, B:22:0x00e1, B:22:0x00e1, B:25:0x00ef, B:31:0x00e9, B:32:0x0064, B:33:0x0069, B:36:0x0075, B:39:0x007d, B:40:0x0086, B:43:0x008f, B:45:0x009b, B:46:0x00a1, B:48:0x00a7, B:51:0x00b0), top: B:4:0x0047, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e9 A[Catch: Exception -> 0x00f7, all -> 0x010e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00f7, blocks: (B:5:0x0047, B:9:0x0051, B:12:0x005b, B:15:0x00bc, B:16:0x00c2, B:17:0x00c8, B:18:0x00ce, B:20:0x00d7, B:21:0x00dd, B:22:0x00e1, B:22:0x00e1, B:25:0x00ef, B:31:0x00e9, B:32:0x0064, B:33:0x0069, B:36:0x0075, B:39:0x007d, B:40:0x0086, B:43:0x008f, B:45:0x009b, B:46:0x00a1, B:48:0x00a7, B:51:0x00b0), top: B:4:0x0047, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01(X.C4I6 r301) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4I6.A01(X.4I6):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d6 A[Catch: Exception -> 0x012b, all -> 0x0142, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x012b, blocks: (B:5:0x0047, B:9:0x0051, B:12:0x005b, B:15:0x00d6, B:16:0x00dc, B:17:0x00e2, B:18:0x00e8, B:20:0x00f1, B:21:0x00f7, B:22:0x00fb, B:22:0x00fb, B:25:0x0109, B:30:0x0103, B:31:0x0064, B:32:0x0069, B:35:0x0075, B:38:0x007d, B:39:0x0086, B:44:0x00c7, B:44:0x00c7, B:46:0x00cb, B:47:0x0095, B:49:0x00a6, B:57:0x00c2, B:60:0x0118, B:62:0x0123, B:64:0x012a), top: B:4:0x0047, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0103 A[Catch: Exception -> 0x012b, all -> 0x0142, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x012b, blocks: (B:5:0x0047, B:9:0x0051, B:12:0x005b, B:15:0x00d6, B:16:0x00dc, B:17:0x00e2, B:18:0x00e8, B:20:0x00f1, B:21:0x00f7, B:22:0x00fb, B:22:0x00fb, B:25:0x0109, B:30:0x0103, B:31:0x0064, B:32:0x0069, B:35:0x0075, B:38:0x007d, B:39:0x0086, B:44:0x00c7, B:44:0x00c7, B:46:0x00cb, B:47:0x0095, B:49:0x00a6, B:57:0x00c2, B:60:0x0118, B:62:0x0123, B:64:0x012a), top: B:4:0x0047, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A02(X.C4I6 r301) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4I6.A02(X.4I6):boolean");
    }
}
