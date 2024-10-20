package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.publicchats.plugins.seencount.customxmalayoutwrapperdecoration.BroadcastChannelSeenCountCustomXMALayoutWrapper;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9lq, reason: invalid class name */
/* loaded from: 9lq.class */
public final class C9lq {
    public BroadcastChannelSeenCountCustomXMALayoutWrapper A01;
    public int[] A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final 06Z A06;
    public final FbUserSession A07;
    public final 5zD A08;
    public final AnonymousClass622 A0A;
    public final Context A0B;
    public final Capabilities A0C;
    public int A00 = -1;
    public final 1YC A09 = 1YC.A03;

    public C9lq(Context context, 06Z r303, FbUserSession fbUserSession, 5zD r305, AnonymousClass622 anonymousClass622, Capabilities capabilities) {
        this.A0B = context;
        this.A0A = anonymousClass622;
        this.A0C = capabilities;
        this.A08 = r305;
        this.A06 = r303;
        this.A07 = fbUserSession;
    }

    public static boolean A00(C9lq c9lq) {
        Object obj;
        if (c9lq.A03 == null) {
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = c9lq.A09;
            r0.A0B("com.facebook.messaging.pinnedmessages.plugins.production.customxmalayoutwrapperdecoration.PinnedCustomXMALayoutWrapperDecorationImplementation", "messaging.pinnedmessages.production.customxmalayoutwrapperdecoration.PinnedCustomXMALayoutWrapperDecorationImplementation", "com.facebook.messaging.threadview.plugins.interfaces.message.decorations.customxmalayoutwrapper.CustomXMALayoutWrapperDecorationInterfaceSpec", "messaging.threadview.message.decorations.customxmalayoutwrapper.CustomXMALayoutWrapperDecorationInterfaceSpec", 4YT.A00(0), andIncrement);
            Exception exc = null;
            try {
                try {
                    int i = C1Y6.A00;
                    Boolean A00 = C5yi.A00(i);
                    if (A00 != null ? A00.booleanValue() : C5yi.A01(r0, atomicInteger, i)) {
                        AnonymousClass622 anonymousClass622 = c9lq.A0A;
                        11T.A0F(anonymousClass622, 0);
                        if (C64e.A00(anonymousClass622)) {
                            obj = C1Y6.A02;
                            c9lq.A03 = obj;
                            r0.A07("messaging.pinnedmessages.production.customxmalayoutwrapperdecoration.PinnedCustomXMALayoutWrapperDecorationImplementation", "messaging.threadview.message.decorations.customxmalayoutwrapper.CustomXMALayoutWrapperDecorationInterfaceSpec", andIncrement, 1BL.A1U(obj));
                        }
                    }
                    obj = C1Y6.A03;
                    c9lq.A03 = obj;
                    r0.A07("messaging.pinnedmessages.production.customxmalayoutwrapperdecoration.PinnedCustomXMALayoutWrapperDecorationImplementation", "messaging.threadview.message.decorations.customxmalayoutwrapper.CustomXMALayoutWrapperDecorationInterfaceSpec", andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    c9lq.A03 = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.pinnedmessages.production.customxmalayoutwrapperdecoration.PinnedCustomXMALayoutWrapperDecorationImplementation", "messaging.threadview.message.decorations.customxmalayoutwrapper.CustomXMALayoutWrapperDecorationInterfaceSpec", andIncrement, 1BL.A1U(c9lq.A03));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.pinnedmessages.production.customxmalayoutwrapperdecoration.PinnedCustomXMALayoutWrapperDecorationImplementation", "messaging.threadview.message.decorations.customxmalayoutwrapper.CustomXMALayoutWrapperDecorationInterfaceSpec", andIncrement, 1BL.A1U(c9lq.A03));
                throw th;
            }
        }
        return 1BK.A1U(c9lq.A03);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007d A[Catch: Exception -> 0x010f, all -> 0x011d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x010f, blocks: (B:6:0x004b, B:7:0x0050, B:10:0x005c, B:13:0x0064, B:16:0x007d, B:17:0x0083, B:19:0x008d, B:21:0x0095, B:22:0x009b, B:26:0x00ad, B:31:0x00cc, B:32:0x00d1, B:34:0x00de, B:37:0x00ec, B:38:0x00f2, B:40:0x00f9, B:41:0x00ff, B:42:0x0103, B:42:0x0103, B:45:0x0108, B:50:0x00c4, B:52:0x00c5, B:52:0x00c5, B:55:0x0071), top: B:5:0x004b, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01(X.C9lq r301) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9lq.A01(X.9lq):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074 A[Catch: Exception -> 0x0087, all -> 0x0093, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0087, blocks: (B:5:0x0043, B:6:0x0048, B:9:0x0054, B:12:0x005c, B:15:0x0074, B:17:0x0080, B:20:0x007b, B:22:0x0068), top: B:4:0x0043, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b A[Catch: Exception -> 0x0087, all -> 0x0093, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0087, blocks: (B:5:0x0043, B:6:0x0048, B:9:0x0054, B:12:0x005c, B:15:0x0074, B:17:0x0080, B:20:0x007b, B:22:0x0068), top: B:4:0x0043, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A02(X.C9lq r301) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9lq.A02(X.9lq):boolean");
    }
}
