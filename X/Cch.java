package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.business.plugins.suggestedreply.settings.mesettings.SuggestedReplySettingsActivity;
import com.facebook.messaging.nativepagereply.faq.mesettings.BusinessInboxFAQSettingActivity;
import com.facebook.messaging.nativepagereply.plugins.toolstab.toolstabitem.faqitem.FAQToolsTabItem;
import com.facebook.messaging.nativepagereply.plugins.toolstab.toolstabitem.responsiveguideitem.ResponsiveGuideToolsTabItem;
import com.facebook.messaging.nativepagereply.plugins.toolstab.toolstabitem.savedreplyitem.SavedReplyToolsTabItem;
import com.facebook.messaging.nativepagereply.plugins.toolstab.toolstabitem.suggestedreplyitem.SuggestedReplyToolsTabItem;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Cch.class */
public final class Cch implements DGa {
    public C15h A00;
    public FAQToolsTabItem A02;
    public ResponsiveGuideToolsTabItem A03;
    public SavedReplyToolsTabItem A04;
    public SuggestedReplyToolsTabItem A05;
    public 2P9 A06;
    public C1v5 A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public Object A0B;
    public boolean A0C;
    public final Context A0D;
    public final FbUserSession A0E;
    public final C8m A0F;
    public final DFS A0G;
    public final MigColorScheme A0I;
    public int A01 = -1;
    public final 1YC A0H = 1YC.A03;

