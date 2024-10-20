package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.nativepagereply.catalog.mesettings.BusinessInboxCatalogSettingActivity;
import com.facebook.messaging.nativepagereply.plugins.toolstab.toolstabitem.catalogitem.CatalogToolsTabItem;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Ccg.class */
public final class Ccg implements DGa {
    public 2P9 A01;
    public CatalogToolsTabItem A02;
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

    public Ccg(Context context, FbUserSession fbUserSession, C8m c8m, DFS dfs, MigColorScheme migColorScheme) {
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x00be A[Catch: Exception -> 0x0104, all -> 0x0110, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0104, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x00b7, B:17:0x00fd, B:20:0x00be, B:21:0x00c2, B:24:0x00cd, B:25:0x00d3, B:26:0x00d9, B:27:0x00de, B:28:0x00e4, B:30:0x00ef, B:31:0x00f4, B:32:0x00f8, B:32:0x00f8, B:34:0x005c, B:35:0x0061, B:38:0x006d, B:41:0x0075, B:42:0x007e, B:45:0x0087, B:47:0x0094, B:48:0x009a, B:50:0x00a0, B:53:0x00a8), top: B:4:0x003f, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A01() {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccg.A01():boolean");
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
                r0.A0A("com.facebook.messaging.nativepagereply.plugins.toolstab.toolstabitem.catalogitem.CatalogToolsTabItem", "messaging.nativepagereply.toolstab.toolstabitem.catalogitem.CatalogToolsTabItem", "com.facebook.messaging.nativepagereply.plugins.interfaces.toolstabiteminterface.ToolsTabItemInterfaceSpec", andIncrement2, "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "com.facebook.messaging.nativepagereply.plugins.toolstab.BusinessInboxToolsTabKillSwitch", "createItemKey");
                try {
                    try {
                        A0t.add(BMC.A02);
                        r0.A09("messaging.nativepagereply.toolstab.toolstabitem.catalogitem.CatalogToolsTabItem", "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "createItemKey", andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, "messaging.nativepagereply.toolstab.toolstabitem.catalogitem.CatalogToolsTabItem", "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "createItemKey", andIncrement2);
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
                    r0.A0A("com.facebook.messaging.nativepagereply.plugins.toolstab.toolstabitem.catalogitem.CatalogToolsTabItem", "messaging.nativepagereply.toolstab.toolstabitem.catalogitem.CatalogToolsTabItem", "com.facebook.messaging.nativepagereply.plugins.interfaces.toolstabiteminterface.ToolsTabItemInterfaceSpec", andIncrement2, "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "com.facebook.messaging.nativepagereply.plugins.toolstab.BusinessInboxToolsTabKillSwitch", "createListItem");
                    try {
                        CatalogToolsTabItem catalogToolsTabItem = this.A02;
                        Context context = catalogToolsTabItem.A00;
                        FbUserSession A0F = 4YV.A0F(context);
                        C7X c7x = (C7X) 1Bu.A06(context, 83696);
                        C8m c8m = catalogToolsTabItem.A01;
                        BMC bmc = BMC.A02;
                        String str = bmc.keyName;
                        MigColorScheme migColorScheme = catalogToolsTabItem.A03;
                        C59c A00 = c8m.A00(A0F, migColorScheme, str);
                        boolean A02 = c8m.A02(A0F, bmc.keyName);
                        c7x.A01("catalog", A02);
                        C59c c59c = null;
                        String A0u = 1BK.A0u(context, 2131953875);
                        String A0u2 = 1BK.A0u(context, 2131953874);
                        2MQ r02 = 2MQ.A2v;
                        Intent putExtra = C3o5.A0D(context, BusinessInboxCatalogSettingActivity.class).putExtra("catalog_setting_entry_point", "tools_tab");
                        11T.A0A(putExtra);
                        Cvn A012 = Cvn.A01(c7x, catalogToolsTabItem, A0F, 2, A02);
                        if (A00 != null) {
                            c59c = A00;
                        }
                        A0t.add(new AnonymousClass576(putExtra, r02, A012, c59c, migColorScheme, A0u2, A0u));
                        r0.A09("messaging.nativepagereply.toolstab.toolstabitem.catalogitem.CatalogToolsTabItem", "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "createListItem", andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, "messaging.nativepagereply.toolstab.toolstabitem.catalogitem.CatalogToolsTabItem", "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "createListItem", andIncrement2);
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
