package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.publicchats.plugins.threadview.threadviewtitleclick.UnjoinedBroadcastChannelThreadViewTitleClickImplementation;
import com.facebook.messaging.threadsettings.plugins.threadviewentrypoint.threadviewtitleclick.ThreadViewTitleClick;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* renamed from: X.6kw, reason: invalid class name */
/* loaded from: 6kw.class */
public final class C6kw {
    public UnjoinedBroadcastChannelThreadViewTitleClickImplementation A00;
    public C1v5 A01;
    public ThreadViewTitleClick A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public final Context A06;
    public final 2S4 A07;
    public final ThreadKey A08;
    public final 1YC A09 = 1YC.A03;
    public final 5Sh A0A;
    public final 64W A0B;
    public final 6FI A0C;
    public final Capabilities A0D;

    public C6kw(Context context, 2S4 r303, ThreadKey threadKey, 5Sh r305, 64W r306, 6FI r307, Capabilities capabilities) {
        this.A06 = context;
        this.A08 = threadKey;
        this.A0A = r305;
        this.A0D = capabilities;
        this.A0C = r307;
        this.A0B = r306;
        this.A07 = r303;
    }

    public static void A00(C6kw c6kw) {
        synchronized (c6kw) {
            if (!c6kw.A05) {
                if (c6kw.A06 == null) {
                    throw AnonymousClass001.A0Q("The context passed in the TitleClickInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                }
                c6kw.A01 = C1v5.A01;
                c6kw.A05 = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0096 A[Catch: Exception -> 0x00ed, all -> 0x0104, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ed, blocks: (B:5:0x0047, B:9:0x0051, B:12:0x005b, B:15:0x0096, B:17:0x00a3, B:19:0x00a9, B:20:0x00ad, B:23:0x00b8, B:24:0x00be, B:25:0x00c4, B:27:0x00cd, B:28:0x00d3, B:29:0x00d7, B:29:0x00d7, B:32:0x00e5, B:38:0x00df, B:39:0x0064, B:40:0x0069, B:43:0x0075, B:46:0x007d, B:48:0x008a), top: B:4:0x0047, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01(X.C6kw r301) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6kw.A01(X.6kw):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f2, code lost:
    
        if (r0.A00.get(223) == true) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0096 A[Catch: Exception -> 0x0128, all -> 0x013f, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0128, blocks: (B:5:0x0047, B:9:0x0051, B:12:0x005b, B:15:0x0096, B:16:0x009c, B:18:0x00a9, B:19:0x00af, B:21:0x00b7, B:23:0x00be, B:26:0x00ca, B:29:0x00d4, B:33:0x00e2, B:35:0x00e8, B:38:0x00f5, B:40:0x0102, B:41:0x0108, B:43:0x010e, B:44:0x0112, B:44:0x0112, B:47:0x0120, B:53:0x011a, B:54:0x0064, B:55:0x0069, B:58:0x0075, B:61:0x007d, B:63:0x008a), top: B:4:0x0047, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A02(X.C6kw r301) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6kw.A02(X.6kw):boolean");
    }
}
