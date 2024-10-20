package X;

import android.content.Context;
import com.facebook.messaging.capability.plugins.accountcapability.msysaccountcapabilitiesstore.MsysAccountCapabilitiesStoreImplementation;

/* renamed from: X.1v3, reason: invalid class name */
/* loaded from: 1v3.class */
public final class C1v3 {
    public MsysAccountCapabilitiesStoreImplementation A00;
    public C1v0 A01;
    public C1v5 A02;
    public Object A03;
    public boolean A04;
    public final long A05;
    public final Context A06;
    public final 1YC A07 = 1YC.A03;

    public C1v3(Context context, long j) {
        this.A06 = context;
        this.A05 = j;
    }

    public static void A00(C1v3 c1v3) {
        synchronized (c1v3) {
            if (!c1v3.A04) {
                if (c1v3.A06 == null) {
                    throw AnonymousClass001.A0Q("The context passed in the AccountCapabilityStore.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                }
                c1v3.A02 = C1v5.A01;
                c1v3.A04 = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0163 A[Catch: Exception -> 0x018c, all -> 0x01a3, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x018c, blocks: (B:5:0x004b, B:9:0x0055, B:12:0x005f, B:15:0x0163, B:16:0x0167, B:17:0x016c, B:18:0x0170, B:18:0x0170, B:21:0x0176, B:26:0x017e, B:28:0x0184, B:29:0x0068, B:30:0x006d, B:33:0x0079, B:36:0x0081, B:37:0x008a, B:40:0x0095, B:42:0x00a2, B:43:0x00a9, B:45:0x00b1, B:46:0x00b6, B:46:0x00b6, B:50:0x00be, B:53:0x0154, B:53:0x0154, B:55:0x0158, B:56:0x00ca, B:58:0x00db, B:75:0x014f, B:84:0x0136, B:86:0x0141, B:88:0x0148), top: B:4:0x004b, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x017e A[Catch: Exception -> 0x018c, all -> 0x01a3, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x018c, blocks: (B:5:0x004b, B:9:0x0055, B:12:0x005f, B:15:0x0163, B:16:0x0167, B:17:0x016c, B:18:0x0170, B:18:0x0170, B:21:0x0176, B:26:0x017e, B:28:0x0184, B:29:0x0068, B:30:0x006d, B:33:0x0079, B:36:0x0081, B:37:0x008a, B:40:0x0095, B:42:0x00a2, B:43:0x00a9, B:45:0x00b1, B:46:0x00b6, B:46:0x00b6, B:50:0x00be, B:53:0x0154, B:53:0x0154, B:55:0x0158, B:56:0x00ca, B:58:0x00db, B:75:0x014f, B:84:0x0136, B:86:0x0141, B:88:0x0148), top: B:4:0x004b, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01(X.C1v3 r301) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1v3.A01(X.1v3):boolean");
    }
}
