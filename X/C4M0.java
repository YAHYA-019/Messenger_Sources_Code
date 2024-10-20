package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.archivedchats.plugins.archive.folderitem.ArchiveFolderItem;
import com.facebook.messaging.marketplace.plugins.marketplacefolder.folderitem.MarketplaceFolderItem;
import com.facebook.messaging.nativepagereply.spam.plugins.spamfolder.folderitem.SpamFolderItemImplementation;
import com.facebook.messaging.navigation.plugins.inboxfolder.folderitem.InboxFolderItem;
import com.facebook.messaging.support.plugins.supportfolder.folderitem.SupportFolderItemImplementation;
import com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.homedrawer.folderitem.MessageRequestsFolderItem;

/* renamed from: X.4M0, reason: invalid class name */
/* loaded from: 4M0.class */
public final class C4M0 {
    public ArchiveFolderItem A01;
    public MarketplaceFolderItem A02;
    public 4ME A03;
    public SpamFolderItemImplementation A04;
    public InboxFolderItem A05;
    public C4M7 A06;
    public SupportFolderItemImplementation A07;
    public MessageRequestsFolderItem A08;
    public C1v5 A09;
    public Object A0A;
    public Object A0B;
    public Object A0C;
    public Object A0D;
    public Object A0E;
    public Object A0F;
    public boolean A0G;
    public final Context A0H;
    public final FbUserSession A0J;
    public final C4Xo A0K;
    public int A00 = -1;
    public final 1YC A0I = 1YC.A03;

    public C4M0(Context context, FbUserSession fbUserSession, C4Xo c4Xo) {
        this.A0H = context;
        this.A0K = c4Xo;
        this.A0J = fbUserSession;
    }

