package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.archivedchats.plugins.archivedchats.archivedchatsitem.ArchivedChatsSetting;
import com.facebook.messaging.facebookentrypoint.plugins.fbentrypoint.entrypoint.FacebookEntrypointImplementation;
import com.facebook.messaging.nativepagereply.plugins.homescreenshortcut.mesettings.HomeScreenShortcutMeSetting;
import com.facebook.messaging.presence.plugins.core.activestatussettingsrowtop.ActiveStatusSettingsRowTop;
import com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.mesetting.pendingchatssetting.PendingChatsSetting;
import com.facebook.presence.plugins.status.statussettingtop.StatusSettingTop;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Ccy.class */
public final class Ccy implements DIL {
    public Context A00;
    public 2QG A01;
    public CDa A02;
    public FacebookEntrypointImplementation A03;
    public HomeScreenShortcutMeSetting A04;
    public C1v5 A05;
    public ActiveStatusSettingsRowTop A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public ArchivedChatsSetting A0B;
    public PendingChatsSetting A0C;
    public StatusSettingTop A0D;
    public Object A0E;
    public Object A0F;
    public Object A0G;
    public boolean A0H;
    public final Context A0I;
    public final 1YC A0J = 1YC.A03;
    public final 06Z A0K;
    public final FbUserSession A0L;
    public final 1pI A0M;
    public final DFp A0N;

    public Ccy(Context context, 06Z r303, FbUserSession fbUserSession, 1pI r305, DFp dFp) {
        this.A0I = context;
        this.A0N = dFp;
        this.A0K = r303;
        this.A0M = r305;
        this.A0L = fbUserSession;
    }

