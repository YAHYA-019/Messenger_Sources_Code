package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.nativepagereply.plugins.toolstab.toolstabitem.messagingadsitem.MessagingAdsToolsTabItem;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Ccf.class */
public final class Ccf implements DGa {
    public 2P9 A01;
    public MessagingAdsToolsTabItem A02;
    public C1v5 A03;
    public Object A04;
    public boolean A05;
    public final Context A06;
    public final FbUserSession A07;
    public final C8m A08;
    public final DFS A09;
    public final MigColorScheme A0B;
    public int A00 = -1;
    public final 1YC A0A = 1YC.A03;

    public Ccf(Context context, FbUserSession fbUserSession, C8m c8m, DFS dfs, MigColorScheme migColorScheme) {
        this.A06 = context;
        this.A07 = fbUserSession;
        this.A09 = dfs;
        this.A0B = migColorScheme;
        this.A08 = c8m;
    }

    private void A00() {
        synchronized (this) {
            if (!this.A05) {
                if (this.A06 == null) {
                    throw AnonymousClass001.A0Q("The context passed in the ToolsTabItemInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                }
                this.A03 = C1v5.A01;
                this.A05 = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c2 A[Catch: Exception -> 0x0124, all -> 0x0132, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0124, blocks: (B:5:0x0043, B:9:0x004d, B:12:0x0057, B:15:0x00bb, B:17:0x011d, B:20:0x00c2, B:22:0x00cc, B:23:0x00d3, B:24:0x00da, B:28:0x00e8, B:31:0x00f3, B:32:0x00f8, B:33:0x00fe, B:34:0x0104, B:36:0x010e, B:37:0x0114, B:38:0x0118, B:38:0x0118, B:40:0x0060, B:41:0x0065, B:44:0x0071, B:47:0x0079, B:48:0x0082, B:51:0x008b, B:53:0x0098, B:54:0x009e, B:56:0x00a4, B:59:0x00ac), top: B:4:0x0043, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A01() {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccf.A01():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r310v0 */
    /* JADX WARN: Type inference failed for: r310v3 */
    @Override // X.DGa
    public ArrayList AJy() {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A0A;
        r0.A08("com.facebook.messaging.nativepagereply.plugins.interfaces.toolstabiteminterface.ToolsTabItemInterfaceSpec", "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "createItemKey", andIncrement);
        try {
            A00();
            ?? r310 = this.A00;
            boolean z = r310;
            if (r310 == -1) {
                boolean A01 = A01();
                this.A00 = A01 ? 1 : 0;
                z = A01;
            }
            ArrayList A0t = AnonymousClass001.A0t(z);
            if (A01()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.nativepagereply.plugins.toolstab.toolstabitem.messagingadsitem.MessagingAdsToolsTabItem", "messaging.nativepagereply.toolstab.toolstabitem.messagingadsitem.MessagingAdsToolsTabItem", "com.facebook.messaging.nativepagereply.plugins.interfaces.toolstabiteminterface.ToolsTabItemInterfaceSpec", andIncrement2, "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "com.facebook.messaging.nativepagereply.plugins.toolstab.BusinessInboxToolsTabKillSwitch", "createItemKey");
                try {
                    try {
                        A0t.add(BMC.A04);
                        r0.A09("messaging.nativepagereply.toolstab.toolstabitem.messagingadsitem.MessagingAdsToolsTabItem", "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "createItemKey", andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, "messaging.nativepagereply.toolstab.toolstabitem.messagingadsitem.MessagingAdsToolsTabItem", "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "createItemKey", andIncrement2);
                    throw th;
                }
            }
            while (true) {
                int size = A0t.size();
                ?? r3102 = this.A00;
                boolean z2 = r3102;
                if (r3102 == -1) {
                    boolean A012 = A01();
                    this.A00 = A012 ? 1 : 0;
                    z2 = A012;
                }
                if (size >= z2) {
                    r0.A02((Exception) null, "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "createItemKey", andIncrement);
                    return A0t;
                }
                A0t.add(null);
            }
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "createItemKey", andIncrement);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r310v0 */
    /* JADX WARN: Type inference failed for: r310v3 */
    @Override // X.DGa
    public ArrayList AK7() {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A0A;
        r0.A08("com.facebook.messaging.nativepagereply.plugins.interfaces.toolstabiteminterface.ToolsTabItemInterfaceSpec", "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "createListItem", andIncrement);
        try {
            A00();
            ?? r310 = this.A00;
            boolean z = r310;
            if (r310 == -1) {
                boolean A01 = A01();
                this.A00 = A01 ? 1 : 0;
                z = A01;
            }
            ArrayList A0t = AnonymousClass001.A0t(z);
            if (A01()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                try {
                    r0.A0A("com.facebook.messaging.nativepagereply.plugins.toolstab.toolstabitem.messagingadsitem.MessagingAdsToolsTabItem", "messaging.nativepagereply.toolstab.toolstabitem.messagingadsitem.MessagingAdsToolsTabItem", "com.facebook.messaging.nativepagereply.plugins.interfaces.toolstabiteminterface.ToolsTabItemInterfaceSpec", andIncrement2, "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "com.facebook.messaging.nativepagereply.plugins.toolstab.BusinessInboxToolsTabKillSwitch", "createListItem");
                    try {
                        MessagingAdsToolsTabItem messagingAdsToolsTabItem = this.A02;
                        Context context = messagingAdsToolsTabItem.A00;
                        FbUserSession A0F = 4YV.A0F(context);
                        C7X c7x = (C7X) 1Bu.A06(context, 83696);
                        C8m c8m = messagingAdsToolsTabItem.A01;
                        BMC bmc = BMC.A04;
                        String str = bmc.keyName;
                        MigColorScheme migColorScheme = messagingAdsToolsTabItem.A03;
                        C59c A00 = c8m.A00(A0F, migColorScheme, str);
                        boolean A02 = c8m.A02(A0F, bmc.keyName);
                        c7x.A01("ads_creation", A02);
                        C59c c59c = null;
                        String A0u = 1BK.A0u(context, 2131959824);
                        String A0u2 = 1BK.A0u(context, 2131959825);
                        2MQ r02 = 2MQ.A21;
                        Cvn A012 = Cvn.A01(c7x, messagingAdsToolsTabItem, A0F, 4, A02);
                        if (A00 != null) {
                            c59c = A00;
                        }
                        A0t.add(new AnonymousClass576(null, r02, A012, c59c, migColorScheme, A0u2, A0u));
                        r0.A09("messaging.nativepagereply.toolstab.toolstabitem.messagingadsitem.MessagingAdsToolsTabItem", "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "createListItem", andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, "messaging.nativepagereply.toolstab.toolstabitem.messagingadsitem.MessagingAdsToolsTabItem", "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "createListItem", andIncrement2);
                    throw th;
                }
            }
            while (true) {
                int size = A0t.size();
                ?? r3102 = this.A00;
                boolean z2 = r3102;
                if (r3102 == -1) {
                    boolean A013 = A01();
                    this.A00 = A013 ? 1 : 0;
                    z2 = A013;
                }
                if (size >= z2) {
                    r0.A02((Exception) null, "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "createListItem", andIncrement);
                    return A0t;
                }
                A0t.add(null);
            }
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "createListItem", andIncrement);
            throw th2;
        }
    }
}
