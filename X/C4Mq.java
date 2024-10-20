package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.navigation.plugins.communities.communitiesdrawerfolder.CommunitiesDrawerFolderImplementation;
import com.facebook.messaging.navigation.plugins.communities.fbcommunitiesdrawerfolder.FbCommunitiesDrawerFolderImplementation;
import com.facebook.messaging.navigation.plugins.communities.standalonecommunitiesdrawerfolder.StandaloneCommunitiesDrawerFolderImplementation;
import com.facebook.messaging.navigation.plugins.communities.zerochatsuggestioncommunitiesdrawerfolder.ZeroChatSuggestionCommunitiesDrawerFolderImplementation;
import com.facebook.messaging.navigation.plugins.drawerfoldersections.morefoldersection.MoreDrawerFolderImplementation;
import com.facebook.messaging.navigation.plugins.travel.traveldrawerfolder.TravelDrawerFolderImplementation;

/* renamed from: X.4Mq, reason: invalid class name */
/* loaded from: 4Mq.class */
public final class C4Mq {
    public CommunitiesDrawerFolderImplementation A00;
    public FbCommunitiesDrawerFolderImplementation A01;
    public StandaloneCommunitiesDrawerFolderImplementation A02;
    public ZeroChatSuggestionCommunitiesDrawerFolderImplementation A03;
    public MoreDrawerFolderImplementation A04;
    public TravelDrawerFolderImplementation A05;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public Object A0B;
    public Object A0C;
    public final Context A0E;
    public final FbUserSession A0F;
    public final C4Xo A0G;
    public int A06 = -1;
    public final 1YC A0D = 1YC.A03;

    public C4Mq(Context context, FbUserSession fbUserSession, C4Xo c4Xo) {
        this.A0E = context;
        this.A0G = c4Xo;
        this.A0F = fbUserSession;
    }

    public static int A00(C4Mq c4Mq) {
        int i = c4Mq.A06;
        if (i == -1) {
            i = A05(c4Mq) ? 1 : 0;
            if (A01(c4Mq)) {
                i++;
            }
            if (A03(c4Mq)) {
                i++;
            }
            if (A02(c4Mq)) {
                i++;
            }
            if (A04(c4Mq)) {
                i++;
            }
            if (A06(c4Mq)) {
                i++;
            }
            c4Mq.A06 = i;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0075 A[Catch: Exception -> 0x0192, all -> 0x01a0, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0192, blocks: (B:5:0x0043, B:6:0x0048, B:9:0x0054, B:12:0x005c, B:15:0x0075, B:17:0x007f, B:19:0x0086, B:21:0x008f, B:23:0x0096, B:25:0x009f, B:27:0x00a6, B:29:0x00af, B:30:0x00b6, B:32:0x00c3, B:35:0x00cf, B:36:0x00d5, B:37:0x00da, B:40:0x00e5, B:41:0x00eb, B:42:0x00f0, B:45:0x00fb, B:46:0x0101, B:47:0x0106, B:50:0x0111, B:51:0x0117, B:52:0x011c, B:54:0x0129, B:57:0x0137, B:58:0x013d, B:59:0x0142, B:61:0x014f, B:64:0x015d, B:65:0x0163, B:66:0x0169, B:68:0x0172, B:69:0x0178, B:70:0x017c, B:70:0x017c, B:73:0x018a, B:79:0x0184, B:81:0x0069), top: B:4:0x0043, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01(X.C4Mq r301) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Mq.A01(X.4Mq):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0107, code lost:
    
        if (X.1WY.A01((X.1WY) r0.get()).AZk(36325355920970371L) != false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A02(X.C4Mq r301) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Mq.A02(X.4Mq):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c9, code lost:
    
        if (((X.1WY) X.1Bi.A03(66481)).A06() == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A03(X.C4Mq r301) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Mq.A03(X.4Mq):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A04(X.C4Mq r301) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Mq.A04(X.4Mq):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b5 A[Catch: Exception -> 0x01be, all -> 0x01d5, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x01be, blocks: (B:6:0x0043, B:7:0x0048, B:10:0x0054, B:13:0x005c, B:16:0x00b5, B:18:0x00c2, B:20:0x00cb, B:21:0x00d1, B:22:0x00d6, B:26:0x00eb, B:27:0x00f1, B:28:0x00f6, B:30:0x0103, B:34:0x0116, B:35:0x011c, B:36:0x0121, B:38:0x012e, B:42:0x0141, B:43:0x0147, B:45:0x014d, B:48:0x0159, B:49:0x015f, B:50:0x0164, B:53:0x016f, B:54:0x0175, B:55:0x017b, B:57:0x0184, B:58:0x018a, B:59:0x018e, B:59:0x018e, B:62:0x019c, B:67:0x0196, B:68:0x0065, B:73:0x00a6, B:73:0x00a6, B:75:0x00aa, B:76:0x0074, B:78:0x0085, B:86:0x00a1, B:89:0x01ab, B:91:0x01b6, B:93:0x01bd), top: B:5:0x0043, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A05(X.C4Mq r301) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Mq.A05(X.4Mq):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0078 A[Catch: Exception -> 0x00d8, all -> 0x00ef, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00d8, blocks: (B:5:0x0046, B:6:0x004b, B:9:0x0057, B:12:0x005f, B:15:0x0078, B:16:0x007e, B:17:0x0082, B:18:0x0087, B:19:0x008f, B:21:0x009d, B:24:0x00ab, B:25:0x00b1, B:27:0x00b8, B:28:0x00be, B:29:0x00c2, B:29:0x00c2, B:32:0x00d0, B:38:0x00ca, B:40:0x006c), top: B:4:0x0046, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A06(X.C4Mq r301) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Mq.A06(X.4Mq):boolean");
    }
}