    public Cch(Context context, FbUserSession fbUserSession, C8m c8m, DFS dfs, MigColorScheme migColorScheme) {
        this.A0D = context;
        this.A0E = fbUserSession;
        this.A0G = dfs;
        this.A0I = migColorScheme;
        this.A0F = c8m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r302v0 */
    private int A00() {
        ?? r302 = this.A01;
        boolean z = r302;
        if (r302 == -1) {
            boolean A03 = A03();
            boolean z2 = A03;
            if (A05()) {
                z2 = (A03 ? 1 : 0) + 1;
            }
            boolean z3 = z2;
            if (A04()) {
                z3 = (z2 ? 1 : 0) + 1;
            }
            boolean z4 = z3;
            if (A06()) {
                z4 = (z3 ? 1 : 0) + 1;
            }
            this.A01 = z4 ? 1 : 0;
            z = z4;
        }
        return z;
    }

    private 2P9 A01() {
        2P9 r302 = this.A06;
        if (r302 == null) {
            r302 = (2P9) 1Bn.A0E(this.A0D, (1BY) null, 66586);
            this.A06 = r302;
        }
        return r302;
    }

    private void A02() {
        synchronized (this) {
            if (!this.A0C) {
                if (this.A0D == null) {
                    throw AnonymousClass001.A0Q("The context passed in the ToolsTabItemInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                }
                this.A07 = C1v5.A01;
                this.A0C = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009d A[Catch: Exception -> 0x00ee, all -> 0x00fa, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ee, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x0096, B:17:0x00e7, B:20:0x009d, B:22:0x00a7, B:23:0x00ad, B:24:0x00b2, B:27:0x00bd, B:28:0x00c3, B:29:0x00c8, B:30:0x00ce, B:32:0x00d9, B:33:0x00de, B:34:0x00e2, B:34:0x00e2, B:36:0x005c, B:37:0x0061, B:40:0x006d, B:43:0x0075, B:44:0x007e, B:46:0x0087), top: B:4:0x003f, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A03() {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cch.A03():boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v13 ??, still in use, count: 2, list:
          (r303v13 ??) from 0x00b9: PHI (r303v8 ??) = (r303v7 ??), (r303v13 ??) binds: [B:18:0x009d, B:24:0x00b5] A[DONT_GENERATE, DONT_INLINE]
          (r303v13 ?? I:X.15h) from 0x00b6: IPUT (r303v13 ?? I:X.15h), (r301v0 'this' ?? I:X.Cch A[IMMUTABLE_TYPE, THIS]) A[Catch: Exception -> 0x013e, all -> 0x014a] X.Cch.A00 X.15h
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    private boolean A04() {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cch.A04():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A05() {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cch.A05():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0095 A[Catch: Exception -> 0x00d3, all -> 0x00df, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00d3, blocks: (B:5:0x0041, B:9:0x004b, B:12:0x0055, B:15:0x0095, B:16:0x009b, B:17:0x00a1, B:18:0x00a6, B:19:0x00ac, B:21:0x00b7, B:22:0x00bc, B:23:0x00c0, B:23:0x00c0, B:26:0x00cc, B:29:0x00c7, B:30:0x005e, B:31:0x0063, B:34:0x006f, B:37:0x0077, B:38:0x0080, B:40:0x0089), top: B:4:0x0041, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7 A[Catch: Exception -> 0x00d3, all -> 0x00df, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00d3, blocks: (B:5:0x0041, B:9:0x004b, B:12:0x0055, B:15:0x0095, B:16:0x009b, B:17:0x00a1, B:18:0x00a6, B:19:0x00ac, B:21:0x00b7, B:22:0x00bc, B:23:0x00c0, B:23:0x00c0, B:26:0x00cc, B:29:0x00c7, B:30:0x005e, B:31:0x0063, B:34:0x006f, B:37:0x0077, B:38:0x0080, B:40:0x0089), top: B:4:0x0041, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A06() {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cch.A06():boolean");
    }

    @Override // X.DGa
    public ArrayList AJy() {
        int andIncrement;
        String str;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = this.A0H;
        r0.A08("com.facebook.messaging.nativepagereply.plugins.interfaces.toolstabiteminterface.ToolsTabItemInterfaceSpec", "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "createItemKey", andIncrement2);
        Exception e = null;
        try {
            A02();
            ArrayList A0t = AnonymousClass001.A0t(A00());
            if (A03()) {
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.nativepagereply.toolstab.toolstabitem.faqitem.FAQToolsTabItem";
                r0.A0A("com.facebook.messaging.nativepagereply.plugins.toolstab.toolstabitem.faqitem.FAQToolsTabItem", str, "com.facebook.messaging.nativepagereply.plugins.interfaces.toolstabiteminterface.ToolsTabItemInterfaceSpec", andIncrement, "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "com.facebook.messaging.nativepagereply.plugins.toolstab.BusinessInboxToolsTabKillSwitch", "createItemKey");
                try {
                    try {
                        A0t.add(BMC.A03);
                        r0.A09(str, "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "createItemKey", andIncrement);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, str, "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "createItemKey", andIncrement);
                    throw th;
                }
            }
            if (A05()) {
                int andIncrement3 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.nativepagereply.plugins.toolstab.toolstabitem.savedreplyitem.SavedReplyToolsTabItem", "messaging.nativepagereply.toolstab.toolstabitem.savedreplyitem.SavedReplyToolsTabItem", "com.facebook.messaging.nativepagereply.plugins.interfaces.toolstabiteminterface.ToolsTabItemInterfaceSpec", andIncrement3, "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "com.facebook.messaging.nativepagereply.plugins.toolstab.BusinessInboxToolsTabKillSwitch", "createItemKey");
                A0t.add(BMC.A06);
                r0.A09("messaging.nativepagereply.toolstab.toolstabitem.savedreplyitem.SavedReplyToolsTabItem", "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "createItemKey", andIncrement3);
            }
            if (A04()) {
                int andIncrement4 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.nativepagereply.plugins.toolstab.toolstabitem.responsiveguideitem.ResponsiveGuideToolsTabItem", "messaging.nativepagereply.toolstab.toolstabitem.responsiveguideitem.ResponsiveGuideToolsTabItem", "com.facebook.messaging.nativepagereply.plugins.interfaces.toolstabiteminterface.ToolsTabItemInterfaceSpec", andIncrement4, "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "com.facebook.messaging.nativepagereply.plugins.toolstab.BusinessInboxToolsTabKillSwitch", "createItemKey");
                A0t.add(BMC.A05);
                r0.A09("messaging.nativepagereply.toolstab.toolstabitem.responsiveguideitem.ResponsiveGuideToolsTabItem", "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "createItemKey", andIncrement4);
            }
            if (A06()) {
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.nativepagereply.toolstab.toolstabitem.suggestedreplyitem.SuggestedReplyToolsTabItem";
                r0.A0A("com.facebook.messaging.nativepagereply.plugins.toolstab.toolstabitem.suggestedreplyitem.SuggestedReplyToolsTabItem", str, "com.facebook.messaging.nativepagereply.plugins.interfaces.toolstabiteminterface.ToolsTabItemInterfaceSpec", andIncrement, "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "com.facebook.messaging.nativepagereply.plugins.toolstab.BusinessInboxToolsTabKillSwitch", "createItemKey");
                A0t.add(BMC.A07);
                r0.A09(str, "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "createItemKey", andIncrement);
            }
            while (A0t.size() < A00()) {
                A0t.add(null);
            }
            r0.A02((Exception) null, "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "createItemKey", andIncrement2);
            return A0t;
        } catch (Throwable th2) {
            r0.A02(e, "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "createItemKey", andIncrement2);
            throw th2;
        }
    }

    @Override // X.DGa
    public ArrayList AK7() {
        int andIncrement;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = this.A0H;
        r0.A08("com.facebook.messaging.nativepagereply.plugins.interfaces.toolstabiteminterface.ToolsTabItemInterfaceSpec", "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "createListItem", andIncrement2);
        try {
            A02();
            ArrayList A0t = AnonymousClass001.A0t(A00());
            try {
                if (A03()) {
                    andIncrement = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.nativepagereply.plugins.toolstab.toolstabitem.faqitem.FAQToolsTabItem", "messaging.nativepagereply.toolstab.toolstabitem.faqitem.FAQToolsTabItem", "com.facebook.messaging.nativepagereply.plugins.interfaces.toolstabiteminterface.ToolsTabItemInterfaceSpec", andIncrement, "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "com.facebook.messaging.nativepagereply.plugins.toolstab.BusinessInboxToolsTabKillSwitch", "createListItem");
                    try {
                        FAQToolsTabItem fAQToolsTabItem = this.A02;
                        Context context = fAQToolsTabItem.A00;
                        FbUserSession A0F = 4YV.A0F(context);
                        C7X c7x = (C7X) 1Bu.A06(context, 83696);
                        C8m c8m = fAQToolsTabItem.A01;
                        BMC bmc = BMC.A03;
                        String str = bmc.keyName;
                        MigColorScheme migColorScheme = fAQToolsTabItem.A03;
                        C59c A00 = c8m.A00(A0F, migColorScheme, str);
                        boolean A02 = c8m.A02(A0F, bmc.keyName);
                        c7x.A01("faq", A02);
                        C59c c59c = null;
                        String A0u = 1BK.A0u(context, 2131956736);
                        String A0u2 = 1BK.A0u(context, 2131956737);
                        2MQ r02 = 2MQ.A0v;
                        Cvn A01 = Cvn.A01(c7x, fAQToolsTabItem, A0F, 3, A02);
                        if (A00 != null) {
                            c59c = A00;
                        }
                        Intent putExtra = C3o5.A0D(context, BusinessInboxFAQSettingActivity.class).putExtra("faq_creation_activity_entry_point", "tools_tab");
                        11T.A0A(putExtra);
                        A0t.add(new AnonymousClass576(putExtra, r02, A01, c59c, migColorScheme, A0u2, A0u));
                        r0.A09("messaging.nativepagereply.toolstab.toolstabitem.faqitem.FAQToolsTabItem", "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "createListItem", andIncrement);
                    } catch (Exception e) {
                        throw e;
                    }
                }
                if (A05()) {
                    int andIncrement3 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.nativepagereply.plugins.toolstab.toolstabitem.savedreplyitem.SavedReplyToolsTabItem", "messaging.nativepagereply.toolstab.toolstabitem.savedreplyitem.SavedReplyToolsTabItem", "com.facebook.messaging.nativepagereply.plugins.interfaces.toolstabiteminterface.ToolsTabItemInterfaceSpec", andIncrement3, "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "com.facebook.messaging.nativepagereply.plugins.toolstab.BusinessInboxToolsTabKillSwitch", "createListItem");
                    SavedReplyToolsTabItem savedReplyToolsTabItem = this.A04;
                    Context context2 = savedReplyToolsTabItem.A00;
                    FbUserSession A0F2 = 4YV.A0F(context2);
                    C7X c7x2 = (C7X) 1Bu.A06(context2, 83696);
                    C8m c8m2 = savedReplyToolsTabItem.A02;
                    BMC bmc2 = BMC.A06;
                    String str2 = bmc2.keyName;
                    MigColorScheme migColorScheme2 = savedReplyToolsTabItem.A04;
                    C59c A002 = c8m2.A00(A0F2, migColorScheme2, str2);
                    boolean A022 = c8m2.A02(A0F2, bmc2.keyName);
                    c7x2.A01("saved_reply", A022);
                    C59c c59c2 = null;
                    String A0u3 = 1BK.A0u(context2, 2131965463);
                    String A0u4 = 1BK.A0u(context2, 2131965462);
                    2MQ r03 = 2MQ.A26;
                    if (A002 != null) {
                        c59c2 = A002;
                    }
                    A0t.add(new AnonymousClass576(null, r03, Cvn.A01(c7x2, savedReplyToolsTabItem, A0F2, 5, A022), c59c2, migColorScheme2, A0u4, A0u3));
                    r0.A09("messaging.nativepagereply.toolstab.toolstabitem.savedreplyitem.SavedReplyToolsTabItem", "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "createListItem", andIncrement3);
                }
                if (A04()) {
                    int andIncrement4 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.nativepagereply.plugins.toolstab.toolstabitem.responsiveguideitem.ResponsiveGuideToolsTabItem", "messaging.nativepagereply.toolstab.toolstabitem.responsiveguideitem.ResponsiveGuideToolsTabItem", "com.facebook.messaging.nativepagereply.plugins.interfaces.toolstabiteminterface.ToolsTabItemInterfaceSpec", andIncrement4, "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "com.facebook.messaging.nativepagereply.plugins.toolstab.BusinessInboxToolsTabKillSwitch", "createListItem");
                    ResponsiveGuideToolsTabItem responsiveGuideToolsTabItem = this.A03;
                    Context context3 = responsiveGuideToolsTabItem.A00;
                    C7X c7x3 = (C7X) 1Bu.A06(context3, 83696);
                    C8m c8m3 = responsiveGuideToolsTabItem.A02;
                    1G1 r04 = responsiveGuideToolsTabItem.A01;
                    BMC bmc3 = BMC.A05;
                    String str3 = bmc3.keyName;
                    MigColorScheme migColorScheme3 = responsiveGuideToolsTabItem.A04;
                    C59c A003 = c8m3.A00(r04, migColorScheme3, str3);
                    boolean A023 = c8m3.A02(r04, bmc3.keyName);
                    c7x3.A01("responsive_tracker", A023);
                    C59c c59c3 = null;
                    String A0u5 = 1BK.A0u(context3, 2131964488);
                    String A0u6 = 1BK.A0u(context3, 2131964489);
                    2MQ r05 = 2MQ.A2u;
                    Cvn A004 = Cvn.A00(new CvM(4, c7x3, responsiveGuideToolsTabItem, A023), 94);
                    if (A003 != null) {
                        c59c3 = A003;
                    }
                    Uri uri = null;
                    try {
                        uri = C0A2.A03(0Pz.A0j("fb-messenger-secure://", "responsive_tracker?page_id=", r04.A02));
                    } catch (SecurityException unused) {
                    }
                    if (uri == null) {
                        throw 1BK.A0h();
                    }
                    A0t.add(new AnonymousClass576(4YU.A09(uri), r05, A004, c59c3, migColorScheme3, A0u6, A0u5));
                    r0.A09("messaging.nativepagereply.toolstab.toolstabitem.responsiveguideitem.ResponsiveGuideToolsTabItem", "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "createListItem", andIncrement4);
                }
                if (A06()) {
                    int andIncrement5 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.nativepagereply.plugins.toolstab.toolstabitem.suggestedreplyitem.SuggestedReplyToolsTabItem", "messaging.nativepagereply.toolstab.toolstabitem.suggestedreplyitem.SuggestedReplyToolsTabItem", "com.facebook.messaging.nativepagereply.plugins.interfaces.toolstabiteminterface.ToolsTabItemInterfaceSpec", andIncrement5, "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "com.facebook.messaging.nativepagereply.plugins.toolstab.BusinessInboxToolsTabKillSwitch", "createListItem");
                    SuggestedReplyToolsTabItem suggestedReplyToolsTabItem = this.A05;
                    Context context4 = suggestedReplyToolsTabItem.A00;
                    FbUserSession A0F3 = 4YV.A0F(context4);
                    C7X c7x4 = (C7X) 1Bu.A06(context4, 83696);
                    C8m c8m4 = suggestedReplyToolsTabItem.A01;
                    BMC bmc4 = BMC.A07;
                    String str4 = bmc4.keyName;
                    MigColorScheme migColorScheme4 = suggestedReplyToolsTabItem.A03;
                    C59c A005 = c8m4.A00(A0F3, migColorScheme4, str4);
                    boolean A024 = c8m4.A02(A0F3, bmc4.keyName);
                    c7x4.A01("suggested_reply", A024);
                    C59c c59c4 = null;
                    String A0u7 = 1BK.A0u(context4, 2131966565);
                    String A0u8 = 1BK.A0u(context4, 2131966572);
                    2MQ r06 = 2MQ.A2h;
                    if (A005 != null) {
                        c59c4 = A005;
                    }
                    Intent A0D = C3o5.A0D(context4, SuggestedReplySettingsActivity.class);
                    A0D.putExtra("settings_entrypoint", (Serializable) BO9.A03);
                    A0t.add(new AnonymousClass576(A0D, r06, Cvn.A01(c7x4, suggestedReplyToolsTabItem, A0F3, 6, A024), c59c4, migColorScheme4, A0u8, A0u7));
                    r0.A09("messaging.nativepagereply.toolstab.toolstabitem.suggestedreplyitem.SuggestedReplyToolsTabItem", "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "createListItem", andIncrement5);
                }
                while (A0t.size() < A00()) {
                    A0t.add(null);
                }
                r0.A02((Exception) null, "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "createListItem", andIncrement2);
                return A0t;
            } catch (Throwable th) {
                r0.A04((Exception) null, "messaging.nativepagereply.toolstab.toolstabitem.faqitem.FAQToolsTabItem", "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "createListItem", andIncrement);
                throw th;
            }
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.nativepagereply.toolstabiteminterface.ToolsTabItemInterfaceSpec", "createListItem", andIncrement2);
            throw th2;
        }
    }
}