    private void A00() {
        synchronized (this) {
            if (!this.A0H) {
                if (this.A0I == null) {
                    throw AnonymousClass001.A0Q("The context passed in the MeSettingsItemInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                }
                this.A05 = C1v5.A01;
                this.A0H = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A01() {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccy.A01():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d0 A[Catch: Exception -> 0x0155, all -> 0x0161, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0155, blocks: (B:5:0x0043, B:9:0x004d, B:12:0x0057, B:15:0x00d0, B:16:0x00d6, B:18:0x00df, B:23:0x00fd, B:24:0x0102, B:27:0x010d, B:28:0x0113, B:29:0x0118, B:30:0x011e, B:32:0x0128, B:33:0x012e, B:34:0x0132, B:34:0x0132, B:37:0x0137, B:42:0x00f5, B:44:0x00f6, B:44:0x00f6, B:46:0x0060, B:47:0x0065, B:50:0x0071, B:53:0x0079, B:54:0x0082, B:59:0x00c1, B:59:0x00c1, B:61:0x00c5, B:62:0x0091, B:64:0x00a1, B:72:0x00bc, B:75:0x0143, B:77:0x014d, B:79:0x0154), top: B:4:0x0043, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A02() {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccy.A02():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008d A[Catch: Exception -> 0x0123, all -> 0x012f, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0123, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x008d, B:17:0x0097, B:18:0x009e, B:20:0x00a9, B:21:0x00b0, B:23:0x00bc, B:26:0x00ca, B:27:0x00d0, B:28:0x00d5, B:29:0x00da, B:31:0x00e5, B:34:0x00f3, B:35:0x00f8, B:36:0x00fe, B:38:0x0107, B:39:0x010c, B:40:0x0110, B:40:0x0110, B:43:0x011c, B:46:0x0117, B:47:0x005c, B:48:0x0061, B:51:0x006d, B:54:0x0075, B:56:0x0081), top: B:4:0x003f, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A03() {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccy.A03():boolean");
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Failed to calculate best type for var: r316v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r316v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Not initialized variable reg: 316, insn: 0x0cad: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r316 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:603:0x0c99 */
    public X.C8e AKx(com.facebook.mig.scheme.interfaces.MigColorScheme r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 3324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccy.AKx(com.facebook.mig.scheme.interfaces.MigColorScheme, java.lang.String):X.C8e");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6 A[Catch: Exception -> 0x0138, all -> 0x0152, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0138, blocks: (B:18:0x008f, B:22:0x009c, B:25:0x00a8, B:28:0x00e6, B:29:0x00eb, B:32:0x00f9, B:33:0x0100, B:35:0x0107, B:36:0x010e, B:37:0x0113, B:37:0x0113, B:40:0x0122, B:41:0x0127, B:47:0x011b, B:48:0x00b2, B:49:0x00b7, B:52:0x00c3, B:55:0x00cd, B:57:0x00da), top: B:17:0x008f, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.common.collect.ImmutableList AKy(com.facebook.mig.scheme.interfaces.MigColorScheme r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccy.AKy(com.facebook.mig.scheme.interfaces.MigColorScheme, java.lang.String):com.google.common.collect.ImmutableList");
    }

    public void dispose() {
        int andIncrement;
        String str;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = this.A0J;
        r0.A08("com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement2);
        Exception e = null;
        try {
            A00();
            if (A02()) {
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.wellbeing.unknowncontact.messagerequests.mesetting.pendingchatssetting.PendingChatsSetting";
                r0.A0A("com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.mesetting.pendingchatssetting.PendingChatsSetting", str, "com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.mesetting.WellbeingUnknowncontactMessagerequestsMesettingKillSwitch", "dispose");
                try {
                    try {
                        PendingChatsSetting pendingChatsSetting = this.A0C;
                        2OV r02 = pendingChatsSetting.A00;
                        if (r02 != null) {
                            C4Mm c4Mm = (C4Mm) 1Br.A0B(pendingChatsSetting.A05);
                            if (c4Mm != null) {
                                c4Mm.A02(r02);
                            }
                        }
                        pendingChatsSetting.A00 = null;
                        r0.A09(str, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, str, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement);
                    throw th;
                }
            }
            if (A01()) {
                int andIncrement3 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.archivedchats.plugins.archivedchats.archivedchatsitem.ArchivedChatsSetting", "messaging.archivedchats.archivedchats.archivedchatsitem.ArchivedChatsSetting", "com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement3, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "com.facebook.messaging.archivedchats.plugins.archivedchats.ArchivedChatsKillSwitch", "dispose");
                ArchivedChatsSetting archivedChatsSetting = this.A0B;
                2OV r03 = archivedChatsSetting.A00;
                if (r03 != null) {
                    C4Mn c4Mn = (C4Mn) 1Br.A0B(archivedChatsSetting.A02);
                    if (c4Mn != null) {
                        c4Mn.A02(r03);
                    }
                }
                archivedChatsSetting.A00 = null;
                r0.A09("messaging.archivedchats.archivedchats.archivedchatsitem.ArchivedChatsSetting", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement3);
            }
            if (A03()) {
                andIncrement = atomicInteger.getAndIncrement();
                str = "presence.status.statussettingtop.StatusSettingTop";
                r0.A0A("com.facebook.presence.plugins.status.statussettingtop.StatusSettingTop", str, "com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "com.facebook.presence.plugins.status.StatusKillSwitch", "dispose");
                StatusSettingTop statusSettingTop = this.A0D;
                FbUserSession A03 = 1Br.A03(statusSettingTop.A03);
                C8Z c8z = (C8Z) 1Br.A0B(statusSettingTop.A02);
                11T.A0F(A03, 0);
                c8z.A07.set(false);
                2Ti r04 = c8z.A01;
                if (r04 != null) {
                    ((2Tj) 1Lm.A05(c8z.A02, A03, 33122)).A06(r04);
                }
                r0.A09(str, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement);
            }
            r0.A02((Exception) null, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement2);
        } catch (Throwable th2) {
            r0.A02(e, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement2);
            throw th2;
        }
    }

    public void init() {
        IllegalStateException A0h;
        int andIncrement;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = this.A0J;
        r0.A08("com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement2);
        try {
            A00();
            try {
                if (A02()) {
                    andIncrement = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.mesetting.pendingchatssetting.PendingChatsSetting", "messaging.wellbeing.unknowncontact.messagerequests.mesetting.pendingchatssetting.PendingChatsSetting", "com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.mesetting.WellbeingUnknowncontactMessagerequestsMesettingKillSwitch", "init");
                    try {
                        PendingChatsSetting pendingChatsSetting = this.A0C;
                        pendingChatsSetting.A00 = new Ci0(pendingChatsSetting, 5);
                        pendingChatsSetting.A01 = (BkF) 1Bi.A03(83650);
                        C4Mm c4Mm = (C4Mm) 1Br.A0B(pendingChatsSetting.A05);
                        if (c4Mm != null) {
                            2OV r02 = pendingChatsSetting.A00;
                            if (r02 == null) {
                                A0h = 1BK.A0h();
                                throw A0h;
                            }
                            c4Mm.A03(r02);
                        }
                        r0.A09("messaging.wellbeing.unknowncontact.messagerequests.mesetting.pendingchatssetting.PendingChatsSetting", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement);
                    } catch (Exception e) {
                        throw e;
                    }
                }
                if (A01()) {
                    int andIncrement3 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.archivedchats.plugins.archivedchats.archivedchatsitem.ArchivedChatsSetting", "messaging.archivedchats.archivedchats.archivedchatsitem.ArchivedChatsSetting", "com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement3, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "com.facebook.messaging.archivedchats.plugins.archivedchats.ArchivedChatsKillSwitch", "init");
                    ArchivedChatsSetting archivedChatsSetting = this.A0B;
                    archivedChatsSetting.A00 = new Ci0(archivedChatsSetting, 1);
                    C4Mn c4Mn = (C4Mn) 1Br.A0B(archivedChatsSetting.A02);
                    if (c4Mn != null) {
                        2OV r03 = archivedChatsSetting.A00;
                        if (r03 == null) {
                            A0h = 1BK.A0h();
                            throw A0h;
                        }
                        c4Mn.A03(r03);
                    }
                    r0.A09("messaging.archivedchats.archivedchats.archivedchatsitem.ArchivedChatsSetting", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement3);
                }
                if (A03()) {
                    int andIncrement4 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.presence.plugins.status.statussettingtop.StatusSettingTop", "presence.status.statussettingtop.StatusSettingTop", "com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement4, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "com.facebook.presence.plugins.status.StatusKillSwitch", "init");
                    StatusSettingTop statusSettingTop = this.A0D;
                    ((C8Z) 1Br.A0B(statusSettingTop.A02)).A01(statusSettingTop.A04);
                    r0.A09("presence.status.statussettingtop.StatusSettingTop", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement4);
                }
                r0.A02((Exception) null, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement2);
            } catch (Throwable th) {
                r0.A04((Exception) null, "messaging.wellbeing.unknowncontact.messagerequests.mesetting.pendingchatssetting.PendingChatsSetting", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement);
                throw th;
            }
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement2);
            throw th2;
        }
    }
}