    public static void A00(C4M0 c4m0) {
        synchronized (c4m0) {
            if (!c4m0.A0G) {
                if (c4m0.A0H == null) {
                    throw AnonymousClass001.A0Q("The context passed in the HomeDrawerFolderItemInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                }
                c4m0.A09 = C1v5.A01;
                c4m0.A0G = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0099 A[Catch: Exception -> 0x00c4, all -> 0x00db, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00c4, blocks: (B:5:0x0047, B:9:0x0051, B:12:0x005b, B:15:0x0099, B:17:0x00bc, B:23:0x00a1, B:24:0x00a7, B:26:0x00ac, B:27:0x00b2, B:28:0x00b6, B:28:0x00b6, B:30:0x0064, B:31:0x0069, B:34:0x0075, B:37:0x007d, B:39:0x008a), top: B:4:0x0047, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1 A[Catch: Exception -> 0x00c4, all -> 0x00db, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00c4, blocks: (B:5:0x0047, B:9:0x0051, B:12:0x005b, B:15:0x0099, B:17:0x00bc, B:23:0x00a1, B:24:0x00a7, B:26:0x00ac, B:27:0x00b2, B:28:0x00b6, B:28:0x00b6, B:30:0x0064, B:31:0x0069, B:34:0x0075, B:37:0x007d, B:39:0x008a), top: B:4:0x0047, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01(X.C4M0 r301) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4M0.A01(X.4M0):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0099 A[Catch: Exception -> 0x00cc, all -> 0x00e3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00cc, blocks: (B:5:0x0047, B:9:0x0051, B:12:0x005b, B:15:0x0099, B:17:0x00c4, B:23:0x00a1, B:24:0x00a7, B:25:0x00ad, B:27:0x00b4, B:28:0x00ba, B:29:0x00be, B:29:0x00be, B:31:0x0064, B:32:0x0069, B:35:0x0075, B:38:0x007d, B:40:0x008a), top: B:4:0x0047, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1 A[Catch: Exception -> 0x00cc, all -> 0x00e3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00cc, blocks: (B:5:0x0047, B:9:0x0051, B:12:0x005b, B:15:0x0099, B:17:0x00c4, B:23:0x00a1, B:24:0x00a7, B:25:0x00ad, B:27:0x00b4, B:28:0x00ba, B:29:0x00be, B:29:0x00be, B:31:0x0064, B:32:0x0069, B:35:0x0075, B:38:0x007d, B:40:0x008a), top: B:4:0x0047, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A02(X.C4M0 r301) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4M0.A02(X.4M0):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00bf A[Catch: Exception -> 0x00ea, all -> 0x0101, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ea, blocks: (B:5:0x0047, B:9:0x0051, B:12:0x005b, B:15:0x00bf, B:17:0x00e2, B:23:0x00c7, B:24:0x00cd, B:26:0x00d2, B:27:0x00d8, B:28:0x00dc, B:28:0x00dc, B:30:0x0064, B:31:0x0069, B:34:0x0075, B:37:0x007d, B:38:0x0086, B:41:0x008f, B:43:0x009b, B:44:0x00a1, B:46:0x00a7, B:49:0x00b0), top: B:4:0x0047, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7 A[Catch: Exception -> 0x00ea, all -> 0x0101, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ea, blocks: (B:5:0x0047, B:9:0x0051, B:12:0x005b, B:15:0x00bf, B:17:0x00e2, B:23:0x00c7, B:24:0x00cd, B:26:0x00d2, B:27:0x00d8, B:28:0x00dc, B:28:0x00dc, B:30:0x0064, B:31:0x0069, B:34:0x0075, B:37:0x007d, B:38:0x0086, B:41:0x008f, B:43:0x009b, B:44:0x00a1, B:46:0x00a7, B:49:0x00b0), top: B:4:0x0047, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A03(X.C4M0 r301) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4M0.A03(X.4M0):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0096 A[Catch: Exception -> 0x00dd, all -> 0x00f4, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00dd, blocks: (B:5:0x0047, B:9:0x0051, B:12:0x005b, B:15:0x0096, B:17:0x00a0, B:18:0x00a6, B:19:0x00ab, B:22:0x00b8, B:24:0x00bd, B:25:0x00c3, B:26:0x00c7, B:26:0x00c7, B:29:0x00d5, B:35:0x00cf, B:36:0x0064, B:37:0x0069, B:40:0x0075, B:43:0x007d, B:45:0x008a), top: B:4:0x0047, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A04(X.C4M0 r301) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4M0.A04(X.4M0):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00bf A[Catch: Exception -> 0x00f2, all -> 0x0109, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00f2, blocks: (B:5:0x0047, B:9:0x0051, B:12:0x005b, B:15:0x00bf, B:17:0x00ea, B:23:0x00c7, B:24:0x00cd, B:25:0x00d3, B:27:0x00da, B:28:0x00e0, B:29:0x00e4, B:29:0x00e4, B:31:0x0064, B:32:0x0069, B:35:0x0075, B:38:0x007d, B:39:0x0086, B:42:0x008f, B:44:0x009b, B:45:0x00a1, B:47:0x00a7, B:50:0x00b0), top: B:4:0x0047, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7 A[Catch: Exception -> 0x00f2, all -> 0x0109, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00f2, blocks: (B:5:0x0047, B:9:0x0051, B:12:0x005b, B:15:0x00bf, B:17:0x00ea, B:23:0x00c7, B:24:0x00cd, B:25:0x00d3, B:27:0x00da, B:28:0x00e0, B:29:0x00e4, B:29:0x00e4, B:31:0x0064, B:32:0x0069, B:35:0x0075, B:38:0x007d, B:39:0x0086, B:42:0x008f, B:44:0x009b, B:45:0x00a1, B:47:0x00a7, B:50:0x00b0), top: B:4:0x0047, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A05(X.C4M0 r301) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4M0.A05(X.4M0):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0 A[Catch: Exception -> 0x010e, all -> 0x0125, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x010e, blocks: (B:6:0x004a, B:10:0x0054, B:13:0x005e, B:17:0x009e, B:18:0x00a4, B:20:0x00af, B:25:0x00c0, B:26:0x00c5, B:29:0x00d0, B:30:0x00d6, B:31:0x00dc, B:32:0x00e2, B:34:0x00eb, B:35:0x00f1, B:36:0x00f5, B:36:0x00f5, B:39:0x0106, B:47:0x00ff, B:49:0x0100, B:49:0x0100, B:51:0x0067, B:52:0x006c, B:55:0x0078, B:58:0x0080, B:60:0x008d), top: B:5:0x004a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A06(X.C4M0 r301) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4M0.A06(X.4M0):boolean");
    }
}
