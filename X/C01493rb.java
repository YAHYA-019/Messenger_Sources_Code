package X;

import android.content.Context;
import com.facebook.messaging.tincan.tincanoverwamsys.plugins.pushnotificationhandler.pushnotificationhandler.SecureMessageOverWAPushNotificationHandlerImplementation;

/* renamed from: X.3rb, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3rb.class */
public final class C01493rb {
    public 1SI A00;
    public SecureMessageOverWAPushNotificationHandlerImplementation A01;
    public C1v5 A02;
    public Object A03;
    public boolean A04;
    public final Context A05;
    public final 1YC A06 = 1YC.A03;

    public C01493rb(Context context) {
        this.A05 = context;
    }

    public static void A00(C01493rb c01493rb) {
        synchronized (c01493rb) {
            if (!c01493rb.A04) {
                if (c01493rb.A05 == null) {
                    throw AnonymousClass001.A0Q("The context passed in the SecureMessageOverWAPushNotificationHandlerInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                }
                c01493rb.A02 = C1v5.A01;
                c01493rb.A04 = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x013a A[Catch: Exception -> 0x016c, all -> 0x0183, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x016c, blocks: (B:5:0x0047, B:9:0x0051, B:12:0x005b, B:15:0x013a, B:17:0x0164, B:22:0x0142, B:24:0x014e, B:25:0x0154, B:27:0x015a, B:28:0x015e, B:28:0x015e, B:30:0x0064, B:31:0x0069, B:34:0x0075, B:37:0x007d, B:38:0x0086, B:41:0x0091, B:43:0x009e, B:44:0x00a5, B:46:0x00ad, B:47:0x00b2, B:47:0x00b2, B:51:0x00ba, B:54:0x0128, B:54:0x0128, B:56:0x012c, B:57:0x00c6, B:59:0x00d7, B:71:0x0123, B:74:0x010a, B:76:0x0115, B:78:0x011c), top: B:4:0x0047, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0142 A[Catch: Exception -> 0x016c, all -> 0x0183, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x016c, blocks: (B:5:0x0047, B:9:0x0051, B:12:0x005b, B:15:0x013a, B:17:0x0164, B:22:0x0142, B:24:0x014e, B:25:0x0154, B:27:0x015a, B:28:0x015e, B:28:0x015e, B:30:0x0064, B:31:0x0069, B:34:0x0075, B:37:0x007d, B:38:0x0086, B:41:0x0091, B:43:0x009e, B:44:0x00a5, B:46:0x00ad, B:47:0x00b2, B:47:0x00b2, B:51:0x00ba, B:54:0x0128, B:54:0x0128, B:56:0x012c, B:57:0x00c6, B:59:0x00d7, B:71:0x0123, B:74:0x010a, B:76:0x0115, B:78:0x011c), top: B:4:0x0047, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01(X.C01493rb r301) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01493rb.A01(X.3rb):boolean");
    }
}
